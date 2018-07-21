// Klasse erstellt
public class KassenbonNeu { 

	// Es wird eine static main Methode erstellt
	public static void main(String[] args) {
		
		// Erstellung der Variable bestellung1 vom Datentyp Bestellung 
		Bestellung bestellung1;
		
		// Anlegen eines Objektes der Klasse Bestellung und speichern des Objektes in der Variable bestellung1	
		bestellung1 = new Bestellung();
		
		
		
		Bestellung bestellung2 = new Bestellung();
		Bestellung bestellung3 = new Bestellung();
		Bestellung bestellung4 = new Bestellung();
		
		// Aufruf der Methode setName an dem Objekt bestellung1
		bestellung1.setName("Wurst");
		
		
		bestellung2.setName("Käse");
		bestellung3.setName("Brot");
		bestellung4.setName("DVD");
		
		// Aufruf der Methode setMenge an dem Objekt bestellung1
		bestellung1.setMenge(1);
		
		
		bestellung2.setMenge(1);
		bestellung3.setMenge(1);
		bestellung4.setMenge(2);
		
		
		// Aufruf der Methode setPreis an dem Objekt bestellung1
		bestellung1.setPreis(4.20);
		
		
		bestellung2.setPreis(2.30);
		bestellung3.setPreis(2.10);
		bestellung4.setPreis(12.00);
		
		
		// Ausgabe auf der Konsole das Objekt bestellung1
		System.out.println(bestellung1);
		
		
		
		System.out.println(bestellung2);
		System.out.println(bestellung3);
		System.out.println(bestellung4);
		
		
		// Ausgabe auf der Konsole eine Leerzeile
		System.out.println();
		
		// Ausgabe auf der Konsole ------------------------------------
		System.out.println("----------------------------------------------------");
		
		// Ausgabe auf der Konsole 
		System.out.println("Gesamt");
		
		
		
		
	}

}
