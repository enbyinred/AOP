package uebung001;

import java.util.Scanner;

public class Kreis {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Bitte Radius eingeben: ");
		
		double radius = eingabe.nextDouble();
		
		double umfang = 2*Math.PI*radius;
				
		double flaeche = Math.PI*radius*radius;
		
		System.out.println("Umfang: "+ umfang + "Fläche: " + flaeche); //Sonderzeichen niemals bei Bezeichnern verwenden, nicht kompatibel mit MAC usw.
		
	
		eingabe.close(); //nur benutzen, wenn man wirklich NICHTS mehr hinzufügen möchte
	}

}
