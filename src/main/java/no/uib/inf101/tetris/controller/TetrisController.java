package no.uib.inf101.tetris.controller;

import java.awt.event.KeyEvent;

import no.uib.inf101.tetris.view.TetrisView;

public class TetrisController implements java.awt.event.KeyListener {

    ControllableTetrisModel model;
    TetrisView view;
    
    public TetrisController(ControllableTetrisModel model, TetrisView view) {
        this.model = model;
        this.view = view;
        this.view.addKeyListener(this);
        this.view.setFocusable(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.model.moveTetromino(0, -1); 
        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.model.moveTetromino(0, 1);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.model.moveTetromino(1, 0);
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.model.moveTetromino(-1, 0);
        }
        else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            this.model.moveTetromino(1, 0);
        }       
        this.view.repaint(); 
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
