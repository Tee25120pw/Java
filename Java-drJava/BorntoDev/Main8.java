import java.util.Scanner;
 
public class Main8 {
 
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
         
        int Score = scan.nextInt();
         
        if(Score >= 80){
            System.out.print("A");
        }
        
        else if(Score >= 70){
            System.out.print("B");
        }
        
        else if(Score >= 60){
            System.out.print("C");
        }
        
        else if(Score >= 50){
            System.out.print("D");
        }
        else{
            System.out.print("F");
        }
    }
}