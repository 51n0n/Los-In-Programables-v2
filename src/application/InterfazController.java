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
import javafx.scene.layout.AnchorPane;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class InterfazController implements Initializable {
    
    @FXML
    private AnchorPane fondoInterfaz;
    @FXML
    private TextField textoEntrada;
    @FXML
    private ColorPicker selectColor;
    @FXML
    private CheckBox CheckPuntos;
    @FXML
    private BorderPane encabezado;
    @FXML
    private AnchorPane titulo;
    
    Dibujar dibujar = new Dibujar(); // Objeto de la clase Dibujar
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dibujar.guardarPalabras("^NLOS ^NIN-PROGRAMABLES",titulo);
        
        dibujar.getLienzo().setStyle("-fx-background-color: LIGHTGRAY;-fx-border-color: BLACK");
        dibujar.getLienzo().setLayoutX(0);
        dibujar.getLienzo().setLayoutY(0);
        dibujar.getLienzo().setPrefSize(1070, 450);
        dibujar.getLienzo().setMaxSize(1070, 450);
        fondoInterfaz.getChildren().add(dibujar.getLienzo()); // Se añade el lienzo de dibujo
        
        textoEntrada.setOnKeyTyped((KeyEvent event) -> {
            if (!dibujar.validarEntrada(event.getCharacter())){
                event.consume();
            }
        });
        
        textoEntrada.setOnKeyReleased((KeyEvent event) -> {
            dibujar.getLienzo().getChildren().clear();
            dibujar.guardarPalabras(textoEntrada.getText(),dibujar.getLienzo());
        });
    }
    
    
    @FXML
    private void cambioColor (ActionEvent event){
        Color nuevoColor = selectColor.getValue(); // Se obtiene el valor de color del color picker de la interfaz
        dibujar.setColor(nuevoColor); // Se llama al setter del color para las letras y se asigna el color seleccionado en la interfaz
        dibujar.getLienzo().getChildren().clear();
        dibujar.guardarPalabras(textoEntrada.getText(),dibujar.getLienzo());
    }
    
    @FXML
    private void puntosControl (ActionEvent event){
        dibujar.setControl(CheckPuntos.isSelected());
        dibujar.getLienzo().getChildren().clear();
        dibujar.guardarPalabras(textoEntrada.getText(),dibujar.getLienzo());
    }
    
}
