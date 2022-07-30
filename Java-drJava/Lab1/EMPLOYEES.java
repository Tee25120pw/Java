import javax.swing.JOptionPane;
import java.util.Scanner;
public class EMPLOYEES {
public static void main(String[] args) {
String data;
data=JOptionPane.showInputDialog("Enter Employee Type (1 or 2) ");
int n = new Integer(data);
employee.salary emp = new employee.salary();
switch (n) {
case 1:
data=JOptionPane.showInputDialog("Enter Employee Level (0 or 9) ");
float s1 = emp.setsalary(new Integer(data));
JOptionPane.showMessageDialog(null,"Salary = "+ s1 + " TH Baht"); break;
case 2:
data=JOptionPane.showInputDialog("Enter Employee Grade (A or B) ");
String s2 = emp.setsalary(data);
JOptionPane.showMessageDialog(null,"Salary = "+s2 + " US Dollar"); break;
default :
JOptionPane.showMessageDialog(null,"Invalid Employee Type");
} }
}