package no.uib.inf101.tetris.view;

import javax.swing.JPanel;

import no.uib.inf101.grid.CellPosition;
import no.uib.inf101.grid.GridCell;
import no.uib.inf101.grid.GridDimension;
import no.uib.inf101.tetris.model.GameState;
import no.uib.inf101.tetris.model.TetrisModel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

/**
 * A view of a Tetris game. This class is responsible for drawing the game.
 *
 */
public class TetrisView extends JPanel {

    private ViewableTetrisModel model;
    private ColorTheme colorTheme;
    private static final double OUTERMARGIN = 30;
    private static final double INNERMARGIN = 2;
    private static final double SQUARESIZE = 30;
    private double width;
    private double height;

    /**
     * Creates a new TetrisView
     * 
     * @param model the model to view
     */
    public TetrisView(ViewableTetrisModel model) {
        this.model = model;
        this.setFocusable(true);
        this.width = (SQUARESIZE + INNERMARGIN) * model.getDimension().cols() + INNERMARGIN + OUTERMARGIN;
        this.height = (SQUARESIZE + INNERMARGIN) * model.getDimension().rows() + INNERMARGIN + OUTERMARGIN;
        this.setPreferredSize(new Dimension((int) width, (int) height));
        this.colorTheme = new DefaultColorTheme();
        this.setBackground(getBackground());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        drawGame(g2);
    }

    /**
     * Draws the cells in the given Iterable
     * 
     * @param g2                           the Graphics2D object to draw on
     * @param cells                        the Iterable containing the cells to draw
     * @param cellPositionToPixelConverter the CellPositionToPixelConverter object
     *                                     to use
     * @param theme                        the ColorTheme object to use
     */
    public static void drawCells(Graphics2D g2, Iterable<GridCell<Character>> cells,
            CellPositionToPixelConverter cellPositionToPixelConverter, ColorTheme theme) {
        for (GridCell<Character> cell : cells) {
            Character value = cell.value();
            CellPosition pos = cell.pos();
            Rectangle2D r = cellPositionToPixelConverter.getBoundsForCell(pos);
            Color color = theme.getCellColor(value);

            g2.setColor(color);
            g2.fill(r);
        }
    }

    /**
     * Draws the game
     * 
     * @param g2 the Graphics2D object to draw on
     */
    public void drawGame(Graphics2D g2) {

        // variables for the board
        double x = OUTERMARGIN;
        double y = OUTERMARGIN;
        double width = this.getWidth() - (2 * OUTERMARGIN);
        double height = this.getHeight() - (2 * OUTERMARGIN);

        Rectangle2D tileRectangle = new Rectangle2D.Double(x, y, width, height);
        g2.setColor(colorTheme.getFrameColor());
        g2.fill(tileRectangle);

        GridDimension gd = model.getDimension();

        Iterable<GridCell<Character>> fallingTetromino = model.getTilesOnFallingTetromino();
        Iterable<GridCell<Character>> cells = model.getTilesOnBoard();
        CellPositionToPixelConverter cellPositionToPixelConverter = new CellPositionToPixelConverter(tileRectangle, gd,
                INNERMARGIN);

        if (model.getGameState() == GameState.ACTIVE_GAME) {

            // draws the background and falling tetromino
            drawCells(g2, cells, cellPositionToPixelConverter, colorTheme);
            drawCells(g2, fallingTetromino, cellPositionToPixelConverter, colorTheme);

            // draws the score during the game
            g2.setColor(colorTheme.getScoreColor());
            g2.setFont(new Font("Arial", Font.BOLD, 20));
            Inf101Graphics.drawCenteredString(g2, "SCORE: " + ((TetrisModel) this.model).getPoints(),
                    tileRectangle.getX(),
                    tileRectangle.getY(), width, height * 2.05);

        }

        if (model.getGameState() == GameState.PAUSED) {

            // draws a transparent background over the game and the falling tetromino
            g2.setColor(colorTheme.getPausedColor());
            g2.fill(tileRectangle);
            drawCells(g2, cells, cellPositionToPixelConverter, colorTheme);
            drawCells(g2, fallingTetromino, cellPositionToPixelConverter, colorTheme);

            // draws the paused text
            g2.setColor(colorTheme.getPausedTextColor());
            g2.setFont(new Font("Arial", Font.BOLD, 40));
            Inf101Graphics.drawCenteredString(g2, "PAUSED", tileRectangle);

            // draws the paused score
            g2.setColor(colorTheme.getPausedTextColor());
            g2.setFont(new Font("Arial", Font.BOLD, 20));
            Inf101Graphics.drawCenteredString(
                    g2, "SCORE " + (this.model).getPoints(), tileRectangle.getX(), tileRectangle.getY(), width,
                    height * 1.2);
        }

        if (model.getGameState() == GameState.GAME_OVER) {

            // draws a transparent background over the game
            g2.setColor(colorTheme.getGameOverColor());
            g2.fill(tileRectangle);
            drawCells(g2, cells, cellPositionToPixelConverter, colorTheme);

            // draws the game over text
            g2.setColor(colorTheme.getGameOverTextColor());
            g2.setFont(new Font("Arial", Font.BOLD, 40));
            Inf101Graphics.drawCenteredString(g2, "GAME OVER", tileRectangle);

            // draws the game over score
            g2.setColor(colorTheme.getGameOverTextColor());
            g2.setFont(new Font("Arial", Font.BOLD, 20));
            Inf101Graphics.drawCenteredString(
                    g2, "SCORE " + (this.model).getPoints(), tileRectangle.getX(), tileRectangle.getY(), width,
                    height * 1.2);

            // draws the play again text
            g2.setColor(colorTheme.getGameOverTextColor());
            g2.setFont(new Font("Arial", Font.BOLD, 20));
            Inf101Graphics.drawCenteredString(
                    g2, "PRESS ENTER TO PLAY AGAIN", tileRectangle.getX(), tileRectangle.getY(), width,
                    height * 1.4);
        }

        if (model.getGameState() == GameState.NEW_GAME) {

            // draws a transparent background over the game
            g2.setColor(colorTheme.getNewGameColor());
            g2.fill(tileRectangle);
            drawCells(g2, cells, cellPositionToPixelConverter, colorTheme);

            // draws the new game text
            g2.setColor(colorTheme.getNewGameTextColor());
            g2.setFont(new Font("Arial", Font.BOLD, 40));
            Inf101Graphics.drawCenteredString(g2, "NEW GAME", tileRectangle);

            // draws the play game text
            g2.setColor(colorTheme.getNewGameTextColor());
            g2.setFont(new Font("Arial", Font.BOLD, 20));
            Inf101Graphics.drawCenteredString(
                    g2, "PRESS ENTER TO PLAY", tileRectangle.getX(), tileRectangle.getY(), width,
                    height * 1.2);

        }
    }
}
