import javax.swing.*;
import java.awt.*;
 
public class Exercise2 extends JFrame {

  public static void main(String[]args) {
    JFrame frame = new JFrame();
    JPanel p = new JPanel();
    Oval ov = new Oval();
    Oval2 ov2 = new Oval2();
    p.setLayout(new GridLayout(1,2,10,10));
    p.add(ov);
    p.add(ov2);
    frame.add(p); 
    frame.setTitle("Exercise");
    frame.setSize(300,120);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
    

class Oval extends JButton {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    setSize (120,80);
    g.drawOval(10,10,100,60);
    setText("OK");
    setHorizontalTextPosition(JLabel.CENTER);
  }
}

class Oval2 extends JButton {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    setSize (120,80);
    g.drawOval(10,10,100,60);
    setText("Cancel");
    setHorizontalTextPosition(JLabel.CENTER);
  }
}