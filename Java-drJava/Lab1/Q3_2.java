import java.util.Scanner;
public class Q3_2{
  public static void main(String[] args){
   double i;
   Scanner sn = new Scanner(System.in);
   System.out.print("Please enter value of m : ");
   Double m = sn.nextDouble();
   System.out.print("Please enter value of n : ");
   Double n = sn.nextDouble(); 
   for(i=m;i<=n;i+=5f/2f){
     i = (i*(i+1)+2*i-1) ;
   } 
   System.out.printf("The result of this summation is : "+i);
  }
}
