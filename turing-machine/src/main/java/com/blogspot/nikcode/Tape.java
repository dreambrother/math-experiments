package com.blogspot.nikcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * User: nik
 * Date: 2/3/13
 * Time: 3:05 AM
 */
public class Tape {

    public static final Set<Character> ALLOWED_DIGITS = new HashSet<>(Arrays.asList('0', '1'));

    private final char[] tape;
    private int currentSymbol = 0;

    public Tape(char[] tape) {
        this.tape = tape;
    }

    public void next() {
        if (currentSymbol == tape.length - 1) {
            throw new IllegalStateException("Pointer links to the end of the tape");
        }
        currentSymbol++;
    }

    public void previous() {
        if (currentSymbol == 0) {
            throw new IllegalStateException("Pointer links to the start of the tape");
        }
        currentSymbol--;
    }

    public void setCurrent(char newValue) {
        if (!ALLOWED_DIGITS.contains(newValue)) {
            throw new IllegalArgumentException("Unknown symbol " + newValue);
        }
        tape[currentSymbol] = newValue;
    }

    public char getCurrent() {
        return tape[currentSymbol];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(tape.length);
        for (char c : tape) {
            sb.append(c);
        }
        return sb.toString();
    }
}
