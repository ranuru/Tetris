package no.uib.inf101.tetris;

import javax.swing.JFrame;

import no.uib.inf101.grid.CellPosition;
import no.uib.inf101.tetris.controller.TetrisController;
import no.uib.inf101.tetris.model.TetrisBoard;
import no.uib.inf101.tetris.model.TetrisModel;
import no.uib.inf101.tetris.model.tetromino.RandomTetrominoFactory;
import no.uib.inf101.tetris.model.tetromino.TetrominoFactory;
import no.uib.inf101.tetris.view.TetrisView;


public class TetrisMain {
  
  public static final String WINDOW_TITLE = "INF101 Tetris";
  
  public static void main(String[] args) {
    TetrisBoard board = new TetrisBoard(15,10);
    TetrominoFactory tetrominofactory = new RandomTetrominoFactory();
    board.set((new CellPosition(0, 0)), 'g');
    board.set((new CellPosition(0, 9)), 'y');
    board.set((new CellPosition(14, 0)), 'r');
    board.set((new CellPosition(14, 9)), 'b');
    TetrisModel model = new TetrisModel(board, tetrominofactory);
    TetrisView view = new TetrisView(model);
    TetrisController controller = new TetrisController(model, view);

    // The JFrame is the "root" application window.
    // We here set som properties of the main window, 
    // and tell it to display our tetrisView
    JFrame frame = new JFrame(WINDOW_TITLE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Here we set which component to view in our window
    frame.setContentPane(view);
    
    // Call these methods to actually display the window
    frame.pack();
    frame.setVisible(true);
  }
  
}
