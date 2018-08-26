package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainOld extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			GridPane grid = GridPane();
			grid.setPadding(new Insets(10, 10, 10, 10));
			grid.setVgap(10);
			grid.setHgap(10);

			Label emaiLabel = new Label("E-Mail:");
			TextField emailFeld = new TextField();
			emailFeld.setPromptText("Trage deinen E-Mail Adresse ein");

			Label passwortLabel = new Label("Passwort:");
			TextField passwortFeld = new TextField();
			passwortFeld.setPromptText("Trage deinen Passwort ein");

			Button anmeldeButton = new Button("Anmelden");
			anmeldeButton.setOnAction(e -> {
				if (emailFeld.getText() != null && !emailFeld.getText().isEmpty() && passwortFeld.getText() != null
						&& !passwortFeld.getText().isEmpty()) {

					System.out.println("E-mail ist" + emailFeld.getText().toString());
					System.out.println("Passwort ist" + passwortFeld.getText().toString());

				} else {
					System.out.println("Bitte alle Felder ausfüllen");
				}
			});

			GridPane.setConstraints(emailFeld, 0, 0);
			GridPane.setConstraints(emailFeld, 1, 0);
			GridPane.setConstraints(passwortFeld, 0, 1);
			GridPane.setConstraints(passwortFeld, 1, 1);
			GridPane.setConstraints(anmeldeButton, 0, 2);

			grid.getChildren().addAll(emailFeld, emailFeld, passwortLabel, passwortFeld, anmeldeButton);

			Scene scene = new Scene(grid, 600, 600);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private GridPane GridPane() {
		// TODO Automatisch generierter Methodenstub
		return null;
	}

	public static void main(String[] args) {
		launch(args);

	}
}

// BorderPane root =
// (BorderPane)FXMLLoader.load(getClass().getResource("ShopFx.fxml"));
// Scene scene = new Scene(root,600,600);
// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
