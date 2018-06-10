package de.petersen.aufgabe1;

import java.time.LocalDate;

public class Firma {

	private String name;

	private LocalDate gruendungsdatum;

	private String vorname;

	private int anzahlMitarbeiter = 1;

	public Firma(String name, LocalDate gruendungsdatum) {
		this.name = name;
		this.gruendungsdatum = gruendungsdatum;
	}

	public void mitarbeiterEinstellen() {
		this.anzahlMitarbeiter += 1 ;
	}

	public void mitarbeiterKuendigen() {
		this.anzahlMitarbeiter -= 1;
	}

}
