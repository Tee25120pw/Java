/*
// กระดาษแผ่นที่1 กับ 2 อยู่คนละหน้ากัน
import java.util.Scanner;
public class ex5{
  public static void main(String[] args){
    int n;
    Scanner sn = new Scanner(System.in);
    System.out.print("input your raduis: ");
    n = sn.nextInt();
    sn.close();
    Circle cp = new Circle(n);
    System.out.println("Circle Area = "+cp.getArea());
    System.out.println("Circle Volume = "+cp.getVolume());
    System.out.println("Circle Circumference = "+cp.getCircumference());
  }
}
*/






import java.util.Scanner;
public class ex5{
  public static void main(String[] args){
    double n,m,o;
    Scanner sn = new Scanner(System.in);
    System.out.print("input s1,s2,s3 :");
    n = sn.nextDouble();
    m = sn.nextDouble();
    o = sn.nextDouble();
    sn.close();
    Triangle cp = new Triangle(n,m,o);
    System.out.println("Triangle area = "+cp.getArea());
    System.out.println("Triangle perimeter = "+cp.getPerimeter());
  }
}
