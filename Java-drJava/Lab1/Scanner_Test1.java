import java.util.Scanner;
public class Scanner_Test1 {
    public static void main(String [] args) {
        Float x; 
        Scanner sn = new Scanner(System.in);
        System.out.print("> Enter the number of seconds:");
        x = sn.nextFloat();
        System.out.printf("> The value in centimeters is ", 2.54f * (x));
    }
}