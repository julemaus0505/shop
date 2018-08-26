/**
 * 
 */
package application;



import javafx.fxml.FXML;


/**
 * @author julia
 *
 */
public class StartseiteController {

	@FXML
	public void onActionShop() {

	}

	@FXML
	public void onActionAnmelden() {
		// Hier laden wir jetzt die Anmelde-Seite (Anmelden.fxml) und tauschen sie im
		// Center aus
		Main.centerPanelAustauschen("anmelden/Anmelden.fxml");
	}

	@FXML
	public void onActionMaterialien() {
		Main.centerPanelAustauschen("materialien/Materialien.fxml");
	}
}
