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
    private static AnchorPane nodoRaiz = new AnchorPane();
    private static Caracter objeto;
    private static Caracter sigObjeto = Controller.crear_A();
    
    @Override
    public void start(Stage stage) throws Exception {
        
        GridPane tabla = new GridPane();
        tabla.setPrefHeight(200);
        tabla.setPrefWidth(200);
        //nodoRaiz.getChildren().add(tabla);
        
        Caracter a = sigObjeto;
        nodoRaiz.getChildren().addAll(tabla,a.fondo,a.cuadraticas);
        
        //Mostrar Escena
        Scene scene = new Scene(nodoRaiz,XSIZE,YSIZE);
        stage.setScene(scene);
        stage.setTitle("Tipografía Script Fluida");
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        launch(args);
    }
    
}
