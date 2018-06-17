package de.petersen.aufgabe1;

import java.time.LocalDate;

public class Firma {

	//Variablen
	private String name;

	private LocalDate gruendungsdatum;

	private String vorname;

	private int anzahlMitarbeiter = 1;

	//Konstruktor
	public Firma(String name, LocalDate gruendungsdatum) {
		this.name = name;
		this.gruendungsdatum = gruendungsdatum;
	}

	//Methoden
	public void mitarbeiterEinstellen() {
		this.anzahlMitarbeiter += 1 ;
	}

	public void mitarbeiterKuendigen() {
		this.anzahlMitarbeiter -= 1;
	}

}
