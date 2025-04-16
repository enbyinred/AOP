package uebung02;

public class Class {

	public static void main(String[] args) {
		
		String romNum = "";
		int decNum = 69;
		
		//von Dezimalzahl mehrfach Zahlen abziehen
		while (decNum >= 1000) {
			decNum -= 1000; // = ist ein Zuweisungsoperator
			romNum += "M";
		}
			
		if (decNum >= 900) {
			decNum -= 900;
			romNum += "CM";
		}
			
		while (decNum >= 500) {
			decNum -= 500;
			romNum += "D";
		}
			
		if (decNum >= 400) {
			decNum -= 400;
			romNum += "CD";
		}
		
		while (decNum >= 100) {
			decNum -= 100;
			romNum += "C";
		}
		
		if (decNum >= 90) {
			decNum -= 90;
			romNum += "XC";
		}
		
		while (decNum >= 50) {
			decNum -= 50;
			romNum += "L";
		}
			
		if (decNum >= 40) {
			decNum -= 40;
			romNum += "XL";
		}
			
		while (decNum >= 10) {
			decNum -= 10;
			romNum += "X";
		}
			
		if (decNum >= 9) {
			decNum -= 9;
			romNum += "IX";
		}
			
		while (decNum >= 5) {
			decNum -= 5;
			romNum += "V";
		}
			
		if (decNum >= 4) {
			decNum -= 4;
			romNum += "IV";
		}
			
		while (decNum >= 1) {
			decNum -= 1;
			romNum += "I";
		}
			
			
			
			System.out.println("Rest Dezimalzahl " + decNum);
			System.out.println("Römische Zahl " + romNum);
			
			
			
	}
	
	
	

}
