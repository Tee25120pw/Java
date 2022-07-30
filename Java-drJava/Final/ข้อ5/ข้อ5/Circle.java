public class Circle implements CalArea, CalVolume {
  public double area(){
    double r = 2;
    double area;
    area = Math.PI*(Math.pow(r,2));
    return area;
  }
  public double volume(){
    double r = 2;
    double volume;
    volume = (4/3)*Math.PI*(Math.pow(r,3));
    return volume;
  }
}