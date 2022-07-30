import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class cpe222_453_02 extends JFrame {
  JButton jbtUp = new JButton("Up");
  JButton jbtDown = new JButton("Down");
  JButton jbtLeft = new JButton("<<");
  JButton jbtRight = new JButton(">>");
  
  square sq = new square();
  
  public class cpe222_453_02{
    //ใส่สี่เหลี่ยมไว้เซ็นเตอร์
    JPanel p1 = new JPanel();
    p1.setLayout(new BorderLayout());
    p1.add(sq ,BorderLayout.CENTER);
    
    //ใส่ปุ่มไว้ทิศใต้
    JPanel p2 = new JPanel();
    p2.setLayout(new FlowLayout());
    p2.add(jbtUp);
    p2.add(jbtDown);
    p2.add(jbtLeft);
    p2.add(jbtRight);
    p1.add(p2 ,BorderLayout.SOUTH);
    
    add(p1);
    
    //แอคชั่นปุ่น
    jbtUp.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        sq.requestFocusInWindow();
        sq.up();
        repaint();
      }
    });
    jbtDown.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        sq.requestFocusInWindow();
        sq.down();
        repaint();
      }
    });
    jbtLeft.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        sq.requestFocusInWindow();
        sq.left();
        repaint();
      }
    });
    jbtRight.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        sq.requestFocusInWindow();
        sq.right();
        repaint();
      }
    });
    
    //แอคชั่นแป้นพิมพ์
    tri.setFocusable(true);
    tri.addKeyListener(new KeyAdapter()
     {
     public void keyPressed(KeyEvent e)
      {
       switch(e.getKeyCode())
        {
          case KeyEvent.VK_UP:sq.up();
          repaint();
          break;
          case KeyEvent.VK_DOWN:sq.down();
          repaint();
          break;
          case KeyEvent.VK_LEFT:sq.left();
          repaint();
          break;
          case KeyEvent.VK_RIGHT:sq.right();
          repaint();
          break;
        }
       }
      });
  }
  
  //วาดสี่เหลี่ยม
  class square{
    
    //ไว้เลื่อน
    private ing x;
    private ing y;
    
    public void up(){
      y--;
      repaint();
    }
    public void down(){
      y++;
      repaint();
    }
    public void left(){
      x--;
      repaint();
    }
    public void right(){
      x++;
      repaint();
    }
    
    //วาดสี่เหลี่ยม
    protected void paintComponent(Graphics g){
     super.paintComponent(g);
     g.drawRect((getWigth()/8)*2 +x,(gerHeight()/8)*2 +y, (getWigth()/8)*3, (gerHeight()/8)*3);
     g.drawRect((getWigth()/8)*3 +x,(gerHeight()/8)*3 +y, (getWigth()/8)*3, (gerHeight()/8)*3);
    }
  }
  
  //main
  public static void main(String[] args){
    JFrame f = new polygon2();
    f.setTitle("ControlSquare");
    f.setSize(500,500);
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}