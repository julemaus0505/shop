package de.jupetersen.shop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import de.jupetersen.shop.entity.Kunde;
import de.jupetersen.shop.entity.Produkt;
import de.jupetersen.shop.entity.Warenkorb;
import de.jupetersen.shop.entity.WarenkorbEintrag;
import de.jupetersen.shop.model.WarenkorbTableModel;
import javafx.scene.control.PasswordField;
import net.miginfocom.swing.MigLayout;

public class Shop {

	private static JFrame frame;

	private static Warenkorb warenkorb;

	private static List<Kunde> kundenList;

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		// UIManager.setLookAndFeel(WebLookAndFeel.class.getName());

		System.out.println("Willkommen in meinem Shop.");

		List<Produkt> produkte = produkteAnlegen();

		kundenList = Kunde.lesen();

		warenkorb = warenkorbFuellen(kundenList.get(0), produkte);

		frame = new JFrame("Jules Stall Design");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1400, 800);
		frame.add(getPanelNorth(), BorderLayout.NORTH);
		frame.setVisible(true);

	}

	private static Warenkorb warenkorbFuellen(Kunde kunde, List<Produkt> produkte) {
		Warenkorb warenkorb = new Warenkorb(kunde);
		WarenkorbEintrag einlaminiert = new WarenkorbEintrag(produkte.get(0), 2);
		WarenkorbEintrag alu = new WarenkorbEintrag(produkte.get(1), 1);
		WarenkorbEintrag aluDimond = new WarenkorbEintrag(produkte.get(2), 3);
		warenkorb.addEintraeg(einlaminiert);
		warenkorb.addEintraeg(alu);
		warenkorb.addEintraeg(aluDimond);
		return warenkorb;
	}

	private static JPanel getPanelNorth() {
		JPanel panelNorth = new JPanel(new MigLayout(""));
		JLabel label = new JLabel("Willkommen in meinem Shop");
		panelNorth.add(label, "span, center, wrap");
		JButton shop = new JButton("Shop");
		JButton warenkorb = new JButton(new AbstractAction("Warenkorb") {

			@Override
			public void actionPerformed(ActionEvent e) {
				centerPanelAustauschen(getPanelWarenkorb());

			}
		});

		JButton materialien = new JButton(new AbstractAction("Materialien") {

			@Override
			public void actionPerformed(ActionEvent e) {
				westPanelAustauschen(WestButtonPanels.getPanelMaterialien());

			}
		});

		JButton galerie = new JButton(new AbstractAction("Galerie") {

			@Override
			public void actionPerformed(ActionEvent e) {
				westPanelAustauschen(WestButtonPanels.getPanelGalerie());

			}
		});
		JButton kundenstimmen = new JButton(new AbstractAction("Kundenstimmen") {

			@Override
			public void actionPerformed(ActionEvent e) {
				westPanelAustauschen(WestButtonPanels.getPanelKundenstimmen());

			}
		});
		JButton service = new JButton(new AbstractAction("Service") {

			@Override
			public void actionPerformed(ActionEvent e) {
				westPanelAustauschen(getPanelService());

			}
		});

		JButton anmelden = new JButton(new AbstractAction("Anmelden") {
			@Override
			public void actionPerformed(ActionEvent e) {
				centerPanelAustauschen(getPanelAnmeldung());
			}
		});

		panelNorth.add(anmelden);
		panelNorth.add(shop);
		panelNorth.add(warenkorb);
		panelNorth.add(materialien);
		panelNorth.add(galerie);
		panelNorth.add(kundenstimmen);
		panelNorth.add(service);

		panelNorth.setBackground(new Color(138, 160, 168));

		return panelNorth;

	}

	private static JPanel getPanelWarenkorb() {
		JPanel panelWarenkorb = new JPanel(new MigLayout(""));
		JTable tabelle = new JTable(new WarenkorbTableModel(warenkorb));
		panelWarenkorb.add(new JScrollPane(tabelle));
		return panelWarenkorb;
	}

	private static JPanel getPanelAnmeldung() {
		JPanel panelAnmeldung = new JPanel(new MigLayout("", "[]100[200]", ""));
		panelAnmeldung.add(new JLabel("E-mail *"));
		JTextField email = new JTextField();
		panelAnmeldung.add(email, "growx, wrap");
		JPasswordField passwort = new JPasswordField();
		panelAnmeldung.add(new JLabel("Passwort  *"));
		panelAnmeldung.add(passwort, "growx, wrap");

		JButton anmelden = new JButton(new AbstractAction("Anmelden") {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (!email.getText().contains("@")) {

					JOptionPane.showMessageDialog(getPanelAnmeldung(), "Die E-Mail Adresse ist nicht korrekt.",
							"Fehlermeldung", JOptionPane.ERROR_MESSAGE);

				}

				if (Shop.getKundenList().stream()
						.filter(kunde -> kunde.getEmail().equals(email.getText())
								&& kunde.getPasswort().equals(Kunde.getCrypPasswort(passwort.getPassword())))
						.count() >= 1) {

					JOptionPane.showMessageDialog(panelAnmeldung, "Sie haben sich erfolgreich eingeloggt");
				}

				else if (passwort.equals(passwort) || email.equals(email))

					JOptionPane.showMessageDialog(panelAnmeldung,
							"Ungültige E-Mail oder Passwort, sie sind noch nicht registriert", "Fehlermeldung",
							JOptionPane.ERROR_MESSAGE);
			}

			{
			}

		});

		JButton registrieren = new JButton(new AbstractAction("Neu Registrieren") {
			@Override
			public void actionPerformed(ActionEvent e) {
				centerPanelAustauschen(KundenRegistrierenPanel.getPanelRegistrieren());
			}
		});

		panelAnmeldung.add(registrieren);
		panelAnmeldung.add(anmelden);

		return panelAnmeldung;

	}

	private static JPanel getPanelService() {
		JPanel panelService = new JPanel(new MigLayout("", "[]120[120]", ""));
		JButton agbs = new JButton(new AbstractAction("AGB,s") {

			@Override
			public void actionPerformed(ActionEvent e) {
				centerPanelAustauschen(WestButtonPanels.getPanelAgbs());
			}

		});

		panelService.add(agbs, "wrap");
		JButton datenschutz = new JButton(new AbstractAction("Datenschutz") {

			@Override
			public void actionPerformed(ActionEvent e) {
				centerPanelAustauschen(WestButtonPanels.getPanelDatenschutz());
			}
		});
		panelService.add(datenschutz, "wrap");

		JButton widerrufsbelehrung = new JButton(new AbstractAction("Widerrufsbelehrung") {

			@Override
			public void actionPerformed(ActionEvent e) {
				centerPanelAustauschen(WestButtonPanels.getPanelWiderrufsbelehrung());
			}
		});

		panelService.add(widerrufsbelehrung, "wrap");

		JButton bezahlmethoden = new JButton(new AbstractAction("Bezahlmethoden") {

			@Override
			public void actionPerformed(ActionEvent e) {
				centerPanelAustauschen(WestButtonPanels.getPanelBezahlmethoden());
			}
		});
		panelService.add(bezahlmethoden, "wrap");

		JButton versandUndLieferzeit = new JButton(new AbstractAction("Versand und Lieferzeit") {

			@Override
			public void actionPerformed(ActionEvent e) {
				centerPanelAustauschen(WestButtonPanels.getPanelVersandUndLieferzeit());
			}
		});

		panelService.add(versandUndLieferzeit, "wrap");

		JButton impressum = new JButton(new AbstractAction("Impressum") {

			@Override
			public void actionPerformed(ActionEvent e) {
				centerPanelAustauschen(WestButtonPanels.getPanelImpressum());
			}
		});

		panelService.add(impressum, "wrap");

		panelService.setBackground(new Color(214, 217, 223));
		return panelService;
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

	private static void centerPanelAustauschen(JPanel panel) {
		BorderLayout layout = (BorderLayout) frame.getContentPane().getLayout();
		Component centerKomponente = layout.getLayoutComponent(BorderLayout.CENTER);
		if (centerKomponente != null) {
			frame.getContentPane().remove(centerKomponente);
		}
		frame.add(new JScrollPane(panel), BorderLayout.CENTER);
		frame.validate();

	}

	private static void westPanelAustauschen(JPanel panel) {
		frame.add(panel, BorderLayout.WEST);
		frame.validate();
	}

	public static List<Kunde> getKundenList() {
		return kundenList;
	}
}
