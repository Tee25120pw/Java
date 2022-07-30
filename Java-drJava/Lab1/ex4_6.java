import java.util.Scanner;
public class Ex4_6{
  public static void main(String[] args){
    double a,b,c,d;
    int m,n,o,p;
    Scanner sn = new Scanner(System.in);
    System.out.print("Distance value of point(x1,y1): ");
    a = sn.nextDouble();
    b = sn.nextDouble();
    System.out.print("Distance value of point(x2,y2): ");
    c = sn.nextDouble();
    d = sn.nextDouble();
    sn.close();
    m =(int)a;
    n =(int)b;
    o =(int)c;
    p =(int)d;
    System.out.printf("The distance value of point (%d,%d) and point (%d,%d) is %d\n",m,n,o,p,distance(m,n,o,p));
    System.out.printf("The distance value of point (%.1f,%.1f) and point (%.1f,%.1f) is %f",a,b,c,d,distance(a,b,c,d));
  }
  public static int distance(int x1, int y1, int x2, int y2){
    int y,z;
    y = (int)(Math.pow(x2-x1,2))+(int)(Math.pow(y2-y1,2));
    z= (int)Math.sqrt(y);
    return (z);
  }
  public static double distance(double x1, double y1, double x2, double y2){
    double k,x;
    k = (Math.pow(x2-x1,2))+(Math.pow(y2-y1,2));
    x = Math.sqrt(k);
    return (x);
  }
}