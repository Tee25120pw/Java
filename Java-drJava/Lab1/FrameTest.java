import javax.swing.*;
import java.awt.*;

public class FrameTest {
  public static void main(String[] args) {
    Font fn = new Font("Cordia New",Font.BOLD,24);
    JFrame f = new JFrame("Handle Event");
    JPanel p = new JPanel();
    JButton b1 = new JButton("OK");
    JButton b2 = new JButton("Cancle");
    JButton b3 = new JButton("Exit");
    JLabel I1 = new JLabel("Name",SwingConstants.LEFT);
    JTextField t1 = new JTextField("",24);
    p.setBackground(Color.WHITE);
    I1.setFont(fn);
    I1.setPreferredSize(new Dimension(50,50));
    I1.setForeground(Color.black);
    t1.setFont(fn);
    p.add(I1);
    p.add(t1);
    p.add(b1);
    p.add(b2);
    p.add(b3);
    f.add(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(750,100);
    f.setVisible(true);
    
  }}