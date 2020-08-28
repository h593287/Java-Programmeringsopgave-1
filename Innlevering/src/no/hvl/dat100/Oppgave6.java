package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave6 {

	public static void main(String[] args) {
		String txt = showInputDialog("Oppgi et heltall:");
		int n = Integer.parseInt(txt);
		
		int a = n;
		int x = 1;

		while (n>1) {
		   x *=n;
		   n--;
		}
		showMessageDialog(null, a + "! = " + x);
	}
}
