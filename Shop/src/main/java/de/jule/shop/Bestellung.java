package de.jule.shop;

public class Bestellung {

    private String produkt;
	
	private String beschreibung;

	private String preis;

	public String getProdukt() {
		return produkt;
	}

	public void setProdukt(String produkt) {
		this.produkt = produkt;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getPreis() {
		return preis;
	}

	public void setPreis(String preis) {
		this.preis = preis;
	}
	
	public String toString() {
		return getProdukt() + " "+ getBeschreibung() + " " +  getPreis();
}
}