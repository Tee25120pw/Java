import java.util.Scanner;
public class Ex4_2{
  public static void main(String[] args){
    int b;
    float a;
    Scanner sn = new Scanner(System.in);
    System.out.print("input the length (s): ");
    a = sn.nextFloat();
    System.out.print("input the number of length (n): ");
    b = sn.nextInt();
    sn.close();
    System.out.println(area(b,a));
  }
  public static double area(int n,double s){
    double m,p,i,j;
    i = (Math.PI)/n;
    j = (i)*(180/Math.PI);
    p = (4)*(Math.tan(j));
    m = (n*s*s)/p;
    System.out.println(i);
    System.out.println(j);
    return (m);
  }
}