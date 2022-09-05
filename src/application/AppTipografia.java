/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppTipografia extends Application {
    
    private static BorderPane nodoRaiz = new BorderPane();
    private static CrearCaracteres aux = new CrearCaracteres();
    private static AnchorPane aux2 = new AnchorPane();
    
    @Override
    public void start(Stage ventana) throws Exception {
        
        nodoRaiz.setPrefSize(1300,650);
        
        GridPane tabla = new GridPane();
        tabla.setPrefSize(500,500);
        nodoRaiz.getChildren().add(tabla);
        aux2 = aux.crear_A();
        
        //nodoRaiz.getChildren().add(aux2); //funciona sin esto
        
        tabla.addRow(0, aux2);
        tabla.setLayoutX(200);
        tabla.setLayoutY(200);
        
        AnchorPane a1 = new AnchorPane();
        AnchorPane a2 = new AnchorPane();
        AnchorPane a3 = new AnchorPane();
        a1.setPrefSize(45, 60);
        a2.setPrefSize(45, 60);
        a3.setPrefSize(45, 60);
        //tabla.add(a1, 0, 1);
        //tabla.add(a2, 1, 0);
        //tabla.add(a3, 1, 1);
        tabla.addRow(0, a1);
        tabla.addRow(0, a2);
        tabla.addRow(0, a3);
        
        tabla.setGridLinesVisible(true);
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
