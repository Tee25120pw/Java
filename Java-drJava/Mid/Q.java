/*
import java.util.Scanner;
public class Q {
  public static void main(String[]args) {
  float radius,length;  double area,volume;
  Scanner sn = new Scanner(System.in);
  System.out.print("Enter the radius and length of a cylinder >> ");
  radius = sn.nextFloat();
  length = sn.nextInt();
  area=radius*radius*(3.141592653589793);
  System.out.printf("The area is %.7f \n",area);
  volume=area*length;
  System.out.printf("The volume of the cylinder is %.5f\n " ,volume);
  }
}
*/

/*
import java.util.Scanner;
public class quiz1_G2 {
  public static void main(String[]args) {
    float mass,ITemp,FTemp,Q;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter the amount of water in kilograms : ");
    mass = sn.nextFloat();
    System.out.print("Enter the initial temperature : ");
    ITemp = sn.nextFloat();
    System.out.print("Enter the final temperature : ");
    FTemp = sn.nextFloat();
    Q = mass*(FTemp - ITemp)*4184;
    System.out.print("The energy needed is "+Q);
  } 
} 
*/

/*
import java.util.Scanner;
public class Q02_01_511 {
  public static void main(String[] args) {
    int x2,y2,x1=0,y1=0;  double Distance,sum;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a point with two coordinates : ");
    x2 = sn.nextInt();
    y2 = sn.nextInt();
    sum = (Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)); 
    Distance = Math.sqrt(sum);
    if(Distance<=10) {
      System.out.println("Point("+x2+".0,"+y2+".0)"+" is in the circle"); } 
    if(Distance>10) {
      System.out.println("Point("+x2+".0,"+y2+".0)"+" is not in the circle"); } 
  }
} 
*/

/*
import java.util.Scanner;
public class Q02_01_511_G2 {
  public static void main(String[] args) {
    System.out.print("Enter a point with two coordinates : ");
    Scanner scan = new Scanner(System.in);
    double x = scan.nextDouble();
    double y = scan.nextDouble();
    x = Math.abs(x);
    y = Math.abs(y);
    
    if(x<=5 && y<=2.5){
      System.out.println("Point ("+x+","+y+") is in the rectangle"); }
    else
      System.out.println("Point ("+x+","+y+") is not in the rectangle");
  }
}
*/

/*
import java.util.Scanner;
public class Q02_02_511 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an integer number >> ");
    int x = scan.nextInt(); 
    if(x%3==0 && x%11==0)
      System.out.println(" "+x+" is divisible by both 3 and 11");
    else if(x%3!=0 && x%11!=0)
      System.out.println(" "+x+" is not divisible by either 3 or 11");
    else if(x%3==0 || x%11==0)
      System.out.printf(" "+x+" is divisible by 3 or 11, but not both");
  }
} 
*/

/*
public class Q {
  public static void main(String[]args) {
      double i,sum=0.0d;
    for(i=0;i<=97;i+=2) {
       sum = sum + i/(i+2); }
    System.out.println("Sum is "+sum);
  }
}
*/

/*
public class Q03_02_511 {
  public static void main(String[]args) {
    int sum;
    for(int i=6;i>=1;i--) {
      for(int j=0;j<i;j++) {
      sum = 20+j;
      System.out.print(" "+sum);
      System.out.print(" ");
      }
       System.out.println(" ");
    }
  }
} 
*/

/*
class Q04_01_511 {
  double celsius,fahrenheit,x,a;
  public static void main(String[]args) {
    System.out.println("Celsius\tFahrenheit \t|\tFahrenheit \t Celsius");
    System.out.println("-------------------------------------------------------------------------------------");
    double celsius = 41.0d;
    double fahrenheit = 130.0d;
    for(int i=0;i<10;i++) { 
      celsius = celsius-1;
      fahrenheit = fahrenheit-10;
    double a = celsiusToFahrenheit(celsius);
    double b = fahrenheitToCelsius(fahrenheit);
    System.out.println(" "+celsius+"\t"+a+"\t\t|"+"\t"+fahrenheit+"\t\t"+b); }
  }
  public static double celsiusToFahrenheit(double celsius) {
    return((9.0/5)*celsius+32); } 
  public static double fahrenheitToCelsius(double fahrenheit) {
    return((5.0/9)*(fahrenheit-32)); } 
} 
*/

/*
class Q04_02_511 {
  public static void main(String[]args) {
    Test_Volume x = new Test_Volume();
    double circle = x.calVolume(4.0);
    double rectangle = x.calVolume(5.0,4.0,3.0);
    System.out.println("Volume of Circle : "+circle);
    System.out.println("Volume of Rectangle : "+rectangle);
  }
}
class Test_Volume {
  double a,b,c;
  public static double calVolume(double circle) {
    return((4/3)*3.14*Math.pow(4,3));
  }
  public static double calVolume(double a,double b,double c) {
    return(a*b*c);
  }
}
*/     

/* 
import java.util.Scanner;
public class Q
{ public static void main(String[]asrg)
  {Scanner s = new Scanner(System.in);
   double spv;
   System.out.print("Enter inner radius: ");
   int radiusIn = s.nextInt();
   System.out.print("Enter outer radius: ");
   int radiusOut = s.nextInt();
   spv = sphereVolumeDif(radiusOut,radiusIn);
   System.out.printf("The different value of 2 sphere volume is: %.2f",spv);
   s.close();
  }

  public static double sphereVolumeDif(double radiusOut,double radiusIn)
  {
    return (4/3)*Math.PI*Math.pow((radiusOut-radiusIn),3);
    
  }
}
*/   
 
/*
public class Q {
  int sum=0;
  public static void main(String[]args) {
    int size1 = (int)(Math.random()*10);
    int size2 = (int)(Math.random()*10);
    int[] num1 = new int[size1];
    int[] num2 = new int[size2];
    System.out.println("Random Numbers in Array 1 : ");
    for(int i=0;i<size1;i++) {
      num1[i] = (int)(Math.random()*100+0);
      System.out.print(" "+num1[i]); }
    System.out.println();
    
    System.out.println("Random Numbers in Array 2 : ");
    for(int i=0;i<size2;i++) {
      num2[i] = (int)(Math.random()*100+0);
      System.out.print(" "+num2[i]); }
    System.out.println();
    int sum = value(num1,num2);
    System.out.println("\nThe summation values of different array are :\n "+sum);
  }
  public static int value(int[] num1, int[] num2) {
    int sum=0;
    System.out.println("The different values between 2 random arrays are : ");
    if(num1.length<num2.length) {
      for(int i=0;i<num1.length;i++) {
      int total = num1[i] - num2[i];
      System.out.print(" "+total);
      sum = sum+total;
    }
    }
    if(num2.length<num1.length) {
      for(int i=0;i<num2.length;i++) {
      int total = num2[i] - num1[i];
      System.out.print(" "+total);
      sum = sum+total;
    }
    }
    if(num1.length==num2.length) {
      for(int i=0;i<num1.length;i++) {
      int total = num1[i] - num2[i];
      System.out.print(" "+total);
      sum = sum+total;
    }
    }
        return(sum); 
    }
  }
*/

/*
import java.util.Scanner;
public class Q {
  int sum=0;
  public static void main(String[]args) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a binary number string: ");
    int binary = sn.nextInt();
    String binaryString = binary + "";
    int sum = binaryToDecimal(binaryString,binary);
    System.out.println("The decimal value is "+sum);
  }
  
  public static int binaryToDecimal(String binaryString,int binary) {
    int sum=0;
    for(int i=0;i<binaryString.length();i++) {
      int base = binary % 10;
      System.out.print("base = "+base+"\t");
      binary = binary / 10;
      System.out.print("binary = "+binary+"\t");
      int total = (int)((base)*Math.pow(2,i));
      System.out.print("total = "+total+"\t");
      sum = sum + total;
      System.out.print("sum = "+sum+"\n");
    }
  return(sum); }
  }            
*/

/*
import java.util.Scanner;
public class Q {
  int sum=0;
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a String : ");
    String str = scan.nextLine();
    System.out.print("Enter a character : ");
    String ch = scan.nextLine();
    int sum = countStr(str, ch);
  System.out.print("Number of "+ch+" = "+sum);
   System.out.println();
  } 
  
  public static int countStr(String str,String ch) {
    int sum=0;
    for(int i=0;i<str.length();i++) {
      if(str.charAt(i)==ch.charAt(0)) {
        sum = sum+1; } }
    return(sum);
  }
  }
*/
    
    
    