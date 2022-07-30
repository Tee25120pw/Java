import java.util.Scanner;
public class Q4_2
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
