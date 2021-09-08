package application;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import WriteText.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;





public class SampleController {

	public TextArea  textField;
	public TextField FileName;
	public TextField FilePath;
	
	// Declaração dos botões
	public Button btnSave;
	public Button btnOpen;
	public Button btnClear;
	
	String conteudo;
	/*
	public void saved() {
		
	}
	
	public void Erro() {
		
	}
	*/
	
	public void save() {
		//System.out.println("Cheguei até aqui");

		if(textField.getText() == "" || FilePath.getText() == "" || FileName.getText() == "") {
			Alert alerta = new Alert(AlertType.ERROR);
			alerta.setTitle("Erro");
			alerta.setContentText("Empty fields! Please fill in all fields");
			alerta.show();
			
		}else {
			
		
		escrever esc = new escrever(FileName.getText(),FilePath.getText(),textField.getText());
		try {
			
			String caminho = esc.getPath() + "/" + esc.getName();
			System.out.println(caminho);
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(caminho)));
			out.write(esc.getText() + "\n\n\n\n...\n\nThis file had been created by Cdsr99.");
			out.close();
			Alert saved = new Alert(AlertType.CONFIRMATION);
			saved.setTitle("Saved");
			saved.setContentText("The file had been saved!");
			saved.show();
			clear();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro");
			}
		}
		
		
	}
	public void open() {
		
		System.out.println("open!");
		String conteudo;
		
		if(FileName.getText() == "" || FilePath.getText() == "") {
			Alert alerta = new Alert(AlertType.ERROR);
			alerta.setTitle("Erro");
			alerta.setContentText("Empty fields! Please fill in all fields");
			alerta.show();
		}else {
			try {
				
				escrever esc = new escrever(FileName.getText(),FilePath.getText(),textField.getText());
				
				String caminho = esc.getPath() + "/" + esc.getName();
				
				BufferedReader in = new BufferedReader(new FileReader(caminho));
				System.out.println(in.readLine());
				
					while(in.readLine() != null) {
						System.out.println("\n");
						conteudo = in.readLine();
						System.out.println(conteudo);
						textField.setText(conteudo + "\n");
					}
						
				textField.setText(in.readLine());
				//textField.setText("TEstando");
				System.out.println(esc.getName());
				in.close();
				
				
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		}
		
	}
	public void clear() {
		
		FilePath.setText("");
		textField.setText("");
		FileName.setText("");
		
	}
	
	public void verificacao() {

			
		
	}
	
	
}
