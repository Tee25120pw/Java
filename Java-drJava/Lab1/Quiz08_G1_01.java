import java.awt.*;
import javax.swing.*;

public class Quiz08_G1_01 extends JPanel {
  
  public void paint(Graphics g) {
    int x1 = getWidth()/8; 
    int y1 = getHeight()/8; 
    int h = x1*4; 
    int w = y1*4; 
    g.drawOval(x1,y1,h,w);
    
    int x2 = x1*3; 
    int y2 = y1*3; 
    g.drawOval(x2,y2,h,w);
  }
  
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("DrawCircle");
    frame.add(new Quiz08_G1_01());
    //frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setVisible(true);
  }
}