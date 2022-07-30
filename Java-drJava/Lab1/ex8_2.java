import javax.swing.*;
import java.awt.*;

public class ex8_2 {
public static void main(String[]args) {
    JFrame frame = new JFrame("Exercise08_v2_01"); 
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();

    p.setLayout(new FlowLayout(FlowLayout.CENTER,10,15));
   
    p1.setLayout(new BorderLayout(10,8));
    p2.setLayout(new BorderLayout(10,8));
    
    p.add(p1,BorderLayout.CENTER);
    p1.add(new JButton("Button 4"), BorderLayout.WEST);
    p1.add(new JButton("Button 5"), BorderLayout.CENTER);
    p1.add(new JButton("Button 6"), BorderLayout.EAST);
    
    p.add(p2,BorderLayout.SOUTH);
    p2.add(new JButton("Button 1"), BorderLayout.WEST);
    p2.add(new JButton("Button 2"), BorderLayout.CENTER);
    p2.add(new JButton("Button 3"), BorderLayout.EAST);
    
    frame.add(p);
    frame.setSize(300,140);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
    

