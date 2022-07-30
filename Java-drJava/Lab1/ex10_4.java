import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_4 extends JFrame {
  private ClockEX4 clock = new ClockEX4(); 
  private JButton jbtStart = new JButton("Start");
  private JButton jbtStop = new JButton("Stop");
  Timer timer = new Timer(1000,new TimerListener());
  
  public ex10_4() {
    timer.start();
    JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
    p1.add(clock);
    
    JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER)); 
    p2.add(jbtStart);
    p2.add(jbtStop);
    
    add(p1, BorderLayout.CENTER);
    add(p2, BorderLayout.SOUTH);
    
    jbtStart.addActionListener(new CloseStart());
    jbtStop.addActionListener(new CloseStop());
  }
  
class CloseStart implements ActionListener{
public void actionPerformed(ActionEvent e){
timer.start();
}
}

class CloseStop implements ActionListener{
public void actionPerformed(ActionEvent e){
timer.stop();
}
}

private class TimerListener implements ActionListener{
public void actionPerformed(ActionEvent e){
clock.setCurrentTime();
clock.repaint();
}
}

  
  public static void main(String[]args) {
    JFrame frame = new Exercise4();
    frame.setTitle("Exercise");
    frame.setSize(300,300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}  