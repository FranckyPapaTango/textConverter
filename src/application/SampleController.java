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

		// r�cuperer le texte et l'envoyer au contolleur de la procha�ne vue:
		
     ConvertedTextController convertedTextController = new ConvertedTextController(area);
     convertedTextController.start(new Stage());		
	}

}
