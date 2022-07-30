import javax.swing.*;
import java.awt.*;
import javax.swing.JComboBox;
import javax.swing.JList;

public class Quiz_9 {
  public static void main(String[] args) {
    JPanel p = new JPanel(); //panel หลัก
    JPanel p1 = new JPanel(); //panel กรุณาป้อนข้อมูลเข้าสู่ระบบ
    JPanel p2 = new JPanel(); //panel text field ด้านบน
    JPanel p3 = new JPanel(); //panel ปุ่มหมายเลข
    JPanel p4 = new JPanel(); //panel ปุ่มบวกลบคูณหาร
    JPanel p5 = new JPanel(); //panel ช่อง username & password
    JPanel p6 = new JPanel(); //panel ส่วนปุ่มทั้งหมด
    JPanel p7 = new JPanel(); //panel button login cancel
    JPanel p8 = new JPanel(); //panel ตรงกลาง
    JPanel p9 = new JPanel(); //panel car,motorcycle
    JPanel p10 = new JPanel(); //panel ทางขวา
    JPanel p11 = new JPanel(); //panel button cpe,swu
    p.setLayout(new BorderLayout()); //จัดตำแหน่ง
    
    //ข้อมูลส่วน Username
    JLabel l1 = new JLabel("*** กรุณาป้อนข้อมูลเข้าสู่ระบบ ***",SwingConstants.CENTER); //ให้อยู่กลาง
    JLabel l2 = new JLabel("username",SwingConstants.LEFT);
    JLabel l3 = new JLabel("password",SwingConstants.LEFT);
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JButton b1 = new JButton("Log in");
    JButton b2 = new JButton("Cancel");
    
    //ปุ่ม 1-EXP
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
    
    //ปุ่ม บวกลบคูณหาร
    JButton del = new JButton("DEL");
    JButton mul = new JButton("x");
    JButton plus = new JButton("+");
    JButton del1 = new JButton("-");
    JButton div = new JButton("/");
    JButton dot = new JButton("(.)");
    JButton ans = new JButton("Ans");
    JButton ac = new JButton("AC/ON");
    
    //ข้อมูลส่วนตรงกลาง
    String brand[] = {"Ford","Honda","Toyata","Mitsubishi","Mazda","Suzuki"};
    JCheckBox car = new JCheckBox("Car");
    JCheckBox Motorcycle = new JCheckBox("Motorcycle");
    JComboBox combo = new JComboBox(brand);
    
    //ข้อมูลทางขวา
    String num[] = {"300","310","320","330","340","341","365"};
    JRadioButton cpe = new JRadioButton("CPE",true);
    JRadioButton swu = new JRadioButton("SWU");
    JList num1 = new JList(num);
    num1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    JScrollPane panelist = new JScrollPane(num1);
    
    //ส่วน text field ทางด้านบน
    p.add(p2,BorderLayout.NORTH); //ให้ p2 อยู่ด้านบนสุด
    p2.setLayout(new GridLayout(1,1)); //สร้าง grid layout ให้ข้างบน เวลาขยายจะได้ขยายไปกับ frame ด้วย
    p2.add(t3);
    
    //ส่วนทางด้านซ้าย username
    p.add(p1,BorderLayout.WEST);
    p1.setLayout(new GridLayout(3,1)); //สร้าง grid layout ให้ ส่วนหัว(กรุณา) ส่วนกลาง(ช่อง) ส่วนท้าย(ปุ่ม)
    p1.add(l1);
    p5.setLayout(new GridLayout(2,2)); //สร้าง grid layout ให้ช่องตรงกลาง
    p5.add(l2);
    p5.add(t1);
    p5.add(l3);
    p5.add(t2);
    p1.add(p5); //แอด gridช่อง เข้าgridหลัก
    p7.add(b1);
    p7.add(b2);
    p1.add(p7); //panel button login cancel
    
    //ส่วนตรงกลาง
    p.add(p8,BorderLayout.CENTER);
    p8.setLayout(new GridLayout(3,1)); //grid layout อันใหญ่ ที่ใช้ 3,1 จะได้เท่ากับ grid ทางซ้าย เป็นระเบียบเก๋ๆ
    p9.setLayout(new GridLayout(1,2)); //grid layout car,motorcycle
    p9.add(car);
    p9.add(Motorcycle);
    p8.add(p9); //add p9 to p8
    p8.add(combo);
      
    
    //ส่วนทางด้านขวา
    p.add(p10,BorderLayout.EAST);
    p10.setLayout(new GridLayout(3,1));
    p11.setLayout(new GridLayout(1,2));
    p11.add(cpe);
    p11.add(swu);
    p10.add(p11);
    p10.add(panelist); 
    
    //ส่วนทางด้านล่าง (ด้านซ้าย)
    p.add(p6,BorderLayout.SOUTH); //ให้ p6 panel ใหญ่อยู่ทางด้านล่าง
    p6.setLayout(new GridLayout(1,1)); //แบ่ง p6 เป็น grid layout ขนาด 1*1
    p6.add(p3,BorderLayout.WEST); //แอด p3 เข้า p6 และให้อยู่ทางขวา
    p3.setLayout(new GridLayout(4,3)); // สร้าง grid layout ให้ปุ่มหมายเลข
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
    
    //ส่วนทางด้านล่าง (ด้านขวา)
    p6.add(p4,BorderLayout.EAST); //แอด p4 เข้า p6 และให้อยู่ทางขวา
    p4.setLayout(new GridLayout(4,2)); //สร้าง grid layout ให้ปุ่มบวกลบคูณหาร
    p4.add(del);
    p4.add(ac);
    p4.add(mul);
    p4.add(div);
    p4.add(plus);
    p4.add(del1);
    p4.add(dot);
    p4.add(ans);
    
    //main
    JFrame f = new JFrame("CPE 320 : Quiz 9 GUI");
    f.add(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(700,300);
    f.setVisible(true);
    f.setLocationRelativeTo(null);
}
}