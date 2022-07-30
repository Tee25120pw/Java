/*
import java.util.Scanner;
public class Quiz11_G6 {
  public static void main(String [] args){
    int a,b;
    Scanner ai = new Scanner(System.in);
    System.out.print("Pleas enter 2 digit:");
    a = ai.nextInt();
    b = ai.nextInt();
    System.out.println(Integer.toHexString(a));
    System.out.print(Integer.toHexString(b));
  }
}
*/

/*
import java.util.Scanner;
public class Quiz12_G6 {
  public static void main(String [] args){
    float radius,height; double area1,area2,volume1,volume2;
    Scanner ra = new Scanner(System.in);
    System.out.print("Enter the radius and Length of a cylinder");
    radius = ra.nextFloat();
    height = ra.nextFloat();
    area1 = radius*radius;
    area2 = area1*(3.141592653589793234);
    System.out.println("The area is " + area2);
    volume1 = area2*height;
    volume2 = volume1/3;
    System.out.println("The volume of the cylinder is " + volume2);
  }
}
*/

/*
import java.util.Scanner;
public class Quiz021_158{
  public static void main(String args []){
    int a;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a year:");
    a = sn.nextInt();
    switch(a){
    case 2008:
      System.out.print(a+ "is a leap year." + "The Chinese zodiac of " + a + "is rat");
      break;
    case 2009:
      System.out.print(a+ "is not leap year." + "The Chinese zodiac of " + a + "is ox");
      break;
      case 2010:
      System.out.print(a+ "is not leap year." + "The Chinese zodiac of " + a + "is tiger");
      break;
      case 2011:
      System.out.print(a+ "is not leap year." + "The Chinese zodiac of " + a + "is rabbit");
      break;
      case 2012:
      System.out.print(a+ "is a leap year." + "The Chinese zodiac of " + a + "is dragon");
      break;
      case 2013:
      System.out.print(a+ "is not leap year." + "The Chinese zodiac of " + a + "is snake");
      break;
      case 2014:
      System.out.print(a+ "is not leap year." + "The Chinese zodiac of " + a + "is horse");
      break;
      case 2015:
      System.out.print(a+ "is not leap year." + "The Chinese zodiac of " + a + "is sheep");
      break;
      case 2016:
      System.out.print(a+ "is a leap year." + "The Chinese zodiac of " + a + "is monkey");
      break;
   case 2017:
      System.out.print(a+ "is not leap year." + "The Chinese zodiac of " + a + "is rooster");
      break;
      case 2018:
      System.out.print(a+ "is not leap year." + "The Chinese zodiac of " + a + "is dog");
      break;
      case 2019:
      System.out.print(a+ "is not leap year." + "The Chinese zodiac of " + a + "is pig");
      break;
      case 2020:
      System.out.print(a+ "is a leap year." + "The Chinese zodiac of " + a + "is rat");
      break;
      case 2021:
      System.out.print(a+ "is not leap year." + "The Chinese zodiac of " + a + "is ox");
      break;
  }
}
}   
*/

/*
import java.util.Scanner;
public class Quiz11_G6{
  public static void main(String args []){
    int a,b,c,d,e,f;
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
      System.out.print("The Lucky number is " + d + " Your number is " + a + "");
        else if(c==0 || c==5)
      System.out.print("Random number is " + b + "=>Lucky number= " + e);

    else
      System.out.print("Random number is " + b + "=>Lucky number= " + f);
  }
}
*/

/*
import java.util.Scanner;
public class Quiz22_158{
  public static void main(String args []){
    int a,b,c,d;
    Scanner sn = new Scanner(System.in);
    System.out.print("Please enter quess score(1-3):");
    a = sn.nextInt();
    b = (int)(Math.random()*100);
    c = b%10;
    if(c==2 || c==7)
      d=2;
    else if(c==0 || c==5)
      d=3;
     else 
      d=1;
     System.out.println("Random number is "+b+" =>Lucky number= "+a);
     if(d==a)
       System.out.println("The Lucky Number is "+d+" Your number is "+a+" Congratulation! You correct. "); 
     else
       System.out.println("The Lucky Number is "+d+" Your number is "+a+" Sorry, you wrong ");
    }
  }
*/


/*
import java.util.Scanner;
public class Quiz11_G6{
  public static void main(String[]args){
    double a,b,c,d,e,f,j,i,m,n,x=1,y=0,z=0.0d;
  Scanner sn = new Scanner(System.in);
  System.out.print("m = ");
    m= sn.nextDouble();
  System.out.print("n = ");
    n= sn.nextDouble();
  for(i=m;i<n+1;i++){
    for(j=1;j<i+1;j++){
      x= x*(1/j);}
    y=y+x;
    z = (z+(2*i)+2);
    System.out.printf("x = %.5f\n",x);
    System.out.printf("y = %.5f\n",y);
    System.out.printf("z = %.5f\n\n",z);
    x=1;
    }
   System.out.printf("y+z = %.5f",y+z);
}
}
*/


/*
public class Quiz11_G6 {
  public static void main(String[]args) {
    int i,j;
    for(i=0;i<6;i++){
      for(j=6;j>i;j--){
        int sum=16-j;
        System.out.print(" "+sum);  }
      System.out.println(" "); }
  }
}
*/


/*
import java.util.Scanner;
public class Quiz11_G6{
  public static void main(String[] arg){
    double length,width,deptOut,deptIn,sum;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter value of width:");
    length = sn.nextDouble();
    System.out.println("Enter value of length:");
    width = sn.nextDouble();
    System.out.println("Enter inner depth:");
    deptOut = sn.nextDouble();
    System.out.println("Enter outer depth:");
    deptIn = sn.nextDouble();
    sum = rectangleBoxVolumeDif(length,width,deptOut,deptIn);
    System.out.println("The different volume of 2 Rectangle Boxes is:" + sum );
  }
  public static double rectangleBoxVolumeDif (double length, double width, double deptOut, double deptIn){
  double volume1= length*width*deptOut;
  double volume2= length*width*deptIn;
  double total = volume2-volume1;
  return total;
  }
}
*/    