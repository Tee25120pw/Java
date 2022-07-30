import java.util.Scanner;
import java.util.Arrays;
public class Main30 {
    public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
      int ROW = sn.nextInt();
        int score[] = new int[ROW];


        // Assigning values
        for (int i = 0; i < ROW; i++) {          
                score[i] = sn.nextInt();

            }
Arrays.sort(score);
        for (int i = 0; i < ROW; i++) {
            
                System.out.println(+ score[ROW-i-1]);
            }

    }
}

/*
import java.util.Arrays;
import java.util.Scanner;
public class Main30{
  public static void main(String args[]){
    int x,i;
    int [] a;
    a = new int[5];
    Scanner sn = new Scanner(System.in);
    for(i=0;i<a.length;i++)
    {
      x = sn.nextInt();
      a[i] = x;
    }
    Arrays.sort(a);
    for(i=0;i<a.length;i++)
    {
      System.out.println(a[4-i]);
    }
  }
}
*/