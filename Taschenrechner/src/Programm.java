
/* Das Programm soll eine Klasse Taschenrechner benutzen
 * Die Klasse Taschenrechner stellt Methoden bereit um folgende Rechnungen ausführen zu können:
 * plus 
 * minus
 * mal
 * geteilet
 * 
 * Die Ergebnisse der Methodenaufrufe werden im Programm auf der Konsole ausgegeben
*/
public class Programm {

	public static void main(String[] args) {
		
		System.out.println(Taschenrechner.plus(2, 5));
		
		System.out.println(Taschenrechner.minus(10, 4));

		System.out.println(Taschenrechner.mal(8, 8));
		
		System.out.println(Taschenrechner.geteilt(16, 4));
		
		System.out.println(Taschenrechner.geteilt(16, 0));
	}

}
