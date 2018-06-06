package de.petersen.test;

import java.io.File;
import java.time.LocalDate;

public class Firma {

	private String name;

	private LocalDate gruendungsdatum;

	private int anzahlMitarbeiter = 0;

	public Firma(String name, LocalDate gruendungsdatum) {
		this.name = name;
		this.gruendungsdatum = gruendungsdatum;
	}

}
