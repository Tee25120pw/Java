import java.util.Scanner;
public class q2{
  public static void main(String args []){
    Float w,l;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a point with two coordinates:\t"); /* ใส่ตัวเลขทีละตัว โดยกดตัวท ี่1 แล้ว Spacebar1ครั้ง ใส่ตัวที่ 2 */
    w = sn.nextFloat();
    l = sn.nextFloat();
    if(w>8 || l>7)
      System.out.printf("Point (%f,%f) is not in the rectangle ",w,l);
    else if((w>6 && w<=8) || (l>6 && l<=7))
      System.out.printf("Point (%f,%f) is in the rectangle but the point is not in the circle ",w,l);
        else if(w<=6 && l<=6)
      System.out.printf("Point (%f,%f) is in the rectangle and the circle ",w,l);
  }
}



import java.util.Scanner;
public class q2 {
  public static void main(String[] args) {
    int x2,y2,x1=0,y1=0;  double Distance,sum;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a point with two coordinates : ");
    x2 = sn.nextInt();
    y2 = sn.nextInt();
    sum = (Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)); 
    Distance = Math.sqrt(sum);
    if(Distance<=10) {
      System.out.println("Point("+x2+".0,"+y2+".0)"+" is in the circle"); } 
    if(Distance>10) {
      System.out.println("Point("+x2+".0,"+y2+".0)"+" is not in the circle"); } 
  }
} 



import java.util.Scanner;
class q2{
  public static void main(String[] args){
    System.out.print("Enter a year : ");
    Scanner sc = new Scanner(System.in);
    int zodiac = sc.nextInt();
    int a=zodiac%12;
    System.out.println("Show a = "+a);
    switch(a){
      case 1:
        System.out.println(+zodiac+" is not aleap year,The Chinese_zodiac of "+zodiac+" is Rooster");
        break ;
      case 2:
        System.out.println(+zodiac+" is not aleap year,The Chinese_zodiac of "+zodiac+" is Dog");
        break ;
      case 3:
        System.out.println(+zodiac+" is not aleap year,The Chinese_zodiac of "+zodiac+" is Pig");
        break ;
      case 4:
        System.out.println(+zodiac+" is aleap year,The Chinese_zodiac of "+zodiac+" is Rat");
        break ;
      case 5:
        System.out.println(+zodiac+" is not aleap year,The Chinese_zodiac of "+zodiac+" is Cow");
        break ;
      case 6:
        System.out.println(+zodiac+" is not aleap year,The Chinese_zodiac of "+zodiac+" is Tiger");
        break ;
      case 7:
        System.out.println(+zodiac+" is not aleap year,The Chinese_zodiac of "+zodiac+" is Rabbit");
        break ;
      case 8:
        System.out.println(+zodiac+" is aleap year,The Chinese_zodiac of "+zodiac+" is Dragon");
        break ;
      case 9:
        System.out.println(+zodiac+" is not aleap year,The Chinese_zodiac of "+zodiac+" is Snake");
        break ;
      case 10:
        System.out.println(+zodiac+" is not aleap year,The Chinese_zodiac of "+zodiac+" is Horse");
        break ;
      case 11:
        System.out.println(+zodiac+" is not aleap year,The Chinese_zodiac of "+zodiac+" is Goat");
        break ;
      case 0:
        System.out.println(+zodiac+" is aleap year,The Chinese_zodiac of "+zodiac+" is Monkey");
        break ;
    }
  }
}
    