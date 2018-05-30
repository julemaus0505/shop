package de.jule.shop;

public class Kunde {
	//Hier werden Variablen der Klasse deklariert (erstellt)
	private String name;
	
	private Geschlecht geschlecht = Geschlecht.WEIBLICH;

	private String vorname;
	
	private Adresse adresse;
	
	//Ab hier werden die Methoden der Klasse erstellt
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Die to-String Methode beschreibt wie die Klasse ausgegeben/dargestellt wird 
	@Override
	public String toString() {
		return getVorname() + " "+ getName() + " aus " +  getAdresse();
	}

	
	
	public Geschlecht getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(Geschlecht geschlecht) {
		this.geschlecht = geschlecht;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
		
	}
	
	public String getVorname() {
		return vorname;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
}