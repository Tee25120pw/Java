import java.util.Scanner;
public class Q4
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
   
/*
import java.util.Scanner;
public class Q4
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
   
   
import java.util.Scanner;
public class Q4
{ public static void main(String[]asrg)
  {Scanner sn = new Scanner(System.in);
   double r,w,l,h,i,j,k;
   System.out.print("Enter l,w,h,r : ");
   l =sn.nextDouble();
   w =sn.nextDouble();
   h =sn.nextDouble();
   r =sn.nextDouble();
   i = calSurface(l,w,h);
   j = calSurface(r);
   k = calSurface(r,h);
   System.out.printf("Show Surface of square : %f \n",i);
   System.out.printf("Show Surface of circle  : %f \n",j);
   System.out.printf("Show Surface of Conical : %f \n",k);
  }

  public static double calSurface(double l,double w,double h)
  {
    return ((2f*l*w)+(2f*w*h)+(2f*h*l));
  }  
  public static double calSurface(double r)
  {
    return (4f*(Math.PI)*r*r);
  }
  public static double calSurface(double r,double h)
  {
    return (Math.pow(r*r*h*h,0.5f));
  }
  
}
*/