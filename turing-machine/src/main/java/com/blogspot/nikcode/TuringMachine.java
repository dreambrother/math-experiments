package com.blogspot.nikcode;

import java.util.*;

/**
 * User: nik
 * Date: 2/3/13
 * Time: 2:53 AM
 */
public class TuringMachine {

    private final Map<String, String> algorithm;
    private String currentState = "0";

    public TuringMachine(Map<String, String> algorithm) {
        this.algorithm = algorithm;
    }

    public void execute(Tape tape) {
        for (String stateNum = "0";;) {
            String value = nextOperation(stateNum, tape.getCurrent());
            stateNum = getStateNum(value);
            tape.setCurrent(getSymbol(value));
            char direction = getDirection(value);
            if (direction == 'S') { // STOP command
                return;
            }
            moveTape(tape, direction);
        }
    }

    private String nextOperation(String stateNum, char currentSymbol) {
        return algorithm.get(stateNum + currentSymbol);
    }

    private String getStateNum(String value) {
        return value.substring(0, value.length() - 2);
    }

    private char getDirection(String value) {
        return value.charAt(value.length() - 1);
    }

    private char getSymbol(String value) {
        return value.charAt(value.length() - 2);
    }

    private void moveTape(Tape tape, char direction) {
        switch (direction) {
            case 'L':
                tape.previous();
                break;
            case 'R':
                tape.next();
                break;
            default:
                throw new IllegalArgumentException("Unknown direction in current context: " + direction);
        }
    }
}
