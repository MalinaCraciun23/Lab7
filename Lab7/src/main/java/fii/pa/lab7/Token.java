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
public class Token {

    private int number;

    public Token() {

    }

    public Token(int number) {
        this.number = number;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isBlank() {
        return this.number == 0;
    }

}
