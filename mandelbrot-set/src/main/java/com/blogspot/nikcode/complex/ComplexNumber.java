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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Float.floatToIntBits(this.real);
        hash = 47 * hash + Float.floatToIntBits(this.imaginary);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ComplexNumber other = (ComplexNumber) obj;
        if (Float.floatToIntBits(this.real) != Float.floatToIntBits(other.real)) {
            return false;
        }
        if (Float.floatToIntBits(this.imaginary) != Float.floatToIntBits(other.imaginary)) {
            return false;
        }
        return true;
    }
}
