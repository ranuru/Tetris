package no.uib.inf101.tetris.model;

import java.util.ArrayList;
import java.util.List;

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
}
    
    

