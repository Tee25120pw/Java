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
      x = x+m(n);
      if(d==1)
      {
        System.out.printf("%d\t\t%.4f\n",n,x);
      }
    }
  }

  public static double m(int i){
    double m;
    m = (4*(Math.pow(-1,i+1)/(2*i-1)));
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
    System.out.println("h = "+h);
    g = (n/10000)%10;
    System.out.println("g = "+g);
    f = (n/1000)%10;
    System.out.println("f = "+f);
    a = (n/100)%10;
    System.out.println("a = "+a);
    b = (n/10)%10;
    System.out.println("b = "+b);
    c = n%10;
    System.out.println("c = "+c);
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
