import javax.swing.*;

/* Övning 8.1
David Andersson
16/10 2017
*/

public class ovn8_1{
	public static void main(String[] args){
		String rs = JOptionPane.showInputDialog(null, "Ange radie (cm)");
		double r = Double.parseDouble(rs), area, omkrets;
		area = cirkel.area(r);
		omkrets = cirkel.omkrets(r);
		JOptionPane.showMessageDialog(null, "Area: " + area + "cm\nOmkrets: " + omkrets + " cm");
	}
}
class cirkel {
	public static double area(double a){
		return Math.PI * a * a;
	}
	public static double omkrets(double a){
		return 2.0 * Math.PI * a;
	}
	
}