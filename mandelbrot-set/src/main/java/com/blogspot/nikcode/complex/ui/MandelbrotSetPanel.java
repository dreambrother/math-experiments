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
    private double zoom = 1.0;
    
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
        g.drawLine(0, centerY, this.getWidth(), centerY);
        g.drawLine(centerX, 0, centerX, this.getHeight());
        Set<ComplexNumber> mandelbrotSet = MandelbrotSetCalculator.computeSet(
                -2 / zoom, 1 / zoom, -1 / zoom, 1 / zoom, 0.005 / zoom, 0.005 / zoom);
        for (ComplexNumber complexNumber : mandelbrotSet) {
            double real = centerX + complexNumber.getReal() * this.getWidth() / 4 * zoom;
            double imaginary = centerY + complexNumber.getImaginary() * this.getWidth() / 4 * zoom;
            g2d.draw(new Line2D.Double(real, imaginary, real, imaginary));
        }
    }
    
    private MouseListener mouseListener() {
        return new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MandelbrotSetPanel thisPanel = MandelbrotSetPanel.this;
                int dx = e.getX() - thisPanel.getWidth() / 2;
                int dy = e.getY() - thisPanel.getHeight() / 2;
                
                MandelbrotSetPanel.this.centerX -= (int) (dx * zoom);
                MandelbrotSetPanel.this.centerY -= (int) (dy * zoom);
                MandelbrotSetPanel.this.zoom *= 1.1;
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
