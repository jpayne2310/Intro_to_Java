package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class Main extends Application {

	Scene scene1, scene2;
	ClientInfo client1 = new ClientInfo();
	
	
	@Override
	public void start(Stage primaryStage) {

		Button button2 = new Button("Go to scene 1");
		button2.setOnAction(e -> primaryStage.setScene(scene1));

		try {
			primaryStage.setTitle("Morgage Calculator");
			GridPane grid = new GridPane();
			scene1 = new Scene(grid, 290, 500, Color.BLACK);
			scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// set grid format
			grid.setVgap(25);
			grid.setHgap(10);

			GridPane grid2 = new GridPane();
			scene2 = new Scene(grid2, 340, 500, Color.BLACK);
			scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// set grid format
			grid2.setVgap(10);
			grid2.setHgap(40);
			//grid2.setGridLinesVisible(true);
			

			// declared textfields for scene 1
			TextField homeValue = new TextField();
			TextField loanAmount = new TextField();
			TextField intRate = new TextField();
			TextField loanTerm = new TextField();
			TextField propertyTax = new TextField();
			TextField PMI = new TextField();
			TextField homeIns = new TextField();
			TextField monthlyHOA = new TextField();

			// declare labels for scene 2
			Label payWithPMI = new Label("Payment with PMI");
			Label ansPayWithPMI = new Label("$1,693.54");
			
			Label payAfterMonths = new Label("After 26 months");
			Label ansPayAfterMonths = new Label("$1,589.37");
			Label PMI26Payment = new Label("26 PMI Payments");
			Label ansPMI26Payment = new Label("104.17");
			Label totalPMI = new Label("Total PMI");
			Label ansTotalPMI = new Label("$2,708.33");
			Label loanPayoffDate = new Label("Loan pay-off date");
			Label ansLoanPayoffDate = new Label("Apr, 2047");
			Label totalIntPaid = new Label("Total Interest Paid");
			Label ansTotalIntPaid = new Label("$176,965.43");
			Label monthlyTaxPaid = new Label("Monthly Tax Paid");
			Label ansMonthlyTaxPaid = new Label();
			Label totalTaxPaid = new Label("Total Tax Paid");
			Label ansTotalTaxPaid = new Label();
			Label monthlyHomeIns = new Label("Monthly Home Insurance");
			Label ansMonthlyHomeIns = new Label();
			Label totalHomeIns = new Label("Total Home Insurance");
			Label ansTotalHomeIns = new Label();
			Label annualPaymentAmount = new Label("Annual Payment Amount");
			Label ansAnnualPaymentAmount = new Label("$19,072.46");
			Label totalOfPayments = new Label("Total of 360 Payments");
			Label ansTotalOfPayments = new Label("$574,882.10");

// grid2 layout
			grid2.add(ansPayWithPMI, 0, 1);
			grid2.add(payWithPMI, 0, 2);
			grid2.add(ansPayAfterMonths, 1, 1);
			grid2.add(payAfterMonths, 1, 2);

			grid2.add(ansPMI26Payment, 0, 3);
			grid2.add(PMI26Payment, 0, 4);
			grid2.add(ansTotalPMI, 1, 3);
			grid2.add(totalPMI, 1, 4);

			grid2.add(ansLoanPayoffDate, 0, 5);
			grid2.add(loanPayoffDate, 0, 6);
			grid2.add(ansTotalIntPaid, 1, 5);
			grid2.add(totalIntPaid, 1, 6);

			grid2.add(ansMonthlyTaxPaid, 0, 7);
			grid2.add(monthlyTaxPaid, 0, 8);
			grid2.add(ansTotalTaxPaid, 1, 7);
			grid2.add(totalTaxPaid, 1, 8);

			grid2.add(ansMonthlyHomeIns, 0, 9);
			grid2.add(monthlyHomeIns, 0, 10);
			grid2.add(ansTotalHomeIns, 1, 9);
			grid2.add(totalHomeIns, 1, 10);

			grid2.add(ansAnnualPaymentAmount, 0, 11);
			grid2.add(annualPaymentAmount, 0, 12);
			grid2.add(ansTotalOfPayments, 1, 11);
			grid2.add(totalOfPayments, 1, 12);
			grid2.add(button2, 1, 13);

			// declared controls
			Button btnCalculate = new Button("Calculate");

			// grid layout
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
					//double hValue = 0, lAmount = 0, iRate = 0, pTax = 0, pmi = 0, hIns = 0, mHOA = 0;
					//int lTerm = 0;
					
					
					client1.setHomeValue(Double.parseDouble(homeValue.getText()));
					client1.setLoanAmount(Double.parseDouble(loanAmount.getText()));
					client1.setIntRate(Double.parseDouble(intRate.getText()));
					client1.setLoanTerm(Integer.parseInt(loanTerm.getText()));								
					client1.setPropertyTax(Double.parseDouble(propertyTax.getText()));				
					client1.setPMI(Double.parseDouble(PMI.getText()));
					client1.setHomeIns(Double.parseDouble(homeIns.getText()));
					client1.setMonthlyHOA(Double.parseDouble(monthlyHOA.getText()));
					
					primaryStage.setScene(scene2);
					
					ansMonthlyHomeIns.setText(Double.toString(client1.CalMonthlyHomeIns()));
					ansTotalHomeIns.setText(Double.toString(client1.CalTotalHomeIns()));
					ansMonthlyTaxPaid.setText(Double.toString(client1.CalMonthlyTaxPaid()));
					ansTotalTaxPaid.setText(Double.toString(client1.CalTotalTaxPaid()));
				}

			});
			
			

			primaryStage.setScene(scene1);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}


}


