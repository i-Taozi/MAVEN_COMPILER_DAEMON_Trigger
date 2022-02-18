/*
 * Copyright (C) 2010 Brockmann Consult GmbH (info@brockmann-consult.de)
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

package org.esa.s2tbx.mosaic.reproject;

import org.esa.snap.core.datamodel.Band;
import org.esa.snap.core.datamodel.GeoPos;
import org.esa.snap.core.datamodel.PixelPos;
import org.esa.snap.core.datamodel.Product;
import org.esa.snap.core.datamodel.ProductData;
import org.esa.snap.core.datamodel.TiePointGeoCoding;
import org.esa.snap.core.datamodel.TiePointGrid;
import org.esa.snap.core.gpf.GPF;
import org.esa.snap.core.gpf.OperatorSpi;
import org.junit.Before;
import org.junit.BeforeClass;

import javax.media.jai.operator.ConstantDescriptor;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * @author Marco Peters
 * @author Razvan Dumitrascu
 * @since BEAM 4.7
 */
public abstract class AbstractReprojectionOpTest {

    protected static final String WGS84_CODE = "EPSG:4326";
    protected static final String UTM33N_CODE = "EPSG:32633";
    @SuppressWarnings({"StringConcatenation"})
    protected static final String UTM33N_WKT = "PROJCS[\"WGS 84 / UTM zone 33N\"," +
                                               "GEOGCS[\"WGS 84\"," +
                                               "  DATUM[\"World Geodetic System 1984\"," +
                                               "    SPHEROID[\"WGS 84\", 6378137.0, 298.257223563, AUTHORITY[\"EPSG\",\"7030\"]]," +
                                               "    AUTHORITY[\"EPSG\",\"6326\"]]," +
                                               "  PRIMEM[\"Greenwich\", 0.0, AUTHORITY[\"EPSG\",\"8901\"]]," +
                                               "  UNIT[\"degree\", 0.017453292519943295]," +
                                               "  AXIS[\"Geodetic longitude\", EAST]," +
                                               "  AXIS[\"Geodetic latitude\", NORTH]," +
                                               "  AUTHORITY[\"EPSG\",\"4326\"]]," +
                                               "PROJECTION[\"Transverse Mercator\", AUTHORITY[\"EPSG\",\"9807\"]]," +
                                               "PARAMETER[\"central_meridian\", 15.0]," +
                                               "PARAMETER[\"latitude_of_origin\", 0.0]," +
                                               "PARAMETER[\"scale_factor\", 0.9996]," +
                                               "PARAMETER[\"false_easting\", 500000.0]," +
                                               "PARAMETER[\"false_northing\", 0.0]," +
                                               "UNIT[\"m\", 1.0]," +
                                               "AXIS[\"Easting\", EAST]," +
                                               "AXIS[\"Northing\", NORTH]," +
                                               "AUTHORITY[\"EPSG\",\"32633\"]]";
    protected static File wktFile;

    private static final float[] LATS = new float[]{
            50.0f, 50.0f,
            30.0f, 30.0f
    };
    private static final float[] LONS = new float[]{
            6.0f, 26.0f,
            6.0f, 26.0f
    };
    protected static final String FLOAT_BAND_NAME = "floatData";
    protected static final String INT_BAND_NAME = "intData";

    protected Product referenceProduct;
    protected Product multiSizeSourceProduct;
    protected Map<String, Object> parameterMap;
    protected static final double EPS = 1.0e-6;

    @BeforeClass
    public static void setup() throws URISyntaxException {
        wktFile = new File(AbstractReprojectionOpTest.class.getResource("test.wkt").toURI());
    }


    private void createReferenceProduct() throws Exception {
        referenceProduct = new Product("reference", "t", 50, 50);
        final TiePointGrid latGrid = new TiePointGrid("latGrid", 2, 2, 0.5f, 0.5f, 49, 49, LATS);
        final TiePointGrid lonGrid = new TiePointGrid("lonGrid", 2, 2, 0.5f, 0.5f, 49, 49, LONS);
        referenceProduct.addTiePointGrid(latGrid);
        referenceProduct.addTiePointGrid(lonGrid);
        referenceProduct.setSceneGeoCoding(new TiePointGeoCoding(latGrid, lonGrid));
        referenceProduct.setStartTime(ProductData.UTC.parse("02-May-2017 10:15:10"));
        referenceProduct.setEndTime(ProductData.UTC.parse("02-May-2017 10:45:50"));
        Band databand1 = new Band(FLOAT_BAND_NAME, ProductData.TYPE_FLOAT32, 50,50);
        databand1.setSourceImage(ConstantDescriptor.create((float) 50, (float) 50, new Float[]{ 299.0f}, null));
        databand1.setRasterData(createDataFor(databand1));
        databand1.setSynthetic(true);
        Band databand2 = new Band(INT_BAND_NAME, ProductData.TYPE_INT16, 28,28);
        databand2.setSourceImage(ConstantDescriptor.create((float) 28, (float) 28, new Float[]{ 199.0f}, null));
        databand2.setRasterData(createDataFor(databand2));
        databand2.setSynthetic(true);
        referenceProduct.addBand(databand1);
        referenceProduct.addBand(databand2);
    }

    private void createMultiSizeSourceProduct() throws Exception {
        multiSizeSourceProduct = new Product("source", "t", 50, 50);
        final TiePointGrid latGrid = new TiePointGrid("latGrid", 2, 2, 0.5f, 0.5f, 49, 49, LATS);
        final TiePointGrid lonGrid = new TiePointGrid("lonGrid", 2, 2, 0.5f, 0.5f, 49, 49, LONS);
        multiSizeSourceProduct.addTiePointGrid(latGrid);
        multiSizeSourceProduct.addTiePointGrid(lonGrid);
        multiSizeSourceProduct.setSceneGeoCoding(new TiePointGeoCoding(latGrid, lonGrid));
        multiSizeSourceProduct.setStartTime(ProductData.UTC.parse("02-May-2017 10:15:10"));
        multiSizeSourceProduct.setEndTime(ProductData.UTC.parse("02-May-2017 10:45:50"));
        Band databand1 = new Band(FLOAT_BAND_NAME, ProductData.TYPE_FLOAT32, 50,50);
        databand1.setSourceImage(ConstantDescriptor.create((float) 50, (float) 50, new Float[]{ 299.0f}, null));
        databand1.setRasterData(createDataFor(databand1));
        databand1.setSynthetic(true);
        Band databand2 = new Band(INT_BAND_NAME, ProductData.TYPE_INT16, 25,25);
        databand2.setSourceImage(ConstantDescriptor.create((float) 25, (float) 25, new Float[]{ 199.0f}, null));
        databand2.setRasterData(createDataFor(databand2));
        databand2.setSynthetic(true);
        multiSizeSourceProduct.addBand(databand1);
        multiSizeSourceProduct.addBand(databand2);
    }

    @Before
    public void setupTestMethod() throws Exception {
        parameterMap = new HashMap<>(5);
        createReferenceProduct();
        createMultiSizeSourceProduct();
    }


    protected Product createReprojectedProduct(Map<String, Product> sourceMap) {
        String operatorName = OperatorSpi.getOperatorAlias(S2tbxReprojectionOp.class);
        return GPF.createProduct(operatorName, parameterMap, sourceMap);
    }

    protected Product createReprojectedProduct() {
        String operatorName = OperatorSpi.getOperatorAlias(S2tbxReprojectionOp.class);
        return GPF.createProduct(operatorName, parameterMap, multiSizeSourceProduct);
    }

    protected void assertPixelValidState(Band targetBand, double sourceX, double sourceY,
                                         boolean expectedValid) throws IOException {
        final PixelPos targetPP = computeTargetPP(targetBand, sourceX, sourceY);
        assertTargetPixelValidState(targetBand, targetPP, expectedValid);
    }

    protected void assertTargetPixelValidState(Band targetBand, PixelPos targetPP, boolean expectedValid) {
        boolean pixelValid = targetBand.isPixelValid((int) Math.floor(targetPP.x), (int) Math.floor(targetPP.y));
        assertEquals(expectedValid, pixelValid);
    }

    protected void assertPixelValue(Band targetBand, double sourceX, double sourceY,
                                  double expectedPixelValue, double delta) throws IOException {
        final PixelPos targetPP = computeTargetPP(targetBand, sourceX, sourceY);
        assertTargetPixelValue(targetBand, targetPP, expectedPixelValue, delta);
    }

    protected void assertTargetPixelValue(Band targetBand, PixelPos targetPP, double expectedPixelValue, double delta) throws IOException {
        final double[] pixels = new double[1];
        targetBand.readPixels((int) Math.floor(targetPP.x), (int) Math.floor(targetPP.y), 1, 1, pixels);
        assertEquals(expectedPixelValue, pixels[0], delta);
    }

    protected PixelPos computeTargetPP(Band targetBand, double sourceX, double sourceY) {
        final Band sourceBand = multiSizeSourceProduct.getBand(targetBand.getName());
        final PixelPos sourcePP = new PixelPos(sourceX, sourceY);
        final GeoPos geoPos = sourceBand.getGeoCoding().getGeoPos(sourcePP, null);
        return targetBand.getGeoCoding().getPixelPos(geoPos, null);
    }

    private static ProductData createDataFor(Band dataBand) {
        final int width = dataBand.getRasterWidth();
        final int height = dataBand.getRasterHeight();
        final ProductData data = ProductData.createInstance(dataBand.getDataType(), width * height);
        for (int y = 0; y < height; y++) {
            final int line = y * width;
            for (int x = 0; x < width; x++) {
                data.setElemIntAt(line + x, x * y);
            }
        }
        return data;
    }
}
