import java.util.Scanner;
public class ex6_7{
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