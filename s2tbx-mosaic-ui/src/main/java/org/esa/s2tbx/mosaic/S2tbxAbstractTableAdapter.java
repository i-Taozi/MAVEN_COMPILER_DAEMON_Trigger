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

package org.esa.s2tbx.mosaic;

import com.bc.ceres.swing.binding.ComponentAdapter;

import javax.swing.JTable;
import javax.swing.JComponent;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.lang.reflect.Field;
import java.util.Vector;

/**
 * @author Razvan Dumitrascu
 * @since 5.0.6
 */

abstract class S2tbxAbstractTableAdapter extends ComponentAdapter implements TableModelListener {

    private final JTable table;

    protected S2tbxAbstractTableAdapter(
            JTable table) {
        this.table = table;
    }

    JTable getTable() {
        return table;
    }

    @Override
    public final JComponent[] getComponents() {
        return new JComponent[]{table};
    }

    @Override
    public final void bindComponents() {
        table.setModel(createTableModel(0));
        adjustTableModel();
        table.getModel().addTableModelListener(this);
    }

    @Override
    public final void unbindComponents() {
        table.getModel().removeTableModelListener(this);
    }

    @Override
    public final void adjustComponents() {
        adjustTableModel();
    }

    @Override
    public abstract void tableChanged(TableModelEvent e);

    protected abstract DefaultTableModel createTableModel(int rowCount);

    private void adjustTableModel() {
        final DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        final Object value = getBinding().getPropertyValue();
        if (value instanceof Object[]) {
            final Object[] items = (Object[]) value;
            // 1. add missing rows to model
            for (int i = tableModel.getRowCount(); i < items.length; i++) {
                tableModel.addRow((Object[]) null);
            }
            // 2. remove redundant rows from model
            for (int i = items.length; i < tableModel.getRowCount(); i++) {
                tableModel.removeRow(i);
            }
            // 3. update cell values
            for (int i = 0; i < items.length; i++) {
                final Object item = items[i];
                final Field[] fields = item.getClass().getDeclaredFields();
                for (int k = 0; k < fields.length; k++) {
                    final Field field = fields[k];
                    final boolean accessible = field.isAccessible();
                    if (!accessible) {
                        field.setAccessible(true);
                    }
                    try {
                        Vector dataVector = tableModel.getDataVector();
                        Vector row = (Vector)dataVector.elementAt(i);
                        // 1. add missing columns to row
                        for (int l = row.size(); l < fields.length; l++) {
                            row.add(null);
                        }
                        // 2. remove redundant columns from row
                        for (int l = fields.length; l < row.size(); l++) {
                            row.remove(l);
                        }

                        tableModel.setValueAt(field.get(item), i, k);
                    } catch (IllegalAccessException e) {
                        // ignore
                    }
                    if (!accessible) {
                        field.setAccessible(false);
                    }
                }
            }
        }
    }
}
