import java.awt.*;
import javax.swing.*;
public class Check_Combo_Test {
public static void main(String args[]) {
JFrame f; JPanel p; JCheckBox myCheckbox1, myCheckbox2;
JComboBox combo;
Font fn = new Font("Courier New", Font.BOLD, 16);
String country[] = {"ThaiLand","Italy","Japan","France","England","China"};
f = new JFrame("Select Component Test");
p = new JPanel();
myCheckbox1 = new JCheckBox("Asia");
myCheckbox2 = new JCheckBox("Europe");
myCheckbox1.setFont(fn);
myCheckbox2.setFont(fn);

combo = new JComboBox(country);
combo.setFont(fn);
combo.setPreferredSize(new Dimension(150, 20));
combo.setSelectedItem("Japan");
combo.setMaximumRowCount(6);
p.add(myCheckbox1); p.add(myCheckbox2);
p.add(combo); f.add(p);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(250, 250);
f.setVisible(true);
}
}