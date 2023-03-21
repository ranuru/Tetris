package no.uib.inf101.tetris.controller;

import no.uib.inf101.tetris.model.GameState;

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
     * @return true if the rotation was successful, false otherwise
     */
    boolean rotateTetromino();

    /**
     * Rotate the falling tetromino counter-clockwise.
     * 
     * @return true if the rotation was successful, false otherwise
     */
    boolean rotateTetrominoCounterClockwise();

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

    /**
     * Get the milliseconds between each timer tick.
     * 
     * @return the milliseconds between each timer tick
     */
    int getTimerInterval();

    /**
     * Event that is called when the timer ticks.
     */
    void clockTick();

    /**
     * Pause the game.
     */
    void pauseGame();

    /**
     * Resume the game.
     */
    void playGame();

    /**
     * Start a new game.
     */
    void newGame();

}
