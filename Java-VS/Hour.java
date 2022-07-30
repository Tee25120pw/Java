import java.util.Scanner;
public class Hour{
  public static void main(String[]args) {
    int y,minutes,hours;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number of seconds: ");
    double x = s.nextDouble(); 
    hours = (int)(x/3600);
    y = (int)(x-(hours*3600));  
    minutes = (int)(y/60); 
    double seconds = (x-((hours*3600)+(minutes*60)));   
    System.out.printf("%f seconds is %d hours, %d minutes, and %f seconds",x,hours,minutes,seconds);
    
  } 
}