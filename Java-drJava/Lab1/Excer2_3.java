import java.util.Scanner;
public class Excer2_3{
  public static void main(String args []){
    int a,b,c,tualek;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter an integer:");
    tualek = sn.nextInt();
    a = tualek%11;
    b = tualek%3;
    if(a==0 && b==0)
      System.out.print(tualek + " is divisible by both 3 and 11");
    else if(a!=0 && b==0)
      System.out.print(tualek + " is divisible by both 3 or 11,but not both");
        else if(a==0 && b!=0)
      System.out.print(tualek + " is divisible by both 3 or 11,but not both");
        else if(a!=0 && b!=0)
          System.out.print(tualek + " is not diviisible by either 3 or 11");
  }
}

    