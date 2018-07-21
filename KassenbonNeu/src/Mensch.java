
public class Mensch {

	int groesse = 156;

	int gewicht = 65;

	String name;

	public Mensch(String name) {
		this.name = name;
	}

	public void wachsen(int wachsen) {
		groesse = groesse + wachsen;
		System.out.println("neue größe: " + groesse);
	}

	public void zunehmen(int zunehmen) {

		gewicht = gewicht + zunehmen;
		System.out.println("neues gewicht:" + gewicht);

	}

}
