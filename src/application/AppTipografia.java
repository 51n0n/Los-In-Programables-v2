/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AppTipografia extends Application {
    
    private static BorderPane nodoRaiz = new BorderPane();
    private static Dibujar llamar = new Dibujar();
    
    @Override
    public void start(Stage ventana) throws Exception {
        
        //nodoRaiz.setPrefSize(1300,650);
        Parent interfaz = FXMLLoader.load(getClass().getResource("Interfaz.fxml"));
        nodoRaiz.getChildren().add(interfaz);
        //nodoRaiz.getChildren().add(llamar.leerEntrada());
        
        //Mostrar Escena
        Scene escena = new Scene(nodoRaiz,1350,670);
        ventana.setTitle("Tipografía Script");
        ventana.setScene(escena);
        ventana.show();
    }
    public static void main (String[] args){
        launch(args);
    }
}
