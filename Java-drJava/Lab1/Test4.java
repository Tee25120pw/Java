import java.util.Scanner;   //ข้อ2
public class Test4 {
  public static void main(String[]args) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter year: (e.g.,2008): ");
    int a = sn.nextInt();
    System.out.print("Enter month: 1-12: ");
    int m = sn.nextInt();
    System.out.print("Enter the day of the month: 1-31: ");
    int q = sn.nextInt();
    int J = a/100;
    int K = a%100;   
    int h = ((q+((26*(m+1))/10))+K+(K/4)+(J/4)+(5*J))%7;
    System.out.print("Show h = "+h);
  }
}