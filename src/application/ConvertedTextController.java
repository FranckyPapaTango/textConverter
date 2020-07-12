package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConvertedTextController {// extends Application {
	private String txt_conv;
	@FXML
    private TextArea areac ;
	

	public ConvertedTextController(TextArea area) {		
		//System.out.println("constructor withe area passed :)");
		String txt=area.getText();
		
		//remplacement des /" :
		String occ1="\\\""; String occ11="\\\'";
		//par des " :
		String occ2="\"";String occ22="\'";
		txt=txt.replace(occ1,occ2);txt=txt.replace(occ11,occ22);
		
		//remplacement des retour charriot \r\n :
		String occ3="\\r\\n";
		//par des rien (du vide):
		String occ33="\n";
		txt_conv=txt=txt.replace(occ3,occ33);
		
		
		//System.out.println("texte is :\n"+txt);
	}

	public void start( Stage newWindow) {

		areac =new TextArea() ;	

		try {
			Pane root = (Pane) FXMLLoader.load(getClass().getResource("ConvertedText.fxml"));
			Scene secondScene = new Scene(root, 830, 400);
//		secondScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			newWindow.setTitle("CONVERTED TEXT");
			newWindow.initModality(Modality.APPLICATION_MODAL);// bloque, interdit l'action sur la fenêtre Parente
																// pendant que les fenêtres filles sont actives
//			System.out.println("humm!! :\n"+txt_conv);

			
			root.getChildren().add(areac);
			areac.setText(txt_conv);
			

			newWindow.setScene(secondScene);
			newWindow.show();
			
			// Set position of second window, related to primary window.
			newWindow.setX(400);
			newWindow.setY(300);
			
		

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
