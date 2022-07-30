import javax.swing.*;
import java.awt.*;
import javax.swing.JComboBox;
import javax.swing.JList;

public class Quiz_9 {
  public static void main(String[] args) {
    JPanel p = new JPanel(); //panel ��ѡ
    JPanel p1 = new JPanel(); //panel ��سһ�͹�������������к�
    JPanel p2 = new JPanel(); //panel text field ��ҹ��
    JPanel p3 = new JPanel(); //panel ���������Ţ
    JPanel p4 = new JPanel(); //panel �����ǡź�ٳ���
    JPanel p5 = new JPanel(); //panel ��ͧ username & password
    JPanel p6 = new JPanel(); //panel ��ǹ����������
    JPanel p7 = new JPanel(); //panel button login cancel
    JPanel p8 = new JPanel(); //panel �ç��ҧ
    JPanel p9 = new JPanel(); //panel car,motorcycle
    JPanel p10 = new JPanel(); //panel �ҧ���
    JPanel p11 = new JPanel(); //panel button cpe,swu
    p.setLayout(new BorderLayout()); //�Ѵ���˹�
    
    //��������ǹ Username
    JLabel l1 = new JLabel("*** ��سһ�͹�������������к� ***",SwingConstants.CENTER); //��������ҧ
    JLabel l2 = new JLabel("username",SwingConstants.LEFT);
    JLabel l3 = new JLabel("password",SwingConstants.LEFT);
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JButton b1 = new JButton("Log in");
    JButton b2 = new JButton("Cancel");
    
    //���� 1-EXP
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
    
    //���� �ǡź�ٳ���
    JButton del = new JButton("DEL");
    JButton mul = new JButton("x");
    JButton plus = new JButton("+");
    JButton del1 = new JButton("-");
    JButton div = new JButton("/");
    JButton dot = new JButton("(.)");
    JButton ans = new JButton("Ans");
    JButton ac = new JButton("AC/ON");
    
    //��������ǹ�ç��ҧ
    String brand[] = {"Ford","Honda","Toyata","Mitsubishi","Mazda","Suzuki"};
    JCheckBox car = new JCheckBox("Car");
    JCheckBox Motorcycle = new JCheckBox("Motorcycle");
    JComboBox combo = new JComboBox(brand);
    
    //�����ŷҧ���
    String num[] = {"300","310","320","330","340","341","365"};
    JRadioButton cpe = new JRadioButton("CPE",true);
    JRadioButton swu = new JRadioButton("SWU");
    JList num1 = new JList(num);
    num1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    JScrollPane panelist = new JScrollPane(num1);
    
    //��ǹ text field �ҧ��ҹ��
    p.add(p2,BorderLayout.NORTH); //��� p2 �����ҹ���ش
    p2.setLayout(new GridLayout(1,1)); //���ҧ grid layout ����ҧ�� ���Ң��¨������仡Ѻ frame ����
    p2.add(t3);
    
    //��ǹ�ҧ��ҹ���� username
    p.add(p1,BorderLayout.WEST);
    p1.setLayout(new GridLayout(3,1)); //���ҧ grid layout ��� ��ǹ���(��س�) ��ǹ��ҧ(��ͧ) ��ǹ����(����)
    p1.add(l1);
    p5.setLayout(new GridLayout(2,2)); //���ҧ grid layout ����ͧ�ç��ҧ
    p5.add(l2);
    p5.add(t1);
    p5.add(l3);
    p5.add(t2);
    p1.add(p5); //�ʹ grid��ͧ ���grid��ѡ
    p7.add(b1);
    p7.add(b2);
    p1.add(p7); //panel button login cancel
    
    //��ǹ�ç��ҧ
    p.add(p8,BorderLayout.CENTER);
    p8.setLayout(new GridLayout(3,1)); //grid layout �ѹ�˭� ����� 3,1 ������ҡѺ grid �ҧ���� ������º���
    p9.setLayout(new GridLayout(1,2)); //grid layout car,motorcycle
    p9.add(car);
    p9.add(Motorcycle);
    p8.add(p9); //add p9 to p8
    p8.add(combo);
      
    
    //��ǹ�ҧ��ҹ���
    p.add(p10,BorderLayout.EAST);
    p10.setLayout(new GridLayout(3,1));
    p11.setLayout(new GridLayout(1,2));
    p11.add(cpe);
    p11.add(swu);
    p10.add(p11);
    p10.add(panelist); 
    
    //��ǹ�ҧ��ҹ��ҧ (��ҹ����)
    p.add(p6,BorderLayout.SOUTH); //��� p6 panel �˭�����ҧ��ҹ��ҧ
    p6.setLayout(new GridLayout(1,1)); //�� p6 �� grid layout ��Ҵ 1*1
    p6.add(p3,BorderLayout.WEST); //�ʹ p3 ��� p6 ����������ҧ���
    p3.setLayout(new GridLayout(4,3)); // ���ҧ grid layout �����������Ţ
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
    
    //��ǹ�ҧ��ҹ��ҧ (��ҹ���)
    p6.add(p4,BorderLayout.EAST); //�ʹ p4 ��� p6 ����������ҧ���
    p4.setLayout(new GridLayout(4,2)); //���ҧ grid layout �������ǡź�ٳ���
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