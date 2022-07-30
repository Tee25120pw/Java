import java.awt.*;
import javax.swing.*;

public class Quiz08_G1_02 extends JPanel {
  
  public static void main(String[] args) {
    JLabel number1 = new JLabel("Number 1");
    JTextField tf1 = new JTextField(8);
    JLabel number2 = new JLabel("Number 2");
    JTextField tf2 = new JTextField(8);
    JLabel result = new JLabel("Result");
    JTextField tf3 = new JTextField(8);
    
    
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(2,1,10,10));
    JPanel pp = new JPanel();
    pp.setLayout(new GridLayout(1,2,20,10));
    p.add(pp);
    
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(3,2));
    p1.add(number1); p1.add(tf1); 
    p1.add(number2); p1.add(tf2); 
    p1.add(result);  p1.add(tf3);
    pp.add(p1);
    
    JButton a = new JButton("+");
    JButton b = new JButton("-");
    JButton c = new JButton("x");
    JButton d = new JButton("/");
    JButton e = new JButton(".");
    JButton f = new JButton("%");
    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(2,3));
    p2.add(a);  p2.add(b);  p2.add(c);  
    p2.add(d);  p2.add(e);  p2.add(f);
    pp.add(p2);
    
    JButton g = new JButton("=");
    p.add(g);
    
    JFrame frame = new JFrame("Calculator");
    frame.add(p);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(350,170);
    frame.setVisible(true);
  }
}