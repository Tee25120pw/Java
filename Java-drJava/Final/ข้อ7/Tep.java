import java.awt.*;
import javax.swing.*;
public class Tep{
  public static void main(String args[]) {
    JPanel x = new JPanel(); //panel ??ѡ
    JPanel x3 = new JPanel(); //panel ?????????Ţ
    JPanel p3 = new JPanel(); //panel ?????????Ţ
    JPanel p6 = new JPanel(); //panel ??ǹ???????????
    x.setLayout(new BorderLayout()); //?Ѵ???˹??
    JFrame f; JPanel p; JLabel mlbl, ulbl, pwlbl; JTextField usertxt;
    JPasswordField pwtxt; JButton signbtn, resetbtn;
    Font fn1 = new Font("Tahoma", Font.BOLD, 12);
    Font fn2 = new Font("Courier New", Font.BOLD, 14);
    
    f = new JFrame("CPE222 : Frame Layout"); p = new JPanel();
    p6.setLayout(new GridLayout(1,1));
    p6.add(p,BorderLayout.EAST);
    mlbl = new JLabel("*** ??سһ?͹??????????????к? ***");
    ulbl = new JLabel("Username"); pwlbl = new JLabel("Password");
    usertxt = new JTextField(10); pwtxt = new JPasswordField(10);
    signbtn = new JButton("Log in"); resetbtn = new JButton("Cancel");
    JButton a = new JButton("0");
    JButton b = new JButton("1");
    JButton c = new JButton("2");
    JButton d = new JButton("3");
    JButton e = new JButton("4");
    JButton g = new JButton("5");
    JButton h = new JButton("6");
    JButton i = new JButton("7");
    JButton j = new JButton("8");
    JButton k = new JButton("9");
    JButton l = new JButton(".");
    JButton m = new JButton("EXP");
    mlbl.setForeground(Color.red);
    mlbl.setFont(fn1); ulbl.setFont(fn2);
    pwlbl.setFont(fn2); usertxt.setFont(fn1);
    pwtxt.setFont(fn1); signbtn.setFont(fn2);
    resetbtn.setFont(fn2);
    
    //JPanel p = new JPanel();   p.setLayout(new GridLayout(2,2,5,0));
    p6.setLayout(new GridLayout(2,2,5,0)); //???? p6 ???? grid layout ??Ҵ 1*1
    p6.add(p3,BorderLayout.WEST); //?ʹ p3 ???? p6 ???????????ҧ???
    p3.setLayout(new GridLayout(4,3)); // ???ҧ grid layout ????????????Ţ
    p3.add(b);
    p3.add(c);
    p3.add(d);
    p3.add(e);
    p3.add(g);
    p3.add(h);
    p3.add(i);
    p3.add(j);
    p3.add(k);
    p3.add(a);
    p3.add(l);
    p3.add(m);
    
    
    p.add(mlbl); p.add(ulbl); p.add(usertxt);
    p.add(pwlbl); p.add(pwtxt); p.add(signbtn);
    p.add(resetbtn);
    p.add(p3); 
    f.add(p);
    
     
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(250, 150);
    f.setVisible(true);
}
}