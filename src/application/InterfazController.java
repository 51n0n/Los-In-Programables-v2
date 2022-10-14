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
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class InterfazController implements Initializable {
    
    @FXML
    private AnchorPane fondoInterfaz;
    @FXML
    private TextField textoEntrada;
    @FXML
    private ColorPicker selectColor;
    
    Dibujar dibujar = new Dibujar(); // Objeto de la clase Dibujar
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dibujar.getLienzo().setStyle("-fx-background-color: LIGHTGRAY");
        dibujar.getLienzo().setLayoutX(30);
        dibujar.getLienzo().setLayoutY(60);
        dibujar.getLienzo().setPrefSize(1070, 450);
        dibujar.getLienzo().setMaxSize(1070, 450);
        fondoInterfaz.getChildren().add(dibujar.getLienzo()); // Se añade el lienzo de dibujo
        //fondoDibujo.setStyle("-fx-background-color: BLACK");
        //dibujar.guardarPalabras(", ^malo,  ^N+Kbueno ^S,,Khola, ^N,S+Kmundo");
        //dibujar.guardarPalabras(", malo,  ^N+Kbueno ^S,,Khola, ^N,S+Kmundo hghsfdsgsdgweeryrtjrtjrthergwegge");
        textoEntrada.setOnKeyTyped((KeyEvent event) -> {
            if (!dibujar.validarEntrada(event.getCharacter())){
                event.consume();
            }
        });
        
        textoEntrada.setOnKeyReleased((KeyEvent event) -> {
            dibujar.getLienzo().getChildren().clear();
            //dibujar.dibujarEntrada(textoEntrada.getText()); // Se dibuja
            dibujar.guardarPalabras(textoEntrada.getText());
        });
    }
    
    
    @FXML
    private void cambioColor (ActionEvent event){
        Color nuevoColor = selectColor.getValue(); // Se obtiene el valor de color del color picker de la interfaz
        dibujar.setColor(nuevoColor); // Se llama al setter del color para las letras y se asigna el color seleccionado en la interfaz
        dibujar.getLienzo().getChildren().clear();
        dibujar.guardarPalabras(textoEntrada.getText());
    }
    
}
