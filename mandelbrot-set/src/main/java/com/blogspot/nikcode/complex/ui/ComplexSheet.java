package com.blogspot.nikcode.complex.ui;

import com.blogspot.nikcode.complex.ComplexNumber;

/**
 *
 * @author nik
 */
public class ComplexSheet {

    private final Point center;
    private final int complexNumberFactor;

    public ComplexSheet(Point center, int complexNumberFactor) {
        this.center = center;
        this.complexNumberFactor = complexNumberFactor;
    }
    
    public Point calcWindowCoordinates(ComplexNumber complexNumber) {
        double real = center.getX() + complexNumber.getReal() * complexNumberFactor;
        double imaginary = center.getY() + complexNumber.getImaginary() * complexNumberFactor;
        return new Point(real, imaginary);
    }
}
