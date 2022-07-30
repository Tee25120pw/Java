import java.util.Scanner;
public class Q5{
  public static void main(String[] args){

    double r=1;
    double h=3;
    
    CircularCone Cc1 = new CircularCone();
    Cc1.printCircularCone();

    r=2;
    h=4;
    CircularCone Cc2 = new CircularCone(2);
    Cc2.printCircularCone();

    r=3;
    h=5;
    CircularCone Cc3 = new CircularCone(3,5);
    Cc3.printCircularCone();
  }
}