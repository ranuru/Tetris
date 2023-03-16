package no.uib.inf101.tetris.view;

import java.awt.Color;

/**
 * A default color theme for the game.
 */
public class DefaultColorTheme implements ColorTheme {

    @Override
    public Color getCellColor(char cell) {
        if (cell == '\0') {
            throw new IllegalArgumentException(
                    "Argument cannot be null");
        }
        Color color = switch (cell) {
            // colors for the grid cells
            case 'r' -> Color.RED;
            case 'b' -> Color.BLUE;
            case 'y' -> Color.YELLOW;
            case 'g' -> Color.GREEN;
            case 'p' -> Color.PINK;
            case 'm' -> Color.MAGENTA;
            case 'c' -> Color.CYAN;
            case 'o' -> Color.ORANGE;

            // colors for the tetrominos
            case 'L' -> Color.RED;
            case 'J' -> Color.BLUE;
            case 'S' -> Color.YELLOW;
            case 'Z' -> Color.GREEN;
            case 'I' -> Color.PINK;
            case 'O' -> Color.MAGENTA;
            case 'T' -> Color.CYAN;

            case '-' -> Color.BLACK;

            default -> throw new IllegalArgumentException(
                    "No available color for '" + cell + "'");
        };
        return color;
    }

    @Override
    public Color getFrameColor() {
        Color color = Color.WHITE;
        return color;
    }

    @Override
    public Color getBackgroundColor() {
        Color color = Color.BLACK;
        return color;
    }

    @Override
    public Color getGameOverColor() {
        Color color = new Color(0, 0, 0, 200);
        return color;
    }

    @Override
    public Color getGameOverTextColor() {
        Color color = Color.WHITE;
        return color;
    }

    @Override
    public Color getScoreColor() {
        Color color = Color.BLACK;
        return color;
    }

    @Override
    public Color getPausedTextColor() {
        Color color = Color.WHITE;
        return color;
    }

    @Override
    public Color getPausedColor() {
        Color color = new Color(0, 0, 0, 200);
        return color;
    }

    @Override
    public Color getNewGameTextColor() {
        Color color = Color.WHITE;
        return color;
    }

    @Override
    public Color getNewGameColor() {
        Color color = new Color(0, 0, 0, 200);
        return color;
    }
}
