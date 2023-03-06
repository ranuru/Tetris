package no.uib.inf101.tetris.model.tetromino;

public interface TetrominoFactory {

    /**
     * Get the next tetromino
     * 
     * @return the next tetromino
     */
    public Tetromino getNext();
}
