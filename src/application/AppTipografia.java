/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AppTipografia extends Application {
    
    private static BorderPane nodoRaiz = new BorderPane();
    private static CrearCaracteres llamar = new CrearCaracteres();
    private static GridPane tabla = new GridPane();
    private static Button botonInicio = new Button("Iniciar");
    private static Button botonFinalizar = new Button("Finalizar");
    private static Button botonLimpiar = new Button ("Limpiar");
    private static TextField ingresarTexto = new TextField();
    private static Text aviso = new Text("Para finalizar el programa, presione aquí:");
    private static ChoiceBox color = new ChoiceBox();
    
    @Override
    public void start (Stage ventana) throws Exception{
        
        nodoRaiz.setPrefSize(1300,650);
        
        //Sigo averiaguando como hacer visible el ChoiceBox
        color.setStyle("-fx-font: 16 arials;");
        color.setLayoutX(1136);
        color.setLayoutY(14);
        color.getItems().add("Negro");
        color.getItems().add("Azul");
        color.getItems().add("Marron");
        color.getItems().add("Gris");
        color.getItems().add("Verde");
        color.getItems().add("Naranja");
        color.getItems().add("Rosa");
        color.getItems().add("Morado");
        color.getItems().add("Rojo");
        color.getItems().add("Amarillo");
        
        botonInicio.setGraphic(new Button("Iniciar"));
        botonInicio.setLayoutX(745);
        botonInicio.setLayoutY(600);
        
        tabla.setPrefSize(300,300);
        tabla.addRow(0, llamar.crear_A());
        tabla.addRow(0, llamar.crear_B());
        tabla.setLayoutX(200);
        tabla.setLayoutY(200);
        
        botonFinalizar.setGraphic(new Button("Finalizar"));
        botonFinalizar.setLayoutX(1200);
        botonFinalizar.setLayoutY(600);
        
        botonLimpiar.setGraphic(new Button("Limpiar"));
        botonLimpiar.setLayoutX(810);
        botonLimpiar.setLayoutY(600);
        
        //Sigo averiguando como hacer que se muestre el TextField
        ingresarTexto.setVisible(true);
        ingresarTexto.setEditable(true);
        ingresarTexto.setPromptText("Escriba aquí");
        ingresarTexto.setPrefSize(514,126);
        ingresarTexto.setLayoutX(150);
        ingresarTexto.setLayoutY(596);
        
        aviso.setStyle("-fx-font: 16 arials;");
        aviso.setLayoutX(900);
        aviso.setLayoutY(600);
        
        //llamar.leerEntrada();
        
        nodoRaiz.getChildren().addAll(tabla, botonInicio, botonFinalizar, ingresarTexto, aviso, botonLimpiar);
        
        tabla.setGridLinesVisible(true);
        
        //Mostrar Escena
        Scene escena = new Scene(nodoRaiz);
        ventana.setScene(escena);
        ventana.show();
    }
}
