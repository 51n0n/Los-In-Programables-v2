/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import static application.Dibujar.getLienzo;
import static application.Dibujar.setColor;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class InterfazController implements Initializable {
    
    @FXML
    private AnchorPane fondoInterfaz;
    @FXML
    private Button botonFinal;
    @FXML
    private Button botonInicio;
    @FXML
    private TextArea textoFondo;
    @FXML
    private TextField textoEntrada;
    @FXML
    private ColorPicker selectColor;
    @FXML
    private Label labelValidacion;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fondoInterfaz.getChildren().add(getLienzo()); // Se añade el lienzo de dibujo
        botonFinal.setDisable(true); // Botón reset desactivado como valor inicial
    }
    
    
    String cadena = new String(); // Objeto string para la entrada
    Dibujar dibujar = new Dibujar(); // Objeto dibujar a modo de "puntero"
    
    @FXML
    private void leer (ActionEvent event){
        cadena = textoEntrada.getText(); // Se recibe la cadena ingresada
        if(dibujar.validarEntrada(cadena)){ // Se valida la entrada
            dibujar.dibujarEntrada(cadena); // Se dibuja
        }
        else{ // Si la entrada no es válida no se dibuja y se muestra un mensaje
            labelValidacion.setText("Entrada no válida");
        }
        botonInicio.setDisable(true); // Se desactiva el botón de dibujo
        botonFinal.setDisable(false); // Se activa el botón reset
    }
    
    @FXML
    private void reset (ActionEvent event){
        textoEntrada.clear(); // Se limpia el cuadro de la entrada
        getLienzo().getChildren().clear(); // Se borra lo que esté dibujado
        labelValidacion.setText(""); // Se borra el mensaje de entrada no válida
        botonInicio.setDisable(false); // Se activa el botón de dibujo
        botonFinal.setDisable(true); // Se desactiva el botón reset
    }
    
    @FXML
    private void cambioColor (ActionEvent event){
        Color nuevoColor = selectColor.getValue(); // Se obtiene el valor de color del color picker de la interfaz
        setColor(nuevoColor); // Se llama al setter del color para las letras y se asigna el color seleccionado en la interfaz
    }
}
