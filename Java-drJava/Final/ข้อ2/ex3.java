import java.util.Scanner;
public class ex3 {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter you message : ");
    String x = scan.nextLine();
    inform(x); 
  }
  public static void inform(String x) {
    if(x.length()<=5) {
      System.out.print("Your message is : "+x.toUpperCase()); }
    else {
      String msg1 = x.substring(0,x.length()-5); 
      String msg = x.substring(x.length()-5,x.length()); 
      String d = msg.toUpperCase(); 
      System.out.print("Your message is : "+msg1+d); }
  }
}