package no.uib.inf101.tetris.model;

import no.uib.inf101.grid.CellPosition;
import no.uib.inf101.grid.Grid;
import no.uib.inf101.grid.GridCell;
import no.uib.inf101.tetris.model.tetromino.Tetromino;
import no.uib.inf101.tetris.view.ViewableTetrisModel;

public class TetrisBoard extends Grid<Character> {

    private int row;
    private int col;
    ViewableTetrisModel model;

    public TetrisBoard(int row, int col) {
        super(row, col);
        this.row = row;
        this.col = col;
        this.defaultValue = '-';
        super.fillGrid(row, col, defaultValue);
    }

    /**
     * 
     * @return a string representation of the grid
     */
    public String prettyString() {
        String stringBoard = "";
        for (int i = 0; i<this.row; i++) {
            if (stringBoard != "") {
            stringBoard += "\n"; }
            for (int j = 0; j<this.col; j++) {
                CellPosition pos = new CellPosition(i, j);
                Character value = get(pos); 
                stringBoard += value;
            }
        }
        return stringBoard;
    }

    /**
     * 
     * @param newTetromino
     * @return true if the tetromino can be placed on the board
     */
    public boolean canPlace(Tetromino newTetromino) {
        for (GridCell<Character> gridCell : newTetromino) {
            CellPosition pos = gridCell.pos();
            if (pos.row() < 0 || pos.row() >= this.row || pos.col() < 0 || pos.col() >= this.col) {
                return false;
            }
            if (get(pos) != '-') {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfRowIsFull(int row) {
        for (int i = 0; i<this.col; i++) {
            CellPosition pos = new CellPosition(row, i);
            if (get(pos) == '-') {
                return false;
            }
        }
        return true;
    }

    public void setRow(int row, Character character) {
        for (int i = 0; i<this.col; i++) {
            CellPosition pos = new CellPosition(row, i);
            set(pos, character);
        }
    }

    public void copyRow(int row, int row2) {
        for (int i = 0; i<this.col; i++) {
            CellPosition pos = new CellPosition(row, i);
            CellPosition pos2 = new CellPosition(row2, i);
            set(pos2, get(pos));
        }
    }

    public int removeFullRows() {
        int rowsRemoved = 0;
        for (int i = 0; i<this.row; i++) {
            if (checkIfRowIsFull(i)) {
                rowsRemoved++;
                for (int j = i; j>0; j--) {
                    copyRow(j-1, j);
                }
                setRow(0, '-');
            }
        }
        return rowsRemoved;
    }
}
    
    

