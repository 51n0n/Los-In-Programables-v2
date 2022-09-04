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
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class AppTipografia extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start (Stage primaryStage) throws Exception{
        
        //Titulo de la ventana
        primaryStage.setTitle("Tipografia Script Fluida");
        
        //Creacion de la ventana y contenedores principales
        Group root = new Group();
        
        //Creacion de zona de dibujo
        Canvas canvas = new Canvas(300, 250);
        
        //Obtención del canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        drawLetter(gc);
        
        //Se añade el canvas al contenedor principal
        root.getChildren().add(canvas);
        
        //Crea escena
        primaryStage.setScene(new Scene(root));
        
        //Muestra la escena
        primaryStage.show();
    }
    
    private void drawLetter(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(3);
        gc.strokeLine(40, 10, 10, 40);
    }
}
