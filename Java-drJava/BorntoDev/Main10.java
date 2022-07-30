import java.util.Scanner;

public class Main10 {
 public static void main(String[] args) {
  Scanner sn = new Scanner(System.in); // สร้างตัวแปรสำหรับรับค่าจากคีบอร์ด
    int a = sn.nextInt();
    int b = sn.nextInt();
    System.out.printf("%d + %d = %d\n",a,b,(a+b));
    System.out.printf("%d - %d = %d\n",a,b,(a-b));
    System.out.printf("%d * %d = %d\n",a,b,(a*b));
    System.out.printf("%d / %d = %d\n",a,b,(a/b));
 }
}