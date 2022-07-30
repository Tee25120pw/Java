import java.util.Scanner;
public class Quiz022_158{
  public static void main(String args []){
    int a,b,c,d;
    Scanner sn = new Scanner(System.in);
    System.out.print("Please enter guess score(1-3):");
    a = sn.nextInt();
    b = (int)(Math.random()*100);
    c = b%10;
    d = 2;
    e = 3;
    f = 1;
    if(c==2 || c==7)
      System.out.print("Random number is " + b + "=>Lucky number= " + d);
    else if(d==a)
      System.out.print("The Lucky number is " + d + "Your number is " + a + "")
        else if(c==0 || c==5)
      System.out.print("Random number is " + b + "=>Lucky number= " + e);

    else
      System.out.print("Random number is " + b + "=>Lucky number= " + f);
    
    

  }
}