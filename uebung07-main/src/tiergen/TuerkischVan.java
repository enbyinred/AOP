package tiergen;

public class TuerkischVan extends Feloidea implements HaustierIF {
	
	private String name = "";
	private String laut = "";
	
	public TuerkischVan(String name) {
		art="TuerkischVan";
		futter="Fleisch";
		this.name=name;
		this.laut="uwu";
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
