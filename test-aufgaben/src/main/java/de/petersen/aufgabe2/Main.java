package de.petersen.aufgabe2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Mitarbeiter hugo = new Mitarbeiter(555, "Hugo", "Schmidt");
		hugo.setGeburtsdatum(LocalDate.of(1980, 11, 30));
		hugo.mitarbeiterdatenAusgeben();
		
		Mitarbeiter heinz = new Mitarbeiter(111, "Heinz", "Müller");
		heinz.setGeburtsdatum(LocalDate.of(1698, 1, 12));
		heinz.mitarbeiterdatenAusgeben();
	}

}
