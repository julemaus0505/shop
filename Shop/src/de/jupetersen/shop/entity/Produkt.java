package de.jupetersen.shop.entity;

public class Produkt {

	
	private String produkt;

	private double preis;

	public Produkt(String produkt, double preis) {
		this.produkt = produkt;
		this.setPreis(preis);
	}

	public String getProdukt() {
		return produkt;
	}

	public void setProdukt(String produkt) {
		this.produkt = produkt;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

}
