/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package tipografias.script.fluida;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author sonof
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button buttonFinalizar;
    @FXML
    private Button buttonIniciar;
    @FXML
    private TextField ingresarPalabra;
    @FXML
    private Canvas canvas;
    
    @FXML
    private void handleButtonIniciar(ActionEvent event) {
        //System.out.println("Inicio el proceso de dibujo");
        String palabra = ingresarPalabra.getText();
        //System.out.println(palabra);
    }
    
    @FXML
    private void handleButtonFinalizar(ActionEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
