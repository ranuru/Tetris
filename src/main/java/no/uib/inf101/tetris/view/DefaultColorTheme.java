package no.uib.inf101.tetris.view;

import java.awt.Color;

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
        Color color = Color.GRAY;
        return color;
    }

    @Override
    public Color getBackgroundColor() {
        Color color = Color.BLACK;
        return color;
    }
}
