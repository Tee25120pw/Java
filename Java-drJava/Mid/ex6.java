/*
import java.util.Scanner;
public class ex6 {
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
      if(i==0){
      System.out.printf("{%d ",b[i]);
      }
      else if(i==b.length-1){
      System.out.printf("%d}",b[i]);
      }
      else{
      System.out.printf("%d ",b[i]);
      }
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
*/


/*
import java.util.Scanner;
public class ex6 {
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
      if(i==0){
      System.out.printf("{%d ",b[i]);
      }
      else if(i==b.length-1){
      System.out.printf("%d}",b[i]);
      }
      else{
      System.out.printf("%d ",b[i]);
      }
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
*/



/*
import java.util.Arrays;
import java.util.Scanner;
public class ex6{
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
  return(j);
  }
}
*/



/*
public class ex6{
  public static void main(String args[]){
    int a[] = {1,2,3,4,5,6};
    double b[] = {6.0,4.4,1.9,2.9,3.4,3.5};
    System.out.println("The average value as integer is "+average(a));
    System.out.println("The average value as double is "+average(b));
  }
  public static int average(int[] array)
  {
    int sum=0,i,avg;
    for(i=0;i<array.length;i++)
    {
      sum = sum+array[i];
    }
    avg = sum/array.length;
    return(avg);
  }
  public static double average(double[] array)
  {
    int j;
    double sum1=0.0,avg1;
    for(j=0;j<array.length;j++)
    {
      sum1 = sum1+array[j];
    }
    avg1 = sum1/array.length;
    return(avg1);
  }
}
*/



/*
import java.util.Arrays;  
import java.util.Scanner;
public class ex6{
  public static void main(String args[]){
    int x,i;
    int [] a;
    a = new int[5];
    Scanner sn = new Scanner(System.in);
    for(i=0;i<a.length;i++)
    {
      System.out.print("Read a number: ");
      x = sn.nextInt();
      a[i] = x;
    }
    sn.close();
    Arrays.sort(a);
    for(i=0;i<a.length;i++)
    {
      System.out.println(a[i]);
    }
  }
}
*/

/*
import java.util.Scanner;
import java.util.Arrays;
public class ex6 {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    double[] array=new double[5];
    for (int i=0;i<array.length;i++){
      System.out.print("Read a number:");
      array[i]=sn.nextDouble();
    }
    Arrays.sort(array);
    double temp;
    for (int i = 0; i < array.length; i++)   
    {  
      for (int j = i + 1; j < array.length; j++)   
      {  
        if (array[i] < array[j])   
        {  
          temp = array[i];  
          array[i] = array[j];  
          array[j] = temp;  
        }  
      }  
    }  
    for (int i = 0; i <array.length; i++)   
    {  
      System.out.println(array[i]);  
    }  
  }
}
*/

/*
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
    System.out.print("Enter matrix1:");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
        m = sn.nextDouble();
        a[i][j] = m;
      }
    }
    System.out.print("Enter matrix2:");
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
*/



/*
import java.util.Scanner; //string
public class ex6 { 
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter you message : ");
    String x = scan.nextLine();
    inform(x); 
    System.out.print("Your message is : "+inform(x));
  }
  public static boolean inform(String x) {
    char index = x.charAt(1);
    if(index == 'e') {
      return true; }
    return false;
    }
  }    
*/



/*
import java.util.Scanner;
public class ex6 {
  int sum=0;
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter you message : ");
    String x = scan.nextLine();
    inform(x); 
  }
  public static void inform(String x) {
    String front = x.substring(0,2);
    String msg = x.substring(2,x.length()); 
    String back = msg.concat(front);
    System.out.print("Your message is : "+back);
  }
}
*/



/*
import java.util.Scanner;
public class ex6 {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter you message : ");
    String x = scan.nextLine();
    inform(x); 
  }
  public static void inform(String x) {
    if(x.length()<=3) {
      System.out.print("Your message is : "+x.toUpperCase()); }
    else {
      String msg1 = x.substring(0,x.length()-3); 
      String msg = x.substring(x.length()-3,x.length()); 
      String d = msg.toUpperCase(); 
      System.out.print("Your message is : "+msg1+d); }
  }
}
*/



/*
import java.util.Scanner;
public class ex6 { 
  int sum=0;
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter you message : ");
    String x = scan.nextLine();
    inform(x); 
  }
  public static void inform(String n) {
    int sum=0;
    String space = " " , num = "";
    String ei  = n+space; 
    for(int i=0;i<ei.length();i++) {
      if(Character.isDigit(ei.charAt(i))) {
        num = num+ei.charAt(i); }
      else {
        if(!num.equals("")) {
          sum = sum+Integer.valueOf(num);
          num = ""; }}}
    System.out.print("The summation of number is : "+sum);
  }
}
*/



































