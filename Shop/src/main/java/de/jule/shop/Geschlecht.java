package de.jule.shop;

public enum Geschlecht {
	MAENNLICH("Männlich"), WEIBLICH("Weiblich");
	
	private String geschlecht;
	
	private Geschlecht (String geschlecht) {
		this.geschlecht = geschlecht;
		
	}
	
	@Override
	public String toString() {
		
		return geschlecht;
	}
	
}
