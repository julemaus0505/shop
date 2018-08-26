package application.anmelden;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class AnmeldenController {

	/*
	 * Damit du Zugriff auf die Textfelder und anderen grafischen Elemente bekommst
	 * musst du diese mit einer fx-ID versehen. Dies macht man in der FXML-Datei
	 * oder über den Designer
	 */
	@FXML
	private PasswordField passwordTextField;
	@FXML
	private TextField emailTextField;

	// Die OnAction-Methode ist wie die AbstractAction aus Swing, nur einfacher zu
	// schreiben
	@FXML
	public void onActionAnmelden() {
		if (emailTextField.getText() != null && !emailTextField.getText().isEmpty()
				&& passwordTextField.getText() != null && !passwordTextField.getText().isEmpty()) {

			System.out.println("E-mail ist " + emailTextField.getText().toString());
			System.out.println("Passwort ist " + passwordTextField.getText().toString());

		} else {
			System.out.println("Bitte alle Felder ausfüllen");
		}
	}

	@FXML
	public void onActionRegistrieren() {
		// Alert ist wie Dialog in Swing, zum Ausgeben von Hinweismeldungen
		Alert alert = new Alert(AlertType.INFORMATION,
				"Im Email-Textfield steht was drin: " + emailTextField.getText());
		alert.show();
	
	}

}
