import java.util.Scanner;

public class Main25{
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in); // ���ҧ���������Ѻ�Ѻ��Ҩҡ�պ���
  int count = scan.nextInt(); // ���Ѻ����������㹵���� count
  int x,i,sum = 0;
  for (i = 0; i < count; i++) { // �ӹǹ��鹢ͧ�����Դ
    x = scan.nextInt();
    sum = sum+x;
   }
  System.out.printf("%d THB",sum);
 }
}