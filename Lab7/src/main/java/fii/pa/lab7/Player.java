/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fii.pa.lab7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mally
 */
public class Player implements Runnable {

    private String name;
    private Game game;
    List<Token> tokens = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    private boolean completeArithmeticProgression() {
        return false;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    private boolean play() throws InterruptedException {
        Board board = game.getBoard();
        if (!board.isEmpty()) {
            tokens.add(board.extract());
            if (this.completeArithmeticProgression()) {
                game.setWinner(this);
            }
            return true;
        }
        return false;
    }

    @Override
    public void run() {
        try {
            while (this.play()) {
                System.out.println(this);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Player " + name;
    }

}
