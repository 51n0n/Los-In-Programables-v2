/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package application;

import javafx.application.Application;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
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
    private static Button botonLimpiar = new Button ("Limpiar");
    private static TextField ingresarTexto = new TextField();
    private static Text aviso = new Text("Para finalizar el programa, presione aquí:");
    private static Text aviso2 = new Text("Seleccione un color:");
    private static ChoiceBox color = new ChoiceBox();
    
    @Override
    public void start (Stage ventana) throws Exception{
        
        ventana.setTitle("Tipografia Script a Tipografia Fluida");
        
        //String para usar en el ChoiceBox
        String colores[] = {"Negro", "Azul", "Marron", "Gris", "Verde", "Naranja", "Rosa", "Morado", "Rojo", "Amarillo"};
        
        nodoRaiz.setPrefSize(1300,650);
        
        //Averiguar como hacer que se vea una eleccion por defecto
        color.setStyle("-fx-font: 16 arials;");
        color.setLayoutX(1136);
        color.setLayoutY(14);
        color.setItems(observableArrayList(colores));
        
        botonInicio.setGraphic(new Button("Iniciar"));
        botonInicio.setLayoutX(745);
        botonInicio.setLayoutY(600);
        
        tabla.setPrefSize(300,300);
        tabla.addRow(0, llamar.crear_A());
        tabla.addRow(0, llamar.crear_B());
        tabla.addRow(0, llamar.crear_Punto());
        tabla.setLayoutX(200);
        tabla.setLayoutY(200);
        
        botonFinalizar.setGraphic(new Button("Finalizar"));
        botonFinalizar.setLayoutX(1200);
        botonFinalizar.setLayoutY(600);
        
        botonLimpiar.setGraphic(new Button("Limpiar"));
        botonLimpiar.setLayoutX(810);
        botonLimpiar.setLayoutY(600);
        
        //Sigo averiguando como hacer que se muestre el TextField
        ingresarTexto.setPrefSize(514,126);
        ingresarTexto.setLayoutX(150);
        ingresarTexto.setLayoutY(600);
        
        aviso.setStyle("-fx-font: 16 arials;");
        aviso.setLayoutX(900);
        aviso.setLayoutY(600);
        
        aviso2.setStyle("-fx-font: 16 arials;");
        aviso2.setLayoutX(970);
        aviso2.setLayoutY(30);
        
        //llamar.leerEntrada();
        
        nodoRaiz.getChildren().addAll(tabla, botonInicio, botonFinalizar, ingresarTexto, aviso, botonLimpiar, color, aviso2);
        
        tabla.setGridLinesVisible(true);
        
        //Mostrar Escena
        Scene escena = new Scene(nodoRaiz);
        ventana.setScene(escena);
        ventana.show();
    }
}
