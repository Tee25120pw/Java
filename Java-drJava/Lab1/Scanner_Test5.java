import java.util.Scanner;
public class Scanner_Test5 {
public static void main(String [] args) {
  int x,a,b,c,y; 
  Scanner sn = new Scanner(System.in);
  System.out.print("> Enter an integer between 000 and 999: ");
  x = sn.nextInt();
  a = x/100;     /* ��ѡ���� */
  b = (x/10)%10;  /* ��ѡ�Ժ */
  c = x%10;       /* ��ѡ˹��� */
  y = a*b*c;
  System.out.printf("> The product of digits is %d",y);
}
}