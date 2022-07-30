public class CircularCone {
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