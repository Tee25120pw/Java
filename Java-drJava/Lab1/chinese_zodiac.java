import java.util.Scanner;
class chinese_zodiac{
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
    