import javax.swing.*;
import java.awt.*;

public class FrameTest2 {
  public static void main(String[] args) {
    Font fn = new Font("Cordia New",Font.BOLD,24);
    JFrame f = new JFrame("EXERCISE#7");
    JPanel p = new JPanel();
    JButton b1 = new JButton("OK");
    JButton b2 = new JButton("Cancle");
    JButton b3 = new JButton("Exit");
    JLabel I1 = new JLabel("Name",SwingConstants.LEFT);
    JTextField t1 = new JTextField("",24);
    JPanel p1 = new JPanel(); //(+)
    p1.setLayout(new BorderLayout()); //(+)
    
    p.setBackground(Color.WHITE); 
    p.setLayout(new BorderLayout()); //เพิ่มมา
    I1.setFont(fn);
    
    I1.setForeground(Color.black);
    t1.setFont(fn);
    
    p.add(p1,BorderLayout.NORTH);
    p1.add(I1,BorderLayout.WEST);
    p1.add(t1,BorderLayout.CENTER);
    
    p.add(b1,BorderLayout.WEST);
    p.add(b2,BorderLayout.CENTER);
    p.add(b3,BorderLayout.EAST);
    
    f.add(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(750,100);
    f.setVisible(true);
    
  }}