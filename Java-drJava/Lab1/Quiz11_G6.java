import java.util.Scanner;
public class Quiz11_G6 {
  public static void main(String [] args){
    int a,b;
    Scanner ai = new Scanner(System.in);
    System.out.print("Pleas enter 2 digit:");
    a = ai.nextInt();
    b = ai.nextInt();
    System.out.println(Integer.toHexString(a));
    System.out.print(Integer.toHexString(b));
  }
}