import javax.swing.*;

/* Uppgift 8.4
David Andersson
16/10 2017 */

public class ovn8_4 {
	public static void main(String[]args){
	char a1 = '\u00E5'; //å
	char a2 = '\u00E4'; //ä
	char o1 = '\u00F6'; //ö
	String nn = JOptionPane.showInputDialog(null, "Ange heltal");
	int n = Integer.parseInt(nn);
	int a = ovn84.nfak(n);
	JOptionPane.showMessageDialog(null, "fakulteten = " + a);
	

	}
}
class ovn84 {
	public static int nfak(int n){
		int a = 1;
		while(n > 0){
			a = a * n;
			n--;
		}
		return a;
	}
}