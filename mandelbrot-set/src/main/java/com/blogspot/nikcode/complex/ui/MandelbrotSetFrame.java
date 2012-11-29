package com.blogspot.nikcode.complex.ui;

import com.blogspot.nikcode.complex.ComplexNumber;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.Collection;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author nik
 */
public class MandelbrotSetFrame extends JFrame {
    
    private static final int WINDOW_WIDTH = 700;
    private static final int WINDOW_HEIGHT = 400;

    public MandelbrotSetFrame(final Collection<ComplexNumber> mandelbrotSet) {
        super("Mandelbrot Set");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 200);
        JPanel jPanel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                
                g.drawLine(0, WINDOW_HEIGHT / 2, WINDOW_WIDTH, WINDOW_HEIGHT / 2);
                g.drawLine(WINDOW_WIDTH / 2, 0, WINDOW_WIDTH / 2, WINDOW_HEIGHT);
                for (ComplexNumber complexNumber : mandelbrotSet) {
                    double real = WINDOW_WIDTH / 2 + complexNumber.getReal() * WINDOW_WIDTH / 4;
                    double imaginary = WINDOW_HEIGHT / 2 + complexNumber.getImaginary() * WINDOW_WIDTH / 4;
                    g2d.draw(new Line2D.Double(real, imaginary, real, imaginary));
                }
            }
        };
        jPanel.setBackground(Color.WHITE);
        this.add(jPanel);
    }
}
