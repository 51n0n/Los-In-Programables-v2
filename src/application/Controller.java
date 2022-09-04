/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;

public class Controller {
    
    public static GridPane tabla = AppTipografia.tabla;    
    
    
    
    
    public AnchorPane crear_A(Caracter caracter) {
        
        Line[] lineas = new Line[0];
        //QuadCurve[] cuadraticas = new QuadCurve[0];
        CubicCurve[] cubicas = new CubicCurve[0];
        
        caracter.getFondo().setLayoutX(14.0);
        caracter.getFondo().setLayoutY(27.0);
        caracter.getFondo().setPrefHeight(60.0);
        caracter.getFondo().setPrefWidth(45.0);
        
        if (caracter.nombre == 'A'){
            
            caracter.cuadraticas[0].setStartX(27.0);
            caracter.cuadraticas[0].setStartY(-30.0);
            caracter.cuadraticas[0].setEndX(16.75);
            caracter.cuadraticas[0].setEndY(-54.0);
            caracter.cuadraticas[0].setControlX(2.5);
            caracter.cuadraticas[0].setStroke(Color.BLACK);
            caracter.cuadraticas[0].setStrokeLineCap(StrokeLineCap.ROUND);
            caracter.cuadraticas[0].setStrokeLineJoin(StrokeLineJoin.ROUND);
            
        }
        
        
        //caracter_A.getFondo().getChildren().add(cuadraticas[0]);
        
        return (caracter.getFondo());
    }
}
