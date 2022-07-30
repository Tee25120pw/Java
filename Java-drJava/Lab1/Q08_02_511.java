import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;

public class Q08_02_511 extends JFrame {
  public Q08_02_511() {
    setTitle("DrawArcs");
    add(new ArcsPanel());
  }
  public static void main(String[]args) {
    Q08_02_511 frame = new Q08_02_511();
    frame.setSize(500,500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

class ArcsPanel extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    int xCenter1 = getWidth()/2;
    int yCenter1 = getHeight()/2;
    int radius1 = (int)(Math.min(getWidth(),getHeight())*0.2);
    
    int x1 = (xCenter1 - radius1);
    int y1 = (yCenter1 - radius1);
    
    int xCenter2 = getWidth()/4;
    int yCenter2 = getHeight()/4;
    int radius2 = (int)(Math.min(getWidth(),getHeight())*0.2);
    
    int x2 = (xCenter2 - radius2)*2;
    int y2 = (yCenter2 - radius2)*2;
    
    g.drawOval(x1,y1,2*radius1,2*radius1);
    g.drawOval(x2,y2,2*radius1,2*radius1);

  }
}
    