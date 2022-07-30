import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class ex8_3  {
  public static void main(String[]args) {
    JFrame frame = new JFrame("Exercise");
    JPanel p = new JPanel(); 
    Border lineBorder = new LineBorder(Color.BLACK,1);
    
    ImageIcon icon1 = new ImageIcon("D:/PREM/CPE320 Java/ของเราเองง/Exercise08-2/daniel1.jpg");
    ImageIcon icon2 = new ImageIcon("D:/PREM/CPE320 Java/ของเราเองง/Exercise08-2/daniel2.jpg");  
    ImageIcon icon3 = new ImageIcon("D:/PREM/CPE320 Java/ของเราเองง/Exercise08-2/daniel4.jpg");
    ImageIcon icon4 = new ImageIcon("D:/PREM/CPE320 Java/ของเราเองง/Exercise08-2/daniel3.jpg"); 
   
    JLabel lb1 = new JLabel(icon1);
    JLabel lb2 = new JLabel(icon2);
    JLabel lb3 = new JLabel(icon3);
    JLabel lb4 = new JLabel(icon4);
    
    lb1.setBorder(lineBorder);
    lb2.setBorder(lineBorder);
    lb3.setBorder(lineBorder);
    lb4.setBorder(lineBorder);
    
    p.setLayout(new GridLayout(2,2,0,0));
    
    p.add(lb1);
    p.add(lb2);
    p.add(lb3);
    p.add(lb4);

    frame.add(p);
    frame.setSize(620,460);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}