/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class InterfazController implements Initializable {

    @FXML
    private AnchorPane fondoInterfaz;
    @FXML
    private Button botonFinal;
    @FXML
    private Button botonInicio;
    @FXML
    private TextField textoFondo;
    @FXML
    private TextArea textoEntrada;
    @FXML
    private ColorPicker selectColor;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    /*
        EventHandler<ActionEvent> event = (ActionEvent e) -> {
        label.setText(t.getText());
        };
        t.setOnAction(event);
    */
}
