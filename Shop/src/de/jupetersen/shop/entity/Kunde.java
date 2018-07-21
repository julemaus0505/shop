package de.jupetersen.shop.entity;

// Das sind Klassen.
public class Kunde {
	
	// Das sind Variablen.
	private String anrede;

	private String name;

	private String vorname;

	private String strasse;

	private String hausnummer;

	private String plz;

	private String ort;

	private String email;

	private String passwort;

	// Das ist ein Konstruktor. 
	public Kunde(String email, String passwort) {
		this.email = email;
		this.passwort = passwort;
	}
	// Das sind get und setter Mehtoden.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public String getAnrede() {
		return anrede;
	}

	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

}
