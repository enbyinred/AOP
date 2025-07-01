package Beleg02;

public class Spannungswandler implements IProdukt {
	
	final int preis;
	
	final int herstellungsdauer;
	
	final String seriennummer;
	
	Spannungswandler(){
		
		this.preis = Randomizer.getRndmPreis(Produkte.SPANNUNGSWANDLER);
		
		this.herstellungsdauer = Randomizer.getRndmHerstellungsdauer(Produkte.SPANNUNGSWANDLER);
		
		this.seriennummer = "O-ZZZZZ-24-UB-3-";
		
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
	
	public String getSeriennummer() {
		
		return this.seriennummer;
		
	}

}
