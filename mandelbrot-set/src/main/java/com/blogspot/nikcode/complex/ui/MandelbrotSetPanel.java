package com.blogspot.nikcode.complex.ui;

import com.blogspot.nikcode.complex.ComplexNumber;
import com.blogspot.nikcode.complex.MandelbrotSetCalculator;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.util.Set;
import javax.swing.JPanel;

/**
 *
 * @author nik
 */
public class MandelbrotSetPanel extends JPanel {
    
    private Integer centerX;
    private Integer centerY;

    public MandelbrotSetPanel() {
        super();
        this.setBackground(Color.WHITE);
        this.addMouseListener(mouseListener());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        if (centerX == null && centerY == null) {
            centerX = this.getWidth() / 2;
            centerY = this.getHeight() / 2;
        }
        drawCordinateAxes(g, centerX, centerY);
        Set<ComplexNumber> mandelbrotSet = MandelbrotSetCalculator.computeSet(-2, 1, -1, 1, 0.005, 0.005);
        for (ComplexNumber complexNumber : mandelbrotSet) {
            double real = centerX + complexNumber.getReal() * this.getWidth() / 4;
            double imaginary = centerY + complexNumber.getImaginary() * this.getWidth() / 4;
            g2d.draw(new Line2D.Double(real, imaginary, real, imaginary));
        }
    }
    
    private void drawCordinateAxes(Graphics g, int x, int y) {
        g.drawLine(0, y, this.getWidth(), y);
        g.drawLine(x, 0, x, this.getHeight());
    }
    
    private MouseListener mouseListener() {
        return new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MandelbrotSetPanel.this.centerX = e.getX();
                MandelbrotSetPanel.this.centerY = e.getY();
                MandelbrotSetPanel.this.repaint();
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        };
    }
}
