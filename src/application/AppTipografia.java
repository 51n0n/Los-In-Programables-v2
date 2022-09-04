/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AppTipografia extends Application {
    
    /**
     *
     * @param primaryStage
     */
    @Override
    public void start (Stage primaryStage){
        
        //Creacion de la ventana y contenedores principales
        Group root = new Group();
        
        //Creacion de zona de dibujo
        Canvas canvas = new Canvas(200, 150);
        
        //Obtención del canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        //Se añade el canvas al contenedor principal
        root.getChildren().add(canvas);
        
        //Crea escena de 600x400, gris claro
        Scene scene = new Scene(root, 600, 400, Color.LIGHTGRAY);
        primaryStage.setScene(scene);
        
        //Titulo de la ventana
        primaryStage.setTitle("Tipografia Script Fluida");
        
        primaryStage.show();
        
        //DIBUJO
        //Dibuja linea desde la posicion (x,y) a (x1, y1)
        gc.strokeLine(40, 10, 10, 40);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
