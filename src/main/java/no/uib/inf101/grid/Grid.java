package no.uib.inf101.grid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.IndexOutOfBoundsException;

public class Grid<E> implements IGrid<E> {

    private int row;
    private int col;
    protected E defaultValue;
    private List<List<E>> grid;
    private List<E> cell;

    public Grid(int row, int col, E defaultValue) {
        this.row = row;
        this.col = col;
        this.defaultValue = defaultValue;

        fillGrid(row, col, defaultValue);
    }

    public Grid(int row, int col) {
        this.row = row;
        this.col = col;
        this.defaultValue = null;

        fillGrid(row, col, defaultValue);
    }

    /**
     * Fills the grid with the specificed defaultValue
     * 
     * @param row
     * @param col
     * @param defaultValue
     */
    public void fillGrid(int row, int col, E defaultValue) {
        this.grid = new ArrayList<List<E>>();
        for (int i = 0; i < this.row; i++) {
            this.cell = new ArrayList<E>();
            this.grid.add(this.cell);
            for (int j = 0; j < this.col; j++) {
                this.cell.add(this.defaultValue);
            }
        }

    }

    @Override
    public int rows() {
        return this.row;
    }

    @Override
    public int cols() {
        return this.col;
    }

    @Override
    public Iterator<GridCell<E>> iterator() {
        ArrayList<GridCell<E>> list = new ArrayList<GridCell<E>>();
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {

                CellPosition pos = new CellPosition(i, j);
                E value = this.grid.get(i).get(j);
                GridCell<E> gc = new GridCell<E>(pos, value);
                list.add(gc);
            }
        }
        return list.iterator();
    }

    @Override
    public void set(CellPosition pos, E value) throws IndexOutOfBoundsException {
        int row = pos.row();
        int col = pos.col();
        this.grid.get(row).set(col, value);

    }

    @Override
    public E get(CellPosition pos) throws IndexOutOfBoundsException {
        int row = pos.row();
        int col = pos.col();
        System.out.println(grid);
        return this.grid.get(row).get(col);

    }

    @Override
    public boolean positionIsOnGrid(CellPosition pos) throws IndexOutOfBoundsException {
        int row = pos.row();
        int col = pos.col();

        if (row > this.row - 1 || row < 0 || col > this.col - 1 || col < 0)
            return false;
        else
            return true;
    }

}
