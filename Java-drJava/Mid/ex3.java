/*
// ??ͷ??1
import java.util.Scanner;
public class ex3{
  public static void main(String[] args){
   Scanner n = new Scanner(System.in);
   System.out.print("Enter an ingeter, the input ends if it is 0: ");
   int num = n.nextInt();
   int pos=0;
   int neg=0;
   int total=0;
   float i =0;  
   while(num!=0){
   if(num>0){
    pos++; 
   }
   else if(num<0){
    neg++;
   }
    i++;
    total = total+num;
    num = n.nextInt();
   }
   float average = total/i;
   
   if(pos==0 && neg==0){
     System.out.println("No numbers are entered except 0");
   }
   else{
   System.out.println("The number of positives is "+pos);
   System.out.println("The number of negatives is "+neg);
   System.out.println("The total is "+total);
   System.out.println("The average is "+average);
   }
  }
}
*/

/* 
// ??ͷ??2
public class ex3{
  public static void main(String[] args){
   System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
   
   int a =1;
   int b = 20;
   double k;
   double m;
   
   for(int i=1;i<=10;i++){
     k = a*1.609;
     m = b*0.621;
     
     System.out.println(a+"\t"+k+"\t|\t"+b+"\t"+m);
     a = a+1;
     b = b+5;
   }
  }
}
*/


/*  ??ͷ??3
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


/*  
// ??ͷ??3
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


/*  ??ͷ??4
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ex3{
  public static void main(String[] args){
   Scanner num = new Scanner(System.in);
   
   System.out.println("Enter a,x,n: ");
   double a = num.nextDouble();
   double x = num.nextDouble();
   int n = num.nextInt();
   
   double s;
   switch(n){
     case 0: s=a;
     break;
     case 1: s=a*x;
     break;
     case 2: s=a*x*x;
     break;
     case 3: s=a*x*x*x;
     break;
     case 4: s=a*x*x*x*x;
     break;
     case 5: s=a*x*x*x*x*x;
     break;
     default: s=0;
     break;
   }
   JOptionPane.showMessageDialog(null,"ax^n where a = "+a+", x = "+x+", n = "+n+" is "+s);
  }
}
*/


/*
// ??ͷ??5
import javax.swing.JOptionPane;
public class ex3{
  public static void main(String[] args){
    double sum = 0.0d, mean = 0.0d, sd = 0.0d, result = 0.0d;
    String data = JOptionPane.showInputDialog(null,"Enter the number of total students :","Input",JOptionPane.QUESTION_MESSAGE);
    int n = Integer.parseInt(data);
    int i;
    for(i=0;i<=n;i++)
    {
      String datal = JOptionPane.showInputDialog(null,"Enter scores of students No :"+(1+i),"Input",JOptionPane.QUESTION_MESSAGE);
      float x = Float.parseFloat(datal);
      sum = sum+x;
      mean = sum/n;
      double bar = (Math.pow((x-mean),2));
      result = result+bar;
      double resultl = result/n;
      sd = Math.sqrt(resultl);
    }
      JOptionPane.showMessageDialog(null,"Mean value of student score :"+mean,"^-^- Information Message -^-^",JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null,"S.D. value of student score :"+sd,"^-^- Information Message -^-^",JOptionPane.INFORMATION_MESSAGE);
 }
}
*/

/*
// ??ͷ??5
import javax.swing.JOptionPane;
import java.lang.Math;
public class ex3{
  public static void main(String[] args){
   int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of total students:","Input",JOptionPane.QUESTION_MESSAGE));
   float b = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the scores of students No 1:","Input",JOptionPane.QUESTION_MESSAGE));
   float c = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the scores of students No 2:","Input",JOptionPane.QUESTION_MESSAGE));
   float d = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter the scores of students No 3:","Input",JOptionPane.QUESTION_MESSAGE));
   
   double x = (b+c+d)/a;
   JOptionPane.showMessageDialog(null,"Mean value of students score: "+x);
   
   double z = ((Math.pow((b-x),2)) + (Math.pow((c-x),2)) + (Math.pow((d-x),2)))/a;
   double sd = Math.sqrt(z);
   JOptionPane.showMessageDialog(null,"S.D. value of students score: "+x+""+sd);
  }
}
*/
