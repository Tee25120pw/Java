import javax.swing.*;
import java.awt.*;

public class ex8_1a {
public static void main(String[]args) {
    JFrame frame = new JFrame("Handle Event"); 
    JPanel p = new JPanel();
    JLabel lb = new JLabel("Name",SwingConstants.LEFT);
    JTextField tf = new JTextField(20);
    JButton jbtOK = new JButton("OK");
    JButton jbtCancel = new JButton("Cancel");
    JButton jbtExit = new JButton("Exit");
    p.setLayout(new FlowLayout());
    
    p.add(lb);
    p.add(tf);
    p.add(jbtOK);
    p.add(jbtCancel);
    p.add(jbtExit);
    
    frame.add(p);
    frame.setSize(500,80);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}