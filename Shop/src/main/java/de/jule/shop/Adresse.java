package de.jule.shop;

public class Adresse {

	//Hier werden Variablen der Klasse deklariert (erstellt)
	private String strasse;
	
	private String hausnummer;

	private String plz;
	
	private String ort;
	
	//Ab hier werden die Methoden der Klasse erstellt

	@Override
	public String toString() {
		return getStrasse() + " " + getHausnummer() + " " + getPlz() + " " + getOrt();
	}
	
	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}
	
}
