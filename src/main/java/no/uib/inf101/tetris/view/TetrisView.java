package no.uib.inf101.tetris.view;

import javax.swing.JPanel;

import no.uib.inf101.grid.CellPosition;
import no.uib.inf101.grid.GridCell;
import no.uib.inf101.grid.GridDimension;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Dimension;

public class TetrisView extends JPanel {

    private ViewableTetrisModel model;
    private ColorTheme colorTheme;
    private static final double OUTERMARGIN = 30;
    private static final double INNERMARGIN = 2;
    private static final double SQUARESIZE = 30; 
    private double width;
    private double height;          
    
    // Constructor
    public TetrisView(ViewableTetrisModel model) {
        this.model = model;
        this.setFocusable(true);
        this.width = (SQUARESIZE + INNERMARGIN) * model.getDimension().cols() + INNERMARGIN + OUTERMARGIN;                        
        this.height = (SQUARESIZE + INNERMARGIN) * model.getDimension().rows() + INNERMARGIN + OUTERMARGIN;        
        this.setPreferredSize(new Dimension((int)width, (int)height));
        this.colorTheme = new DefaultColorTheme();
        this.setBackground(getBackground());
    }

    // The paintComponent method is called by the Java Swing framework every time
    // either the window opens or resizes, or we call .repaint() on this object.
    // Note: NEVER call paintComponent directly yourself
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    drawGame(g2);
  }

    public static void drawCells(Graphics2D canvas, Iterable<GridCell<Character>> cells,
            CellPositionToPixelConverter cellPositionToPixelConverter, ColorTheme theme) {
        for (GridCell<Character> cell : cells) {
            Character value = cell.value();
            CellPosition pos = cell.pos();
            Rectangle2D r = cellPositionToPixelConverter.getBoundsForCell(pos);
            Color color = theme.getCellColor(value);

            canvas.setColor(color);
            canvas.fill(r);
        }
    }

    public void drawGame(Graphics2D g) {
        double x = OUTERMARGIN;
        double y = OUTERMARGIN;
        double width = this.getWidth() - (2 * OUTERMARGIN);
        double height = this.getHeight() - (2 * OUTERMARGIN);
        g.setColor(colorTheme.getFrameColor());
        g.fill(new Rectangle2D.Double(x, y , width, height));
        Rectangle2D r = new Rectangle2D.Double(x, y, width, height);
        GridDimension gd = model.getDimension();
        Iterable<GridCell<Character>> fallingTetromino = model.getTilesOnFallingTetromino();
        Iterable<GridCell<Character>> cells = model.getTilesOnBoard();
        CellPositionToPixelConverter cellPositionToPixelConverter = new CellPositionToPixelConverter(r, gd, INNERMARGIN);
        drawCells(g, cells, cellPositionToPixelConverter, colorTheme);
        drawCells(g, fallingTetromino, cellPositionToPixelConverter, colorTheme);



    }
}

