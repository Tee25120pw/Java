import java.util.Scanner;
public class Lab_9{
  public static void main(String[]args) {
    Scanner sn = new Scanner(System.in);
    System.out.println("------ Tep SHOP -----");
    System.out.println("กรุณากรอกจำนวนที่ต้องการซื้อ");
    System.out.print("สีขาว (เช้า-ก่อนนอน)  =  ");
    int x = sn.nextInt();
    
    System.out.print("สีแดง (ก่อนนอน)  =  ");
    int y = sn.nextInt();
    
    System.out.print("สีฟ้า (เช้า)  =  ");
    int z = sn.nextInt();
    
    int a,b,c,d,t;
    a = 130*x;
    b = 160*y;
    c = 120*z;
    d = 40;
    t = a+b+c+d;
        
    System.out.println("Total = "+t);
  } 
}