public class Circle{
  double CirclePi =3.14;
  private double r;
  public Circle(double radius)
  {
    r = radius;
  }
  public double getArea()
  {
    double a;
    a = CirclePi*(Math.pow(r,2));
    return(a);
  }
  public double getVolume()
  {
    double v;
    v = (4/3)*CirclePi*(Math.pow(r,3));
    return(v);
  }
  public double getCircumference()
  {
    double c;
    c = 2*CirclePi*r;
    return(c);
  }
}

