import javax.swing.*;
import java.awt.*;

public class FrameTest3 {
  public static void main(String[] args) {
    Font fn = new Font("Cordia New",Font.BOLD,24);
    JFrame f = new JFrame("EXERCISE#7");
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(4,1));
    
    JLabel a = new JLabel("Hello,My name is CPE320.",SwingConstants.LEFT);
    JLabel b = new JLabel("Department of CPE",SwingConstants.LEFT);
    JLabel c = new JLabel("SWU",SwingConstants.LEFT);
    JLabel d = new JLabel("Ong Nakornnayok",SwingConstants.LEFT);
    
    a.setFont(fn);
    b.setFont(fn);
    c.setFont(fn);
    d.setFont(fn);
    
    p.add(a);
    p.add(b);
    p.add(c);
    p.add(d);
    
    f.add(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(400,300);
    f.setVisible(true);
  }}