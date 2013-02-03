package com.blogspot.nikcode.turing;

import com.blogspot.nikcode.Tape;
import com.blogspot.nikcode.TuringMachine;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * User: nik
 * Date: 2/3/13
 * Time: 2:50 AM
 */
public class TuringMachineTest {

    @Test
    public void testDoubleUnaryNumber() {
        Map<String, String> algorithm = new HashMap<String, String>() {
            {
                put("00", "00R");
                put("01", "10R");
                put("10", "101L");
                put("11", "11R");
                put("100", "110R");
                put("101", "1000R");
                put("110", "01S");
                put("111", "111R");
                put("1000", "1011L");
                put("1001", "1001R");
                put("1010", "101L");
                put("1011", "1011L");
            }
        };
        TuringMachine turingMachine = new TuringMachine(algorithm);
        Tape tape = new Tape("0000111100000000".toCharArray());
        turingMachine.execute(tape);

        Assert.assertEquals("11111111", tape.toString().replaceAll("0", ""));
    }
}
