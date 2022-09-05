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

public class Controller {
    
    public static Caracter crear_A() {
        
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        fondo.setLayoutX(14.0);
        fondo.setLayoutY(27.0);
        fondo.setPrefHeight(60.0);
        fondo.setPrefWidth(45.0);
        
        cuadraticas.setStartX(27.0);
        cuadraticas.setStartY(-30.0);
        cuadraticas.setEndX(16.75);
        cuadraticas.setEndY(-54.0);
        cuadraticas.setControlX(2.5);
        cuadraticas.setStroke(Color.BLACK);
        cuadraticas.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadraticas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        return new Caracter('A',fondo,lineas,cuadraticas,cubicas);
    }
}
