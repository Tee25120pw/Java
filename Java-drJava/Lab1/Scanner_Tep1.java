import java.util.Scanner;
import javax.swing.JOptionPane;
public class Scanner_Tep1 {
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