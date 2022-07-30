import java.util.Scanner;
public class ex6_1 {
  public static void main(String args[]) {
    int a,i,x,m,n;
    int [] b;
    int sum = 0;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter the number of array size :");
    a= sn.nextInt();
    sn.close();
    b = new int[a];
    for(i=0;i<a;i++)
    {
      x = (int)(Math.random()*100);
      b[i] = x ;
    }
    System.out.println("Your array:");
    for(i=0;i<b.length;i++)
    {
      System.out.printf("%d ",b[i]);
    }
    for(i=0;i<b.length;i++)
    {
      m = b[i]%10;
      n = b[i]%7;
      if(n==0)
      {
        sum += 2;
      }
      else if(m==4 || m==9 && n!=0)
      {
        sum++;
      }
    }
    System.out.printf("\nYour array scores : %d",sum);
  }
}