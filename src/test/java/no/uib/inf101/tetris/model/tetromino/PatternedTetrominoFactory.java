package no.uib.inf101.tetris.model.tetromino;

/**
 * Class that creates tetrominos in a pattern
 * 
 */

public class PatternedTetrominoFactory implements TetrominoFactory {

    String s;
    String string;

    /**
     * Create a new patterned tetromino factory
     * 
     * @param string
     *               the pattern
     */
    public PatternedTetrominoFactory(String string) {
        this.s = string;
        this.string = string;
    }

    @Override
    public Tetromino getNext() {
        Character character = s.charAt(0);
        if (s.length() == 1) {
            this.s = string;
            return Tetromino.newTetromino(character);
        }
        s = s.substring(1);
        return Tetromino.newTetromino(character);
    }

}
