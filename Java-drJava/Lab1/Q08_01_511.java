import javax.swing.*;
import java.awt.*;

public class Q08_01_511 {
   public static void main(String[]args) {
     JFrame f = new JFrame("Calculator");
     JPanel p = new JPanel();
     JPanel p1 = new JPanel();
     JPanel p2 = new JPanel();
     JPanel p3 = new JPanel();
     
     p.setLayout(new GridLayout(1,2,20,20));
     p1.setLayout(new GridLayout(3,2));
     p2.setLayout(new GridLayout(2,3));
     p3.setLayout(new GridLayout(2,1,20,20)); 
     
    p1.add(new JLabel("Number 1"));
    p1.add(new JTextField(8));
    p1.add(new JLabel("Number 2"));
    p1.add(new JTextField(8));
    p1.add(new JLabel("Result"));
    p1.add(new JTextField(8));
    
    p2.add(new JButton("+"));
    p2.add(new JButton("-"));
    p2.add(new JButton("*"));
    p2.add(new JButton("/"));
    p2.add(new JButton("."));
    p2.add(new JButton("%"));
    
    p.add(p1);   p.add(p2); 
    p3.add(p);
    p3.add(new JButton("="));
    
    f.add(p3);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(380,200);
    f.setVisible(true);
  }
}
