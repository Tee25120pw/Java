import javax.swing.*;
import java.awt.*;

public class Quiz10T {
    public static void main(String[] args) {
        JFrame f = new JFrame("DrawCircle");

        f.add(new DrawCircleT());
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 800);
        f.setVisible(true);
    }
}

class DrawCircleT extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = getWidth();
        int y = getHeight();

        int x1 = (int) (getWidth() / 8);
        int y1 = (int) ((getHeight() / 2) - x1);

        int x2 = (int) ((getWidth() / 2) - x1);
        int y2 = (int) (getHeight() / 8);

        int x3 = (int) ((getWidth() / 8));
        int y3 = (int) (getHeight() / 8);

        int w = (int) (getWidth() / 2);
        int h = (int) (getHeight() / 2);

        g.setColor(Color.WHITE);
        g.fillOval(x3, y3, w, h);
        g.setColor(Color.BLACK);
        g.drawOval(x3, y3, w, h);
        g.setColor(Color.WHITE);
        g.fillOval(x1, y1, w, h);
        g.setColor(Color.WHITE);
        g.fillOval(x2, y2, w, h);
        g.setColor(Color.BLACK);
        g.drawOval(x1, y1, w, h);
        g.drawOval(x2, y2, w, h);

        g.setColor(Color.RED);
        g.drawLine(x / 2, 0, x / 2, y);
        g.drawLine(0, y / 2, x, y / 2);
        g.setColor(Color.BLUE);
        g.drawLine(x - (x / 4), 0, x - (x / 4), y / 2);
        g.drawLine(x / 4, y / 4, x, y / 4);
        g.drawLine(x / 4, y / 4, x / 4, y);
        g.drawLine(0, y - (y / 4), x / 2, y - (y / 4));
        g.setColor(Color.GREEN);
        g.drawLine((x / 2) - (x / 8), (y / 2 - y / 8), x - (x / 4), (y / 2 - y / 8));
        g.drawLine((x / 2 + x / 8), y / 4, (x / 2 + x / 8), y / 2);
        g.drawLine(x / 4, (y / 2 + y / 8), x / 2, (y / 2 + y / 8));
        g.drawLine((x / 2 - x / 8), (y / 2) - (y / 8), (x / 2 - x / 8), y - (y / 4));
    }
}