
/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class ex10 extends JFrame {
  private JTextField num1 = new JTextField(5);
  private JTextField num2 = new JTextField(5);
  private JTextField re = new JTextField(5);
  private JButton b1 = new JButton("Add");
  private JButton b2 = new JButton("Subtract");
  private JButton b3 = new JButton("Multiply");
  private JButton b4 = new JButton("Divide");
  public ex10()
  {
    JPanel p1 = new JPanel(new FlowLayout());
    p1.add(new JLabel("Number 1"));
    p1.add(num1);
    p1.add(new JLabel("Number 2"));
    p1.add(num2);
    p1.add(new JLabel("Result"));
    p1.add(re);
    p1.add(b1); p1.add(b2);
    p1.add(b3); p1.add(b4);
    add(p1);
    b1.addActionListener(new ButtonListener());
    b2.addActionListener(new ButtonListener1());
    b3.addActionListener(new ButtonListener2());
    b4.addActionListener(new ButtonListener3());
  }
  private class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      double n1,n2;
      n1 = Integer.parseInt(num1.getText());
      n2 = Integer.parseInt(num2.getText());
      caculator ca = new caculator(n1,n2);
      re.setText(String.format("%.2f", ca.getAdd()));
    }
  }
  private class ButtonListener1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      double n1,n2;
      n1 = Integer.parseInt(num1.getText());
      n2 = Integer.parseInt(num2.getText());
      caculator ca = new caculator(n1,n2);
      re.setText(String.format("%.2f", ca.getSubtract()));
    }
  }
  private class ButtonListener2 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      double n1,n2;
      n1 = Integer.parseInt(num1.getText());
      n2 = Integer.parseInt(num2.getText());
      caculator ca = new caculator(n1,n2);
      re.setText(String.format("%.2f", ca.getMultiply()));
    }
  }
   private class ButtonListener3 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      double n1,n2;
      n1 = Integer.parseInt(num1.getText());
      n2 = Integer.parseInt(num2.getText());
      caculator ca = new caculator(n1,n2);
      re.setText(String.format("%.2f", ca.getDivide()));
    }
  }
  public static void main(String[] args)
  {
    ex10 frame = new ex10();
    frame.setTitle("Excercise10");
    frame.setSize(400,130);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
*/


/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class ex10 extends JFrame {
  private CirclePanel c = new CirclePanel();
  public ex10()
  {
    this.add(c);
    c.setFocusable(true);
  }
  public static void main(String[] args)
  {
    ex10 frame = new ex10();
    frame.setTitle("Excercise10");
    frame.setSize(400,400);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  
  static class CirclePanel extends JPanel{
    private int r = 15;
    private int x = 50; 
    private int y = 50;
    public CirclePanel()
    {
      addKeyListener(new KeyAdapter(){
        public void keyPressed(KeyEvent e) 
        {
          switch (e.getKeyCode())  //ตัวลูกศร
          {
            case KeyEvent.VK_DOWN: y += 10; break;
            case KeyEvent.VK_UP: y -= 10; break;
            case KeyEvent.VK_LEFT: x -= 10; break;
            case KeyEvent.VK_RIGHT: x += 10; break;
          }
          repaint();
        }
      });    
    }
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawOval(x, y, 2 * r, 2 *r);
    }
  }
}
*/
  

  
  
/*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class ex10 extends JFrame{
  private JRadioButton r1 = new JRadioButton("Red",true);
  private JRadioButton r2 = new JRadioButton("Yellow");
  private JRadioButton r3 = new JRadioButton("White");
  private JRadioButton r4 = new JRadioButton("Gray");
  private JRadioButton r5 = new JRadioButton("Green");
  private JRadioButton r6 = new JRadioButton("Rectangle",true);
  private JRadioButton r7 = new JRadioButton("Oval");
  private FigurePanel fp = new FigurePanel();
  public ex10()
  {
    JPanel p = new JPanel(new BorderLayout());
    JPanel p1 = new JPanel(new FlowLayout());
    // NORTH
    p.add(p1, BorderLayout.NORTH);
    ButtonGroup bg1 = new ButtonGroup();
    bg1.add(r1); bg1.add(r2); bg1.add(r3);
    bg1.add(r4); bg1.add(r5);
    p1.add(r1); p1.add(r2); p1.add(r3);
    p1.add(r4); p1.add(r5);
    // CENTER
    p.add(fp, BorderLayout.CENTER);
    // SOUTH
    JPanel p3 = new JPanel(new FlowLayout());
    ButtonGroup bg2 = new ButtonGroup();
    p.add(p3, BorderLayout.SOUTH);
    p3.add(r6); p3.add(r7);
    bg2.add(r6); bg2.add(r7);
    //addActionListener
    r6.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        fp.setType(2);
      }
    });
    r7.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        fp.setType(4);
      }
    });
    r1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        fp.setColor(10);
      }
    });
    r2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        fp.setColor(20);
      }
    });
    r3.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        fp.setColor(30);
      }
    });
    r4.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        fp.setColor(40);
      }
    });
    r5.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        fp.setColor(50);
      }
    });
    add(p);
  }
  public static void main(String[] args)
  {
    ex10 f = new ex10();
    f.setLocationRelativeTo(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(400, 200);
    f.setVisible(true);
  }
}
*/
 