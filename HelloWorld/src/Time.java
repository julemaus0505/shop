import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Time {

	// Projekt kap02 - klasssenbibliothek
	public static void main(String[] args) {
		// die Programmausführung beginnt hier
		LocalDate jetzt = LocalDate.now();
		DateTimeFormatter myformatter = DateTimeFormatter.ofPattern("EEEE, d. MMMM yyyy");
		System.out.println("Heute ist " + myformatter.format(jetzt) + " . ");
		// Ausgabe z.B. :
		// Heute ist Donnerstag, 05. Februar 2018.
	}
}
