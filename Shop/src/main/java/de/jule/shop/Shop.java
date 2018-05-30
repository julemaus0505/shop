package de.jule.shop;

public class Shop {

//	Hauptmehtode des Programms
	public static void main(String[] args) {
//		Ersellen eines Objektes vom Typ Kunde
		Kunde kunde1 = new Kunde();
//		Setzen der Variable Name
		kunde1.setName("Müller");
		kunde1.setGeschlecht(Geschlecht.MAENNLICH);
		
		Adresse adresse1 = new Adresse();
		
		adresse1.setStrasse("Möhlenwisch");
		adresse1.setHausnummer("5");
		adresse1.setPlz("24329");
		adresse1.setOrt("Schönberg");
				
		kunde1.setAdresse(adresse1);
		
		
//		Setzen der Variable Vorname
		kunde1.setVorname("Max");
		
		begrusseKunde(kunde1);

		kunde1.setName("Mayer");
	
//		Setzen der Variable Geschlecht
		kunde1.setGeschlecht(Geschlecht.WEIBLICH);
		
//		Setzen der Variable Vorname
		kunde1.setVorname("Anja");
		
		begrusseKunde(kunde1);
		

	}

	private static void begrusseKunde(Kunde kunde) {
//		Bedingte Abfrage
		if (Geschlecht.WEIBLICH.equals(kunde.getGeschlecht())) {
//			Ausgarbe auf der Konsole
			System.out.println("Hallo Frau "+ kunde);
		} else {
			System.out.println("Hallo Herr "+ kunde);
			
		}
	}
	
}
