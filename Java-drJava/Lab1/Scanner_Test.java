import java.util.Scanner;
public class Scanner_Test {
public static void main(String [] args) {
int x; 
Scanner sn = new Scanner(System.in);
System.out.print("> Enter inches as an integer: ");
 x = sn.nextInt();
 System.out.print("> The value in centimeters is "+x);
}
}