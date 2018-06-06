package de.jule.shop;

public class Shop {

//	Hauptmehtode des Programms
	
	public static void main(String[] args) {
//		Ersellen eines Objektes vom Typ Kunde
	
		Kunde kunde1 = new Kunde();
		Kunde kunde2 = new Kunde();
		
		
//		Setzen der Variable Name
		kunde1.setName("Müller");
		kunde2.setName("Petersen");
		
		
		kunde1.setGeschlecht(Geschlecht.MAENNLICH);
		kunde2.setGeschlecht(Geschlecht.WEIBLICH);
		
		Adresse adresse1 = new Adresse();
		Adresse adresse2 = new Adresse();
		
		adresse1.setStrasse("Möhlenwisch");
		adresse2.setStrasse("Deichweg");
		
		adresse1.setHausnummer("5");
		adresse2.setHausnummer("29");
		
		adresse1.setPlz("24329");
		adresse2.setPlz("24217");
		
		adresse1.setOrt("Schönberg");
		adresse2.setOrt("Schönberg");
				
		kunde1.setAdresse(adresse1);
		kunde2.setAdresse(adresse2);
		
//		Setzen der Variable Vorname
		kunde1.setVorname("Max");
		kunde2.setVorname("Julia");
		

		begrusseKunde(kunde1);
		begrusseKunde(kunde2);
		
	}

	private static void begrusseKunde(Kunde kunde) {
//		Bedingte Abfrage
		if (Geschlecht.WEIBLICH.equals(kunde.getGeschlecht())) 
//			Ausgarbe auf der Konsole
			System.out.println("Hallo Frau "+ kunde);
	 else 
			System.out.println("Hallo Herr "+ kunde);
		
	
		}
		
		
	
	}
	
	

