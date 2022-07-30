import java.util.Arrays;
import java.util.Scanner;
public class ex6_3{
  public static void main(String args[]){
    double [] a;
    int i,m;
    double b;
    a = new double[10];
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter ten number: ");
    for(i=0;i<a.length;i++)
    {
      b = sn.nextInt();
      a[i] = b;
    }
    sn.close();
    m = indexOfSmallestElement(a);
    System.out.println("Index of the main is :"+m);
  }
  public static int indexOfSmallestElement(double[] array)
  {
    int p,j,k=0;
    int x;
    for(j=0;j<array.length;j++)
    {
      for(p=0;p<array.length;p++)
      {
        if(array[j]<array[p])
        {
          k++;
          if(k==9)
          {
            x = j;
            return (x);
          }
        }
      }
    }
  }
}