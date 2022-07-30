import java.awt.*;
import javax.swing.*;
public class LoanRadio extends JPanel {
  public static final int RECTANGLE = 2;
  public static final int OVAL = 4;
  private JRadioButton radioRed;
  private JRadioButton radioYellow;
  private JRadioButton radioGray;
  private JRadioButton radioWhite;
  private JRadioButton radioGreen;
  private JRadioButton radioRectangle;
  private JRadioButton radioOval;
  
  private int type = 1;
  private boolean filled = false;
  
  public LoanRadio() {
  }
  
  public LoanRadio(int type) {
    this.type = type;
  }

   @Override
   protected void paintComponent(Graphics g) {
     super.paintComponent(g);    
    int xCenter = getWidth()/2;
    int yCenter = getHeight()/2;
    int radius = (int)(Math.min(getWidth(),getHeight())*0.2);
    
    int x = (xCenter - radius);
    int y = (yCenter - radius);    
     switch(type) {        
       case RECTANGLE:
           g.drawRect(x,y,4*radius,2*radius);
           repaint();
           
         break;
         
       case OVAL:
            g.drawOval(x,y,2*radius,2*radius);
           repaint();
           break;
     }
   }
         
         public void setType(int type) {
           this.type = type;
           repaint();
         }
         public int getType() {
           return type;
         }

         
         public Dimension getPreferredSize() {
           return new Dimension(80,80);
         }
     }
     
