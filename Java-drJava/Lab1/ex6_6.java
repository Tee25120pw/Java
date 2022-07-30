import java.util.Scanner;
public class ex6{
  public static void main(String args[]){
    int i,j;
    double m,n;
    double [][] a;
    double [][] b;
    double [][] x;
    a = new double[3][3];
    b = new double[3][3];
    x = new double[3][3];
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter matix1:");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        m = sn.nextDouble();
        a[i][j] = m;
      }
    }
    System.out.print("Enter matix2:");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        n = sn.nextDouble();
        b[i][j] = n;
      }
    }
    sn.close();
    System.out.println("The multiplication of the matrices is");
    x = multiplyMatrix(a,b);
    for(i=0;i<3;i++)
    {
      if(i==1)
      {
       System.out.printf("%.1f %.1f %.1f    *\t %.1f %.1f %.1f    =\t %.2f %.2f %.2f",a[i][0],a[i][1],a[i][2],b[i][0],b[i][1],b[i][2],x[i][0],x[i][1],x[i][2]);
       System.out.printf("\n");
      }
      else
      {
       System.out.printf("%.1f %.1f %.1f\t %.1f %.1f %.1f\t %.2f %.2f %.2f",a[i][0],a[i][1],a[i][2],b[i][0],b[i][1],b[i][2],x[i][0],x[i][1],x[i][2]);
       System.out.printf("\n");
      }
    }
  }
  public static double [][] multiplyMatrix(double[][] A,double[][] B)
  {
    double [][] c;
    int i,j;
    c = new double[3][3];
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        c[i][j] = (A[i][0]*B[0][j])+(A[i][1]*B[1][j])+(A[i][2]*B[2][j]);
      }
    }
    return (c);
  }
}
