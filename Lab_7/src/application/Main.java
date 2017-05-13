package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Label personAge = new Label("What is your age in years?");
			root.add(personAge, 0,1);
			TextField ageTextfield = new TextField();
			root.add(ageTextfield, 1, 1);
			
			Label personHeight = new Label("What is your total height?");
			root.add(personHeight, 0, 2);
			TextField heightTextField = new TextField();
			root.add(heightTextField, 1, 2);
			
			Label personWeight = new Label("What is your weight in pounds?");
			root.add(personWeight, 0, 3);
			TextField weightTextField = new TextField();
			root.add(weightTextField, 1, 3);
			
			Label personGender = new Label("Choose your gender:");
			root.add(personGender, 0, 4);
			final ToggleGroup group =  new ToggleGroup();
			RadioButton rbMale = new RadioButton("Male");
			RadioButton rbFemale = new RadioButton("Female");
			HBox genderSelection = new HBox();
			genderSelection.getChildren().add(rbMale);
			genderSelection.getChildren().add(rbFemale);
			rbMale.setToggleGroup(group);
			root.add(genderSelection, 1, 4);
			
			Label activities = new Label("Activity:");
			root.add(activities, 0, 5);
			ChoiceBox active = new ChoiceBox();
			active.setItems(FXCollections.observableArrayList("Sedentary", "Somewhat active (exercise occasionally)", "Active (exerise 3-4 days per week)", "Highly active (exercise everyday)"));
			active.getSelectionModel().selectFirst();
			root.add(active, 1, 5);
			
			
			Button btn = new Button("Submit");
			root.add(btn, 0, 6);
			
			Label results = new Label("");
			root.add(results, 0, 7);
			
			btn.setOnAction(new EventHandler<ActionEvent>() {
				 
			    
			    public void handle(ActionEvent e) {
			        btn.setTextFill(Color.FIREBRICK);
			        btn.setText("Sign in button pressed");
			        int age, height, weight;
			        String gender = "";
			        age = Integer.parseInt(ageTextfield.getText());
			        
			       
			        height = Integer.parseInt(heightTextField.getText());
			        System.out.println(height);
			        weight = Integer.parseInt(weightTextField.getText());
			        System.out.println(weight);
			        if(rbMale.isSelected()) {
			        	gender = "male";
			        }
			        if(rbFemale.isSelected()) {
			        	gender = "female";
			        }
			        System.out.println(gender);
			      //initialize calculating variables 
					double BMG = 0.0, bars = 0.0, bar_calories = 230;
					
					if(gender.equals("male")) {
						BMG = (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));
					} else {
						BMG = (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age));
					}
					String activity = "";
					activity = active.getValue().toString();
					
					System.out.println(activity);
					switch(activity) {
					case "Sedentary":
						bars = (BMG * 1.2)/bar_calories;
						break;
					case "Somewhat active (exercise occasionally)":
						bars = (BMG * 1.3)/bar_calories;
						break;
					case "Active (exerise 3-4 days per week)":
						bars = (BMG * 1.4)/bar_calories;
						break;
					case "Highly active (exercise everyday)":
						bars = (BMG * 1.5)/bar_calories;
						break;
					}
						System.out.println(bars);
						String output = Double.toString(bars);
						results.setText(output);
			    }
			});
			    
			
			
			
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
