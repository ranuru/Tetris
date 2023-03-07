package no.uib.inf101.tetris.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 3), 'S')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(0, 4), 'S')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(1, 4), 'S')));
        assertTrue(tetroCells.contains(new GridCell<>(new CellPosition(1, 5), 'S')));
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
}
