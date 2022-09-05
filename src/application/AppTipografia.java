/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AppTipografia extends Application {
    
    private static BorderPane nodoRaiz = new BorderPane();
    private static CrearCaracteres aux = new CrearCaracteres();
    private static AnchorPane aux2 = new AnchorPane();
    
    @Override
    public void start (Stage ventana) throws Exception{
        
        nodoRaiz.setPrefSize(1300,650);
        
        GridPane tabla = new GridPane();
        tabla.setPrefSize(500,500);
        aux2 = aux.crear_A();
        
        Button botonInicio = new Button();
        botonInicio.setGraphic(new Button("Iniciar"));
        botonInicio.setPrefSize(70, 20);
        botonInicio.setPrefWidth(70);
        botonInicio.setPrefHeight(20);
        botonInicio.setLayoutX(681);
        botonInicio.setLayoutY(596);
        nodoRaiz.getChildren().add(aux.crear_A());
        nodoRaiz.getChildren().add(aux.crear_B());
        
        tabla.addRow(0, aux2);
        tabla.setLayoutX(200);
        tabla.setLayoutY(200);
        Button botonFinalizar = new Button();
        botonFinalizar.setGraphic(new Button("Finalizar"));
        botonFinalizar.setPrefSize(70, 20);
        botonFinalizar.setLayoutX(1081);
        botonFinalizar.setLayoutY(596);
        
        TextField ingresarTexto = new TextField();
        ingresarTexto.setPrefWidth(614);
        ingresarTexto.setPrefHeight(26);
        ingresarTexto.setLayoutX(50);
        ingresarTexto.setLayoutY(596);
        
        Text aviso = new Text("Para finalizar el programa, presione aqui:");
        aviso.setStyle("-fx-font-20arial");
        aviso.setLayoutX(771);
        aviso.setLayoutY(600);
        
        nodoRaiz.getChildren().addAll(tabla, botonInicio, botonFinalizar, ingresarTexto, aviso);
        
        nodoRaiz.getChildren().add(aux.crear_A());
        
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
}
