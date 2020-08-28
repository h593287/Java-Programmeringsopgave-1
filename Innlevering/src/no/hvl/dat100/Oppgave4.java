package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave4 {
	
public static void main(String[] args) {
		
		String txt = showInputDialog("Skriv inn din bruttoinntekt:");
		double brutto = Double.parseDouble(txt);
		
		
		if(brutto <= 164100) {
			showMessageDialog(null, brutto*0 + "kr i skatt");
		}
		
		if(brutto >= 164101 && brutto <= 230950) {
			showMessageDialog(null, "Trinn 1: " + brutto*0.93/100 + "kr i skatt");
		}
		
		if(brutto >=230951 && brutto <= 580650) {
			showMessageDialog(null, "Trinn 2: " + brutto*2.41/100 + "kr i skatt");
		}
		
		if(brutto >=580651 && brutto <= 934050) {
			showMessageDialog(null, "Trinn 3: " + brutto*11.52/100 + "kr i skatt");
		}
		
		if(brutto >=932051) {
			showMessageDialog(null, "Trinn 4: " + brutto*14.52/100 + "kr i skatt");
		}
	}

}
