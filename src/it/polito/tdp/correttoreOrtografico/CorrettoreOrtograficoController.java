/**
 * Sample Skeleton for 'CorrettoreOrtografico.fxml' Controller Class
 */

package it.polito.tdp.correttoreOrtografico;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class CorrettoreOrtograficoController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtAreaSopra"
    private TextArea txtAreaSopra; // Value injected by FXMLLoader

    @FXML // fx:id="btnSpellCheck"
    private Button btnSpellCheck; // Value injected by FXMLLoader

    @FXML // fx:id="txtAreaSotto"
    private TextArea txtAreaSotto; // Value injected by FXMLLoader

    @FXML // fx:id="lblErrore"
    private Label lblErrore; // Value injected by FXMLLoader

    @FXML // fx:id="btnClearText"
    private Button btnClearText; // Value injected by FXMLLoader

    @FXML // fx:id="lblTesto"
    private Label lblTesto; // Value injected by FXMLLoader

    @FXML
    void doClearText(ActionEvent event) {

    }

    @FXML
    void doSpellCheck(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtAreaSopra != null : "fx:id=\"txtAreaSopra\" was not injected: check your FXML file 'CorrettoreOrtografico.fxml'.";
        assert btnSpellCheck != null : "fx:id=\"btnSpellCheck\" was not injected: check your FXML file 'CorrettoreOrtografico.fxml'.";
        assert txtAreaSotto != null : "fx:id=\"txtAreaSotto\" was not injected: check your FXML file 'CorrettoreOrtografico.fxml'.";
        assert lblErrore != null : "fx:id=\"lblErrore\" was not injected: check your FXML file 'CorrettoreOrtografico.fxml'.";
        assert btnClearText != null : "fx:id=\"btnClearText\" was not injected: check your FXML file 'CorrettoreOrtografico.fxml'.";
        assert lblTesto != null : "fx:id=\"lblTesto\" was not injected: check your FXML file 'CorrettoreOrtografico.fxml'.";

    }
}
