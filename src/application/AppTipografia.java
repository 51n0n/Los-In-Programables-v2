/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppTipografia extends Application {
    
    private static BorderPane nodoRaiz = new BorderPane();
    private static CrearCaracteres aux = new CrearCaracteres();
    
    @Override
    public void start (Stage primaryStage) throws Exception{
        
        nodoRaiz.setPrefHeight(650.0);
        nodoRaiz.setPrefWidth(1300.0);
        
        GridPane tabla = new GridPane();
        tabla.setPrefHeight(500);
        tabla.setPrefWidth(300);
        nodoRaiz.getChildren().add(tabla);
        
        nodoRaiz.getChildren().add(aux.crear_A());
        
        
        //Mostrar Escena
        Scene escena = new Scene(nodoRaiz);
        ventana.setScene(escena);
        ventana.show();
    }
    
    private void drawLetter(GraphicsContext gc){
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(3);
        gc.strokeLine(40, 10, 10, 40); //Linea recta
        gc.strokeArc(43, 30, 45, 45, 45, 180, ArcType.OPEN); //Curvas sin relleno (x, y, ancho, largo, inicio del angulo, angulo)
    }
}
