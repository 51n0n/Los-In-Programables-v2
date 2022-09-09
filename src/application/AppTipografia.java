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
    private static CrearCaracteres llamar = new CrearCaracteres();
    private static GridPane tabla = new GridPane();
    private static Button botonInicio = new Button("Iniciar");
    private static Button botonFinalizar = new Button("Finalizar");
    private static TextField ingresarTexto = new TextField();
    private static Text aviso = new Text("Para finalizar el programa, presione aquí:");
    
    @Override
    public void start (Stage ventana) throws Exception{
        
        nodoRaiz.setPrefSize(1300,650);
        
        botonInicio.setGraphic(new Button("Iniciar"));
        botonInicio.setPrefSize(70, 20);
        botonInicio.setPrefWidth(70);
        botonInicio.setPrefHeight(20);
        botonInicio.setLayoutX(681);
        botonInicio.setLayoutY(596);
        
        tabla.setPrefSize(300,300);
        tabla.addRow(0, llamar.crear_A());
        tabla.addRow(0, llamar.crear_B());
        tabla.setLayoutX(200);
        tabla.setLayoutY(200);
        
        botonFinalizar.setGraphic(new Button("Finalizar"));
        botonFinalizar.setPrefSize(70, 20);
        botonFinalizar.setLayoutX(1081);
        botonFinalizar.setLayoutY(596);
        
        //ingresarTexto.setStyle("-fx-font: 12 arials;");
        //ingresarTexto.setStyle("-fx-background-color: black");
        ingresarTexto.setVisible(true);
        ingresarTexto.setEditable(true);
        ingresarTexto.setPromptText("Escriba aquí");
        ingresarTexto.setPrefSize(514,126);
        ingresarTexto.setLayoutX(150);
        ingresarTexto.setLayoutY(596);
        
        aviso.setStyle("-fx-font: 16 arials;");
        aviso.setLayoutX(771);
        aviso.setLayoutY(600);
        
        //llamar.leerEntrada();
        
        nodoRaiz.getChildren().addAll(tabla, botonInicio, botonFinalizar, ingresarTexto, aviso);
        
        tabla.setGridLinesVisible(true);
        
        //Mostrar Escena
        Scene escena = new Scene(nodoRaiz);
        ventana.setScene(escena);
        ventana.show();
    }
    public static void main (String[] args){
        //llamar.leer();
        launch(args);
    }
}
