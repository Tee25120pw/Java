import javax.swing.*;
import java.awt.*;

public class Exercise1 extends JFrame {
  public Exercise1() {

    add(new Rectangle());
  }

  public static void main(String[]args) {
    Exercise1 frame = new Exercise1();
    frame.setTitle("Exercise");
    frame.setSize(850,160);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

class Rectangle extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    g.setColor(Color.BLACK);        g.fillRect(10,10,80,100);
    g.setColor(Color.CYAN);         g.fillRect(100,10,80,100);
    g.setColor(Color.GRAY);         g.fillRect(190,10,80,100);
    g.setColor(Color.GREEN);        g.fillRect(280,10,80,100);
    g.setColor(Color.MAGENTA);      g.fillRect(370,10,80,100);
    g.setColor(Color.ORANGE);       g.fillRect(460,10,80,100);
    g.setColor(Color.PINK);         g.fillRect(550,10,80,100);
    g.setColor(Color.RED);          g.fillRect(640,10,80,100);
    g.setColor(Color.YELLOW);       g.fillRect(730,10,80,100);   
  }
}
