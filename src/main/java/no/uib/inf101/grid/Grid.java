package no.uib.inf101.grid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Grid<E> implements IGrid<E> {

    // feltvariabler
    private int row;
    private int col;
    private E defaultValue;
    private List<List<E>> grid;
    private List<E> cell;


    // konstruktør som blir brukt hvis det skrives inn en "defaultValue" som fylles inn i griden
    public Grid(int row, int col, E defaultValue) {
        this.row = row;
        this.col = col;
        this.defaultValue = defaultValue;

        // oppretter en grid og fyller den med "defaultValue" hvis det finnes en defaultValue
        this.grid = new ArrayList<List<E>>();
        for (int i = 0; i < row; i++) {
            this.cell = new ArrayList<E>();
            grid.add(cell);
            for (int j = 0; j < col; j++) {
                cell.add(defaultValue);
            }
        }
    }

    // konstruktør som blir brukt hvis det ikke skrives inn en "defaultValue", fyller griden med null
    public Grid(int row, int col) {
        this.row = row;
        this.col = col;

        // oppretter en grid og fyller den med "null"
        this.grid = new ArrayList<List<E>>();
        for (int i = 0; i < row; i++) {
            this.cell = new ArrayList<E>();
            grid.add(cell);
            for (int j = 0; j < col; j++) {
                cell.add(null);
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public void set(CellPosition pos, E value) {
        int row = pos.row();
        int col = pos.col();
        this.grid.get(row).set(col, value);

    }

    @Override
    public E get(CellPosition pos) {
        int row = pos.row();
        int col = pos.col();
        System.out.println(grid);
        return this.grid.get(row).get(col);

    }

    @Override
    public boolean positionIsOnGrid(CellPosition pos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'positionIsOnGrid'");
    }

}
