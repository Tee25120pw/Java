import java.util.Scanner;

public class Main17 {
 public static void main(String[] args) {
  Scanner sn = new Scanner(System.in); // สร้างตัวแปรสำหรับรับค่าจากคีบอร์ด
    int a = sn.nextInt();
    int b = sn.nextInt();
    if(a>b){
      System.out.println("A");}
    else if(a==b){
      System.out.println("AB");}
    else if(a<b){
      System.out.println("B");}
 }
}