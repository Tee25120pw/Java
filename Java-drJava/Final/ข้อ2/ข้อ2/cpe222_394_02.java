import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class cpe222_394_02 extends JFrame {
  JButton jbtUp = new JButton("Up");
  JButton jbtDown = new JButton("Down");
  JButton jbtLeft = new JButton("<<");
  JButton jbtRight = new JButton(">>");
  
  square sq = new square();
  
  public cpe222_394_02(){
    //����������������������
    JPanel p1 = new JPanel();
    p1.setLayout(new BorderLayout());
    p1.add(sq ,BorderLayout.CENTER);
    
    //�������������
    JPanel p2 = new JPanel();
    p2.setLayout(new FlowLayout());
    p2.add(jbtUp);
    p2.add(jbtDown);
    p2.add(jbtLeft);
    p2.add(jbtRight);
    p1.add(p2 ,BorderLayout.SOUTH);
    
    add(p1);
    
    //�ͤ��蹻��
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
    
    //�ͤ����鹾����
    sq.setFocusable(true);
    sq.addKeyListener(new KeyAdapter()
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
  
  //�Ҵ����������
  class square extends JPanel{
    
    //�������͹
    private int x;
    private int y;
    
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
    
    //�Ҵ����������
    protected void paintComponent(Graphics g){
     super.paintComponent(g);
     g.setColor(Color.WHITE);
     g.fillRect((getWidth()/8)*2 +x,(getHeight()/8)*2 +y, (getWidth()/8)*3, (getHeight()/8)*3);
     g.setColor(Color.WHITE);
     g.fillRect((getWidth()/8)*3 +x,(getHeight()/8)*3 +y, (getWidth()/8)*3, (getHeight()/8)*3);
     
     g.setColor(Color.BLACK);
     g.drawRect((getWidth()/8)*2 +x,(getHeight()/8)*2 +y, (getWidth()/8)*3, (getHeight()/8)*3);
     g.setColor(Color.BLACK);
     g.drawRect((getWidth()/8)*3 +x,(getHeight()/8)*3 +y, (getWidth()/8)*3, (getHeight()/8)*3);
    }
  }
  
  //main
  public static void main(String[] args){
    JFrame frame = new cpe222_394_02();
    frame.setTitle("ControlSquare");
    frame.setSize(500,500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}