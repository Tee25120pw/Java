/*
import java.util.Scanner;
public class Exercise1 {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter you message : ");
    String x = scan.nextLine();
    inform(x); 
    System.out.print("Your message is : "+inform(x));
  }
  public static boolean inform(String x) {
    char index = x.charAt(1);
    if(index == 'e') {
      return true; }
    return false;
    }
  }    
*/



/*
import java.util.Scanner;
public class Exercise1 {
  int sum=0;
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter you message : ");
    String x = scan.nextLine();
    inform(x); 
  }
  public static void inform(String x) {
    String front = x.substring(0,2);
    String msg = x.substring(2,x.length()); 
    String back = msg.concat(front);
    System.out.print("Your message is : "+back);
  }
}
*/



/*
import java.util.Scanner;
public class Exercise1 {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter you message : ");
    String x = scan.nextLine();
    inform(x); 
  }
  public static void inform(String x) {
    if(x.length()<=3) {
      System.out.print("Your message is : "+x.toUpperCase()); }
    else {
      String msg1 = x.substring(0,x.length()-3); 
      String msg = x.substring(x.length()-3,x.length()); 
      String d = msg.toUpperCase(); 
      System.out.print("Your message is : "+msg1+d); }
  }
}
*/



/*
import java.util.Scanner;
public class Exercise1 { 
  int sum=0;
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter you message : ");
    String x = scan.nextLine();
    inform(x); 
  }
  public static void inform(String n) {
    int sum=0;
    String space = " " , num = "";
    String ei  = n+space; 
    for(int i=0;i<ei.length();i++) {
      if(Character.isDigit(ei.charAt(i))) {
        num = num+ei.charAt(i); }
      else {
        if(!num.equals("")) {
          sum = sum+Integer.valueOf(num);
          num = ""; }}}
    System.out.print("The summation of number is : "+sum);
  }
}
*/