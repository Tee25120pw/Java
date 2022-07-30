class Q04_01_511 {
  double celsius,fahrenheit,x,a;
  public static void main(String[]args) {
    System.out.println("Celsius \t Fahrenheit | Fahrenheit \t Celsius");
    System.out.println("-------------------------------------------------------------------------------------");
    double celsius = 41.0d;
    double fahrenheit = 130.0d;
    for(int i=0;i<10;i++) { 
      celsius = celsius-1;
      fahrenheit = fahrenheit-10;
    double a = celsiusToFahrenheit(celsius);
    double b = fahrenheitToCelsius(fahrenheit);
    System.out.println(""+celsius+" \t\t "+a+" \t|  "+fahrenheit+" \t\t "+b); }
  }
  public static double celsiusToFahrenheit(double celsius) {
    return((9.0/5)*celsius+32); } 
  public static double fahrenheitToCelsius(double fahrenheit) {
    return((5.0/9)*(fahrenheit-32)); } 
}