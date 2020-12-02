package application;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

/**
 * 
 * @author Kyle Evangelisto
 *
 */
public class Driver extends Application{
	
	private Image image1 = new Image("file:jake.png");
	private Image image2 = new Image("file:jake2.png");
	private Image image3 = new Image("file:jake3.png");
	private Button change = new Button("Change");
	private ImageView imageview;
	private BorderPane borderpane;
	private int counter;
	
	@Override
	public void start(Stage primaryStage) {
		borderpane = new BorderPane();
		buttonLogic();
		imageHandler();
		
		HBox hbox = new HBox(imageview);
		HBox bottom = new HBox(change);
		Scene scene = new Scene(borderpane);
		
		borderpane.setTop(hbox);
		borderpane.setBottom(bottom);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Image Scroller");
		primaryStage.show();
	}
	
	private void imageHandler() {
		imageview = new ImageView(image1);
		imageview.setFitHeight(400);
		imageview.setFitWidth(300);
		imageview.setPreserveRatio(true);
		imageview.setSmooth(true);
	}

	private void buttonLogic() {
		change.setOnAction(click -> {
			switch(counter) {
				case 0:
					imageview.setImage(image2);
					counter += 1;
					break;
				case 1:
					imageview.setImage(image3);
					counter += 1;
					break;
				case 2:
					imageview.setImage(image1);
					counter = 0;
					break;
				default:
					imageview.setImage(image1);
			}
		});
		
	}


	public static void main(String[] args) {
		launch(args);
	}

}
