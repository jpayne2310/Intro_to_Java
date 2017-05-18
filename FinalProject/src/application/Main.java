package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Morgage Calculator");		
			GridPane grid = new GridPane();
			Scene scene = new Scene(grid,290,500, Color.web("#e2e2e2"));
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//set grid format
			grid.setVgap(25);
			grid.setHgap(10);
			
			//declared textfields
			TextField homeValue = new TextField();
			TextField loanAmount = new TextField();
			TextField intRate = new TextField();
			TextField loanTerm = new TextField();
			TextField propertyTax = new TextField();
			TextField PMI = new TextField();
			TextField homeIns = new TextField();
			TextField monthlyHOA = new TextField();
			
			//declared controls
			Button btnCalculate = new Button("Calculate");
			
			//grid layout
			grid.add(new Text("Home Value:"), 0, 1);
			grid.add(homeValue, 1, 1);
			grid.add(new Text("$"), 2, 1);
			grid.add(new Text("Loan Amount:"), 0, 2);
			grid.add(loanAmount, 1, 2);
			grid.add(new Text("$"), 2, 2);
			grid.add(new Text("Interest Rate:"), 0, 3);
			grid.add(intRate, 1, 3);
			grid.add(new Text("%"), 2, 3);
			grid.add(new Text("Loan Term:"), 0, 4);
			grid.add(loanTerm, 1, 4);
			grid.add(new Text("years"), 2, 4);
			grid.add(new Text("Property Tax:"), 0, 5);
			grid.add(propertyTax, 1, 5);
			grid.add(new Text("%"), 2, 5);
			grid.add(new Text("PMI:"), 0, 6);
			grid.add(PMI, 1, 6);
			grid.add(new Text("%"), 2, 6);
			grid.add(new Text("Home Ins:"), 0, 7);
			grid.add(homeIns, 1, 7);
			grid.add(new Text("$/yr"), 2, 7);
			grid.add(new Text("Monthly HOA"), 0, 8);
			grid.add(monthlyHOA, 1, 8);
			grid.add(new Text("$"), 2, 8);
			grid.add(btnCalculate, 1, 9);
			
			btnCalculate.setOnAction(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent e) {
					double hValue = 0, lAmount = 0, iRate = 0,
							pTax = 0, pmi = 0, hIns = 0, mHOA = 0;
					int lTerm = 0;
					
					hValue = Double.parseDouble(homeValue.getText());
					System.out.println(hValue);
					lAmount = Double.parseDouble(loanAmount.getText());
					System.out.println(lAmount);
					iRate = Double.parseDouble(intRate.getText());
					System.out.println(iRate);
					lTerm = Integer.parseInt(loanTerm.getText());
					System.out.println(lTerm);
					pTax = Double.parseDouble(propertyTax.getText());
					System.out.println(pTax);
					pmi = Double.parseDouble(PMI.getText());
					System.out.println(pmi);
					hIns = Double.parseDouble(homeIns.getText());
					System.out.println(hIns);
					mHOA = Double.parseDouble(monthlyHOA.getText());
					System.out.println(mHOA);
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
