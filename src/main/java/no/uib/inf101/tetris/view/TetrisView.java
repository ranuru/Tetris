package no.uib.inf101.tetris.view;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;


public class TetrisView extends JPanel {

    ViewableTetrisModel model; 
    
    // Constructor
  public TetrisView(ViewableTetrisModel model) {
    this.model = model;
    this.setFocusable(true);
    this.setPreferredSize(new Dimension(300, 400));
  }
  
  // The paintComponent method is called by the Java Swing framework every time
  // either the window opens or resizes, or we call .repaint() on this object. 
  // Note: NEVER call paintComponent directly yourself
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
  }
}

  