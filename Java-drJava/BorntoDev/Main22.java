import java.util.Scanner;

public class Main22 {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); // ��С�ȵ���÷�����Ѻ��Ҩҡ�պ���      
      long result = 1;
      int n = scan.nextInt(); // �Ѻ��Ҩҡ�պ�������㹵���� n

      for (int i = n; i >= 1; i--) { // n! = n * (n - 1) * (n - 2) * ... * 1
         result *= i; // ǹ�ٻ�ӼŤٳ���������� result
      }
      System.out.println(+ result); // �ʴ����Ѿ�� Factorial
   }
}