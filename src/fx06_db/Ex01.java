package fx06_db;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ex01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("EventTest.fxml"));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		
		Controller ct1 = loader.getController();
		ct1.setRoot(root);
		
		arg0.setScene(scene);
		arg0.show();
	}
}
