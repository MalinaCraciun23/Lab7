/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fii.pa.lab7;

/**
 *
 * @author Mally
 */
public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Board board = new Board();
        board.addToken(new Token(3));
        board.addToken(new Token(6));
        board.addToken(new Token(9));
        board.addToken(new Token(12));
        board.addToken(new Token(15));
        board.addToken(new Token(18));
        board.addToken(new Token(21));
        game.setBoard(board);
        game.addPlayer(new Player("1"));
        game.addPlayer(new Player("2"));
        game.addPlayer(new Player("3"));
        game.addPlayer(new Player("4"));
        game.addPlayer(new Player("5"));
        game.start();
    }

}
