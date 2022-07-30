
import java.util.Scanner;
public class qu5{
  public static void main(String[] args){

    double r=1;
    double h=3;
    
    CircularCone Cc1 = new CircularCone();
    Cc1.printCircularCone();

    r=2;
    h=4;
    CircularCone Cc2 = new CircularCone(2);
    Cc2.printCircularCone();

    r=3;
    h=5;
    CircularCone Cc3 = new CircularCone(3,5);
    Cc3.printCircularCone();
  }
}
class CircularCone {
  private double radius,height,side ;
  private static final double Pi = 3.14;

  public CircularCone(){
    this.radius=1;
    this.height=3;
    this.side=1;
  }

  public CircularCone(double r){
    this.radius=r;
  }
  public CircularCone(double r,double h){
    this.radius=r;
    this.height=h;
    this.side=Pi*r*2;
  }

  public double getCircularConeSurfaceArea(){
  return (Pi*radius*radius)+(Pi*radius*side);}

  public double getCircularConeBaseArea(){
  return Pi*radius*2;}

  public double getCircularConeBaseCircumference(){
  return side;}

  public double getCircularConeVolume(){
  return Pi*radius*radius*height/3;}

  public void printCircularCone(){
  System.out.println("All parameters of this Circular Cone");
    System.out.println("Circular Cone Base Area = "+getCircularConeBaseArea()+" cm2");
    System.out.println("Circular Cone Base Circumference = "+getCircularConeBaseArea()+" cm");
    System.out.println("Circular Cone Surface Area = "+getCircularConeSurfaceArea()+" cm2");
    System.out.println("Circular Cone Volume = "+getCircularConeVolume()+" cm3");
    System.out.println("");
  }
}

/*
import java.util.Scanner;
public class qu5{
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
*/