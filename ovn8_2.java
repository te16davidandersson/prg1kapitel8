import javax.swing.*;

/* Uppgift 8.2
David Andersson
16/10 2017 */

public class ovn8_2 {
	public static void main(String[]args){
	char a1 = '\u00E5';
	char a2 = '\u00E4';
	char o1 = '\u00F6';
	
	String year = JOptionPane.showInputDialog(null, "Vilket " + a1 + "r " + a2 + "r det?");
	int skottår = Integer.parseInt(year);
	boolean skotte = hej.ärSkottår(skottår);
	if(skotte == true){
		JOptionPane.showMessageDialog(null, skottår + " " + a2 + "r ett skott" + a1 + "r");
	}else if (skotte == false){
		JOptionPane.showMessageDialog(null, skottår + " " + a2 + "r inte ett skott" + a1 + "r");
	}
}
}
class hej{
	public static boolean ärSkottår(int skottår){
		 if(skottår%4 == 0 && skottår%400 != 0) {
			return true;
		} else {
			return false;
		}
	}
}