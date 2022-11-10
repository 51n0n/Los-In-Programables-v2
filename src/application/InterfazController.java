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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.DragEvent;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class InterfazController implements Initializable {
    
    @FXML
    private AnchorPane ventana;
    @FXML
    private TextField textoEntrada;
    @FXML
    private AnchorPane lienzo;
    @FXML
    private ColorPicker LetrasColor;
    @FXML
    private ColorPicker PuntosColor;
    @FXML
    private ToggleButton BotonPuntos;
    
    Dibujar dibujar = new Dibujar(); // Objeto de la clase Dibujar
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        dibujar.setLienzo(lienzo);
        
        textoEntrada.setOnKeyTyped((KeyEvent event) -> {
            if (!dibujar.validarEntrada(event.getCharacter())){
                event.consume();
            }
        });
        
        ventana.setOnMouseMoved((MouseEvent event) -> { //SOLUCIÓN CHANCHA
            dibujar.getLienzo().getChildren().clear();
            dibujar.guardarPalabras(textoEntrada.getText(),dibujar.getLienzo());
        });
        
        textoEntrada.setOnKeyReleased((KeyEvent event) -> {
            dibujar.getLienzo().getChildren().clear();
            dibujar.guardarPalabras(textoEntrada.getText(),dibujar.getLienzo());
            //dibujar.guardarPalabras("^NLOS ^NIN-PROGRAMABLES",titulo);
        });
    }
    
    
    @FXML
    private void cambioColor(ActionEvent event){
        Color nuevoColor = LetrasColor.getValue(); // Se obtiene el valor de color del color picker de la interfaz
        dibujar.setColor(nuevoColor); // Se llama al setter del color para las letras y se asigna el color seleccionado en la interfaz
        dibujar.getLienzo().getChildren().clear();
        dibujar.guardarPalabras(textoEntrada.getText(),dibujar.getLienzo());
    }
    
    @FXML
    private void colorControl(ActionEvent event){
        Color nuevoColor = PuntosColor.getValue();
        dibujar.setColorControl(nuevoColor);
        dibujar.getLienzo().getChildren().clear();
        dibujar.guardarPalabras(textoEntrada.getText(),dibujar.getLienzo());
    }
    
    @FXML
    private void puntosControl(ActionEvent event){
        dibujar.setControl(BotonPuntos.isSelected());
        dibujar.setColorControl(PuntosColor.getValue());
        dibujar.getLienzo().getChildren().clear();
        dibujar.guardarPalabras(textoEntrada.getText(),dibujar.getLienzo());
    }
    
}
