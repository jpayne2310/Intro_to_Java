package application;

import java.sql.Date;
import java.time.LocalDate;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Main extends Application {

	Scene scene1, scene2, scene3;
	ClientInfo client1 = new ClientInfo();
	CompareOptions client2 = new CompareOptions(0, 0, 0, 0, null, 0, 0, 0, 0);
	
	@Override
	public void start(Stage primaryStage) {
		

		try {
			primaryStage.setTitle("Morgage Calculator");
			GridPane grid = new GridPane();
			scene1 = new Scene(grid, 290, 530);
			scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// set grid format
			grid.setVgap(25);
			grid.setHgap(10);
			
			GridPane grid2 = new GridPane();
			scene2 = new Scene(grid2, 340, 500);
			scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// set grid format
			grid2.setVgap(10);
			grid2.setHgap(40);
			
			GridPane grid3 = new GridPane();
			scene3 = new Scene(grid3, 340, 500);
			scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// set grid format
			grid3.setVgap(10);
			grid3.setHgap(40);
			
			// declared controls
			Button btnCalculate = new Button("Calculate");
			final DatePicker datePicker = new DatePicker();
			Button button2 = new Button("Return to Calculator");
			button2.setOnAction(e -> primaryStage.setScene(scene1));
			Button button3 = new Button("Compare Options");
			Button button4 = new Button("Return to Calculator");
			button4.setOnAction(e -> primaryStage.setScene(scene1));
			Button btnReset = new Button("Reset");
			btnReset.setStyle("-fx-background-color: RED");


			// declared textfields for scene 1
			TextField homeValue = new TextField();
			TextField loanAmount = new TextField();
			TextField intRate = new TextField();
			TextField loanTerm = new TextField();
			TextField propertyTax = new TextField();
			TextField PMI = new TextField();
			TextField homeIns = new TextField();
			TextField monthlyHOA = new TextField();
			
			// grid 1 layout
			grid.add(new Text("Home Value:"), 0, 1);
			grid.add(homeValue, 1, 1);
			grid.add(new Text("$"), 2, 1);
			grid.add(new Text("Loan Amount:"), 0, 2);
			grid.add(loanAmount, 1, 2);
			grid.add(new Text("$"), 2, 2);
			grid.add(new Text("Interest Rate:"), 0, 3);
			grid.add(intRate, 1, 3);
			grid.add(new Text("%"), 2, 3);			
			grid.add(new Text("Start Date:"), 0, 4); 
			grid.add(datePicker, 1, 4);
			datePicker.setValue(LocalDate.now());	
			grid.add(new Text("Loan Term:"), 0, 5);
			grid.add(loanTerm, 1, 5);
			grid.add(new Text("years"), 2, 5);
			grid.add(new Text("Property Tax:"), 0, 6);
			grid.add(propertyTax, 1, 6);
			grid.add(new Text("%"), 2, 6);
			grid.add(new Text("PMI:"), 0, 7);
			grid.add(PMI, 1, 7);
			grid.add(new Text("%"), 2, 7);
			grid.add(new Text("Home Ins:"), 0, 8);
			grid.add(homeIns, 1, 8);
			grid.add(new Text("$/yr"), 2, 8);
			grid.add(new Text("Monthly HOA"), 0, 9);
			grid.add(monthlyHOA, 1, 9);
			grid.add(new Text("$"), 2, 9);
			
			grid.add(btnCalculate, 1, 10);
			grid.add(btnReset, 0, 10);
			
			// declare labels for scene 2
			Label headingForSceneTwo = new Label("Repayment");
			Label headingForSceneTwoPartTwo = new Label("Summary");
			Label payWithPMI = new Label("Payment with PMI");
			Label ansPayWithPMI = new Label("");
			Label payAfterMonths = new Label("After 26 months");
			Label ansPayAfterMonths = new Label();
			Label PMI26Payment = new Label("26 PMI Payments");
			Label ansPMI26Payment = new Label();
			Label totalPMI = new Label("Total PMI");
			Label ansTotalPMI = new Label();
			Label loanPayoffDate = new Label("Loan pay-off date");
			Label ansLoanPayoffDate = new Label();
			Label totalIntPaid = new Label("Total Interest Paid");
			Label ansTotalIntPaid = new Label();
			Label monthlyTaxPaid = new Label("Monthly Tax Paid");
			Label ansMonthlyTaxPaid = new Label();
			Label totalTaxPaid = new Label("Total Tax Paid");
			Label ansTotalTaxPaid = new Label();
			Label monthlyHomeIns = new Label("Monthly Home Insurance");
			Label ansMonthlyHomeIns = new Label();
			Label totalHomeIns = new Label("Total Home Insurance");
			Label ansTotalHomeIns = new Label();
			Label annualPaymentAmount = new Label("Annual Payment Amount");
			Label ansAnnualPaymentAmount = new Label();
			Label totalOfPayments = new Label("Total of 360 Payments");
			Label ansTotalOfPayments = new Label();

			
			
			// grid2 layout
			headingForSceneTwo.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
			grid2.add(headingForSceneTwo, 0, 0);
			headingForSceneTwoPartTwo.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
			grid2.add(headingForSceneTwoPartTwo, 1, 0);
			grid2.add(ansPayWithPMI, 0, 1);
			grid2.add(payWithPMI, 0, 2);
			grid2.add(ansPayAfterMonths, 1, 1);
			grid2.add(payAfterMonths, 1, 2);
			
			Line line1 = new Line(0, 100, 135, 100);
			grid2.add(line1, 0, 3);
			Line line2 = new Line(0, 100, 115, 100);
			grid2.add(line2, 1, 3);

			grid2.add(ansPMI26Payment, 0, 4);
			grid2.add(PMI26Payment, 0, 5);
			grid2.add(ansTotalPMI, 1, 4);
			grid2.add(totalPMI, 1, 5);
			
			Line line3 = new Line(0, 100, 135, 100);
			grid2.add(line3, 0, 6);
			Line line4 = new Line(0, 100, 115, 100);
			grid2.add(line4, 1, 6);

			grid2.add(ansLoanPayoffDate, 0, 7);
			grid2.add(loanPayoffDate, 0, 8);
			grid2.add(ansTotalIntPaid, 1, 7);
			grid2.add(totalIntPaid, 1, 8);
			
			Line line5 = new Line(0, 100, 135, 100);
			grid2.add(line5, 0, 9);
			Line line6 = new Line(0, 100, 115, 100);
			grid2.add(line6, 1, 9);

			grid2.add(ansMonthlyTaxPaid, 0, 10);
			grid2.add(monthlyTaxPaid, 0, 11);
			grid2.add(ansTotalTaxPaid, 1, 10);
			grid2.add(totalTaxPaid, 1, 11);
			
			Line line7 = new Line(0, 100, 135, 100);
			grid2.add(line7, 0, 12);
			Line line8 = new Line(0, 100, 115, 100);
			grid2.add(line8, 1, 12);

			grid2.add(ansMonthlyHomeIns, 0, 13);
			grid2.add(monthlyHomeIns, 0, 14);
			grid2.add(ansTotalHomeIns, 1, 13);
			grid2.add(totalHomeIns, 1, 14);
			
			Line line9 = new Line(0, 100, 135, 100);
			grid2.add(line9, 0, 15);
			Line line10 = new Line(0, 100, 115, 100);
			grid2.add(line10, 1, 15);

			grid2.add(ansAnnualPaymentAmount, 0, 16);
			grid2.add(annualPaymentAmount, 0, 17);
			grid2.add(ansTotalOfPayments, 1, 16);
			grid2.add(totalOfPayments, 1, 17);
			grid2.add(button2, 1, 20);
			grid2.add(button3, 0, 20);
			
			
			// declare labels for scene 3
			Label headingForSceneThree = new Label("Monthly Vs");
			Label headingForSceneThreePartTwo = new Label("Bi-Weekly");
			Label monthlyPayment = new Label("Monthly Payment");
			Label ansMonthlyPayment = new Label("");
			Label biWeeklyPayment = new Label("Bi-weekly Payment");
			Label ansBiWeeklyPayment = new Label();
			Label monthlyPayOffDate = new Label("Monthly Pay-off Date");
			Label ansMonthlyPayOffDate = new Label();
			Label biWeeklyPayOffDate = new Label("Bi-weekly Pay-off Date");
			Label ansBiWeeklyPayOffDate = new Label();
			Label monthlyIntPaid = new Label("Total Interest Paid");
			Label ansMonthlyIntPaid = new Label();
			Label biWeeklyIntPaid = new Label("Total Interest Paid");
			Label ansBiWeeklyIntPaid = new Label();
			Label savings = new Label("Your total savings by choosing the biweekly option: ");
			Label ansSavings = new Label();
			
			// grid3 layout
			headingForSceneThree.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
			grid3.add(headingForSceneThree, 0, 0);
			headingForSceneThreePartTwo.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
			grid3.add(headingForSceneThreePartTwo, 1, 0);
			grid3.add(ansMonthlyPayment, 0, 1);
			grid3.add(monthlyPayment, 0, 2);
			grid3.add(ansBiWeeklyPayment, 1, 1);
			grid3.add(biWeeklyPayment, 1, 2);
			
			Line line11 = new Line(0, 100, 135, 100);
			grid3.add(line11, 0, 3);
			Line line12 = new Line(0, 100, 115, 100);
			grid3.add(line12, 1, 3);

			grid3.add(ansMonthlyPayOffDate, 0, 4);
			grid3.add(monthlyPayOffDate, 0, 5);
			grid3.add(ansBiWeeklyPayOffDate, 1, 4);
			grid3.add(biWeeklyPayOffDate, 1, 5);
			
			Line line13 = new Line(0, 100, 135, 100);
			grid3.add(line13, 0, 6);
			Line line14 = new Line(0, 100, 115, 100);
			grid3.add(line14, 1, 6);

			grid3.add(ansMonthlyIntPaid, 0, 7);
			grid3.add(monthlyIntPaid, 0, 8);
			grid3.add(ansBiWeeklyIntPaid, 1, 7);
			grid3.add(biWeeklyIntPaid, 1, 8);
			grid3.add(button4, 0, 9);
			grid3.add(savings, 0 , 8, 10, 10);
			grid3.add(ansSavings, 0, 12);

			
			

			btnCalculate.setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent e) {
					LocalDate date = datePicker.getValue();
					client1.setHomeValue(Double.parseDouble(homeValue.getText()));
					client1.setLoanAmount(Double.parseDouble(loanAmount.getText()));
					client1.setIntRate(Double.parseDouble(intRate.getText()));
					client1.setLoanTerm(Integer.parseInt(loanTerm.getText()));								
					client1.setPropertyTax(Double.parseDouble(propertyTax.getText()));				
					client1.setDate(date.toString());
					client1.setHomeIns(Double.parseDouble(homeIns.getText()));
					client1.setMonthlyHOA(Double.parseDouble(monthlyHOA.getText()));
					
					primaryStage.setScene(scene2);
					
					ansPayWithPMI.setText(String.format("$%,6.2f",client1.CalMonthlyPayment()));
					ansPayAfterMonths.setText(String.format("$%6.2f",client1.CalAfterMonthsPMI()));
					ansPMI26Payment.setText(String.format("$%,6.2f",client1.CalMonthlyPMI()));
					ansTotalPMI.setText(String.format("$%,6.2f",client1.CalTotalPMI()));
					ansLoanPayoffDate.setText(String.format(client1.CalDate()));
					ansTotalIntPaid.setText(String.format("$%,6.2f",client1.CalTotalInterest()));
					ansMonthlyTaxPaid.setText(String.format("$%6.2f",client1.CalMonthlyTaxPaid()));
					ansTotalTaxPaid.setText(String.format("$%,6.2f",client1.CalTotalTaxPaid()));
					ansMonthlyHomeIns.setText(String.format("$%6.2f",client1.CalMonthlyHomeIns()));
					ansTotalHomeIns.setText(String.format("$%,6.2f",client1.CalTotalHomeIns()));
					ansAnnualPaymentAmount.setText(String.format("$%,6.2f",client1.CalAnnualPaymentAmount()));
					ansTotalOfPayments.setText(String.format("$%,6.2f",client1.CalTotalPaymentAmount()));				
				}

			});
			

			button3.setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent f) {
			
					primaryStage.setScene(scene3);
					ansMonthlyPayment.setText(String.format("$%6.2f",client1.CalAfterMonthsPMI()));
					ansBiWeeklyPayment.setText(String.format("$%,6.2f",client2.CalBiWeeklyPayment(client1.CalAfterMonthsPMI())));
					ansMonthlyPayOffDate.setText(String.format(client1.CalDate()));
					ansBiWeeklyPayOffDate.setText(String.format(client2.CalbiWeeklyPayOff(client1.CalDate())));
					ansMonthlyIntPaid.setText(String.format("$%,6.2f",client1.CalTotalInterest()));
					ansBiWeeklyIntPaid.setText(String.format("$%,6.2f",client2.CalbiWeeklyInt(Double.parseDouble(loanAmount.getText()))));
					ansSavings.setText(String.format("$%,6.2f", client2.savings(client1.CalTotalInterest())));
					
					//ansBiWeeklyPayment.setText(String.format("$%,6.2f",client2.CalBiWeeklyPayment(client1.CalAfterMonthsPMI())));
					
					//ansBiWeeklyIntPaid.setText(String.format("$%,6.2f",client2.CalbiWeeklyInt(Double.parseDouble(loanAmount.getText()))));
				}

			});
			
			btnReset.setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent d) {
			
					primaryStage.setScene(scene1);
					homeValue.setText("");
					loanAmount.setText("");
					intRate.setText("");
					loanTerm.setText("");								
					propertyTax.setText("");
					PMI.setText("");
					datePicker.setValue(LocalDate.now());
					homeIns.setText("");
					monthlyHOA.setText("");
	
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


