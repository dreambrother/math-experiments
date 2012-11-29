package com.blogspot.nikcode.complex;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author nik
 */
public class MandelbrotSetCalculatorTest {
    
    @Test
    public void shouldConvergence() {
        assertTrue(MandelbrotSetCalculator.isConvergence(new ComplexNumber(-0.5, 0.5)));
        assertTrue(MandelbrotSetCalculator.isConvergence(new ComplexNumber(0.1, -0.2)));
        assertTrue(MandelbrotSetCalculator.isConvergence(new ComplexNumber(0.2, -0.2)));
        assertTrue(MandelbrotSetCalculator.isConvergence(new ComplexNumber(-1.1, 0f)));
        assertTrue(MandelbrotSetCalculator.isConvergence(new ComplexNumber(-1.01, -0.01)));
    }
    
    @Test
    public void shouldDivergence() {
        assertFalse(MandelbrotSetCalculator.isConvergence(new ComplexNumber(2, 1)));
        assertFalse(MandelbrotSetCalculator.isConvergence(new ComplexNumber(0.1, 2)));
        assertFalse(MandelbrotSetCalculator.isConvergence(new ComplexNumber(0.5, -0.3)));
        assertFalse(MandelbrotSetCalculator.isConvergence(new ComplexNumber(1, 0)));
        assertFalse(MandelbrotSetCalculator.isConvergence(new ComplexNumber(-0.5, -0.7)));
    }
}
