package de.petersen.aufgabe2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mitarbeiter {

	private String name;

	private String vorname;

	private LocalDate geburtsdatum;

	private int id;

	private String rolle;

	public Mitarbeiter(int id, String vorname, String name) {

		this.id = id;
		this.vorname = vorname;
		this.name = name;
	}

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

	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(LocalDate geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRolle() {
		return rolle;
	}

	public void setRolle(String rolle) {
		this.rolle = rolle;
	}

	public void mitarbeiterdatenAusgeben() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

		String formartiertesDatum = formatter.format(getGeburtsdatum());

		System.out.println(getId() + " - " + getVorname() + " " + getName() + ", geb. am " + formartiertesDatum);

	}
}
