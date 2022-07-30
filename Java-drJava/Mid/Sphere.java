public class Sphere{
 public static final double SpherePi = 3.14;
 private double radius;
 public Sphere() {
 this.radius = 5;
 }
 public Sphere(double r){
 this.radius = r;
 }
 public double getSphereSurface(){
 return (double)(4.0*SpherePi*radius*radius) ;
 }
 public double getSphereVolume(){
 return (double)((4.0/3.0)*SpherePi*radius*radius*radius) ;
 }
 public double getSphereMiddleCircumference(){
 return 2*SpherePi*radius;
 }
 public double getRadius(){
 return this.radius;
 }
}