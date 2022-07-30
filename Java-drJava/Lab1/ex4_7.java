import java.util.Scanner;
public class Ex4_7{
  public static void main(String[] args){
    int a,b,c,d,e,f;
    double m,n,o,p,q;
    Scanner sn = new Scanner(System.in);
    System.out.print("Select data type of all number 1.int 2.double:");
    a = sn.nextInt();
    sn.close();
    if(a==1)
    {
      Scanner sn1 = new Scanner(System.in);
      System.out.print("Enter five number");
      b = sn1.nextInt();
      c = sn1.nextInt();
      d = sn1.nextInt();
      e = sn1.nextInt();
      f = sn1.nextInt();
      sn1.close();
      System.out.println("Average value: " +average(b,c,d,e,f));
    }
    else if (a==2)
    {
      Scanner sn2 = new Scanner(System.in);
      System.out.print("Enter five number");
      m = sn2.nextDouble();
      n = sn2.nextDouble();
      o = sn2.nextDouble();
      p = sn2.nextDouble();
      q = sn2.nextDouble();
      sn2.close();
      System.out.println("Average value: " +average(m,n,o,p,q));
    }
  }

  public static int average(int i1, int i2, int i3, int i4, int i5){
    int s;
    s = (i1+i2+i3+i4+i5)/5;
    return (s);
  }
  public static double average(double i1, double i2, double i3, double i4, double i5){
    double z;
    z = (i1+i2+i3+i4+i5)/5;
    return (z);
  }
}