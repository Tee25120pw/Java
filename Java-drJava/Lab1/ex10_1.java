import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class ex10_1 extends JFrame {
  private JTextField num1 = new JTextField(5);
  private JTextField num2 = new JTextField(5);
  private JTextField re = new JTextField(5);
  private JButton b1 = new JButton("Cone");
  private JButton b2 = new JButton("Cylinder");

  public ex10_1()
  {
    JPanel p1 = new JPanel(new FlowLayout());
    p1.add(new JLabel("?????"));
    p1.add(num1);
    p1.add(new JLabel("?????٧"));
    p1.add(num2);
    p1.add(new JLabel("??鹷??"));
    p1.add(re);
    p1.add(b1); p1.add(b2);
    add(p1);
    b1.addActionListener(new ButtonListener());
    b2.addActionListener(new ButtonListener1());

  }
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      double n1,n2,x=0;
      n1 = Integer.parseInt(num1.getText());
      n2 = Integer.parseInt(num2.getText());
      //caculator ca = new caculator(n1,n2);
      x = 2*3.14*n1*(n1+n2);
      re.setText(String.format("%.5f",x));
    }
  }
  private class ButtonListener1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      double n1,n2,y=0;
      n1 = Integer.parseInt(num1.getText());
      n2 = Integer.parseInt(num2.getText());
      //caculator ca = new caculator(n1,n2);
      y =  (3.14*n1*n1)+(3.14*n1*( Math.sqrt((n1*n1)+(n2*n2))));
      re.setText(String.format("%.5f",y));
    }
  }
    
  public static void main(String[] args)
  {
    ex10_1 frame = new ex10_1();
    frame.setTitle("Area of Cylinder");
    frame.setSize(350,200);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}