import java.util.Scanner;
public class Scanner_Ex1 {
  public static void main(String [] args) {
    float x;
    Scanner sn = new Scanner(System.in);
    System.out.print("> Enter inches as an integer:");
    x = sn.nextFloat();
    System.out.print("> The value in centimeters is %f",x*(1f/0.3937f));
  }
}