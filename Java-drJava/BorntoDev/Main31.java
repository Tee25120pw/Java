import java.util.Scanner;

public class Main31 {

 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in); // ประกาศตัวแปรเพื่อรับข้อมูลจากคีบอร์ด
                String str; // ประกาศตัวแปรเพื่อเก็บข้อความ

  //System.out.print("Input : ");
                str = scan.nextLine(); // รอรับข้อมูลข้อความ
  //System.out.print("Output : ");
  for (int i = (str.length() - 1); i >= 0; i--) { // ตั้ง index เพื่ออ้างอิงตำแหน่งสุดท้ายก่อน
   System.out.print(str.charAt(i)); // แสดงตัวอักษรทีละตัวตาม index
  }

  System.out.println();
 }
}