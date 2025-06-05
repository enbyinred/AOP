package uebung08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Map<String, List<Eatable>> stadt = new HashMap<>();
		
		Random zufall = new Random();
		
		Scanner input = new Scanner(System.in);
		
		String strasse;
		
		do {
		
		System.out.println("Bitte Straﬂennamen eingeben: ");
		
		strasse = input.nextLine();
		
		System.out.println("Straﬂe: " + strasse);
		
		if(stadt.containsKey(strasse))
		{
			System.out.println("schon vorhanden");
		}
		
		else
		{
			List<Eatable> gaststaetten = new ArrayList<>();
			
			int anzahl = zufall.nextInt(6) + 5;
			
			for (int i=0; i < anzahl; i++)
			{
				gaststaetten.add(Gaststaette.erzeugeGaststaette());
			}
			
			stadt.put(strasse, gaststaetten);
		}
		
		}while (!strasse.trim().toLowerCase().startsWith("end"));
		
		for(String s: stadt.keySet())
		{
			for(Eatable e: stadt.get(s))
			{
				if (e != null) {
					
				System.out.println(e.getName() + "hat im Angebot" + e.getFood());
				
				}
			}
		}
		
	}
}

		


