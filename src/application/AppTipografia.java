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
import javafx.scene.layout.AnchorPane;
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
        
        //Creacion de zona de dibujo}
        Canvas canvas = new Canvas(200, 150);
        
        //Obtención del contexto gráfico del canvas anterior que permitira realizar posteriormente los dibujos
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        //Se añade el canvas al contenedor principal (root)
        root.getChildren().add(canvas);
        //Creacion del área (scene), de 600x400 puntos, color gris claro
        
        Scene scene = new Scene(root, 600, 400, Color.LIGHTGRAY);
        
        //Se asocia la ventana (scene) al parametro primaryStage
        primaryStage.setScene(scene);
        
        //Titulo que aparece en la ventana
        primaryStage.setTitle("Tipografia Script Fluida");
        
        //Orden para mostrar la ventana
        primaryStage.show();
        
        //DIBUJO DE LAS FORMAS
        
        //Dibujar linea desde la posicion (x,y) a (x1, y1)
        gc.strokeLine(40, 10, 10, 40);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
