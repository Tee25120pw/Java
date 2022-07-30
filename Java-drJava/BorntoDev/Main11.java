import java.util.Scanner;

public class Main11 {
 public static void main(String[] args) {

  for (int i = 0; i < 6; i++) { // จำนวนชั้นของปิรามิด
   for (int k = 0; k < (i + 1); k++) { // วาด * เพิ่มขึ้นทีละหนึ่ง
    System.out.print("*");
   }
   System.out.println();
  }
  System.out.println(); // เมื่อวาดเสร็จทำการขึ้นบรรทัดใหม่
 }
}