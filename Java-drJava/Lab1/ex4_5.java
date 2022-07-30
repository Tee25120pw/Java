import java.util.Scanner;
public class Ex4_5{
  public static void main(String[] args){
    int a;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter an integer:");
    a = sn.nextInt();
    sn.close();
    reverse(a);
  }
  public static int reverse(int n){
    int b,c,d,e;
    b = (n/1000)%10;
    c = (n/100)%10;
    d = (n/10)%10;
    e = n%10;
    System.out.printf("%d%d%d%d",e,d,c,b);
    return (b);
  }
}