/*
import java.util.Scanner;
public class midd{
  public static void main(String[] args){
    int i,j;
    double m,n;
    double [][] A;
    double [][] B;
    double [][] x;
    char t = '-';
    A = new double[3][3];
    B = new double[3][3];
    x = new double[3][3];
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter matix1:");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        m = sn.nextDouble();
        A[i][j] = m;
      }
    }
    System.out.print("Enter matix2:");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        n = sn.nextDouble();
        B[i][j] = n;
      }
    }
    sn.close();
    System.out.println("The multiplication of the matrices is");
    x = subtMatrix(A,B);
    printResult(A,B,x,t);
  }
  public static double [][] subtMatrix(double[][] a,double[][] b)
  {
    double [][] c;
    int i,j;
    c = new double[3][3];
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        c[i][j] = a[i][j]-b[i][j];
      }
    }
    return (c);
  }
  public static void printResult(double[][] m1, double[][] m2, double[][] m3, char op)
  {
    int i,j;
    for(i=0;i<m1.length;i++)
    {
      for(j=0;j<m1[0].length;j++)
      {
        System.out.print(" "+m1[i][j]);
      }
      if(i==m1.length/2)
      {
        System.out.print(" " +op+ " ");
      }
      else
      {
        System.out.print("  ");
      }
      for(j=0;j<m2[0].length;j++)
      {
        System.out.print(" "+m2[i][j]);
      }
      if(i==m1.length/2)
      {
        System.out.print(" = ");
      }
      else
      {
        System.out.print("  ");
      }
      for(j=0;j<m3[0].length;j++)
      {
        System.out.print(" " +m3[i][j]);
      }
      System.out.println();
    }
  }
}
*/


/*
import javax.swing.JOptionPane;
import java.util.Scanner;
public class midd{
  public static void main(String[] args){
    double a,b,c,r1,r2,x;
    Scanner sn = new Scanner(System.in);
    System.out.print("Please Enter a,b,c:");
    a = sn.nextDouble();
    b = sn.nextDouble();
    c = sn.nextDouble();
    x = Math.pow(b,2)-(4*a*c);
    r1 = ((-b)+(Math.sqrt(x)))/(2*a);
    r2 = ((-b)-(Math.sqrt(x)))/(2*a);
    if(x>0)
    {
      JOptionPane.showMessageDialog(null,"The root are " +r1+ " and " +r2);
    }
    else if(x==0)
    {
      JOptionPane.showMessageDialog(null,"The root is " +r1);
    }
    else if(x<=0)
    {
      JOptionPane.showMessageDialog(null,"The equation has no real roots ");
    }
  }
}
*/



/*
public class midd{
  public static void main(String[] args){
    int i;
    double x,y,c,f;
    System.out.printf("Celsius\t Fahrenheit\t |\t Fahrenheit\t Celsius\n");
    System.out.printf("------------------------------------------------------------------\n");
    for(i=0;i<10;i++)
    {
      c = 40-i;
      f = 120-(i*10);
      x = celsiusToFahrenheit(c);
      y = fahranheitToCelsius(f);
      System.out.printf("%.1f\t %.1f\t\t |\t %.1f\t %.14f\n",c,x,f,y);
    }
  }
  public static double celsiusToFahrenheit(double celsius)
  {
    double k;
    k = (9.0/5)*celsius+32;
    return (k);
  }
  public static double fahranheitToCelsius(double fahrenheit)
  {
    double kk;
    kk = (5.0/9)*(fahrenheit-32);
    return (kk);
  }
}
*/












/*
public class midd{
  public static void main(String[] args){
    Cylinder c1 = new Cylinder();
    c1.printCylinder();
    Cylinder c2 = new Cylinder(10.0);
    c2.printCylinder();
    Cylinder c3 = new Cylinder(20.0,3.0);
    c3.printCylinder();
  }
}
*/


/*
import java.util.Scanner;
public class midd{
  public static void main(String[] args){
    double th,us,gb,jp;
    Scanner sn = new Scanner(System.in);
    System.out.print("����Թ��");
    th = sn.nextDouble();
    System.out.print("����Թ����ԡ�");
    us = sn.nextDouble();
    System.out.print("����Թ���Ҫ�ҳҨѡ�");
    gb = sn.nextDouble();
    System.out.print("����Թ�����");
    jp = sn.nextDouble();
  }
  public static int calMoney(int x)
  {
    
  }
  public static float calMoney(float y1, float y2)
  {
    float k;
  }
  public static double calMoney(double z1,double z2, double z3)
  {
    
  }
}
*/

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
  