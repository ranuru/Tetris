package no.uib.inf101.tetris.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import no.uib.inf101.grid.CellPosition;
import no.uib.inf101.grid.GridCell;
import no.uib.inf101.tetris.model.tetromino.PatternedTetrominoFactory;
import no.uib.inf101.tetris.model.tetromino.TetrominoFactory;
import no.uib.inf101.tetris.view.ViewableTetrisModel;

public class TestTetrisModel {

    @Test
    public void initialPositionOfO() {
        TetrisBoard board = new TetrisBoard(20, 10);
        TetrominoFactory factory = new PatternedTetrominoFactory("O");
        ViewableTetrisModel model = new TetrisModel(board, factory);

        List<GridCell<Character>> tetroCells = new ArrayList<>();
        for (GridCell<Character> gc : model.getTilesOnFallingTetromino()) {
            tetroCells.add(gc);
        }

        assertEquals(4, tetroCells.size());
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 4), 'O')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 5), 'O')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(1, 4), 'O')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(1, 5), 'O')));
    }

    @Test
    public void initialPositionOfI() {
        TetrisBoard board = new TetrisBoard(20, 10);
        TetrominoFactory factory = new PatternedTetrominoFactory("I");
        ViewableTetrisModel model = new TetrisModel(board, factory);

        List<GridCell<Character>> tetroCells = new ArrayList<>();
        for (GridCell<Character> gc : model.getTilesOnFallingTetromino()) {
            tetroCells.add(gc);
        }

        assertEquals(4, tetroCells.size());
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 3), 'I')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 4), 'I')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 5), 'I')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 6), 'I')));
    }

    @Test
    public void initialPositionOfS() {
        TetrisBoard board = new TetrisBoard(20, 10);
        TetrominoFactory factory = new PatternedTetrominoFactory("S");
        ViewableTetrisModel model = new TetrisModel(board, factory);

        List<GridCell<Character>> tetroCells = new ArrayList<>();
        for (GridCell<Character> gc : model.getTilesOnFallingTetromino()) {
            tetroCells.add(gc);
        }

        assertEquals(4, tetroCells.size());
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 4), 'S')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 5), 'S')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(1, 4), 'S')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(1, 3), 'S')));
    }

    @Test
    public void initialPositionOfZ() {
        TetrisBoard board = new TetrisBoard(20, 10);
        TetrominoFactory factory = new PatternedTetrominoFactory("Z");
        ViewableTetrisModel model = new TetrisModel(board, factory);

        List<GridCell<Character>> tetroCells = new ArrayList<>();
        for (GridCell<Character> gc : model.getTilesOnFallingTetromino()) {
            tetroCells.add(gc);
        }

        assertEquals(4, tetroCells.size());
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 3), 'Z')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 4), 'Z')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(1, 4), 'Z')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(1, 5), 'Z')));
    }

    @Test
    public void initialPositionOfJ() {
        TetrisBoard board = new TetrisBoard(20, 10);
        TetrominoFactory factory = new PatternedTetrominoFactory("J");
        ViewableTetrisModel model = new TetrisModel(board, factory);

        List<GridCell<Character>> tetroCells = new ArrayList<>();
        for (GridCell<Character> gc : model.getTilesOnFallingTetromino()) {
            tetroCells.add(gc);
        }

        assertEquals(4, tetroCells.size());
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 3), 'J')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 4), 'J')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 5), 'J')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(1, 5), 'J')));
    }

    @Test
    public void initialPositionOfL() {
        TetrisBoard board = new TetrisBoard(20, 10);
        TetrominoFactory factory = new PatternedTetrominoFactory("L");
        ViewableTetrisModel model = new TetrisModel(board, factory);

        List<GridCell<Character>> tetroCells = new ArrayList<>();
        for (GridCell<Character> gc : model.getTilesOnFallingTetromino()) {
            tetroCells.add(gc);
        }

        assertEquals(4, tetroCells.size());
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 3), 'L')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 4), 'L')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 5), 'L')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(1, 3), 'L')));
    }

    @Test
    public void initialPositionOfT() {
        TetrisBoard board = new TetrisBoard(20, 10);
        TetrominoFactory factory = new PatternedTetrominoFactory("T");
        ViewableTetrisModel model = new TetrisModel(board, factory);

        List<GridCell<Character>> tetroCells = new ArrayList<>();
        for (GridCell<Character> gc : model.getTilesOnFallingTetromino()) {
            tetroCells.add(gc);
        }

        assertEquals(4, tetroCells.size());
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 3), 'T')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 4), 'T')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 5), 'T')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(1, 4), 'T')));
    }

    @Test
    public void testMoveTetrominoReturnsTrueOrFalse() {
        TetrisBoard board = new TetrisBoard(20, 10);
        TetrominoFactory factory = new PatternedTetrominoFactory("T");
        ViewableTetrisModel model = new TetrisModel(board, factory);

        // checks if moveTetromino returns true if move is legal
        assertTrue(((TetrisModel) model).moveTetromino(10, 0));
        // checks if movetetromino returns false if move is illegal
        assertFalse(((TetrisModel) model).moveTetromino(15, 14));
    }

    @Test
    public void testMoveTetrominoIterator() {
        TetrisBoard board = new TetrisBoard(20, 10);
        TetrominoFactory factory = new PatternedTetrominoFactory("T");
        ViewableTetrisModel model = new TetrisModel(board, factory);

        List<GridCell<Character>> tetroCells = new ArrayList<>();
        for (GridCell<Character> gc : model.getTilesOnFallingTetromino()) {
            tetroCells.add(gc);
        }
        assertEquals(4, tetroCells.size());
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 5), 'T')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 4), 'T')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 5), 'T')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(1, 4), 'T')));

        ViewableTetrisModel model2 = new TetrisModel(board, factory);
        // moves the second tetronimo 10 rows down
        ((TetrisModel) model2).moveTetromino(10, 0);

        List<GridCell<Character>> tetroCells2 = new ArrayList<>();
        for (GridCell<Character> gc : model2.getTilesOnFallingTetromino()) {
            tetroCells2.add(gc);
        }
        assertEquals(4, tetroCells2.size());
        assertTrue(tetroCells2.contains(new GridCell<>(new CellPosition(10, 5), 'T')));
        assertTrue(tetroCells2.contains(new GridCell<>(new CellPosition(10, 4), 'T')));
        assertTrue(tetroCells2.contains(new GridCell<>(new CellPosition(10, 5), 'T')));
        assertTrue(tetroCells2.contains(new GridCell<>(new CellPosition(11, 4), 'T')));

        assertNotEquals(tetroCells, tetroCells2);
    }

    @Test
    public void testMoveTetrominoToOccupiedPos() {
        TetrisBoard board = new TetrisBoard(20, 10);
        TetrominoFactory factory = new PatternedTetrominoFactory("T");
        ViewableTetrisModel model = new TetrisModel(board, factory);
        ViewableTetrisModel model2 = new TetrisModel(board, factory);
        board.set((new CellPosition(10, 4)), 'g');
        board.set((new CellPosition(10, 5)), 'y');
        board.set((new CellPosition(11, 4)), 'r');
        board.set((new CellPosition(11, 5)), 'b');
        assertFalse(((TetrisModel) model).moveTetromino(10, 0));

        List<GridCell<Character>> tetroCells = new ArrayList<>();
        for (GridCell<Character> gc : model.getTilesOnFallingTetromino()) {
            tetroCells.add(gc);
        }
        ((TetrisModel) model).moveTetromino(20, 0);

        List<GridCell<Character>> tetroCells2 = new ArrayList<>();
        for (GridCell<Character> gc : model2.getTilesOnFallingTetromino()) {
            tetroCells2.add(gc);
        }
        assertEquals(tetroCells, tetroCells2);
    }

    @Test
    public void testRotateTetromino() {
        TetrisBoard board = new TetrisBoard(20, 10);
        TetrominoFactory factory = new PatternedTetrominoFactory("T");
        ViewableTetrisModel model = new TetrisModel(board, factory);
        ((TetrisModel) model).moveTetromino(10, 0);
        ((TetrisModel) model).rotateTetromino();
        List<GridCell<Character>> tetroCells = new ArrayList<>();
        for (GridCell<Character> gc : model.getTilesOnFallingTetromino()) {
            tetroCells.add(gc);
        }
        assertEquals(4, tetroCells.size());
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(9, 5), 'T')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(10, 5), 'T')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(10, 4), 'T')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(11, 5), 'T')));
    }

    @Test
    public void testDropTetromino() {
        TetrisBoard board = new TetrisBoard(20, 10);
        TetrominoFactory factory = new PatternedTetrominoFactory("O");
        ViewableTetrisModel model = new TetrisModel(board, factory);
        ((TetrisModel) model).dropTetromino();
        List<GridCell<Character>> boardCells = new ArrayList<>();
        for (GridCell<Character> gc : model.getTilesOnBoard()) {
            boardCells.add(gc);
        }
        assertEquals(200, boardCells.size());
        assertTrue(boardCells.contains(new GridCell<>(new CellPosition(19, 5), 'O')));
        assertTrue(boardCells.contains(new GridCell<>(new CellPosition(19, 4), 'O')));
        assertTrue(boardCells.contains(new GridCell<>(new CellPosition(18, 5), 'O')));
        assertTrue(boardCells.contains(new GridCell<>(new CellPosition(18, 4), 'O')));
    }

    @Test
    public void testClockTick() {
        TetrisBoard board = new TetrisBoard(20, 10);
        TetrominoFactory factory = new PatternedTetrominoFactory("O");
        ViewableTetrisModel model = new TetrisModel(board, factory);
        ((TetrisModel) model).clockTick();
        ((TetrisModel) model).clockTick();
        ((TetrisModel) model).clockTick();
        List<GridCell<Character>> tetroCells = new ArrayList<>();
        for (GridCell<Character> gc : model.getTilesOnFallingTetromino()) {
            tetroCells.add(gc);
        }
        assertEquals(4, tetroCells.size());
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(3, 5), 'O')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(3, 4), 'O')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(4, 5), 'O')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(4, 4), 'O')));

    }
}
