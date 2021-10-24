package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

public class SampleController implements Initializable{
	private Stage stage;
	private Scene scene;
	private Parent root;
	public Button criar;
	
	public void vaiParaTela2(ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("tela2.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene  = new Scene(root,500,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			System.out.println("Erro        ");
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
