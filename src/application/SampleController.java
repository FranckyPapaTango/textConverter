package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class SampleController {

	@FXML
    private TextArea area ;	
	
	@FXML
    private Button btn ;	

	public void onClick() {

		// récuperer le texte et l'envoyer au contolleur de la prochaîne vue:
		
     ConvertedTextController convertedTextController = new ConvertedTextController(area);
     convertedTextController.start(new Stage());		
	}

}
