import javax.swing.*;
import java.awt.*;

public class Quiz9_2 {
  public static void main(String[] args) {
    JPanel p = new JPanel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    JPanel p6 = new JPanel();
    JPanel p7 = new JPanel();
    p.setLayout(new BorderLayout());
    
    JLabel l1 = new JLabel("*** กรุณาป้อนข้อมูลเข้าสู่ระบบ ***");
    JLabel l2 = new JLabel("username");
    JLabel l3 = new JLabel("password");
    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
    JTextField t3 = new JTextField();
    JButton b1 = new JButton("Log in");
    JButton b2 = new JButton("Cancel");
    
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
    
    JButton del = new JButton("DEL");
    JButton mul = new JButton("x");
    JButton plus = new JButton("+");
    JButton del1 = new JButton("-");
    JButton div = new JButton("/");
    JButton dot = new JButton("(.)");
    JButton ans = new JButton("Ans");
    JButton ac = new JButton("AC/ON");
    
    String brand[] = {"Ford","Honda","Toyata","Mitsubishi","Mazda","Suzuki"};
    JCheckBox car = new JCheckBox("Car");
    JCheckBox Motorcycle = new JCheckBox("Motorcycle");
    JComboBox combo = new JComboBox(brand);
    
    String num[] = {"300","310","320","330","340","341","365"};
    JRadioButton cpe = new JRadioButton("CPE");
    JRadioButton swu = new JRadioButton("SWU");
    JList num1 = new JList(num);
    num1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    JScrollPane panelist = new JScrollPane(num1);
    
    
    p.add(p1,BorderLayout.WEST);
    p1.add(l1);
    p1.add(l2);
    p1.add(t1);
    p1.add(l3);
    p1.add(t2);
    p1.add(b1);
    p1.add(b2);
    p1.setPreferredSize(new Dimension(220,200));
    
    p.add(p5,BorderLayout.CENTER);
    p5.add(car);
    p5.add(Motorcycle);
    p5.add(combo);
    p5.setPreferredSize(new Dimension(220,100));
    combo.setPreferredSize(new Dimension(220,50));
    
    p.add(p7,BorderLayout.EAST);
    p7.add(cpe);
    p7.add(swu);
    p7.setPreferredSize(new Dimension(200,100));
    num1.setPreferredSize(new Dimension(150,40));
    num1.setVisibleRowCount(2);
    p7.add(panelist);
    
    
    
    p.add(p2,BorderLayout.NORTH);
    p2.setLayout(new GridLayout(1,1));
    p2.add(t3);
    
    p.add(p6,BorderLayout.SOUTH);
    p6.setLayout(new GridLayout(1,1));
    p6.add(p3,BorderLayout.WEST);
    p3.setLayout(new GridLayout(4,3));
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
    
    p.add(p6,BorderLayout.SOUTH);
    p6.add(p4,BorderLayout.EAST);
    p4.setLayout(new GridLayout(4,2));
    p4.add(del);
    p4.add(ac);
    p4.add(mul);
    p4.add(div);
    p4.add(plus);
    p4.add(del1);
    p4.add(dot);
    p4.add(ans);
    
    
    
    
    JFrame f = new JFrame("CPE 320 : Quiz 9 GUI");
    f.add(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(700,300);
    f.setVisible(true);
    f.setLocationRelativeTo(null);
}
}