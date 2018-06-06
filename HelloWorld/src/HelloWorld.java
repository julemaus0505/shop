
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HelloWorld {
	private static String flaeche;

	public static void main(String[] args) {
		System.out.println("Hello World");

		// ein Objekt der Player-Klasse mit 'new' erzeugen
		Player pacman = new Player(10, 12);
		boolean ok; // um zu spreichern, ob Bewegung möglich ist
		// Objekt mit Methoden bearbeiten
		ok = pacman.moveLeft();
		ok = pacman.moveLeft();
		ok = pacman.moveUp();

		// Merkmale (Datenfelder) des Objekts auslesen
		System.out.println("Pac-Man X-Position:" + pacman.x);
		System.out.println("Pac-Man Y-Position:" + pacman.y);

		// Projekt kap02 - klasssenbibliothek

		// die Programmausführung beginnt hier

		LocalDate jetzt = LocalDate.now();
		DateTimeFormatter myformatter = DateTimeFormatter.ofPattern(" EEEE, d. MMMM yyyy");
		System.out.println("Heute ist " + myformatter.format(jetzt) + " . ");

		// Ausgabe z.B. :
		// Heute ist Donnerstag, 05. Februar 2018.

		// Projekt kap03 - intro

		double breite = 10.5;
		double laenge = 17.3;
		double umfang = (laenge + breite) * 2;
		double flaeche = laenge * breite;
		System.out.println("Umfang: " + umfang);
		System.out.println("Fläche: " + flaeche);

		double x = 2, y = 0;
		System.out.println(x / y);

		int i = 100000;
		i = i * i; // i enthält jetzt 1410065408

		// Projekt kap03 - rechteck

		java.util.Scanner scan = new java.util.Scanner(System.in);
		System.out.print("Geben Sie die Länge an:");
		double laenge1 = scan.nextDouble();
		System.out.print(" Geben Sie die Breite an:");
		double breite1 = scan.nextDouble();
		scan.close();

		double umfang1 = (laenge1 + breite1) * 2;
		double flaeche1 = laenge1 * breite1;
		System.out.println("Umfang:" + umfang1);
		System.out.println("Fläche:" + flaeche1);

	}
}
