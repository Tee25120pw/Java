import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class Fi_3 extends JFrame {
  private JTextField num1 = new JTextField(20);
  private JTextField num2 = new JTextField(20);
  private JTextField re = new JTextField(20);
  private JButton b1 = new JButton("Cone");
  private JButton b2 = new JButton("Cylinder");

  public Fi_3()
  {
    setLayout(new GridLayout(4, 2));
    add(new JLabel("?????"));
    add(num1);
    add(new JLabel("?????٧"));
    add(num2);
    add(new JLabel("??鹷??"));
    add(re);
    add(b1); add(b2);
    
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
    Fi_3 frame = new Fi_3();
    frame.setTitle("Area of Cylinder");
    frame.setSize(350,200);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}