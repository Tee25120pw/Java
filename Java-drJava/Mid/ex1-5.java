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

/* ㈤头砧2
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
    k = (a/10)%10;
    d = a%10;
    e = b*k*d;
    System.out.println("The product of digits is " +e);
  }
}
*/

/* ㈤头砧 3
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
     a = sn.nextDouble();
     sn.close();
     b = 0.5555555556;
     c = b*(a-32);
     System.out.printf("%.1f Fahrenheit is %.2f Celsius",a,c);
  }
}
*/

/*
import java.util.Scanner;
public class ex2{
  public static void main(String[] args){
    double a,b,c,d,e,f,x,y;
    double p;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a,b,c,d,e,f:");
    a = sn.nextDouble();
    b = sn.nextDouble();
    c = sn.nextDouble();
    d = sn.nextDouble();
    e = sn.nextDouble();
    f = sn.nextDouble();
    sn.close();
    x = ((e*d)-(b*f))/((a*d)-(b*c));
    y = ((a*f)-(e*c))/((a*d)-(b*c));
    p = (a*d)-(b*c);
    if(p==0)
    {
      System.out.println("The equation has no solution");
    }
    else
    {
    System.out.println("x is " +x+ "and y is " +y);
    }
  }
}
*/

/*
import java.util.Scanner;
public class ex2{
  public static void main(String[] args){
    int a,b,c,d,e,f,g,h,i,j,k;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter the first 9 digits of an ISBN as integer:");
    a = sn.nextInt();
    sn.close();
    b = (a/100000000)%10;
    c = (a/10000000)%10;
    d = (a/1000000)%10;
    e = (a/100000)%10;
    f = (a/10000)%10;
    g = (a/1000)%10;
    h = (a/100)%10;
    i = (a/10)%10;
    j = a%10;
    k = ((b*1)+(c*2)+(d*3)+(e*4)+(f*5)+(g*6)+(h*7)+(i*8)+(j*9))%11;
    if(k==10)
    {
      System.out.printf("The ISBN-10 number is %dX",a);
    }
    else
    {
      System.out.printf("The ISBN-10 number is %d%d",a,k);
    }
  }
}
*/

/*
import java.util.Scanner;
public class ex2{
  public static void main(String[] args){
    int a;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter an integer:");
    a = sn.nextInt();
    sn.close();
    if(a%3!=0 && a%11!=0)
    {
      System.out.printf("%d is not divisble by either 3 or 11",a);
    }
    else if(a%3==0)
    {
      if(a%11==0)
      {
        System.out.printf("%d is divisble by both 3 and 11",a);
      }
      else
      {
        System.out.printf("%d is divisble by both 3 and 11, but not both",a);
      }
    }
    else if(a%11==0)
    {
      if(a%3==0)
      {
        System.out.printf("%d is divisble by both 3 and 11",a);
      }
      else
      {
        System.out.printf("%d is divisble by both 3 and 11, but not both",a);
      }
    }
  }
}
*/

/*
import java.util.Scanner;
import java.util.Random;
public class ex2{
  public static void main(String[] args){
    int a,b,c;
    Scanner sn = new Scanner(System.in);
    System.out.print("Guess the roll [1-6]:");
    a = sn.nextInt();
    sn.close();
    Random rd = new Random();
    b = rd.nextInt(5);
    c = b+1;
    if(a==c)
    {
      System.out.print("You Guess is correct.");
    }
    else
    {
      System.out.print("You Guess is incorrect.");
    }
  }
}
*/


/*
import java.util.Scanner;
import java.util.Random;
public class ex2{
  public static void main(String[] args){
    int a,b;
    Scanner sn =new Scanner(System.in);
    Random sd =new Random();
    System.out.println("scissor(0),rock(1),paper(2):");
    b=sn.nextInt();
    sn.close();
    a=sd.nextInt(3);
    switch(b)
    { case 0 : if(a==0){System.out.println("The computer is scissor.You are scissor.It is a draw");}
          else if(a==1){System.out.println("The computer is rock.You are scissor.You Lose");}
          else {System.out.println("The computer is paper.You are scissor.You Win");}
      break;
      case 1 : if(a==0){System.out.println("The computer is scissor.You are rock.You Win");}
          else if(a==1){System.out.println("The computer is rock.You are rock.It is a draw");}
          else {System.out.println("The computer is paper.You are rock.You Lose");}
      break;
      case 2 : if(a==0){System.out.println("The computer is scissor.You are paper.You lose");}
          else if(a==1){System.out.println("The computer is rock.You are paper.You Win");}
          else {System.out.println("The computer is paper.You are paper.It is a draw");}
      break;
      default : {System.out.println("is not between 0-2");}
    }
  }
}
*/


/* ㈤头砧1
import java.util.Scanner;
public class ex3{
  public static void main(String[] args){
    int i=0,p=0,n=0,sumint=0,size=20;
    int j,s;
    int [] inp = new int[size];
    double avg ;
    Scanner sn = new Scanner(System.in);
    do
    {
      inp[i] =sn.nextInt();
      i++;
    }
    while(inp[i-1]!=0);
    for(j=0;j<size;j++)
    {
      if(inp[j]>0)
      {
        p++;
      }
      else if(inp[j]<0)
      {
        n++;
      }
      sumint = sumint+inp[j];
    }
    s = p+n;
    avg = (double)sumint/s;
    System.out.println("The number of positives is : "+p);
    System.out.println("The number of negative is : "+n);
    System.out.println("The total is : "+sumint);
    System.out.println("The average is : "+avg);
  }
}
*/

/*  ㈤头砧2
public class ex3{
  public static void main(String[] args){
    System.out.print("Miles\tKilometers   |   Kilometers\tMiles");
    double [][] x = new double[2][66];
    int j,i;
    for(j=0;j<=65;j++)
    {
      x[0][j] = (double)((j+4)*5)*0.6215;
      x[1][j] = (double)(j+1)/0.6215;
    }
    for(i=0;i<=30;i++)
    {
      System.out.printf("\n%d\t%.3f\t   |\t%d\t%.3f",(i+1),x[1][i],((i+4)*5),x[0][i]);
    }
  }
}
*/


/*  ㈤头砧3
public class ex3{
  public static void main(String[] args){
    int count = 9;
    int[] b = new int[82];
    int c,i,j,k;
    for(c=0;c<82;c++)
    {
      b[c] = c;
    }
    for(i=0;i<count;i++)
    {
      for(j=0;j<(count-i-1);j++)
      {
        System.out.print("    ");
      }
      for(k=0;k<((2*i)+1);k++)
      {
        if(i==0)
        {
          System.out.printf("  %d ",b[k+1]);
        }
        else if(i==1)
        {
          System.out.printf("  %d ",b[k+2]);
        }
        else if(i==2)
        {
          System.out.printf("  %d ",b[k+5]);
        }
        else if(i==3)
        {
          System.out.printf(" %d ",b[k+10]);
        }
        else if(i==4)
        {
          System.out.printf(" %d ",b[k+17]);
        }
        else if(i==5)
        {
          System.out.printf(" %d ",b[k+26]);
        }
        else if(i==6)
        {
          System.out.printf(" %d ",b[k+37]);
        }
        else if(i==7)
        {
          System.out.printf(" %d ",b[k+50]);
        }
        else
        {
          System.out.printf(" %d ",b[k+65]);
        }
      }
      System.out.println();
    }
  }
}
*/



/*  ㈤头砧3
public class ex3{
  public static void main(String[] args){
    int i,j,num;
    num = 1;
    for(i=0;i<10;i++)
    {
      for(j=9-i;j>0;j--)
      {
        System.out.print("    ");
      }
      for(j=0;j<((2*i)-1);j++)
      {
        if(num<10)
        {
          System.out.print(num+"   ");
          num = num+1;
        }
        else
        {
          System.out.print(num+"  ");
          num = num+1;
        }
      }
      System.out.println();
    }
  }
}
*/


/*  ㈤头砧4
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex3{
  public static void main(String[] args){
    int n;
    double a,x,b;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a,x,n:");
    a = sn.nextDouble();
    x = sn.nextDouble();
    n = sn.nextInt();
    sn.close();
    switch(n)
    {
      case 1 : { b = a*(x);
        JOptionPane.showMessageDialog(null,"ax^n where a="+a+",x="+x+",n="+n+" is"+b);
      }
      break;
      case 2 : { b = a*(x*x);
        JOptionPane.showMessageDialog(null,"ax^n where a="+a+",x="+x+",n="+n+" is"+b);
      }
      break;
      case 3 : { b = a*(x*x*x);
        JOptionPane.showMessageDialog(null,"ax^n where a="+a+",x="+x+",n="+n+" is"+b);
      }
      break;
      case 4 : { b = a*(x*x*x*x);
        JOptionPane.showMessageDialog(null,"ax^n where a="+a+",x="+x+",n="+n+" is"+b);
      }
      break;
      case 5 : { b = a*(x*x*x*x*x);
        JOptionPane.showMessageDialog(null,"ax^n where a="+a+",x="+x+",n="+n+" is"+b);
      }
      break;
    }
  }
}
*/


/*
  ㈤头砧5
import javax.swing.JOptionPane;
public class ex3{
  public static void main(String[] args){
    double score = 0.0d, mean = 0.0d, sd = 0.0d, result = 0.0d;
    String data = JOptionPane.showInputDialog(null,"Enter the number of total students :","Input",JOptionPane.QUESTION_MESSAGE);
    int total = Integer.parseInt(data);
    int i;
    for(i=0;i<total;i++)
    {
      String datal = JOptionPane.showInputDialog(null,"Enter scores of students No :"+(1+i),"Input",JOptionPane.QUESTION_MESSAGE);
      float sum = Float.parseFloat(datal);
      score = score+sum;
      mean = score/total;
      double bar = (Math.pow((sum-mean),2));
      result = result+bar;
      double resultl = result/total;
      sd = Math.sqrt(resultl);
    }
      JOptionPane.showMessageDialog(null,"Mean value of student score :"+mean,"^-^- Information Message -^-^",JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null,"S.D. value of student score :"+sd,"^-^- Information Message -^-^",JOptionPane.INFORMATION_MESSAGE);
 }
}
*/


/*
import java.util.Scanner;
public class ex4{
  public static void main(String[] args){
    int m,n,o;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter 3 numbers:");
    m = sn.nextInt();
    n = sn.nextInt();
    o = sn.nextInt();
    sn.close();
    wage cp_wage = new wage();
    cp_wage.bbl(m,n,o);
  }
}
class wage{
  public void  bbl(int a, int b, int c){
    int max_d,max_e;
    int min_f,min_g;
    max_d = Math.max(a,b);
    max_e = Math.max(a,c);
    min_f = Math.min(a,c);
    min_g = Math.min(b,c);
    if(max_d==max_e && min_f==min_g)
    {
      System.out.println("False");
    }
    else if(min_f==min_g)
    {
      System.out.println("True");
    }
    else if(max_d==max_e)
    {
      System.out.println("True");
    }
    else
    {
      System.out.println("False");
    }
  }
}
*/




/*
import java.util.Scanner;
public class ex4{
  public static void main(String[] args){
    int b;
    float a;
    Scanner sn = new Scanner(System.in);
    System.out.print("input the length (s): ");
    a = sn.nextFloat();
    System.out.print("input the number of length (n): ");
    b = sn.nextInt();
    sn.close();
    System.out.println(func.area(b,a));
  }
}
class func{
  public static double area(int n,double s){
    double m,p,i,j;
    i = (Math.PI)/n;
    j = (i)*(180/Math.PI);
    p = (4)*(Math.tan(j));
    m = (n*s*s)/p;
    System.out.println(i);
    System.out.println(j);
    return (m);
  }
}
*/





/*
public class ex4{
  public static void main(String[] args){
    System.out.printf("i\t\tm(i)\n");
    int n,d;
    double x=0;
    for(n=1;n<=901;n++)
    {
      d = n%100;
      x = x+bs.m1(n);
      if(d==1)
      {
        System.out.printf("%d\t\t%.4f\n",n,x);
      }
    }
  }
}
class bs{
  public static double m1(int i){
    double m;
    m = (4*(Math.pow(-1,i+1)/((2*i-1))));
    return (m);
  }
}
*/



/*
import java.util.Scanner;
public class ex4{
  public static void main(String[] args){
    int n;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a number: ");
    n = sn.nextInt();
    sn.close();
    System.out.println("The sum of digits for " +n+ " is "+cal.sumDigits(n));
  }
}
class cal{
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
*/



/*
import java.util.Scanner;
public class ex4{
  public static void main(String[] args){
    int a;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter an integer:");
    a = sn.nextInt();
    sn.close();
    re.reverse(a);
  }
}
class re{
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
*/



/*
import java.util.Scanner;
public class ex4{
  public static void main(String[] args){
    double a,b,c,d;
    int m,n,o,p;
    Scanner sn = new Scanner(System.in);
    System.out.print("Distance value of point(x1,y1): ");
    a = sn.nextDouble();
    b = sn.nextDouble();
    System.out.print("Distance value of point(x2,y2): ");
    c = sn.nextDouble();
    d = sn.nextDouble();
    sn.close();
    m =(int)a;
    n =(int)b;
    o =(int)c;
    p =(int)d;
    System.out.printf("The distance value of point (%d,%d) and point (%d,%d) is %d\n",m,n,o,p,cal.distance(m,n,o,p));
    System.out.printf("The distance value of point (%.1f,%.1f) and point (%.1f,%.1f) is %f",a,b,c,d,cal.distance(a,b,c,d));
  }
}
class cal{
  public static int distance(int x1, int y1, int x2, int y2){
    int y,z;
    y = (int)(Math.pow(x2-x1,2))+(int)(Math.pow(y2-y1,2));
    z= (int)Math.sqrt(y);
    return (z);
  }
  public static double distance(double x1, double y1, double x2, double y2){
    double k,x;
    k = (Math.pow(x2-x1,2))+(Math.pow(y2-y1,2));
    x = Math.sqrt(k);
    return (x);
  }
}
*/



/*
import java.util.Scanner;
public class ex4{
  public static void main(String[] args){
    int a,b,c,d,e,f;
    double m,n,o,p,q;
    Scanner sn = new Scanner(System.in);
    System.out.print("Select data type of all number 1.int 2.double:");
    a = sn.nextInt();
    sn.close();
    if(a==1)
    {
      Scanner sn1 = new Scanner(System.in);
      System.out.print("Enter five number");
      b = sn1.nextInt();
      c = sn1.nextInt();
      d = sn1.nextInt();
      e = sn1.nextInt();
      f = sn1.nextInt();
      sn1.close();
      System.out.println("Average value: " +cal.average(b,c,d,e,f));
    }
    else if (a==2)
    {
      Scanner sn2 = new Scanner(System.in);
      System.out.print("Enter five number");
      m = sn2.nextDouble();
      n = sn2.nextDouble();
      o = sn2.nextDouble();
      p = sn2.nextDouble();
      q = sn2.nextDouble();
      sn2.close();
      System.out.println("Average value: " +cal.average(m,n,o,p,q));
    }
  }
}
class cal{
  public static int average(int i1, int i2, int i3, int i4, int i5){
    int s;
    s = (i1+i2+i3+i4+i5)/5;
    return (s);
  }
  public static double average(double i1, double i2, double i3, double i4, double i5){
    double z;
    z = (i1+i2+i3+i4+i5)/5;
    return (z);
  }
}
*/



/*
import java.util.Scanner;
public class ex5{
  public static void main(String[] args){
    int n;
    Scanner sn = new Scanner(System.in);
    System.out.print("input your raduis: ");
    n = sn.nextInt();
    sn.close();
    Circle cp = new Circle(n);
    System.out.println("Circle Area = "+cp.getArea());
    System.out.println("Circle Volume = "+cp.getVolume());
    System.out.println("Circle Circumference = "+cp.getCircumference());
  }
}
public class Circle{
  public double CirclePi =3.14;
  private double r;
  public Circle(double radius)
  {
    r = radius;
  }
  public double getArea()
  {
    double a;
    a = CirclePi*(Math.pow(r,2));
    return(a);
  }
  public double getVolume()
  {
    double v;
    v = (4/3)*CirclePi*(Math.pow(r,3));
    return(v);
  }
  public double getCircumference()
  {
    double c;
    c = 2*CirclePi*r;
    return(c);
  }
}
*/

/*
import java.util.Scanner;
public class ex5{
  public static void main(String[] args){
    double n,m,o;
    Scanner sn = new Scanner(System.in);
    System.out.print("input s1,s2,s3 :");
    n = sn.nextDouble();
    m = sn.nextDouble();
    o = sn.nextDouble();
    sn.close();
    Triangle cp = new Triangle(n,m,o);
    System.out.println("Triangle area = "+cp.getArea());
    System.out.println("Triangle perimeter = "+cp.getPerimeter());
  }
}
public class Triangle{
  private double s1;
  private double s2;
  private double s3;
  public Triangle()
  {
    s1 = 0;
    s2 = 0;
    s3 = 0;
  }
  public Triangle(double x1, double x2, double x3)
  {
    s1 = x1;
    s2 = x2;
    s3 = x3;
  }
  public double getS1()
  {
    return s1;
  }
  public double getS2()
  {
    return(s2);
  }
  public double getS3()
  {
    return(s3);
  }
  public double getArea()
  {
    double a;
    a = (s1*s2)/2;
    return(a);
  }
  public double getPerimeter()
  {
    double b;
    b = s1+s2+s3;
    return(b);
  }
}
*/



 
 

















