
public class Player {

	// stark vereinfacht Pseudo-Code für eine Pac-Man-Klasse
	int x; // speichert die aktuelle Position
	int y;

	// Konstruktor, initialisiert die Datenfelder
	Player(int startx, int starty) {

		x = startx;
		y = starty;
	}

	// Methoden zur Bewegung der Spielfigur
	boolean moveLeft() {
		if (isBewegungNachLinksMoeglich()) {
			x = x - 1; // Koordinate ändern
			// Code, um den Player auf dem Bildschirm
			// neu zu zeichnen...

			return true;
		} else {
			return false;
		}
	}

	private boolean isBewegungNachLinksMoeglich() {
		// TODO Automatisch generierter Methodenstub
		return false;
	}

	boolean moveRight() {
		return false;
	} // analoger Code

	boolean moveUp() {
		return false;
	}

	boolean moveDown() {
		return false;
	}

}
