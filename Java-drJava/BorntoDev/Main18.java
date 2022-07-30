import java.util.Scanner;

public class Main18 {
 public static void main(String[] args) {
  Scanner sn = new Scanner(System.in); // สร้างตัวแปรสำหรับรับค่าจากคีบอร์ด
  double x =0;
    double a = sn.nextDouble();
    double b = sn.nextDouble();
    double c = sn.nextDouble();
    double d = sn.nextDouble();
    double e = sn.nextDouble();
    x = (a+b+c+d+e)/5;
    
    System.out.println("THAI = "+a);
    System.out.println("MATH = "+b);
    System.out.println("ENGLISH = "+c);
    System.out.println("SCIENCE = "+d);
    System.out.println("SPORT = "+e);
    System.out.println("---");
    System.out.println("GPA = "+x);

 }
}