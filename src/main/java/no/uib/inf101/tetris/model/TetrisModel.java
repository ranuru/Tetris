package no.uib.inf101.tetris.model;

import no.uib.inf101.grid.GridCell;
import no.uib.inf101.grid.GridDimension;
import no.uib.inf101.tetris.model.tetromino.Tetromino;
import no.uib.inf101.tetris.model.tetromino.TetrominoFactory;
import no.uib.inf101.tetris.view.ViewableTetrisModel;

public class TetrisModel implements ViewableTetrisModel{

    TetrominoFactory tetrominofactory;
    Tetromino tetromino;


    private TetrisBoard board;

    public TetrisModel(TetrisBoard board, TetrominoFactory tetrominofactory) {
        this.board = board;
        this.tetrominofactory = tetrominofactory;
        this.tetromino = tetrominofactory.getNext();
        this.tetromino = this.tetromino.shiftedToTopCenterOf(board);
    }

    @Override
    public GridDimension getDimension() {
        return this.board;
    }

    @Override
    public Iterable<GridCell<Character>> getTilesOnBoard() {
        return this.board;

        
    }

    @Override
    public Iterable<GridCell<Character>> getTilesOnFallingTetromino() {
        return this.tetromino;
    }
    
}
