package AOP_Beleg02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String bestellung;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ihre Bestellung bitte: ");
		
		bestellung = input.nextLine();
		
		switch (bestellung) {
		
		case "A": /*3 Schaltnetzteilen, 4 Siebketten, 5 Entzerrern, 
		5 Signalverstärkern, 1 LCD-Display und 2 Tastaturen*/
		
		return generiereA();
			
		case "B": /*2 Schaltnetzteilen, 3 Siebketten, 2 Entzerrern,
		2 Signalverstärkern und 1 LCD-Display*/
			
		return generiereB();
		
		
			
		case "C": /*1 Schaltnetzteil, 2 Siebketten, 3 Entzerrern,
		5 Signalverstärkern, 2 LCD-Display und 1 Tastatur*/
		
		return generiereC();
		}
		
		


	}

	private static Object generiereB() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object generiereA() {
		// TODO Auto-generated method stub
		return null;
	}

}
