package no.uib.inf101.tetris.controller;

import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

import no.uib.inf101.tetris.midi.TetrisSong;
import no.uib.inf101.tetris.model.GameState;
import no.uib.inf101.tetris.view.TetrisView;

/**
 * The controller for the tetris game
 *
 */
public class TetrisController implements java.awt.event.KeyListener {

    ControllableTetrisModel model;
    TetrisView view;
    Timer timer;
    TetrisSong song;

    public TetrisController(ControllableTetrisModel model, TetrisView view) {
        this.model = model;
        this.view = view;
        this.view.addKeyListener(this);
        this.view.setFocusable(true);
        this.timer = new Timer(model.getTimerInterval(), this::clockTick);
        this.song = new TetrisSong();
        timer.start();

        this.song.run();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (!(this.model.getGameState() == GameState.GAME_OVER)) {

            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                this.model.moveTetromino(0, -1);
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                this.model.moveTetromino(0, 1);
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                this.model.moveTetromino(1, 0);
                if (this.model.moveTetromino(1, 0) == true) {
                    timer.restart();
                }
            } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                this.model.rotateTetromino();
            } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                this.model.dropTetromino();
                timer.restart();
            } else if (e.getKeyCode() == KeyEvent.VK_P) {
                GameState state = this.model.getGameState();
                if (state == GameState.ACTIVE_GAME) {
                    this.model.pauseGame();
                } else if (state == GameState.PAUSED) {
                    this.model.playGame();
                }
            } else if (e.getKeyCode() == KeyEvent.VK_M) {
                if (this.song.isRunning()) {
                    this.song.pause();
                } else {
                    this.song.doUnpauseMidiSounds();
                }
            }
        }
        this.view.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    /**
     * Event that is called when the timer ticks.
     */
    public void clockTick(ActionEvent ae) {
        this.model.clockTick();
        setTimerDelay();
        this.view.repaint();
    }

    /**
     * Sets the timer delay to the value in the model
     */
    public void setTimerDelay() {
        this.timer.setInitialDelay(this.model.getTimerInterval());
        this.timer.setDelay(this.model.getTimerInterval());
    }

}