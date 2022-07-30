import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class Circle extends JPanel{
  
  protected void paintComponent(Graphics g){
    super.paintComponent(g);
    
    int Radius = (int)(Math.min(getWidth(),getHeight())*(0.8)*(0.5));
    int x = getWidth()/2;
    int y = getHeight()/2;
    
    g.setColor(Color.black);
    g.drawOval(x-Radius,y - Radius,2*Radius,2*Radius);
  }
  

}