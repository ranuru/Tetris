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

    public String prettyString() {
        for (int i = 0; i<this.row; i++) {
            for (int j = 0; j<this.row; j++) {
                CellPosition pos = new CellPosition(i, j);
                board.get(pos);
            }
        }
    }
}
    
    

