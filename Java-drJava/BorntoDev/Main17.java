import java.util.Scanner;

public class Main17 {
 public static void main(String[] args) {
  Scanner sn = new Scanner(System.in); // ���ҧ���������Ѻ�Ѻ��Ҩҡ�պ���
    int a = sn.nextInt();
    int b = sn.nextInt();
    if(a>b){
      System.out.println("A");}
    else if(a==b){
      System.out.println("AB");}
    else if(a<b){
      System.out.println("B");}
 }
}