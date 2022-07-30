public class Triangle implements CalArea, Drawable {
  public double area(){
    double r = 3;
    double b = 3;
    double area;
    area = r*b*1/2;
    return area;
  }
  public String draw(){
    return "I have 3 straight lines and 3 corners. ";
  }
}