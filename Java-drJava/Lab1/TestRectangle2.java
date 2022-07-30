import java.util.Scanner;
public class TestRectangle2 {
public static void main(String[] args) {
Rectangle2 TRect = new Rectangle2();
TRect.display();
Scanner scan = new Scanner(System.in);
System.out.println("Enter Length: ");
double l = scan.nextDouble();
System.out.println("Enter Width: ");
double w = scan.nextDouble();
Rectangle2 TRect1 = new Rectangle2(l,w);
System.out.println("Length of this rectangle is " + TRect1.GetLength());
System.out.println("Width of this rectangle is " + TRect1.GetWidth());
TRect1.display();
}
}