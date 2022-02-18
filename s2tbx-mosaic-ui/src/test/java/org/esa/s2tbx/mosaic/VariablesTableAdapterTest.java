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

import com.bc.ceres.binding.PropertyContainer;
import com.bc.ceres.swing.binding.BindingContext;
import org.esa.snap.core.gpf.annotations.ParameterDescriptorFactory;
import org.esa.snap.core.gpf.common.MosaicOp;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Razvan Dumitrascu
 * @since 5.0.2
 */

public class VariablesTableAdapterTest {

    private BindingContext bindingContext;

    @Before
    public void before() {
        final PropertyContainer pc = ParameterDescriptorFactory.createMapBackedOperatorPropertyContainer("Multi-size Mosaic");
        bindingContext = new BindingContext(pc);
    }

    @Test
    public void variablesProperty() {
        final JTable table = new JTable();
        bindingContext.bind("variables", new S2tbxVariablesTableAdapter(table));
        assertTrue(table.getModel() instanceof DefaultTableModel);

        final DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.addRow(new String[]{"", ""});
        tableModel.addRow(new String[]{"", ""});

        assertEquals(2, table.getRowCount());

        table.setValueAt("a", 0, 0);
        assertEquals("a", table.getValueAt(0, 0));
        table.setValueAt("A", 0, 1);
        assertEquals("A", table.getValueAt(0, 1));

        table.setValueAt("b", 1, 0);
        assertEquals("b", table.getValueAt(1, 0));
        table.setValueAt("B", 1, 1);
        assertEquals("B", table.getValueAt(1, 1));

        bindingContext.getPropertySet().setValue("variables", new MosaicOp.Variable[]{
                new MosaicOp.Variable("d", "D")
        });

        assertEquals(1, table.getRowCount());
        assertEquals("d", table.getValueAt(0, 0));
        assertEquals("D", table.getValueAt(0, 1));
    }
}
