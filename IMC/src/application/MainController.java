package application;


import java.text.DecimalFormat;
import java.text.NumberFormat;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {
	
	public Button btnClickAqui; 
	public TextField name;
	public TextField height;
	public TextField weight;
	public TextField age;
	public TextField gender;
	//public TextField txtLabelHeight;
	//public TextField txtLabelWeight;
	
	Float Height;
	Float Weight;
	Float IMC;
	
	String status;
	
	public void clear() {
		
		name.setText("");
		height.setText("");
		weight.setText("");
		age.setText("");
		gender.setText("");
		
	}
	
	
	public void calculate() {
		
		// Validating that all fields have been filled in
		
		if(name.getText() == "" || height.getText() == "" || weight.getText() == "" || age.getText() == "" || gender.getText() == "") {
			Alert alerta = new Alert(AlertType.ERROR);
			alerta.setTitle("Blank Field");
			alerta.setContentText("Erro! There is some null field, please answer all of them!");					
			alerta.show();
		}else {
			
		
		
		try {
			
			Height = Float.parseFloat(height.getText());
			Weight = Float.parseFloat(weight.getText());
			

			
			//Float imc = (Float.parseFloat((height.getText()) * Integer.parseInt(height.getText() ) / Integer.parseInt( weight.getText()));
			IMC = Weight / (Height * Height)  ;
			
			NumberFormat formato = new DecimalFormat("0.0");
			String imcDisplay= formato.format(IMC);
			
			if(IMC <= 18.5) {
				status = "skinny";
			}else if(IMC <= 24.9 ) {
				status = "Normal";
			}else if(IMC <= 29.9) {
				status = "Fat I";
			}else if(IMC <= 39.9) {
				status = "Fat II";
			}else if(IMC > 40) {
				status = "Dudee!";
			}
			
			
			Alert alerta = new Alert(AlertType.CONFIRMATION);
			alerta.setTitle("IMC - Calculate 2.0");
			alerta.setContentText("Helloo " + name.getText() + "\n"+ "Your IMC is: "+ imcDisplay + "\n" + "Your status is: "+ status);
			System.out.println(imcDisplay);
			/*
			System.out.println("Height: " + height.getText());
			System.out.println("Weight: " + weight.getText());
			*/
			
			System.out.println("Height * Height= " + (Height * Height));
			
			
			alerta.show();
			
		} catch (Exception e) {
			// TODO: handle exception
			Alert alerta = new Alert(AlertType.ERROR);
			alerta.setTitle("Erro!");
			alerta.setContentText("Please, enter with number in the follow fields: Height; Weight and Age!");					
			alerta.show();
		}
			
		}
		
	}
	
}
