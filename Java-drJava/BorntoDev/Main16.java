import java.util.Scanner;

public class Main16 {

 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in); // ��С�ȵ���������Ѻ�����Ũҡ�պ���
  int num1, num2, num3; // ��С�ȵ���������纵���Ţ 3 ���

                num1 = scan.nextInt(); // ���Ѻ�����ŵ���Ţ��� 1

                num2 = scan.nextInt(); // ���Ѻ�����ŵ���Ţ��� 2

                num3 = scan.nextInt(); // ���Ѻ�����ŵ���Ţ��� 3

  int max = num1; // �纤�ҵ���Ţ��� 1 ���㹵���� max �͡����պ���º�Ѻ������
  if (num2 > max) { // ���º��º����Ţ��� 2 ��ҵ���Ţ��� 2 �ҡ�����纤�ҷ���ҡ�������� max
   max = num2; 
  }
  if (num3 > max) { // ���º��º����Ţ��� 3 ��ҵ���Ţ��� 3 �ҡ�����纤�ҷ���ҡ�������� max
   max = num3; 
  }
  System.out.println("MAX : " + max); // �ʴ���ҵ���� max
 }
}