import java.util.Scanner;
public class Quiz12_G6 {
  public static void main(String [] args){
    float radius,height; double area1,area2,volume1,volume2;
    Scanner ra = new Scanner(System.in);
    System.out.print("Enter the radius and Length of a cylinder");
    radius = ra.nextFloat();
    height = ra.nextFloat();
    area1 = radius*radius;
    area2 = area1*(3.141592653589793234);
    System.out.println("The area is " + area2);
    volume1 = area2*height;
    volume2 = volume1/3;
    System.out.println("The volume of the cylinder is " + volume2);
  }
}
