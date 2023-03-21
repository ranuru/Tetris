package no.uib.inf101.grid;

/**
 * A record class for storing a cell position and a value.
 */
public record GridCell<E>(CellPosition pos, E value) {

}
