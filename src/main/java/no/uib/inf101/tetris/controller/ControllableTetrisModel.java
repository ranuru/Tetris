package no.uib.inf101.tetris.controller;

public interface ControllableTetrisModel {
    

    /**
     * Move the falling tetromino one step.
     * 
     * @return true if the move was successful, false otherwise
     */
    boolean moveTetromino(int deltaRow, int deltaCol);

}
