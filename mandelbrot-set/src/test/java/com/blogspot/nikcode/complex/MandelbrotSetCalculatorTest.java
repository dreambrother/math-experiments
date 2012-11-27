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
        assertTrue(MandelbrotSetCalculator.isConvergence(new ComplexNumber(-0.5f, 0.5f)));
        assertTrue(MandelbrotSetCalculator.isConvergence(new ComplexNumber(0.1f, -0.2f)));
        assertTrue(MandelbrotSetCalculator.isConvergence(new ComplexNumber(0.2f, -0.2f)));
        assertTrue(MandelbrotSetCalculator.isConvergence(new ComplexNumber(-1.1f, 0f)));
        assertTrue(MandelbrotSetCalculator.isConvergence(new ComplexNumber(-1.01f, -0.01f)));
    }
    
    @Test
    public void shouldDivergence() {
        assertFalse(MandelbrotSetCalculator.isConvergence(new ComplexNumber(2f, 1f)));
        assertFalse(MandelbrotSetCalculator.isConvergence(new ComplexNumber(0.1f, 2f)));
        assertFalse(MandelbrotSetCalculator.isConvergence(new ComplexNumber(0.5f, -0.3f)));
        assertFalse(MandelbrotSetCalculator.isConvergence(new ComplexNumber(1f, 0f)));
        assertFalse(MandelbrotSetCalculator.isConvergence(new ComplexNumber(-0.5f, -0.7f)));
    }
}
