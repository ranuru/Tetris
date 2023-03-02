package no.uib.inf101.tetris.model.tetromino;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import no.uib.inf101.grid.CellPosition;
import no.uib.inf101.grid.GridCell;
import no.uib.inf101.grid.GridDimension;

public class Tetromino implements Iterable<GridCell<Character>> {

    private char symbol;
    private boolean[][] shape;
    private CellPosition pos;

    private Tetromino(char symbol, boolean[][] shape, CellPosition pos) {

    }

    Tetromino newTromino(char symbol) {

        CellPosition pos = new CellPosition(0, 0);
        boolean[][] shape = switch (symbol) {
            case 'L' -> TetrominoShapes.shapeL();
            case 'J' -> TetrominoShapes.shapeJ();
            case 'O' -> TetrominoShapes.shapeO();
            case 'S' -> TetrominoShapes.shapeS();
            case 'I' -> TetrominoShapes.shapeI();
            case 'Z' -> TetrominoShapes.shapeZ();
            case 'T' -> TetrominoShapes.shapeT();
            default -> throw new IllegalArgumentException("Unexpected value: " + symbol);
        };

        return new Tetromino(symbol, shape, pos);
    }

    //TODO: method can be wrong
    /**
     * Returns a new tetromino that is a copy of this one, but shifted by the given amount
     * @param deltaRow
     * @param deltaCol
     * @return a new tetromino 
     */
    Tetromino shiftedBy(int deltaRow, int deltaCol) {
        CellPosition pos = new CellPosition(0 + deltaRow, 0 + deltaCol);
        return new Tetromino(symbol, shape, pos);
    }
    /**
     * Returns a new tetromino that is a copy of this one, but shifted to the top center of the given grid
     * @param gd
     * @return a new tetromino 
     */
    Tetromino shiftedToTopCenterOf(GridDimension gd) {
        CellPosition pos = new CellPosition(0, gd.cols() / 2);
        return new Tetromino(symbol, shape, pos);
    }

    @Override
    public Iterator<GridCell<Character>> iterator() {
        List<GridCell<Character>> list  = new ArrayList<GridCell<Character>>();
        
       
}

