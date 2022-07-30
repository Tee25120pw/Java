import java.awt.*;
import javax.swing.JPanel;
public class FigurePanel extends JPanel{
  public static final int RECTANGLE = 2;
  public static final int OVAL = 4;
  public static final int RED = 10;
  public static final int YELLOW = 20;
  public static final int WHITE = 30;
  public static final int GRAY = 40;
  public static final int GREEN = 50;
  private int type = 1;
  private int color = 10;
  public FigurePanel() 
  {
     this.type = RECTANGLE;
     this.color = RED;
  }
  public FigurePanel(int type) 
  {
    this.type = type;
  }
  public FigurePanel(int type, int color) 
  {
    this.type = type;
    this.color = color;
  }
  protected void paintComponent(Graphics g) 
  {
    super.paintComponent(g);
    int width = getWidth();
    int height = getHeight();
    switch (color)
    {
      case RED: g.setColor(Color.RED); break;
      case YELLOW: g.setColor(Color.YELLOW); break;
      case WHITE: g.setColor(Color.WHITE); break;
      case GRAY: g.setColor(Color.GRAY); break;
      case GREEN: g.setColor(Color.GREEN); break;
    }
    g.fillRect(0,0,getWidth(),getHeight());
    switch (type)
    {
      case RECTANGLE:
        g.setColor(Color.BLACK);
        g.drawRect((int)(0.1 * width), (int)(0.1 * height),(int)(0.8 * width), (int)(0.8 * height));
        break;
      case OVAL:
        g.setColor(Color.BLACK);
        g.drawOval((int)(0.1 * width), (int)(0.1 * height),(int)(0.8 * width), (int)(0.8 * height));
        break;
    }
  }
  public void setType(int type) 
  {
    this.type = type;
    repaint();
  }
  public int getType()
  {
    return type;
  }
  public void setColor(int color) 
  {
    this.color = color;
    repaint();
  }
  public int getColor()
  {
    return color;
  }
}





