package uebung001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

	public static void main(String[] args) {
		
		BufferedReader eingabe = new BufferedReader(
				new InputStreamReader(System.in));
				
		
		//Professionelle Programmierende haben max. 30 Zeilen Code
		//max. 5-7 Zeilen pro Methode
	
		System.out.println("Bitte Namen eingeben: ");
		
		String name = "";
		try {
			name = eingabe.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		} 
		
		System.out.println("Hallo" + name);
		
		



	}
	

}
