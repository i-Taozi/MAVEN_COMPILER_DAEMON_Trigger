/*
 * Copyright (C) 2014 Brockmann Consult GmbH (info@brockmann-consult.de)
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option)
 * any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, see http://www.gnu.org/licenses/
 */

package org.esa.s2tbx.mosaic;

import com.bc.ceres.binding.Property;
import com.bc.ceres.binding.PropertyDescriptor;
import com.bc.ceres.binding.PropertySet;
import com.bc.ceres.binding.accessors.MapEntryAccessor;
import com.bc.ceres.swing.binding.BindingContext;
import com.bc.ceres.swing.binding.Enablement;
import org.esa.snap.core.dataio.ProductIO;
import org.esa.snap.core.datamodel.CrsGeoCoding;
import org.esa.snap.core.datamodel.GeoCoding;
import org.esa.snap.core.datamodel.PixelPos;
import org.esa.snap.core.datamodel.Product;
import org.esa.snap.core.gpf.GPF;
import org.esa.snap.core.gpf.annotations.ParameterDescriptorFactory;
import org.esa.snap.core.gpf.common.MosaicOp;
import org.esa.snap.core.util.math.MathUtils;
import org.esa.snap.ui.BoundsInputPanel;
import org.esa.snap.ui.WorldMapPaneDataModel;
import org.geotools.geometry.jts.ReferencedEnvelope;
import org.geotools.referencing.CRS;
import org.geotools.referencing.crs.DefaultGeographicCRS;
import org.opengis.geometry.Envelope;
import org.opengis.referencing.FactoryException;
import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.opengis.referencing.operation.TransformException;
import java.awt.geom.Rectangle2D;
import java.beans.PropertyChangeEvent;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author Razvan Dumitrascu
 * @since 5.0.6
 */
class S2tbxMosaicFormModel {

    public static final String PROPERTY_UPDATE_PRODUCT = "updateProduct";
    public static final String PROPERTY_UPDATE_MODE = "updateMode";
    public static final String PROPERTY_SHOW_SOURCE_PRODUCTS = "showSourceProducts";
    public static final String PROPERTY_ELEVATION_MODEL_NAME = "elevationModelName";
    public static final String PROPERTY_ORTHORECTIFY = "orthorectify";
    public static final String PROPERTY_WEST_BOUND = "westBound";
    public static final String PROPERTY_NORTH_BOUND = "northBound";
    public static final String PROPERTY_EAST_BOUND = "eastBound";
    public static final String PROPERTY_SOUTH_BOUND = "southBound";
    public static final String PROPERTY_CRS = "crs";
    public static final String PROPERTY_PIXEL_SIZE_X = "pixelSizeX";
    public static final String PROPERTY_PIXEL_SIZE_Y = "pixelSizeY";
    public static final String PROPERTY_MAX_VALUE = "maxValue";
    public static final String PROPERTY_MIN_VALUE = "minValue";
    public static final String PROPERTY_NATIVE_RESOLUTION = "nativeResolution";
    public static final String PROPERTY_OVERLAPPING = "overlappingMethod";

    private final PropertySet container;
    private final Map<String, Object> parameterMap;
    private final Map<File, Product> sourceProductMap = Collections.synchronizedMap(new HashMap<>());
    private final WorldMapPaneDataModel worldMapModel = new WorldMapPaneDataModel();
    private S2tbxMosaicForm parentForm;
    private BindingContext bindingContext;
    S2tbxMosaicFormModel(S2tbxMosaicForm parentForm) {
        this(parentForm, new HashMap<>());
    }

    S2tbxMosaicFormModel(S2tbxMosaicForm parentForm, Map<String, Object> parameterMap) {
        this.parentForm = parentForm;
        this.parameterMap = parameterMap;

        container = ParameterDescriptorFactory.createMapBackedOperatorPropertyContainer("Multi-size Mosaic", parameterMap);
        addTransientProperty(PROPERTY_UPDATE_PRODUCT, Product.class);
        addTransientProperty(PROPERTY_UPDATE_MODE, Boolean.class);
        addTransientProperty(PROPERTY_SHOW_SOURCE_PRODUCTS, Boolean.class);
        addTransientProperty(PROPERTY_NATIVE_RESOLUTION, Boolean.class);

        container.setDefaultValues();
        container.setValue(PROPERTY_UPDATE_MODE, false);
        container.setValue(PROPERTY_SHOW_SOURCE_PRODUCTS, false);
        container.setValue(PROPERTY_NATIVE_RESOLUTION, true);

        container.addPropertyChangeListener(PROPERTY_SHOW_SOURCE_PRODUCTS,
                                            (PropertyChangeEvent evt)->{
                                                if (Boolean.TRUE.equals(evt.getNewValue())) {
                                                    final Collection<Product> products = sourceProductMap.values();
                                                    worldMapModel.setProducts(products.toArray(new Product[products.size()]));
                                                } else {
                                                    worldMapModel.setProducts(null);
                                                }
                                            });

    }

    private void addTransientProperty(String propertyName, Class<?> propertyType) {
        PropertyDescriptor descriptor = new PropertyDescriptor(propertyName, propertyType);
        descriptor.setTransient(true);
        container.addProperty(new Property(descriptor,
                                           new MapEntryAccessor(parameterMap, propertyName)));
    }

    void setSourceProducts(File[] files) throws IOException {
        boolean changeSourceProducts = false;
        boolean atLeastOneUniSizeProduct = false;
        boolean allProductsUniSize = true;
        if (files != null && files.length > 0) {
            final List<File> fileList = Arrays.asList(files);
            final Iterator<Map.Entry<File, Product>> iterator = sourceProductMap.entrySet().iterator();
            while (iterator.hasNext()) {
                final Map.Entry<File, Product> entry = iterator.next();
                if (!fileList.contains(entry.getKey())) {
                    final Product product = entry.getValue();
                    worldMapModel.removeProduct(product);
                    iterator.remove();
                    product.dispose();
                    changeSourceProducts = true;
                }
            }

            for (int i = 0; i < files.length; i++) {
                final File file = files[i];

                Product product = sourceProductMap.get(file);
                if (product == null) {
                    product = ProductIO.readProduct(file);
                    if(!product.isMultiSize()){
                        atLeastOneUniSizeProduct = true;
                    } else {
                        allProductsUniSize = false;
                    }
                    sourceProductMap.put(file, product);
                    if (Boolean.TRUE.equals(getPropertyValue(PROPERTY_SHOW_SOURCE_PRODUCTS))) {
                        worldMapModel.addProduct(product);
                    }
                    changeSourceProducts = true;
                }
                else{
                    if(!product.isMultiSize()){
                        atLeastOneUniSizeProduct = true;
                    } else {
                        allProductsUniSize = false;
                    }
                }
                final int refNo = i + 1;
                if (product.getRefNo() != refNo) {
                    product.resetRefNo();
                    product.setRefNo(refNo);
                }
            }

            bindingContext = parentForm.getBindingContext();
            bindingContext.bindEnabledState(PROPERTY_NATIVE_RESOLUTION, !atLeastOneUniSizeProduct,enableNativeResolution(true));
            bindingContext.bindEnabledState(PROPERTY_OVERLAPPING, !allProductsUniSize, enableNativeResolution(true));
            bindingContext.bindEnabledState("pixelSizeX", atLeastOneUniSizeProduct, enableNativeResolution(true));
            bindingContext.bindEnabledState("pixelSizeY", atLeastOneUniSizeProduct, enableNativeResolution(true));
        }
        if(files.length == 0){
            bindingContext = parentForm.getBindingContext();
            bindingContext.bindEnabledState(PROPERTY_NATIVE_RESOLUTION, true ,enableNativeResolution(true));
            bindingContext.bindEnabledState(PROPERTY_OVERLAPPING, true, enableNativeResolution(true));
            bindingContext.bindEnabledState("pixelSizeX", false, enableNativeResolution(true));
            bindingContext.bindEnabledState("pixelSizeY", false, enableNativeResolution(true));
        }
        /* update region selectable map bounds according to the SourceProducts status: REMOVE or NEW product(s) */
        if (changeSourceProducts) updateRegionSelectableMapBounds(files);
    }


    private Enablement.Condition enableNativeResolution(boolean state) {
        return new Enablement.Condition() {
            @Override
            public boolean evaluate(BindingContext bindingContext) {
                if(state){
                    return true;
                }
                return false;
            }
        };
    }


    private void updateRegionSelectableMapBounds(File[] files){

        /* set default values in case files.length == 0 */
        double southBoundVal = 35.0;
        double northBoundVal = 75.0;
        double westBoundVal = -15.0;
        double eastBoundVal = 30.0;

        if ( (files.length >= 1) && (sourceProductMap.get(files[0]) != null) ) {
            southBoundVal = computeLatitude(sourceProductMap.get(files[0]), PROPERTY_MIN_VALUE);
            northBoundVal = computeLatitude(sourceProductMap.get(files[0]), PROPERTY_MAX_VALUE);
            westBoundVal = computeLongitude(sourceProductMap.get(files[0]), PROPERTY_MIN_VALUE);
            eastBoundVal = computeLongitude(sourceProductMap.get(files[0]), PROPERTY_MAX_VALUE);
        }

        for (int i = 1; i < files.length; i++) {
            if (sourceProductMap.get(files[i]) != null) {
                double southBoundValTemp = computeLatitude(sourceProductMap.get(files[i]), PROPERTY_MIN_VALUE);
                double northBoundValTemp = computeLatitude(sourceProductMap.get(files[i]), PROPERTY_MAX_VALUE);
                double westBoundValTemp = computeLongitude(sourceProductMap.get(files[i]), PROPERTY_MIN_VALUE);
                double eastBoundValTemp = computeLongitude(sourceProductMap.get(files[i]), PROPERTY_MAX_VALUE);

                if (southBoundValTemp < southBoundVal) southBoundVal = southBoundValTemp;
                if (northBoundValTemp > northBoundVal) northBoundVal = northBoundValTemp;
                if (westBoundValTemp < westBoundVal) westBoundVal = westBoundValTemp;
                if (eastBoundValTemp > eastBoundVal) eastBoundVal = eastBoundValTemp;
            }
        }

        parentForm.setCardinalBounds(southBoundVal, northBoundVal, westBoundVal,eastBoundVal);

    }

    private double computeLatitude(Product product, String level){
        final GeoCoding sceneGeoCoding = product.getSceneGeoCoding();
        Double[] latitudePoints = {
                            sceneGeoCoding.getGeoPos(new PixelPos(0, 0), null).getLat(),
                            sceneGeoCoding.getGeoPos(new PixelPos(0, product.getSceneRasterHeight()), null).getLat(),
                            sceneGeoCoding.getGeoPos(new PixelPos(product.getSceneRasterWidth(), 0), null).getLat(),
                            sceneGeoCoding.getGeoPos(new PixelPos(product.getSceneRasterWidth(), product.getSceneRasterHeight()), null).getLat()
        };

        switch(level) {
            case PROPERTY_MIN_VALUE :
                return Collections.min(Arrays.asList(latitudePoints));
            case PROPERTY_MAX_VALUE :
                return Collections.max(Arrays.asList(latitudePoints));
            default :
                return Double.MAX_VALUE;
        }

    }

    private double computeLongitude(Product product, String level){
        final GeoCoding sceneGeoCoding = product.getSceneGeoCoding();
        Double[] longitudePoints = {
                sceneGeoCoding.getGeoPos(new PixelPos(0, 0), null).getLon(),
                sceneGeoCoding.getGeoPos(new PixelPos(0, product.getSceneRasterHeight()), null).getLon(),
                sceneGeoCoding.getGeoPos(new PixelPos(product.getSceneRasterWidth(), 0), null).getLon(),
                sceneGeoCoding.getGeoPos(new PixelPos(product.getSceneRasterWidth(), product.getSceneRasterHeight()), null).getLon()
        };

        switch(level) {
            case PROPERTY_MIN_VALUE :
                return Collections.min(Arrays.asList(longitudePoints));
            case PROPERTY_MAX_VALUE :
                return Collections.max(Arrays.asList(longitudePoints));
            default :
                return Double.MAX_VALUE;
        }
    }

    Map<String, Object> getParameterMap() {
        return parameterMap;
    }

    Map<String, Product> getSourceProductMap() {
        final HashMap<String, Product> map = new HashMap<>(sourceProductMap.size());
        for (final Product product : sourceProductMap.values()) {
            map.put(GPF.SOURCE_PRODUCT_FIELD_NAME + product.getRefNo(), product);
        }
        if (Boolean.TRUE.equals(container.getValue(PROPERTY_UPDATE_MODE))) {
            final Product updateProduct = getUpdateProduct();
            if (updateProduct != null) {
                map.put(PROPERTY_UPDATE_PRODUCT, updateProduct);
            }
        }
        return map;
    }

    boolean isUpdateMode() {
        return Boolean.TRUE.equals(getPropertyValue(PROPERTY_UPDATE_MODE));
    }

    Product getUpdateProduct() {
        final Object value = getPropertyValue(PROPERTY_UPDATE_PRODUCT);
        if (value instanceof Product) {
            return (Product) value;
        }

        return null;
    }

    MosaicOp.Variable[] getVariables() {
        return (MosaicOp.Variable[]) getPropertyValue("variables");
    }

    MosaicOp.Condition[] getConditions() {
        return (MosaicOp.Condition[]) getPropertyValue("conditions");
    }

    PropertySet getPropertySet() {
        return container;
    }

    public Object getPropertyValue(String propertyName) {
        return container.getValue(propertyName);
    }

    public void setPropertyValue(String propertyName, Object value) {
        container.setValue(propertyName, value);
    }

    public Product getReferenceProduct() throws IOException {
        for (Product product : sourceProductMap.values()) {
            if (product.getRefNo() == 1) {
                return product;
            }
        }
        return null;
    }

    public Product getBoundaryProduct() throws FactoryException, TransformException {
        final CoordinateReferenceSystem mapCRS = getTargetCRS();
        if (mapCRS != null) {
            final ReferencedEnvelope envelope = getTargetEnvelope();
            final Envelope mapEnvelope = envelope.transform(mapCRS, true);

            final double pixelSizeX = (Double) getPropertyValue(PROPERTY_PIXEL_SIZE_X);
            final double pixelSizeY = (Double) getPropertyValue(PROPERTY_PIXEL_SIZE_Y);
            final int w = MathUtils.floorInt(mapEnvelope.getSpan(0) / pixelSizeX);
            final int h = MathUtils.floorInt(mapEnvelope.getSpan(1) / pixelSizeY);

            final Product product = new Product("Multi-seize Mosaic", "MosaicBounds", w, h);
            final GeoCoding geoCoding = new CrsGeoCoding(mapCRS,
                                                         w, h,
                                                         mapEnvelope.getMinimum(0),
                                                         mapEnvelope.getMaximum(1),
                                                         pixelSizeX, pixelSizeY);
            product.setSceneGeoCoding(geoCoding);

            return product;
        }
        return null;
    }

    void setTargetCRS(String crs) {
        setPropertyValue("crs", crs);
    }

    CoordinateReferenceSystem getTargetCRS() throws FactoryException {
        final String crs = (String) getPropertyValue("crs");
        if (crs == null) {
            return null;
        }
        try {
            return CRS.parseWKT(crs);
        } catch (FactoryException ignored) {
            return CRS.decode(crs, true);
        }
    }

    ReferencedEnvelope getTargetEnvelope() {
        final double west = (Double) getPropertyValue(BoundsInputPanel.PROPERTY_WEST_BOUND);
        final double north = (Double) getPropertyValue(BoundsInputPanel.PROPERTY_NORTH_BOUND);
        final double east = (Double) getPropertyValue(BoundsInputPanel.PROPERTY_EAST_BOUND);
        final double south = (Double) getPropertyValue(BoundsInputPanel.PROPERTY_SOUTH_BOUND);

        final Rectangle2D bounds = new Rectangle2D.Double();
        bounds.setFrameFromDiagonal(west, north, east, south);

        return new ReferencedEnvelope(bounds, DefaultGeographicCRS.WGS84);
    }

    public WorldMapPaneDataModel getWorldMapModel() {
        return worldMapModel;
    }

    public String getElevationModelName() {
        boolean orthorectify = (boolean) getPropertyValue(PROPERTY_ORTHORECTIFY);
        if (orthorectify) {
            return (String) getPropertyValue(PROPERTY_ELEVATION_MODEL_NAME);
        }
        return null;
    }
}
