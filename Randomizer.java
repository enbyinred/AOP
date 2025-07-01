package Beleg02;

import java.util.Random;

public class Randomizer {
	
	public static int getRndmPreis(Produkte art){
		
		Random zufall = new Random();
		
		switch (art) {
		
		case SPANNUNGSWANDLER:
			
		return zufall.nextInt(11)+20;
			
		case SIGNALVERARBEITUNG:
			
		return zufall.nextInt(6)+10;
			
		case EINAUSGABE: 
			
		return zufall.nextInt(6)+5;
		}
		return -1;
		
	
		}
		
	public static int getRndmHerstellungsdauer(Produkte art)
	{
		Random zufall = new Random();
		
		switch (art) {
		
		case SPANNUNGSWANDLER:
		
		return zufall.nextInt(7)+2;
		
		case SIGNALVERARBEITUNG:
			
		return zufall.nextInt(6)+5;
		
		case EINAUSGABE: 
		
		return zufall.nextInt(6)+7;
		}
		return -1;
		
	}

	
		
		
	}
	
	


