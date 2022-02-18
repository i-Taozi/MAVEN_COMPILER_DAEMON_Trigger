package org.esa.snap.utils.matrix;

/**
 * @author Jean Coravu
 */
public class IntMatrix {
    private final int data[];
    private final int rowCount;
    private final int columnCount;

    public IntMatrix(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;

        this.data = new int[rowCount * columnCount];
    }

    public int getValueAt(int rowIndex, int columnIndex) {
        return this.data[(rowIndex * this.columnCount) + columnIndex];
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public int getColumnCount() {
        return this.columnCount;
    }

    public void setValueAt(int rowIndex, int columnIndex, int value) {
        this.data[(rowIndex * this.columnCount) + columnIndex] = value;
    }
}
