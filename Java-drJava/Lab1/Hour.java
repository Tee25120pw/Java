import java.util.Scanner;
public class Hour{
  public static void main(String[]args) {
    int y,z,minutes,hours;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter the number of seconds: ");
    double x = sn.nextDouble(); //�Դ�ѭ�� x �繨ӹǹ���������Ѻ��ҷȹ��������     
    hours = (int)(x/3600);
    y = (int)(x-(hours*3600)); //�������ͨҡ��äӹǳ�������     
    minutes = (int)(y/60); 
    double seconds = (x-((hours*3600)+(minutes*60)));   
    System.out.printf("%f seconds is %d hours, %d minutes, and %f seconds",x,hours,minutes,seconds);
  } 
}
/*double b = a*60;
System.out.println("b = "+b); 
System.out.println("x = "+x);
double a = (x%1); //�� 495 % 10 = 5 and 495 / 10 = 49     
System.out.println("a = "+a); //㹷���ش����ȹ���������   
System.out.println("hours = "+hours);
System.out.println("y = "+y);
System.out.println("minutes = "+minutes);
System.out.println("seconds = "+seconds);*/