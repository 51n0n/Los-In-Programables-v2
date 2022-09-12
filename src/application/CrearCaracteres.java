/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
        CubicCurve cubica1= new CubicCurve();
        
        //Atributos del Fondo
        fondo.setPrefHeight(60.0); //y
        fondo.setPrefWidth(45.0);  //x      
        
        //Atributos SEGUNDA LINEA
        cubica1.setLayoutX(41);
        cubica1.setLayoutY(44);
        cubica1.setStartX(-1.2);
        cubica1.setStartY(4.79);
        cubica1.setEndX(-4.88);
        cubica1.setEndY(-35.8);
        cubica1.setControlX1(-11.6);
        cubica1.setControlY1(11.39);
        cubica1.setControlX2(-14.39);
        cubica1.setControlY2(-14.2);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
       
        // RECTA MEDIA
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
        
        // PRIMERA LINEA
        cubicas.setLayoutX(33);
        cubicas.setLayoutY(29);
        cubicas.setStartX(-33);
        cubicas.setStartY(16.39);
        cubicas.setEndX(3.79);
        cubicas.setEndY(-21.95);
        cubicas.setControlX1(-27.60);
        cubicas.setControlY1(38);
        cubicas.setControlX2(-17.39);
        cubicas.setControlY2(-17);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubica1,lineas,cubicas);
        return (fondo);
    }
    
    public AnchorPane crear_B() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        CubicCurve cubicas = new CubicCurve();
        //Atributos del Fondo
        fondo.setLayoutX(145.0); //layouts mientras no esten dentro de un gridpane
        fondo.setLayoutY(270.0);
        fondo.setPrefHeight(60.0); //y
        fondo.setPrefWidth(45.0);  //x      
        
        //Atributos principal linea
        cubica1.setLayoutX(25.0);
        cubica1.setLayoutY(33.0);
        cubica1.setStartX(-16.6);
        cubica1.setStartY(17.0);
        cubica1.setEndX(11.19);
        cubica1.setEndY(-24.8);
        cubica1.setControlX1(0.19);
        cubica1.setControlY1(23.4);
        cubica1.setControlX2(-6.8);
        cubica1.setControlY2(-33.0);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //segunda parte superior derecha
        cubica2.setLayoutX(30);
        cubica2.setLayoutY(21);
        cubica2.setStartX(-25.84);
        cubica2.setStartY(-3.8);
        cubica2.setEndX(-1.1);
        cubica2.setEndY(7.8);
        cubica2.setControlX1(-21.99);
        cubica2.setControlY1(-22.99);
        cubica2.setControlX2(27.19);
        cubica2.setControlY2(-7.6);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //tercera parte inferior//
        cubica3.setLayoutX(37);
        cubica3.setLayoutY(38);
        cubica3.setStartX(-17.4);
        cubica3.setStartY(8.79);
        cubica3.setEndX(-8);
        cubica3.setEndY(-9);
        cubica3.setControlX1(-4);
        cubica3.setControlY1(22.59);
        cubica3.setControlX2(16.4);
        cubica3.setControlY2(-1.8);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(Color.BLACK);
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cuarta terminacion inferior izquierda//
        cubicas.setLayoutX(4);
        cubicas.setLayoutY(47.5);
        cubicas.setStartX(0.59);
        cubicas.setStartY(-31.3);
        cubicas.setEndX(11.79);
        cubicas.setEndY(-35.5);
        cubicas.setControlX1(-5);
        cubicas.setControlY1(-15.59);
        cubicas.setControlX2(23);
        cubicas.setControlY2(-24.5);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubicas,cubica1,cubica2,cubica3);
        
        return fondo;
    }    
    public AnchorPane crear_C() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubicas1 = new CubicCurve();
        CubicCurve cubicas2 = new CubicCurve();
        
        //Atributos del Fondo
        fondo.setLayoutX(190.0); //layouts mientras no esten dentro de un gridpane
        fondo.setLayoutY(270.0);
        fondo.setPrefHeight(60.0); //y
        fondo.setPrefWidth(45.0);  //x  
        
        
        //PRIMERA costado izquierdo
        cubicas.setLayoutX(23);
        cubicas.setLayoutY(78);
        cubicas.setStartX(6);
        cubicas.setStartY(-69.59);
        cubicas.setEndX(6.33);
        cubicas.setEndY(-30.79);
        cubicas.setControlX1(-13.39);
        cubicas.setControlY1(-73.19);
        cubicas.setControlX2(-26.39);
        cubicas.setControlY2(-10.19);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //segunda inferior derecha
        cubicas1.setLayoutX(33);
        cubicas1.setLayoutY(46);
        cubicas1.setStartX(-3.2);
        cubicas1.setStartY(1);
        cubicas1.setEndX(-11.59);
        cubicas1.setEndY(-9.2);
        cubicas1.setControlX1(8.19);
        cubicas1.setControlY1(-9.2);
        cubicas1.setControlX2(-4.8);
        cubicas1.setControlY2(-17.8);
        cubicas1.setFill(Color.TRANSPARENT);
        cubicas1.setStroke(Color.BLACK);
        cubicas1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //tercera superior derecha 
        cubicas2.setLayoutX(35);
        cubicas2.setLayoutY(15);
        cubicas2.setStartX(-10.59);
        cubicas2.setStartY(-0.39);
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
        
        fondo.getChildren().addAll(cubicas,cubicas1,cubicas2);
        return fondo;
    }
    /*public AnchorPane crear_D(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        //Constructor Caracter
        Caracter caracter_D = new Caracter('D',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_D.getFondo().setLayoutX(235.0); //layouts mientras no esten dentro de un gridpane
        caracter_D.getFondo().setLayoutY(270.0);
        caracter_D.getFondo().setPrefHeight(60.0); //y
        caracter_D.getFondo().setPrefWidth(45.0);  //x  
        //PRIMERA linea central
        cubicas.setLayoutX(32);
        cubicas.setLayoutY(35);
        cubicas.setStartX(3.2);
        cubicas.setStartY(-25.8);
        cubicas.setEndX(-20.19);
        cubicas.setEndY(14.59);
        cubicas.setControlX1(-6.8);
        cubicas.setControlY1(-29.8);
        cubicas.setControlX2(-6.8);
        cubicas.setControlY2(14.59);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //guatita
        cubica1.setLayoutX(26);
        cubica1.setLayoutY(30);
        cubica1.setStartX(-1.51);
        cubica1.setStartY(-22.6);
        cubica1.setEndX(-12.19);
        cubica1.setEndY(19);
        cubica1.setControlX1(33.4);
        cubica1.setControlY1(-8);
        cubica1.setControlX2(10.19);
        cubica1.setControlY2(28.19);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        // colita inferior izquierda
        cubica2.setLayoutX(48);
        cubica2.setLayoutY(59);
        cubica2.setStartX(-34.6);
        cubica2.setStartY(-10);
        cubica2.setEndX(-34.6);
        cubica2.setEndY(-10);
        cubica2.setControlX1(-43.19);
        cubica2.setControlY1(-7.4);
        cubica2.setControlX2(-43.19);
        cubica2.setControlY2(-12.59);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //curva superior izquierda
        cubica3.setLayoutX(10);
        cubica3.setLayoutY(42);
        cubica3.setStartX(13.4);
        cubica3.setStartY(-34.76);
        cubica3.setEndX(7);
        cubica3.setEndY(-12.59);
        cubica3.setControlX1(-10);
        cubica3.setControlY1(-39.19);
        cubica3.setControlX2(-10);
        cubica3.setControlY2(-6.8);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(Color.BLACK);
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_D.getFondo().getChildren().addAll(cubicas,cubica1,cubica2,cubica3);
        return (caracter_D.getFondo());
    }
    public AnchorPane crear_E(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        //Constructor Caracter
        Caracter caracter_E = new Caracter('E',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_E.getFondo().setLayoutX(280.0); //layouts mientras no esten dentro de un gridpane
        caracter_E.getFondo().setLayoutY(270.0);
        caracter_E.getFondo().setPrefHeight(60.0); //y
        caracter_E.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA inferior izquierda base
        cubicas.setLayoutX(27.0);
        cubicas.setLayoutY(24.0);
        cubicas.setStartX(6.2);
        cubicas.setStartY(19.2);
        cubicas.setEndX(-11.4);
        cubicas.setEndY(2.23);
        cubicas.setControlX1(-14.79);
        cubicas.setControlY1(39.59);
        cubicas.setControlX2(-30.6);
        cubicas.setControlY2(11.59);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //centro union s
        cubica1.setLayoutX(16.0);
        cubica1.setLayoutY(23.0);
        cubica1.setStartX(-0.6);
        cubica1.setStartY(3.23);
        cubica1.setEndX(-0.6);
        cubica1.setEndY(-7.6);
        cubica1.setControlX1(3.79);
        cubica1.setControlY1(-1.0);
        cubica1.setControlX2(-7.79);
        cubica1.setControlY2(3.23);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //curba superior
        cubica2.setLayoutX(15.0);
        cubica2.setLayoutY(24.0);
        cubica2.setStartX(0);
        cubica2.setStartY(-8.2);
        cubica2.setEndX(9.39);
        cubica2.setEndY(-5.8);
        cubica2.setControlX1(12.0);
        cubica2.setControlY1(-23.99);
        cubica2.setControlX2(20.39);
        cubica2.setControlY2(-2);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //colita inferior derecha
        cubica3.setLayoutX(23.0);
        cubica3.setLayoutY(50.0);
        cubica3.setStartX(-0.6);
        cubica3.setStartY(-9.8);
        cubica3.setEndX(9.39);
        cubica3.setEndY(-5.8);
        cubica3.setControlX1(1.0);
        cubica3.setControlY1(-22.93);
        cubica3.setControlX2(17.39);
        cubica3.setControlY2(-13.8);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(Color.BLACK);
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_E.getFondo().getChildren().addAll(cubicas,cubica1,cubica2,cubica3);
        return (caracter_E.getFondo());
    }
    public AnchorPane crear_F(){
       
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        Line linea1 = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        //Constructor Caracter
        Caracter caracter_F = new Caracter('F',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_F.getFondo().setLayoutX(323.0); //layouts mientras no esten dentro de un gridpane
        caracter_F.getFondo().setLayoutY(270.0);
        caracter_F.getFondo().setPrefHeight(60.0); //y
        caracter_F.getFondo().setPrefWidth(45.0);  //x        
        
        //central
        cubicas.setLayoutX(26.0);
        cubicas.setLayoutY(14.0);
        cubicas.setStartX(-22);
        cubicas.setStartY(32.4);
        cubicas.setEndX(5.2);
        cubicas.setEndY(-3.67);
        cubicas.setControlX1(-1.79);
        cubicas.setControlY1(50.0);
        cubicas.setControlX2(-11.0);
        cubicas.setControlY2(-3.6);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //superior
        cubica1.setLayoutX(36.0);
        cubica1.setLayoutY(26.0);
        cubica1.setStartX(-26.2);
        cubica1.setStartY(-4.59);
        cubica1.setEndX(5.2);
        cubica1.setEndY(-14.6);
        cubica1.setControlX1(-36.0);
        cubica1.setControlY1(-4.59);
        cubica1.setControlX2(-39.79);
        cubica1.setControlY2(-24.39);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //colita superior
        cubica2.setLayoutX(-1.0);
        cubica2.setLayoutY(27.0);
        cubica2.setStartX(8.2);
        cubica2.setStartY(-11.39);
        cubica2.setEndX(11.0);
        cubica2.setEndY(-5.4);
        cubica2.setControlX1(17.0);
        cubica2.setControlY1(-19.32);
        cubica2.setControlX2(19.6);
        cubica2.setControlY2(-5.4);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //linea central
        lineas.setLayoutX(-23.0);
        lineas.setLayoutY(30.0);
        lineas.setStartX(42.8);
        lineas.setStartY(-2.4);
        lineas.setEndX(50.39);
        lineas.setEndY(-2.4);
        lineas.setFill(Color.TRANSPARENT);
        lineas.setStroke(Color.BLACK);
        lineas.setStrokeLineCap(StrokeLineCap.ROUND);
        lineas.setStrokeLineJoin(StrokeLineJoin.ROUND);       
        //linea terminal central
        linea1.setLayoutX(-16.0);
        linea1.setLayoutY(30.0);
        linea1.setStartX(44.0);
        linea1.setStartY(-2.4);
        linea1.setEndX(44);
        linea1.setEndY(1.79);
        linea1.setFill(Color.TRANSPARENT);
        linea1.setStroke(Color.BLACK);
        linea1.setStrokeLineCap(StrokeLineCap.ROUND);
        linea1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        caracter_F.getFondo().getChildren().addAll(cubicas,cubica1,cubica2,lineas,linea1);
        return (caracter_F.getFondo());
    }
    public AnchorPane crear_G(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        //Constructor Caracter
        Caracter caracter_G = new Caracter('G',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_G.getFondo().setLayoutX(365.0); //layouts mientras no esten dentro de un gridpane
        caracter_G.getFondo().setLayoutY(270.0);
        caracter_G.getFondo().setPrefHeight(60.0); //y
        caracter_G.getFondo().setPrefWidth(45.0);  //x     
        //Base incial
        cubicas.setLayoutX(33.0);
        cubicas.setLayoutY(15.0);
        cubicas.setStartX(-22.0);
        cubicas.setStartY(25.4);
        cubicas.setEndX(3.39);
        cubicas.setEndY(9.49);
        cubicas.setControlX1(-31.19);
        cubicas.setControlY1(37.4);
        cubicas.setControlX2(8.2);
        cubicas.setControlY2(49.79);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        // medio
        cubica1.setLayoutX(29.0);
        cubica1.setLayoutY(0);
        cubica1.setStartX(7.2);
        cubica1.setStartY(25.79);
        cubica1.setEndX(-13.0);
        cubica1.setEndY(15.6);
        cubica1.setControlX1(-1.2);
        cubica1.setControlY1(44.79);
        cubica1.setControlX2(-25.39);
        cubica1.setControlY2(33.79);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //superior
        cubica2.setLayoutX(38.0);
        cubica2.setLayoutY(12.0);
        cubica2.setStartX(-24.39);
        cubica2.setStartY(-1.99);
        cubica2.setEndX(-22.6);
        cubica2.setEndY(4.43);
        cubica2.setControlX1(20.2);
        cubica2.setControlY1(16.4);
        cubica2.setControlX2(-9.19);
        cubica2.setControlY2(-18.99);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_G.getFondo().getChildren().addAll(cubicas,cubica1,cubica2);
        return (caracter_G.getFondo());
    }
    public AnchorPane crear_H(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        //Constructor Caracter
        Caracter caracter_H = new Caracter('H',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_H.getFondo().setLayoutX(415.0); //layouts mientras no esten dentro de un gridpane
        caracter_H.getFondo().setLayoutY(270.0);
        caracter_H.getFondo().setPrefHeight(60.0); //y
        caracter_H.getFondo().setPrefWidth(45.0);  //x 
        
        //lado izquiero primera
        cubicas.setLayoutX(35.0);
        cubicas.setLayoutY(15.0);
        cubicas.setStartX(-33.0);
        cubicas.setStartY(32.79);
        cubicas.setEndX(-6.75);
        cubicas.setEndY(-5.99);
        cubicas.setControlX1(-15.39);
        cubicas.setControlY1(48.19);
        cubicas.setControlX2(-31.0);
        cubicas.setControlY2(-5.99);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        // superior izquierdo colita
        cubica1.setLayoutX(22.0);
        cubica1.setLayoutY(8.0);
        cubica1.setStartX(-11.8);
        cubica1.setStartY(9.19);
        cubica1.setEndX(5.21);
        cubica1.setEndY(1.01);
        cubica1.setControlX1(-8.85);
        cubica1.setControlY1(22.9);
        cubica1.setControlX2(-37.39);
        cubica1.setControlY2(3.8);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //derecha segunda
        cubica2.setLayoutX(45.0);
        cubica2.setLayoutY(16.0);
        cubica2.setStartX(-5.6);
        cubica2.setStartY(24.4);
        cubica2.setEndX(-5.6);
        cubica2.setEndY(-5.9);
        cubica2.setControlX1(-21.0);
        cubica2.setControlY1(58.19);
        cubica2.setControlX2(-27.7);
        cubica2.setControlY2(6.2);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
	//central
        lineas.setLayoutX(27);
        lineas.setLayoutY(30);
        lineas.setStartX(-13.39);
        lineas.setStartY(-1.8);
        lineas.setEndX(-0.6);
        lineas.setEndY(-1.8);
        lineas.setFill(Color.TRANSPARENT);
        lineas.setStroke(Color.BLACK);
        lineas.setStrokeLineCap(StrokeLineCap.ROUND);
        lineas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_H.getFondo().getChildren().addAll(cubicas,cubica1,cubica2,lineas);
        return (caracter_H.getFondo());
    }
    public AnchorPane crear_I(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        //Constructor Caracter
        Caracter caracter_I = new Caracter('I',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_I.getFondo().setLayoutX(460.0); //layouts mientras no esten dentro de un gridpane
        caracter_I.getFondo().setLayoutY(270.0);
        caracter_I.getFondo().setPrefHeight(60.0); //y
        caracter_I.getFondo().setPrefWidth(45.0);  //x  
        
        
        //SUPERIOR
        cubicas.setLayoutX(32.0);
        cubicas.setLayoutY(9.0);
        cubicas.setStartX(-12.59);
        cubicas.setStartY(9.4);
        cubicas.setEndX(8.59);
        cubicas.setEndY(-0.02);
        cubicas.setControlX1(-16.4);
        cubicas.setControlY1(19.19);
        cubicas.setControlX2(-42.4);
        cubicas.setControlY2(1.90);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //BASE
        cubica1.setLayoutX(44.0);
        cubica1.setLayoutY(19.0);
        cubica1.setStartX(-31.4);
        cubica1.setStartY(31.59);
        cubica1.setEndX(-2.39);
        cubica1.setEndY(-10.02);
        cubica1.setControlX1(-14.59);
        cubica1.setControlY1(31.59);
        cubica1.setControlX2(-27.79);
        cubica1.setControlY2(-8.02);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //FINAL BASE
        cubica2.setLayoutX(1);
        cubica2.setLayoutY(64);
        cubica2.setStartX(11.59);
        cubica2.setStartY(-13.4);
        cubica2.setEndX(7.2);
        cubica2.setEndY(-23.59);
        cubica2.setControlX1(0);
        cubica2.setControlY1(-13.4);
        cubica2.setControlX2(0);
        cubica2.setControlY2(-23.59);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_I.getFondo().getChildren().addAll(cubicas,cubica1,cubica2);
        return (caracter_I.getFondo());
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
        caracter_J.getFondo().setLayoutX(505.0); //layouts mientras no esten dentro de un gridpane
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
    public AnchorPane crear_K(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        //Constructor Caracter
        Caracter caracter_K = new Caracter('K',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_K.getFondo().setLayoutX(550.0); //layouts mientras no esten dentro de un gridpane
        caracter_K.getFondo().setLayoutY(270.0);
        caracter_K.getFondo().setPrefHeight(60.0); //y
        caracter_K.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA izquierda
        cubicas.setLayoutX(35.0);
        cubicas.setLayoutY(14.0);
        cubicas.setStartX(-33.0);
        cubicas.setStartY(32.79);
        cubicas.setEndX(-10.59);
        cubicas.setEndY(-6.0);
        cubicas.setControlX1(-14.59);
        cubicas.setControlY1(53.19);
        cubicas.setControlX2(-27.80);
        cubicas.setControlY2(-6);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito izquierda
        cubica1.setLayoutX(23.0);
        cubica1.setLayoutY(7.0);
        cubica1.setStartX(-11.8);
        cubica1.setStartY(9.19);
        cubica1.setEndX(2.32);
        cubica1.setEndY(1.01);
        cubica1.setControlX1(-8.85);
        cubica1.setControlY1(22.9);
        cubica1.setControlX2(-42.8);
        cubica1.setControlY2(4.79);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //derecha superior
        cubica2.setLayoutX(50.0);
        cubica2.setLayoutY(-7.0);
        cubica2.setStartX(-30.45);
        cubica2.setStartY(35.70);
        cubica2.setEndX(-12.0);
        cubica2.setEndY(15.79);
        cubica2.setControlX1(-6.0);
        cubica2.setControlY1(40.59);
        cubica2.setControlX2(-23.39);
        cubica2.setControlY2(11.79);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //derecha inferior
        cubica3.setLayoutX(60.0);
        cubica3.setLayoutY(4.0);
        cubica3.setStartX(-21.0);
        cubica3.setStartY(46.60);
        cubica3.setEndX(-39.59);
        cubica3.setEndY(24.59);
        cubica3.setControlX1(-35.39);
        cubica3.setControlY1(48.08);
        cubica3.setControlX2(-14.39);
        cubica3.setControlY2(25.99);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(Color.BLACK);
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_K.getFondo().getChildren().addAll(cubicas,cubica1,cubica2,cubica3);
        return(caracter_K.getFondo());
    }
    public AnchorPane crear_L(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        //Constructor Caracter
        Caracter caracter_L = new Caracter('L',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_L.getFondo().setLayoutX(595.0); //layouts mientras no esten dentro de un gridpane
        caracter_L.getFondo().setLayoutY(270.0);
        caracter_L.getFondo().setPrefHeight(60.0); //y
        caracter_L.getFondo().setPrefWidth(45.0);  //x  
        
        
        //BASE
	cubicas.setLayoutX(39.0);
        cubicas.setLayoutY(13.0);
        cubicas.setStartX(-31.19);
        cubicas.setStartY(37.60);
        cubicas.setEndX(-4.0);
        cubicas.setEndY(-7.18);
        cubicas.setControlX1(1.19);
        cubicas.setControlY1(41.4);
        cubicas.setControlX2(-29);
        cubicas.setControlY2(-5.59);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        
        //cachito
        cubica1.setLayoutX(47.0);
        cubica1.setLayoutY(23.0);
        cubica1.setStartX(-33.60);
        cubica1.setStartY(-12.80);
        cubica1.setEndX(-10.95);
        cubica1.setEndY(-17.09);
        cubica1.setControlX1(-10.95);
        cubica1.setControlY1(-2.0);
        cubica1.setControlX2(4.4);
        cubica1.setControlY2(-13.93);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //
        cubica2.setLayoutX(42.0);
        cubica2.setLayoutY(61.0);
        cubica2.setStartX(-35.25);
        cubica2.setStartY(-10.79);
        cubica2.setEndX(-1.8);
        cubica2.setEndY(-14.59);
        cubica2.setControlX1(-51.39);
        cubica2.setControlY1(-24.2);
        cubica2.setControlX2(5.4);
        cubica2.setControlY2(2.0);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_L.getFondo().getChildren().addAll(cubicas,cubica1,cubica2);
        return (caracter_L.getFondo());
        
    }
    public AnchorPane crear_M(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_M = new Caracter('M',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_M.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_M.getFondo().setLayoutY(270.0);
        caracter_M.getFondo().setPrefHeight(60.0); //y
        caracter_M.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA 
        caracter_M.getFondo().getChildren().addAll(cubicas);
        return (caracter_M.getFondo());
    }
    public AnchorPane crear_N(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_N = new Caracter('N',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_N.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_N.getFondo().setLayoutY(270.0);
        caracter_N.getFondo().setPrefHeight(60.0); //y
        caracter_N.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
        caracter_N.getFondo().getChildren().addAll(cubicas);
        return (caracter_N.getFondo());
    }
    public AnchorPane crear_O(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_O = new Caracter('O',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_O.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_O.getFondo().setLayoutY(270.0);
        caracter_O.getFondo().setPrefHeight(60.0); //y
        caracter_O.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA 
        caracter_O.getFondo().getChildren().addAll(cubicas);
        return (caracter_O.getFondo());
    }
    public AnchorPane crear_P(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_P = new Caracter('P',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_P.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_P.getFondo().setLayoutY(270.0);
        caracter_P.getFondo().setPrefHeight(60.0); //y
        caracter_P.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA 
        caracter_P.getFondo().getChildren().addAll(cubicas);
        return (caracter_P.getFondo());
    }
    public AnchorPane crear_Q(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_Q= new Caracter('Q',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_Q.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_Q.getFondo().setLayoutY(270.0);
        caracter_Q.getFondo().setPrefHeight(60.0); //y
        caracter_Q.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA 
        caracter_Q.getFondo().getChildren().addAll(cubicas);
        return (caracter_Q.getFondo());
    }
    public AnchorPane crear_R(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_R = new Caracter('R',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_R.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_R.getFondo().setLayoutY(270.0);
        caracter_R.getFondo().setPrefHeight(60.0); //y
        caracter_R.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
        caracter_R.getFondo().getChildren().addAll(cubicas);
        return (caracter_R.getFondo());
    }
    public AnchorPane crear_S(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_S = new Caracter('S',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_S.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_S.getFondo().setLayoutY(270.0);
        caracter_S.getFondo().setPrefHeight(60.0); //y
        caracter_S.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA
        caracter_S.getFondo().getChildren().addAll(cubicas);
        return (caracter_S.getFondo());
    }
    public AnchorPane crear_T(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_T = new Caracter('T',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_T.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_T.getFondo().setLayoutY(270.0);
        caracter_T.getFondo().setPrefHeight(60.0); //y
        caracter_T.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA
        caracter_T.getFondo().getChildren().addAll(cubicas);
        return (caracter_T.getFondo());
    }
    public AnchorPane crear_U(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_U = new Caracter('U',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_U.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_U.getFondo().setLayoutY(270.0);
        caracter_U.getFondo().setPrefHeight(60.0); //y
        caracter_U.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
        caracter_U.getFondo().getChildren().addAll(cubicas);
        return (caracter_U.getFondo());
    }
    public AnchorPane crear_V(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_V = new Caracter('V',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_V.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_V.getFondo().setLayoutY(270.0);
        caracter_V.getFondo().setPrefHeight(60.0); //y
        caracter_V.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
        caracter_V.getFondo().getChildren().addAll(cubicas);
        return (caracter_V.getFondo());
    }
    public AnchorPane crear_W(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_W = new Caracter('W',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_W.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_W.getFondo().setLayoutY(270.0);
        caracter_W.getFondo().setPrefHeight(60.0); //y
        caracter_W.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA 
        caracter_W.getFondo().getChildren().addAll(cubicas);
        return (caracter_W.getFondo());
        
    }
    public AnchorPane crear_X(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_X = new Caracter('X',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_X.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_X.getFondo().setLayoutY(270.0);
        caracter_X.getFondo().setPrefHeight(60.0); //y
        caracter_X.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
        caracter_X.getFondo().getChildren().addAll(cubicas);
        return (caracter_X.getFondo());
    }
    public AnchorPane crear_Y(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_Y = new Caracter('Y',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_Y.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_Y.getFondo().setLayoutY(270.0);
        caracter_Y.getFondo().setPrefHeight(60.0); //y
        caracter_Y.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
        caracter_Y.getFondo().getChildren().addAll(cubicas);
        return (caracter_Y.getFondo());
    }
    public AnchorPane crear_Z(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_Z = new Caracter('Z',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_Z.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_Z.getFondo().setLayoutY(270.0);
        caracter_Z.getFondo().setPrefHeight(60.0); //y
        caracter_Z.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }*/
        
    

    public AnchorPane crear_Punto(){
        //Objetos
        AnchorPane fondo = new AnchorPane();
        Circle circulo = new Circle();
        
        //Atributos del fondo
        fondo.setPrefSize(22, 60);
        
        //Circulo
        circulo.setRadius(3);
        circulo.setFill(Color.BLACK);
        circulo.setStroke(Color.BLACK);
        circulo.setLayoutX(9);
        circulo.setLayoutY(47);
        
        fondo.getChildren().addAll(circulo);
        return fondo;
    }
    public AnchorPane crear_Coma(){
        //Objetos
        AnchorPane fondo = new AnchorPane();
        Circle circulo = new Circle();
        QuadCurve cuadratica = new QuadCurve();
        
        fondo.setPrefSize(22, 60);
        
        //Circulo
        circulo.setRadius(3);
        circulo.setFill(Color.BLACK);
        circulo.setStroke(Color.BLACK);
        circulo.setLayoutX(6);
        circulo.setLayoutY(47);
        
        //Cuadratica
        cuadratica.setLayoutX(9);
        cuadratica.setLayoutY(78);
        cuadratica.setStartX(-3.79);
        cuadratica.setStartY(-19);
        cuadratica.setEndX(-7.62);
        cuadratica.setEndY(-31);
        cuadratica.setControlX(3.39);
        cuadratica.setControlY(-23);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(Color.BLACK);
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(circulo, cuadratica);
        return fondo;
    }
    public AnchorPane crear_PuntoyComa(){
        //Objetos
        AnchorPane fondo = new AnchorPane();
        Circle circulo = new Circle();
        Circle circulo2 = new Circle();
        QuadCurve cuadratica = new QuadCurve();
        
        fondo.setPrefSize(22, 60);
        
        //Circulo
        circulo.setRadius(3);
        circulo.setFill(Color.BLACK);
        circulo.setStroke(Color.BLACK);
        circulo.setLayoutX(6);
        circulo.setLayoutY(34);
        
        //Circulo2
        circulo2.setRadius(3);
        circulo2.setFill(Color.BLACK);
        circulo2.setStroke(Color.BLACK);
        circulo2.setLayoutX(6);
        circulo2.setLayoutY(47);
        
        //Cuadratica
        cuadratica.setLayoutX(9);
        cuadratica.setLayoutY(78);
        cuadratica.setStartX(-3.79);
        cuadratica.setStartY(-19);
        cuadratica.setEndX(-7.62);
        cuadratica.setEndY(-31);
        cuadratica.setControlX(3.39);
        cuadratica.setControlY(-23);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(Color.BLACK);
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(circulo, cuadratica, circulo2);
        return fondo;
    }
    public AnchorPane crear_DosPuntos(){
        //Objetos
        AnchorPane fondo = new AnchorPane();
        Circle circulo = new Circle();
        Circle circulo2 = new Circle();
        
        fondo.setPrefSize(22, 60);
        
        //Circulo
        circulo.setRadius(3);
        circulo.setFill(Color.BLACK);
        circulo.setStroke(Color.BLACK);
        circulo.setLayoutX(6);
        circulo.setLayoutY(34);
        
        //Circulo2
        circulo2.setRadius(3);
        circulo2.setFill(Color.BLACK);
        circulo2.setStroke(Color.BLACK);
        circulo2.setLayoutX(6);
        circulo2.setLayoutY(47);
        
        fondo.getChildren().addAll(circulo, circulo2);
        return fondo;
    }
    public AnchorPane crear_ComillaSimple(){
        //Objetos
        AnchorPane fondo = new AnchorPane();
        Circle circulo = new Circle();
        QuadCurve cuadratica = new QuadCurve();
        
        fondo.setPrefSize(22, 60);
        
        //Circulo
        circulo.setRadius(2);
        circulo.setFill(Color.BLACK);
        circulo.setStroke(Color.BLACK);
        circulo.setLayoutX(5);
        circulo.setLayoutY(5);
        
        //Cuadratica
        cuadratica.setLayoutX(7);
        cuadratica.setLayoutY(36);
        cuadratica.setStartX(-2);
        cuadratica.setStartY(-23.59);
        cuadratica.setEndX(-7.62);
        cuadratica.setEndY(-31);
        cuadratica.setControlX(0);
        cuadratica.setControlY(-23);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(Color.BLACK);
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(circulo, cuadratica);
        return fondo;
    }
    public AnchorPane crear_ComillasDoble(){
        //Objetos
        AnchorPane fondo = new AnchorPane();
        Circle circulo = new Circle();
        QuadCurve cuadratica = new QuadCurve();
        Circle circulo2 = new Circle();
        QuadCurve cuadratica2 = new QuadCurve();
        
        fondo.setPrefSize(22, 60);
        
        //Circulo
        circulo.setRadius(2);
        circulo.setFill(Color.BLACK);
        circulo.setStroke(Color.BLACK);
        circulo.setLayoutX(5);
        circulo.setLayoutY(5);
        
        //Circulo2
        circulo2.setRadius(2);
        circulo2.setFill(Color.BLACK);
        circulo2.setStroke(Color.BLACK);
        circulo2.setLayoutX(11);
        circulo2.setLayoutY(5);
        
        //Cuadratica
        cuadratica.setLayoutX(7);
        cuadratica.setLayoutY(35);
        cuadratica.setStartX(-2);
        cuadratica.setStartY(-23.59);
        cuadratica.setEndX(-7.62);
        cuadratica.setEndY(-31);
        cuadratica.setControlX(0);
        cuadratica.setControlY(-25.59);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(Color.BLACK);
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cuadratica2
        cuadratica2.setLayoutX(13);
        cuadratica2.setLayoutY(35);
        cuadratica2.setStartX(-2);
        cuadratica2.setStartY(-23.59);
        cuadratica2.setEndX(-7.62);
        cuadratica2.setEndY(-31);
        cuadratica2.setControlX(0);
        cuadratica2.setControlY(-25.59);
        cuadratica2.setFill(Color.TRANSPARENT);
        cuadratica2.setStroke(Color.BLACK);
        cuadratica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(circulo, cuadratica, circulo2, cuadratica2);
        return fondo;
    }
    public AnchorPane crear_ComillasEspañolaInicio(){
        AnchorPane fondo = new AnchorPane();
        QuadCurve cubica = new QuadCurve();
        QuadCurve cubica2 = new QuadCurve();
        
        fondo.setPrefSize(30, 60);
        
        //Cubica
        cubica.setLayoutX(31);
        cubica.setLayoutY(55);
        cubica.setStartX(-14.79);
        cubica.setStartY(-14.19);
        cubica.setEndX(-14.79);
        cubica.setEndY(-36.19);
        cubica.setControlX(-46);
        cubica.setControlY(-24.6);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(Color.BLACK);
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica2
        cubica2.setLayoutX(41);
        cubica2.setLayoutY(55);
        cubica2.setStartX(-14.79);
        cubica2.setStartY(-15);
        cubica2.setEndX(-14.79);
        cubica2.setEndY(-35);
        cubica2.setControlX(-46);
        cubica2.setControlY(-24.6);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2);
        return fondo;
    }
    public AnchorPane crear_ComillasEspañolaFinal(){
        AnchorPane fondo = new AnchorPane();
        QuadCurve cubica = new QuadCurve();
        QuadCurve cubica2 = new QuadCurve();
        
        fondo.setPrefSize(30, 60);
        
        //Cubica
        cubica.setLayoutX(23);
        cubica.setLayoutY(58);
        cubica.setStartX(-21.19);
        cubica.setStartY(-18.8);
        cubica.setEndX(-21.19);
        cubica.setEndY(-36.4);
        cubica.setControlX(11.39);
        cubica.setControlY(-28.4);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(Color.BLACK);
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica2
        cubica2.setLayoutX(34);
        cubica2.setLayoutY(58);
        cubica2.setStartX(-21.19);
        cubica2.setStartY(-18.8);
        cubica2.setEndX(-21.19);
        cubica2.setEndY(-36.4);
        cubica2.setControlX(11.39);
        cubica2.setControlY(-28.4);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2);
        return fondo;
    }
    public AnchorPane crear_ParentesisInicio(){
        AnchorPane fondo = new AnchorPane();
        QuadCurve cubica = new QuadCurve();
        
        fondo.setPrefSize(22, 60);
        
        //Cubica
        cubica.setLayoutX(20);
        cubica.setLayoutY(55);
        cubica.setStartX(-6.6);
        cubica.setStartY(1.8);
        cubica.setEndX(-6.6);
        cubica.setEndY(-51.8);
        cubica.setControlX(-29.3);
        cubica.setControlY(-25.8);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(Color.BLACK);
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica);
        return fondo;
    }
    public AnchorPane crear_ParentesisFinal(){
        AnchorPane fondo = new AnchorPane();
        QuadCurve cubica = new QuadCurve();
        
        fondo.setPrefSize(22, 60);
        
        //Cubica
        cubica.setLayoutX(9);
        cubica.setLayoutY(55);
        cubica.setStartX(-6.6);
        cubica.setStartY(1.8);
        cubica.setEndX(-6.6);
        cubica.setEndY(-51.8);
        cubica.setControlX(14.6);
        cubica.setControlY(-25);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(Color.BLACK);
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica);
        return fondo;
    }
    public AnchorPane crear_CorcheteInicio(){
        AnchorPane fondo = new AnchorPane();
        Line linea = new Line();
        Line linea2 = new Line();
        Line linea3 = new Line();
        
        fondo.setPrefSize(34, 60);
        
        //Linea Vertical
        linea.setLayoutX(18);
        linea.setLayoutY(34);
        linea.setStartX(-13.6);
        linea.setStartY(-27.6);
        linea.setEndX(-13.69);
        linea.setEndY(21.39);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(Color.BLACK);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea Superior
        linea2.setLayoutX(14);
        linea2.setLayoutY(26);
        linea2.setStartX(-9.19);
        linea2.setStartY(-19.6);
        linea2.setEndX(8.8);
        linea2.setEndY(-19.6);
        linea2.setFill(Color.TRANSPARENT);
        linea2.setStroke(Color.BLACK);
        linea2.setStrokeLineCap(StrokeLineCap.ROUND);
        linea2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea Inferior
        linea3.setLayoutX(14);
        linea3.setLayoutY(75);
        linea3.setStartX(-9.19);
        linea3.setStartY(-19.6);
        linea3.setEndX(8.8);
        linea3.setEndY(-19.6);
        linea3.setFill(Color.TRANSPARENT);
        linea3.setStroke(Color.BLACK);
        linea3.setStrokeLineCap(StrokeLineCap.ROUND);
        linea3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(linea, linea2, linea3);
        return fondo;
    }
    public AnchorPane crear_CorcheteFinal(){
        AnchorPane fondo = new AnchorPane();
        Line linea = new Line();
        Line linea2 = new Line();
        Line linea3 = new Line();
        
        fondo.setPrefSize(34, 60);
        
        //Linea Vertical
        linea.setLayoutX(35);
        linea.setLayoutY(33);
        linea.setStartX(-13.6);
        linea.setStartY(-27.6);
        linea.setEndX(-13.69);
        linea.setEndY(21.39);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(Color.BLACK);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea Superior
        linea2.setLayoutX(12);
        linea2.setLayoutY(25);
        linea2.setStartX(-9.19);
        linea2.setStartY(-19.6);
        linea2.setEndX(8.8);
        linea2.setEndY(-19.6);
        linea2.setFill(Color.TRANSPARENT);
        linea2.setStroke(Color.BLACK);
        linea2.setStrokeLineCap(StrokeLineCap.ROUND);
        linea2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea Inferior
        linea3.setLayoutX(12);
        linea3.setLayoutY(74);
        linea3.setStartX(-9.19);
        linea3.setStartY(-19.6);
        linea3.setEndX(8.8);
        linea3.setEndY(-19.6);
        linea3.setFill(Color.TRANSPARENT);
        linea3.setStroke(Color.BLACK);
        linea3.setStrokeLineCap(StrokeLineCap.ROUND);
        linea3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(linea, linea2, linea3);
        return fondo;
    }
    public AnchorPane crear_LlaveInicial(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        
        fondo.setPrefSize(34, 60);
        
        //Cubica superior
        cubica.setLayoutX(4);
        cubica.setLayoutY(29);
        cubica.setStartX(-0.2);
        cubica.setStartY(1);
        cubica.setEndX(17);
        cubica.setEndY(-24.6);
        cubica.setControlX1(17);
        cubica.setControlY1(1);
        cubica.setControlX2(-4.2);
        cubica.setControlY2(-24.6);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(Color.BLACK);
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica Inferior
        cubica2.setLayoutX(7);
        cubica2.setLayoutY(45);
        cubica2.setStartX(13.59);
        cubica2.setStartY(10.59);
        cubica2.setEndX(-4.2);
        cubica2.setEndY(-14);
        cubica2.setControlX1(-0.79);
        cubica2.setControlY1(10.59);
        cubica2.setControlX2(13.59);
        cubica2.setControlY2(-14);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2);
        return fondo;
    }
    public AnchorPane crear_LlaveFinal(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        
        fondo.setPrefSize(34, 60);
        
        //Cubica superior
        cubica.setLayoutX(11);
        cubica.setLayoutY(15);
        cubica.setStartX(11.08);
        cubica.setStartY(15);
        cubica.setEndX(-9.39);
        cubica.setEndY(-11.4);
        cubica.setControlX1(-8.12);
        cubica.setControlY1(15);
        cubica.setControlX2(11.08);
        cubica.setControlY2(-11.4);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(Color.BLACK);
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica Inferior
        cubica2.setLayoutX(15);
        cubica2.setLayoutY(36);
        cubica2.setStartX(-11);
        cubica2.setStartY(20.39);
        cubica2.setEndX(8.21);
        cubica2.setEndY(-4.86);
        cubica2.setControlX1(8.21);
        cubica2.setControlY1(20.39);
        cubica2.setControlX2(-11);
        cubica2.setControlY2(-4.86);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2);
        return fondo;
    }
    public AnchorPane crear_Guion(){
        AnchorPane fondo = new AnchorPane();
        Line linea = new Line();
        
        fondo.setPrefSize(34, 60);
        
        linea.setLayoutX(12);
        linea.setLayoutY(23);
        linea.setStartX(-14.4);
        linea.setStartY(4.19);
        linea.setEndX(15.2);
        linea.setEndY(4.19);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(Color.BLACK);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(linea);
        return fondo;
    }
    public AnchorPane crear_GuionBajo(){
        AnchorPane fondo = new AnchorPane();
        Line linea = new Line();
        
        fondo.setPrefSize(34, 60);
        
        linea.setLayoutX(12);
        linea.setLayoutY(49);
        linea.setStartX(-10.4);
        linea.setStartY(4.19);
        linea.setEndX(15.2);
        linea.setEndY(4.19);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(Color.BLACK);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(linea);
        return fondo;
    }
    public AnchorPane crear_interrogacionInicial(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        Line linea = new Line();
        Circle circulo = new Circle();
        
        fondo.setPrefSize(34, 60);
        
        //Cubica
        cubica.setLayoutX(12);
        cubica.setLayoutY(30);
        cubica.setStartX(13.33);
        cubica.setStartY(-25.19);
        cubica.setEndX(13.33);
        cubica.setEndY(-5.46);
        cubica.setControlX1(-18.66);
        cubica.setControlY1(-34.79);
        cubica.setControlX2(-18.66);
        cubica.setControlY2(2.53);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(Color.BLACK);
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea
        linea.setLayoutX(21);
        linea.setLayoutY(37);
        linea.setStartX(3.8);
        linea.setStartY(-13);
        linea.setEndX(3.8);
        linea.setEndY(7.8);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(Color.BLACK);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Circulo
        circulo.setRadius(3);
        circulo.setFill(Color.BLACK);
        circulo.setStroke(Color.BLACK);
        circulo.setLayoutX(25);
        circulo.setLayoutY(51);
        
        fondo.getChildren().addAll(cubica, linea, circulo);
        return fondo;
    }
}