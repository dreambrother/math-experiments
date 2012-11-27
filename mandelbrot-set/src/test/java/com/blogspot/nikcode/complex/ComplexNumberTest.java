package com.blogspot.nikcode.complex;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author nik
 */
public class ComplexNumberTest {

    @Test
    public void shouldCalculateSquare() {
        ComplexNumber number1 = new ComplexNumber(2, 3);
        assertEquals(-5f, number1.getSquare().getReal(), 0f);
        assertEquals(12f, number1.getSquare().getImaginary(), 0f);
        
        ComplexNumber number2 = new ComplexNumber(4, 2);
        assertEquals(12f, number2.getSquare().getReal(), 0f);
        assertEquals(16f, number2.getSquare().getImaginary(), 0f);
    }
    
    @Test
    public void shouldCalculateSquareWithNegativeReal() {
        ComplexNumber number = new ComplexNumber(-3, 1);
        assertEquals(8f, number.getSquare().getReal(), 0f);
        assertEquals(-6f, number.getSquare().getImaginary(), 0f);
    }
    
    @Test
    public void shouldCalculateSquareWithNegativeImaginary() {
        ComplexNumber number = new ComplexNumber(3, -2);
        assertEquals(5f, number.getSquare().getReal(), 0f);
        assertEquals(-12f, number.getSquare().getImaginary(), 0f);
    }
    
    @Test
    public void shouldCalculateSquareWithNegativeRealAndImaginary() {
        ComplexNumber number = new ComplexNumber(-5, -3);
        assertEquals(16f, number.getSquare().getReal(), 0f);
        assertEquals(30f, number.getSquare().getImaginary(), 0f);
    }
    
    @Test
    public void shouldAddTwoComplexNumbers() {
        ComplexNumber number1 = new ComplexNumber(4, 7);
        ComplexNumber number2 = new ComplexNumber(5, 3);
        ComplexNumber result = number1.add(number2);
        assertEquals(9f, result.getReal(), 0f);
        assertEquals(10f, result.getImaginary(), 0f);
    }
}
