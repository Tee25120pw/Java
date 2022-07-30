import java.util.Scanner;
public class Q04_02_512 
{ public static void main(String[]asrg)
  {Scanner sn = new Scanner(System.in);
   double m,a,b,c,r,i,j;
   System.out.print("Enter m,a,b,c,r : ");
   m =sn.nextDouble();
   a =sn.nextDouble();
   b =sn.nextDouble();
   c =sn.nextDouble();
   r =sn.nextDouble();
   i = calForce(m,a);
   j = calForce(b,c,r);
   System.out.printf("F = ma = %f \n",i);
   System.out.printf("F = Gbc/r2 = %f \n",j);
  }

  public static double calForce(double m,double a)
  {
    return (m*a);
  }  
  public static double calForce(double b,double c,double r)
  {
    return (6.67f*(Math.pow(10,-11))*b*c/Math.pow(r,2));
  }
}
