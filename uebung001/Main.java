package uebung001;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//syso STRG+Space
		//static heißt, es gehört zur Klasse
		
		System.out.println("Hallo Welt");
		//ln bedeutet new line
		
		Scanner eingabe = new Scanner(System.in);
		//Wenn Fehlercode, dann über rot unterstrichenen Begriff hovern und quick fix raussuchen
		
		System.out.println("Bitte Namen eingeben: ");
		
		String name = eingabe.next();
		//Datentypen groß schreiben, weil das Klasse ist
		
		System.out.println("Hallo " + name);
		
		System.out.println("Zahl eingeben: ");

		int zahl = eingabe.nextInt();
		
		System.out.println("Die Zahl ist: " + zahl);
		//int ist primitiver Datentyp, deswegen klein geschrieben
		//double/float ist immer ein gerundeter Wert, int ist also genauer
		
		System.out.println("Kommazahl eingeben: ");
		
		eingabe.useLocale(Locale.UK);
		//wird zunächst als Fehler angezeigt, drüber hovern und java.util auswählen
		
		double dzahl = eingabe.nextDouble();
		
		System.out.println("Gebrochene Zahl = "+ dzahl);
		//Systemlokale ist beim Rechner auf DE gesetzt, weshalb Eingabe des Nutzers mit Komma erfolgen muss
		
		
		
		
	}

}
