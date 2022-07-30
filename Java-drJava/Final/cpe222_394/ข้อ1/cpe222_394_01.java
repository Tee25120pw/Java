import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
public class cpe222_394_01 extends JFrame{
  private JButton jbteur = new JButton("me");
  private JButton jbtjpy = new JButton("ft");
  private JButton jbtx = new JButton("yd");
  private JButton jbty = new JButton("in");
  
  private JTextField bath = new JTextField(8);
  private JTextField res = new JTextField(8);
  
  JLabel num1 = new JLabel(" ความยาว(wa) ");
  JLabel num2 = new JLabel(" ความยาว ");
 
public cpe222_394_01(){
  JPanel p0 = new JPanel();
  p0.setLayout(new FlowLayout());
  JPanel p1 = new JPanel();
  p1.setLayout(new GridLayout(2,2));
  JPanel p2 = new JPanel();
  p2.setLayout(new GridLayout(2,1));
  JPanel p3 = new JPanel();
  p3.setLayout(new GridLayout(2,2));
  
  
  p1.add(num1);
  p1.add(bath);
  p1.add(num2);
  p1.add(res);
  p0.add(p1);
  
  p2.add(jbteur);
  p2.add(jbtjpy);
  p2.add(jbtx);
  p2.add(jbty);
  
  p3.add(p0);
  p3.add(p2);
  //add to frame
  add(p3);

  jbteur.addActionListener(new Jbteur());
  jbtjpy.addActionListener(new Jbtjpy());
  jbtx.addActionListener(new Jbtx());
  jbty.addActionListener(new Jbty());
  }
//me
private class Jbteur implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      double number1 = Double.parseDouble(bath.getText()); //textfill bath
      double addTotal = number1*2;
      //button show
      res.setText(String.format("%f",addTotal));
    }
  }
//ft
private class Jbtjpy implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      double number1 = Double.parseDouble(bath.getText());
      double addTotal = number1*6.56168;
      res.setText(String.format("%f",addTotal));
    }
  }
//yd
private class Jbtx implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      double number1 = Double.parseDouble(bath.getText());
      double addTotal = number1*2.18722;
      res.setText(String.format("%f",addTotal));
    }
  }
//in
private class Jbty implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      double number1 = Double.parseDouble(bath.getText());
      double addTotal = number1*80;
      res.setText(String.format("%f",addTotal));
    }
  }

public static void main(String[] args){
  Frame frame = new cpe222_394_01();
  frame.setTitle("Metric Conversions");
  //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(400,200);
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);   
 }
}