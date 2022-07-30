import javax.swing.*;
import java.awt.*;

public class ex8_1d {
public static void main(String[]args) {
    JFrame frame = new JFrame("Exercise");
    JPanel p = new JPanel(new GridLayout(8,8,0,0));
    
    //Row 
     for(int j=0;j<4;j++){
      for(int i=0;i<4;i++){
        JButton btn1 = new JButton("");   
        btn1.setBackground(Color.WHITE);  
        JButton btn2 = new JButton("");   
        btn2.setBackground(Color.BLACK);    
        p.add(btn1);     
        p.add(btn2);}
     
      for(int k=0;k<4;k++){
        JButton btn1 = new JButton("");
        btn1.setBackground(Color.BLACK);
        JButton btn2 = new JButton(""); 
        btn2.setBackground(Color.WHITE);
        p.add(btn1); 
        p.add(btn2);} 
     }    
        
    frame.add(p);
    frame.setSize(500,400);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
} 
     
    
    