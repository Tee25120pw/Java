import java.util.Scanner;

public class Main12 {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in); // ���ҧ���������Ѻ�Ѻ��Ҩҡ�պ���
  int count = scan.nextInt(); // ���Ѻ����������㹵���� count
  for (int i = 1; i < count+1; i++) { // �ӹǹ��鹢ͧ�����Դ
   for (int k = 1; k < (i + 1); k++) { // �Ҵ * ������鹷���˹��
    System.out.print("*");
   }
   System.out.println();
  }
  System.out.println(); // ������Ҵ���稷ӡ�â�鹺�÷Ѵ����
 }
}