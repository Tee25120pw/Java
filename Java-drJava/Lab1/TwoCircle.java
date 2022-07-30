import javax.swing.*;
import java.awt.*;

class TwoCircle extends JPanel{
  
  @Override
  protected  void  paintComponent(Graphics g){
    int width = getWidth();
    int height = getHeight();
    int x1=0;
    int y1=0;
    int x2=0;
    int y2=0;
    x1=(int)(Math.random()*width);
    y1=(int)(Math.random()*height);
    x2=(int)(Math.random()*width);
    y2=(int)(Math.random()*height);
    
    
    g.drawOval(x1,y1,15,15);
    g.drawString("1",x1,y1);
    g.drawOval(x2,y2,15,15);
    g.drawString("2",x2,y2);
    if(x1>x2)g.drawLine(x1,y1+7,x2+15,y2+7); 
    if(x1<x2)g.drawLine(x1+15,y1+7,x2,y2+7);
    
    
  }
}