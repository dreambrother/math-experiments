package com.blogspot.nikcode.complex.ui;

import com.blogspot.nikcode.complex.ComplexNumber;
import java.awt.Graphics;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author nik
 */
public class MandelbrotSetFrame extends JFrame {

    public MandelbrotSetFrame(final Set<ComplexNumber> mandelbrotSet) {
        this.setSize(700, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 200);
        
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
        
        this.add(jPanel);
    }
}
