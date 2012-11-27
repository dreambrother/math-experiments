package com.blogspot.nikcode.complex;

import java.awt.Graphics;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author nik
 */
public class Main {

    public static void main(String[] args) {
        final Set<ComplexNumber> mandelbrotSet = MandelbrotSetCalculator.computeSet(-2, 1, -1, 1, 0.01f, 0.01f);
        JFrame jFrame = new JFrame();
        jFrame.setSize(320, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel jPanel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (ComplexNumber complexNumber : mandelbrotSet) {
                    g.drawRect(Math.abs((int) (complexNumber.getReal() * 200)), 
                            Math.abs((int) (complexNumber.getImaginary() * 200)), 1, 1);
                }
            }
        };
        
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
