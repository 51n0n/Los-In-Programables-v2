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
    
    private static AnchorPane nodoRaiz = new AnchorPane();
    private static CrearCaracteres aux = new CrearCaracteres();
    
    @Override
    public void start(Stage ventana) throws Exception {
        
        nodoRaiz.setPrefHeight(650.0);
        nodoRaiz.setPrefWidth(1300.0);
        
        //Objetivo-> Intentar que lo de abajo funcione
        
        //CrearCaracteres aux = new CrearCaracteres();
        nodoRaiz.getChildren().add(aux.crear_A());
        
        
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
