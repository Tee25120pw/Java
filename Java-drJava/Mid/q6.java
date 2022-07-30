/*
import java.util.Scanner;
public class q6 {
  int sum=0;
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a String : ");
    String str = scan.nextLine();
    System.out.print("Enter a character : ");
    String ch = scan.nextLine();
    int sum = countStr(str, ch);
  System.out.print("Number of "+ch+" = "+sum);
   System.out.println();
  } 
  
  public static int countStr(String str,String ch) {
    int sum=0;
    for(int i=0;i<str.length();i++) {
      if(str.charAt(i)==ch.charAt(0)) {
        sum = sum+1; } }
    return(sum);
  }
  }
*/


/*
import java.util.*; //ข้อ2
  
public class q6{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your message : ");
    String str1 = scan.nextLine();
    System.out.println("Total digits are : "+sumOddDigits(str1));
    System.out.println("The summation of digits in this message is : "+sumDigits(str1));

  }
  public static int sumOddDigits(String str){
    String digit = "";
    int sum = 0;   
    for(int i=0 ; i<str.length() ; i++){
      if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        digit += str.charAt(i); //เป็นอักขระ
        sum = sum+1;
        // sum += Integer.parseInt(digit); //แปลงเป็นจำนวนเต็ม
        // digit = "";
      }
    }
    return sum;
  }
}
*/




import java.util.*;
  
public class q6{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your message : ");
    String str1 = scan.nextLine();
    System.out.println("Total digits are : "+sumOddDigits(str1));
    System.out.println("The summation of digits in this message is : "+sumDigits(str1));
  }
    public static int sumOddDigits(String str){
    String digit = "";
    int sum = 0;   
    for(int i=0 ; i<str.length() ; i++){
      if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        digit += str.charAt(i); //เป็นอักขระ
        sum = sum+1;
        // sum += Integer.parseInt(digit); //แปลงเป็นจำนวนเต็ม
        // digit = "";
      }
    }
    return sum;
  }

  public static int sumDigits(String str){
    String digit = "";
    int sum = 0; 
    for(int i=0 ; i<str.length() ; i++){
      if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        digit += str.charAt(i);
        sum += Integer.parseInt(digit);
        digit = ""; }
    }
    return sum;
  }
}
