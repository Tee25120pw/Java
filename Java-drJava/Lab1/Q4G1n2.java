class Q4G1n2 {
  public static void main(String[]args) {
    Test_Volume x = new Test_Volume();
    double circle = x.calVolume(4.0);
    double rectangle = x.calVolume(5.0,4.0,3.0);
    System.out.println("Volume of Circle : "+circle);
    System.out.println("Volume of Rectangle : "+rectangle);
  }
}