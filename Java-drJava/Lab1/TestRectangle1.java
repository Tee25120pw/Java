import java.util.Scanner;
public class TestRectangle1 {
public static void main(String[] args) {
Rectangle1 TRect = new Rectangle1();
TRect.display();
Scanner scan = new Scanner(System.in);
System.out.println("Enter Length: ");
double l = scan.nextDouble();
System.out.println("Enter Width: ");
double w = scan.nextDouble();
Rectangle1 TRect1 = new Rectangle1(l,w);
System.out.println("Length of this rectangle is " + TRect1.length);
System.out.println("Width of this rectangle is " + TRect1.width);
TRect1.display();
}
}
