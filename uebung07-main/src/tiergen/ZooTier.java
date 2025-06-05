package tiergen;

public class ZooTier {
	
	protected static int counter = 1056;
	
	private int id;
	protected String familie;
	protected String art;
	protected String futter;
	
	public ZooTier() {
		id=counter++;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "\n"+art+" ["+getId()+"] "+familie + " | " + futter;
	}

}
