import java.util.Scanner;
public class ex6_2 {
  public static void main(String args[]) {
    int a,i,x;
    int m1,m2,m3,m4;
    int t1 = 0,t2 = 0,t3 = 0,t4 = 0;
    int max1,max2,max3;
    int [] b;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter the number of array size :");
    a = sn.nextInt();
    System.out.print("Your number 1:");
    m1 = sn.nextInt();
    System.out.print("Your number 2:");
    m2 = sn.nextInt();
    System.out.print("Your number 3:");
    m3 = sn.nextInt();
    System.out.print("Your number 4:");
    m4 = sn.nextInt();
    sn.close();
    b = new int[a];
    for(i=0;i<a;i++)
    {
      x = (int)(Math.random()*10);
      b[i] = x ;
    }
    System.out.printf("Your array ");
    for(i=0;i<b.length;i++)
    {
      System.out.printf(" %d",b[i]);
    }
    for(i=0;i<b.length;i++)
    {
      if(m1==b[i])
      {
        t1++;
      }
      else if(m2==b[i])
      {
        t2++;
      }
      else if(m3==b[i])
      {
        t3++;
      }
      else if(m4==b[i])
      {
        t4++;
      }
    }
    max1 = Math.max(t1,t2);
    max2 = Math.max(t3,t4);
    max3 = Math.max(max1,max2);
    System.out.printf("\nMaxFrequency %d",max3);
  }
}