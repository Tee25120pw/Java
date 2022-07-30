public class Rectangle implements Drawable, CalVolume {
  public String draw(){
    return "I have 4 straight lines and 4 corners. ";
  }
  public double volume(){
    double a = 4;
    double b = 4;
    double c = 4;
    double volume;
    volume = a*b*c;
    return volume;
  }
}