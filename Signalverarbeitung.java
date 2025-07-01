package Beleg02;

public class Signalverarbeitung implements IProdukt {
	
	final int preis;
	
	final int herstellungsdauer;
	
	final String seriennummer;

	
	Signalverarbeitung(){
		
		this.preis = Randomizer.getRndmPreis(Produkte.SIGNALVERARBEITUNG);
		
		this.herstellungsdauer = Randomizer.getRndmHerstellungsdauer(Produkte.SIGNALVERARBEITUNG);
		
		this.seriennummer = "S-ZZZZZ-24-UB-3-";
	}
	
	public String getSeriennummer() {
		
		return this.seriennummer;
		
	}

	@Override
	public int getPreis() {
		// TODO Auto-generated method stub
		return this.preis;
	}

	@Override
	public int getHerstellungsdauer() {
		// TODO Auto-generated method stub
		return this.herstellungsdauer;
	}


}
