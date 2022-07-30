import java.util.Scanner;
public class Q5_2{
  public static void main(String[] args){
    double n;
    Scanner sn = new Scanner(System.in);
    System.out.print("input your raduis: ");
    n = sn.nextDouble();
    sn.close();
    Sphere cp = new Sphere(n);
    System.out.println("SphereSurface = "+cp.getSphereSurface());
    System.out.println("SphereVolume = "+cp.getSphereVolume());
    System.out.println("SphereMiddleCircumference = "+cp.getSphereMiddleCircumference());
    System.out.println("Radius = "+cp.getRadius());
  }
}