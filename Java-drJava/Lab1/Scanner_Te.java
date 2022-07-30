import java.util.Scanner;
public class Scanner_Te {
    public static void main(String [] args) {
        float x; 
        Scanner sn = new Scanner(System.in);
        System.out.print("> Enter inches as an integer:");
        x = sn.nextFloat();
        System.out.printf("> The value in centimeters is ", 2.54f * (x));
    }
}