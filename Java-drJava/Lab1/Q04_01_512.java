class Q04_01_512 {
  double Feet,Meters,a,b;
  public static void main(String[]args) {
    System.out.println("Feet \t Meters | Meters \t Feet");
    System.out.println("-------------------------------------------------------------------------------------");
    double Feet = 0.0d;
    double Meters = 15.0d;
    for(int i=0;i<10;i++) { 
      Feet = Feet+1;
      Meters = Meters+5;
    double a = FeetToMeters(Feet);
    double b = MetersToFeet(Meters);
    System.out.println(""+Feet+" \t "+a+" \t|  "+Meters+" \t "+b); }
  }
  public static double FeetToMeters(double Feet) {
    return(0.305*Feet); } 
  public static double MetersToFeet(double Meters) {
    return(3.279*Meters); } 
}