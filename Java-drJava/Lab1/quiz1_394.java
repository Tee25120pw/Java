import java.util.Scanner;
import javax.swing.JOptionPane;
public class quiz1_394 {
  public static void main(String[]args) {
    int b7,b6,b5,b4,b3,b2,b1,b0,b,x,y;
    Scanner sn = new Scanner(System.in);
    System.out.print("Please enter a binary value in the format b7 b6 b5 b4 b3 b2 b1 b0 : ");
    b = sn.nextInt();
    b7 = (b%100000000)/10000000;
    b6 = (b%10000000)/1000000;
    b5 = (b%1000000)/100000;
    b4 = (b%100000)/10000;
    b3 = (b%10000)/1000;
    b2 = (b%1000)/100;
    b1 = (b%100)/10;
    b0 = (b%10);
    x = (b7*8)+(b6*4)+(b5*2)+(b4*1);
    y = (b3*8)+(b2*4)+(b1*2)+(b0*1);

    JOptionPane.showMessageDialog(null, "Hexadecimal values = "+x+y+"","Message",JOptionPane.INFORMATION_MESSAGE);
  }
} 