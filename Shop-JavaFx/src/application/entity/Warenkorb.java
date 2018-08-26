package application.entity;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {

	private Kunde kunde;

	private List<WarenkorbEintrag> eintraege;
	

	public Warenkorb(Kunde kunde) {
		this.setKunde(kunde);
		this.eintraege = new ArrayList<>();
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public List<WarenkorbEintrag> getEintraege() {
		return eintraege;
	}

	public void addEintraeg(WarenkorbEintrag eintrag) {
		this.eintraege.add(eintrag);
	}
	
}
