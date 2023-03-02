package no.uib.inf101.tetris;

import org.junit.jupiter.api.Test;

import no.uib.inf101.grid.CellPosition;
import no.uib.inf101.tetris.model.TetrisBoard;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTetrisBoard {

    @Test
    public void testPrettyString() {
        TetrisBoard board = new TetrisBoard(3, 4);
        board.set(new CellPosition(0, 0), 'g');
        board.set(new CellPosition(0, 3), 'y');
        board.set(new CellPosition(2, 0), 'r');
        board.set(new CellPosition(2, 3), 'b');
        String expected = String.join("\n", new String[] {
                "g--y",
                "----",
                "r--b"
        });
        assertEquals(expected, board.prettyString());
    }

}
