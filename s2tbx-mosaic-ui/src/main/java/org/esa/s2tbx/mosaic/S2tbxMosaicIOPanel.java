/*
 * Copyright (C) 2011 Brockmann Consult GmbH (info@brockmann-consult.de)
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

import com.bc.ceres.binding.PropertySet;
import com.bc.ceres.swing.TableLayout;
import com.bc.ceres.swing.binding.BindingContext;
import com.bc.ceres.swing.selection.AbstractSelectionChangeListener;
import com.bc.ceres.swing.selection.SelectionChangeEvent;
import org.esa.s2tbx.mosaic.io.S2tbxFileArrayEditor;
import org.esa.snap.core.dataio.ProductIO;
import org.esa.snap.core.dataio.ProductIOPlugInManager;
import org.esa.snap.core.dataio.ProductReader;
import org.esa.snap.core.dataio.ProductWriterPlugIn;
import org.esa.snap.core.datamodel.Product;
import org.esa.snap.core.datamodel.ProductFilter;
import org.esa.snap.core.gpf.OperatorException;
import org.esa.snap.core.gpf.ui.SourceProductSelector;
import org.esa.snap.core.gpf.ui.TargetProductSelector;
import org.esa.snap.core.gpf.ui.TargetProductSelectorModel;
import org.esa.snap.core.util.PropertyMap;
import org.esa.snap.core.util.SystemUtils;
import org.esa.snap.core.util.io.FileUtils;
import org.esa.snap.rcp.actions.file.SaveProductAsAction;
import org.esa.snap.ui.AppContext;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingWorker;
import javax.swing.JFileChooser;
import javax.swing.JComponent;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author Razvan Dumitrascu
 * @since 5.0.6
 */
class S2tbxMosaicIOPanel extends JPanel {

    private static final String INPUT_PRODUCT_DIR_KEY = "gpf.mosaic.input.product.dir";

    private final AppContext appContext;
    private final S2tbxMosaicFormModel mosaicModel;
    private final PropertySet propertySet;
    private final TargetProductSelector targetProductSelector;
    private final SourceProductSelector updateProductSelector;
    private S2tbxFileArrayEditor sourceFileEditor;

    S2tbxMosaicIOPanel(AppContext appContext, S2tbxMosaicFormModel mosaicModel, TargetProductSelector selector) {
        this.appContext = appContext;
        this.mosaicModel = mosaicModel;
        propertySet = mosaicModel.getPropertySet();
        final S2tbxFileArrayEditor.EditorParent context = new S2tbxFileArrayEditorContext(appContext);
        sourceFileEditor = new S2tbxFileArrayEditor(context, "Source products") {
            @Override
            protected JFileChooser createFileChooserDialog() {
                final JFileChooser fileChooser = super.createFileChooserDialog();
                fileChooser.setDialogTitle("Multi-size Mosaic - Open Source Product(s)");
                return fileChooser;
            }
        };
        targetProductSelector = selector;
        updateProductSelector = new SourceProductSelector(appContext);
        updateProductSelector.setProductFilter(new UpdateProductFilter());
        init();
        propertySet.addPropertyChangeListener(S2tbxMosaicFormModel.PROPERTY_UPDATE_MODE, evt -> {
            if (Boolean.TRUE.equals(evt.getNewValue())) {
                propertySet.setValue(S2tbxMosaicFormModel.PROPERTY_UPDATE_PRODUCT,
                                     updateProductSelector.getSelectedProduct());
            } else {
                updateProductSelector.setSelectedProduct(null);
            }
        });
        propertySet.addPropertyChangeListener(S2tbxMosaicFormModel.PROPERTY_UPDATE_PRODUCT,
                                              new TargetProductSelectorUpdater());

    }

    private void init() {
        final TableLayout tableLayout = new TableLayout(1);
        tableLayout.setTableAnchor(TableLayout.Anchor.WEST);
        tableLayout.setTableFill(TableLayout.Fill.BOTH);
        tableLayout.setTableWeightX(1.0);
        tableLayout.setTableWeightY(0.0);
        tableLayout.setTablePadding(3, 3);
        setLayout(tableLayout);
        tableLayout.setRowWeightY(0, 1.0);
        add(createSourceProductsPanel());
        add(createTargetProductPanel());
        updateProductSelector.addSelectionChangeListener(new AbstractSelectionChangeListener() {
            @Override
            public void selectionChanged(SelectionChangeEvent event) {
                final Product product = (Product) event.getSelection().getSelectedValue();
                try {
                    if (product != null) {
                        final Map<String, Object> map = S2tbxMosaicOp.getOperatorParameters(product);
                        final Stream<Map.Entry<String, Object>> entrySetStream = map.entrySet().stream();
                        final Stream<Map.Entry<String, Object>> filteredStream = entrySetStream.filter(entry -> propertySet.getProperty(entry.getKey()) != null);
                        filteredStream.forEach(entry -> propertySet.setValue(entry.getKey(), entry.getValue()));
                    }

                    propertySet.setValue(S2tbxMosaicFormModel.PROPERTY_UPDATE_PRODUCT, product);
                } catch (OperatorException e) {
                    appContext.handleError("Selected product cannot be used for update mode.", e);
                }
            }
        });
    }

    private JPanel createSourceProductsPanel() {
        final S2tbxFileArrayEditor.FileArrayEditorListener listener = files -> {
            final SwingWorker worker = new SwingWorker() {
                @Override
                protected Object doInBackground() throws Exception {
                    mosaicModel.setSourceProducts(files);
                    return null;
                }

                @Override
                protected void done() {
                    try {
                        get();
                    } catch (Exception e) {
                        final String msg = String.format("Cannot display source products.\n%s", e.getMessage());
                        appContext.handleError(msg, e);
                    }
                }
            };
            worker.execute();
        };
        sourceFileEditor.setListener(listener);


        JButton addFileButton = sourceFileEditor.createAddFileButton();
        JButton removeFileButton = sourceFileEditor.createRemoveFileButton();
        JButton moveUpFileButton = sourceFileEditor.createMoveUpFileButton();
        JButton moveDownFileButton = sourceFileEditor.createMoveDownFileButton();
        final TableLayout tableLayout = new TableLayout(1);
        tableLayout.setTablePadding(4, 4);
        tableLayout.setTableWeightX(1.0);
        tableLayout.setTableWeightY(0.0);
        tableLayout.setTableAnchor(TableLayout.Anchor.WEST);
        tableLayout.setTableFill(TableLayout.Fill.BOTH);

        final JPanel sourceProductPanel = new JPanel(tableLayout);
        sourceProductPanel.setBorder(BorderFactory.createTitledBorder("Source Products"));
        final JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(addFileButton);
        buttonPanel.add(removeFileButton);
        buttonPanel.add(moveUpFileButton);
        buttonPanel.add(moveDownFileButton);

        tableLayout.setRowPadding(0, new Insets(1, 4, 1, 4));
        sourceProductPanel.add(buttonPanel);

        final JComponent fileArrayComponent = sourceFileEditor.createFileArrayComponent();
        tableLayout.setRowWeightY(1, 1.0);
        sourceProductPanel.add(fileArrayComponent);


        return sourceProductPanel;
    }

    private JPanel createTargetProductPanel() {
        final TableLayout tableLayout = new TableLayout(1);
        tableLayout.setTableAnchor(TableLayout.Anchor.WEST);
        tableLayout.setTableFill(TableLayout.Fill.BOTH);
        tableLayout.setTableWeightX(1.0);
        tableLayout.setTableWeightY(1.0);
        tableLayout.setTablePadding(3, 3);

        final JPanel targetProductPanel = new JPanel(tableLayout);
        targetProductPanel.setBorder(BorderFactory.createTitledBorder("Target Product"));
        final JCheckBox updateTargetCheckBox = new JCheckBox("Update target product", false);
        final BindingContext context = new BindingContext(propertySet);
        context.bind(S2tbxMosaicFormModel.PROPERTY_UPDATE_MODE, updateTargetCheckBox);
        updateTargetCheckBox.setEnabled(false);
        targetProductPanel.add(updateTargetCheckBox);

        final CardLayout cards = new CardLayout(0, 3);
        final JPanel subPanel = new JPanel(cards);
        final JPanel newProductSelectorPanel = createTargetProductSelectorPanel(targetProductSelector);
        final JPanel updateProductSelectorPanel = createUpdateProductSelectorPanel(updateProductSelector);
        final String newProductKey = "NEW_PRODUCT";
        final String updateProductKey = "UPDATE_PRODUCT";
        subPanel.add(newProductSelectorPanel, newProductKey);
        subPanel.add(updateProductSelectorPanel, updateProductKey);
        updateTargetCheckBox.addActionListener(e -> {
            if (updateTargetCheckBox.isSelected()) {
                prepareHideTargetProductSelector();
                prepareShowUpdateProductSelector();
                cards.show(subPanel, updateProductKey);
            } else {
                prepareShowTargetProductSelector();
                prepareHideUpdateProductSelector();
                cards.show(subPanel, newProductKey);
            }
        });
        cards.show(subPanel, newProductKey);
        targetProductPanel.add(subPanel);
        targetProductPanel.add(targetProductSelector.getOpenInAppCheckBox());
        return targetProductPanel;
    }

    private JPanel createUpdateProductSelectorPanel(final SourceProductSelector selector) {
        final JPanel subPanel = new JPanel(new BorderLayout(3, 3));
        subPanel.add(selector.getProductNameComboBox(), BorderLayout.CENTER);
        subPanel.add(selector.getProductFileChooserButton(), BorderLayout.EAST);

        final TableLayout tableLayout = new TableLayout(1);
        tableLayout.setTableAnchor(TableLayout.Anchor.WEST);
        tableLayout.setTableWeightX(1.0);
        tableLayout.setRowFill(0, TableLayout.Fill.HORIZONTAL);
        tableLayout.setRowFill(1, TableLayout.Fill.HORIZONTAL);
        tableLayout.setTablePadding(3, 3);
        JPanel panel = new JPanel(tableLayout);
        panel.add(selector.getProductNameLabel());
        panel.add(subPanel);
        panel.add(tableLayout.createVerticalSpacer());
        return panel;
    }

    private static JPanel createTargetProductSelectorPanel(final TargetProductSelector selector) {
        final JPanel subPanel1 = new JPanel(new BorderLayout(3, 3));
        subPanel1.add(selector.getProductNameLabel(), BorderLayout.NORTH);
        subPanel1.add(selector.getProductNameTextField(), BorderLayout.CENTER);

        final JPanel subPanel2 = new JPanel(new FlowLayout(FlowLayout.LEADING, 0, 0));
        subPanel2.add(selector.getSaveToFileCheckBox());
        subPanel2.add(selector.getFormatNameComboBox());

        final JPanel subPanel3 = new JPanel(new BorderLayout(3, 3));
        subPanel3.add(selector.getProductDirLabel(), BorderLayout.NORTH);
        subPanel3.add(selector.getProductDirTextField(), BorderLayout.CENTER);
        subPanel3.add(selector.getProductDirChooserButton(), BorderLayout.EAST);

        final TableLayout tableLayout = new TableLayout(1);
        tableLayout.setTableAnchor(TableLayout.Anchor.WEST);
        tableLayout.setTableFill(TableLayout.Fill.HORIZONTAL);
        tableLayout.setTableWeightX(1.0);

        tableLayout.setCellPadding(0, 0, new Insets(3, 3, 3, 3));
        tableLayout.setCellPadding(1, 0, new Insets(3, 0, 3, 3));
        tableLayout.setCellPadding(2, 0, new Insets(0, 21, 3, 3));

        final JPanel panel = new JPanel(tableLayout);
        panel.add(subPanel1);
        panel.add(subPanel2);
        panel.add(subPanel3);

        return panel;
    }

    void prepareShow() {
        prepareShowTargetProductSelector();
        if (mosaicModel.isUpdateMode()) {
            prepareShowUpdateProductSelector();
        }
    }

    private void prepareShowUpdateProductSelector() {
        updateProductSelector.initProducts();
    }

    private void prepareShowTargetProductSelector() {
        try {
            final List<File> files = sourceFileEditor.getFiles();
            mosaicModel.setSourceProducts(files.toArray(new File[files.size()]));
        } catch (IOException ignore) {
        }
    }

    void prepareHide() {
        prepareHideUpdateProductSelector();
        prepareHideTargetProductSelector();
    }

    private void prepareHideUpdateProductSelector() {
        updateProductSelector.releaseProducts();
    }

    private void prepareHideTargetProductSelector() {
        try {
            mosaicModel.setSourceProducts(new File[0]);
        } catch (IOException ignore) {
        }
    }

    private static class S2tbxFileArrayEditorContext implements S2tbxFileArrayEditor.EditorParent {

        private final AppContext applicationContext;

        private S2tbxFileArrayEditorContext(AppContext applicationContext) {

            this.applicationContext = applicationContext;
        }

        @Override
        public File getUserInputDir() {
            return getInputProductDir();
        }

        @Override
        public void setUserInputDir(File newDir) {
            setInputProductDir(newDir);
        }

        private void setInputProductDir(final File currentDirectory) {
            applicationContext.getPreferences().setPropertyString(INPUT_PRODUCT_DIR_KEY,
                                                                  currentDirectory.getAbsolutePath());
        }

        private File getInputProductDir() {
            final String path = applicationContext.getPreferences().getPropertyString(INPUT_PRODUCT_DIR_KEY);
            final File inputProductDir;
            if (path != null) {
                inputProductDir = new File(path);
            } else {
                inputProductDir = null;
            }
            return inputProductDir;
        }
    }

    private class TargetProductSelectorUpdater implements PropertyChangeListener {

        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            final Product product = (Product) evt.getNewValue();
            final TargetProductSelectorModel selectorModel = targetProductSelector.getModel();
            if (product != null) {
                final String formatName = product.getProductReader().getReaderPlugIn().getFormatNames()[0];
                final ProductIOPlugInManager ioPlugInManager = ProductIOPlugInManager.getInstance();
                final Iterator<ProductWriterPlugIn> writerIterator = ioPlugInManager.getWriterPlugIns(formatName);
                if (writerIterator.hasNext()) {
                    selectorModel.setFormatName(formatName);
                } else {
                    final String errMsg = "Cannot write to update product.";
                    final String iseMsg = String.format("No product writer found for format '%s'", formatName);
                    appContext.handleError(errMsg, new IllegalStateException(iseMsg));
                }
                final File fileLocation = product.getFileLocation();
                final String fileName = FileUtils.getFilenameWithoutExtension(fileLocation);
                final File fileDir = fileLocation.getParentFile();
                selectorModel.setProductName(fileName);
                selectorModel.setProductDir(fileDir);
            } else {
                selectorModel.setFormatName(ProductIO.DEFAULT_FORMAT_NAME);
                selectorModel.setProductName("Multi-size Mosaic");
                String homeDirPath = SystemUtils.getUserHomeDir().getPath();
                final PropertyMap prefs = appContext.getPreferences();
                String saveDir = prefs.getPropertyString(SaveProductAsAction.PREFERENCES_KEY_LAST_PRODUCT_DIR, homeDirPath);
                selectorModel.setProductDir(new File(saveDir));
            }
        }
    }

    public class UpdateProductFilter implements ProductFilter {

        @Override
        public boolean accept(Product product) {
            ProductReader productReader = product.getProductReader();
            if (productReader != null) {
                final String formatName = productReader.getReaderPlugIn().getFormatNames()[0];
                final ProductIOPlugInManager ioPlugInManager = ProductIOPlugInManager.getInstance();
                final Iterator<ProductWriterPlugIn> writerIterator = ioPlugInManager.getWriterPlugIns(formatName);
                if (writerIterator.hasNext()) {
                    try {
                        S2tbxMosaicOp.getOperatorParameters(product);
                    } catch (OperatorException e) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
