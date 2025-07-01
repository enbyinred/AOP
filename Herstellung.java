package Beleg02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Herstellung implements IProdukt{
	
	final List<IProdukt> komponenten;
}
	
	private Schaltnetzteil schaltnetzteil;
	
	private Entzerrer entzerrer;
	
	private LCDDisplay lcddisplay;
	
	private Siebkette siebkette;
	
	private Signalverstaerker signalverstaerker;
	
	private Tastatur tastatur;
	
	Herstellung(IProdukt...komponenten){
		
		this.komponenten = Arrays.stream(komponenten).toList();

	}
	
	

	public static IProdukt erzeugeProdukt(char typ) {
		
		List<IProdukt> komponenten = new ArrayList<IProdukt>();
		
	switch (typ) {
	
	case 'A': return new Herstellung (new Entzerrer(), new LCDDisplay(), new Signalverstaerker(), new Tastatur(),
			
			new Siebkette(), new Schaltnetzteil())
	
		break;
	
	case 'B': return new Herstellung (new Schaltnetzteil(), new Siebkette(), new Entzerrer(), new Signalverstaerker(),
	
	new LCDDisplay())
	
	break;
	
	case 'C': return new Herstellung (new Schaltnetzteil(), new Siebkette(), new Entzerrer(), new Signalverstaerker(),
			
			new LCDDisplay(), new Tastatur())
	}
		return null;
		
	}
	
	{
	
	
	
	
	public int Unterklassen;

	public int getPreis() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getHerstellungsdauer() {
		// TODO Auto-generated method stub
		return 0;
	}


	}

