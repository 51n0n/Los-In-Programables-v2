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
import static application.Dibujar.getColor;

public class CrearCaracteres {
    
    public AnchorPane crear_A() {
        
        //Objetos
        AnchorPane fondo = new AnchorPane();
        Line linea = new Line();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2= new CubicCurve();
               
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        //Atributos Lineas
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
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        linea.setLayoutX(29.0);
        linea.setLayoutY(27.0);
        linea.setStartX(-12.5);
        linea.setStartY(0);
        linea.setEndX(0);
        linea.setEndY(0);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(getColor());
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        cubica2.setLayoutX(33);
        cubica2.setLayoutY(29);
        cubica2.setStartX(-33);
        cubica2.setStartY(16.39);
        cubica2.setEndX(3.79);
        cubica2.setEndY(-21.95);
        cubica2.setControlX1(-27.60);
        cubica2.setControlY1(38);
        cubica2.setControlX2(-17.39);
        cubica2.setControlY2(-17);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica1,cubica2,linea);
        return fondo;
    }
    public AnchorPane crear_B() {
        
        //Objetos
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        CubicCurve cubica4 = new CubicCurve();
        
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
       
        //Atributos Lineas
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
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
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
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
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
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        cubica4.setLayoutX(4);
        cubica4.setLayoutY(47.5);
        cubica4.setStartX(0.59);
        cubica4.setStartY(-31.3);
        cubica4.setEndX(11.79);
        cubica4.setEndY(-35.5);
        cubica4.setControlX1(-5);
        cubica4.setControlY1(-15.59);
        cubica4.setControlX2(23);
        cubica4.setControlY2(-24.5);
        cubica4.setFill(Color.TRANSPARENT);
        cubica4.setStroke(getColor());
        cubica4.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica4.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica1,cubica2,cubica3,cubica4);
        return fondo;
    }
    public AnchorPane crear_C() {
        
        //Objetos
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();

        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        //Atributos Lineas
        cubica1.setLayoutX(23);
        cubica1.setLayoutY(78);
        cubica1.setStartX(6);
        cubica1.setStartY(-69.59);
        cubica1.setEndX(6.33);
        cubica1.setEndY(-30.79);
        cubica1.setControlX1(-13.39);
        cubica1.setControlY1(-73.19);
        cubica1.setControlX2(-26.39);
        cubica1.setControlY2(-10.19);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        cubica2.setLayoutX(33);
        cubica2.setLayoutY(46);
        cubica2.setStartX(-3.2);
        cubica2.setStartY(1);
        cubica2.setEndX(-11.59);
        cubica2.setEndY(-9.2);
        cubica2.setControlX1(8.19);
        cubica2.setControlY1(-9.2);
        cubica2.setControlX2(-4.8);
        cubica2.setControlY2(-17.8);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        cubica3.setLayoutX(35);
        cubica3.setLayoutY(15);
        cubica3.setStartX(-10.59);
        cubica3.setStartY(-0.39);
        cubica3.setEndX(-5.2);
        cubica3.setEndY(-6.39);
        cubica3.setControlX1(-10.59);
        cubica3.setControlY1(6.59);
        cubica3.setControlX2(3.4);
        cubica3.setControlY2(-1.2);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica1,cubica2,cubica3);
        return fondo;
    }
    public AnchorPane crear_D(){
        //Objetos
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        CubicCurve cubica4 = new CubicCurve();
        
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        //Atributos Lineas
        cubica1.setLayoutX(32);
        cubica1.setLayoutY(35);
        cubica1.setStartX(3.2);
        cubica1.setStartY(-25.8);
        cubica1.setEndX(-20.19);
        cubica1.setEndY(14.59);
        cubica1.setControlX1(-6.8);
        cubica1.setControlY1(-29.8);
        cubica1.setControlX2(-6.8);
        cubica1.setControlY2(14.59);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //guatita
        cubica2.setLayoutX(26);
        cubica2.setLayoutY(30);
        cubica2.setStartX(-1.51);
        cubica2.setStartY(-22.6);
        cubica2.setEndX(-12.19);
        cubica2.setEndY(19);
        cubica2.setControlX1(33.4);
        cubica2.setControlY1(-8);
        cubica2.setControlX2(10.19);
        cubica2.setControlY2(28.19);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        // colita inferior izquierda
        cubica3.setLayoutX(48);
        cubica3.setLayoutY(59);
        cubica3.setStartX(-34.6);
        cubica3.setStartY(-10);
        cubica3.setEndX(-34.6);
        cubica3.setEndY(-10);
        cubica3.setControlX1(-43.19);
        cubica3.setControlY1(-7.4);
        cubica3.setControlX2(-43.19);
        cubica3.setControlY2(-12.59);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //curva superior izquierda
        cubica4.setLayoutX(10);
        cubica4.setLayoutY(42);
        cubica4.setStartX(13.4);
        cubica4.setStartY(-34.76);
        cubica4.setEndX(7);
        cubica4.setEndY(-12.59);
        cubica4.setControlX1(-10);
        cubica4.setControlY1(-39.19);
        cubica4.setControlX2(-10);
        cubica4.setControlY2(-6.8);
        cubica4.setFill(Color.TRANSPARENT);
        cubica4.setStroke(getColor());
        cubica4.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica4.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica1,cubica2,cubica3,cubica4);
        return fondo;
    }
    public AnchorPane crear_E(){
        //Objetos
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        CubicCurve cubica4 = new CubicCurve();
  
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        //PRIMERA inferior izquierda base
        cubica1.setLayoutX(27.0);
        cubica1.setLayoutY(24.0);
        cubica1.setStartX(6.2);
        cubica1.setStartY(19.2);
        cubica1.setEndX(-11.4);
        cubica1.setEndY(2.23);
        cubica1.setControlX1(-14.79);
        cubica1.setControlY1(39.59);
        cubica1.setControlX2(-30.6);
        cubica1.setControlY2(11.59);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //centro union s
        cubica2.setLayoutX(16.0);
        cubica2.setLayoutY(23.0);
        cubica2.setStartX(-0.6);
        cubica2.setStartY(3.23);
        cubica2.setEndX(-0.6);
        cubica2.setEndY(-7.6);
        cubica2.setControlX1(3.79);
        cubica2.setControlY1(-1.0);
        cubica2.setControlX2(-7.79);
        cubica2.setControlY2(3.23);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //curba superior
        cubica3.setLayoutX(15.0);
        cubica3.setLayoutY(24.0);
        cubica3.setStartX(0);
        cubica3.setStartY(-8.2);
        cubica3.setEndX(9.39);
        cubica3.setEndY(-5.8);
        cubica3.setControlX1(12.0);
        cubica3.setControlY1(-23.99);
        cubica3.setControlX2(20.39);
        cubica3.setControlY2(-2);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //colita inferior derecha
        cubica4.setLayoutX(23.0);
        cubica4.setLayoutY(50.0);
        cubica4.setStartX(-0.6);
        cubica4.setStartY(-9.8);
        cubica4.setEndX(9.39);
        cubica4.setEndY(-5.8);
        cubica4.setControlX1(1.0);
        cubica4.setControlY1(-22.93);
        cubica4.setControlX2(17.39);
        cubica4.setControlY2(-13.8);
        cubica4.setFill(Color.TRANSPARENT);
        cubica4.setStroke(getColor());
        cubica4.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica4.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica1,cubica2,cubica3,cubica4);
        return fondo;
    }
    public AnchorPane crear_F(){
       
        //Objetos
        AnchorPane fondo = new AnchorPane();
        Line linea1 = new Line();
        Line linea2 = new Line();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        
        //Atributos del Fondo
        fondo.setPrefHeight(60.0);//y
        fondo.setPrefWidth(45.0);//x
        
        //central
        cubica1.setLayoutX(26.0);
        cubica1.setLayoutY(14.0);
        cubica1.setStartX(-22);
        cubica1.setStartY(32.4);
        cubica1.setEndX(5.2);
        cubica1.setEndY(-3.67);
        cubica1.setControlX1(-1.79);
        cubica1.setControlY1(50.0);
        cubica1.setControlX2(-11.0);
        cubica1.setControlY2(-3.6);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //superior
        cubica2.setLayoutX(36.0);
        cubica2.setLayoutY(26.0);
        cubica2.setStartX(-26.2);
        cubica2.setStartY(-4.59);
        cubica2.setEndX(5.2);
        cubica2.setEndY(-14.6);
        cubica2.setControlX1(-36.0);
        cubica2.setControlY1(-4.59);
        cubica2.setControlX2(-39.79);
        cubica2.setControlY2(-24.39);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //colita superior
        cubica3.setLayoutX(-1.0);
        cubica3.setLayoutY(27.0);
        cubica3.setStartX(8.2);
        cubica3.setStartY(-11.39);
        cubica3.setEndX(11.0);
        cubica3.setEndY(-5.4);
        cubica3.setControlX1(17.0);
        cubica3.setControlY1(-19.32);
        cubica3.setControlX2(19.6);
        cubica3.setControlY2(-5.4);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //linea central
        linea1.setLayoutX(-23.0);
        linea1.setLayoutY(30.0);
        linea1.setStartX(42.8);
        linea1.setStartY(-2.4);
        linea1.setEndX(50.39);
        linea1.setEndY(-2.4);
        linea1.setFill(Color.TRANSPARENT);
        linea1.setStroke(getColor());
        linea1.setStrokeLineCap(StrokeLineCap.ROUND);
        linea1.setStrokeLineJoin(StrokeLineJoin.ROUND);       
        //linea terminal central
        linea2.setLayoutX(-16.0);
        linea2.setLayoutY(30.0);
        linea2.setStartX(44.0);
        linea2.setStartY(-2.4);
        linea2.setEndX(44);
        linea2.setEndY(1.79);
        linea2.setFill(Color.TRANSPARENT);
        linea2.setStroke(getColor());
        linea2.setStrokeLineCap(StrokeLineCap.ROUND);
        linea2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica1,cubica2,cubica3,linea1,linea2);
        return fondo;
    }
    public AnchorPane crear_G(){
        //Objetos
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        lineas.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubicas2.setStroke(getColor());
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
        cubicas3.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubica3.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubica3.setStroke(getColor());
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
        cuadraticas.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //derecho
        cubica2.setLayoutX(62.0);
        cubica2.setLayoutY(14.0);
        cubica2.setStartX(-28.19);
        cubica2.setStartY(35.4);
        cubica2.setEndX(-19.6);
        cubica2.setEndY(-4.2);
        cubica2.setControlX1(-34.6);
        cubica2.setControlY1(13.79);
        cubica2.setControlX2(-30.19);
        cubica2.setControlY2(-18.0);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
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
        cubica3.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //derecho
        cubica2.setLayoutX(62.0);
        cubica2.setLayoutY(14.0);
        cubica2.setStartX(-28.19);
        cubica2.setStartY(35.4);
        cubica2.setEndX(-19.6);
        cubica2.setEndY(-4.2);
        cubica2.setControlX1(-34.6);
        cubica2.setControlY1(13.79);
        cubica2.setControlX2(-30.19);
        cubica2.setControlY2(-18.0);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
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
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        // linea superior
        cubica4.setLayoutX(46.0);
        cubica4.setLayoutY(20.0);
        cubica4.setStartX(-8.39);
        cubica4.setStartY(-14.80);
        cubica4.setEndX(-37.89);
        cubica4.setEndY(-11.53);
        cubica4.setControlX1(-20.39);
        cubica4.setControlY1(-3.80);
        cubica4.setControlX2(-25.19);
        cubica4.setControlY2(-24.0);
        cubica4.setFill(Color.TRANSPARENT);
        cubica4.setStroke(getColor());
        cubica4.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica4.setStrokeLineJoin(StrokeLineJoin.ROUND);
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cachito inferior derecho
        cubica3.setLayoutX(65.5);
        cubica3.setLayoutY(50.0);
        cubica3.setStartX(-31.2);
        cubica3.setStartY(0.8);
        cubica3.setEndX(-43.0);
        cubica3.setEndY(-18.59);
        cubica3.setControlX1(-59.6);
        cubica3.setControlY1(-28.79);
        cubica3.setControlX2(-27.6);
        cubica3.setControlY2(-28.79);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubicas,cubica1,cubica2,cubica3); 
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubica3.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubica3.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cuadraticas.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubica3.setStroke(getColor());
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
        cubica4.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubica3.setStroke(getColor());
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
        cubica4.setStroke(getColor());
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
        cubicas.setStroke(getColor());
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
        cubica1.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);

        fondo.getChildren().addAll(cubicas,cubica1,cubica2,cubica3);
        //PRIMERA 
        return fondo;
    }
        
    
//simbolos
    public AnchorPane crear_Punto(){
        //Objetos
        AnchorPane fondo = new AnchorPane();
        Circle circulo = new Circle();
        
        //Atributos del fondo
        fondo.setPrefSize(22, 60);
        
        //Circulo
        circulo.setRadius(3);
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
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
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
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
        cuadratica.setStroke(getColor());
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
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(6);
        circulo.setLayoutY(34);
        
        //Circulo2
        circulo2.setRadius(3);
        circulo2.setFill(getColor());
        circulo2.setStroke(getColor());
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
        cuadratica.setStroke(getColor());
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
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(6);
        circulo.setLayoutY(34);
        
        //Circulo2
        circulo2.setRadius(3);
        circulo2.setFill(getColor());
        circulo2.setStroke(getColor());
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
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
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
        cuadratica.setStroke(getColor());
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
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(5);
        circulo.setLayoutY(5);
        
        //Circulo2
        circulo2.setRadius(2);
        circulo2.setFill(getColor());
        circulo2.setStroke(getColor());
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
        cuadratica.setStroke(getColor());
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
        cuadratica2.setStroke(getColor());
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
        cubica.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubica.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubica.setStroke(getColor());
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
        cubica.setStroke(getColor());
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
        linea.setStroke(getColor());
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
        linea2.setStroke(getColor());
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
        linea3.setStroke(getColor());
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
        linea.setStroke(getColor());
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
        linea2.setStroke(getColor());
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
        linea3.setStroke(getColor());
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
        cubica.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        cubica.setStroke(getColor());
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
        cubica2.setStroke(getColor());
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
        linea.setStroke(getColor());
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
        linea.setStroke(getColor());
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
        cubica.setLayoutY(59);
        cubica.setStartX(13.33);
        cubica.setStartY(-25.19);
        cubica.setEndX(13.33);
        cubica.setEndY(-5.46);
        cubica.setControlX1(-18.66);
        cubica.setControlY1(-34.79);
        cubica.setControlX2(-18.66);
        cubica.setControlY2(2.53);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea
        linea.setLayoutX(21);
        linea.setLayoutY(25);
        linea.setStartX(3.8);
        linea.setStartY(-13);
        linea.setEndX(3.8);
        linea.setEndY(7.8);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(getColor());
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Circulo
        circulo.setRadius(3);
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(25);
        circulo.setLayoutY(6);
        
        fondo.getChildren().addAll(cubica, linea, circulo);
        return fondo;
    }
    public AnchorPane crear_interrogacionFinal(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        Line linea = new Line();
        Circle circulo = new Circle();
        
        fondo.setPrefSize(34, 60);
        
        //Cubica
        cubica.setLayoutX(-7);
        cubica.setLayoutY(29);
        cubica.setStartX(13.33);
        cubica.setStartY(-24.19);
        cubica.setEndX(13.33);
        cubica.setEndY(-4.46);
        cubica.setControlX1(36.19);
        cubica.setControlY1(-35.93);
        cubica.setControlX2(36.19);
        cubica.setControlY2(4.59);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea
        linea.setLayoutX(2);
        linea.setLayoutY(37);
        linea.setStartX(3.8);
        linea.setStartY(-13);
        linea.setEndX(3.8);
        linea.setEndY(7.8);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(getColor());
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Circulo
        circulo.setRadius(3);
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(6);
        circulo.setLayoutY(51);
        
        fondo.getChildren().addAll(cubica, linea, circulo);
        return fondo;
    }
    public AnchorPane crear_exclamacionInicial(){
        AnchorPane fondo = new AnchorPane();
        QuadCurve cuadratica = new QuadCurve();
        Line linea = new Line();
        Line linea2 = new Line();
        Circle circulo = new Circle();
        
        fondo.setPrefSize(34, 60);
        
        //Cuadratica
        cuadratica.setLayoutX(5);
        cuadratica.setLayoutY(53);
        cuadratica.setStartX(-2.3);
        cuadratica.setStartY(-42.5);
        cuadratica.setEndX(6.3);
        cuadratica.setEndY(-41.5);
        cuadratica.setControlX(1.6);
        cuadratica.setControlY(-47.39);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(getColor());
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea 1
        linea.setLayoutX(0);
        linea.setLayoutY(38);
        linea.setStartX(3.39);
        linea.setStartY(-26.8);
        linea.setEndX(6.09);
        linea.setEndY(10.7);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(getColor());
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea 2
        linea2.setLayoutX(12);
        linea2.setLayoutY(40);
        linea2.setStartX(-1.39);
        linea2.setStartY(-27.8);
        linea2.setEndX(-5.2);
        linea2.setEndY(9);
        linea2.setFill(Color.TRANSPARENT);
        linea2.setStroke(getColor());
        linea2.setStrokeLineCap(StrokeLineCap.ROUND);
        linea2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Circulo
        circulo.setRadius(3);
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(6);
        circulo.setLayoutY(55);
        
        fondo.getChildren().addAll(cuadratica, linea, linea2, circulo);
        return fondo;
    }
    public AnchorPane crear_exclamacionFinal(){
        AnchorPane fondo = new AnchorPane();
        QuadCurve cuadratica = new QuadCurve();
        Line linea = new Line();
        Line linea2 = new Line();
        Circle circulo = new Circle();
        
        fondo.setPrefSize(34, 60);
        
        //Cuadratica
        cuadratica.setLayoutX(5);
        cuadratica.setLayoutY(97);
        cuadratica.setStartX(-3.61);
        cuadratica.setStartY(-43.58);
        cuadratica.setEndX(6.8);
        cuadratica.setEndY(-43.58);
        cuadratica.setControlX(2.2);
        cuadratica.setControlY(-36.59);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(getColor());
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea 1
        linea.setLayoutX(-4);
        linea.setLayoutY(42);
        linea.setStartX(12);
        linea.setStartY(-26.26);
        linea.setEndX(6.09);
        linea.setEndY(10.7);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(getColor());
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea 2
        linea2.setLayoutX(5);
        linea2.setLayoutY(42);
        linea2.setStartX(3.39);
        linea2.setStartY(-26.8);
        linea2.setEndX(6.09);
        linea2.setEndY(10.7);
        linea2.setFill(Color.TRANSPARENT);
        linea2.setStroke(getColor());
        linea2.setStrokeLineCap(StrokeLineCap.ROUND);
        linea2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Circulo
        circulo.setRadius(3);
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(8);
        circulo.setLayoutY(9);
        
        fondo.getChildren().addAll(cuadratica, linea, linea2, circulo);
        return fondo;
    }
   
// minusculas
    public AnchorPane crear_a(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        fondo.setPrefSize(22, 60);
        // superior
        cubica.setLayoutX(38);
        cubica.setLayoutY(43);
        cubica.setStartX(-37.0);
        cubica.setStartY(-7.79);
        cubica.setEndX(-23.79);
        cubica.setEndY(-6.54);
        cubica.setControlX1(-33.39);
        cubica.setControlY1(-21);
        cubica.setControlX2(-22.53);
        cubica.setControlY2(-23.39);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //inferior
        cubica1.setLayoutX(37.0);
        cubica1.setLayoutY(44.0);
        cubica1.setStartX(-36.19);
        cubica1.setStartY(-7.79);
        cubica1.setEndX(-22.76);
        cubica1.setEndY(-7.8);
        cubica1.setControlX1(-38.79);
        cubica1.setControlY1(10.19);
        cubica1.setControlX2(-22.76);
        cubica1.setControlY2(5.17);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        // union
        cubica2.setLayoutX(47.0);
        cubica2.setLayoutY(45.0);
        cubica2.setStartX(-31.81);
        cubica2.setStartY(-20.20);
        cubica2.setEndX(-26.79);
        cubica2.setEndY(-3.59);
        cubica2.setControlX1(-35.2);
        cubica2.setControlY1(7.0);
        cubica2.setControlX2(-29.79);
        cubica2.setControlY2(7.0);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica1,cubica2);
        return fondo;
    }
    public AnchorPane crear_b(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica= new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        fondo.setPrefSize(22,60);
        
        //primerabase
        cubica.setLayoutX(39.0);
        cubica.setLayoutY(42.0);
        cubica.setStartX(-29.79);
        cubica.setStartY(-33.8);
        cubica.setEndX(-27.19);
        cubica.setEndY(6.0);
        cubica.setControlX1(-43.8);
        cubica.setControlY1(2.59);
        cubica.setControlX2(-39.0);
        cubica.setControlY2(10.79);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //curva 
        cubica1.setLayoutX(50);
        cubica1.setLayoutY(60.5);
        cubica1.setStartX(-45.39);
        cubica1.setStartY(-25.3);
        cubica1.setEndX(-38.07);
        cubica1.setEndY(-12.9);
        cubica1.setControlX1(-38.07);
        cubica1.setControlY1(-27.03);
        cubica1.setControlX2(-31.20);
        cubica1.setControlY2(-20.95);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //union
        cubica2.setLayoutX(40.0);
        cubica2.setLayoutY(62.0);
        cubica2.setStartX(-35.0);
        cubica2.setStartY(-26.5);
        cubica2.setEndX(-18.89);
        cubica2.setEndY(-26.5);
        cubica2.setControlX1(-33.5);
        cubica2.setControlY1(-22.09);
        cubica2.setControlX2(-23.51);
        cubica2.setControlY2(-23.59);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);  
        
        fondo.getChildren().addAll(cubica,cubica1,cubica2);
        return fondo;
    }
    public AnchorPane crear_c(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica= new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();   
        fondo.setPrefSize(22,60);
        
        //primerabase
        cubica.setLayoutX(42.0);
        cubica.setLayoutY(44.0);
        cubica.setStartX(-29.60);
        cubica.setStartY(-17.4);
        cubica.setEndX(-37.20);
        cubica.setEndY(2.79);
        cubica.setControlX1(-43.2);
        cubica.setControlY1(-22.0);
        cubica.setControlX2(-45.6);
        cubica.setControlY2(-1.59);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //curva union
        cubica1.setLayoutX(50);
        cubica1.setLayoutY(51.898);
        cubica1.setStartX(-46.39);
        cubica1.setStartY(-5.8);
        cubica1.setEndX(-32);
        cubica1.setEndY(-13.8);
        cubica1.setControlX1(-38.39);
        cubica1.setControlY1(-0.8);
        cubica1.setControlX2(-32.0);
        cubica1.setControlY2(-5.8);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        
        fondo.getChildren().addAll(cubica,cubica1);
        return fondo;   
    
    }
    public AnchorPane crear_d(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        fondo.setPrefSize(22, 60);
        // superior
        cubica.setLayoutX(38.0);
        cubica.setLayoutY(43);
        cubica.setStartX(-37.0);
        cubica.setStartY(-7.79);
        cubica.setEndX(-23.79);
        cubica.setEndY(-6.54);
        cubica.setControlX1(-33.39);
        cubica.setControlY1(-21);
        cubica.setControlX2(-22.53);
        cubica.setControlY2(-23.39);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //inferior
        cubica1.setLayoutX(37.0);
        cubica1.setLayoutY(44.0);
        cubica1.setStartX(-36.19);
        cubica1.setStartY(-7.79);
        cubica1.setEndX(-22.76);
        cubica1.setEndY(-7.8);
        cubica1.setControlX1(-38.79);
        cubica1.setControlY1(10.19);
        cubica1.setControlX2(-22.76);
        cubica1.setControlY2(5.17);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        // union
        cubica2.setLayoutX(57.0);
        cubica2.setLayoutY(55.0);
        cubica2.setStartX(-37.19);
        cubica2.setStartY(-11.8);
        cubica2.setEndX(-37.19);
        cubica2.setEndY(-47.4);
        cubica2.setControlX1(-44.59);
        cubica2.setControlY1(6.0);
        cubica2.setControlX2(-44.59);
        cubica2.setControlY2(-21.4);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica1,cubica2);
        return fondo;
    }
    public AnchorPane crear_e(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica= new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();   
        fondo.setPrefSize(22,60);
        
        //primerabase
        cubica.setLayoutX(42.0);
        cubica.setLayoutY(40.0);
        cubica.setStartX(-39.19);
        cubica.setStartY(-7.8);
        cubica.setEndX(-39.19);
        cubica.setEndY(4.2);
        cubica.setControlX1(-36.39);
        cubica.setControlY1(-24.59);
        cubica.setControlX2(-14.8);
        cubica.setControlY2(-17.79);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //base union
        cubica1.setLayoutX(42.0);
        cubica1.setLayoutY(40.0);
        cubica1.setStartX(-39.19);
        cubica1.setStartY(-7.8);
        cubica1.setEndX(-22.0);
        cubica1.setEndY(-7.8);
        cubica1.setControlX1(-43.39);
        cubica1.setControlY1(12.19);
        cubica1.setControlX2(-24.0);
        cubica1.setControlY2(12.19);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica,cubica1);
        return fondo;   
    }
    //posible f , puede llegar a cambiar por la union
    public AnchorPane crear_f(){   
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica= new CubicCurve();
        CubicCurve cubica1= new CubicCurve();
        CubicCurve cubica2= new CubicCurve();
        fondo.setPrefSize(30,60);
        
        //primera inferior
        cubica.setLayoutX(70.99);
        cubica.setLayoutY(53.0);
        cubica.setStartX(-60.78);
        cubica.setStartY(-14.8);
        cubica.setEndX(-60.78);
        cubica.setEndY(-18.8);
        cubica.setControlX1(-66.18);
        cubica.setControlY1(-64.4);
        cubica.setControlX2(-46.79);
        cubica.setControlY2(-53);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea inferior
        cubica1.setLayoutX(81.0);
        cubica1.setLayoutY(62.0);
        cubica1.setStartX(-68.39);
        cubica1.setStartY(-29.8);
        cubica1.setEndX(-70.6);
        cubica1.setEndY(-26.79);
        cubica1.setControlX1(-51.19);
        cubica1.setControlY1(-13.19);
        cubica1.setControlX2(-74.8);
        cubica1.setControlY2(13.2);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //linea media
        cubica2.setLayoutX(83.2);
        cubica2.setLayoutY(68.5);
        cubica2.setStartX(-57.4);
        cubica2.setStartY(-33.84);
        cubica2.setEndX(-68.6);
        cubica2.setEndY(-33.84);
        cubica2.setControlX1(-82.59);
        cubica2.setControlY1(-26.5);
        cubica2.setControlX2(-76.72);
        cubica2.setControlY2(-46.09);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);       
        fondo.getChildren().addAll(cubica,cubica1,cubica2);
        return fondo; 
    
    }
    public AnchorPane crear_g(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica= new CubicCurve();
        CubicCurve cubica1 = new CubicCurve(); 
        CubicCurve cubica2= new CubicCurve();
        CubicCurve cubica3= new CubicCurve();
        fondo.setPrefSize(22,60);
        //primerabase
        cubica.setLayoutX(38.0);
        cubica.setLayoutY(35.0);
        cubica.setStartX(-36.19);
        cubica.setStartY(-7.79);
        cubica.setEndX(-22.0);
        cubica.setEndY(-7.8);
        cubica.setControlX1(-40.0);
        cubica.setControlY1(7.0);
        cubica.setControlX2(-27.2);
        cubica.setControlY2(7.0);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //curva superior 
        cubica1.setLayoutX(39.0);
        cubica1.setLayoutY(34.0);
        cubica1.setStartX(-37.0);
        cubica1.setStartY(-7.79);
        cubica1.setEndX(-23.39);
        cubica1.setEndY(-5.2);
        cubica1.setControlX1(-34.6);
        cubica1.setControlY1(-19.39);
        cubica1.setControlX2(-20.89);
        cubica1.setControlY2(-22.6);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //curva inferior
        cubica2.setLayoutX(59.0);
        cubica2.setLayoutY(57.0);
        cubica2.setStartX(-58.2);
        cubica2.setStartY(-6.0);
        cubica2.setEndX(-42.6);
        cubica2.setEndY(-36.0);
        cubica2.setControlX1(-55.6);
        cubica2.setControlY1(8.79);
        cubica2.setControlX2(-42.6);
        cubica2.setControlY2(0.4);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND); 
        //union
        cubica3.setLayoutX(63.5);
        cubica3.setLayoutY(69.0);
        cubica3.setStartX(-62.6);
        cubica3.setStartY(-18.2);
        cubica3.setEndX(-42.6);
        cubica3.setEndY(-36.0);
        cubica3.setControlX1(-65.0);
        cubica3.setControlY1(-27.0);
        cubica3.setControlX2(-46.1);
        cubica3.setControlY2(-32.59);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND); 
        
        
        fondo.getChildren().addAll(cubica,cubica1,cubica2,cubica3);
        return fondo; 
    
    }   
    public AnchorPane crear_h(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica= new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();  
        CubicCurve cubica2 = new CubicCurve();
        fondo.setPrefSize(22,60);
        
        //primera 
        cubica.setLayoutX(70.0);
        cubica.setLayoutY(51.0);
        cubica.setStartX(-66.48);
        cubica.setStartY(-1.35);
        cubica.setEndX(-68.4);
        cubica.setEndY(-13.0);
        cubica.setControlX1(-70.79);
        cubica.setControlY1(-63.0);
        cubica.setControlX2(-54.2);
        cubica.setControlY2(-57.4);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //curva superior
        cubica1.setLayoutX(39.0);
        cubica1.setLayoutY(45.0);
        cubica1.setStartX(-36.4);
        cubica1.setStartY(-9.4);
        cubica1.setEndX(-24.39);
        cubica1.setEndY(-5.2);
        cubica1.setControlX1(-34.6);
        cubica1.setControlY1(-19.39);
        cubica1.setControlX2(-19.0);
        cubica1.setControlY2(-22.2);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //union
        cubica2.setLayoutX(80.5);
        cubica2.setLayoutY(72.5);
        cubica2.setStartX(-65.79);
        cubica2.setStartY(-34.02);
        cubica2.setEndX(-58.69);
        cubica2.setEndY(-27.7);
        cubica2.setControlX1(-68.7);
        cubica2.setControlY1(-15.5);
        cubica2.setControlX2(-60.89);
        cubica2.setControlY2(-24.3);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);  
        
        
        
        fondo.getChildren().addAll(cubica,cubica1,cubica2);
        return fondo;     
    
    }
    public AnchorPane crear_i(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica= new CubicCurve();
        Circle circulo = new Circle();
        fondo.setPrefSize(22,60);
        //base
        cubica.setLayoutX(39.0);
        cubica.setLayoutY(45.0);
        cubica.setStartX(-32.0);
        cubica.setStartY(-19.2);
        cubica.setEndX(-19.6);
        cubica.setEndY(-7.8);
        cubica.setControlX1(-39.2);
        cubica.setControlY1(7.0);
        cubica.setControlX2(-19.6);
        cubica.setControlY2(7.0);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Circulo
        circulo.setRadius(1);
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(8);
        circulo.setLayoutY(22);
        fondo.getChildren().addAll(cubica,circulo);
        return fondo; 
    
    }
    public AnchorPane crear_j(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica= new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();   
        Circle circulo = new Circle();
        fondo.setPrefSize(22,60);
        
        //base
        cubica.setLayoutX(76.5);
        cubica.setLayoutY(78.5);
        cubica.setStartX(-61.7);
        cubica.setStartY(-56.7);
        cubica.setEndX(-75.89);
        cubica.setEndY(-29.37);
        cubica.setControlX1(-57.89);
        cubica.setControlY1(-34.09);
        cubica.setControlX2(-78.3);
        cubica.setControlY2(-8.69);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //union
        cubica1.setLayoutX(28.5);
        cubica1.setLayoutY(50.0);
        cubica1.setStartX(-27.7);
        cubica1.setStartY(-1.8);
        cubica1.setEndX(-7.7);
        cubica1.setEndY(-17.0);
        cubica1.setControlX1(-24.89);
        cubica1.setControlY1(-17.0);
        cubica1.setControlX2(-13.29);
        cubica1.setControlY2(-3.8);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //Circulo
        circulo.setRadius(1);
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(14);
        circulo.setLayoutY(13);
        
        
        fondo.getChildren().addAll(cubica,cubica1,circulo);
        return fondo; 
    
    }
    public AnchorPane crear_k(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica= new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve(); 
        fondo.setPrefSize(22,60);
        
        // lateral
        cubica.setLayoutX(77.0);
        cubica.setLayoutY(50.0);
        cubica.setStartX(-66.6);
        cubica.setStartY(-1.0);
        cubica.setEndX(-70.79);
        cubica.setEndY(-5.8);
        cubica.setControlX1(-70.79);
        cubica.setControlY1(-63.0);
        cubica.setControlX2(-54.2);
        cubica.setControlY2(-57.4);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //superior
        cubica1.setLayoutX(46.0);
        cubica1.setLayoutY(44.0);
        cubica1.setStartX(-36.4);
        cubica1.setStartY(-8.4);
        cubica1.setEndX(-36.4);
        cubica1.setEndY(-5.8);
        cubica1.setControlX1(-28.39);
        cubica1.setControlY1(-31.8);
        cubica1.setControlX2(-13.8);
        cubica1.setControlY2(-5.8);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //inferior union
        cubica2.setLayoutX(89.5);
        cubica2.setLayoutY(72.5);
        cubica2.setStartX(-75.03);
        cubica2.setStartY(-34.9);
        cubica2.setEndX(-63.09);
        cubica2.setEndY(-23.9);
        cubica2.setControlX1(-60.0);
        cubica2.setControlY1(-36.9);
        cubica2.setControlX2(-71.5);
        cubica2.setControlY2(-2.03);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);    
        fondo.getChildren().addAll(cubica,cubica1,cubica2);
        return fondo; 
    
    }  
    public AnchorPane crear_l(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        QuadCurve cuadratica = new QuadCurve();
        
        fondo.setPrefSize(22, 60);
        
        //Cubica
        cubica.setLayoutX(10);
        cubica.setLayoutY(30);
        cubica.setStartX(-10);
        cubica.setStartY(28.19);
        cubica.setEndX(0.99);
        cubica.setEndY(-26.8);
        cubica.setControlX1(0.99);
        cubica.setControlY1(24.79);
        cubica.setControlX2(0.99);
        cubica.setControlY2(24.79);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cuadratica
        cuadratica.setLayoutX(11);
        cuadratica.setLayoutY(60);
        cuadratica.setStartX(-2.2);
        cuadratica.setStartY(-6.4);
        cuadratica.setEndX(9.4);
        cuadratica.setEndY(-27.4);
        cuadratica.setControlX(5.99);
        cuadratica.setControlY(3.19);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(getColor());
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cuadratica);
        return fondo;
    }
    public AnchorPane crear_m(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        QuadCurve cuadratica = new QuadCurve();
        
        fondo.setPrefSize(45, 60);
        
        //Cubica
        cubica.setLayoutX(16);
        cubica.setLayoutY(25);
        cubica.setStartX(-6);
        cubica.setStartY(29.59);
        cubica.setEndX(-16);
        cubica.setEndY(5);
        cubica.setControlX1(-6);
        cubica.setControlY1(-40.59);
        cubica.setControlX2(-6);
        cubica.setControlY2(41.19);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 2
        cubica2.setLayoutX(15);
        cubica2.setLayoutY(38);
        cubica2.setStartX(-4.59);
        cubica2.setStartY(-0.59);
        cubica2.setEndX(7.8);
        cubica2.setEndY(9.79);
        cubica2.setControlX1(-2.8);
        cubica2.setControlY1(-12.59);
        cubica2.setControlX2(7.8);
        cubica2.setControlY2(-11);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 3
        cubica3.setLayoutX(21);
        cubica3.setLayoutY(26);
        cubica3.setStartX(1.19);
        cubica3.setStartY(11.40);
        cubica3.setEndX(15);
        cubica3.setEndY(27.19);
        cubica3.setControlX1(6.19);
        cubica3.setControlY1(-5);
        cubica3.setControlX2(15);
        cubica3.setControlY2(7.59);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cuadratica
        cuadratica.setLayoutX(33);
        cuadratica.setLayoutY(66);
        cuadratica.setStartX(11.19);
        cuadratica.setStartY(-35.59);
        cuadratica.setEndX(2.4);
        cuadratica.setEndY(-12.8);
        cuadratica.setControlX(5.8);
        cuadratica.setControlY(-7);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(getColor());
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2, cubica3, cuadratica);
        return fondo;
    }
    public AnchorPane crear_n(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        QuadCurve cuadratica = new QuadCurve();
        
        fondo.setPrefSize(34, 60);
        
        //Cubica
        cubica.setLayoutX(16);
        cubica.setLayoutY(25);
        cubica.setStartX(-6);
        cubica.setStartY(29.59);
        cubica.setEndX(-16);
        cubica.setEndY(5);
        cubica.setControlX1(-6);
        cubica.setControlY1(-40.59);
        cubica.setControlX2(-6);
        cubica.setControlY2(41.19);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 2
        cubica2.setLayoutX(9);
        cubica2.setLayoutY(23);
        cubica2.setStartX(1.19);
        cubica2.setStartY(11.4);
        cubica2.setEndX(15.4);
        cubica2.setEndY(27);
        cubica2.setControlX1(6.19);
        cubica2.setControlY1(-5);
        cubica2.setControlX2(15);
        cubica2.setControlY2(7.59);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cuadratica
        cuadratica.setLayoutX(22);
        cuadratica.setLayoutY(64);
        cuadratica.setStartX(11.8);
        cuadratica.setStartY(-34.4);
        cuadratica.setEndX(2.4);
        cuadratica.setEndY(-12.8);
        cuadratica.setControlX(5.8);
        cuadratica.setControlY(-7);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(getColor());
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2, cuadratica);
        return fondo;
    }
    public AnchorPane crear_ñ(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        QuadCurve cuadratica = new QuadCurve();
        
        fondo.setPrefSize(34, 60);
        
        //Cubica
        cubica.setLayoutX(16);
        cubica.setLayoutY(25);
        cubica.setStartX(-6);
        cubica.setStartY(29.59);
        cubica.setEndX(-16);
        cubica.setEndY(5);
        cubica.setControlX1(-6);
        cubica.setControlY1(-40.59);
        cubica.setControlX2(-6);
        cubica.setControlY2(41.19);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 2
        cubica2.setLayoutX(9);
        cubica2.setLayoutY(23);
        cubica2.setStartX(1.19);
        cubica2.setStartY(11.4);
        cubica2.setEndX(15.4);
        cubica2.setEndY(27);
        cubica2.setControlX1(6.19);
        cubica2.setControlY1(-5);
        cubica2.setControlX2(15);
        cubica2.setControlY2(7.59);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cuadratica
        cuadratica.setLayoutX(22);
        cuadratica.setLayoutY(64);
        cuadratica.setStartX(11.8);
        cuadratica.setStartY(-34.4);
        cuadratica.setEndX(2.4);
        cuadratica.setEndY(-12.8);
        cuadratica.setControlX(5.8);
        cuadratica.setControlY(-7);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(getColor());
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 3
        cubica3.setLayoutX(36);
        cubica3.setLayoutY(35);
        cubica3.setStartX(-26.39);
        cubica3.setStartY(-14.2);
        cubica3.setEndX(-10.99);
        cubica3.setEndY(-14.2);
        cubica3.setControlX1(-17.4);
        cubica3.setControlY1(-27.8);
        cubica3.setControlX2(-17.4);
        cubica3.setControlY2(-4.59);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2, cubica3, cuadratica);
        return fondo;
    }
    public AnchorPane crear_o(){
    AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        fondo.setPrefSize(22, 60);
        // base
        cubica.setLayoutX(37);
        cubica.setLayoutY(43);
        cubica.setStartX(-37.06);
        cubica.setStartY(-7.8);
        cubica.setEndX(-20.9);
        cubica.setEndY(-7.8);
        cubica.setControlX1(-38.79);
        cubica.setControlY1(10.19);
        cubica.setControlX2(-20.9);
        cubica.setControlY2(8.0);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //superior
        cubica1.setLayoutX(37.0);
        cubica1.setLayoutY(42.0);
        cubica1.setStartX(-37.0);
        cubica1.setStartY(-7.79);
        cubica1.setEndX(-20.89);
        cubica1.setEndY(-6.9);
        cubica1.setControlX1(-34.8);
        cubica1.setControlY1(-23.39);
        cubica1.setControlX2(-19.6);
        cubica1.setControlY2(-23.39);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //union
        cubica2.setLayoutX(44.0);
        cubica2.setLayoutY(51.0);
        cubica2.setStartX(-41.6);
        cubica2.setStartY(-24.0);
        cubica2.setEndX(-23.59);
        cubica2.setEndY(-19.8);
        cubica2.setControlX1(-38.9);
        cubica2.setControlY1(-15.88);
        cubica2.setControlX2(-31.8);
        cubica2.setControlY2(-12.4);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubica, cubica1,cubica2);
        return fondo;
    }
    public AnchorPane crear_p(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        
        fondo.setPrefSize(34, 60);
        
        //Cubica
        cubica.setLayoutX(16);
        cubica.setLayoutY(25);
        cubica.setStartX(-6);
        cubica.setStartY(29.59);
        cubica.setEndX(-16);
        cubica.setEndY(5);
        cubica.setControlX1(-6);
        cubica.setControlY1(-48.59);
        cubica.setControlX2(-6);
        cubica.setControlY2(41.19);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 2
        cubica2.setLayoutX(13);
        cubica2.setLayoutY(25);
        cubica2.setStartX(-3);
        cubica2.setStartY(0.59);
        cubica2.setEndX(0.39);
        cubica2.setEndY(14.59);
        cubica2.setControlX1(2.4);
        cubica2.setControlY1(-13.4);
        cubica2.setControlX2(21.39);
        cubica2.setControlY2(9.19);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 3
        cubica3.setLayoutX(24);
        cubica3.setLayoutY(38);
        cubica3.setStartX(-10.59);
        cubica3.setStartY(1);
        cubica3.setEndX(8.4);
        cubica3.setEndY(-6.59);
        cubica3.setControlX1(0.054);
        cubica3.setControlY1(-10.59);
        cubica3.setControlX2(-4.59);
        cubica3.setControlY2(12.79);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2, cubica3);
        return fondo;
    }
    public AnchorPane crear_q(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        QuadCurve cuadratica = new QuadCurve();
        
        fondo.setPrefSize(34, 60);
        
        //Cubica
        cubica.setLayoutX(13);
        cubica.setLayoutY(27);
        cubica.setStartX(8);
        cubica.setStartY(-1);
        cubica.setEndX(8);
        cubica.setEndY(10.06);
        cubica.setControlX1(-7.6);
        cubica.setControlY1(-15.8);
        cubica.setControlX2(-11.6);
        cubica.setControlY2(24.4);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 2
        cubica2.setLayoutX(28);
        cubica2.setLayoutY(25);
        cubica2.setStartX(-6);
        cubica2.setStartY(29.59);
        cubica2.setEndX(4.39);
        cubica2.setEndY(6.19);
        cubica2.setControlX1(-6);
        cubica2.setControlY1(-48.59);
        cubica2.setControlX2(-6);
        cubica2.setControlY2(41.19);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cuadratica
        cuadratica.setLayoutX(7);
        cuadratica.setLayoutY(62);
        cuadratica.setStartX(3.79);
        cuadratica.setStartY(-22.4);
        cuadratica.setEndX(-7);
        cuadratica.setEndY(-30.4);
        cuadratica.setControlX(-3);
        cuadratica.setControlY(-9.8);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(getColor());
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2, cuadratica);
        return fondo;
    }
    public AnchorPane crear_r(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        
        fondo.setPrefSize(34, 60);
        
        //Cubica
        cubica.setLayoutX(17);
        cubica.setLayoutY(25);
        cubica.setStartX(-6);
        cubica.setStartY(18.19);
        cubica.setEndX(-16);
        cubica.setEndY(5);
        cubica.setControlX1(-6);
        cubica.setControlY1(-48.59);
        cubica.setControlX2(-6);
        cubica.setControlY2(41.19);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 2
        cubica2.setLayoutX(18);
        cubica2.setLayoutY(38);
        cubica2.setStartX(-7);
        cubica2.setStartY(-8.8);
        cubica2.setEndX(13.2);
        cubica2.setEndY(-8.8);
        cubica2.setControlX1(13.2);
        cubica2.setControlY1(-35);
        cubica2.setControlX2(-7);
        cubica2.setControlY2(13);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2);
        return fondo;
    }
    public AnchorPane crear_s(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        
        fondo.setPrefSize(34, 60);
        
        //Cubica
        cubica.setLayoutX(15);
        cubica.setLayoutY(30);
        cubica.setStartX(-1);
        cubica.setStartY(2.79);
        cubica.setEndX(4.7);
        cubica.setEndY(-5.4);
        cubica.setControlX1(-23.79);
        cubica.setControlY1(-9.8);
        cubica.setControlX2(1.79);
        cubica.setControlY2(-16);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 2
        cubica2.setLayoutX(59);
        cubica2.setLayoutY(9);
        cubica2.setStartX(-47.6);
        cubica2.setStartY(44.5);
        cubica2.setEndX(-45);
        cubica2.setEndY(23.59);
        cubica2.setControlX1(-35.39);
        cubica2.setControlY1(48.08);
        cubica2.setControlX2(-11.79);
        cubica2.setControlY2(30.79);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 3
        cubica3.setLayoutX(0);
        cubica3.setLayoutY(67);
        cubica3.setStartX(11.59);
        cubica3.setStartY(-13.4);
        cubica3.setEndX(7.2);
        cubica3.setEndY(-23.59);
        cubica3.setControlX1(0);
        cubica3.setControlY1(-13.4);
        cubica3.setControlX2(0);
        cubica3.setControlY2(-23.59);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2, cubica3);
        return fondo;
    }
    public AnchorPane crear_t(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        QuadCurve cuadratica = new QuadCurve();
        Line linea = new Line();
        
        fondo.setPrefSize(22, 60);
        
        //Cubica
        cubica.setLayoutX(10);
        cubica.setLayoutY(30);
        cubica.setStartX(-10);
        cubica.setStartY(28.19);
        cubica.setEndX(0.99);
        cubica.setEndY(-26.8);
        cubica.setControlX1(0.99);
        cubica.setControlY1(24.79);
        cubica.setControlX2(0.99);
        cubica.setControlY2(24.79);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cuadratica
        cuadratica.setLayoutX(11);
        cuadratica.setLayoutY(60);
        cuadratica.setStartX(-2.2);
        cuadratica.setStartY(-6.4);
        cuadratica.setEndX(9.4);
        cuadratica.setEndY(-27.4);
        cuadratica.setControlX(5.99);
        cuadratica.setControlY(3.19);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(getColor());
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea
        linea.setLayoutX(9);
        linea.setLayoutY(23);
        linea.setStartX(-6);
        linea.setStartY(-7.62);
        linea.setEndX(7.79);
        linea.setEndY(-7.72);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(getColor());
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cuadratica, linea);
        return fondo;
    }
    public AnchorPane crear_u(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica= new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();   
        fondo.setPrefSize(22,60);
        //primerabase
        cubica.setLayoutX(38.0);
        cubica.setLayoutY(40.0);
        cubica.setStartX(-38.0);
        cubica.setStartY(-16.4);
        cubica.setEndX(-23.8);
        cubica.setEndY(-16.4);
        cubica.setControlX1(-40.2);
        cubica.setControlY1(16.0);
        cubica.setControlX2(-23.8);
        cubica.setControlY2(16.0);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        // union 
        cubica1.setLayoutX(47);
        cubica1.setLayoutY(56);
        cubica1.setStartX(-32.8);
        cubica1.setStartY(-31.4);
        cubica1.setEndX(-26.39);
        cubica1.setEndY(-15.59);
        cubica1.setControlX1(-35.39);
        cubica1.setControlY1(-7.75);
        cubica1.setControlX2(-30.39);
        cubica1.setControlY2(-3.2);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);  
        
        
        
        fondo.getChildren().addAll(cubica,cubica1);
        return fondo; 
            
    }
    public AnchorPane crear_w(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        
        fondo.setPrefSize(45, 60);
        
        //Cubica
        cubica.setLayoutX(11);
        cubica.setLayoutY(33);
        cubica.setStartX(-11);
        cubica.setStartY(12.4);
        cubica.setEndX(-3);
        cubica.setEndY(-8);
        cubica.setControlX1(-8.59);
        cubica.setControlY1(31.4);
        cubica.setControlX2(-3);
        cubica.setControlY2(31.4);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 2
        cubica2.setLayoutX(30);
        cubica2.setLayoutY(33);
        cubica2.setStartX(-22.8);
        cubica2.setStartY(17.2);
        cubica2.setEndX(-6.19);
        cubica2.setEndY(0.8);
        cubica2.setControlX1(-21);
        cubica2.setControlY1(25.24);
        cubica2.setControlX2(-3);
        cubica2.setControlY2(25.24);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 3
        cubica3.setLayoutX(45);
        cubica3.setLayoutY(33);
        cubica3.setStartX(-23);
        cubica3.setStartY(15.6);
        cubica3.setEndX(-6.19);
        cubica3.setEndY(-8.59);
        cubica3.setControlX1(-20.8);
        cubica3.setControlY1(28.6);
        cubica3.setControlX2(1.6);
        cubica3.setControlY2(23.8);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2, cubica3);
        return fondo;
    }
    public AnchorPane crear_v(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        fondo.setPrefSize(32, 60);
        
        //Cubica base
        cubica.setLayoutX(16.9);
        cubica.setLayoutY(23.5);
        cubica.setStartX(-10.19);
        cubica.setStartY(3.8);
        cubica.setEndX(2.19);
        cubica.setEndY(3.8);
        cubica.setControlX1(-6.4);
        cubica.setControlY1(48.8);
        cubica.setControlX2(5.19);
        cubica.setControlY2(11.8);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //union primera
        cubica1.setLayoutX(68.5);
        cubica1.setLayoutY(62.5);
        cubica1.setStartX(-61.84);
        cubica1.setStartY(-33.84);
        cubica1.setEndX(-69);
        cubica1.setEndY(-31.8);
        cubica1.setControlX1(-61.84);
        cubica1.setControlY1(-41.8);
        cubica1.setControlX2(-66.39);
        cubica1.setControlY2(-41.8);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //union final
        cubica2.setLayoutX(87.2);
        cubica2.setLayoutY(60.5);
        cubica2.setStartX(-58.19);
        cubica2.setStartY(-35.8);
        cubica2.setEndX(-68.6);
        cubica2.setEndY(-33.84);
        cubica2.setControlX1(-83.97);
        cubica2.setControlY1(-30.19);
        cubica2.setControlX2(-76.59);
        cubica2.setControlY2(-44.8);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubica,cubica1,cubica2);
        return fondo;
    }
    public AnchorPane crear_x(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        
        fondo.setPrefSize(34, 60);
        
        //Cubica
        cubica.setLayoutX(18);
        cubica.setLayoutY(36);
        cubica.setStartX(12.19);
        cubica.setStartY(20.19);
        cubica.setEndX(-16.19);
        cubica.setEndY(-12);
        cubica.setControlX1(-18.19);
        cubica.setControlY1(22.56);
        cubica.setControlX2(12.19);
        cubica.setControlY2(-12);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 2
        cubica2.setLayoutX(9);
        cubica2.setLayoutY(42);
        cubica2.setStartX(-8.19);
        cubica2.setStartY(14.56);
        cubica2.setEndX(20.19);
        cubica2.setEndY(-18);
        cubica2.setControlX1(22.26);
        cubica2.setControlY1(14.56);
        cubica2.setControlX2(-9);
        cubica2.setControlY2(-18);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2);
        return fondo;
    }
    public AnchorPane crear_y(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        CubicCurve cubica3 = new CubicCurve();
        
        fondo.setPrefSize(34, 60);
        
        //Cubica
        cubica.setLayoutX(11);
        cubica.setLayoutY(12);
        cubica.setStartX(-8.59);
        cubica.setStartY(16.8);
        cubica.setEndX(-3);
        cubica.setEndY(9.19);
        cubica.setControlX1(-8.59);
        cubica.setControlY1(31.4);
        cubica.setControlX2(-3);
        cubica.setControlY2(31.4);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 2
        cubica2.setLayoutX(29);
        cubica2.setLayoutY(12);
        cubica2.setStartX(-21);
        cubica2.setStartY(17.6);
        cubica2.setEndX(-3.79);
        cubica2.setEndY(9.4);
        cubica2.setControlX1(-16.39);
        cubica2.setControlY1(31.4);
        cubica2.setControlX2(-3.79);
        cubica2.setControlY2(31.4);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 3
        cubica3.setLayoutX(17);
        cubica3.setLayoutY(43);
        cubica3.setStartX(-8.39);
        cubica3.setStartY(5.8);
        cubica3.setEndX(7.59);
        cubica3.setEndY(-15);
        cubica3.setControlX1(4);
        cubica3.setControlY1(20.39);
        cubica3.setControlX2(7.59);
        cubica3.setControlY2(17);
        cubica3.setFill(Color.TRANSPARENT);
        cubica3.setStroke(getColor());
        cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2, cubica3);
        return fondo;
    }
    public AnchorPane crear_z(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        Line linea = new Line ();
        
        fondo.setPrefSize(34, 60);
        
        //Cubica
        cubica.setLayoutX(14);
        cubica.setLayoutY(32);
        cubica.setStartX(-13.7);
        cubica.setStartY(-1.59);
        cubica.setEndX(17.48);
        cubica.setEndY(-8.39);
        cubica.setControlX1(4.8);
        cubica.setControlY1(-11.4);
        cubica.setControlX2(-3);
        cubica.setControlY2(2);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cubica 2
        cubica2.setLayoutX(15);
        cubica2.setLayoutY(62);
        cubica2.setStartX(-14);
        cubica2.setStartY(-8.39);
        cubica2.setEndX(14.79);
        cubica2.setEndY(-11.39);
        cubica2.setControlX1(8.79);
        cubica2.setControlY1(-19);
        cubica2.setControlX2(3);
        cubica2.setControlY2(2.6);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea
        linea.setLayoutX(16);
        linea.setLayoutY(39);
        linea.setStartX(-15);
        linea.setStartY(14.8);
        linea.setEndX(14.78);
        linea.setEndY(-14.84);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(getColor());
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubica, cubica2, linea);
        return fondo;
    }
}