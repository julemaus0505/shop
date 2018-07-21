
public class Kassenbon {

	public static void main(String[] args) {

		// Bestellung ist der Typ der Variable

		// bestellung1 ist Name der Variable

		// mit = weisen wir der Variable einen Wert zu.

		Bestellung bestellung1 = new Bestellung();
		Bestellung bestellung2 = new Bestellung();
		Bestellung bestellung3 = new Bestellung();
		Bestellung bestellung4 = new Bestellung();

		bestellung1.setProdukt("Wurst");
		bestellung2.setProdukt("Käse");
		bestellung3.setProdukt("Brot");
		bestellung4.setProdukt("DVD");

		bestellung1.setMenge(1);
		bestellung2.setMenge(1);
		bestellung3.setMenge(1);
		bestellung4.setMenge(5);

		bestellung1.setPreis(4.20);
		bestellung2.setPreis(2.30);
		bestellung3.setPreis(2.10);
		bestellung4.setPreis(12.00);

		double gesamtsumme = druckeBestellung(bestellung1);
		gesamtsumme += druckeBestellung(bestellung2);
		gesamtsumme += druckeBestellung(bestellung3);
		gesamtsumme += druckeBestellung(bestellung4);

		System.out.println("-------------------------------------------------");

		System.out.println(String.format("Gesamt\t\t\t\t %.2f EUR", gesamtsumme));

		double gegeben = 50.00;

		if (gesamtsumme < gegeben) {

			System.out.println(String.format("Gegeben\t\t\t\t %.2f EUR", gegeben));

			double zurueck = gegeben - gesamtsumme;

			System.out.println();
			System.out.println(String.format("Zurück\t\t\t\t %.2f EUR", zurueck));

		} else {
			System.out.println();
			System.out.println("Das Geld reicht nicht.");
			System.out.println();
			System.out.println(String.format("Es fehlen\t\t\t %.2f EUR", gesamtsumme - gegeben));
		}
	}

	// Wurst 1 x 4.20 EUR
	// 4.20 EUR
	private static double druckeBestellung(Bestellung bestellung) {
		System.out.println(bestellung);

		double summeEur = bestellung.getPreis() * bestellung.getMenge();
		System.out.println(String.format("\t\t\t\t %.2f EUR", summeEur));
		return summeEur;
	}
}