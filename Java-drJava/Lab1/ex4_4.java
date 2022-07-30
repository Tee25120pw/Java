import java.util.Scanner;
public class Ex4_4{
  public static void main(String[] args){
    int n;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a number: ");
    n = sn.nextInt();
    sn.close();
    System.out.println("The sum of digits for " +n+ " is "+sumDigits(n));
  }
  public  static int sumDigits(int n){
    int a,b,c,d,f,g,h;
    h = (n/100000)%10;
    g = (n/10000)%10;
    f = (n/1000)%10;
    a = (n/100)%10;
    b = (n/10)%10;
    c = n%10;
    d = a+b+c+f+g+h;
    return(d);
  }
}