import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class ex8_1c {
public static void main(String[]args) {
    JFrame frame = new JFrame("Exercise");
    Border lineBorder = new LineBorder(Color.BLACK,1);
    JPanel p = new JPanel();
    JLabel lb1 = new JLabel("Hello,My name is CPE 320.");
    JLabel lb2 = new JLabel("Department of Computer Engineering");
    JLabel lb3 = new JLabel("Srinakharinwirot University");
    JLabel lb4 = new JLabel("Ongkarak Nakornnayok");
    lb1.setBorder(lineBorder);
    lb2.setBorder(lineBorder);
    lb3.setBorder(lineBorder);
    lb4.setBorder(lineBorder);
    p.setLayout(new GridLayout(4,1,0,0));
    
    p.add(lb1);
    p.add(lb2);
    p.add(lb3);
    p.add(lb4);

    frame.add(p);
    frame.setSize(500,200);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
    