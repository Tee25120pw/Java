import javax.swing.*;
import java.awt.*;

public class DrawOval extends JPanel{
  public static final int OVAL = 4;
  private int type = 1;
  
  public DrawOval() {
  }
  
  public DrawOval(int type) {
    this.type = type;
  }
  

     @Override
   protected void paintComponent(Graphics g) {
     super.paintComponent(g);
     int width = getWidth();
     int height = getHeight();
     
     switch(type) {
       case OVAL:
         g.setColor(Color.BLACK);
         g.drawOval((int)(0.1*width),(int)(0.1*height),(int)(0.8*width),(int)(0.8*height));
         break;
     }
   }

         
         public Dimension getPreferredSize() {
           return new Dimension(150,90);
         }
     }
       