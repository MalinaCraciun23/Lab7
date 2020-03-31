/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fii.pa.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Mally
 */
public class Board {

    private final List<Token> tokens;

    public Board() {
        this.tokens = Collections.synchronizedList(new ArrayList());
    }

    public void addToken(Token token) {
        synchronized (tokens) {
            tokens.add(token);
        }
    }

    public synchronized Token extract() {
        Random random = new Random();
        int index = random.nextInt(tokens.size());
        Token token = tokens.get(index);
        tokens.remove(index);
        return token;
    }

    public boolean isEmpty() {
        return this.tokens.isEmpty();
    }

}
