import java.util.Scanner;
public class Ex3_1{
  public static void main(String[] args){
   Scanner n = new Scanner(System.in);
   
   System.out.println("Enter an ingeter, the input ends if it is 0: ");
   int num = n.nextInt();
   
   int pos=0;
   int neg=0;
   int total=0;
   float i =0;
   
   while(num!=0){
   if(num>0){
    pos++; 
   }
   else if(num<0){
    neg++;
   }
    i++;
    total = total+num;
    num = n.nextInt();
   }
      float average = total/i;
   
    if(pos==0 && neg==0){
     System.out.println("No numbers are entered except 0");
   }
   else{
   System.out.println("The number of positives is "+pos);
   System.out.println("The number of negatives is "+neg);
   System.out.println("The total is "+total);
   System.out.println("The average is "+average);
   }
  }
}