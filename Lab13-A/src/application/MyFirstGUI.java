package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MyFirstGUI extends Application {
	
	private Label messageLabel = new Label("Press the Button!");
	private Button b1 = new Button("Press");
	
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox vbox = new VBox(new HBox(10, b1, messageLabel));
			Scene scene = new Scene(vbox);
			b1.setStyle("-fx-background-color: blue");
			//I tried optional part 7 but ran out of time
			if(messageLabel.getText() == "Thanks for clicking!") {
				b1.setOnAction(click -> messageLabel.setText("Press the Button!"));
			}
			if(messageLabel.getText() == "Press the Button!") {
				b1.setOnAction(click -> messageLabel.setText("Thanks for clicking!"));
			}
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}