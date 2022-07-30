import javax.swing.*;
import java.awt.*;
public class ex8_4 {
  public static void main(String[]args) {
    JFrame frame = new JFrame("Exercise");
    JPanel p = new JPanel(); 
    p.setLayout(new GridLayout(1,4,0,0));

    ImageIcon icon1 = new ImageIcon("D:/PREM/CPE320 Java/ของเราเองง/Lecture10/gerIcon.png");
    ImageIcon icon2 = new ImageIcon("D:/PREM/CPE320 Java/ของเราเองง/Lecture10/ukIcon.jpg");  
    ImageIcon icon3 = new ImageIcon("D:/PREM/CPE320 Java/ของเราเองง/Lecture10/chinaIcon.gif");
    ImageIcon icon4 = new ImageIcon("D:/PREM/CPE320 Java/ของเราเองง/Lecture10/caIcon.png"); 
   
    JLabel lb1 = new JLabel("GER",icon1,JLabel.CENTER);
    lb1.setHorizontalTextPosition (SwingConstants.CENTER);
    lb1.setVerticalTextPosition (SwingConstants.BOTTOM);
    
    JLabel lb2 = new JLabel("UK",icon2,JLabel.CENTER);
    lb2.setHorizontalTextPosition (SwingConstants.RIGHT);
    lb2.setVerticalTextPosition (SwingConstants.CENTER);
    
    JLabel lb3 = new JLabel("CHA",icon3,JLabel.CENTER);
    lb3.setHorizontalTextPosition (SwingConstants.LEFT);
    lb3.setVerticalTextPosition (SwingConstants.CENTER);
    
    JLabel lb4 = new JLabel("CAN",icon4,JLabel.CENTER);
    lb4.setHorizontalTextPosition (SwingConstants.CENTER);
    lb4.setVerticalTextPosition (SwingConstants.TOP);


    
    p.add(lb1);      p.add(lb2);      p.add(lb3);      p.add(lb4);
    frame.add(p);
    frame.setSize(480,180);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
 