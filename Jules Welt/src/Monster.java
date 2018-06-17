
public class Monster {

	static int anzahlMonster; // Klassenvariable zum Zählen der Instanzen

	/*
	 * Im Konstruktor soll jetzt die Variable erhöht werden
	 * 
	 */

	/*
	 * Im Konstruktor soll jetzt die Variable erhöht werden Bildschirmausgabe gibt
	 * die Anzahl zurück
	 */

	Monster() {
		anzahlMonster++;
		System.out.println(anzahlMonster + " . Monster anleglegt"); // Info

	}

	static void gibInfo() {
		System.out.println("Anzahl Monster: " + anzahlMonster);
	}

	public static void main(String[] args) {
		Monster monster1 = new Monster(); // Monsterobjekt - Konstruktor wird einmal aufgerufen
		Monster monster2 = new Monster(); // neues Monsterobjekt - zweiter Aufruf des Konstruktors

		gibInfo();// Aufruf der Methode
	}
}
