package no.uib.inf101.tetris.model;

import java.util.ArrayList;
import java.util.List;

import no.uib.inf101.grid.CellPosition;
import no.uib.inf101.grid.Grid;

public class TetrisBoard extends Grid<Character> {

    private int row;
    private int col;
    private List<List<Character>> board;

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
}
    
    

