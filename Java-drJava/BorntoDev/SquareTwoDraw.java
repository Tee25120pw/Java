import java.util.Scanner;

public class SquareTwoDraw {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in); // ���ҧ���������Ѻ�Ѻ��Ҩҡ�պ���
  int count = scan.nextInt(); // ���Ѻ����������㹵���� count
  for (int i = 0; i < count; i++) { // �Ǻ����ӹǹ��÷Ѵ��ҡѺ count
   for (int j = 0; j < count; j++) { // �Ǻ����ӹǹ�����Ҵ���к�÷Ѵ
    if (i == 0 || i == (count - 1)) { // ��÷Ѵ�á��к�÷Ѵ�ش����
     System.out.print("#");
    } else {
     if (j == 0 || j == (count - 1)) { // ���˹��á��е��˹��ش����
      System.out.print("#");
     } else {
      System.out.print(" ");
     }}}
   System.out.println();
  }
  System.out.println();
 }
}