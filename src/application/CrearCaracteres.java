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
        cuadraticas.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadraticas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        lineas.setLayoutX(29.0);
        lineas.setLayoutY(27.0);
        lineas.setStartX(-12.5);
        lineas.setStartY(0);
        lineas.setEndX(0);
        lineas.setEndY(0);
        lineas.setFill(Color.TRANSPARENT);
        lineas.setStroke(Color.BLACK);
        lineas.setStrokeLineCap(StrokeLineCap.ROUND);
        lineas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        cubicas.setLayoutX(33.0);
        cubicas.setLayoutY(29.0);
        cubicas.setStartX(-33.0);
        cubicas.setStartY(10.25);
        cubicas.setEndX(1.75);
        cubicas.setEndY(-20.0);
        cubicas.setControlX1(-28.0);
        cubicas.setControlY1(35.0);
        cubicas.setControlX2(-15.25);
        cubicas.setControlY2(-14.75);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_A.getFondo().getChildren().addAll(cuadraticas, lineas,cubicas);
        return (caracter_A.getFondo());
    }
    public AnchorPane crear_B() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubicas1 = new CubicCurve();
        CubicCurve cubicas2 = new CubicCurve();
        CubicCurve cubicas3 = new CubicCurve();
        //Constructor Caracter
        Caracter caracter_B = new Caracter('B',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_B.getFondo().setLayoutX(200.0); //layouts mientras no esten dentro de un gridpane
        caracter_B.getFondo().setLayoutY(270.0);
        caracter_B.getFondo().setPrefHeight(60.0); //y
        caracter_B.getFondo().setPrefWidth(45.0);  //x      
        
        //Atributos primera linea pirmera curba de la b
        cubicas1.setLayoutX(29.0);
        cubicas1.setLayoutY(19.0);
        cubicas1.setStartX(-24.3);
        cubicas1.setStartY(-5.8);
        cubicas1.setEndX(-2.8);
        cubicas1.setEndY(9.86);
        cubicas1.setControlX1(-22.59);
        cubicas1.setControlY1(-25);
        cubicas1.setControlX2(34.59);
        cubicas1.setControlY2(-5.8);
        cubicas1.setFill(Color.TRANSPARENT);
        cubicas1.setStroke(Color.BLACK);
        cubicas1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //segunda parte
        cubicas2.setLayoutX(35);
        cubicas2.setLayoutY(38);
        cubicas2.setStartX(-17.19);
        cubicas2.setStartY(11);
        cubicas2.setEndX(-8);
        cubicas2.setEndY(-9);
        cubicas2.setControlX1(-4);
        cubicas2.setControlY1(25.19);
        cubicas2.setControlX2(23.59);
        cubicas2.setControlY2(-1.6);
        cubicas2.setFill(Color.TRANSPARENT);
        cubicas2.setStroke(Color.BLACK);
        cubicas2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //tercera parte
        cubicas3.setLayoutX(22);
        cubicas3.setLayoutY(34);
        cubicas3.setStartX(-16.19);
        cubicas3.setStartY(17.8);
        cubicas3.setEndX(5.59);
        cubicas3.setEndY(-29.59);
        cubicas3.setControlX1(4);
        cubicas3.setControlY1(22.6);
        cubicas3.setControlX2(-8.4);
        cubicas3.setControlY2(-29.59);
        cubicas3.setFill(Color.TRANSPARENT);
        cubicas3.setStroke(Color.BLACK);
        cubicas3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cuarta
        cubicas.setLayoutX(5);
        cubicas.setLayoutY(45);
        cubicas.setStartX(-0.30);
        cubicas.setStartY(-32.59);
        cubicas.setEndX(10.8);
        cubicas.setEndY(-32.5900202);
        cubicas.setControlX1(-1.34);
        cubicas.setControlY1(-15.39);
        cubicas.setControlX2(16.4);
        cubicas.setControlY2(-21.4);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_B.getFondo().getChildren().addAll(cubicas,cubicas1,cubicas2,cubicas3);
        return (caracter_B.getFondo());
    }
     public AnchorPane crear_J() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubicas2 = new CubicCurve();
        CubicCurve cubicas3 = new CubicCurve();
        //Constructor Caracter
        Caracter caracter_J = new Caracter('J',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_J.getFondo().setLayoutX(250.0); //layouts mientras no esten dentro de un gridpane
        caracter_J.getFondo().setLayoutY(270.0);
        caracter_J.getFondo().setPrefHeight(60.0); //y
        caracter_J.getFondo().setPrefWidth(45.0);  //x 
        cubicas.setLayoutX(32);
        cubicas.setLayoutY(5);
        cubicas.setStartX(-9.25);
        cubicas.setStartY(11.5);
        cubicas.setEndX(7.25);
        cubicas.setEndY(1.35);
        cubicas.setControlX1(-8.85);
        cubicas.setControlY1(22.9);
        cubicas.setControlX2(-34.5);
        cubicas.setControlY2(4.5);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        //SEGUNDA PARTE
        cubicas2.setLayoutX(41);
        cubicas2.setLayoutY(15);
        cubicas2.setStartX(-36);
        cubicas2.setStartY(33.25);
        cubicas2.setEndX(-0.75);
        cubicas2.setEndY(-8.75);
        cubicas2.setControlX1(-16.75);
        cubicas2.setControlY1(45);
        cubicas2.setControlX2(-27.7);
        cubicas2.setControlY2(6.2);
        cubicas2.setFill(Color.TRANSPARENT);
        cubicas2.setStroke(Color.BLACK);
        cubicas2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //tercera parte
        cubicas3.setLayoutX(40);
        cubicas3.setLayoutY(15);
        cubicas3.setStartX(-35.5);
        cubicas3.setStartY(33);
        cubicas3.setEndX(2.5);
        cubicas3.setEndY(13.5);
        cubicas3.setControlX1(-41.75);
        cubicas3.setControlY1(17.25);
        cubicas3.setControlX2(-9.75);
        cubicas3.setControlY2(33);
        cubicas3.setFill(Color.TRANSPARENT);
        cubicas3.setStroke(Color.BLACK);
        cubicas3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_J.getFondo().getChildren().addAll(cubicas,cubicas2,cubicas3);
        return (caracter_J.getFondo());
    }
     
 public AnchorPane crear_C() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubicas1 = new CubicCurve();
        CubicCurve cubicas2 = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA 
        cubicas.setLayoutX(25);
        cubicas.setLayoutY(76);
        cubicas.setStartX(8.19);
        cubicas.setStartY(-64.19);
        cubicas.setEndX(5.99);
        cubicas.setEndY(-31.1);
        cubicas.setControlX1(-9.49);
        cubicas.setControlY1(-73.19);
        cubicas.setControlX2(-26.39);
        cubicas.setControlY2(-10.19);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //segunda
        cubicas1.setLayoutX(34);
        cubicas1.setLayoutY(44);
        cubicas1.setStartX(-3.2);
        cubicas1.setStartY(1);
        cubicas1.setEndX(-8.39);
        cubicas1.setEndY(-9.2);
        cubicas1.setControlX1(8.19);
        cubicas1.setControlY1(-9.2);
        cubicas1.setControlX2(-5.29);
        cubicas1.setControlY2(-14.0);
        cubicas1.setFill(Color.TRANSPARENT);
        cubicas1.setStroke(Color.BLACK);
        cubicas1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //tercera
        cubicas2.setLayoutX(38);
        cubicas2.setLayoutY(18);
        cubicas2.setStartX(-10.59);
        cubicas2.setStartY(-1.2);
        cubicas2.setEndX(-5.2);
        cubicas2.setEndY(-6.39);
        cubicas2.setControlX1(-10.59);
        cubicas2.setControlY1(6.59);
        cubicas2.setControlX2(3.4);
        cubicas2.setControlY2(-1.2);
        cubicas2.setFill(Color.TRANSPARENT);
        cubicas2.setStroke(Color.BLACK);
        cubicas2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_C.getFondo().getChildren().addAll(cubicas,cubicas1,cubicas2);
        return (caracter_C.getFondo());
    }
}
