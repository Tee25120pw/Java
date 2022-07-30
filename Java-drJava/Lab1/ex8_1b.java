import javax.swing.*;
import java.awt.*;

public class ex8_1b {
public static void main(String[]args) {
    JFrame frame = new JFrame("Handle Event"); 
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JLabel lb = new JLabel("Name",SwingConstants.LEFT);
    JTextField tf = new JTextField(20);
    JButton jbtOK = new JButton("OK");
    JButton jbtCancel = new JButton("Cancel");
    JButton jbtExit = new JButton("Exit");
    p.setLayout(new BorderLayout());
    p1.setLayout(new BorderLayout());
    p2.setLayout(new BorderLayout());
    
    p.add(p1,BorderLayout.NORTH);
    p1.add(lb,BorderLayout.WEST);
    p1.add(tf);
    
    p.add(p2,BorderLayout.SOUTH);
    p2.add(jbtOK,BorderLayout.WEST);
    p2.add(jbtCancel,BorderLayout.CENTER);
    p2.add(jbtExit,BorderLayout.EAST);
    frame.add(p);
    
    frame.setSize(500,90);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}