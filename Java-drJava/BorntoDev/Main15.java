import java.util.Scanner;

public class Main15 {
 public static void main(String[] args) {
  Scanner sn = new Scanner(System.in); // สร้างตัวแปรสำหรับรับค่าจากคีบอร์ด
    int a = sn.nextInt();
    int b = sn.nextInt();
    System.out.println("MAX : "+ Math.max(a,b));
    System.out.println("MIN : "+ Math.min(a,b));
 }
}