package no.uib.inf101.tetris.view;

import java.awt.Color;

public interface ColorTheme {
    
    /**
     * Gets the color of the cell, return value cannot be null
     * 
     * @param cell the cell to get the color for
     * @return a Color object for the cell
     */
    Color getCellColor(char cell);

    /**
     * Gets the color of the frame, should not be null
     * 
     * @return a Color object
     */
    Color getFrameColor();

    /**
     * Gets the color of the background, cannot be transparent
     * 
     * @return a Color object
     */
    Color getBackgroundColor();

    /**
     * Gets the color of the game over screen.
     * 
     * @return a Color object
     */
    Color getGameOverColor();

    /**
     * Gets the color of the text on the game over screen.
     * 
     * @return a Color object
     */
    Color getGameOverTextColor();

    /**
     * Gets the color of the score text.
     * 
     * @return a Color object
     */
    Color getScoreColor();
}
