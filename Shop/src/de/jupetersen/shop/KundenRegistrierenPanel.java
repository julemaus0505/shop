package de.jupetersen.shop;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import de.jupetersen.shop.entity.Kunde;
import net.miginfocom.swing.MigLayout;

public class KundenRegistrierenPanel {
	static JPanel getPanelRegistrieren() {

		JPanel panelRegistrieren = new JPanel(new MigLayout("", "[300]", ""));
		panelRegistrieren.add(new JLabel("Anrede *"), "wrap");
		JComboBox<String> anredeComboBox = new JComboBox<String>(new String[] { "Frau", "Herr" });
		panelRegistrieren.add(anredeComboBox, "growx, wrap");
		panelRegistrieren.add(new JLabel("Vorname *"), "wrap");
		JTextField vornameTextField = new JTextField();
		panelRegistrieren.add(vornameTextField, "growx, wrap");
		panelRegistrieren.add(new JLabel("Nachname *"), "wrap");
		JTextField nachnameTextField = new JTextField();
		panelRegistrieren.add(nachnameTextField, "growx, wrap");
		panelRegistrieren.add(new JLabel("Straße *"), "wrap");
		JTextField strasseTextField = new JTextField();
		panelRegistrieren.add(strasseTextField, "growx, wrap");
		panelRegistrieren.add(new JLabel("Hausnummer *"), "wrap");
		JTextField hausnummerTextField = new JTextField();
		panelRegistrieren.add(hausnummerTextField, "growx, wrap");
		panelRegistrieren.add(new JLabel("PLZ *"), "wrap");
		JTextField plzTextField = new JTextField();
		panelRegistrieren.add(plzTextField, "growx, wrap");
		panelRegistrieren.add(new JLabel("Ort *"), "wrap");
		JTextField ortTextField = new JTextField();
		panelRegistrieren.add(ortTextField, "growx, wrap");
		panelRegistrieren.add(new JLabel("Geb.Datum *"), "wrap");
		JTextField gebDatumTextField = new JTextField();
		panelRegistrieren.add(gebDatumTextField, "growx, wrap");

		panelRegistrieren.add(new JLabel("E-mail Adresse *"), "wrap");
		JTextField emailTextField = new JTextField();
		panelRegistrieren.add(emailTextField, "growx, wrap");
		panelRegistrieren.add(new JLabel("Passwort *"), "wrap");
		JPasswordField passwortTextField = new JPasswordField();
		panelRegistrieren.add(passwortTextField, "growx, wrap");
		panelRegistrieren.add(new JLabel("Passwort Wiederholen *"), "wrap");
		JPasswordField passwortWiderholenPasswortField = new JPasswordField();
		panelRegistrieren.add(passwortWiderholenPasswortField, "growx, wrap");

		JButton registrieren = new JButton(new AbstractAction("Registrieren") {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (passwortTextField.getPassword() == null || passwortTextField.getPassword().length == 0
						|| emailTextField.getText() == null || emailTextField.getText().isEmpty()) {
					// Fehlermeldung ausgeben
					JOptionPane.showMessageDialog(panelRegistrieren, "E-Mail und Passwort müssen eingegegben werden",
							"Fehlermeldung", JOptionPane.ERROR_MESSAGE);

				} else if (!new String(passwortTextField.getPassword())
						.equals(new String(passwortWiderholenPasswortField.getPassword()))) {

					JOptionPane.showMessageDialog(panelRegistrieren, "Beide Passwörter müssen übereinstimmen.",
							"Fehlermeldung", JOptionPane.ERROR_MESSAGE);

				} else if (!emailTextField.getText().contains("@")) {

					JOptionPane.showMessageDialog(panelRegistrieren, "Die E-Mail Adresse ist nicht korrekt.",
							"Fehlermeldung", JOptionPane.ERROR_MESSAGE);

				} else if (Shop.getKundenList().stream()
						.filter(kunde -> kunde.getEmail().equals(emailTextField.getText())).count() >= 1) {

				} else if (vornameTextField.getText() == null || vornameTextField.getText().length() == 0
						|| nachnameTextField.getText() == null || nachnameTextField.getText().length() == 0
						|| strasseTextField.getText() == null || strasseTextField.getText().length() == 0
						|| hausnummerTextField.getText() == null || hausnummerTextField.getText().length() == 0
						|| plzTextField.getText() == null || plzTextField.getText().length() == 0
						|| ortTextField.getText() == null || ortTextField.getText().length() == 0
						|| gebDatumTextField.getText() == null || gebDatumTextField.getText().isEmpty()) {

					JOptionPane.showMessageDialog(panelRegistrieren, "Sie müssen alle Felder ausfüllen.",
							"Fehlermeldung", JOptionPane.ERROR_MESSAGE);
				} else {
					Kunde kunde = new Kunde(emailTextField.getText(), new String(passwortTextField.getPassword()));
					System.out.println("Kunde angelegt:" + kunde);
					kunde.setAnrede((String) anredeComboBox.getSelectedItem());
					kunde.setGeburtsdatum(gebDatumTextField.getText());
					kunde.setHausnummer(hausnummerTextField.getText());
					kunde.setNachname(nachnameTextField.getText());
					kunde.setOrt(ortTextField.getText());
					kunde.setPasswortWiderholen(new String(passwortWiderholenPasswortField.getPassword()));
					kunde.setPlz(plzTextField.getText());
					kunde.setStrasse(strasseTextField.getText());
					kunde.setVorname(vornameTextField.getText());

					kunde.speichern();
				}
			}
		});
		panelRegistrieren.add(registrieren);

		return panelRegistrieren;

	}

	public boolean checkFile(File file) {
		// TODO Automatisch generierter Methodenstub
		return false;
	}

}
