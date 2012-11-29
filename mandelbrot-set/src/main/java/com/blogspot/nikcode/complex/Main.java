package com.blogspot.nikcode.complex;

import com.blogspot.nikcode.complex.ui.MandelbrotSetFrame;
import java.util.Set;
import javax.swing.JFrame;

/**
 *
 * @author nik
 */
public class Main {

    public static void main(String[] args) {
        final Set<ComplexNumber> mandelbrotSet = MandelbrotSetCalculator.computeSet(-2, 1, -1, 1, 0.01, 0.01);
        JFrame jFrame = new MandelbrotSetFrame(mandelbrotSet);
        jFrame.setVisible(true);
    }
}
