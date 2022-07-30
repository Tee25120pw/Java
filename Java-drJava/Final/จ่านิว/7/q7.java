import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
public class q7 extends JFrame{
  private JButton jbteur = new JButton("EUR");
  private JButton jbtjpy = new JButton("JPY");
  
  private JTextField bath = new JTextField(8);
  private JTextField res = new JTextField(8);
  
  JLabel num1 = new JLabel("thb ");
  JLabel num2 = new JLabel("how");
 
public q7(){
  JPanel p0 = new JPanel();
  p0.setLayout(new FlowLayout());
  JPanel p1 = new JPanel();
  p1.setLayout(new GridLayout(2,2));
  JPanel p2 = new JPanel();
  p2.setLayout(new GridLayout(2,1));
  JPanel p3 = new JPanel();
  p3.setLayout(new GridLayout(1,2));
  
  
  p1.add(num1);
  p1.add(bath);
  p1.add(num2);
  p1.add(res);
  p0.add(p1);
  
  p2.add(jbteur);
  p2.add(jbtjpy);
  
  p3.add(p0);
  p3.add(p2);
  //add to frame
  add(p3);

  jbteur.addActionListener(new Jbteur());
  jbtjpy.addActionListener(new Jbtjpy());
  }
private class Jbteur implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      double number1 = Double.parseDouble(bath.getText()); //textfill bath
      double addTotal = number1/35;
      //button show
      res.setText(String.format("%.2f",addTotal));
    }
  }
private class Jbtjpy implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      double number1 = Double.parseDouble(bath.getText());
      double addTotal = number1/0.3;
      res.setText(String.format("%.2f",addTotal));
    }
  }

public static void main(String[] args){
  Frame frame = new q7();
  frame.setTitle("ExchangeMoney");
  //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(400,100);
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);   
 }
}