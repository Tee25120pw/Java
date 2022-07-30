import java.util.Scanner;

public class Main27 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y, r;
        y = in.nextInt();
        r = y % 400 == 0 || y % 100 != 0 && y % 4 == 0 ? 1 : 0;

        switch (r) {
            case 1:
                System.out.println ("Leap Year");
                break;

            case 0:
                System.out.println ("Not a Leap Year");
                break;

            default:
                System.out.println ("Not a Leap Year");
        }
    }
}