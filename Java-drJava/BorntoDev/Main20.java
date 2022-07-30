import java.util.Scanner;

public class Main20 {
 public static void main(String[] args) {
  Scanner sn = new Scanner(System.in); // สร้างตัวแปรสำหรับรับค่าจากคีบอร์ด
    String a = sn.nextLine();
    String b = sn.nextLine();
    String c = sn.nextLine();
    String d = sn.nextLine();
    String e = sn.nextLine();
    System.out.println("--- Customer Detail ---");
    System.out.printf("Name : %s %s\n",a,b);
    System.out.printf("Address : %s\n",c);
    System.out.printf("Gender : %s\n",d);
    System.out.printf("Tel : %s\n",e);
 }
}