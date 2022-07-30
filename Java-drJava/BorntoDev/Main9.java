import java.util.Scanner;
 
public class Main9 {
 
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
         
        int Score = scan.nextInt();
         
        if(Score >= 80 && Score <= 100){
            System.out.print("A");
        }
        
        else if(Score >= 70 && Score <= 79){
            System.out.print("B");
        }
        
        else if(Score >= 60 && Score <= 69){
            System.out.print("C");
        }
        
        else if(Score >= 50 && Score <= 59){
            System.out.print("D");
        }
        else if(Score < 50 && Score >= 0){
            System.out.print("F");
        }
        else if(Score > 100){
          System.out.print("Error : Value must be less than or equal to 100.");
        } 
        else if(Score < 0){
          System.out.print("Error : Value must be greater than or equal to 0.");
        } 
    }
}