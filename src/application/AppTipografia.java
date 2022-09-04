/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package application;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppTipografia extends Application {
    
    public static final int XSIZE = 1200;
    public static final int YSIZE = 600;
    public static GridPane tabla = new GridPane();
    private static AnchorPane nodoRaiz = new AnchorPane();
    //private static Clase objeto;
    private static Scene escena = new Scene(nodoRaiz);
    //private static Clase sigObjeto = Controller.metodo();
    
    @Override
    public void start(Stage ventana) throws Exception {
        
        //Creación de Nodo Raíz
        nodoRaiz.setPrefHeight(YSIZE);
        nodoRaiz.setPrefWidth(XSIZE);
        
        //Objetivo-> Intentar que lo de abajo funcione
        /*
        CrearCaracteres aux = new CrearCaracteres();
        nodoRaiz.getChildren().add(aux.crear_A());
        */
        
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
