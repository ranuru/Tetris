package no.uib.inf101.tetris.model.tetromino;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import no.uib.inf101.grid.CellPosition;
import no.uib.inf101.grid.GridCell;
import no.uib.inf101.grid.GridDimension;

/**
 * Class that represents a tetromino
 *
 */
public class Tetromino implements Iterable<GridCell<Character>> {

    private char symbol;
    private boolean[][] shape;
    private CellPosition pos;

    /**
     * Creates a new tetromino
     * 
     * @param symbol the symbol of the tetromino
     * @param shape  the shape of the tetromino
     * @param pos    the position of the tetromino
     */
    private Tetromino(char symbol, boolean[][] shape, CellPosition pos) {
        this.symbol = symbol;
        this.shape = shape;
        this.pos = pos;
    }

    static Tetromino newTetromino(char symbol) {

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

    /**
     * Returns a new tetromino that is a copy of this one, but shifted by the given
     * amount
     * 
     * @param deltaRow
     * @param deltaCol
     * @return a new tetromino
     */
    public Tetromino shiftedBy(int deltaRow, int deltaCol) {

        CellPosition pos = new CellPosition(deltaRow + this.pos.row(), deltaCol + this.pos.col());
        return new Tetromino(symbol, shape, pos);
    }

    /**
     * Returns a new tetromino that is a copy of this one, but shifted to the top
     * center of the given GridDimension
     * 
     * @param gd
     * @return a new tetromino
     */

    public Tetromino shiftedToTopCenterOf(GridDimension gd) {
        CellPosition pos = new CellPosition(-1, (gd.cols() / 2) - 2);
        return new Tetromino(symbol, shape, pos);
    }

    @Override
    public Iterator<GridCell<Character>> iterator() {
        List<GridCell<Character>> list = new ArrayList<GridCell<Character>>();
        for (int i = 0; i < this.shape.length; i++) {
            for (int j = 0; j < this.shape.length; j++) {
                if (this.shape[i][j] == true) {
                    list.add(new GridCell<Character>(new CellPosition(i + this.pos.row(), j + this.pos.col()),
                            this.symbol));
                }
            }
        }
        return list.iterator();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + symbol;
        result = prime * result + Arrays.deepHashCode(shape);
        result = prime * result + ((pos == null) ? 0 : pos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tetromino other = (Tetromino) obj;
        if (symbol != other.symbol)
            return false;
        if (!Arrays.deepEquals(shape, other.shape))
            return false;
        if (pos == null) {
            if (other.pos != null)
                return false;
        } else if (!pos.equals(other.pos))
            return false;
        return true;
    }

    /**
     * Returns a new tetromino that is a copy of this one, but rotated 90 degrees
     * clockwise
     * 
     * @return a new tetromino
     */
    public Tetromino rotate() {
        boolean[][] newShape = new boolean[shape.length][shape.length];
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape.length; j++) {
                newShape[i][j] = shape[shape.length - j - 1][i];
            }
        }
        return new Tetromino(symbol, newShape, pos);
    }

    /**
     * Returns a new tetromino that is a copy of this one, but rotated 90 degrees
     * counter clockwise
     * 
     * @return a new tetromino
     */
    public Tetromino rotateCounterClockwise() {
        boolean[][] newShape = new boolean[shape.length][shape.length];
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape.length; j++) {
                newShape[i][j] = shape[j][shape.length - i - 1];
            }
        }
        return new Tetromino(symbol, newShape, pos);
    }

    /**
     * Returns the symbol of this tetromino
     * 
     * @return character symbol
     */
    public char getSymbol() {
        return this.symbol;
    }

    /**
     * Returns the shape of this tetromino
     * 
     * @return boolean[][] shape
     */
    public boolean[][] getShape() {
        return this.shape;
    }

    /**
     * Returns the position of this tetromino
     * 
     * @return CellPosition pos
     */
    public CellPosition getPos() {
        return this.pos;
    }
}
