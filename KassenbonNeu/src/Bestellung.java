
public class Bestellung {

	private String name;

	private int menge;

	private double preis;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	
	@Override
	public String toString() {
		return String.format("%n%s\t%d x\t%.2f\tEUR%n\t\t\t\t%.2f\tEUR", getName(), getMenge(), getPreis(),
				getMenge() * getPreis());

		
	}




	}


