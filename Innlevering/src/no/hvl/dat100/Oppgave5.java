package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave5 {

public static void main(String[] args) {
		
		int ANT_STUD = 10;
		for(int i = 1; i <=ANT_STUD; i++) {
			String txt = "Skriv inn din poengsum:";
			int poengsum = Integer.parseInt(showInputDialog(txt));
			
			 
			if(poengsum > -1 && poengsum < 101) {
				if(poengsum > 89 && poengsum < 101) {
					showMessageDialog(null, "Din poengsum: " +poengsum + ", Din karakter: A");
				}
				if(poengsum > 79 && poengsum < 90) {
					showMessageDialog(null, "Din poengsum: " +poengsum + ", Din karakter: B");
				}
				if(poengsum > 59 && poengsum < 80) {
					showMessageDialog(null, "Din poengsum: " +poengsum + ", Din karakter: C");
				}
				if(poengsum > 49 && poengsum < 60) {
					showMessageDialog(null, "Din poengsum: " +poengsum + ", Din karakter: D");
				}
				if(poengsum > 39 && poengsum < 50) {
					showMessageDialog(null, "Din poengsum: " +poengsum + ", Din karakter: E");
				}
				if(poengsum > -1 && poengsum < 40) {
					showMessageDialog(null, "Din poengsum: " + poengsum + ", Din karakter: F");
				}
			}else {
				while(poengsum <=0 && poengsum >100) {
					i++;
					poengsum = Integer.parseInt(showInputDialog(txt));
			}
				showMessageDialog(null, "Prøv på nytt");
		}
			
	}
	}
}
