/*
import java.util.Scanner;
public class ex2{
  public static void main(String[] args){
    double a,b,c,d,e,f,x,y;
    double p;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a,b,c,d,e,f:");
    a = sn.nextDouble();
    b = sn.nextDouble();
    c = sn.nextDouble();
    d = sn.nextDouble();
    e = sn.nextDouble();
    f = sn.nextDouble();
    sn.close();
    x = ((e*d)-(b*f))/((a*d)-(b*c));
    y = ((a*f)-(e*c))/((a*d)-(b*c));
    p = (a*d)-(b*c);
    if(p==0)
    {
      System.out.println("The equation has no solution");
    }
    else
    {
    System.out.println("x is " +x+ "and y is " +y);
    }
  }
}
*/

/*
import java.util.Scanner;
public class ex2{
  public static void main(String[] args){
    int a,b,c,d,e,f,g,h,i,j,k;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter the first 9 digits of an ISBN as integer:");
    a = sn.nextInt();
    sn.close();
    b = (a/100000000)%10;
    c = (a/10000000)%10;
    d = (a/1000000)%10;
    e = (a/100000)%10;
    f = (a/10000)%10;
    g = (a/1000)%10;
    h = (a/100)%10;
    i = (a/10)%10;
    j = a%10;
    k = ((b*1)+(c*2)+(d*3)+(e*4)+(f*5)+(g*6)+(h*7)+(i*8)+(j*9))%11;
    if(k==10)
    {
      System.out.printf("The ISBN-10 number is %dX",a);
    }
    else
    {
      System.out.printf("The ISBN-10 number is %d%d",a,k);
    }
  }
}
*/

/*
import java.util.Scanner;
public class ex2{
  public static void main(String[] args){
    int a;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter an integer:");
    a = sn.nextInt();
    sn.close();
    if(a%3!=0 && a%11!=0)
    {
      System.out.printf("%d is not divisble by either 3 or 11",a);
    }
    else if(a%3==0)
    {
      if(a%11==0)
      {
        System.out.printf("%d is divisble by both 3 and 11",a);
      }
      else
      {
        System.out.printf("%d is divisble by both 3 and 11, but not both",a);
      }
    }
    else if(a%11==0)
    {
      if(a%3==0)
      {
        System.out.printf("%d is divisble by both 3 and 11",a);
      }
      else
      {
        System.out.printf("%d is divisble by both 3 and 11, but not both",a);
      }
    }
  }
}
*/
/*
import java.util.Scanner;
public class ex2{
  public static void main(String args []){
    int a,b,c,x;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter an integer:");
    x = sn.nextInt();
    a = x%11;
    b = x%3;
    if(a==0 && b==0){
      System.out.print(x + " is divisible by both 3 and 11");
    }
    else if(a!=0 && b==0){
      System.out.print(x + " is divisible by both 3 or 11,but not both");
    }
    else if(a==0 && b!=0){
      System.out.print(x + " is divisible by both 3 or 11,but not both");
    }
    else if(a!=0 && b!=0){
      System.out.print(x + " is not diviisible by either 3 or 11");
    }
  }
}
*/
    

/*
import java.util.Scanner;
import java.util.Random;
public class ex2{
  public static void main(String[] args){
    int a,b,c;
    Scanner sn = new Scanner(System.in);
    System.out.print("Guess the roll [1-6]:");
    a = sn.nextInt();
    sn.close();
    Random rd = new Random();
    b = rd.nextInt(5);
    c = b+1;
    if(a==c)
    {
      System.out.print("You Guess is correct.");
    }
    else
    {
      System.out.print("You Guess is incorrect.");
    }
  }
}
*/


/*
import java.util.Scanner;
import java.util.Random;
public class ex2{
  public static void main(String[] args){
    int a,b;
    Scanner sn =new Scanner(System.in);
    Random sd =new Random();
    System.out.println("scissor(0),rock(1),paper(2):");
    b=sn.nextInt();
    sn.close();
    a=sd.nextInt(3);
    switch(b)
    { case 0 : if(a==0){System.out.println("The computer is scissor.You are scissor.It is a draw");}
          else if(a==1){System.out.println("The computer is rock.You are scissor.You Lose");}
          else {System.out.println("The computer is paper.You are scissor.You Win");}
      break;
      case 1 : if(a==0){System.out.println("The computer is scissor.You are rock.You Win");}
          else if(a==1){System.out.println("The computer is rock.You are rock.It is a draw");}
          else {System.out.println("The computer is paper.You are rock.You Lose");}
      break;
      case 2 : if(a==0){System.out.println("The computer is scissor.You are paper.You lose");}
          else if(a==1){System.out.println("The computer is rock.You are paper.You Win");}
          else {System.out.println("The computer is paper.You are paper.It is a draw");}
      break;
      default : {System.out.println("is not between 0-2");}
    }
  }
}
*/