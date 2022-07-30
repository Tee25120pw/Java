import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ex3_4{
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