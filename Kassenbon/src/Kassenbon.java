
public class Kassenbon {

	public static void main(String[] args) {

		Bestellung bestellung1 = new Bestellung();
		Bestellung bestellung2 = new Bestellung();
		Bestellung bestellung3 = new Bestellung();
		Bestellung bestellung4 = new Bestellung();

		bestellung1.setProdukt("Wurst");
		bestellung2.setProdukt("Käse");
		bestellung3.setProdukt("Brot");
		bestellung4.setProdukt("DVD");

		bestellung1.setMenge(3);
		bestellung2.setMenge(1);
		bestellung3.setMenge(2);
		bestellung4.setMenge(2);

		bestellung1.setPreis(4.20); 
		bestellung2.setPreis(2.30);
		bestellung3.setPreis(2.10);
		bestellung4.setPreis(12.00);

		druckeBestellung(bestellung1);
		druckeBestellung(bestellung2);
		druckeBestellung(bestellung3);
		druckeBestellung(bestellung4);
		
		System.out.println("-------------------------------------------------");
	}

	// Wurst 1 x 4.20 EUR
	// 4.20 EUR
	private static void druckeBestellung(Bestellung bestellung) {
		System.out.println(bestellung);
		
		double summeEur = bestellung.getPreis() * bestellung.getMenge();
		System.out.println(String.format("\t\t\t\t %.2f EUR",summeEur));

		
	}
}