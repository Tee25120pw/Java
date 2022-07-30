import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Keyevent{
  private char a;
  public void keyPressed(Keyevent e)
  {
    addKeyListenner(new KeyAdapter(){
        public void keyPressed(KeyEvent e)
        {
          switch (e.getKeyCode()) {
          case KeyEvent.VK_A:
          {
            private class ButtonListener4 implements ActionListener{
              public void actionPerformed(ActionEvent e){
                double n1,n2;
                n1 = Integer.parseInt(num1.getText());
                n2 = Integer.parseInt(num2.getText());
                caculator ca = new caculator(n1,n2);
                re.setText(String.format("%.2f", ca.getAdd()));
              }
            }
          }break;
          }
        }
      });
  }
  public void keyReleased(Keyevent e)
  {
    
  }
  public void keyType(Keyevent e)
  {
    
  }
  public char getKeyChar()
  {
    return a;
  }
}