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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AppTipografia extends Application {
    
    private static BorderPane nodoRaiz = new BorderPane();
    private static CrearCaracteres aux = new CrearCaracteres();
    
    @Override
    public void start (Stage ventana) throws Exception{
        
        nodoRaiz.setPrefHeight(650.0);
        nodoRaiz.setPrefWidth(1300.0);
        
        GridPane tabla = new GridPane();
        tabla.setPrefHeight(500);
        tabla.setPrefWidth(300);
        
        Button botonInicio = new Button();
        botonInicio.setGraphic(new Button("Iniciar"));
        botonInicio.setPrefSize(70, 20);
        botonInicio.setPrefWidth(70);
        botonInicio.setPrefHeight(20);
        botonInicio.setLayoutX(681);
        botonInicio.setLayoutY(596);
        nodoRaiz.getChildren().add(aux.crear_A());
        nodoRaiz.getChildren().add(aux.crear_B());
        nodoRaiz.getChildren().add(aux.crear_C());
        nodoRaiz.getChildren().add(aux.crear_D());
        nodoRaiz.getChildren().add(aux.crear_E());
        nodoRaiz.getChildren().add(aux.crear_F());
        nodoRaiz.getChildren().add(aux.crear_G());
        nodoRaiz.getChildren().add(aux.crear_H());
        nodoRaiz.getChildren().add(aux.crear_I());
        nodoRaiz.getChildren().add(aux.crear_J());
        nodoRaiz.getChildren().add(aux.crear_K());
        nodoRaiz.getChildren().add(aux.crear_L());

        
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
        
        //Mostrar Escena
        Scene escena = new Scene(nodoRaiz);
        ventana.setScene(escena);
        ventana.show();
    }
}
