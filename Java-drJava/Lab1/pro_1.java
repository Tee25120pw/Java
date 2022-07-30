import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class pro_1 extends JFrame {
  private JTextField m = new JTextField(5);
  private JTextField f = new JTextField(5);
  private JTextField i = new JTextField(5);
  private JTextField cm = new JTextField(5);
  private JTextField mm = new JTextField(5);
  //private JTextField num6 = new JTextField(5);
  //private JTextField re = new JTextField(5);

  private JButton b1 = new JButton(" m --> foot "); //ใส่ m ได้ f
  private JButton b2 = new JButton(" foot --> m ");
  
  private JButton b3 = new JButton(" inch --> cm ");
  private JButton b4 = new JButton(" cm --> inch ");
  
  private JButton b5 = new JButton(" mm --> inch ");
  private JButton b6 = new JButton(" inch --> mm ");
  
  private JButton b7 = new JButton(" inch --> foot ");
  private JButton b8 = new JButton(" foot --> inch ");

  public pro_1()
  {
    JPanel p1 = new JPanel(new FlowLayout());
    p1.add(new JLabel("m = "));
    p1.add(m);
    p1.add(new JLabel("foot = "));
    p1.add(f);
    p1.add(new JLabel("inch = "));
    p1.add(i);
    p1.add(new JLabel("cm = "));
    p1.add(cm);
    p1.add(new JLabel("mm = "));
    p1.add(mm);
    
    p1.add(b1); p1.add(b2); p1.add(b3); p1.add(b4); 
    p1.add(b5); p1.add(b6); p1.add(b7); p1.add(b8);
    add(p1);
    b1.addActionListener(new ButtonListener1());
    b2.addActionListener(new ButtonListener2());
    b3.addActionListener(new ButtonListener3());
    b4.addActionListener(new ButtonListener4());
    b5.addActionListener(new ButtonListener5());
    b6.addActionListener(new ButtonListener6());
    b7.addActionListener(new ButtonListener7());
    b8.addActionListener(new ButtonListener8());

  }
  private class ButtonListener1 implements ActionListener{
    public void actionPerformed(ActionEvent e){  
      double n1,x=0;
      n1 = Integer.parseInt(m.getText());
      x = n1*3.2808; //ได้ f
      f.setText(String.format("%.5f",x));
      
    }
  }
  private class ButtonListener2 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      double n2,x=0;
      n2 = Integer.parseInt(f.getText());
      x = n2/3.2808; //ได้ m
      m.setText(String.format("%.5f",x));
    }
  }
  private class ButtonListener3 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      double n3,x=0;
      n3 = Integer.parseInt(i.getText());
      x = n3/0.39370; //ได้ cm
      cm.setText(String.format("%.5f",x));
    }
  }
  private class ButtonListener4 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      double n4,x=0;
      n4 = Integer.parseInt(cm.getText());
      x = n4*0.39370; //ได้ i
      i.setText(String.format("%.5f",x));
    }
  }
 private class ButtonListener5 implements ActionListener{
    public void actionPerformed(ActionEvent e){    
      double n5,x=0;
      n5 = Integer.parseInt(mm.getText());
      x = n5*0.039370; //ได้ i
      i.setText(String.format("%.5f",x));
    }
  }
  private class ButtonListener6 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      double n6,x=0;
      n6 = Integer.parseInt(i.getText());
      x = n6/0.039370; //ได้ mm
      mm.setText(String.format("%.5f",x));
    }
  }
  private class ButtonListener7 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      double n7,x=0;
      n7 = Integer.parseInt(i.getText());
      x = n7*0.083333; //ได้ f
      f.setText(String.format("%.5f",x));
    }
  }
  private class ButtonListener8 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      double n8,x=0;
      n8 = Integer.parseInt(f.getText());
      x = n8/0.083333; //ได้ i
      i.setText(String.format("%.5f",x));
    }
  }
    
  public static void main(String[] args)
  {
    pro_1 frame = new pro_1();
    frame.setTitle("Area of Cylinder");
    frame.setSize(318,220);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}