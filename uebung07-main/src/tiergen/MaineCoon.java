package tiergen;

public class MaineCoon extends Feloidea implements HaustierIF {
	
	private String name = "";
	private String laut = "";
	
	public MaineCoon(String name) {
		art="MaineCoon";
		futter="Fleisch";
		this.name=name;
		this.laut="uwu miau";
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
