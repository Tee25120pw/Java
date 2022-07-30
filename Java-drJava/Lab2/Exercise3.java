import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise3 extends JFrame {
  public Exercise3(){
  Clock clock = new Clock(4,20,45);
  Clock2 clock2 = new Clock2(22,46,15);
  
    setLayout(new GridLayout(1,2));  
    add(clock); 
    add(clock2);
  }

  public static void main(String[]args) {
    Exercise3 frame = new Exercise3();
    frame.setTitle("DisplayClock");
    frame.setSize(400,350);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}