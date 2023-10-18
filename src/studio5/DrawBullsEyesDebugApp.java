package studio5;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import studio5.debug.DrawBullsEyes;
import support.cse131.DialogBoxes;
import support.cse131.DrawCase;

public class DrawBullsEyesDebugApp {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(400, 400);
        StdDraw.setXscale(0, 10);
        StdDraw.setYscale(0, 10);

        drawBullsEye(5.0, 5.0, 3.0);
    }

    public static void drawBullsEye(double x, double y, double radius) {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(x, y, radius);


        StdDraw.setPenColor(0, 109, 219); 
        StdDraw.filledCircle(x, y, 3.0 / 4.0 * radius);

        StdDraw.setPenColor(255, 0, 0); 
        StdDraw.filledCircle(x, y, 1.0 / 2.0 * radius);

        StdDraw.setPenColor(255, 255, 0); 
        StdDraw.filledCircle(x, y, 1.0 / 4.0 * radius);
    }
}