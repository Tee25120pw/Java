import javax.swing.*;
import java.awt.*;

class Exercise4 extends JFrame{
  public Exercise4(){
    add(new TwoCircle());
}
  public static void main(String args[]){
    Exercise4 m = new Exercise4();
    m.setSize(200,100);
    m.setVisible(true);
  }
}