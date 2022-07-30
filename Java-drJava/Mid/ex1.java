/* ㈤头砧1
import java.util.Scanner;
public class ex1{
  public static void main(String[] args){
    double a,b;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter inches as an integer:");
    a = sn.nextInt();
    sn.close();
    b = a/0.3937;
    System.out.print("The value in centimeters is "+b);
  }
}
*/


/*
 //㈤头砧2
import java.util.Scanner;
public class ex1{
  public static void main(String[] args){
    int a,b,d,e;
    int k;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter an integer between 000 to 999:");
    a = sn.nextInt();
    sn.close();
    b = (a/100)%10;
    System.out.println("b = " +b);
    k = (a/10)%10;
    System.out.println("k = " +k);
    d = a%10;
    System.out.println("d = " +d);
    e = b*k*d;
    System.out.println("The product of digits is " +e);
  }
}
*/


/*
// ㈤头砧 3
import java.util.Scanner;
public class ex1{
  public static void main(String[] args){
    int a,b,c,d;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter number of seconds:");
    a = sn.nextInt();
    sn.close();
    b = a/3600;
    c = (a/60)%60;
    d = a%60;
    System.out.printf("%d seconds is %d hours, %d minutes, and %d seconds",a,b,c,d);
  }
}
*/


/* ㈤头砧 4
import java.util.Scanner;
public class ex1{
  public static void main(String[] args){
    double a,b,c,d;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter weight in kg:");
    a = sn.nextInt();
    sn.close();
    Scanner bn = new Scanner(System.in);
    System.out.print("Enter height in cm:");
    b = bn.nextInt();
    bn.close();
    d = b/100;
    c = a/((d*d));
    System.out.println("BMI is " +c);
  }
}
*/

/* ㈤头砧 5
import java.util.Scanner;
public class ex1{
  public static void main(String[] args){
     double a,b,c;
     Scanner sn = new Scanner(System.in);
     System.out.print("Enter a degree in Fahrenheit:");
     a  = sn.nextDouble();
     sn.close();
     b = 0.5555555556;
     c = b*(a-32);
     System.out.printf("%.1f Fahrenheit is %.2f Celsius",a,c);
  }
}
*/