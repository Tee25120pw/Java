import java.util.Scanner;
public class Q4_3
{ public static void main(String[]asrg)
  {Scanner s = new Scanner(System.in);
   double inner radius,outer radius,inner height,outer height,i;
   System.out.print("Enter value of inner radius: ");
   inner radius = s.nextDouble();
   System.out.print("Enter value of outer radius: ");
   outer radius = s.nextDouble();
   System.out.print("Enter inner height: ");
   inner height = s.nextDouble();
   System.out.print("Enter outer height: ");
   outer height = s.nextDouble();
 
   i = rectangleBoxVolumeDif (length, width, deptOut, deptIn);
   System.out.printf("The different volume of 2 Circular Cones is: %.2f",rectangleBoxVolumeDif);
  }

 public static double rectangleBoxVolumeDif (double length, double width, double deptOut, double deptIn)
  {
    return (width*length*(deptOut-deptIn));
    
  }
}
   
   