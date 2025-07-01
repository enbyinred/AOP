package Beleg02;

public class EinAusgabe implements IProdukt{

	final String seriennummer;
	
	final int preis;
	
	final int herstellungsdauer;
	
	EinAusgabe() {
		
		this.preis = Randomizer.getRndmPreis(Produkte.EINAUSGABE);
		
		this.herstellungsdauer = Randomizer.getRndmHerstellungsdauer(Produkte.EINAUSGABE);
		
		this.seriennummer = "O-ZZZZZ-24-UB-3-"; }
		
	
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
	
	public String getSeriennummmer() {
		
		return this.seriennummer;
		
	}

	
}
