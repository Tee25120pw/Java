import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Quiz11_2 extends JFrame{
  CirclePanel1 KBPanel = new CirclePanel1();
  public int choice = 0;
  public Quiz11_2(){
    setLayout(new GridLayout(1,1));
    JButton a = new JButton();
    add(KBPanel);
    KBPanel.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        if(choice!=1){
        int Radius = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter radius of circle","Input",JOptionPane.QUESTION_MESSAGE));
        KBPanel.getRadius(Radius);
        choice = 1;
        }else{
        int changColor = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter 0 for red or 1 for Blue or 2 for green. it will be black otherwise","Input",JOptionPane.QUESTION_MESSAGE));
        KBPanel.getColor(changColor);
        choice = 0;
        }
        
      }
    }
  );
    
    
  }
  
  public static void main(String[] arg){
    Quiz11_2 frame = new Quiz11_2();
    frame.setTitle("CPE320 : Quiz 11_2");
    frame.setSize(300,300);
    frame.setVisible(true);
    
  }
}
class CirclePanel1 extends JButton{
  int Radius =0;
  int changColor =5;
  public void getRadius(int Radius){
    this.Radius = Radius;
    repaint();
  }
  public void getColor(int changColor){
    this.changColor = changColor;
    repaint();
  }

  @Override
  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    switch(changColor){
      case 0:
        g.setColor(Color.red);
        break;
      case 1:
        g.setColor(Color.blue);
        break;
      case 2:
        g.setColor(Color.green);
        break;
      default:
        g.setColor(Color.black);
        break;
    }
    g.fillArc(getWidth()/2-Radius,getHeight()/2-Radius,2*Radius,2*Radius,0,30);
    g.fillArc(getWidth()/2-Radius,getHeight()/2-Radius,2*Radius,2*Radius,75,30);
    g.fillArc(getWidth()/2-Radius,getHeight()/2-Radius,2*Radius,2*Radius,150,30);
    g.fillArc(getWidth()/2-Radius,getHeight()/2-Radius,2*Radius,2*Radius,225,30);
    g.fillArc(getWidth()/2-Radius,getHeight()/2-Radius,2*Radius,2*Radius,290,30);
    
  }
}