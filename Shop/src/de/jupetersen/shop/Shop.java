package de.jupetersen.shop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import de.jupetersen.shop.entity.Kunde;
import de.jupetersen.shop.entity.Produkt;
import de.jupetersen.shop.entity.Warenkorb;
import de.jupetersen.shop.entity.WarenkorbEintrag;
import de.jupetersen.shop.model.WarenkorbTableModel;

public class Shop {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//		UIManager.setLookAndFeel(WebLookAndFeel.class.getName());
		
		System.out.println("Willkommen in meinem Shop.");

		List<Produkt> produkte = produkteAnlegen();

		Kunde kunde = kundenAnlegen();

		Warenkorb warenkorb = warenkorbFuellen(kunde, produkte);

		warenkorbAusgabe(warenkorb);

	}

	private static Warenkorb warenkorbFuellen(Kunde kunde, List<Produkt> produkte) {
		Warenkorb warenkorb = new Warenkorb(kunde);
		WarenkorbEintrag eintrag = new WarenkorbEintrag(produkte.get(0), 2);
		warenkorb.addEintraeg(eintrag);
		return warenkorb;
	}

	private static void warenkorbAusgabe(Warenkorb warenkorb) {
		JFrame frame = new JFrame("Jules Stall Design");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900, 720);
		frame.add(getPanelOben(), BorderLayout.PAGE_START);
		frame.add(getPanelMitte(warenkorb), BorderLayout.CENTER);
		frame.setVisible(true);

	}

	private static JPanel getPanelOben() {
		JPanel panelOben = new JPanel();
		JLabel label = new JLabel("Willkommen in meinem Shop");
		panelOben.add(label);
		panelOben.setBackground(new Color(138, 160, 168));
		return panelOben;
	}

	private static JPanel getPanelMitte(Warenkorb warenkorb) {
		JPanel panelMitte = new JPanel();
		JTable tabelle = new JTable(new WarenkorbTableModel(warenkorb));
		panelMitte.add(new JScrollPane(tabelle));
		return panelMitte;
	}

	private static Kunde kundenAnlegen() {
		Kunde kundePetersen = new Kunde("julia.petersen0505@qgmail.com", "12545582255");
		return kundePetersen;
	}

	private static List<Produkt> produkteAnlegen() {
		List<Produkt> produkte = new ArrayList<>();
		Produkt produktAlu = new Produkt("Boxenschild Alu", 35.00);
		Produkt produktEinlaminiert = new Produkt("Boxensichlid einlaminiert", 16.50);
		Produkt produktAluDibondFinesrtGlänzend = new Produkt("Alu-Dibond Finesrt glänzend", 38.50);
		produkte.add(produktEinlaminiert);
		produkte.add(produktAlu);
		produkte.add(produktAluDibondFinesrtGlänzend);
		return produkte;
	}

}
