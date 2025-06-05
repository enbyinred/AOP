package tiergen;

public class Bernhardiner extends Canoidea implements HaustierIF {
	
	private String name = "";
	private String laut = "";
	
	public Bernhardiner(String name) {
		art="Bernhardiner";
		futter="Fleisch";
		this.name=name;
		this.laut="uwu wuff";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void streicheln() {
		System.out.println(laut);
	}
}
