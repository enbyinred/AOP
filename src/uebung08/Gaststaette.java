package uebung08;

import java.util.Random;

public abstract class Gaststaette implements Eatable {

	public static Eatable erzeugeGaststaette() {
	
		int Unterklassen = 2;
		
		Random z = new Random();
		switch (z.nextInt(Unterklassen)) {
		
		case 0: return new GutBuergerlich();
		
		case 1: return new Pizzeria();
		
		}
		
		return null;
	}

	
	
}
