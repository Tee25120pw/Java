//เริ่ม 12:30 น. *** ใช้เวลา 11นาที 30วินาที
import java.util.Scanner;
public class Main32{
  public static void main(String args[]){
    Scanner sn = new Scanner(System.in);
  System.out.println("Welcome! to Zooba by G0D");
  System.out.print("Number = ");
  int Number = sn.nextInt();
  int sum=0,d=0;
  for(int i=1; i<=Number; i++){
    sum = sum + 50*i;
    d = 50*i;  
    System.out.println("Round = "+i);
    System.out.println("Increase = "+d);
    System.out.println("sum = "+sum);
    System.out.println("--------------------");
  }
  System.out.println();
    System.out.println("Last Round = "+Number);
    System.out.println("Last Increase = "+d);
    System.out.println("Last sum = "+sum);
    System.out.println("--------------------");
  
  }
}