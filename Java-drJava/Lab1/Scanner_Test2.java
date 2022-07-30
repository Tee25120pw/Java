import java.util.Scanner;
public class Scanner_Test2 {
    public static void main(String [] args) {
        int x; 
        Scanner sn = new Scanner(System.in);
        System.out.print("> Enter the number of seconds:");
        x = sn.nextInt();
        System.out.printf("> %d seconds is %d hours,%d minutes,and %d seconds",x,x/3600,x%3600/60,x%60 );
    }
}