import java.util.Scanner;

public class Main19 {
 public static void main(String[] args) {
  Scanner sn = new Scanner(System.in); // สร้างตัวแปรสำหรับรับค่าจากคีบอร์ด
    String a = sn.nextLine();
    
    if(a == a.toUpperCase()){
      a = a.toLowerCase();
    System.out.println(a);}
    
    if(a == a.toLowerCase()){
      a = a.toUpperCase;
    System.out.println(a);}
    }
 
 }
