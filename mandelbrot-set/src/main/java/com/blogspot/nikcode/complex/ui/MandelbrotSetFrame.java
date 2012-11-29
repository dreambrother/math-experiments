package com.blogspot.nikcode.complex.ui;

import com.blogspot.nikcode.complex.ComplexNumber;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.util.Collection;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author nik
 */
public class MandelbrotSetFrame extends JFrame {
    
    private static final int xSize = 700;
    private static final int ySize = 400;

    public MandelbrotSetFrame(final Collection<ComplexNumber> mandelbrotSet) {
        this.setSize(xSize, ySize);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 200);
        JPanel jPanel = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                ComplexSheet sheet = new ComplexSheet(new Point(xSize / 2, ySize / 2), xSize / 4);
                g.drawLine(0, ySize / 2, xSize, ySize / 2);
                g.drawLine(xSize / 2, 0, xSize / 2, ySize);
                for (ComplexNumber complexNumber : mandelbrotSet) {
                    Point point = sheet.calcWindowCoordinates(complexNumber);
                    g2d.draw(new Line2D.Double(point.getX(), point.getY(), point.getX(), point.getY()));
                }
            }
        };
        this.add(jPanel);
    }
}
