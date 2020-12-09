package application;
/**
 *   Simple Chat Client  
 *   adapted from HeadFirst java
 *   converted to JavaFX  SU19 for OOPDA
 *  
 *   static constants
 *       IP_ADDRESS and PORT_NUM 
 *   can be changed
 *   
 *   Be sure to Run As: Application
 *     1) run Server  [if localhost]
 *     2) run this client
 * 	
 */
import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class SimpleChatClientA extends Application {
	static final int PORT_NUM = 5000;  
	static final String IP_ADDRESS = "38.100.118.250"; //localhost
 
	
	private TextField outgoing;
    private PrintWriter writer;
    private Socket sock;
    private BufferedReader reader;
    private String name;
	private TextArea textArea;
	private BorderPane root;
	private JOptionPane option;
	
		
	@Override
	public void start(Stage primaryStage) {
		
		    root = new BorderPane();
		    setup();  //set up the screen		
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show(); 
	}
	
	private void setup()
	{		
		outgoing = new TextField("                   ");
		option = new JOptionPane();
		name = JOptionPane.showInputDialog("Enter your name: ");
		Button sendButton = new Button("Send");
		sendButton.setOnAction(click->   { 
			writer.println(name + " " + outgoing.getText());
			writer.flush();
			outgoing.setText("");
			outgoing.requestFocus();
		   }
		);

		HBox mainPanel = new HBox(200, outgoing,sendButton );
        mainPanel.setAlignment(Pos.CENTER);
        root.setBottom(mainPanel);
        
        textArea = new TextArea();
        textArea.setMinHeight(300);
        root.setCenter(textArea);
		setUpNetworking();

	}

	private void setUpNetworking()
	{
		try {
			sock = new Socket(IP_ADDRESS, PORT_NUM);  

			writer = new PrintWriter(sock.getOutputStream());

			InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
			reader = new BufferedReader(isReader);


			new Thread(new Runnable() {
				public void run() {
					String message;
					try {
						while ((message = reader.readLine()) != null) {
							//                            System.out.println("client read: " + message);
							println("> " + message);
						}
					} catch (Exception ex) { ex.printStackTrace(); }
				}
			}).start();

			System.out.println("networking established");
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}

	public void println(String text) {
		textArea.appendText(text + String.format("%n"));

		//textArea.snapPosition(textArea.getParent().getLength());	// auto-scroll
	}




	public static void main(String[] args) {
		launch(args);
	}
}
