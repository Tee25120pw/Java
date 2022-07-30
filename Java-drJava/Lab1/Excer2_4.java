import java.util.Scanner;
import java.util.Random;
public class Excer2_4{
  public static void main(String args []){
    int a,b,c,d;
    Scanner sn = new Scanner(System.in);
    System.out.print("Guess the roll [1-6]:");
    a = sn.nextInt();
    Random rand = new Random();
    b = rand.nextInt(6);
    if(a==b)
      System.out.print("Your guess is correct.");
    else{
      System.out.print("Your guess is incorrect.");
  }
}
}