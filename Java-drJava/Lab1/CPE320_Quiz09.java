import javax.swing.*;
import java.awt.*;
public class CPE320_Quiz09{
  public static void main(String[] arg){
    //// ����á���ҧ Frame 
    JFrame frame = new JFrame("CPE 320 : Quiz09");
        //// �絾���
   // JPanel paneltotal = new JPanel();
  //  paneltotal.setLayout(new BorderLayout());
    JPanel pa_textF = new JPanel();
    JPanel pa_pass = new JPanel();
    JPanel pa_list = new JPanel();
    JPanel pa_combo = new JPanel();
    JPanel pa_button = new JPanel();
    /// textF 
    JTextField text1 = new JTextField(60); // ���ӹǹ�ѡ�� 60 
    pa_textF.add(text1);
    //// �����������Ъ�ͧ�硿�� �ͧ �����������ʼ�ҹ
    JTextField user = new JTextField(10);
    JPasswordField Pass = new JPasswordField(10);
    JButton login = new JButton("Login");
     JButton cancel = new JButton("Cancel");
     /// �Ӿ��� �ͧ pass �ѹ�ҨѴ�Դ���������ͧ�ҡ ��ǹ����� ������ǹ����ѹ���
     pa_pass.setLayout(new GridLayout(3,1));
     ////���ҧ lable ��� ��� ����ѡ��
     JLabel user1 = new JLabel("****��سһ�͹�������������к�****",SwingConstants.CENTER);
     JLabel user2 = new JLabel("username :",SwingConstants.LEFT);
     JLabel user3 = new JLabel("password :",SwingConstants.LEFT);
      /// add user1 to pa_pass 
     pa_pass.add(user1);
     JPanel pa_passin = new JPanel();
     JPanel pa_passin2 = new JPanel();
     ///// passin username [ ]  password [ ] 
     pa_passin.setLayout(new GridLayout(2,2)); // ������ҧ�� 2,2 ������� �� 2 �� 2 �����  ������ͧ lable  user , pass  ��� �Ǣͧ uset��� password----> ��ͧ�� 
     ///�ʹ ��ǹ��ҧ������ pa_passin  ���Ǩе�ͧ add pa_passin ����� pa_pass
     pa_passin.add(user2);
     pa_passin.add(user);
     pa_passin.add(user3);
     pa_passin.add(Pass);
     pa_pass.add(pa_passin);
     ///// passin2  ���� LOGIN , CANCEL
     pa_passin2.setLayout(new GridLayout(1,2));
     pa_passin2.add(login);
     pa_passin2.add(cancel);
     ///  add pa_passin2 to pa_pass 
     pa_pass.add(pa_passin2);
     
//// �ʴ ෤��� �� ���˹����ͤ�Թ ���� 
     
   ///����� list ���
     String list[] = {"300","310","320","330","340","341","365"};
     JList listmain = new JList(list);
     JPanel pa_listin = new JPanel();
     pa_list.setLayout(new GridLayout (3,1));
     JRadioButton  ra1 = new JRadioButton("CPE",true);
     JRadioButton  ra2 = new JRadioButton("SWU");
     ButtonGroup  bg = new ButtonGroup();
     bg.add(ra1);
     bg.add(ra2);
   listmain.setPreferredSize(new Dimension(150,150));
    listmain.setVisibleRowCount(2);
    listmain.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    JScrollPane pa_list2 = new JScrollPane(listmain);
    pa_listin.setLayout(new GridLayout (1,2));
    pa_listin.add(ra1);
    pa_listin.add(ra2);
    pa_list.add(pa_listin);
    pa_list.add(pa_list2);
    
    //// end list 
    //// start combo 
    JPanel pa_comboin  = new  JPanel();
    pa_combo.setLayout(new GridLayout (3,1));
    String list2[] = {"Ford","Honda","Toyota","Mitsubishi","Mazda","Suzuki"};
    JCheckBox cb1 =new JCheckBox("CAR",true);
    JCheckBox cb2 =new JCheckBox("MOTORCYCLE");
    JComboBox com =new JComboBox(list2);
    com.setSelectedItem("Ford");
    com.setMaximumRowCount(6);
    pa_comboin.setLayout(new GridLayout (1,2));
    pa_comboin.add(cb1);
    pa_comboin.add(cb2);
    pa_combo.add(pa_comboin);
    pa_combo.add(com);
    /////// end combo 
    ////// start button
    JButton Button1 = new JButton("1");
    JButton Button2 = new JButton("2");
    JButton Button3 = new JButton("3");
    JButton Button4 = new JButton("4");
    JButton Button5 = new JButton("5");
    JButton Button6 = new JButton("6");
    JButton Button7 = new JButton("7");
    JButton Button8 = new JButton("8");
    JButton Button9 = new JButton("9");
    JButton Button0 = new JButton("0");
    JButton Buttondot = new JButton(".");
    JButton ButtonEXP = new JButton("EXP");
    JButton ButtonDEL = new JButton("DEL");
    JButton ButtonAC = new JButton("AC/On");
    JButton Buttonx = new JButton("x");
    JButton Buttonsub = new JButton("/");
    JButton Buttonplus = new JButton("+");
    JButton Buttonde = new JButton("-");
    JButton Buttondota = new JButton("(.)");
    JButton ButtonAns = new JButton("Ans");
    pa_button.setLayout(new GridLayout (1,2));
    JPanel pa_buttonin = new JPanel();
    JPanel pa_buttonin2 = new JPanel();
    pa_buttonin.setLayout(new GridLayout (4,3));
    pa_buttonin.add(Button1);
    pa_buttonin.add(Button2);                          
    pa_buttonin.add(Button3);
    pa_buttonin.add(Button4);
    pa_buttonin.add(Button5);
    pa_buttonin.add(Button6);
    pa_buttonin.add(Button7);
    pa_buttonin.add(Button8);
    pa_buttonin.add(Button9);
    pa_buttonin.add(Button0);
    pa_buttonin.add(Buttondot);
    pa_buttonin.add(ButtonEXP);
    pa_buttonin2.setLayout(new GridLayout (4,2));
    pa_buttonin2.add(ButtonDEL);
    pa_buttonin2.add(ButtonAC);
    pa_buttonin2.add(Buttonx);
    pa_buttonin2.add(Buttonsub);
    pa_buttonin2.add(Buttonplus);
    pa_buttonin2.add(Buttonde);
    pa_buttonin2.add(Buttondota);
    pa_buttonin2.add(ButtonAns);
    pa_button.add(pa_buttonin);
    pa_button.add(pa_buttonin2);     
    //frame.add(pa_textF,BorderLayout.NORTH);
    //frame.add(pa_pass,BorderLayout.WEST);
    frame.add(pa_list,BorderLayout.EAST);
    //frame.add(pa_combo,BorderLayout.CENTER);
    frame.add(pa_button,BorderLayout.SOUTH);
    frame.setSize(700,300);
    frame.setVisible(true);
  }
}
    
    
    

  
    
    