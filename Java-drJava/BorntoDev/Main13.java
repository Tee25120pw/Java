import java.util.Scanner;

public class Main13 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in); // ���ҧ���������Ѻ�Ѻ��Ҩҡ�պ���
  System.out.println("input :");
  int count = scan.nextInt(); // ���Ѻ����������㹵���� count

  for (int i = 0; i < count; i++) { // �ӹǹ��鹢ͧ�����Դ
   for (int j = 0; j < (count - i - 1); j++) { // �Ҵ��ͧ��ҧŴŧ����˹�� 
    System.out.print(" ");
   }
   for (int k = 0; k < (i + 1); k++) { // �Ҵ * ������鹷����ͧ
    System.out.print("*");
   }
   System.out.println();
  }
  System.out.println();
 }
}