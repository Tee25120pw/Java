import java.util.Scanner;
public class Quiz22_158{
  public static void main(String args []){
    int a,b,c,d;
    Scanner sn = new Scanner(System.in);
    System.out.print("Please enter quess score(1-3):");
    a = sn.nextInt();
    b = (int)(Math.random()*100);
    c = b%10;
    if(c==2 || c==7)
      d=2;
    else if(c==0 || c==5)
      d=3;
     else 
      d=1;
     System.out.println("Random number is "+b+" =>Lucky number= "+a);
     if(d==a)
       System.out.println("The Lucky Number is "+d+" Your number is "+a+" Congratulation! You correct. "); 
     else
       System.out.println("The Lucky Number is "+d+" Your number is "+a+" Sorry, you wrong ");
    }
  }