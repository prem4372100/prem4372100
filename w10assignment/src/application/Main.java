package application;

import javafx.application.Application;

import javafx.event.ActionEvent;

import javafx.event.EventHandler; 

import javafx.geometry.HPos; 

import javafx.geometry.Insets;

import javafx.geometry.Pos; 

import javafx.scene.Scene;

import javafx.scene.control.Button; 

import javafx.scene.control.ComboBox;

import javafx.scene.control.Label;

import javafx.scene.control.TextField;

import javafx.scene.control.DatePicker;

import javafx.scene.layout.GridPane;

import javafx.scene.layout.HBox; 

import javafx.stage.Stage;

public class Main extends Application {

	@Override

	public void start(Stage primaryStage) 

	{ GridPane pane = new GridPane();

	pane.setAlignment(Pos.CENTER);

	pane.setPadding(new Insets(11, 12, 13, 14));

	pane.setHgap(3); 

	pane.setVgap(3);

	pane.setBackground(null);

	

	 

	pane.setStyle("-fx-background-color: orange;");

	

	 Label titleLabel = new Label("Student Registration Form");

     titleLabel.setStyle("-fx-font-weight: bold;");

     pane.add(titleLabel, 0, 0);

	

	pane.add(new Label("Fill in this form to register"), 0, 1);

	

	pane.add(new Label("First Name:"), 0, 4);

	TextField firstNameField = new TextField(); 

	pane.add(firstNameField, 1, 4);

	

	pane.add(new Label("Last Name:"), 0, 5);

	TextField lastNameField = new TextField();

	pane.add(lastNameField, 1, 5);

	

	pane.add(new Label("Email:"), 0, 6);

	TextField emailField = new TextField();

	pane.add(emailField, 1, 6);

	

	pane.add(new Label("Date of Birth:"), 0, 7); 

	DatePicker  datepicker = new DatePicker();

	pane.add(datepicker, 1, 7); 

	

	pane.add(new Label("Set Username:"), 0, 8); 

	TextField UserNameField = new TextField();

	pane.add(UserNameField, 1, 8);

	

	pane.add(new Label("Set Password:"), 0, 9);

	TextField PwField = new TextField();

	pane.add(PwField, 1, 9);

	

	pane.add(new Label("Gender:"), 0, 10);

	ComboBox<String> genderComboBox = new ComboBox<>();

	genderComboBox.getItems().addAll("Male", "Female", "Other");

	pane.add(genderComboBox, 1, 10);

	

	pane.add(new Label("Course:"), 0, 14);

	ComboBox<String> courseComboBox = new ComboBox<>();

	courseComboBox.getItems().addAll("COMP 213", "COMP 930", "COMP 67", "COMP 210", "COMP 105");

	pane.add(courseComboBox, 1, 14);

	

	

	 

	

	HBox buttonBox = new HBox(15);

	buttonBox.setAlignment(Pos.BOTTOM_RIGHT); 

	Button btRegister = new Button("Register");

	OKHandlerClass handler1 = new OKHandlerClass();

	btRegister.setOnAction(handler1);

	buttonBox.getChildren().addAll(btRegister);

	pane.add(buttonBox, 0, 15);

	GridPane.setHalignment(buttonBox, HPos.CENTER);

	Scene scene = new Scene(pane, 400, 400); 

	primaryStage.setScene(scene);

	primaryStage.setTitle("Week10 Assignment");

	primaryStage.show();

	} 

	public static void main(String[] args) { launch(args);

	} 

	} 

class OKHandlerClass implements EventHandler<ActionEvent> {

	@Override

	public void handle(ActionEvent e)

	{ 

		System.out.println("Registered!!"); 

		} 

	}

