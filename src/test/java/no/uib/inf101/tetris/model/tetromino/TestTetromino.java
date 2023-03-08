package no.uib.inf101.tetris.model.tetromino;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import no.uib.inf101.grid.CellPosition;
import no.uib.inf101.grid.Grid;
import no.uib.inf101.grid.GridCell;

public class TestTetromino {

    @Test
    public void testHashCodeAndEquals() {
        Tetromino t1 = Tetromino.newTetromino('T');
        Tetromino t2 = Tetromino.newTetromino('T');
        Tetromino t3 = Tetromino.newTetromino('T').shiftedBy(1, 0);
        Tetromino s1 = Tetromino.newTetromino('S');
        Tetromino s2 = Tetromino.newTetromino('S').shiftedBy(0, 0);

        assertEquals(t1, t2);
        assertEquals(s1, s2);
        assertEquals(t1.hashCode(), t2.hashCode());
        assertEquals(s1.hashCode(), s2.hashCode());
        assertNotEquals(t1, t3);
        assertNotEquals(t1, s1);
    }

    @Test
    public void tetrominoIterationOfT() {
        // Create a standard 'T' tetromino placed at (10, 100) to test
        Tetromino tetro = Tetromino.newTetromino('T');
        tetro = tetro.shiftedBy(10, 100);

        // Collect which objects are iterated through
        List<GridCell<Character>> objs = new ArrayList<>();
        for (GridCell<Character> gc : tetro) {
            objs.add(gc);
        }

        // Check that we got the expected GridCell objects
        assertEquals(4, objs.size());
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 100), 'T')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 101), 'T')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 102), 'T')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(12, 101), 'T')));
    }

    @Test
    public void tetrominoIterationOfS() {
        // Create a standard 'S' tetromino placed at (10, 100) to test
        Tetromino tetro = Tetromino.newTetromino('S');
        tetro = tetro.shiftedBy(10, 100);

        // Collect which objects are iterated through
        List<GridCell<Character>> objs = new ArrayList<>();
        for (GridCell<Character> gc : tetro) {
            objs.add(gc);
        }

        // Check that we got the expected GridCell objects
        assertEquals(4, objs.size());
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 101), 'S')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 102), 'S')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(12, 100), 'S')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(12, 101), 'S')));
    }

    @Test
    public void tetrominoIterationOfL() {
        // Create a standard 'L' tetromino placed at (10, 100) to test
        Tetromino tetro = Tetromino.newTetromino('L');
        tetro = tetro.shiftedBy(10, 100);

        // Collect which objects are iterated through
        List<GridCell<Character>> objs = new ArrayList<>();
        for (GridCell<Character> gc : tetro) {
            objs.add(gc);
        }
        
        // Check that we got the expected GridCell objects
        assertEquals(4, objs.size());
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 100), 'L')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 101), 'L')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 102), 'L')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(12, 100), 'L')));
    }

    @Test
    public void tetrominoIteratioOfJ() {
        // Create a standard 'J' tetromino placed at (10, 100) to test
        Tetromino tetro = Tetromino.newTetromino('J');
        tetro = tetro.shiftedBy(10, 100);

        // Collect which objects are iterated through
        List<GridCell<Character>> objs = new ArrayList<>();
        for (GridCell<Character> gc : tetro) {
            objs.add(gc);
        }

        // Check that we got the expected GridCell objects
        assertEquals(4, objs.size());
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 100), 'J')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 101), 'J')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 102), 'J')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(12, 102), 'J')));
    }

    @Test
    public void tetrominoIterationOfI() {
        // Create a standard 'I' tetromino placed at (10, 100) to test
        Tetromino tetro = Tetromino.newTetromino('I');
        tetro = tetro.shiftedBy(10, 100);

        // Collect which objects are iterated through
        List<GridCell<Character>> objs = new ArrayList<>();
        for (GridCell<Character> gc : tetro) {
            objs.add(gc);
        }

        // Check that we got the expected GridCell objects
        assertEquals(4, objs.size());
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 100), 'I')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 101), 'I')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 102), 'I')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 103), 'I')));
    }

    @Test
    public void tetrominoIterationOfO() {
        // Create a standard 'O' tetromino placed at (10, 100) to test
        Tetromino tetro = Tetromino.newTetromino('O');
        tetro = tetro.shiftedBy(10, 100);

        // Collect which objects are iterated through
        List<GridCell<Character>> objs = new ArrayList<>();
        for (GridCell<Character> gc : tetro) {
            objs.add(gc);
        }

        // Check that we got the expected GridCell objects
        assertEquals(4, objs.size());
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 102), 'O')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 101), 'O')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(12, 102), 'O')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(12, 101), 'O')));
    }

    @Test
    public void tetrominoIterationOfZ() {
        // Create a standard 'Z' tetromino placed at (10, 100) to test
        Tetromino tetro = Tetromino.newTetromino('Z');
        tetro = tetro.shiftedBy(10, 100);

        // Collect which objects are iterated through
        List<GridCell<Character>> objs = new ArrayList<>();
        for (GridCell<Character> gc : tetro) {
            objs.add(gc);
        }

        // Check that we got the expected GridCell objects
        assertEquals(4, objs.size());
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 100), 'Z')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(11, 101), 'Z')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(12, 101), 'Z')));
        assertTrue(objs.contains(new GridCell<>(new CellPosition(12, 102), 'Z')));
    }

    @Test
    public void testShiftedBy() {
        Tetromino tetro = Tetromino.newTetromino('S');
        Tetromino tetro2 = Tetromino.newTetromino('S');
        tetro = tetro.shiftedBy(10, 10);
        tetro = tetro.shiftedBy(10, 10);
        tetro2 = tetro2.shiftedBy(20, 20);
        assertEquals(tetro, tetro2);
    }

    @Test
    public void testShiftedToTopCenterOf() {
        Tetromino tetro = Tetromino.newTetromino('S');
        Tetromino tetro2 = Tetromino.newTetromino('O');
        Grid<Character> grid = new Grid<Character>(10, 101);
        Grid<Character> grid2 = new Grid<Character>(10,100);
        tetro = tetro.shiftedToTopCenterOf(grid);
        tetro2 = tetro.shiftedToTopCenterOf(grid2);
        assertEquals(tetro, tetro2);
    }

    @Test
    public void testRotateTetromino() {
        Tetromino tetro = Tetromino.newTetromino('S');
        Tetromino tetro2 = Tetromino.newTetromino('S');
        tetro = tetro.rotate();
        tetro = tetro.rotate();
        tetro2 = tetro2.rotate();
        tetro2 = tetro2.rotate();
        assertEquals(tetro, tetro2);
    }
}
