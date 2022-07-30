import java.io.*;
public class inputStream_Test_3{
    public static void main (String[] args) {
       String input;
       BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Your number =");
       input = stdin.readLine(); double money = Double.parseDouble(input);
       System.out.print("Your Money =");
       input = stdin.readLine(); double dollar_rate = Double.parseDouble(input);
       System.out.println("Your number" + (money / dollar_rate) + "Your Money");
    }
}