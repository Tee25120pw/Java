/*
import java.util.Scanner;   //???1
public class mid1 {
  public static void main(String[]args) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter speed v: ");
    int v = sn.nextInt();
    System.out.print("Enter a: ");
    int a = sn.nextInt();
    double Length = (Math.pow(v,2))/(2*a);
    System.out.println("Your Length is "+Length+" meters");
  }
}
*/


/*
import java.util.Scanner;   //???2
public class mid1 {
  public static void main(String[]args) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter year: (e.g.,2008): ");
    int a = sn.nextInt();
    System.out.print("Enter month: 1-12: ");
    int m = sn.nextInt();
    System.out.print("Enter the day of the month: 1-31: ");
    int q = sn.nextInt();
    int J = a/100;
    int K = a%100;   
    int h = ((q+((26*(m+1))/10))+K+(K/4)+(J/4)+(5*J))%7;
    System.out.println("Show h = "+h);
      switch(h) {
      case 0: System.out.println("Day of the week is Saturday");
              break;
      case 1: System.out.println("Day of the week is Sunday");
              break;
      case 2: System.out.println("Day of the week is Monday");
              break;
      case 3: System.out.println("Day of the week is Tuesday");
              break;
      case 4: System.out.println("Day of the week is Wednesday");
              break;
      case 5: System.out.println("Day of the week is Thursday");
              break;
      case 6: System.out.println("Day of the week is Friday");
              break;
      default: System.out.println("ERROR!");
    }
  }
}
*/


/*
import java.util.Scanner;   //???4
public class mid1 {
  public static void main(String[]args) {
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter width : ");
    int width = sn.nextInt();
    System.out.print("Enter height : ");
    int height = sn.nextInt();
    Square S = new Square(width,height);    //??蹷??1 (?Ҵ??蹷??2)
    
    System.out.println("Square's Area = "+S.getSquareArea());
    System.out.println("Square's BorderLength = "+S.getBorderLength());
    }
}
public class Square {     //??? Square ??Ҩ???繢ͧ??? 4
  private double width;
  private double height;
  public Square() {
    this.width = width;
    this.height = height;
  }
  public Square(double one, double two) {
    this.width = one;
    this.height = two;
  }
  public double getSquareArea() {
    return(width*height); }
    public double getBorderLength() {
      return((2*width)+(2*height)); }
    public void setHeight(double h) {
      this.height = 1;
    }
    public void setWidth(double w) {
      this.width = 1;
    }
    }
*/


/*
import java.util.Arrays;   //???5
import java.util.Scanner;
public class mid1{
  public static void main(String[] args){ 
   Scanner sn= new Scanner(System.in);
   double[] number;
    number = new double[10];
    System.out.print("Enter 10 numbers : ");
    for(int i=0 ; i<number.length ; i++){
      number[i] = sn.nextDouble();
    }
    Arrays.sort(number);
    double max = number[9];
    System.out.println("The max number is "+max);
  }
}
*/


/*
import java.util.Scanner;   //???6
public class mid1 {
    public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
      System.out.print("Enter your number : ");
      int num = sn.nextInt();  
        final int ROW = 4, COLUMN = 4;
        int score[][] = new int[ROW][COLUMN];
        int data = 0;
        
        for(int i=0; i<ROW;i++) {
            for (int j=0;j<COLUMN;j++) {
                score[i][j] = (int)(Math.random()*6+1); } }
        for (int i=0;i<ROW;i++) {
            for (int j=0;j<COLUMN;j++) {
                System.out.print("\t" + score[i][j]);
            }
            System.out.println();
        }
        int sum=0,total=0;
        for(int i=0; i<ROW;i++) {
            for (int j=0;j<COLUMN;j++) {
                if(score[i][j] == num) 
                  sum = sum+1; } }
        total = total+sum;
        System.out.println();
        System.out.println("Your number appears "+total+" time in this Matrix");
    }         
}
*/


/*
public class mid1 {     //??? Square ??Ҩ???繢ͧ??? 4
  private double width;
  private double height;
  public Square() {
    this.width = width;
    this.height = height;
  }
  public Square(double one, double two) {
    this.width = one;
    this.height = two;
  }
  public double getSquareArea() {
    return(width*height); }
    public double getBorderLength() {
      return((2*width)+(2*height)); }
    public void setHeight(double h) {
      this.height = 1;
    }
    public void setWidth(double w) {
      this.width = 1;
    }
    }
*/    
    