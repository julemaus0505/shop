package de.jupetersen.shop.entity;

public class WarenkorbEintrag {

	private int menge;

	private Produkt produkt;

	public WarenkorbEintrag(Produkt produkt, int menge) {
		this.produkt = produkt;
		this.menge = menge;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	public double getGesammtpreis() {
		return menge * produkt.getPreis();
	}

	public Produkt getProdukt() {
		return produkt;
	}

	public void setProdukt(Produkt produkt) {
		this.produkt = produkt;
	}

}
