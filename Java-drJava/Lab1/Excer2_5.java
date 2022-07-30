import java.util.Scanner;
import java.util.Random;
public class Excer2_5{
  public static void main(String args []){
    int a,b,c;
    Scanner sn = new Scanner(System.in);
    System.out.print("scissor(0) , rock(1) , paper(2) :");
    a = sn.nextInt();
    Random rand = new Random();
    b = rand.nextInt(2);
    switch(b){
      case 0: System.out.print("The computer is scissor.");
      break;
      case 1: System.out.print("The computer is paper.");
      break;
      case 2: System.out.print("The computer is rock.");
      break;
    }
    switch(a){
      case 0:
        System.out.print("You are scissor.");
        if(b==1)
        System.out.print("You won.");
        else if(b==a)
          System.out.print("It is a draw.");
        else if(b!=1)
          System.out.print("You lose.");
        break;
      case 1:
        System.out.print("You are the rock.");
        if(b==2)
        System.out.print("you won.");
         else if(b==a)
          System.out.print("It is a draw.");
        else if(b!=2)
          System.out.print("You lose.");
      case 2:
        System.out.print("You are the paper.");
        if(b==0)
        System.out.print("you won.");
         else if(b==a)
          System.out.print("It is a draw.");
        else if(b!=0)
          System.out.print("You lose.");
    }
  }
}