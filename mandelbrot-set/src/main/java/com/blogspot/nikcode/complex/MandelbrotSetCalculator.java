package com.blogspot.nikcode.complex;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nik
 */
public final class MandelbrotSetCalculator {
    
    private static final int ITERATIONS_COUNT = 40;
    private static final int BOUND_RADIUS_SQUARE = 2 * 2;

    private MandelbrotSetCalculator() {
    }

    public static boolean isConvergence(ComplexNumber startNumber) {
        ComplexNumber prevResult = new ComplexNumber(0, 0);
        for (int i = 0; i < ITERATIONS_COUNT; i++) {
            prevResult = prevResult.getSquare().add(startNumber);
            float resultAbs = prevResult.getReal() * prevResult.getReal() 
                    + prevResult.getImaginary() * prevResult.getImaginary();
            if (resultAbs > BOUND_RADIUS_SQUARE) {
                return false;
            }
        }
        return true;
    }
    
    public static Set<ComplexNumber> computeSet(float realAxisStart, float realAxisStop, float iAxisStart, 
            float iAxisStop, float realAxisStep, float iAxisStep) {
        Set<ComplexNumber> mandelbrotSet = new HashSet<>();
        for (float r = realAxisStart; r <= realAxisStop; r += realAxisStep) {
            for (float i = iAxisStart; i <= iAxisStop; i+= iAxisStep) {
                ComplexNumber numberToCheck = new ComplexNumber(r, i);
                if (isConvergence(numberToCheck)) {
                    mandelbrotSet.add(numberToCheck);
                }
            }
        }
        return mandelbrotSet;
    }
}
