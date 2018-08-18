package de.jupetersen.shop.entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Das sind Klassen.
public class Kunde {
	// Das sind Konstanten
	private static final String KUNDEN_DATEI = "kunden.txt";

	// Das sind Variablen.
	private String anrede;

	private String nachname;

	private String vorname;

	private String strasse;

	private String hausnummer;

	private String plz;

	private String ort;

	private String geburtsdatum;

	private String email;

	private String passwort;

	private String passwortWiderholen;

	// Das ist ein Konstruktor.
	public Kunde(String email, String passwort) {
		this.email = email;
		this.passwort = passwort;
	}

	// Das sind get und setter Mehtoden.
	public String getnachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
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

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public String getPasswortWiderholen() {
		return passwortWiderholen;
	}

	public void setPasswortWiderholen(String passwortWiderholen) {
		this.passwortWiderholen = passwortWiderholen;
	}

	@Override
	public String toString() {

		return email;
	}

	public boolean speichern() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(KUNDEN_DATEI));
			writer.write(email);
			writer.write(";");
			writer.write(getCrypPasswort(passwort));
			writer.write(";");
			writer.write(anrede);
			writer.write(";");
			writer.write(nachname);
			writer.write(";");
			writer.write(vorname);
			writer.write(";");
			writer.write(strasse);
			writer.write(";");
			writer.write(hausnummer);
			writer.write(";");
			writer.write(plz);
			writer.write(";");
			writer.write(ort);
			writer.write(";");
			writer.write(geburtsdatum);
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	public static void lesen() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(KUNDEN_DATEI)));
			String line = null;
			while ((line = reader.readLine()) != null) {
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getCrypPasswort(String passwort) {
		String cryptPasswort = passwort;
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			byte[] digest = messageDigest.digest(passwort.getBytes());
			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < digest.length; ++i) {
				buffer.append(Integer.toHexString((digest[i] & 0xFF) | 0x100).substring(1, 3));
			}
			cryptPasswort = buffer.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return cryptPasswort;
	}
}
