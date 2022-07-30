import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Quiz_11_390 extends JFrame{
    JPanel p = new JPanel();
    Circle c = new Circle();
  public Quiz_11_390(){
    
        
    JButton a = new JButton("");
    p.setLayout(new GridLayout(1,1));
    p.add(c);
    add(p);
    a.addActionListener(new AListener());
    
    
  }
  
  class AListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      JOptionPane.showInputDialog(null,"Please enter raduis of circle");
      
  }
  } 
  
  public class Circle extends JButton{
  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    int Radius = (int)(Math.min(getWidth(),getHeight())*(0.8)*(0.5));
    int x = getWidth()/2;
    int y = getHeight()/2;
    g.setColor(Color.black);
    g.drawOval(x-Radius,y - Radius,2*Radius,2*Radius);
  }
  }
  
  
  
public static void main(String[] arg){
    JFrame f = new Quiz_11_390();
    f.setSize(300,300);
    f.setVisible(true);
    f.setLocationRelativeTo(null);
  }
}
