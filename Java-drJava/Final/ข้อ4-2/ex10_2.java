import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class ex10_2 extends JFrame {
  private CirclePanel c = new CirclePanel();
  private JButton b1 = new JButton("<<");
  private JButton b2 = new JButton(">>");
  private JButton b3 = new JButton("Up");
  private JButton b4 = new JButton("Down");
    
  public ex10_2()
  {
    this.add(c);
    c.setFocusable(true);
    add(b1); add(b2); add(b3); add(b4);
    b1.addActionListener(new ButtonListener1());
    b2.addActionListener(new ButtonListener2());
    b3.addActionListener(new ButtonListener3());
    b4.addActionListener(new ButtonListener4());
  }
  
  private class ButtonListener implements ActionListener1{
    public void actionPerformed(ActionEvent e){
      switch (e.getKeyCode())  //ตัวลูกศร
          {
            case KeyEvent.VK_LEFT: x -= 10; break;
            
          }
    }}
  private class ButtonListener implements ActionListener2{
    public void actionPerformed(ActionEvent e){
      switch (e.getKeyCode())  //ตัวลูกศร
          {
            case KeyEvent.VK_RIGHT: x += 10; break;
            
          }
    }}
  private class ButtonListener implements ActionListener3{
    public void actionPerformed(ActionEvent e){
      switch (e.getKeyCode())  //ตัวลูกศร
          {
            case KeyEvent.VK_UP: y -= 10; break;
            
          }
    }}
  private class ButtonListener implements ActionListener4{
    public void actionPerformed(ActionEvent e){
      switch (e.getKeyCode())  //ตัวลูกศร
          {
            case KeyEvent.VK_DOWN: y += 10; break;
            
          }
    }}
  
  public static void main(String[] args)
  {
    ex10_2 frame = new ex10_2();
    frame.setTitle("Excercise10");
    frame.setSize(400,400);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  
  static class CirclePanel extends JPanel{
    private int r = 100;
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