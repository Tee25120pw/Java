public class Q05_511 {
  int sum=0;
  public static void main(String[]args) {
    int size1 = (int)(Math.random()*10);
    int size2 = (int)(Math.random()*10);
    int[] num1 = new int[size1];
    int[] num2 = new int[size2];
    System.out.println("Random Numbers in Array 1 : ");
    for(int i=0;i<size1;i++) {
      num1[i] = (int)(Math.random()*100+0);
      System.out.print(" "+num1[i]); }
    System.out.println();
    
    System.out.println("Random Numbers in Array 2 : ");
    for(int i=0;i<size2;i++) {
      num2[i] = (int)(Math.random()*100+0);
      System.out.print(" "+num2[i]); }
    System.out.println();
    int sum = value(num1,num2);
    System.out.println("\nThe summation values of different array are :\n "+sum);
  }
  
  
  public static int value(int[] num1, int[] num2) {
    int sum=0;
    System.out.println("The different values between 2 random arrays are : ");
    if(num1.length<num2.length) {
      for(int i=0;i<num1.length;i++) {
      int total = num1[i] - num2[i];
      System.out.print(" "+total);
      sum = sum+total;
    }
    }
    if(num2.length<num1.length) {
      for(int i=0;i<num2.length;i++) {
      int total = num2[i] - num1[i];
      System.out.print(" "+total);
      sum = sum+total;
    }
    }
      if(num1.length==num2.length) {
      for(int i=0;i<num1.length;i++) {
      int total = num1[i] - num2[i];
      System.out.print(" "+total);
      sum = sum+total;
    }
    }
        return(sum); 
    }
  }
  

    