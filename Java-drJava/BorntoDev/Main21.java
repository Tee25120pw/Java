import java.util.Scanner;
 
public class Main21 {
 
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
         
        int Score = scan.nextInt();
         
        if(Score >=90 && Score <= 100){
            System.out.print("A");
        }
        else if(Score >= 85 && Score < 90){
            System.out.print("B+");
        }
        else if(Score >= 80 && Score <= 84){
            System.out.print("B");
        }
        else if(Score >= 75 && Score < 80){
            System.out.print("C+");
        }
        else if(Score >= 70 && Score <= 74){
            System.out.print("C");
        }
        else if(Score >= 65 && Score < 70){
            System.out.print("D+");
        }
        else if(Score >= 60 && Score <= 64){
            System.out.print("D");
        }
        else if(Score < 60 && Score >= 0){
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