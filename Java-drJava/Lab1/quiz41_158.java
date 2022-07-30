import java.util.Scanner;
public class quiz41_158{
  public static void main(String[] arg){
    double length,width,deptOut,deptIn,sum;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter value of width:");
    length = sn.nextDouble();
    System.out.println("Enter value of length:");
    width = sn.nextDouble();
    System.out.println("Enter inner depth:");
    deptOut = sn.nextDouble();
    System.out.println("Enter outer depth:");
    deptIn = sn.nextDouble();
    sum = rectangleBoxVolumeDif(length,width,deptOut,deptIn);
    System.out.println("The different volume of 2 Rectangle Boxes is:" + sum );
  }
  public static double rectangleBoxVolumeDif (double length, double width, double deptOut, double deptIn){
  double volume1= length*width*deptOut;
  double volume2= length*width*deptIn;
  double total = volume2-volume1;
  return total;
  }
}
    