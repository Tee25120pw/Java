/*
import java.util.Scanner;
public class q1 {
  public static void main(String[]args) {
    int b7,b6,b5,b4,b3,b2,b1,b0,x,y;
    Scanner sn = new Scanner(System.in);
    System.out.print("Please enter a binary value in the format b7 b6 b5 b4 b3b b2 b1 : ");
    b7 = sn.nextInt();
    b6 = sn.nextInt();
    b5 = sn.nextInt();
    b4 = sn.nextInt();
    b3 = sn.nextInt();
    b2 = sn.nextInt();
    b1 = sn.nextInt();
    b0 = sn.nextInt();
    x = (b7*8)+(b6*4)+(b5*2)+(b4*1);
    y = (b3*8)+(b2*4)+(b1*2)+(b0*1);
    System.out.println("Hexadecimal values = "+x+y);
  }
} 
*/

/*
import java.util.Scanner;
import javax.swing.JOptionPane;
public class q1 {
    public static void main(String [] args) {
        Float x,y,a,b,c,d; 
        Scanner sn = new Scanner(System.in);
        System.out.print("> Enter the temperature in Celsius unit:");
        x = sn.nextFloat();
        System.out.print("> Enter the temperature in Fahrenheit unit:");
        y = sn.nextFloat();
        a = x*(9f/5f)+32 ;
        b = x+273 ;
        c = (y-32)*(5f/9f) ;
        d = (y-32)*(5f/9f)+273 ;
        JOptionPane.showMessageDialog(null, "the temperature in Fahrenhelt from Celsius unit is "+a,"Message",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "the temperature in Kelvin from Celsius unit is "+b,"Message",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "the temperature in Celsius from Fahrenhelt unit is "+c,"Message",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "the temperature in Kelvin from Fahrenhelt unit is "+d,"Message",JOptionPane.INFORMATION_MESSAGE);
    }
}
*/

/*
import javax.swing.JOptionPane;
public class q1 {
    public static void main(String [] args) {
        String data = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Your name is " + data);       
    }
}
*/
