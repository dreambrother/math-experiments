package com.blogspot.nikcode.complex;

/**
 *
 * @author nik
 */
public class ComplexNumber {

    private final float real;
    private final float imaginary;

    public ComplexNumber(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public float getReal() {
        return real;
    }

    public float getImaginary() {
        return imaginary;
    }
    
    public ComplexNumber getSquare() {
        return new ComplexNumber(real * real - imaginary * imaginary, 2 * real * imaginary);
    }

    public ComplexNumber add(ComplexNumber another) {
        return new ComplexNumber(real + another.getReal(), imaginary + another.getImaginary());
    }
}
