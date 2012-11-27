package com.blogspot.nikcode.complex;

/**
 *
 * @author nik
 */
public final class MandelbrotCalculator {
    
    private static final int ITERATIONS_COUNT = 40;
    private static final int BOUND_RADIUS_SQUARE = 4;

    private MandelbrotCalculator() {
    }

    public static boolean isConvergence(ComplexNumber startNumber) {
        ComplexNumber prevResult = new ComplexNumber(0, 0);
        for (int i = 0; i < ITERATIONS_COUNT; i++) {
            prevResult = prevResult.getSquare().add(startNumber);
            float resultAbs = prevResult.getReal() * prevResult.getReal() + prevResult.getImaginary() * prevResult.getImaginary();
            if (resultAbs > BOUND_RADIUS_SQUARE) {
                return false;
            }
        }
        return true;
    }
}
