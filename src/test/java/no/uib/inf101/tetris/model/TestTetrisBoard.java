package no.uib.inf101.tetris.model;

import org.junit.jupiter.api.Test;

import no.uib.inf101.grid.CellPosition;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTetrisBoard {

    public TetrisBoard getTetrisBoardWithContents(String[] s) {
        TetrisBoard board = new TetrisBoard(s.length, s[0].length());
        for (int y = 0; y < s.length; y++) {
            for (int x = 0; x < s[y].length(); x++) {
                board.set(new CellPosition(y, x), s[y].charAt(x));
            }
        }
        return board;
    }

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

    @Test
    public void testRemoveFullRows() {
        TetrisBoard board = getTetrisBoardWithContents(new String[] {
                "-T",
                "TT",
                "LT",
                "L-",
                "LL"
        });
        assertEquals(3, board.removeFullRows());
        String expected = String.join("\n", new String[] {
                "--",
                "--",
                "--",
                "-T",
                "L-"
        });
        assertEquals(expected, board.prettyString());
    }

    @Test
    public void testRemoveNotLastRow() {
        TetrisBoard board = getTetrisBoardWithContents(new String[] {
                "-T",
                "TT",
                "LT",
                "LL",
                "L-"
        });
        assertEquals(3, board.removeFullRows());
        String expected = String.join("\n", new String[] {
                "--",
                "--",
                "--",
                "-T",
                "L-"
        });
        assertEquals(expected, board.prettyString());
    }

    @Test
    public void testRemoveNotFirstRow() {
        TetrisBoard board = getTetrisBoardWithContents(new String[] {
                "T-",
                "LT",
                "LL",
                "L-",
                "-T"
        });
        assertEquals(2, board.removeFullRows());
        String expected = String.join("\n", new String[] {
                "--",
                "--",
                "T-",
                "L-",
                "-T"
        });
        assertEquals(expected, board.prettyString());
    }

    @Test
    public void testRemoveFullRowsWithDifferentWidth() {
        TetrisBoard board = getTetrisBoardWithContents(new String[] {
                "T--",
                "LTT",
                "LLT",
                "L-L",
                "-TT"
        });
        board.set(new CellPosition(0, 0), 'T');
        board.set(new CellPosition(1, 0), 'L');
        board.set(new CellPosition(1, 1), 'T');
        board.set(new CellPosition(1, 2), 'T');
        board.set(new CellPosition(2, 0), 'L');
        board.set(new CellPosition(2, 1), 'L');
        board.set(new CellPosition(2, 2), 'T');
        board.set(new CellPosition(3, 0), 'L');
        board.set(new CellPosition(3, 2), 'L');
        board.set(new CellPosition(4, 1), 'T');
        board.set(new CellPosition(4, 2), 'T');
        assertEquals(2, board.removeFullRows());
        String expected = String.join("\n", new String[] {
                "---",
                "---",
                "T--",
                "L-L",
                "-TT"
        });
        assertEquals(expected, board.prettyString());
    }
}
