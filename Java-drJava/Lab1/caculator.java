public class caculator{
  private double number1;
  private double number2;
  public caculator()
  {
    this(1,1);
  }
  public caculator(double number1,double number2)
  {
    this.number1 = number1;
    this.number2 = number2;
  }
  public double getNumber1()
  {
    return number1;
  }
  public void setNumber1(double number1)
  {
    this.number1 = number1;
  }
  public double getNumber2()
  {
    return number2;
  }
  public void setNumbeer2(double number2)
  {
    this.number2 = number2;
  }
  public double getAdd()
  {
    double a;
    a = number1 + number2;
    return a;
  }
  public double getSubtract()
  {
    double s;
    s = number1 - number2;
    return s;
  }
  public double getMultiply()
  {
    double m;
    m= number1 * number2;
    return m;
  }
  public double getDivide()
  {
    double d;
    d = number1 / number2;
    return d;
  }
}

















