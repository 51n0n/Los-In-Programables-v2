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
    
    public static AnchorPane crear_A() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line linea = new Line();
        QuadCurve cuadratica = new QuadCurve();
        CubicCurve cubica = new CubicCurve();
        
        //Atributos del Fondo
        fondo.setPrefHeight(60.0); //y
        fondo.setPrefWidth(45.0);  //x      
        
        //Atributos primera linea
        cuadratica.setLayoutX(18.0);
        cuadratica.setLayoutY(60.0);
        cuadratica.setStartX(27.0);
        cuadratica.setStartY(-30.0);
        cuadratica.setEndX(16.75);
        cuadratica.setEndY(-54.0);
        cuadratica.setControlX(2.5);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(Color.BLACK);
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        linea.setLayoutX(29.0);
        linea.setLayoutY(27.0);
        linea.setStartX(-12.5);
        linea.setStartY(0);
        linea.setEndX(0);
        linea.setEndY(0);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(Color.BLACK);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        cubica.setLayoutX(33.0);
        cubica.setLayoutY(29.0);
        cubica.setStartX(-33.0);
        cubica.setStartY(10.25);
        cubica.setEndX(1.75);
        cubica.setEndY(-20.0);
        cubica.setControlX1(-28.0);
        cubica.setControlY1(35.0);
        cubica.setControlX2(-15.25);
        cubica.setControlY2(-14.75);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(Color.BLACK);
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cuadratica,linea,cubica);
        
        return fondo;
    }
    
    public static AnchorPane crear_B() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        
        //Atributos del Fondo
        fondo.setLayoutX(200.0); //layouts mientras no esten dentro de un gridpane
        fondo.setLayoutY(270.0);
        fondo.setPrefHeight(60.0); //y
        fondo.setPrefWidth(45.0);  //x      
        
        //Atributos primera linea pirmera curba de la b
        cubica1.setLayoutX(27.0);
        cubica1.setLayoutY(19.0);
        cubica1.setStartX(-24.3);
        cubica1.setStartY(-5.8);
        cubica1.setEndX(-2.8);
        cubica1.setEndY(9.86);
        cubica1.setControlX1(-22.59);
        cubica1.setControlY1(-25);
        cubica1.setControlX2(34.59);
        cubica1.setControlY2(-5.8);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //segunda parte
        cubica2.setLayoutX(33);
        cubica2.setLayoutY(38);
        cubica2.setStartX(-17.19);
        cubica2.setStartY(11);
        cubica2.setEndX(-8);
        cubica2.setEndY(-9);
        cubica2.setControlX1(-4);
        cubica2.setControlY1(25.19);
        cubica2.setControlX2(23.59);
        cubica2.setControlY2(-1.6);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //tercera parte
        cubica3.setLayoutX(33);
        cubica3.setLayoutY(38);
        cubica3.setStartX(-17.19);
        cubica3.setStartY(11);
        cubica3.setEndX(-8);
        cubica3.setEndY(-9);
        cubica3.setControlX1(-4);
        cubica3.setControlY1(25.19);
        cubica3.setControlX2(23.59);
        cubica3.setControlY2(-1.6);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(Color.BLACK);
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica1,cubica2,cubica3);
        
        return fondo;
    }
    
}
