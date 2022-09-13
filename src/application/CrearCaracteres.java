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
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1= new CubicCurve();
               
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
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
        fondo.getChildren().addAll(cubicas,cubica1,lineas);
        return fondo;
    }
    public AnchorPane crear_B() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubicas2 = new CubicCurve();
        CubicCurve cubicas3 = new CubicCurve();
        //atributos
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
       
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
        cubicas2.setLayoutX(30);
        cubicas2.setLayoutY(21);
        cubicas2.setStartX(-25.84);
        cubicas2.setStartY(-3.8);
        cubicas2.setEndX(-1.1);
        cubicas2.setEndY(7.8);
        cubicas2.setControlX1(-21.99);
        cubicas2.setControlY1(-22.99);
        cubicas2.setControlX2(27.19);
        cubicas2.setControlY2(-7.6);
        cubicas2.setFill(Color.TRANSPARENT);
        cubicas2.setStroke(Color.BLACK);
        cubicas2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //tercera parte inferior//
        cubicas3.setLayoutX(37);
        cubicas3.setLayoutY(38);
        cubicas3.setStartX(-17.4);
        cubicas3.setStartY(8.79);
        cubicas3.setEndX(-8);
        cubicas3.setEndY(-9);
        cubicas3.setControlX1(-4);
        cubicas3.setControlY1(22.59);
        cubicas3.setControlX2(16.4);
        cubicas3.setControlY2(-1.8);
        cubicas3.setFill(Color.TRANSPARENT);
        cubicas3.setStroke(Color.BLACK);
        cubicas3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas3.setStrokeLineJoin(StrokeLineJoin.ROUND);
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
        fondo.getChildren().addAll(cubicas,cubica1,cubicas2,cubicas3,lineas);
        return fondo;
    }    
    public AnchorPane crear_C() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubicas1 = new CubicCurve();
        CubicCurve cubicas2 = new CubicCurve();

        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
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
    public AnchorPane crear_D(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
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
        fondo.getChildren().addAll(cubicas,cubica1,cubica2,cubica3);
        return fondo;
    }
    public AnchorPane crear_E(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();

        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
  
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x 
        
        
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
        fondo.getChildren().addAll(cubicas,cubica1,cubica2,cubica3);
        return fondo;
    }
    public AnchorPane crear_F(){
       
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        Line linea1 = new Line();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
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
        
        fondo.getChildren().addAll(cubicas,cubica1,cubica2,lineas,linea1);
        return fondo;
    }
    public AnchorPane crear_G(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
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
        fondo.getChildren().addAll(cubicas,cubica1,cubica2);
        return fondo;
    }
    public AnchorPane crear_H(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
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
        fondo.getChildren().addAll(cubicas,cubica1,cubica2,lineas);
        return fondo;
    }
    public AnchorPane crear_I(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();   
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
             
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
        fondo.getChildren().addAll(cubicas,cubica1,cubica2);
        return fondo;
    }
    public AnchorPane crear_J() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubicas2 = new CubicCurve();
        CubicCurve cubicas3 = new CubicCurve();
       
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
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
        fondo.getChildren().addAll(cubicas,cubicas2,cubicas3);
        return fondo;
    }
    public AnchorPane crear_K(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
 
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
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
        fondo.getChildren().addAll(cubicas,cubica1,cubica2,cubica3);
        return fondo;
    }
    public AnchorPane crear_L(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
 
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
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
        fondo.getChildren().addAll(cubicas,cubica1,cubica2);
        return fondo;
        
    }
    public AnchorPane crear_M(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubicas = new CubicCurve();   
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        QuadCurve cuadraticas = new QuadCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        
        //PRIMERA izquierda
        cubicas.setLayoutX(33.0);
        cubicas.setLayoutY(14.0);
        cubicas.setStartX(-33.0);
        cubicas.setStartY(35.0);
        cubicas.setEndX(-10.59);
        cubicas.setEndY(-6.0);
        cubicas.setControlX1(-13.8);
        cubicas.setControlY1(48.0);
        cubicas.setControlX2(-31.39);
        cubicas.setControlY2(-6.0);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //medio izquierdo
        cubica1.setLayoutX(34.0);
        cubica1.setLayoutY(18.0);
        cubica1.setStartX(-11.19);
        cubica1.setStartY(20.79);
        cubica1.setEndX(-11.19);
        cubica1.setEndY(-10.0);
        cubica1.setControlX1(-7.29);
        cubica1.setControlY1(6.99);
        cubica1.setControlX2(-26.0);
        cubica1.setControlY2(-1.59);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        // medio derecho
        cubica2.setLayoutX(44.0);
        cubica2.setLayoutY(28.0);
        cubica2.setStartX(-22.16);
        cubica2.setStartY(11.94);
        cubica2.setEndX(-1.4);
        cubica2.setEndY(-20.16);
        cubica2.setControlX1(-13.39);
        cubica2.setControlY1(2.59);
        cubica2.setControlX2(-15.59);
        cubica2.setControlY2(-20.16);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //derecho
        cubica3.setLayoutX(54.0);
        cubica3.setLayoutY(15.0);
        cubica3.setStartX(-29.64);
        cubica3.setStartY(36.0);
        cubica3.setEndX(-11.8);
        cubica3.setEndY(-6.59);
        cubica3.setControlX1(0.40);
        cubica3.setControlY1(44.0);
        cubica3.setControlX2(-29.64);
        cubica3.setControlY2(-2.4);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(Color.BLACK);
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cuadratica
 	cuadraticas.setLayoutX(56);
        cuadraticas.setLayoutY(55.5);
        cuadraticas.setStartX(-33.16);
        cuadraticas.setStartY(-4.9);
        cuadraticas.setEndX(-10.39);
        cuadraticas.setEndY(-14.59);
        cuadraticas.setControlX(-19);
        cuadraticas.setControlY(2.5);
        cuadraticas.setFill(Color.TRANSPARENT);
        cuadraticas.setStroke(Color.BLACK);
        cuadraticas.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadraticas.setStrokeLineJoin(StrokeLineJoin.ROUND);       
        fondo.getChildren().addAll(cubicas,cubica1,cubica2,cubica3,cuadraticas);
        return fondo;
    }
    public AnchorPane crear_N(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        //Line lineas = new Line();
        //QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        
        //izquierdo
        cubicas.setLayoutX(33.0);
        cubicas.setLayoutY(13.0);
        cubicas.setStartX(-31.39);
        cubicas.setStartY(37.4);
        cubicas.setEndX(-22.4);
        cubicas.setEndY(-5.4);
        cubicas.setControlX1(-22.4);
        cubicas.setControlY1(41.0);
        cubicas.setControlX2(-16.99);
        cubicas.setControlY2(9.59);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //medio
        cubica1.setLayoutX(42.0);
        cubica1.setLayoutY(24.0);
        cubica1.setStartX(-7.59);
        cubica1.setStartY(26.4);
        cubica1.setEndX(-31.8);
        cubica1.setEndY(-16.53);
        cubica1.setControlX1(-22.4);
        cubica1.setControlY1(13.4);
        cubica1.setControlX2(-19.19);
        cubica1.setControlY2(-9.4);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //derecho
        cubica2.setLayoutX(62.0);
        cubica2.setLayoutY(14.0);
        cubica2.setStartX(-2819);
        cubica2.setStartY(35.4);
        cubica2.setEndX(-19.6);
        cubica2.setEndY(-4.2);
        cubica2.setControlX1(-34.6);
        cubica2.setControlY1(13.79);
        cubica2.setControlX2(-30.19);
        cubica2.setControlY2(-18.0);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito
        cubica3.setLayoutX(46.0);
        cubica3.setLayoutY(15.0);
        cubica3.setStartX(-8.39);
        cubica3.setStartY(-3.4);
        cubica3.setEndX(-5.59);
        cubica3.setEndY(-7.2);
        cubica3.setControlX1(-11.19);
        cubica3.setControlY1(2.79);
        cubica3.setControlX2(2.8);
        cubica3.setControlY2(0.4);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(Color.BLACK);
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);

        fondo.getChildren().addAll(cubicas,cubica1,cubica2,cubica3);
        return fondo;
    }
        public AnchorPane crear_Ñ(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        //Line lineas = new Line();
        //QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        CubicCurve cubica4 = new CubicCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        
        //izquierdo
        cubicas.setLayoutX(33.0);
        cubicas.setLayoutY(13.0);
        cubicas.setStartX(-31.39);
        cubicas.setStartY(37.4);
        cubicas.setEndX(-22.4);
        cubicas.setEndY(-5.4);
        cubicas.setControlX1(-22.4);
        cubicas.setControlY1(41.0);
        cubicas.setControlX2(-16.99);
        cubicas.setControlY2(9.59);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //medio
        cubica1.setLayoutX(42.0);
        cubica1.setLayoutY(24.0);
        cubica1.setStartX(-7.59);
        cubica1.setStartY(26.4);
        cubica1.setEndX(-31.8);
        cubica1.setEndY(-16.53);
        cubica1.setControlX1(-22.4);
        cubica1.setControlY1(13.4);
        cubica1.setControlX2(-19.19);
        cubica1.setControlY2(-9.4);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //derecho
        cubica2.setLayoutX(62.0);
        cubica2.setLayoutY(14.0);
        cubica2.setStartX(-2819);
        cubica2.setStartY(35.4);
        cubica2.setEndX(-19.6);
        cubica2.setEndY(-4.2);
        cubica2.setControlX1(-34.6);
        cubica2.setControlY1(13.79);
        cubica2.setControlX2(-30.19);
        cubica2.setControlY2(-18.0);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito
        cubica3.setLayoutX(46.0);
        cubica3.setLayoutY(15.0);
        cubica3.setStartX(-8.39);
        cubica3.setStartY(-3.4);
        cubica3.setEndX(-5.59);
        cubica3.setEndY(-7.2);
        cubica3.setControlX1(-11.19);
        cubica3.setControlY1(2.79);
        cubica3.setControlX2(2.8);
        cubica3.setControlY2(0.4);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(Color.BLACK);
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        // linea superior
        cubicas.setLayoutX(46.0);
        cubicas.setLayoutY(20.0);
        cubicas.setStartX(-8.39);
        cubicas.setStartY(-14.80);
        cubicas.setEndX(-37.89);
        cubicas.setEndY(-11.53);
        cubicas.setControlX1(-20.39);
        cubicas.setControlY1(-3.80);
        cubicas.setControlX2(-25.19);
        cubicas.setControlY2(-24.0);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubicas,cubica1,cubica2,cubica3,cubica4);
        return fondo;
    }
    public AnchorPane crear_O(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        //Line lineas = new Line();
        //QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();        
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        
        //IZQUIERDO
	cubicas.setLayoutX(39.0);
        cubicas.setLayoutY(13.0);
        cubicas.setStartX(-19.60);
        cubicas.setStartY(37.6);
        cubicas.setEndX(-17.2);
        cubicas.setEndY(-2.59);
        cubicas.setControlX1(-39.0);
        cubicas.setControlY1(39.6);
        cubicas.setControlX2(-37.0);
        cubicas.setControlY2(-6.0);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //MEDIO
        cubica1.setLayoutX(49.0);
        cubica1.setLayoutY(24.0);
        cubica1.setStartX(-33.6);
        cubica1.setStartY(-12.59);
        cubica1.setEndX(-8.39);
        cubica1.setEndY(6.99);
        cubica1.setControlX1(-39.8);
        cubica1.setControlY1(1.59);
        cubica1.setControlX2(-21.8);
        cubica1.setControlY2(-9.4);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //DERECHO
        cubica2.setLayoutX(39.0);
        cubica2.setLayoutY(13.0);
        cubica2.setStartX(-18.55);
        cubica2.setStartY(37.66);
        cubica2.setEndX(-19.6);
        cubica2.setEndY(-4.2);
        cubica2.setControlX1(-3.39);
        cubica2.setControlY1(35.0);
        cubica2.setControlX2(3.6);
        cubica2.setControlY2(-4.2);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubicas,cubica1,cubica2);
        return fondo;
    }
    public AnchorPane crear_P(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        //Line lineas = new Line();
        //QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1= new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        
        //CENTRAL
        cubicas.setLayoutX(35.0);
        cubicas.setLayoutY(15.0);
        cubicas.setStartX(-31.8);
        cubicas.setStartY(34.4);
        cubicas.setEndX(-13.8);
        cubicas.setEndY(-2.4);
        cubicas.setControlX1(-22.4);
        cubicas.setControlY1(41.0);
        cubicas.setControlX2(-16.44);
        cubicas.setControlY2(11.48);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito
        cubica1.setLayoutX(25.0);
        cubica1.setLayoutY(3.0);
        cubica1.setStartX(-8.6);
        cubica1.setStartY(15.0);
        cubica1.setEndX(-8.6);
        cubica1.setEndY(4);
        cubica1.setControlX1(-13.39);
        cubica1.setControlY1(27.59);
        cubica1.setControlX2(-32.39);
        cubica1.setControlY2(9.59);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //CURVAAAA
        cubica2.setLayoutX(34.0);
        cubica2.setLayoutY(19.0);
        cubica2.setStartX(-21.6);
        cubica2.setStartY(-10.59);
        cubica2.setEndX(-12.91);
        cubica2.setEndY(9.7);
        cubica2.setControlX1(21.39);
        cubica2.setControlY1(-28.8);
        cubica2.setControlX2(8.6);
        cubica2.setControlY2(28.2);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubicas,cubica1,cubica2);
        return fondo;
    }
    public AnchorPane crear_Q(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        //Line lineas = new Line();
        //QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
 
        //izquierdo
        cubicas.setLayoutX(39.0);
        cubicas.setLayoutY(13.0);
        cubicas.setStartX(-19.6);
        cubicas.setStartY(37.6);
        cubicas.setEndX(-19.6);
        cubicas.setEndY(-4.2);
        cubicas.setControlX1(-39.0);
        cubicas.setControlY1(39.6);
        cubicas.setControlX2(-37.0);
        cubicas.setControlY2(-6.0);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //derecho
        cubica1.setLayoutX(39.0);
        cubica1.setLayoutY(13.0);
        cubica1.setStartX(-18.55);
        cubica1.setStartY(37.66);
        cubica1.setEndX(-16.6);
        cubica1.setEndY(0.8);
        cubica1.setControlX1(-3.39);
        cubica1.setControlY1(35.0);
        cubica1.setControlX2(3.39);
        cubica1.setControlY2(-8.19);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //centro
        cubica2.setLayoutX(53.0);
        cubica2.setLayoutY(39.0);
        cubica2.setStartX(-31.0);
        cubica2.setStartY(-25.19);
        cubica2.setEndX(-28.79);
        cubica2.setEndY(-8.79);
        cubica2.setControlX1(-42.2);
        cubica2.setControlY1(-21.59);
        cubica2.setControlX2(-42.2);
        cubica2.setControlY2(0.6);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito inferior derecho
        cubica2.setLayoutX(65.5);
        cubica2.setLayoutY(50.0);
        cubica2.setStartX(-31.2);
        cubica2.setStartY(0.8);
        cubica2.setEndX(-43.0);
        cubica2.setEndY(-18.59);
        cubica2.setControlX1(-59.6);
        cubica2.setControlY1(-28.79);
        cubica2.setControlX2(-27.6);
        cubica2.setControlY2(-28.79);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubicas,cubica1,cubica2); 
        return fondo;
    }
    public AnchorPane crear_R(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        //Line lineas = new Line();
        //QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x 
        
        
        //centro
        cubicas.setLayoutX(35.0);
        cubicas.setLayoutY(16.0);
        cubicas.setStartX(-32.6);
        cubicas.setStartY(33.6);
        cubicas.setEndX(0.6);
        cubicas.setEndY(-12.8);
        cubicas.setControlX1(-19.19);
        cubicas.setControlY1(42.2);
        cubicas.setControlX2(-16.39);
        cubicas.setControlY2(-10.11);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //superior derecha
        cubica1.setLayoutX(34.0);
        cubica1.setLayoutY(22.0);
        cubica1.setStartX(-19.39);
        cubica1.setStartY(-14.11);
        cubica1.setEndX(-11.19);
        cubica1.setEndY(7.9);
        cubica1.setControlX1(16.80);
        cubica1.setControlY1(-25.2);
        cubica1.setControlX2(9.6);
        cubica1.setControlY2(14.59);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //inferior derecha
        cubica2.setLayoutX(60.0);
        cubica2.setLayoutY(4.0);
        cubica2.setStartX(-21.0);
        cubica2.setStartY(46.6);
        cubica2.setEndX(-38.6);
        cubica2.setEndY(25.99);
        cubica2.setControlX1(-35.39);
        cubica2.setControlY1(48.08);
        cubica2.setControlX2(-14.39);
        cubica2.setControlY2(25.99);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito 
        cubica3.setLayoutX(26.0);
        cubica3.setLayoutY(3);
        cubica3.setStartX(-8.6);
        cubica3.setStartY(15.4);
        cubica3.setEndX(-8.6);
        cubica3.setEndY(4.0);
        cubica3.setControlX1(-15.19);
        cubica3.setControlY1(25.4);
        cubica3.setControlX2(-26.19);
        cubica3.setControlY2(8.79);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(Color.BLACK);
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);


        fondo.getChildren().addAll(cubicas,cubica1,cubica2,cubica3);
        return fondo;
    }
    public AnchorPane crear_S(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        //Line lineas = new Line();
        //QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1= new CubicCurve();
        CubicCurve cubica2=new CubicCurve();
 
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        
        //guatita media
        cubicas.setLayoutX(65.0);
        cubicas.setLayoutY(7.0);
        cubicas.setStartX(-47.6);
        cubicas.setStartY(44.2);
        cubicas.setEndX(-42.2);
        cubicas.setEndY(13.8);
        cubicas.setControlX1(-35.39);
        cubicas.setControlY1(48.08);
        cubicas.setControlX2(-11.79);
        cubicas.setControlY2(30.79);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito inferior
        cubica1.setLayoutX(9.0);
        cubica1.setLayoutY(65.0);
        cubica1.setStartX(11.59);
        cubica1.setStartY(-13.4);
        cubica1.setEndX(7.2);
        cubica1.setEndY(-23.59);
        cubica1.setControlX1(0);
        cubica1.setControlY1(-13.4);
        cubica1.setControlX2(0);
        cubica1.setControlY2(-23.59);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //superior cachito
        cubica2.setLayoutX(26.0);
        cubica2.setLayoutY(19.0);
        cubica2.setStartX(-1.6);
        cubica2.setStartY(2.79);
        cubica2.setEndX(4.7);
        cubica2.setEndY(-5.4);
        cubica2.setControlX1(-23.79);
        cubica2.setControlY1(-9.8);
        cubica2.setControlX2(1.79);
        cubica2.setControlY2(-16.0);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);

        fondo.getChildren().addAll(cubicas,cubica1,cubica2);
        return fondo;
    }
    public AnchorPane crear_T(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        //Line lineas = new Line();
        //QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x       
        //central
        cubicas.setLayoutX(41.0);
        cubicas.setLayoutY(18.0);
        cubicas.setStartX(-31.4);
        cubicas.setStartY(31.59);
        cubicas.setEndX(-0.4);
        cubicas.setEndY(-10.02);
        cubicas.setControlX1(-10);
        cubicas.setControlY1(31.6);
        cubicas.setControlX2(-31.4);
        cubicas.setControlY2(-12.8);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //superior central
        cubica1.setLayoutX(28.0);
        cubica1.setLayoutY(8.0);
        cubica1.setStartX(-21.59);
        cubica1.setStartY(7.79);
        cubica1.setEndX(12.2);
        cubica1.setEndY(0);
        cubica1.setControlX1(-31.59);
        cubica1.setControlY1(-9.2);
        cubica1.setControlX2(1.79);
        cubica1.setControlY2(1.79);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito superior
        cubica2.setLayoutX(32.0);
        cubica2.setLayoutY(17.0);
        cubica2.setStartX(-15.4);
        cubica2.setStartY(-4.0);
        cubica2.setEndX(-25.2);
        cubica2.setEndY(-1.01);
        cubica2.setControlX1(-12.0);
        cubica2.setControlY1(6.59);
        cubica2.setControlX2(-22.0);
        cubica2.setControlY2(2.99);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito inferior
        cubica3.setLayoutX(-1.0);
        cubica3.setLayoutY(63.0);
        cubica3.setStartX(11.59);
        cubica3.setStartY(-13.4);
        cubica3.setEndX(9.59);
        cubica3.setEndY(-20.4);
        cubica3.setControlX1(0);
        cubica3.setControlY1(-13.4);
        cubica3.setControlX2(3.59);
        cubica3.setControlY2(-23.59);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(Color.BLACK);
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubicas,cubica1,cubica2,cubica3);
        return fondo;
    }
    public AnchorPane crear_U(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        //Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        
        //BASE
        cubicas.setLayoutX(46.0);
        cubicas.setLayoutY(16.0);
        cubicas.setStartX(-10.2);
        cubicas.setStartY(-5.8);
        cubicas.setEndX(-33.0);
        cubicas.setEndY(1.8);
        cubicas.setControlX1(-7.2);
        cubicas.setControlY1(48.79);
        cubicas.setControlX2(-42.6);
        cubicas.setControlY2(44.0);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //
        cubica1.setLayoutX(18.5);
        cubica1.setLayoutY(1.5);
        cubica1.setStartX(-11.89);
        cubica1.setStartY(22.5);
        cubica1.setEndX(-5.29);
        cubica1.setEndY(16.10);
        cubica1.setControlX1(-27.5);
        cubica1.setControlY1(19.69);
        cubica1.setControlX2(-5.29);
        cubica1.setControlY2(-4.3);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //COLITA DE UNION
 	cuadraticas.setLayoutX(44.0);
        cuadraticas.setLayoutY(65.0);
        cuadraticas.setStartX(-1.0);
        cuadraticas.setStartY(-15.6);
        cuadraticas.setEndX(-10.0);
        cuadraticas.setEndY(-31.8);
        cuadraticas.setControlX(-12.2);
        cuadraticas.setControlY(-13.74);
        cuadraticas.setFill(Color.TRANSPARENT);
        cuadraticas.setStroke(Color.BLACK);
        cuadraticas.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadraticas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubicas,cuadraticas,cubica1);
        return fondo;
    }
    public AnchorPane crear_V(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        //Line lineas = new Line();
        //QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();       
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        
        //izquiera linea
        cubicas.setLayoutX(34.0);
        cubicas.setLayoutY(24.0);
        cubicas.setStartX(-7.59);
        cubicas.setStartY(26.4);
        cubicas.setEndX(-19.59);
        cubicas.setEndY(-14.19);
        cubicas.setControlX1(-25.44);
        cubicas.setControlY1(3.99);
        cubicas.setControlX2(-15);
        cubicas.setControlY2(-14.19);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //derecha linea
        cubica1.setLayoutX(58.0);
        cubica1.setLayoutY(13.0);
        cubica1.setStartX(-31.39);
        cubica1.setStartY(37.4);
        cubica1.setEndX(-22.59);
        cubica1.setEndY(-3.19);
        cubica1.setControlX1(-28.0);
        cubica1.setControlY1(29.39);
        cubica1.setControlX2(-17.0);
        cubica1.setControlY2(8.39);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito
        cubica2.setLayoutX(18.0);
        cubica2.setLayoutY(19.0);
        cubica2.setStartX(-6.06);
        cubica2.setStartY(5.19);
        cubica2.setEndX(-4.59);
        cubica2.setEndY(-9.19);
        cubica2.setControlX1(-11.39);
        cubica2.setControlY1(15.2);
        cubica2.setControlX2(-22.19);
        cubica2.setControlY2(3.6);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubicas,cubica1,cubica2);
        return fondo;
    }
    public AnchorPane crear_W(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        //Line lineas = new Line();
        //QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        CubicCurve cubica4 = new CubicCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        //PRIMERA izquierda
        cubicas.setLayoutX(27.0);
        cubicas.setLayoutY(24.0);
        cubicas.setStartX(-9.95);
        cubicas.setStartY(25.4);
        cubicas.setEndX(-19.59);
        cubicas.setEndY(-14.19);
        cubicas.setControlX1(-25.19);
        cubicas.setControlY1(14.6);
        cubicas.setControlX2(-13.19);
        cubicas.setControlY2(-14.19);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //izquierda centro
        cubica1.setLayoutX(51.0);
        cubica1.setLayoutY(13.0);
        cubica1.setStartX(-34.59);
        cubica1.setStartY(35.0);
        cubica1.setEndX(-27.19);
        cubica1.setEndY(-2.8);
        cubica1.setControlX1(-36.8);
        cubica1.setControlY1(27.6);
        cubica1.setControlX2(-24.19);
        cubica1.setControlY2(10.5);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //derecha centro
        cubica2.setLayoutX(42.0);
        cubica2.setLayoutY(24.0);
        cubica2.setStartX(-10.19);
        cubica2.setStartY(24.6);
        cubica2.setEndX(-18.8);
        cubica2.setEndY(-14.47);
        cubica2.setControlX1(-22.8);
        cubica2.setControlY1(6.8);
        cubica2.setControlX2(-13.0);
        cubica2.setControlY2(-6.19);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //derecha
        cubica3.setLayoutX(67.0);
        cubica3.setLayoutY(14.0);
        cubica3.setStartX(-34.59);
        cubica3.setStartY(35.0);
        cubica3.setEndX(-28.59);
        cubica3.setEndY(-4.39);
        cubica3.setControlX1(-36.8);
        cubica3.setControlY1(-27.6);
        cubica3.setControlX2(-20.4);
        cubica3.setControlY2(11.0);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(Color.BLACK);
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito
        cubica4.setLayoutX(12.0);
        cubica4.setLayoutY(19.0);
        cubica4.setStartX(-4.59);
        cubica4.setStartY(0.0);
        cubica4.setEndX(-4.59);
        cubica4.setEndY(-9.19);
        cubica4.setControlX1(-8.19);
        cubica4.setControlY1(7.0);
        cubica4.setControlX2(-18.0);
        cubica4.setControlY2(0.0);
        cubica4.setFill(Color.TRANSPARENT);
        cubica4.setStroke(Color.BLACK);
        cubica4.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica4.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubicas,cubica1,cubica2,cubica3,cubica4);
        return fondo;
        
    }
    public AnchorPane crear_X(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        
        //izquierda
        cubicas.setLayoutX(40.0);
        cubicas.setLayoutY(25.0);
        cubicas.setStartX(-34.0);
        cubicas.setStartY(24.19);
        cubicas.setEndX(-29.6);
        cubicas.setEndY(-14.0);
        cubicas.setControlX1(-13.8);
        cubicas.setControlY1(22.4);
        cubicas.setControlX2(-6.19);
        cubicas.setControlY2(-5.8);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //derecha
        cubica1.setLayoutX(42.0);
        cubica1.setLayoutY(28.0);
        cubica1.setStartX(-4.0);
        cubica1.setStartY(20.8);
        cubica1.setEndX(-5.8);
        cubica1.setEndY(-18.19);
        cubica1.setControlX1(-19.6);
        cubica1.setControlY1(15.0);
        cubica1.setControlX2(-22.4);
        cubica1.setControlY2(-7.8);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //izquierda
        cubica2.setLayoutX(16.0);
        cubica2.setLayoutY(19.0);
        cubica2.setStartX(-3.99);
        cubica2.setStartY(1.2);
        cubica2.setEndX(-5.73);
        cubica2.setEndY(-8.13);
        cubica2.setControlX1(-10.19);
        cubica2.setControlY1(12.6);
        cubica2.setControlX2(-23.8);
        cubica2.setControlY2(-5);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubicas,cubica1,cubica2);
        return fondo;
    }
    public AnchorPane crear_Y(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        CubicCurve cubica4 = new CubicCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        //base derecha media  
        cubicas.setLayoutX(48.0);
        cubicas.setLayoutY(10.0);
        cubicas.setStartX(-15.6);
        cubicas.setStartY(-3.39);
        cubicas.setEndX(-29.6);
        cubicas.setEndY(23.39);
        cubicas.setControlX1(-14.12);
        cubicas.setControlY1(20.0);
        cubicas.setControlX2(-20.79);
        cubicas.setControlY2(31.39);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //base izquierda media
        cubica1.setLayoutX(44.5);
        cubica1.setLayoutY(6.0);
        cubica1.setStartX(-25.5);
        cubica1.setStartY(27.8);
        cubica1.setEndX(-29.39);
        cubica1.setEndY(3.8);
        cubica1.setControlX1(-36.39);
        cubica1.setControlY1(16.8);
        cubica1.setControlX2(-27.8);
        cubica1.setControlY2(9.39);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito izquierdo
        cubica2.setLayoutX(18.5);
        cubica2.setLayoutY(0.5);
        cubica2.setStartX(-8.89);
        cubica2.setStartY(17.90);
        cubica2.setEndX(-3.10);
        cubica2.setEndY(11.3);
        cubica2.setControlX1(-18.5);
        cubica2.setControlY1(17.90);
        cubica2.setControlX2(-5.29);
        cubica2.setControlY2(-4.30);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //inferior derecha
        cubica3.setLayoutX(28.0);
        cubica3.setLayoutY(9.0);
        cubica3.setStartX(-12.0);
        cubica3.setStartY(40.40);
        cubica3.setEndX(4.6);
        cubica3.setEndY(9.0);
        cubica3.setControlX1(-7.0);
        cubica3.setControlY1(45.8);
        cubica3.setControlX2(9.2);
        cubica3.setControlY2(51.0);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(Color.BLACK);
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito inferior
        cubica4.setLayoutX(11.5);
        cubica4.setLayoutY(55.0);
        cubica4.setStartX(4.39);
        cubica4.setStartY(-5.80);
        cubica4.setEndX(9.39);
        cubica4.setEndY(-5.80);
        cubica4.setControlX1(-2.40);
        cubica4.setControlY1(-17.60);
        cubica4.setControlX2(18.79);
        cubica4.setControlY2(-17.60);
        cubica4.setFill(Color.TRANSPARENT);
        cubica4.setStroke(Color.BLACK);
        cubica4.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica4.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubicas,cubica2,cubica1,cubica3,cubica4);
        return fondo;
    }
    public AnchorPane crear_Z(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        //Line lineas = new Line();
        //QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();  
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        
        //central
        cubicas.setLayoutX(32.0);
        cubicas.setLayoutY(22.0);
        cubicas.setStartX(-22.0);
        cubicas.setStartY(26.6);
        cubicas.setEndX(2.39);
        cubicas.setEndY(-12.6);
        cubicas.setControlX1(-13.39);
        cubicas.setControlY1(18.0);
        cubicas.setControlX2(-7.2);
        cubicas.setControlY2(-5.19);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //superior
        cubica1.setLayoutX(43.0);
        cubica1.setLayoutY(24.0);
        cubica1.setStartX(-8.39);
        cubica1.setStartY(-14.80);
        cubica1.setEndX(-36.39);
        cubica1.setEndY(-12.0);
        cubica1.setControlX1(-14.39);
        cubica1.setControlY1(-10.0);
        cubica1.setControlX2(-25.79);
        cubica1.setControlY2(-24.0);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(Color.BLACK);
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito
        cubica2.setLayoutX(16.5);
        cubica2.setLayoutY(17.0);
        cubica2.setStartX(-2.19);
        cubica2.setStartY(-0.19);
        cubica2.setEndX(-5.73);
        cubica2.setEndY(-8.13);
        cubica2.setControlX1(-5.73);
        cubica2.setControlY1(8.8);
        cubica2.setControlX2(-18.39);
        cubica2.setControlY2(-2.39);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(Color.BLACK);
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //inferior 
        cubica3.setLayoutX(32.0);
        cubica3.setLayoutY(30.0);
        cubica3.setStartX(3.60);
        cubica3.setStartY(18.19);
        cubica3.setEndX(-23.19);
        cubica3.setEndY(19.79);
        cubica3.setControlX1(-10.39);
        cubica3.setControlY1(27.0);
        cubica3.setControlX2(-14.79);
        cubica3.setControlY2(13.39);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(Color.BLACK);
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);

        fondo.getChildren().addAll(cubicas);
        return fondo;
    }      
}