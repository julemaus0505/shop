
public class Monster {

	static int anzahlMonster; // Klassenvariable zum Z�hlen der Instanzen

	/*
	 * Im Konstruktor soll jetzt die Variable erh�ht werden
	 * 
	 */

	/*
	 * Im Konstruktor soll jetzt die Variable erh�ht werden Bildschirmausgabe gibt
	 * die Anzahl zur�ck
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
