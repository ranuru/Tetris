package no.uib.inf101.grid;

/**
 * A record class for storing a cell position.
 */
public record GridCell<E>(CellPosition pos, E value) {

}
