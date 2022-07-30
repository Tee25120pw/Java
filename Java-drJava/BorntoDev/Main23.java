import java.util.Scanner;

public class Main23 {
 public static void main(String[] args) {
  for (int i = 0; i < 5; i++) { // จำนวนชั้นของปิรามิด
   for (int j = 0; j < (5-i-1); j++) { // วาดช่องว่างลดลงทีละหนึ่ง 
    System.out.print(" ");
   }
   for (int k = 0; k < (i + 1); k++) { // วาด * เพิ่มขึ้นทีละสอง
    System.out.print("$ ");
   }
   System.out.println();
  }
 }
}