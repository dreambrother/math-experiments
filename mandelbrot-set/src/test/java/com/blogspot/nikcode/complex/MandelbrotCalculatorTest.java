package com.blogspot.nikcode.complex;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author nik
 */
public class MandelbrotCalculatorTest {
    
    @Test
    public void shouldConvergence() {
        assertTrue(MandelbrotCalculator.isConvergence(new ComplexNumber(-0.5f, 0.5f)));
        assertTrue(MandelbrotCalculator.isConvergence(new ComplexNumber(0.1f, -0.2f)));
        assertTrue(MandelbrotCalculator.isConvergence(new ComplexNumber(0.2f, -0.2f)));
        assertTrue(MandelbrotCalculator.isConvergence(new ComplexNumber(-1.1f, 0f)));
        assertTrue(MandelbrotCalculator.isConvergence(new ComplexNumber(-1.01f, -0.01f)));
    }
    
    @Test
    public void shouldDivergence() {
        assertFalse(MandelbrotCalculator.isConvergence(new ComplexNumber(2f, 1f)));
        assertFalse(MandelbrotCalculator.isConvergence(new ComplexNumber(0.1f, 2f)));
        assertFalse(MandelbrotCalculator.isConvergence(new ComplexNumber(0.5f, -0.3f)));
        assertFalse(MandelbrotCalculator.isConvergence(new ComplexNumber(1f, 0f)));
        assertFalse(MandelbrotCalculator.isConvergence(new ComplexNumber(-0.5f, -0.7f)));
    }
}
