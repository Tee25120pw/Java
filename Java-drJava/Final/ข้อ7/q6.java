import java.awt.*;
import javax.swing.*;
public class q6{
  public static void main(String args[]){
    //?????? lable???? ????? ????????????????
    JLabel mlbl, ulbl, pwlbl;
    JTextField usertxt;
    JPasswordField pwtxt;
    JButton signbtn, resetbtn;
    
    JFrame f = new JFrame("CPE 222 : Frame Layout");
    
    JButton jbt1 = new JButton("1");
    JButton jbt2 = new JButton("2");
    JButton jbt3 = new JButton("3");
    JButton jbt4 = new JButton("4");
    JButton jbt5 = new JButton("5");
    JButton jbt6 = new JButton("6");
    JButton jbt7 = new JButton("7");
    JButton jbt8 = new JButton("8");
    JButton jbt9 = new JButton("9");
    JButton jbt0 = new JButton("0");
    JButton jbt11 = new JButton(".");
    JButton jbtEXP = new JButton("EXP");
    
    JTextField f1 = new JTextField(6);
//    JTextField f2 = new JTextField(6);
//    JTextField f3 = new JTextField(6);
    
    
mlbl = new JLabel("*** ��سһ�͹�������������к� ***");
ulbl = new JLabel("Username");
pwlbl = new JLabel("Password");

usertxt = new JTextField(10);
pwtxt = new JPasswordField(10);

signbtn = new JButton("Log in");
resetbtn = new JButton("Cancel");

mlbl.setForeground(Color.RED);

//?????????
//    Font fn1 = new Font("Tahoma", Font.BOLD, 12);
//    Font fn2 = new Font("Courier New", Font.BOLD, 14);

//mlbl.setFont(fn1); 
//ulbl.setFont(fn2);
//pwlbl.setFont(fn2); 
//usertxt.setFont(fn1);
//pwtxt.setFont(fn1); 
//signbtn.setFont(fn2);
//resetbtn.setFont(fn2);

    JPanel p = new JPanel();

    p.setLayout(new BorderLayout());
    
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(4,3));
    
    JPanel p2 = new JPanel();
    p2.setLayout(new FlowLayout());
    
    p.add(f1,BorderLayout.SOUTH);
    p.add(p2,BorderLayout.CENTER);
    p.add(p1,BorderLayout.NORTH);
    p1.add(jbt1);
    p1.add(jbt2);
    p1.add(jbt3);
    p1.add(jbt4);
    p1.add(jbt5);
    p1.add(jbt6);
    p1.add(jbt7);
    p1.add(jbt8);
    p1.add(jbt9);
    p1.add(jbt0);
    p1.add(jbt11);
    p1.add(jbtEXP);
    
    p2.add(mlbl);
    p2.add(ulbl);
    p2.add(usertxt);
    p2.add(pwlbl);
    p2.add(pwtxt);
    p2.add(signbtn);
    p2.add(resetbtn);
   f.add(p);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLocationRelativeTo(null);
f.setSize(250, 280);
f.setVisible(true);
}
}