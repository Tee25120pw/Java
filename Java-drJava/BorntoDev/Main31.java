import java.util.Scanner;

public class Main31 {

 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in); // ��С�ȵ���������Ѻ�����Ũҡ�պ���
                String str; // ��С�ȵ���������红�ͤ���

  //System.out.print("Input : ");
                str = scan.nextLine(); // ���Ѻ�����Ţ�ͤ���
  //System.out.print("Output : ");
  for (int i = (str.length() - 1); i >= 0; i--) { // ��� index ������ҧ�ԧ���˹��ش���¡�͹
   System.out.print(str.charAt(i)); // �ʴ�����ѡ�÷��е�ǵ�� index
  }

  System.out.println();
 }
}