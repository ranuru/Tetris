package no.uib.inf101.tetris.model;

import no.uib.inf101.grid.GridCell;
import no.uib.inf101.grid.GridDimension;
import no.uib.inf101.tetris.controller.ControllableTetrisModel;
import no.uib.inf101.tetris.model.tetromino.Tetromino;
import no.uib.inf101.tetris.model.tetromino.TetrominoFactory;
import no.uib.inf101.tetris.view.ViewableTetrisModel;

public class TetrisModel implements ViewableTetrisModel, ControllableTetrisModel {

    private TetrominoFactory tetrominofactory;
    private Tetromino tetromino;
    private GameState gameState;
    private int points = 0;

    private TetrisBoard board;

    public TetrisModel(TetrisBoard board, TetrominoFactory tetrominofactory) {
        this.board = board;
        this.tetrominofactory = tetrominofactory;
        this.tetromino = tetrominofactory.getNext();
        this.tetromino = this.tetromino.shiftedToTopCenterOf(board);
        this.gameState = GameState.ACTIVE_GAME;
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

    @Override
    public boolean moveTetromino(int deltaRow, int deltaCol) {
        Tetromino newTetromino = this.tetromino.shiftedBy(deltaRow, deltaCol);
        if (this.board.canPlace(newTetromino)) {
            this.tetromino = newTetromino;
            return true;
        }
        return false;
    }

    @Override
    public boolean rotateTetromino() {
        Tetromino newTetromino = this.tetromino.rotate();
        if (this.board.canPlace(newTetromino)) {
            this.tetromino = newTetromino;
            return true;
        }
        return false;
    }

    @Override
    public void dropTetromino() {
        while (this.moveTetromino(1, 0) == true) {
            this.moveTetromino(1, 0);
        }
        this.addTetrominoToBoard();
        points += this.board.removeFullRows() * 100;
        getNewFallingTetromino();
    }

    public void getNewFallingTetromino() {
        Tetromino newTetromino = tetrominofactory.getNext();
        newTetromino = newTetromino.shiftedToTopCenterOf(board);
        if (this.board.canPlace(newTetromino)) {
            this.tetromino = newTetromino;
        } else {
            this.gameState = GameState.GAME_OVER;
        }
    }

    public void addTetrominoToBoard() {
        for (GridCell<Character> gridCell : this.tetromino) {
            this.board.set(gridCell.pos(), gridCell.value());
        }
        this.tetromino = tetrominofactory.getNext();
    }

    @Override
    public GameState getGameState() {
        return this.gameState;
    }

    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public int getTimerInterval() {
        return 1000;
    }

    @Override
    public void clockTick() {
        if (this.gameState == GameState.ACTIVE_GAME) {
            if (this.moveTetromino(1, 0) == false) {
                this.addTetrominoToBoard();
                getNewFallingTetromino();
            }
        }
    }
}
