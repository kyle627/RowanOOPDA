package application;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

/**
 * 
 * @author Kyle Evangelisto
 *
 */
public class Driver extends Application {

	/**
	 * Variable decelerations
	 */
	private BorderPane borderpane;
	private Button check = new Button("Check");
	private Button newProblem = new Button("New");
	private TextField submission = new TextField();
	private Label label = new Label("Solve This:");
	private Label add = new Label("+");
	private Label number1 = new Label();
	private Label number2 = new Label();
	private Label answer = new Label("Enter Here:");
	
	/**
	 * GUI start up method
	 */
	@SuppressWarnings("exports")
	public void start(Stage primaryStage) {
		borderpane = new BorderPane();
		setup();
		buttonListeners();
		Scene scene = new Scene(borderpane,250,150);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Math Drill");
		primaryStage.show();
	}
	
	/**
	 * Button Logic
	 */
	private void buttonListeners() {
		newProblem.setOnAction(click -> {
			number1.setText(Integer.toString(generate()));
			number2.setText(Integer.toString(generate()));
			answer.setText("Enter Here");
			submission.setText("");
		});
		check.setOnAction(click ->{
			int user = Integer.parseInt(submission.getText());
			int num1 = Integer.parseInt(number1.getText());
			int num2 = Integer.parseInt(number2.getText());
			if(user == (num1 + num2)) {
				answer.setText("Correct!");
			}else {
				answer.setText("Incorrect!");
			}
		});
	}
	
	/**
	 * Panel Setup
	 */
	public void setup() {
		number1.setText(Integer.toString(generate()));
		number2.setText(Integer.toString(generate()));
		VBox buttons = new VBox(10, newProblem, check);
		VBox addition = new VBox(2, number1, add, number2);
		HBox bottom = new HBox(10, answer, submission);
		borderpane.setTop(label);
		borderpane.setLeft(buttons);
		borderpane.setRight(addition);
		borderpane.setBottom(bottom);
		borderpane.setPadding(new Insets(10));
	}
	
	/**
	 * 
	 * @return random integer
	 */
	private int generate() {
		Random rand = new Random();
		return rand.nextInt(10);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}