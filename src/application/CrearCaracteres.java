/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;

public class CrearCaracteres {
    
    public AnchorPane crear_A() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_A = new Caracter('A',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_A.getFondo().setLayoutX(140.0); //layouts mientras no esten dentro de un gridpane
        caracter_A.getFondo().setLayoutY(270.0);
        caracter_A.getFondo().setPrefHeight(60.0); //y
        caracter_A.getFondo().setPrefWidth(45.0);  //x      
        
        //Atributos primera linea
        cuadraticas.setLayoutX(18.0);
        cuadraticas.setLayoutY(60.0);
        cuadraticas.setStartX(27.0);
        cuadraticas.setStartY(-30.0);
        cuadraticas.setEndX(16.75);
        cuadraticas.setEndY(-54.0);
        cuadraticas.setControlX(2.5);
        cuadraticas.setFill(Color.TRANSPARENT);
        cuadraticas.setStroke(Color.BLACK);
        //cuadraticas.setStrokeLineCap(StrokeLineCap.ROUND);
        //cuadraticas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        caracter_A.getFondo().getChildren().add(cuadraticas);
        
        return (caracter_A.getFondo());
    }
    
}
