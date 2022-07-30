import java.util.Scanner;
public class Lab_8{
  public static void main(String[]args) {
    int y,z,minutes,hours;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter the number of seconds: ");
    double x = sn.nextDouble(); //ติดปัญหา x เป็นจำนวนเต็มทำให้รับค่าทศนิยมไม่ได้     
    hours = (int)(x/3600);
    y = (int)(x-(hours*3600)); //ที่เหลือจากการคำนวณชั่วโมง     
    minutes = (int)(y/60); 
    double seconds = (x-((hours*3600)+(minutes*60)));   
    System.out.printf("%f seconds is %d hours, %d minutes, and %f seconds",x,hours,minutes,seconds);
  } 
}