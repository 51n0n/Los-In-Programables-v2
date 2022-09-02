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
        
        AnchorPane fondo = new AnchorPane();
        Line[] lineas = new Line[0];
        QuadCurve[] cuadraticas = new QuadCurve[0];
        CubicCurve[] cubicas = new CubicCurve[0];
        
        Caracter caracter_A = new Caracter('A',fondo,lineas,cuadraticas,cubicas);
        
        caracter_A.getFondo().setLayoutX(14.0); //layouts mientras no esten dentro de un gridpane
        caracter_A.getFondo().setLayoutY(27.0);
        caracter_A.getFondo().setPrefHeight(60.0);
        caracter_A.getFondo().setPrefWidth(45.0);        
        
        cuadraticas[0].setStartX(27.0);
        cuadraticas[0].setStartY(-30.0);
        cuadraticas[0].setEndX(16.75);
        cuadraticas[0].setEndY(-54.0);
        cuadraticas[0].setControlX(2.5);
        cuadraticas[0].setStroke(Color.BLACK);
        cuadraticas[0].setStrokeLineCap(StrokeLineCap.ROUND);
        cuadraticas[0].setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        caracter_A.getFondo().getChildren().add(cuadraticas[0]);      
        
        return (caracter_A.getFondo());
    }
    
}
