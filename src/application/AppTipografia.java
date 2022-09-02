/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AppTipografia extends Application {
    
    @Override
    public void start(Stage ventana) throws Exception {
        
        //Creación de Nodo Raíz
        AnchorPane nodoRaiz = new AnchorPane();
        nodoRaiz.setPrefHeight(650.0);
        nodoRaiz.setPrefWidth(1300.0);
        
        //Mostrar Escena
        Scene escena = new Scene(nodoRaiz);
        ventana.setScene(escena);
        ventana.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
