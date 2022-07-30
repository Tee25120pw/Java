import java.util.Scanner;
public class Q4_1
{ public static void main(String[]asrg)
  {Scanner s = new Scanner(System.in);
   double width,length,deptIn,deptOut,rectangleBoxVolumeDif;
   System.out.print("Enter value of width: ");
   width = s.nextDouble();
   System.out.print("Enter value of length: ");
   length = s.nextDouble();
   System.out.print("Enter inner depth: ");
    deptIn = s.nextDouble();
   System.out.print("Enter outer depth: ");
    deptOut = s.nextDouble();
 
   rectangleBoxVolumeDif = rectangleBoxVolumeDif (length, width, deptOut, deptIn);
   System.out.printf("The different volume of 2 Rectangle Boxes is: %.1f",rectangleBoxVolumeDif);
  }

 public static double rectangleBoxVolumeDif (double length, double width, double deptOut, double deptIn)
  {
    return (width*length*(deptOut-deptIn));
    
  }
}
   
   