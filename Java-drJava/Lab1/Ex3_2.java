public class Ex3_2{
  public static void main(String[] args){
   System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
   
   int a =1;
   int b = 20;
   double k;
   double m;
   
   for(int i=1;i<=10;i++){
     k = a*1.609;
     m = b*0.621;
     
     System.out.println(a+"\t"+k+"\t|\t"+b+"\t"+m);
     a = a+1;
     b = b+5;
   }
  }
}