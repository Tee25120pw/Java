import java.util.Scanner;
public class Test2{
  public static void main(String[] args) {
    float x;
    Scanner sn = new Scanner(System.in);
    System.out.print("> Enter a degree in Fahrenheit:");
    x = sn.nextFloat();
    System.out.printf("> %f Fahrenheit is %f",x,(x-32f)*(5f/9f));
  }
}