
public class Bestellung {

	private String produkt;

	private int menge;

	private double preis;

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	public String getProdukt() {
		return produkt;
	}

	public void setProdukt(String produkt) {
		this.produkt = produkt;
	}

//	Wurst      1 x  4.20 EUR
	@Override
	public String toString() {
		return String.format("%s\t%d x\t%.2f\tEUR", getProdukt(), getMenge(), getPreis());
		
	}

}
