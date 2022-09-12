/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppTipografia extends Application {
    
    @Override
    public void start(Stage ventana) throws Exception {
        
        Parent interfaz = FXMLLoader.load(getClass().getResource("Interfaz.fxml"));
        
        //Mostrar Escena
        Scene escena = new Scene(interfaz);
        ventana.setTitle("Tipografía Script");
        ventana.setScene(escena);
        ventana.show();
    }
    public static void main (String[] args){
        launch(args);
    }
}
