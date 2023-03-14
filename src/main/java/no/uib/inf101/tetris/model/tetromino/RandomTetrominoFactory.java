package no.uib.inf101.tetris.model.tetromino;

import java.util.Random;
import java.lang.Character;

/** Class that creates random tetrominos
 *  
 */
public class RandomTetrominoFactory implements TetrominoFactory {

    @Override
    public Tetromino getNext() {
        String s = "IJLOSTZ";
        Random random = new Random();
        int index = random.nextInt(s.length());
        Character character = s.charAt(index);
        return Tetromino.newTetromino(character);
    }
    
}
