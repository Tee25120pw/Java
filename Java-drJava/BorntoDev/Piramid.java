import java.util.Scanner;

public class Piramid {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in); // สร้างตัวแปรสำหรับรับค่าจากคีบอร์ด
  System.out.println("input :");
  int count = scan.nextInt(); // รอรับข้อมูลมาเก็บในตัวแปร count

  for (int i = 0; i < count; i++) { // จำนวนชั้นของปิรามิด
   for (int j = 0; j < (count - i - 1); j++) { // วาดช่องว่างลดลงทีละหนึ่ง 
    System.out.print(" ");
   }
   for (int k = 1; k < ((2 * i) + 2); k++) { // วาด * เพิ่มขึ้นทีละสอง
    System.out.print("*");
   }
   System.out.println();
  }
  System.out.println();
 }
}