import java.util.Scanner;
public class Q4G1
{ public static void main(String[]asrg)
  {Scanner s = new Scanner(System.in);
   double spv;
   System.out.print("Enter inner radius: ");
   int radiusIn = s.nextInt();
   System.out.print("Enter value of length ");
   int radiusOut = s.nextInt();
   System.out.print("Enter inner depth: ");
   int radiusOut = s.nextInt();
   System.out.print("Enter outer depth: ");
   int radiusOut = s.nextInt();
   spv = sphereVolumeDif(radiusOut,radiusIn);
   System.out.printf("The different value of 2 sphere volume is: %.2f",spv);
   s.close();
  }

  public static double sphereVolumeDif(double radiusOut,double radiusIn)
  {
    return (l*w*d);
    
  }
}
   
   