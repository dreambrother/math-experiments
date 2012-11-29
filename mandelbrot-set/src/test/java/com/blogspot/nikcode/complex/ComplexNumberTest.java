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
        assertEquals(-5, number1.getSquare().getReal(), 0);
        assertEquals(12, number1.getSquare().getImaginary(), 0);
        
        ComplexNumber number2 = new ComplexNumber(4, 2);
        assertEquals(12, number2.getSquare().getReal(), 0);
        assertEquals(16, number2.getSquare().getImaginary(), 0);
    }
    
    @Test
    public void shouldCalculateSquareWithNegativeReal() {
        ComplexNumber number = new ComplexNumber(-3, 1);
        assertEquals(8, number.getSquare().getReal(), 0);
        assertEquals(-6, number.getSquare().getImaginary(), 0);
    }
    
    @Test
    public void shouldCalculateSquareWithNegativeImaginary() {
        ComplexNumber number = new ComplexNumber(3, -2);
        assertEquals(5, number.getSquare().getReal(), 0);
        assertEquals(-12, number.getSquare().getImaginary(), 0);
    }
    
    @Test
    public void shouldCalculateSquareWithNegativeRealAndImaginary() {
        ComplexNumber number = new ComplexNumber(-5, -3);
        assertEquals(16, number.getSquare().getReal(), 0);
        assertEquals(30, number.getSquare().getImaginary(), 0);
    }
    
    @Test
    public void shouldAddTwoComplexNumbers() {
        ComplexNumber number1 = new ComplexNumber(4, 7);
        ComplexNumber number2 = new ComplexNumber(5, 3);
        ComplexNumber result = number1.add(number2);
        assertEquals(9, result.getReal(), 0);
        assertEquals(10, result.getImaginary(), 0);
    }
}
