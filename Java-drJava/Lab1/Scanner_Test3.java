import java.util.Scanner;
public class Scanner_Test3 {
    public static void main(String [] args) {
        Float x; 
        Scanner Tep = new Scanner(System.in);
        System.out.print("> Enter a degree in Fahrenheit:");
        x = Tep.nextFloat();
        System.out.printf("%f Fahrenheit is %f Celsius",x,(x-32)*5/9);
    }
}