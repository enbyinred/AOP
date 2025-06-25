package Beleg02;

import java.util.ArrayList;

import Beleg02.Unterklassen.*;

public class Herstellung implements IProdukt{
	
	Schaltnetzteil schaltnetzteil;
	
	Entzerrer entzerrer;
	
	LCDDisplay lcddisplay;
	
	Siebkette siebkette;
	
	Signalverstaerker signalverstaerker;
	
	Tastatur tastatur;
	
	

	ArrayList<String> komponenten = new ArrayList<String>();
	
	komponenten.add(entzerrer);
	
	komponenten.add(lcddisplay);
	
	komponenten.add(schaltnetzteil);
	
	komponenten.add(siebkette);
	
	komponenten.add(signalverstaerker);
	
	komponenten.add(tastatur);


	public static IProdukt erzeugeKomponente() {
		
		
		

	}
	

	public String getPreis() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getHerstellungsdauer() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}}











