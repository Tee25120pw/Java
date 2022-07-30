import java.util.Scanner;

public class Main4 {
 public static void main(String[] args) {
  Scanner sn = new Scanner(System.in); // ���ҧ���������Ѻ�Ѻ��Ҩҡ�պ���
    String a = sn.nextLine();
    int b = sn.nextInt();
    int c;
    c = 2021-b;
    //System.out.print("c ="+c);
    if(c>=18){
      System.out.print("Welcome "+a+" to NongGipsy Pub");       
    }
    if(a.equals("A")) {
      System.out.print("Welcome "+a+" to NongGipsy Pub");
    }
    else if(c<18){
      System.out.print("You shall not pass!");
    }
}
}