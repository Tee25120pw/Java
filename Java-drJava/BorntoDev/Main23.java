import java.util.Scanner;

public class Main23 {
 public static void main(String[] args) {
  for (int i = 0; i < 5; i++) { // �ӹǹ��鹢ͧ�����Դ
   for (int j = 0; j < (5-i-1); j++) { // �Ҵ��ͧ��ҧŴŧ����˹�� 
    System.out.print(" ");
   }
   for (int k = 0; k < (i + 1); k++) { // �Ҵ * ������鹷����ͧ
    System.out.print("$ ");
   }
   System.out.println();
  }
 }
}