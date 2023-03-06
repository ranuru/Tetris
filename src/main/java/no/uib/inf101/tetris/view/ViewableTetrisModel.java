package no.uib.inf101.tetris.view;

import no.uib.inf101.grid.GridCell;
import no.uib.inf101.grid.GridDimension;

public interface ViewableTetrisModel {

    /**
     * Gets the dimensions of the grid
     * 
     * @return a GridDimension object containing the rows and cols of the grid.
     */
    GridDimension getDimension();

    /**
     * Gets the tiles on the board
     * 
     * @return an Iterable containing GridCell-objects containing Character-objects
     */
    Iterable<GridCell<Character>> getTilesOnBoard();

    /**
     * Gets the tiles on the falling tetromino
     * 
     * @return an Iterable containing GridCell-objects containing Character-objects
     */
    Iterable<GridCell<Character>> getTilesOnFallingTetromino();
}
