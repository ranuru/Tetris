package no.uib.inf101.tetris.controller;

import no.uib.inf101.tetris.model.GameState;
import no.uib.inf101.tetris.model.tetromino.Tetromino;

public interface ControllableTetrisModel {
    

    /**
     * Move the falling tetromino one step.
     * 
     * @return true if the move was successful, false otherwise
     */
    boolean moveTetromino(int deltaRow, int deltaCol);

    /**
     * Rotate the falling tetromino clockwise.
     * 
     * @return the new rotated tetromino
     */
    Tetromino rotateTetromino();

    /**
     * Drops the falling tetromino to the bottom of the board.
     */
    void dropTetromino();

    /**
     * Get the current game state.
     * 
     * @return the current game state
     */
    GameState getGameState();

}
