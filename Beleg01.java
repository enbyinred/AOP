package AOP_Beleg01;

import java.util.Scanner;

public class Beleg01 {

	public static void main(String[] args) {
		
		System.out.println("Geben Sie einen Satz ein: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String eingabe = scanner.nextLine();
		
		if (eingabe.length() <= 80) {
			
			System.out.println(eingabe);
			
		}
		else {
			
			System.out.println("ERROR");
			
		}
		
		
	}

}
