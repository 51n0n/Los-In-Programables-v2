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
import javafx.scene.shape.Ellipse;

public class CrearCaracteres {
    
    Dibujar dibujar = new Dibujar();
            
    public AnchorPane dibujarCaracter(char caracter, Palabra palabra){
        
        AnchorPane fondo = new AnchorPane();
        
        switch (caracter){
            case 'A':
                //Objetos
                Line lineaA = new Line(-12.5,0,0,0);
                CubicCurve cubicaA1 = new CubicCurve(-1.2,4.79,-11.6,11.39,-14.39,-14.2,-4.88,-35.8);
                CubicCurve cubicaA2= new CubicCurve(-33,16.39,-27.60,38,-17.39,-17,3.79,-21.95);
                
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                
                //Atributos Lineas
                cubicaA1.setLayoutX(41);
                cubicaA1.setLayoutY(44);
                cubicaA1.setFill(Color.TRANSPARENT);
                cubicaA1.setStroke(dibujar.getColor());
                cubicaA1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaA1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                lineaA.setLayoutX(29.0);
                lineaA.setLayoutY(27.0);
                lineaA.setFill(Color.TRANSPARENT);
                lineaA.setStroke(dibujar.getColor());
                lineaA.setStrokeLineCap(StrokeLineCap.ROUND);
                lineaA.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                cubicaA2.setLayoutX(33);
                cubicaA2.setLayoutY(29);
                cubicaA2.setFill(Color.TRANSPARENT);
                cubicaA2.setStroke(dibujar.getColor());
                cubicaA2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaA2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    cubicaA1.setRotate(7);
                    cubicaA2.setRotate(7);
                    lineaA.setRotate(7);
                }
                
                if (palabra.isN()){
                    
                    CubicCurve anchoA1 = new CubicCurve(cubicaA1.getStartX(),cubicaA1.getStartY(),cubicaA1.getControlX1(),cubicaA1.getControlY1(),cubicaA1.getControlX2(),cubicaA1.getControlY2(),cubicaA1.getEndX(),cubicaA1.getEndY());
                    anchoA1.setLayoutX(41);
                    anchoA1.setLayoutY(44);
                    anchoA1.setFill(Color.TRANSPARENT);
                    anchoA1.setStroke(dibujar.getColor());
                    anchoA1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoA1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoA1.setTranslateX(1);
                    
                    CubicCurve anchoA2 = new CubicCurve(cubicaA1.getStartX(),cubicaA1.getStartY(),cubicaA1.getControlX1(),cubicaA1.getControlY1(),cubicaA1.getControlX2(),cubicaA1.getControlY2(),cubicaA1.getEndX(),cubicaA1.getEndY());
                    anchoA2.setLayoutX(41);
                    anchoA2.setLayoutY(44);
                    anchoA2.setFill(Color.TRANSPARENT);
                    anchoA2.setStroke(dibujar.getColor());
                    anchoA2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoA2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoA2.setTranslateY(1);
                    
                    CubicCurve anchoA3 = new CubicCurve(cubicaA2.getStartX(),cubicaA2.getStartY(),cubicaA2.getControlX1(),cubicaA2.getControlY1(),cubicaA2.getControlX2(),cubicaA2.getControlY2(),cubicaA2.getEndX(),cubicaA2.getEndY());
                    anchoA3.setLayoutX(33);
                    anchoA3.setLayoutY(29);
                    anchoA3.setFill(Color.TRANSPARENT);
                    anchoA3.setStroke(dibujar.getColor());
                    anchoA3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoA3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoA3.setTranslateX(1);
                    
                    CubicCurve anchoA4 = new CubicCurve(cubicaA2.getStartX(),cubicaA2.getStartY(),cubicaA2.getControlX1(),cubicaA2.getControlY1(),cubicaA2.getControlX2(),cubicaA2.getControlY2(),cubicaA2.getEndX(),cubicaA2.getEndY());
                    anchoA4.setLayoutX(33);
                    anchoA4.setLayoutY(29);
                    anchoA4.setFill(Color.TRANSPARENT);
                    anchoA4.setStroke(dibujar.getColor());
                    anchoA4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoA4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoA4.setTranslateY(1);
                    
                    Line anchoA5 = new Line(lineaA.getStartX(),lineaA.getStartY(),lineaA.getEndX(),lineaA.getEndY());
                    anchoA5.setLayoutX(29.0);
                    anchoA5.setLayoutY(27.0);
                    anchoA5.setFill(Color.TRANSPARENT);
                    anchoA5.setStroke(dibujar.getColor());
                    anchoA5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoA5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoA5.setTranslateX(1);
                    
                    Line anchoA6 = new Line(lineaA.getStartX(),lineaA.getStartY(),lineaA.getEndX(),lineaA.getEndY());
                    anchoA6.setLayoutX(29.0);
                    anchoA6.setLayoutY(27.0);
                    anchoA6.setFill(Color.TRANSPARENT);
                    anchoA6.setStroke(dibujar.getColor());
                    anchoA6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoA6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoA6.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoA1,anchoA2,anchoA3,anchoA4,anchoA5,anchoA6);
                    
                }
                
                if (palabra.isS()){
                    
                }
                
                if (dibujar.getControl()){
                    Circle pA1 = new Circle(cubicaA1.getStartX(),cubicaA1.getStartY(),2,Color.RED);
                    pA1.setLayoutX(41);
                    pA1.setLayoutY(44);
                    Circle pA2 = new Circle(cubicaA1.getControlX1(),cubicaA1.getControlY1(),2,Color.RED);
                    pA2.setLayoutX(41);
                    pA2.setLayoutY(44);
                    Circle pA3 = new Circle(cubicaA1.getControlX2(),cubicaA1.getControlY2(),2,Color.RED);
                    pA3.setLayoutX(41);
                    pA3.setLayoutY(44);
                    Circle pA4 = new Circle(cubicaA1.getEndX(),cubicaA1.getEndY(),2,Color.RED);
                    pA4.setLayoutX(41);
                    pA4.setLayoutY(44);
                    Circle pA5 = new Circle(cubicaA2.getStartX(),cubicaA2.getStartY(),2,Color.RED);
                    pA5.setLayoutX(33);
                    pA5.setLayoutY(29);
                    Circle pA6 = new Circle(cubicaA2.getControlX1(),cubicaA2.getControlY1(),2,Color.RED);
                    pA6.setLayoutX(33);
                    pA6.setLayoutY(29);
                    Circle pA7 = new Circle(cubicaA2.getControlX2(),cubicaA2.getControlY2(),2,Color.RED);
                    pA7.setLayoutX(33);
                    pA7.setLayoutY(29);
                    Circle pA8 = new Circle(cubicaA2.getEndX(),cubicaA2.getEndY(),2,Color.RED);
                    pA8.setLayoutX(33);
                    pA8.setLayoutY(29);
                    Circle pA9 = new Circle(lineaA.getStartX(),lineaA.getStartY(),2,Color.RED);
                    pA9.setLayoutX(29.0);
                    pA9.setLayoutY(27.0);
                    Circle pA10 = new Circle(lineaA.getEndX(),lineaA.getEndY(),2,Color.RED);
                    pA10.setLayoutX(29.0);
                    pA10.setLayoutY(27.0);
                    
                    fondo.getChildren().addAll(pA1,pA2,pA3,pA4,pA5,pA6,pA7,pA8,pA9,pA10);
                }
                
                fondo.getChildren().addAll(cubicaA1,cubicaA2,lineaA);
                return fondo;
            case 'B':
                CubicCurve cubicaB1 = new CubicCurve();
                CubicCurve cubicaB2 = new CubicCurve();
                CubicCurve cubicaB3 = new CubicCurve();
                CubicCurve cubicaB4 = new CubicCurve();

                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x

                //Atributos Lineas
                cubicaB1.setLayoutX(25.0);
                cubicaB1.setLayoutY(33.0);
                cubicaB1.setStartX(-16.6);
                cubicaB1.setStartY(17.0);
                cubicaB1.setEndX(11.19);
                cubicaB1.setEndY(-24.8);
                cubicaB1.setControlX1(0.19);
                cubicaB1.setControlY1(23.4);
                cubicaB1.setControlX2(-6.8);
                cubicaB1.setControlY2(-33.0);
                cubicaB1.setFill(Color.TRANSPARENT);
                cubicaB1.setStroke(dibujar.getColor());
                cubicaB1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaB1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //
                cubicaB2.setLayoutX(30);
                cubicaB2.setLayoutY(21);
                cubicaB2.setStartX(-25.84);
                cubicaB2.setStartY(-3.8);
                cubicaB2.setEndX(-1.1);
                cubicaB2.setEndY(7.8);
                cubicaB2.setControlX1(-21.99);
                cubicaB2.setControlY1(-22.99);
                cubicaB2.setControlX2(27.19);
                cubicaB2.setControlY2(-7.6);
                cubicaB2.setFill(Color.TRANSPARENT);
                cubicaB2.setStroke(dibujar.getColor());
                cubicaB2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaB2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //
                cubicaB3.setLayoutX(37);
                cubicaB3.setLayoutY(38);
                cubicaB3.setStartX(-17.4);
                cubicaB3.setStartY(8.79);
                cubicaB3.setEndX(-8);
                cubicaB3.setEndY(-9);
                cubicaB3.setControlX1(-4);
                cubicaB3.setControlY1(22.59);
                cubicaB3.setControlX2(16.4);
                cubicaB3.setControlY2(-1.8);
                cubicaB3.setFill(Color.TRANSPARENT);
                cubicaB3.setStroke(dibujar.getColor());
                cubicaB3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaB3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //
                cubicaB4.setLayoutX(4);
                cubicaB4.setLayoutY(47.5);
                cubicaB4.setStartX(0.59);
                cubicaB4.setStartY(-31.3);
                cubicaB4.setEndX(11.79);
                cubicaB4.setEndY(-35.5);
                cubicaB4.setControlX1(-5);
                cubicaB4.setControlY1(-15.59);
                cubicaB4.setControlX2(23);
                cubicaB4.setControlY2(-24.5);
                cubicaB4.setFill(Color.TRANSPARENT);
                cubicaB4.setStroke(dibujar.getColor());
                cubicaB4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaB4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicaB1,cubicaB2,cubicaB3,cubicaB4);
                
                return fondo;
            case 'C':
                CubicCurve cubicaC1 = new CubicCurve();
                CubicCurve cubicaC2 = new CubicCurve();
                CubicCurve cubicaC3 = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //Atributos Lineas
                cubicaC1.setLayoutX(23);
                cubicaC1.setLayoutY(78);
                cubicaC1.setStartX(6);
                cubicaC1.setStartY(-69.59);
                cubicaC1.setEndX(6.33);
                cubicaC1.setEndY(-30.79);
                cubicaC1.setControlX1(-13.39);
                cubicaC1.setControlY1(-73.19);
                cubicaC1.setControlX2(-26.39);
                cubicaC1.setControlY2(-10.19);
                cubicaC1.setFill(Color.TRANSPARENT);
                cubicaC1.setStroke(dibujar.getColor());
                cubicaC1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaC1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                cubicaC2.setLayoutX(33);
                cubicaC2.setLayoutY(46);
                cubicaC2.setStartX(-3.2);
                cubicaC2.setStartY(1);
                cubicaC2.setEndX(-11.59);
                cubicaC2.setEndY(-9.2);
                cubicaC2.setControlX1(8.19);
                cubicaC2.setControlY1(-9.2);
                cubicaC2.setControlX2(-4.8);
                cubicaC2.setControlY2(-17.8);
                cubicaC2.setFill(Color.TRANSPARENT);
                cubicaC2.setStroke(dibujar.getColor());
                cubicaC2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaC2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                cubicaC3.setLayoutX(35);
                cubicaC3.setLayoutY(15);
                cubicaC3.setStartX(-10.59);
                cubicaC3.setStartY(0.39);
                cubicaC3.setEndX(-5.2);
                cubicaC3.setEndY(-6.39);
                cubicaC3.setControlX1(-10.59);
                cubicaC3.setControlY1(6.59);
                cubicaC3.setControlX2(3.4);
                cubicaC3.setControlY2(-1.2);
                cubicaC3.setFill(Color.TRANSPARENT);
                cubicaC3.setStroke(dibujar.getColor());
                cubicaC3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaC3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicaC1,cubicaC2,cubicaC3);
                return fondo;
            case 'D':
                CubicCurve cubicaD1 = new CubicCurve();
                CubicCurve cubicaD2 = new CubicCurve();
                CubicCurve cubicaD3 = new CubicCurve();
                CubicCurve cubicaD4 = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //Atributos Lineas
                cubicaD1.setLayoutX(32);
                cubicaD1.setLayoutY(35);
                cubicaD1.setStartX(3.2);
                cubicaD1.setStartY(-25.8);
                cubicaD1.setEndX(-20.19);
                cubicaD1.setEndY(14.59);
                cubicaD1.setControlX1(-6.8);
                cubicaD1.setControlY1(-29.8);
                cubicaD1.setControlX2(-6.8);
                cubicaD1.setControlY2(14.59);
                cubicaD1.setFill(Color.TRANSPARENT);
                cubicaD1.setStroke(dibujar.getColor());
                cubicaD1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //guatita
                cubicaD2.setLayoutX(26);
                cubicaD2.setLayoutY(30);
                cubicaD2.setStartX(-1.51);
                cubicaD2.setStartY(-22.6);
                cubicaD2.setEndX(-12.19);
                cubicaD2.setEndY(19);
                cubicaD2.setControlX1(33.4);
                cubicaD2.setControlY1(-8);
                cubicaD2.setControlX2(10.19);
                cubicaD2.setControlY2(28.19);
                cubicaD2.setFill(Color.TRANSPARENT);
                cubicaD2.setStroke(dibujar.getColor());
                cubicaD2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                // colDita inferior izquierda
                cubicaD3.setLayoutX(48);
                cubicaD3.setLayoutY(59);
                cubicaD3.setStartX(-34.6);
                cubicaD3.setStartY(-10);
                cubicaD3.setEndX(-34.6);
                cubicaD3.setEndY(-10);
                cubicaD3.setControlX1(-43.19);
                cubicaD3.setControlY1(-7.4);
                cubicaD3.setControlX2(-43.19);
                cubicaD3.setControlY2(-12.59);
                cubicaD3.setFill(Color.TRANSPARENT);
                cubicaD3.setStroke(dibujar.getColor());
                cubicaD3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaD3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //curva superior izquierda
                cubicaD4.setLayoutX(10);
                cubicaD4.setLayoutY(42);
                cubicaD4.setStartX(13.4);
                cubicaD4.setStartY(-34.76);
                cubicaD4.setEndX(7);
                cubicaD4.setEndY(-12.59);
                cubicaD4.setControlX1(-10);
                cubicaD4.setControlY1(-39.19);
                cubicaD4.setControlX2(-10);
                cubicaD4.setControlY2(-6.8);
                cubicaD4.setFill(Color.TRANSPARENT);
                cubicaD4.setStroke(dibujar.getColor());
                cubicaD4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaD4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicaD1,cubicaD2,cubicaD3,cubicaD4);
                return fondo;
            case 'E':
                CubicCurve cubicaE1 = new CubicCurve();
                CubicCurve cubicaE2 = new CubicCurve();
                CubicCurve cubicaE3 = new CubicCurve();
                CubicCurve cubicaE4 = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //PRIMERA inferior izquierda base
                cubicaE1.setLayoutX(27.0);
                cubicaE1.setLayoutY(24.0);
                cubicaE1.setStartX(6.2);
                cubicaE1.setStartY(19.2);
                cubicaE1.setEndX(-11.4);
                cubicaE1.setEndY(2.23);
                cubicaE1.setControlX1(-14.79);
                cubicaE1.setControlY1(39.59);
                cubicaE1.setControlX2(-30.6);
                cubicaE1.setControlY2(11.59);
                cubicaE1.setFill(Color.TRANSPARENT);
                cubicaE1.setStroke(dibujar.getColor());
                cubicaE1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaE1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //centro union s
                cubicaE2.setLayoutX(16.0);
                cubicaE2.setLayoutY(23.0);
                cubicaE2.setStartX(-0.6);
                cubicaE2.setStartY(3.23);
                cubicaE2.setEndX(-0.6);
                cubicaE2.setEndY(-7.6);
                cubicaE2.setControlX1(3.79);
                cubicaE2.setControlY1(-1.0);
                cubicaE2.setControlX2(-7.79);
                cubicaE2.setControlY2(3.23);
                cubicaE2.setFill(Color.TRANSPARENT);
                cubicaE2.setStroke(dibujar.getColor());
                cubicaE2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaE2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //curba superior
                cubicaE3.setLayoutX(15.0);
                cubicaE3.setLayoutY(24.0);
                cubicaE3.setStartX(0);
                cubicaE3.setStartY(-8.2);
                cubicaE3.setEndX(9.39);
                cubicaE3.setEndY(-5.8);
                cubicaE3.setControlX1(12.0);
                cubicaE3.setControlY1(-23.99);
                cubicaE3.setControlX2(20.39);
                cubicaE3.setControlY2(-2);
                cubicaE3.setFill(Color.TRANSPARENT);
                cubicaE3.setStroke(dibujar.getColor());
                cubicaE3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaE3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //colita inferior derecha
                cubicaE4.setLayoutX(23.0);
                cubicaE4.setLayoutY(50.0);
                cubicaE4.setStartX(-0.6);
                cubicaE4.setStartY(-9.8);
                cubicaE4.setEndX(9.39);
                cubicaE4.setEndY(-5.8);
                cubicaE4.setControlX1(1.0);
                cubicaE4.setControlY1(-22.93);
                cubicaE4.setControlX2(17.39);
                cubicaE4.setControlY2(-13.8);
                cubicaE4.setFill(Color.TRANSPARENT);
                cubicaE4.setStroke(dibujar.getColor());
                cubicaE4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaE4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicaE1,cubicaE2,cubicaE3,cubicaE4);
                return fondo;
            case 'F':
                Line lineaF1 = new Line();
                Line lineaF2 = new Line();
                CubicCurve cubicaF1 = new CubicCurve();
                CubicCurve cubicaF2 = new CubicCurve();
                CubicCurve cubicaF3 = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //central
                cubicaF1.setLayoutX(26.0);
                cubicaF1.setLayoutY(14.0);
                cubicaF1.setStartX(-22);
                cubicaF1.setStartY(32.4);
                cubicaF1.setEndX(5.2);
                cubicaF1.setEndY(-3.67);
                cubicaF1.setControlX1(-1.79);
                cubicaF1.setControlY1(50.0);
                cubicaF1.setControlX2(-11.0);
                cubicaF1.setControlY2(-3.6);
                cubicaF1.setFill(Color.TRANSPARENT);
                cubicaF1.setStroke(dibujar.getColor());
                cubicaF1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaF1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //superior
                cubicaF2.setLayoutX(36.0);
                cubicaF2.setLayoutY(26.0);
                cubicaF2.setStartX(-26.2);
                cubicaF2.setStartY(-4.59);
                cubicaF2.setEndX(5.2);
                cubicaF2.setEndY(-14.6);
                cubicaF2.setControlX1(-36.0);
                cubicaF2.setControlY1(-4.59);
                cubicaF2.setControlX2(-39.79);
                cubicaF2.setControlY2(-24.39);
                cubicaF2.setFill(Color.TRANSPARENT);
                cubicaF2.setStroke(dibujar.getColor());
                cubicaF2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaF2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //colita superior
                cubicaF3.setLayoutX(-1.0);
                cubicaF3.setLayoutY(27.0);
                cubicaF3.setStartX(8.2);
                cubicaF3.setStartY(-11.39);
                cubicaF3.setEndX(11.0);
                cubicaF3.setEndY(-5.4);
                cubicaF3.setControlX1(17.0);
                cubicaF3.setControlY1(-19.32);
                cubicaF3.setControlX2(19.6);
                cubicaF3.setControlY2(-5.4);
                cubicaF3.setFill(Color.TRANSPARENT);
                cubicaF3.setStroke(dibujar.getColor());
                cubicaF3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaF3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //linea central
                lineaF1.setLayoutX(-23.0);
                lineaF1.setLayoutY(30.0);
                lineaF1.setStartX(42.8);
                lineaF1.setStartY(-2.4);
                lineaF1.setEndX(50.39);
                lineaF1.setEndY(-2.4);
                lineaF1.setFill(Color.TRANSPARENT);
                lineaF1.setStroke(dibujar.getColor());
                lineaF1.setStrokeLineCap(StrokeLineCap.ROUND);
                lineaF1.setStrokeLineJoin(StrokeLineJoin.ROUND);       
                //linFea terminal central
                lineaF2.setLayoutX(-16.0);
                lineaF2.setLayoutY(30.0);
                lineaF2.setStartX(44.0);
                lineaF2.setStartY(-2.4);
                lineaF2.setEndX(44);
                lineaF2.setEndY(1.79);
                lineaF2.setFill(Color.TRANSPARENT);
                lineaF2.setStroke(dibujar.getColor());
                lineaF2.setStrokeLineCap(StrokeLineCap.ROUND);
                lineaF2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicaF1,cubicaF2,cubicaF3,lineaF1,lineaF2);
                return fondo;
            case 'G':
                CubicCurve cubicasG = new CubicCurve();
                CubicCurve cubicaG1 = new CubicCurve();
                CubicCurve cubicaG2 = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //lado izquiero primera
                cubicasG.setLayoutX(33);
                cubicasG.setLayoutY(15.0);
                cubicasG.setStartX(-22);
                cubicasG.setStartY(25.4);
                cubicasG.setEndX(3.39);
                cubicasG.setEndY(9.49);
                cubicasG.setControlX1(-31.19);
                cubicasG.setControlY1(37.40);
                cubicasG.setControlX2(8.20);
                cubicasG.setControlY2(49.79);
                cubicasG.setFill(Color.TRANSPARENT);
                cubicasG.setStroke(dibujar.getColor());
                cubicasG.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasG.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                cubicaG1.setLayoutX(29);
                cubicaG1.setLayoutY(0);
                cubicaG1.setStartX(7.20);
                cubicaG1.setStartY(25.79);
                cubicaG1.setEndX(-13);
                cubicaG1.setEndY(15.6);
                cubicaG1.setControlX1(-1.2);
                cubicaG1.setControlY1(44.79);
                cubicaG1.setControlX2(-25.39);
                cubicaG1.setControlY2(33.79);
                cubicaG1.setFill(Color.TRANSPARENT);
                cubicaG1.setStroke(dibujar.getColor());
                cubicaG1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaG1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                cubicaG2.setLayoutX(38);
                cubicaG2.setLayoutY(12);
                cubicaG2.setStartX(-24.39);
                cubicaG2.setStartY(-1.9);
                cubicaG2.setEndX(-22.6);
                cubicaG2.setEndY(4.43);
                cubicaG2.setControlX1(20.2);
                cubicaG2.setControlY1(16.4);
                cubicaG2.setControlX2(-9.19);
                cubicaG2.setControlY2(-18.99);
                cubicaG2.setFill(Color.TRANSPARENT);
                cubicaG2.setStroke(dibujar.getColor());
                cubicaG2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaG2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                fondo.getChildren().addAll(cubicasG,cubicaG1,cubicaG2);
                return fondo;
            case 'H':
                Line lineasH = new Line();
                CubicCurve cubicasH = new CubicCurve();
                CubicCurve cubicaH1 = new CubicCurve();
                CubicCurve cubicaH2 = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //lado izquiero primera
                cubicasH.setLayoutX(35.0);
                cubicasH.setLayoutY(15.0);
                cubicasH.setStartX(-33.0);
                cubicasH.setStartY(32.79);
                cubicasH.setEndX(-6.75);
                cubicasH.setEndY(-5.99);
                cubicasH.setControlX1(-15.39);
                cubicasH.setControlY1(48.19);
                cubicasH.setControlX2(-31.0);
                cubicasH.setControlY2(-5.99);
                cubicasH.setFill(Color.TRANSPARENT);
                cubicasH.setStroke(dibujar.getColor());
                cubicasH.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasH.setStrokeLineJoin(StrokeLineJoin.ROUND);
                // supeHrior izquierdo colita
                cubicaH1.setLayoutX(22.0);
                cubicaH1.setLayoutY(8.0);
                cubicaH1.setStartX(-11.8);
                cubicaH1.setStartY(9.19);
                cubicaH1.setEndX(5.21);
                cubicaH1.setEndY(1.01);
                cubicaH1.setControlX1(-8.85);
                cubicaH1.setControlY1(22.9);
                cubicaH1.setControlX2(-37.39);
                cubicaH1.setControlY2(3.8);
                cubicaH1.setFill(Color.TRANSPARENT);
                cubicaH1.setStroke(dibujar.getColor());
                cubicaH1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaH1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //dereHcha segunda
                cubicaH2.setLayoutX(45.0);
                cubicaH2.setLayoutY(16.0);
                cubicaH2.setStartX(-5.6);
                cubicaH2.setStartY(24.4);
                cubicaH2.setEndX(-5.6);
                cubicaH2.setEndY(-5.9);
                cubicaH2.setControlX1(-21.0);
                cubicaH2.setControlY1(58.19);
                cubicaH2.setControlX2(-27.7);
                cubicaH2.setControlY2(6.2);
                cubicaH2.setFill(Color.TRANSPARENT);
                cubicaH2.setStroke(dibujar.getColor());
                cubicaH2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaH2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //central
                lineasH.setLayoutX(27);
                lineasH.setLayoutY(30);
                lineasH.setStartX(-13.39);
                lineasH.setStartY(-1.8);
                lineasH.setEndX(-0.6);
                lineasH.setEndY(-1.8);
                lineasH.setFill(Color.TRANSPARENT);
                lineasH.setStroke(dibujar.getColor());
                lineasH.setStrokeLineCap(StrokeLineCap.ROUND);
                lineasH.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasH,cubicaH1,cubicaH2,lineasH);
                return fondo;
            case 'I':
                CubicCurve cubicasI = new CubicCurve();
                CubicCurve cubica1I = new CubicCurve();
                CubicCurve cubica2I = new CubicCurve();   
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //SUPERIOR
                cubicasI.setLayoutX(32.0);
                cubicasI.setLayoutY(9.0);
                cubicasI.setStartX(-12.59);
                cubicasI.setStartY(9.4);
                cubicasI.setEndX(8.59);
                cubicasI.setEndY(-0.02);
                cubicasI.setControlX1(-16.4);
                cubicasI.setControlY1(19.19);
                cubicasI.setControlX2(-42.4);
                cubicasI.setControlY2(1.90);
                cubicasI.setFill(Color.TRANSPARENT);
                cubicasI.setStroke(dibujar.getColor());
                cubicasI.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasI.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //BASE
                cubica1I.setLayoutX(44.0);
                cubica1I.setLayoutY(19.0);
                cubica1I.setStartX(-31.4);
                cubica1I.setStartY(31.59);
                cubica1I.setEndX(-2.39);
                cubica1I.setEndY(-10.02);
                cubica1I.setControlX1(-14.59);
                cubica1I.setControlY1(31.59);
                cubica1I.setControlX2(-27.79);
                cubica1I.setControlY2(-8.02);
                cubica1I.setFill(Color.TRANSPARENT);
                cubica1I.setStroke(dibujar.getColor());
                cubica1I.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1I.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //FINALI BASE
                cubica2I.setLayoutX(1);
                cubica2I.setLayoutY(64);
                cubica2I.setStartX(11.59);
                cubica2I.setStartY(-13.4);
                cubica2I.setEndX(7.2);
                cubica2I.setEndY(-23.59);
                cubica2I.setControlX1(0);
                cubica2I.setControlY1(-13.4);
                cubica2I.setControlX2(0);
                cubica2I.setControlY2(-23.59);
                cubica2I.setFill(Color.TRANSPARENT);
                cubica2I.setStroke(dibujar.getColor());
                cubica2I.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2I.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasI,cubica1I,cubica2I);
                return fondo;
            case 'J':
                CubicCurve cubicasJ = new CubicCurve();
                CubicCurve cubica1J = new CubicCurve();
                CubicCurve cubica2J = new CubicCurve();   
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //medio
                cubicasJ.setLayoutX(39);
                cubicasJ.setLayoutY(17);
                cubicasJ.setStartX(-29.59);
                cubicasJ.setStartY(35.8);
                cubicasJ.setEndX(-0.70);
                cubicasJ.setEndY(-11.68);
                cubicasJ.setControlX1(-24.2);
                cubicasJ.setControlY1(57);
                cubicasJ.setControlX2(-27.7);
                cubicasJ.setControlY2(6.2);
                cubicasJ.setFill(Color.TRANSPARENT);
                cubicasJ.setStroke(dibujar.getColor());
                cubicasJ.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasJ.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //superior
                cubica1J.setLayoutX(30);
                cubica1J.setLayoutY(5);
                cubica1J.setStartX(-10.79);
                cubica1J.setStartY(17.20);
                cubica1J.setEndX(7.25);
                cubica1J.setEndY(1.35);
                cubica1J.setControlX1(-16.4);
                cubica1J.setControlY1(31.2);
                cubica1J.setControlX2(-46.33);
                cubica1J.setControlY2(6.9);
                cubica1J.setFill(Color.TRANSPARENT);
                cubica1J.setStroke(dibujar.getColor());
                cubica1J.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1J.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //FINALJ BASE
                cubica2J.setLayoutX(39);
                cubica2J.setLayoutY(16);
                cubica2J.setStartX(-29.59);
                cubica2J.setStartY(37);
                cubica2J.setEndX(-2.2);
                cubica2J.setEndY(21.6);
                cubica2J.setControlX1(-29.59);
                cubica2J.setControlY1(6.8);
                cubica2J.setControlX2(-9.75);
                cubica2J.setControlY2(33);
                cubica2J.setFill(Color.TRANSPARENT);
                cubica2J.setStroke(dibujar.getColor());
                cubica2J.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2J.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasJ,cubica1J,cubica2J);
                return fondo;
            case 'K':
                CubicCurve cubicasK = new CubicCurve();
                CubicCurve cubica1K = new CubicCurve();
                CubicCurve cubica2K = new CubicCurve();
                CubicCurve cubica3K = new CubicCurve();

                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x

                //PRIMERA izquierda
                cubicasK.setLayoutX(35.0);
                cubicasK.setLayoutY(14.0);
                cubicasK.setStartX(-33.0);
                cubicasK.setStartY(32.79);
                cubicasK.setEndX(-10.59);
                cubicasK.setEndY(-6.0);
                cubicasK.setControlX1(-14.59);
                cubicasK.setControlY1(53.19);
                cubicasK.setControlX2(-27.80);
                cubicasK.setControlY2(-6);
                cubicasK.setFill(Color.TRANSPARENT);
                cubicasK.setStroke(dibujar.getColor());
                cubicasK.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasK.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito izquierda
                cubica1K.setLayoutX(23.0);
                cubica1K.setLayoutY(7.0);
                cubica1K.setStartX(-11.8);
                cubica1K.setStartY(9.19);
                cubica1K.setEndX(2.32);
                cubica1K.setEndY(1.01);
                cubica1K.setControlX1(-8.85);
                cubica1K.setControlY1(22.9);
                cubica1K.setControlX2(-42.8);
                cubica1K.setControlY2(4.79);
                cubica1K.setFill(Color.TRANSPARENT);
                cubica1K.setStroke(dibujar.getColor());
                cubica1K.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasK.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecha superior
                cubica2K.setLayoutX(50.0);
                cubica2K.setLayoutY(-7.0);
                cubica2K.setStartX(-30.45);
                cubica2K.setStartY(35.70);
                cubica2K.setEndX(-12.0);
                cubica2K.setEndY(15.79);
                cubica2K.setControlX1(-6.0);
                cubica2K.setControlY1(40.59);
                cubica2K.setControlX2(-23.39);
                cubica2K.setControlY2(11.79);
                cubica2K.setFill(Color.TRANSPARENT);
                cubica2K.setStroke(dibujar.getColor());
                cubica2K.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2K.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecha inferior
                cubica3K.setLayoutX(60.0);
                cubica3K.setLayoutY(4.0);
                cubica3K.setStartX(-21.0);
                cubica3K.setStartY(46.60);
                cubica3K.setEndX(-39.59);
                cubica3K.setEndY(24.59);
                cubica3K.setControlX1(-35.39);
                cubica3K.setControlY1(48.08);
                cubica3K.setControlX2(-14.39);
                cubica3K.setControlY2(25.99);
                cubica3K.setFill(Color.TRANSPARENT);
                cubica3K.setStroke(dibujar.getColor());
                cubica3K.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica3K.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasK,cubica1K,cubica2K,cubica3K);
                return fondo;
            case 'L':
                CubicCurve cubicasL = new CubicCurve();
                CubicCurve cubica1L = new CubicCurve();
                CubicCurve cubica2L = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //BASE
                cubicasL.setLayoutX(39.0);
                cubicasL.setLayoutY(13.0);
                cubicasL.setStartX(-31.19);
                cubicasL.setStartY(37.60);
                cubicasL.setEndX(-4.0);
                cubicasL.setEndY(-7.18);
                cubicasL.setControlX1(1.19);
                cubicasL.setControlY1(41.4);
                cubicasL.setControlX2(-29);
                cubicasL.setControlY2(-5.59);
                cubicasL.setFill(Color.TRANSPARENT);
                cubicasL.setStroke(dibujar.getColor());
                cubicasL.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasL.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito
                cubica1L.setLayoutX(47.0);
                cubica1L.setLayoutY(23.0);
                cubica1L.setStartX(-33.60);
                cubica1L.setStartY(-12.80);
                cubica1L.setEndX(-10.95);
                cubica1L.setEndY(-17.09);
                cubica1L.setControlX1(-10.95);
                cubica1L.setControlY1(-2.0);
                cubica1L.setControlX2(4.4);
                cubica1L.setControlY2(-13.93);
                cubica1L.setFill(Color.TRANSPARENT);
                cubica1L.setStroke(dibujar.getColor());
                cubica1L.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1L.setStrokeLineJoin(StrokeLineJoin.ROUND);       
               //
                cubica2L.setLayoutX(42.0);
                cubica2L.setLayoutY(61.0);
                cubica2L.setStartX(-35.25);
                cubica2L.setStartY(-10.79);
                cubica2L.setEndX(-1.8);
                cubica2L.setEndY(-14.59);
                cubica2L.setControlX1(-51.39);
                cubica2L.setControlY1(-24.2);
                cubica2L.setControlX2(5.4);
                cubica2L.setControlY2(2.0);
                cubica2L.setFill(Color.TRANSPARENT);
                cubica2L.setStroke(dibujar.getColor());
                cubica2L.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2L.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasL,cubica1L,cubica2L);
                return fondo;
            case 'M':
                CubicCurve cubicasM = new CubicCurve();   
                CubicCurve cubica1M = new CubicCurve();
                CubicCurve cubica2M = new CubicCurve();
                CubicCurve cubica3M = new CubicCurve();
                QuadCurve cuadraticasM = new QuadCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //PRIMERA izquierda
                cubicasM.setLayoutX(33.0);
                cubicasM.setLayoutY(14.0);
                cubicasM.setStartX(-33.0);
                cubicasM.setStartY(35.0);
                cubicasM.setEndX(-10.59);
                cubicasM.setEndY(-6.0);
                cubicasM.setControlX1(-13.8);
                cubicasM.setControlY1(48.0);
                cubicasM.setControlX2(-31.39);
                cubicasM.setControlY2(-6.0);
                cubicasM.setFill(Color.TRANSPARENT);
                cubicasM.setStroke(dibujar.getColor());
                cubicasM.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasM.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //medioM izquierdo
                cubica1M.setLayoutX(34.0);
                cubica1M.setLayoutY(18.0);
                cubica1M.setStartX(-11.19);
                cubica1M.setStartY(20.79);
                cubica1M.setEndX(-11.19);
                cubica1M.setEndY(-10.0);
                cubica1M.setControlX1(-7.29);
                cubica1M.setControlY1(6.99);
                cubica1M.setControlX2(-26.0);
                cubica1M.setControlY2(-1.59);
                cubica1M.setFill(Color.TRANSPARENT);
                cubica1M.setStroke(dibujar.getColor());
                cubica1M.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1M.setStrokeLineJoin(StrokeLineJoin.ROUND);
                // mediMo derecho
                cubica2M.setLayoutX(44.0);
                cubica2M.setLayoutY(28.0);
                cubica2M.setStartX(-22.16);
                cubica2M.setStartY(11.94);
                cubica2M.setEndX(-1.4);
                cubica2M.setEndY(-20.16);
                cubica2M.setControlX1(-13.39);
                cubica2M.setControlY1(2.59);
                cubica2M.setControlX2(-15.59);
                cubica2M.setControlY2(-20.16);
                cubica2M.setFill(Color.TRANSPARENT);
                cubica2M.setStroke(dibujar.getColor());
                cubica2M.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2M.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecho
                cubica3M.setLayoutX(54.0);
                cubica3M.setLayoutY(15.0);
                cubica3M.setStartX(-29.64);
                cubica3M.setStartY(36.0);
                cubica3M.setEndX(-11.8);
                cubica3M.setEndY(-6.59);
                cubica3M.setControlX1(0.40);
                cubica3M.setControlY1(44.0);
                cubica3M.setControlX2(-29.64);
                cubica3M.setControlY2(-2.4);
                cubica3M.setFill(Color.TRANSPARENT);
                cubica3M.setStroke(dibujar.getColor());
                cubica3M.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica3M.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cuadrMatica
                cuadraticasM.setLayoutX(56);
                cuadraticasM.setLayoutY(55.5);
                cuadraticasM.setStartX(-33.16);
                cuadraticasM.setStartY(-4.9);
                cuadraticasM.setEndX(-10.39);
                cuadraticasM.setEndY(-14.59);
                cuadraticasM.setControlX(-19);
                cuadraticasM.setControlY(2.5);
                cuadraticasM.setFill(Color.TRANSPARENT);
                cuadraticasM.setStroke(dibujar.getColor());
                cuadraticasM.setStrokeLineCap(StrokeLineCap.ROUND);
                cuadraticasM.setStrokeLineJoin(StrokeLineJoin.ROUND);       
                fondo.getChildren().addAll(cubicasM,cubica1M,cubica2M,cubica3M,cuadraticasM);
                return fondo;
            case 'N':
                CubicCurve cubicasN = new CubicCurve();
                CubicCurve cubica1N = new CubicCurve();
                CubicCurve cubica2N = new CubicCurve();
                CubicCurve cubica3N = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x      
                //izquierdo
                cubicasN.setLayoutX(33.0);
                cubicasN.setLayoutY(13.0);
                cubicasN.setStartX(-31.39);
                cubicasN.setStartY(37.4);
                cubicasN.setEndX(-22.4);
                cubicasN.setEndY(-5.4);
                cubicasN.setControlX1(-22.4);
                cubicasN.setControlY1(41.0);
                cubicasN.setControlX2(-16.99);
                cubicasN.setControlY2(9.59);
                cubicasN.setFill(Color.TRANSPARENT);
                cubicasN.setStroke(dibujar.getColor());
                cubicasN.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasN.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //medio
                cubica1N.setLayoutX(42.0);
                cubica1N.setLayoutY(24.0);
                cubica1N.setStartX(-7.59);
                cubica1N.setStartY(26.4);
                cubica1N.setEndX(-31.8);
                cubica1N.setEndY(-16.53);
                cubica1N.setControlX1(-22.4);
                cubica1N.setControlY1(13.4);
                cubica1N.setControlX2(-19.19);
                cubica1N.setControlY2(-9.4);
                cubica1N.setFill(Color.TRANSPARENT);
                cubica1N.setStroke(dibujar.getColor());
                cubica1N.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1N.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecho
                cubica2N.setLayoutX(62.0);
                cubica2N.setLayoutY(14.0);
                cubica2N.setStartX(-28.19);
                cubica2N.setStartY(35.4);
                cubica2N.setEndX(-19.6);
                cubica2N.setEndY(-4.2);
                cubica2N.setControlX1(-34.6);
                cubica2N.setControlY1(13.79);
                cubica2N.setControlX2(-30.19);
                cubica2N.setControlY2(-18.0);
                cubica2N.setFill(Color.TRANSPARENT);
                cubica2N.setStroke(dibujar.getColor());
                cubica2N.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2N.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachiNto
                cubica3N.setLayoutX(46.0);
                cubica3N.setLayoutY(15.0);
                cubica3N.setStartX(-8.39);
                cubica3N.setStartY(-3.4);
                cubica3N.setEndX(-5.59);
                cubica3N.setEndY(-7.2);
                cubica3N.setControlX1(-11.19);
                cubica3N.setControlY1(2.79);
                cubica3N.setControlX2(2.8);
                cubica3N.setControlY2(0.4);
                cubica3N.setFill(Color.TRANSPARENT);
                cubica3N.setStroke(dibujar.getColor());
                cubica3N.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica3N.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasN,cubica1N,cubica2N,cubica3N);
                return fondo;
            case 'Ñ':
                CubicCurve cubicasÑ = new CubicCurve();
                CubicCurve cubica1Ñ = new CubicCurve();
                CubicCurve cubica2Ñ = new CubicCurve();
                CubicCurve cubica3Ñ = new CubicCurve();
                CubicCurve cubica4Ñ = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //izquierdo
                cubicasÑ.setLayoutX(33.0);
                cubicasÑ.setLayoutY(13.0);
                cubicasÑ.setStartX(-31.39);
                cubicasÑ.setStartY(37.4);
                cubicasÑ.setEndX(-22.4);
                cubicasÑ.setEndY(-5.4);
                cubicasÑ.setControlX1(-22.4);
                cubicasÑ.setControlY1(41.0);
                cubicasÑ.setControlX2(-16.99);
                cubicasÑ.setControlY2(9.59);
                cubicasÑ.setFill(Color.TRANSPARENT);
                cubicasÑ.setStroke(dibujar.getColor());
                cubicasÑ.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasÑ.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //medio
                cubica1Ñ.setLayoutX(42.0);
                cubica1Ñ.setLayoutY(24.0);
                cubica1Ñ.setStartX(-7.59);
                cubica1Ñ.setStartY(26.4);
                cubica1Ñ.setEndX(-31.8);
                cubica1Ñ.setEndY(-16.53);
                cubica1Ñ.setControlX1(-22.4);
                cubica1Ñ.setControlY1(13.4);
                cubica1Ñ.setControlX2(-19.19);
                cubica1Ñ.setControlY2(-9.4);
                cubica1Ñ.setFill(Color.TRANSPARENT);
                cubica1Ñ.setStroke(dibujar.getColor());
                cubica1Ñ.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1Ñ.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecÑho
                cubica2Ñ.setLayoutX(62.0);
                cubica2Ñ.setLayoutY(14.0);
                cubica2Ñ.setStartX(-28.19);
                cubica2Ñ.setStartY(35.4);
                cubica2Ñ.setEndX(-19.6);
                cubica2Ñ.setEndY(-4.2);
                cubica2Ñ.setControlX1(-34.6);
                cubica2Ñ.setControlY1(13.79);
                cubica2Ñ.setControlX2(-30.19);
                cubica2Ñ.setControlY2(-18.0);
                cubica2Ñ.setFill(Color.TRANSPARENT);
                cubica2Ñ.setStroke(dibujar.getColor());
                cubica2Ñ.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2Ñ.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachiÑto
                cubica3Ñ.setLayoutX(46.0);
                cubica3Ñ.setLayoutY(15.0);
                cubica3Ñ.setStartX(-8.39);
                cubica3Ñ.setStartY(-3.4);
                cubica3Ñ.setEndX(-5.59);
                cubica3Ñ.setEndY(-7.2);
                cubica3Ñ.setControlX1(-11.19);
                cubica3Ñ.setControlY1(2.79);
                cubica3Ñ.setControlX2(2.8);
                cubica3Ñ.setControlY2(0.4);
                cubica3Ñ.setFill(Color.TRANSPARENT);
                cubica3Ñ.setStroke(dibujar.getColor());
                cubica3Ñ.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica3Ñ.setStrokeLineJoin(StrokeLineJoin.ROUND);
                // linea superior
                cubica4Ñ.setLayoutX(46.0);
                cubica4Ñ.setLayoutY(20.0);
                cubica4Ñ.setStartX(-8.39);
                cubica4Ñ.setStartY(-14.80);
                cubica4Ñ.setEndX(-37.89);
                cubica4Ñ.setEndY(-11.53);
                cubica4Ñ.setControlX1(-20.39);
                cubica4Ñ.setControlY1(-3.80);
                cubica4Ñ.setControlX2(-25.19);
                cubica4Ñ.setControlY2(-24.0);
                cubica4Ñ.setFill(Color.TRANSPARENT);
                cubica4Ñ.setStroke(dibujar.getColor());
                cubica4Ñ.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica4Ñ.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasÑ,cubica1Ñ,cubica2Ñ,cubica3Ñ,cubica4Ñ);
                return fondo;
            case 'O':
                CubicCurve cubicasO = new CubicCurve();
                CubicCurve cubica1O = new CubicCurve();
                CubicCurve cubica2O = new CubicCurve();        
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //IZQUIERDO
                cubicasO.setLayoutX(39.0);
                cubicasO.setLayoutY(13.0);
                cubicasO.setStartX(-19.60);
                cubicasO.setStartY(37.6);
                cubicasO.setEndX(-17.2);
                cubicasO.setEndY(-2.59);
                cubicasO.setControlX1(-39.0);
                cubicasO.setControlY1(39.6);
                cubicasO.setControlX2(-37.0);
                cubicasO.setControlY2(-6.0);
                cubicasO.setFill(Color.TRANSPARENT);
                cubicasO.setStroke(dibujar.getColor());
                cubicasO.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasO.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //MEDIO
                cubica1O.setLayoutX(49.0);
                cubica1O.setLayoutY(24.0);
                cubica1O.setStartX(-33.6);
                cubica1O.setStartY(-12.59);
                cubica1O.setEndX(-8.39);
                cubica1O.setEndY(6.99);
                cubica1O.setControlX1(-39.8);
                cubica1O.setControlY1(1.59);
                cubica1O.setControlX2(-21.8);
                cubica1O.setControlY2(-9.4);
                cubica1O.setFill(Color.TRANSPARENT);
                cubica1O.setStroke(dibujar.getColor());
                cubica1O.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1O.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //DERECHO
                cubica2O.setLayoutX(39.0);
                cubica2O.setLayoutY(13.0);
                cubica2O.setStartX(-18.55);
                cubica2O.setStartY(37.66);
                cubica2O.setEndX(-19.6);
                cubica2O.setEndY(-4.2);
                cubica2O.setControlX1(-3.39);
                cubica2O.setControlY1(35.0);
                cubica2O.setControlX2(3.6);
                cubica2O.setControlY2(-4.2);
                cubica2O.setFill(Color.TRANSPARENT);
                cubica2O.setStroke(dibujar.getColor());
                cubica2O.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2O.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasO,cubica1O,cubica2O);
                return fondo;
            case 'P':
                CubicCurve cubicasP = new CubicCurve();
                CubicCurve cubica1P= new CubicCurve();
                CubicCurve cubica2P = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //CENTRAL
                cubicasP.setLayoutX(35.0);
                cubicasP.setLayoutY(15.0);
                cubicasP.setStartX(-31.8);
                cubicasP.setStartY(34.4);
                cubicasP.setEndX(-13.8);
                cubicasP.setEndY(-2.4);
                cubicasP.setControlX1(-22.4);
                cubicasP.setControlY1(41.0);
                cubicasP.setControlX2(-16.44);
                cubicasP.setControlY2(11.48);
                cubicasP.setFill(Color.TRANSPARENT);
                cubicasP.setStroke(dibujar.getColor());
                cubicasP.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasP.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito
                cubica1P.setLayoutX(25.0);
                cubica1P.setLayoutY(3.0);
                cubica1P.setStartX(-8.6);
                cubica1P.setStartY(15.0);
                cubica1P.setEndX(-8.6);
                cubica1P.setEndY(4);
                cubica1P.setControlX1(-13.39);
                cubica1P.setControlY1(27.59);
                cubica1P.setControlX2(-32.39);
                cubica1P.setControlY2(9.59);
                cubica1P.setFill(Color.TRANSPARENT);
                cubica1P.setStroke(dibujar.getColor());
                cubica1P.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1P.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //CURVAAAA
                cubica2P.setLayoutX(34.0);
                cubica2P.setLayoutY(19.0);
                cubica2P.setStartX(-21.6);
                cubica2P.setStartY(-10.59);
                cubica2P.setEndX(-12.91);
                cubica2P.setEndY(9.7);
                cubica2P.setControlX1(21.39);
                cubica2P.setControlY1(-28.8);
                cubica2P.setControlX2(8.6);
                cubica2P.setControlY2(28.2);
                cubica2P.setFill(Color.TRANSPARENT);
                cubica2P.setStroke(dibujar.getColor());
                cubica2P.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2P.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasP,cubica1P,cubica2P);
                return fondo;
            case 'Q':
                CubicCurve cubicasQ = new CubicCurve();
                CubicCurve cubica1Q = new CubicCurve();
                CubicCurve cubica2Q = new CubicCurve();
                CubicCurve cubica3Q = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x

                //izquierdo
                cubicasQ.setLayoutX(39.0);
                cubicasQ.setLayoutY(13.0);
                cubicasQ.setStartX(-19.6);
                cubicasQ.setStartY(37.6);
                cubicasQ.setEndX(-19.6);
                cubicasQ.setEndY(-4.2);
                cubicasQ.setControlX1(-39.0);
                cubicasQ.setControlY1(39.6);
                cubicasQ.setControlX2(-37.0);
                cubicasQ.setControlY2(-6.0);
                cubicasQ.setFill(Color.TRANSPARENT);
                cubicasQ.setStroke(dibujar.getColor());
                cubicasQ.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasQ.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecho
                cubica1Q.setLayoutX(39.0);
                cubica1Q.setLayoutY(13.0);
                cubica1Q.setStartX(-18.55);
                cubica1Q.setStartY(37.66);
                cubica1Q.setEndX(-16.6);
                cubica1Q.setEndY(0.8);
                cubica1Q.setControlX1(-3.39);
                cubica1Q.setControlY1(35.0);
                cubica1Q.setControlX2(3.39);
                cubica1Q.setControlY2(-8.19);
                cubica1Q.setFill(Color.TRANSPARENT);
                cubica1Q.setStroke(dibujar.getColor());
                cubica1Q.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1Q.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //centro
                cubica2Q.setLayoutX(53.0);
                cubica2Q.setLayoutY(39.0);
                cubica2Q.setStartX(-31.0);
                cubica2Q.setStartY(-25.19);
                cubica2Q.setEndX(-28.79);
                cubica2Q.setEndY(-8.79);
                cubica2Q.setControlX1(-42.2);
                cubica2Q.setControlY1(-21.59);
                cubica2Q.setControlX2(-42.2);
                cubica2Q.setControlY2(0.6);
                cubica2Q.setFill(Color.TRANSPARENT);
                cubica2Q.setStroke(dibujar.getColor());
                cubica2Q.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2Q.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito inferior derecho
                cubica3Q.setLayoutX(65.5);
                cubica3Q.setLayoutY(50.0);
                cubica3Q.setStartX(-31.2);
                cubica3Q.setStartY(0.8);
                cubica3Q.setEndX(-43.0);
                cubica3Q.setEndY(-18.59);
                cubica3Q.setControlX1(-59.6);
                cubica3Q.setControlY1(-28.79);
                cubica3Q.setControlX2(-27.6);
                cubica3Q.setControlY2(-28.79);
                cubica3Q.setFill(Color.TRANSPARENT);
                cubica3Q.setStroke(dibujar.getColor());
                cubica3Q.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica3Q.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasQ,cubica1Q,cubica2Q,cubica3Q);
                return fondo;
            case 'R':
                CubicCurve cubicasR = new CubicCurve();
                CubicCurve cubica1R = new CubicCurve();
                CubicCurve cubica2R = new CubicCurve();
                CubicCurve cubica3R = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x 
                //centro
                cubicasR.setLayoutX(35.0);
                cubicasR.setLayoutY(16.0);
                cubicasR.setStartX(-32.6);
                cubicasR.setStartY(33.6);
                cubicasR.setEndX(0.6);
                cubicasR.setEndY(-12.8);
                cubicasR.setControlX1(-19.19);
                cubicasR.setControlY1(42.2);
                cubicasR.setControlX2(-16.39);
                cubicasR.setControlY2(-10.11);
                cubicasR.setFill(Color.TRANSPARENT);
                cubicasR.setStroke(dibujar.getColor());
                cubicasR.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasR.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //superior derecha
                cubica1R.setLayoutX(34.0);
                cubica1R.setLayoutY(22.0);
                cubica1R.setStartX(-19.39);
                cubica1R.setStartY(-14.11);
                cubica1R.setEndX(-11.19);
                cubica1R.setEndY(7.9);
                cubica1R.setControlX1(16.80);
                cubica1R.setControlY1(-25.2);
                cubica1R.setControlX2(9.6);
                cubica1R.setControlY2(14.59);
                cubica1R.setFill(Color.TRANSPARENT);
                cubica1R.setStroke(dibujar.getColor());
                cubica1R.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1R.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //inferior derecha
                cubica2R.setLayoutX(60.0);
                cubica2R.setLayoutY(4.0);
                cubica2R.setStartX(-21.0);
                cubica2R.setStartY(46.6);
                cubica2R.setEndX(-38.6);
                cubica2R.setEndY(25.99);
                cubica2R.setControlX1(-35.39);
                cubica2R.setControlY1(48.08);
                cubica2R.setControlX2(-14.39);
                cubica2R.setControlY2(25.99);
                cubica2R.setFill(Color.TRANSPARENT);
                cubica2R.setStroke(dibujar.getColor());
                cubica2R.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2R.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachiRto 
                cubica3R.setLayoutX(26.0);
                cubica3R.setLayoutY(3);
                cubica3R.setStartX(-8.6);
                cubica3R.setStartY(15.4);
                cubica3R.setEndX(-8.6);
                cubica3R.setEndY(4.0);
                cubica3R.setControlX1(-15.19);
                cubica3R.setControlY1(25.4);
                cubica3R.setControlX2(-26.19);
                cubica3R.setControlY2(8.79);
                cubica3R.setFill(Color.TRANSPARENT);
                cubica3R.setStroke(dibujar.getColor());
                cubica3R.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica3R.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasR,cubica1R,cubica2R,cubica3R);
                return fondo;
            case 'S':
                CubicCurve cubicasS = new CubicCurve();
                CubicCurve cubica1S = new CubicCurve();
                CubicCurve cubica2S =new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //guatita media
                cubicasS.setLayoutX(65.0);
                cubicasS.setLayoutY(7.0);
                cubicasS.setStartX(-47.6);
                cubicasS.setStartY(44.2);
                cubicasS.setEndX(-42.2);
                cubicasS.setEndY(13.8);
                cubicasS.setControlX1(-35.39);
                cubicasS.setControlY1(48.08);
                cubicasS.setControlX2(-11.79);
                cubicasS.setControlY2(30.79);
                cubicasS.setFill(Color.TRANSPARENT);
                cubicasS.setStroke(dibujar.getColor());
                cubicasS.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasS.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito inferior
                cubica1S.setLayoutX(9.0);
                cubica1S.setLayoutY(65.0);
                cubica1S.setStartX(11.59);
                cubica1S.setStartY(-13.4);
                cubica1S.setEndX(7.2);
                cubica1S.setEndY(-23.59);
                cubica1S.setControlX1(0);
                cubica1S.setControlY1(-13.4);
                cubica1S.setControlX2(0);
                cubica1S.setControlY2(-23.59);
                cubica1S.setFill(Color.TRANSPARENT);
                cubica1S.setStroke(dibujar.getColor());
                cubica1S.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1S.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //superSior cachito
                cubica2S.setLayoutX(26.0);
                cubica2S.setLayoutY(19.0);
                cubica2S.setStartX(-1.6);
                cubica2S.setStartY(2.79);
                cubica2S.setEndX(4.7);
                cubica2S.setEndY(-5.4);
                cubica2S.setControlX1(-23.79);
                cubica2S.setControlY1(-9.8);
                cubica2S.setControlX2(1.79);
                cubica2S.setControlY2(-16.0);
                cubica2S.setFill(Color.TRANSPARENT);
                cubica2S.setStroke(dibujar.getColor());
                cubica2S.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2S.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasS,cubica1S,cubica2S);
                return fondo;
            case 'T':
                CubicCurve cubicasT = new CubicCurve();
                CubicCurve cubica1T = new CubicCurve();
                CubicCurve cubica2T = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x       
                //central
                cubicasT.setLayoutX(41);
                cubicasT.setLayoutY(21);
                cubicasT.setStartX(-24.4);
                cubicasT.setStartY(26.79);
                cubicasT.setEndX(0.27);
                cubicasT.setEndY(-12.79);
                cubicasT.setControlX1(-3);
                cubicasT.setControlY1(36.39);
                cubicasT.setControlX2(-37.2);
                cubicasT.setControlY2(-20.59);
                cubicasT.setFill(Color.TRANSPARENT);
                cubicasT.setStroke(dibujar.getColor());
                cubicasT.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasT.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //superior central
                cubica1T.setLayoutX(28);
                cubica1T.setLayoutY(8);
                cubica1T.setStartX(-21.59);
                cubica1T.setStartY(7.79);
                cubica1T.setEndX(12.2);
                cubica1T.setEndY(0);
                cubica1T.setControlX1(-31.59);
                cubica1T.setControlY1(-9.2);
                cubica1T.setControlX2(1.79);
                cubica1T.setControlY2(1.79);
                cubica1T.setFill(Color.TRANSPARENT);
                cubica1T.setStroke(dibujar.getColor());
                cubica1T.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1T.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachiTto superior
                cubica2T.setLayoutX(32);
                cubica2T.setLayoutY(17);
                cubica2T.setStartX(-15.2);
                cubica2T.setStartY(-5.79);
                cubica2T.setEndX(-25.2);
                cubica2T.setEndY(-1.01);
                cubica2T.setControlX1(-12);
                cubica2T.setControlY1(6.59);
                cubica2T.setControlX2(-22);
                cubica2T.setControlY2(2.99);
                cubica2T.setFill(Color.TRANSPARENT);
                cubica2T.setStroke(dibujar.getColor());
                cubica2T.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2T.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasT,cubica1T,cubica2T);
                return fondo;
            case 'U':
                QuadCurve cuadraticasU = new QuadCurve();
                CubicCurve cubicasU = new CubicCurve();
                CubicCurve cubica1U = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //BASE
                cubicasU.setLayoutX(46.0);
                cubicasU.setLayoutY(16.0);
                cubicasU.setStartX(-10.2);
                cubicasU.setStartY(-5.8);
                cubicasU.setEndX(-33.0);
                cubicasU.setEndY(1.8);
                cubicasU.setControlX1(-7.2);
                cubicasU.setControlY1(48.79);
                cubicasU.setControlX2(-42.6);
                cubicasU.setControlY2(44.0);
                cubicasU.setFill(Color.TRANSPARENT);
                cubicasU.setStroke(dibujar.getColor());
                cubicasU.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasU.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //
                cubica1U.setLayoutX(18.5);
                cubica1U.setLayoutY(1.5);
                cubica1U.setStartX(-11.89);
                cubica1U.setStartY(22.5);
                cubica1U.setEndX(-5.29);
                cubica1U.setEndY(16.10);
                cubica1U.setControlX1(-27.5);
                cubica1U.setControlY1(19.69);
                cubica1U.setControlX2(-5.29);
                cubica1U.setControlY2(-4.3);
                cubica1U.setFill(Color.TRANSPARENT);
                cubica1U.setStroke(dibujar.getColor());
                cubica1U.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1U.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //COLITUA DE UNION
                cuadraticasU.setLayoutX(44.0);
                cuadraticasU.setLayoutY(65.0);
                cuadraticasU.setStartX(-1.0);
                cuadraticasU.setStartY(-15.6);
                cuadraticasU.setEndX(-10.0);
                cuadraticasU.setEndY(-31.8);
                cuadraticasU.setControlX(-12.2);
                cuadraticasU.setControlY(-13.74);
                cuadraticasU.setFill(Color.TRANSPARENT);
                cuadraticasU.setStroke(dibujar.getColor());
                cuadraticasU.setStrokeLineCap(StrokeLineCap.ROUND);
                cuadraticasU.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasU,cuadraticasU,cubica1U);
                return fondo;
            case 'V':
                CubicCurve cubicasV = new CubicCurve();
                CubicCurve cubica1V = new CubicCurve();
                CubicCurve cubica2V = new CubicCurve();       
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //izquiera linea
                cubicasV.setLayoutX(34.0);
                cubicasV.setLayoutY(24.0);
                cubicasV.setStartX(-7.59);
                cubicasV.setStartY(26.4);
                cubicasV.setEndX(-19.59);
                cubicasV.setEndY(-14.19);
                cubicasV.setControlX1(-25.44);
                cubicasV.setControlY1(3.99);
                cubicasV.setControlX2(-15);
                cubicasV.setControlY2(-14.19);
                cubicasV.setFill(Color.TRANSPARENT);
                cubicasV.setStroke(dibujar.getColor());
                cubicasV.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasV.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecha linea
                cubica1V.setLayoutX(58.0);
                cubica1V.setLayoutY(13.0);
                cubica1V.setStartX(-31.39);
                cubica1V.setStartY(37.4);
                cubica1V.setEndX(-22.59);
                cubica1V.setEndY(-3.19);
                cubica1V.setControlX1(-28.0);
                cubica1V.setControlY1(29.39);
                cubica1V.setControlX2(-17.0);
                cubica1V.setControlY2(8.39);
                cubica1V.setFill(Color.TRANSPARENT);
                cubica1V.setStroke(dibujar.getColor());
                cubica1V.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1V.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito
                cubica2V.setLayoutX(18.0);
                cubica2V.setLayoutY(19.0);
                cubica2V.setStartX(-6.06);
                cubica2V.setStartY(5.19);
                cubica2V.setEndX(-4.59);
                cubica2V.setEndY(-9.19);
                cubica2V.setControlX1(-11.39);
                cubica2V.setControlY1(15.2);
                cubica2V.setControlX2(-22.19);
                cubica2V.setControlY2(3.6);
                cubica2V.setFill(Color.TRANSPARENT);
                cubica2V.setStroke(dibujar.getColor());
                cubica2V.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2V.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasV,cubica1V,cubica2V);
                return fondo;
            case 'W':
                CubicCurve cubicasW = new CubicCurve();
                CubicCurve cubica1W = new CubicCurve();
                CubicCurve cubica2W = new CubicCurve();
                CubicCurve cubica3W = new CubicCurve();
                CubicCurve cubica4W = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //PRIMERA izquierda
                cubicasW.setLayoutX(27.0);
                cubicasW.setLayoutY(24.0);
                cubicasW.setStartX(-9.95);
                cubicasW.setStartY(25.4);
                cubicasW.setEndX(-19.59);
                cubicasW.setEndY(-14.19);
                cubicasW.setControlX1(-25.19);
                cubicasW.setControlY1(14.6);
                cubicasW.setControlX2(-13.19);
                cubicasW.setControlY2(-14.19);
                cubicasW.setFill(Color.TRANSPARENT);
                cubicasW.setStroke(dibujar.getColor());
                cubicasW.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasW.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //izquierda centro
                cubica1W.setLayoutX(51.0);
                cubica1W.setLayoutY(13.0);
                cubica1W.setStartX(-34.59);
                cubica1W.setStartY(35.0);
                cubica1W.setEndX(-27.19);
                cubica1W.setEndY(-2.8);
                cubica1W.setControlX1(-36.8);
                cubica1W.setControlY1(27.6);
                cubica1W.setControlX2(-24.19);
                cubica1W.setControlY2(10.5);
                cubica1W.setFill(Color.TRANSPARENT);
                cubica1W.setStroke(dibujar.getColor());
                cubica1W.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1W.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecha centro
                cubica2W.setLayoutX(42.0);
                cubica2W.setLayoutY(24.0);
                cubica2W.setStartX(-10.19);
                cubica2W.setStartY(24.6);
                cubica2W.setEndX(-18.8);
                cubica2W.setEndY(-14.47);
                cubica2W.setControlX1(-22.8);
                cubica2W.setControlY1(6.8);
                cubica2W.setControlX2(-13.0);
                cubica2W.setControlY2(-6.19);
                cubica2W.setFill(Color.TRANSPARENT);
                cubica2W.setStroke(dibujar.getColor());
                cubica2W.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2W.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecha
                cubica3W.setLayoutX(67.0);
                cubica3W.setLayoutY(14.0);
                cubica3W.setStartX(-34.59);
                cubica3W.setStartY(35.0);
                cubica3W.setEndX(-28.59);
                cubica3W.setEndY(-4.39);
                cubica3W.setControlX1(-36.8);
                cubica3W.setControlY1(-27.6);
                cubica3W.setControlX2(-20.4);
                cubica3W.setControlY2(11.0);
                cubica3W.setFill(Color.TRANSPARENT);
                cubica3W.setStroke(dibujar.getColor());
                cubica3W.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica3W.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachiWto
                cubica4W.setLayoutX(12.0);
                cubica4W.setLayoutY(19.0);
                cubica4W.setStartX(-4.59);
                cubica4W.setStartY(0.0);
                cubica4W.setEndX(-4.59);
                cubica4W.setEndY(-9.19);
                cubica4W.setControlX1(-8.19);
                cubica4W.setControlY1(7.0);
                cubica4W.setControlX2(-18.0);
                cubica4W.setControlY2(0.0);
                cubica4W.setFill(Color.TRANSPARENT);
                cubica4W.setStroke(dibujar.getColor());
                cubica4W.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica4W.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasW,cubica1W,cubica2W,cubica3W,cubica4W);
                return fondo;
            case 'X':
                CubicCurve cubicasX = new CubicCurve();
                CubicCurve cubica1X = new CubicCurve();
                CubicCurve cubica2X = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //izquierda
                cubicasX.setLayoutX(40.0);
                cubicasX.setLayoutY(25.0);
                cubicasX.setStartX(-34.0);
                cubicasX.setStartY(24.19);
                cubicasX.setEndX(-29.6);
                cubicasX.setEndY(-14.0);
                cubicasX.setControlX1(-13.8);
                cubicasX.setControlY1(22.4);
                cubicasX.setControlX2(-6.19);
                cubicasX.setControlY2(-5.8);
                cubicasX.setFill(Color.TRANSPARENT);
                cubicasX.setStroke(dibujar.getColor());
                cubicasX.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasX.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecha
                cubica1X.setLayoutX(42.0);
                cubica1X.setLayoutY(28.0);
                cubica1X.setStartX(-4.0);
                cubica1X.setStartY(20.8);
                cubica1X.setEndX(-5.8);
                cubica1X.setEndY(-18.19);
                cubica1X.setControlX1(-19.6);
                cubica1X.setControlY1(15.0);
                cubica1X.setControlX2(-22.4);
                cubica1X.setControlY2(-7.8);
                cubica1X.setFill(Color.TRANSPARENT);
                cubica1X.setStroke(dibujar.getColor());
                cubica1X.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1X.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //izquierda
                cubica2X.setLayoutX(16.0);
                cubica2X.setLayoutY(19.0);
                cubica2X.setStartX(-3.99);
                cubica2X.setStartY(1.2);
                cubica2X.setEndX(-5.73);
                cubica2X.setEndY(-8.13);
                cubica2X.setControlX1(-10.19);
                cubica2X.setControlY1(12.6);
                cubica2X.setControlX2(-23.8);
                cubica2X.setControlY2(-5);
                cubica2X.setFill(Color.TRANSPARENT);
                cubica2X.setStroke(dibujar.getColor());
                cubica2X.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2X.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasX,cubica1X,cubica2X);
                return fondo;
            case 'Y':
                CubicCurve cubicasY = new CubicCurve();
                CubicCurve cubica1Y = new CubicCurve();
                CubicCurve cubica2Y = new CubicCurve();
                CubicCurve cubica3Y = new CubicCurve();
                CubicCurve cubica4Y = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //base derecha media  
                cubicasY.setLayoutX(48.0);
                cubicasY.setLayoutY(10.0);
                cubicasY.setStartX(-15.6);
                cubicasY.setStartY(-3.39);
                cubicasY.setEndX(-29.6);
                cubicasY.setEndY(23.39);
                cubicasY.setControlX1(-14.12);
                cubicasY.setControlY1(20.0);
                cubicasY.setControlX2(-20.79);
                cubicasY.setControlY2(31.39);
                cubicasY.setFill(Color.TRANSPARENT);
                cubicasY.setStroke(dibujar.getColor());
                cubicasY.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasY.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //base izquierda media
                cubica1Y.setLayoutX(44.5);
                cubica1Y.setLayoutY(6.0);
                cubica1Y.setStartX(-25.5);
                cubica1Y.setStartY(27.8);
                cubica1Y.setEndX(-29.39);
                cubica1Y.setEndY(3.8);
                cubica1Y.setControlX1(-36.39);
                cubica1Y.setControlY1(16.8);
                cubica1Y.setControlX2(-27.8);
                cubica1Y.setControlY2(9.39);
                cubica1Y.setFill(Color.TRANSPARENT);
                cubica1Y.setStroke(dibujar.getColor());
                cubica1Y.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1Y.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito izquierdo
                cubica2Y.setLayoutX(18.5);
                cubica2Y.setLayoutY(0.5);
                cubica2Y.setStartX(-8.89);
                cubica2Y.setStartY(17.90);
                cubica2Y.setEndX(-3.10);
                cubica2Y.setEndY(11.3);
                cubica2Y.setControlX1(-18.5);
                cubica2Y.setControlY1(17.90);
                cubica2Y.setControlX2(-5.29);
                cubica2Y.setControlY2(-4.30);
                cubica2Y.setFill(Color.TRANSPARENT);
                cubica2Y.setStroke(dibujar.getColor());
                cubica2Y.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2Y.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //inferior derecha
                cubica3Y.setLayoutX(28.0);
                cubica3Y.setLayoutY(9.0);
                cubica3Y.setStartX(-12.0);
                cubica3Y.setStartY(40.40);
                cubica3Y.setEndX(4.6);
                cubica3Y.setEndY(9.0);
                cubica3Y.setControlX1(-7.0);
                cubica3Y.setControlY1(45.8);
                cubica3Y.setControlX2(9.2);
                cubica3Y.setControlY2(51.0);
                cubica3Y.setFill(Color.TRANSPARENT);
                cubica3Y.setStroke(dibujar.getColor());
                cubica3Y.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica3Y.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito inferior
                cubica4Y.setLayoutX(11.5);
                cubica4Y.setLayoutY(55.0);
                cubica4Y.setStartX(4.39);
                cubica4Y.setStartY(-5.80);
                cubica4Y.setEndX(9.39);
                cubica4Y.setEndY(-5.80);
                cubica4Y.setControlX1(-2.40);
                cubica4Y.setControlY1(-17.60);
                cubica4Y.setControlX2(18.79);
                cubica4Y.setControlY2(-17.60);
                cubica4Y.setFill(Color.TRANSPARENT);
                cubica4Y.setStroke(dibujar.getColor());
                cubica4Y.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica4Y.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasY,cubica2Y,cubica1Y,cubica3Y,cubica4Y);
                return fondo;
            case 'Z':
                CubicCurve cubicasZ = new CubicCurve();
                CubicCurve cubica1Z = new CubicCurve();  
                CubicCurve cubica2Z = new CubicCurve();
                CubicCurve cubica3Z = new CubicCurve();
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //central
                cubicasZ.setLayoutX(32.0);
                cubicasZ.setLayoutY(22.0);
                cubicasZ.setStartX(-22.0);
                cubicasZ.setStartY(26.6);
                cubicasZ.setEndX(2.39);
                cubicasZ.setEndY(-12.6);
                cubicasZ.setControlX1(-13.39);
                cubicasZ.setControlY1(18.0);
                cubicasZ.setControlX2(-7.2);
                cubicasZ.setControlY2(-5.19);
                cubicasZ.setFill(Color.TRANSPARENT);
                cubicasZ.setStroke(dibujar.getColor());
                cubicasZ.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasZ.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //superior
                cubica1Z.setLayoutX(43.0);
                cubica1Z.setLayoutY(24.0);
                cubica1Z.setStartX(-8.39);
                cubica1Z.setStartY(-14.80);
                cubica1Z.setEndX(-36.39);
                cubica1Z.setEndY(-12.0);
                cubica1Z.setControlX1(-14.39);
                cubica1Z.setControlY1(-10.0);
                cubica1Z.setControlX2(-25.79);
                cubica1Z.setControlY2(-24.0);
                cubica1Z.setFill(Color.TRANSPARENT);
                cubica1Z.setStroke(dibujar.getColor());
                cubica1Z.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1Z.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito
                cubica2Z.setLayoutX(16.5);
                cubica2Z.setLayoutY(17.0);
                cubica2Z.setStartX(-2.19);
                cubica2Z.setStartY(-0.19);
                cubica2Z.setEndX(-5.73);
                cubica2Z.setEndY(-8.13);
                cubica2Z.setControlX1(-5.73);
                cubica2Z.setControlY1(8.8);
                cubica2Z.setControlX2(-18.39);
                cubica2Z.setControlY2(-2.39);
                cubica2Z.setFill(Color.TRANSPARENT);
                cubica2Z.setStroke(dibujar.getColor());
                cubica2Z.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2Z.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //inferior 
                cubica3Z.setLayoutX(32.0);
                cubica3Z.setLayoutY(30.0);
                cubica3Z.setStartX(3.60);
                cubica3Z.setStartY(18.19);
                cubica3Z.setEndX(-23.19);
                cubica3Z.setEndY(19.79);
                cubica3Z.setControlX1(-10.39);
                cubica3Z.setControlY1(27.0);
                cubica3Z.setControlX2(-14.79);
                cubica3Z.setControlY2(13.39);
                cubica3Z.setFill(Color.TRANSPARENT);
                cubica3Z.setStroke(dibujar.getColor());
                cubica3Z.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica3Z.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicasZ,cubica1Z,cubica2Z,cubica3Z);
                return fondo;
            case 'a':
                CubicCurve cubicaa= new CubicCurve();
                CubicCurve cubicaa1 = new CubicCurve();
                CubicCurve cubicaa2 = new CubicCurve();
                
                fondo.setPrefSize(19,60);

                //primerabase
                cubicaa.setLayoutX(36);
                cubicaa.setLayoutY(42);
                cubicaa.setStartX(-36);
                cubicaa.setStartY(-6.54);
                cubicaa.setEndX(-23.76);
                cubicaa.setEndY(-6.54);
                cubicaa.setControlX1(-33.59);
                cubicaa.setControlY1(-19);
                cubicaa.setControlX2(-23.76);
                cubicaa.setControlY2(-21);
                cubicaa.setFill(Color.TRANSPARENT);
                cubicaa.setStroke(dibujar.getColor());
                cubicaa.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaa.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //curva 
                cubicaa1.setLayoutX(35);
                cubicaa1.setLayoutY(44);
                cubicaa1.setStartX(-34.8);
                cubicaa1.setStartY(-7.8);
                cubicaa1.setEndX(-22.76);
                cubicaa1.setEndY(-7.8);
                cubicaa1.setControlX1(-37);
                cubicaa1.setControlY1(5.17);
                cubicaa1.setControlX2(-22.76);
                cubicaa1.setControlY2(5.17);
                cubicaa1.setFill(Color.TRANSPARENT);
                cubicaa1.setStroke(dibujar.getColor());
                cubicaa1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaa1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //unioaan
                cubicaa2.setLayoutX(45);
                cubicaa2.setLayoutY(42);
                cubicaa2.setStartX(-31.76);
                cubicaa2.setStartY(-15.4);
                cubicaa2.setEndX(-26.79);
                cubicaa2.setEndY(-3.59);
                cubicaa2.setControlX1(-35.2);
                cubicaa2.setControlY1(7);
                cubicaa2.setControlX2(-29.79);
                cubicaa2.setControlY2(7);
                cubicaa2.setFill(Color.TRANSPARENT);
                cubicaa2.setStroke(dibujar.getColor());
                cubicaa2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaa2.setStrokeLineJoin(StrokeLineJoin.ROUND);  
                fondo.getChildren().addAll(cubicaa,cubicaa1,cubicaa2);
                return fondo; 
           case 'b':
                CubicCurve cubicab= new CubicCurve();
                CubicCurve cubicab1 = new CubicCurve();
                CubicCurve cubicab2 = new CubicCurve();
                fondo.setPrefSize(19,60);

                //primerabase
                cubicab.setLayoutX(39.0);
                cubicab.setLayoutY(38.0);
                cubicab.setStartX(-29.79);
                cubicab.setStartY(-33.8);
                cubicab.setEndX(-27.19);
                cubicab.setEndY(6.0);
                cubicab.setControlX1(-40.59);
                cubicab.setControlY1(2.4);
                cubicab.setControlX2(-39.0);
                cubicab.setControlY2(10.79);
                cubicab.setFill(Color.TRANSPARENT);
                cubicab.setStroke(dibujar.getColor());
                cubicab.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicab.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //curvba 
                cubicab1.setLayoutX(50);
                cubicab1.setLayoutY(56.5);
                cubicab1.setStartX(-45.39);
                cubicab1.setStartY(-25.3);
                cubicab1.setEndX(-38.07);
                cubicab1.setEndY(-12.9);
                cubicab1.setControlX1(-38.07);
                cubicab1.setControlY1(-27.03);
                cubicab1.setControlX2(-31.20);
                cubicab1.setControlY2(-20.95);
                cubicab1.setFill(Color.TRANSPARENT);
                cubicab1.setStroke(dibujar.getColor());
                cubicab1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicab1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //uniobn
                cubicab2.setLayoutX(40.0);
                cubicab2.setLayoutY(58.0);
                cubicab2.setStartX(-35.0);
                cubicab2.setStartY(-26.5);
                cubicab2.setEndX(-22.19);
                cubicab2.setEndY(-26.5);
                cubicab2.setControlX1(-39.04);
                cubicab2.setControlY1(-24.08);
                cubicab2.setControlX2(-30.37);
                cubicab2.setControlY2(-20.68);
                cubicab2.setFill(Color.TRANSPARENT);
                cubicab2.setStroke(dibujar.getColor());
                cubicab2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicab2.setStrokeLineJoin(StrokeLineJoin.ROUND);  
                fondo.getChildren().addAll(cubicab,cubicab1,cubicab2);                
                return fondo;
            case 'c':
                CubicCurve cubicac= new CubicCurve();
                CubicCurve cubicac1 = new CubicCurve();   
                fondo.setPrefSize(19,60);

                //primerabase
                cubicac.setLayoutX(48);
                cubicac.setLayoutY(48.898);
                cubicac.setStartX(-43.60);
                cubicac.setStartY(-5.8);
                cubicac.setEndX(-32);
                cubicac.setEndY(-11.69);
                cubicac.setControlX1(-38.39);
                cubicac.setControlY1(-0.8);
                cubicac.setControlX2(-32);
                cubicac.setControlY2(-5.8);
                cubicac.setFill(Color.TRANSPARENT);
                cubicac.setStroke(dibujar.getColor());
                cubicac.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicac.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //curva
                cubicac1.setLayoutX(42);
                cubicac1.setLayoutY(41);
                cubicac1.setStartX(-30.8);
                cubicac1.setStartY(-14);
                cubicac1.setEndX(-37.2);
                cubicac1.setEndY(2.79);
                cubicac1.setControlX1(-40.6);
                cubicac1.setControlY1(-18.4);
                cubicac1.setControlX2(-42.6);
                cubicac1.setControlY2(-2.2);
                cubicac1.setFill(Color.TRANSPARENT);
                cubicac1.setStroke(dibujar.getColor());
                cubicac1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicac1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicac,cubicac1);
                return fondo;
            case 'd':
                CubicCurve cubicad = new CubicCurve();
                CubicCurve cubicad1 = new CubicCurve();
                CubicCurve cubicad2 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                // superior
                cubicad.setLayoutX(35);
                cubicad.setLayoutY(42);
                cubicad.setStartX(-35.8);
                cubicad.setStartY(-6.54);
                cubicad.setEndX(-23.76);
                cubicad.setEndY(-6.54);
                cubicad.setControlX1(-32.39);
                cubicad.setControlY1(-20.8);
                cubicad.setControlX2(-22);
                cubicad.setControlY2(-20.8);
                cubicad.setFill(Color.TRANSPARENT);
                cubicad.setStroke(dibujar.getColor());
                cubicad.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicad.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //inferior
                cubicad1.setLayoutX(34);
                cubicad1.setLayoutY(43);
                cubicad1.setStartX(-34.6);
                cubicad1.setStartY(-7.8);
                cubicad1.setEndX(-22.76);
                cubicad1.setEndY(-7.8);
                cubicad1.setControlX1(-37.6);
                cubicad1.setControlY1(7);
                cubicad1.setControlX2(-22.76);
                cubicad1.setControlY2(5.17);
                cubicad1.setFill(Color.TRANSPARENT);
                cubicad1.setStroke(dibujar.getColor());
                cubicad1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicad1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                // unidon
                cubicad2.setLayoutX(54);
                cubicad2.setLayoutY(51);
                cubicad2.setStartX(-37.19);
                cubicad2.setStartY(-11.8);
                cubicad2.setEndX(-37.19);
                cubicad2.setEndY(-47.4);
                cubicad2.setControlX1(-44.59);
                cubicad2.setControlY1(6.0);
                cubicad2.setControlX2(-44.59);
                cubicad2.setControlY2(-21.4);
                cubicad2.setFill(Color.TRANSPARENT);
                cubicad2.setStroke(dibujar.getColor());
                cubicad2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicad2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicad, cubicad1,cubicad2);
                return fondo;
            case 'e':
                CubicCurve cubicae= new CubicCurve();
                CubicCurve cubicae1 = new CubicCurve();   
                fondo.setPrefSize(19,60);

                //primerabase
                cubicae.setLayoutX(40.5);
                cubicae.setLayoutY(41);
                cubicae.setStartX(-39.19);
                cubicae.setStartY(-8);
                cubicae.setEndX(-39.19);
                cubicae.setEndY(-2.8);
                cubicae.setControlX1(-36.39);
                cubicae.setControlY1(-24.59);
                cubicae.setControlX2(-21);
                cubicae.setControlY2(-14.59);
                cubicae.setFill(Color.TRANSPARENT);
                cubicae.setStroke(dibujar.getColor());
                cubicae.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicae.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //base union
                cubicae1.setLayoutX(40.5);
                cubicae1.setLayoutY(37);
                cubicae1.setStartX(-38.59);
                cubicae1.setStartY(-6.59);
                cubicae1.setEndX(-28.06);
                cubicae1.setEndY(0.59);
                cubicae1.setControlX1(-43.39);
                cubicae1.setControlY1(12.19);
                cubicae1.setControlX2(-32.69);
                cubicae1.setControlY2(10.59);
                cubicae1.setFill(Color.TRANSPARENT);
                cubicae1.setStroke(dibujar.getColor());
                cubicae1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicae1.setStrokeLineJoin(StrokeLineJoin.ROUND); 
                fondo.getChildren().addAll(cubicae,cubicae1);
                return fondo;
            case 'f':
                CubicCurve cubicaf= new CubicCurve();
                CubicCurve cubicaf1= new CubicCurve();
                CubicCurve cubicaf2= new CubicCurve();
                fondo.setPrefSize(19,60);

                //primera inferior
                cubicaf.setLayoutX(64.99);
                cubicaf.setLayoutY(59.0);
                cubicaf.setStartX(-60.78);
                cubicaf.setStartY(-14.8);
                cubicaf.setEndX(-60.78);
                cubicaf.setEndY(-23.0);
                cubicaf.setControlX1(-66.18);
                cubicaf.setControlY1(-79);
                cubicaf.setControlX2(-50.99);
                cubicaf.setControlY2(-53.59);
                cubicaf.setFill(Color.TRANSPARENT);
                cubicaf.setStroke(dibujar.getColor());
                cubicaf.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaf.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea inferior
                cubicaf1.setLayoutX(75);
                cubicaf1.setLayoutY(66);
                cubicaf1.setStartX(-70.60);
                cubicaf1.setStartY(-31.20);
                cubicaf1.setEndX(-70.60);
                cubicaf1.setEndY(-28.4);
                cubicaf1.setControlX1(-58.39);
                cubicaf1.setControlY1(-18);
                cubicaf1.setControlX2(-74.8);
                cubicaf1.setControlY2(13.2);
                cubicaf1.setFill(Color.TRANSPARENT);
                cubicaf1.setStroke(dibujar.getColor());
                cubicaf1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaf1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //linefa media
                cubicaf2.setLayoutX(77.2);
                cubicaf2.setLayoutY(69.5);
                cubicaf2.setStartX(-63.2);
                cubicaf2.setStartY(-30.9);
                cubicaf2.setEndX(-72.33);
                cubicaf2.setEndY(-34.31);
                cubicaf2.setControlX1(-76.19);
                cubicaf2.setControlY1(-25.24);
                cubicaf2.setControlX2(-80.69);
                cubicaf2.setControlY2(-34.31);
                cubicaf2.setFill(Color.TRANSPARENT);
                cubicaf2.setStroke(dibujar.getColor());
                cubicaf2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaf2.setStrokeLineJoin(StrokeLineJoin.ROUND);       
                fondo.getChildren().addAll(cubicaf,cubicaf1,cubicaf2);
                return fondo;
            case 'g':
                CubicCurve cubicag= new CubicCurve();
                CubicCurve cubicag1 = new CubicCurve(); 
                CubicCurve cubicag2= new CubicCurve();
                CubicCurve cubicag3= new CubicCurve();
                fondo.setPrefSize(19,60);
                //primerabase
                cubicag.setLayoutX(35);
                cubicag.setLayoutY(40);
                cubicag.setStartX(-33.95);
                cubicag.setStartY(-7.8);
                cubicag.setEndX(-22.0);
                cubicag.setEndY(-7.8);
                cubicag.setControlX1(-37.5);
                cubicag.setControlY1(3);
                cubicag.setControlX2(-24.2);
                cubicag.setControlY2(7);
                cubicag.setFill(Color.TRANSPARENT);
                cubicag.setStroke(dibujar.getColor());
                cubicag.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicag.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //lateral
                cubicag1.setLayoutX(56.2);
                cubicag1.setLayoutY(57);
                cubicag1.setStartX(-53.19);
                cubicag1.setStartY(-5.8);
                cubicag1.setEndX(-42.6);
                cubicag1.setEndY(-36);
                cubicag1.setControlX1(-55.39);
                cubicag1.setControlY1(10.59);
                cubicag1.setControlX2(-42.6);
                cubicag1.setControlY2(-0.4);
                cubicag1.setFill(Color.TRANSPARENT);
                cubicag1.setStroke(dibujar.getColor());
                cubicag1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicag1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //curva superior
                cubicag2.setLayoutX(35.5);
                cubicag2.setLayoutY(42);
                cubicag2.setStartX(-34.94);
                cubicag2.setStartY(-8.93);
                cubicag2.setEndX(-23.39);
                cubicag2.setEndY(-5.2);
                cubicag2.setControlX1(-33.95);
                cubicag2.setControlY1(-20.99);
                cubicag2.setControlX2(-19.5);
                cubicag2.setControlY2(-24.19);
                cubicag2.setFill(Color.TRANSPARENT);
                cubicag2.setStroke(dibujar.getColor());
                cubicag2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicag2.setStrokeLineJoin(StrokeLineJoin.ROUND); 
                //uniogn
                cubicag3.setLayoutX(59.5);
                cubicag3.setLayoutY(70);
                cubicag3.setStartX(-56.89);
                cubicag3.setStartY(-17);
                cubicag3.setEndX(-42.5);
                cubicag3.setEndY(-33.8);
                cubicag3.setControlX1(-54.69);
                cubicag3.setControlY1(-28.59);
                cubicag3.setControlX2(-45.43);
                cubicag3.setControlY2(-27.14);
                cubicag3.setFill(Color.TRANSPARENT);
                cubicag3.setStroke(dibujar.getColor());
                cubicag3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicag3.setStrokeLineJoin(StrokeLineJoin.ROUND); 
                fondo.getChildren().addAll(cubicag,cubicag1,cubicag2,cubicag3);  
                return fondo;
            case 'h':
                CubicCurve cubicah= new CubicCurve();
                CubicCurve cubicah1 = new CubicCurve();  
                CubicCurve cubicah2 = new CubicCurve();
                fondo.setPrefSize(19,60);
                //primera 
                cubicah.setLayoutX(70.0);
                cubicah.setLayoutY(51.0);
                cubicah.setStartX(-67);
                cubicah.setStartY(-4.4);
                cubicah.setEndX(-70);
                cubicah.setEndY(-8.59);
                cubicah.setControlX1(-70.79);
                cubicah.setControlY1(-63.0);
                cubicah.setControlX2(-54.2);
                cubicah.setControlY2(-57.4);
                cubicah.setFill(Color.TRANSPARENT);
                cubicah.setStroke(dibujar.getColor());
                cubicah.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicah.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //curva superior
                cubicah1.setLayoutX(39.0);
                cubicah1.setLayoutY(45.0);
                cubicah1.setStartX(-36.4);
                cubicah1.setStartY(-9.4);
                cubicah1.setEndX(-25.93);
                cubicah1.setEndY(-6.2);
                cubicah1.setControlX1(-34.6);
                cubicah1.setControlY1(-19.39);
                cubicah1.setControlX2(-20.8);
                cubicah1.setControlY2(-19.4);
                cubicah1.setFill(Color.TRANSPARENT);
                cubicah1.setStroke(dibujar.getColor());
                cubicah1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicah1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //union
                cubicah2.setLayoutX(76);
                cubicah2.setLayoutY(68.5);
                cubicah2.setStartX(-62.69);
                cubicah2.setStartY(-30.55);
                cubicah2.setEndX(-58.69);
                cubicah2.setEndY(-27.7);
                cubicah2.setControlX1(-68.7);
                cubicah2.setControlY1(-15.5);
                cubicah2.setControlX2(-60.89);
                cubicah2.setControlY2(-24.3);
                cubicah2.setFill(Color.TRANSPARENT);
                cubicah2.setStroke(dibujar.getColor());
                cubicah2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicah2.setStrokeLineJoin(StrokeLineJoin.ROUND);  
                fondo.getChildren().addAll(cubicah,cubicah1,cubicah2);
                return fondo;
            case 'i':
                CubicCurve cubicai= new CubicCurve();
                Circle circuloi = new Circle();
                fondo.setPrefSize(19,60);
                //base
                cubicai.setLayoutX(34.0);
                cubicai.setLayoutY(44.0);
                cubicai.setStartX(-28.39);
                cubicai.setStartY(-17);
                cubicai.setEndX(-18.19);
                cubicai.setEndY(-7.2);
                cubicai.setControlX1(-35);
                cubicai.setControlY1(3.19);
                cubicai.setControlX2(-23.8);
                cubicai.setControlY2(8.79);
                cubicai.setFill(Color.TRANSPARENT);
                cubicai.setStroke(dibujar.getColor());
                cubicai.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicai.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Circulo
                circuloi.setRadius(1);
                circuloi.setFill(dibujar.getColor());
                circuloi.setStroke(dibujar.getColor());
                circuloi.setLayoutX(7);
                circuloi.setLayoutY(19);
                fondo.getChildren().addAll(cubicai,circuloi);
                return fondo;
            case 'j':
                CubicCurve cubicaj= new CubicCurve();
                CubicCurve cubicaj1 = new CubicCurve();   
                Circle circuloj = new Circle();
                fondo.setPrefSize(22,60);
                //base
                cubicaj.setLayoutX(73.5);
                cubicaj.setLayoutY(79.5);
                cubicaj.setStartX(-65.7);
                cubicaj.setStartY(-52.9);
                cubicaj.setEndX(-72.89);
                cubicaj.setEndY(-29.09);
                cubicaj.setControlX1(-58.3);
                cubicaj.setControlY1(-36.5);
                cubicaj.setControlX2(-77.5);
                cubicaj.setControlY2(-5.09);
                cubicaj.setFill(Color.TRANSPARENT);
                cubicaj.setStroke(dibujar.getColor());
                cubicaj.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaj.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //union
                cubicaj1.setLayoutX(25);
                cubicaj1.setLayoutY(52);
                cubicaj1.setStartX(-24.5);
                cubicaj1.setStartY(-1.20);
                cubicaj1.setEndX(-10.2);
                cubicaj1.setEndY(-12.8);
                cubicaj1.setControlX1(-16.4);
                cubicaj1.setControlY1(-18.2);
                cubicaj1.setControlX2(-14.48);
                cubicaj1.setControlY2(-4.20);
                cubicaj1.setFill(Color.TRANSPARENT);
                cubicaj1.setStroke(dibujar.getColor());
                cubicaj1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaj1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Circulo
                circuloj.setRadius(1);
                circuloj.setFill(dibujar.getColor());
                circuloj.setStroke(dibujar.getColor());
                circuloj.setLayoutX(8);
                circuloj.setLayoutY(19);
                fondo.getChildren().addAll(cubicaj,cubicaj1,circuloj);
                return fondo;
            case 'k':
                CubicCurve cubicak= new CubicCurve();
                CubicCurve cubicak1 = new CubicCurve();
                CubicCurve cubicak2 = new CubicCurve(); 
                fondo.setPrefSize(19,60);
                // lateral
                cubicak.setLayoutX(69);
                cubicak.setLayoutY(49);
                cubicak.setStartX(-66.39);
                cubicak.setStartY(-3.59);
                cubicak.setEndX(-70.79);
                cubicak.setEndY(-7.8);
                cubicak.setControlX1(-70.79);
                cubicak.setControlY1(-63.0);
                cubicak.setControlX2(-54.2);
                cubicak.setControlY2(-57.4);
                cubicak.setFill(Color.TRANSPARENT);
                cubicak.setStroke(dibujar.getColor());
                cubicak.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicak.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //supekrior
                cubicak1.setLayoutX(38);
                cubicak1.setLayoutY(43);
                cubicak1.setStartX(-36.4);
                cubicak1.setStartY(-9.8);
                cubicak1.setEndX(-36.4);
                cubicak1.setEndY(-5.8);
                cubicak1.setControlX1(-31.24);
                cubicak1.setControlY1(-24.99);
                cubicak1.setControlX2(-15.6);
                cubicak1.setControlY2(-5.8);
                cubicak1.setFill(Color.TRANSPARENT);
                cubicak1.setStroke(dibujar.getColor());
                cubicak1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicak1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //infekrior union
                cubicak2.setLayoutX(75.5);
                cubicak2.setLayoutY(69.5);
                cubicak2.setStartX(-74.31);
                cubicak2.setStartY(-32.9);
                cubicak2.setEndX(-58.5);
                cubicak2.setEndY(-27.09);
                cubicak2.setControlX1(-53.3);
                cubicak2.setControlY1(-36.9);
                cubicak2.setControlX2(-69.3);
                cubicak2.setControlY2(-17.3);
                cubicak2.setFill(Color.TRANSPARENT);
                cubicak2.setStroke(dibujar.getColor());
                cubicak2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicak2.setStrokeLineJoin(StrokeLineJoin.ROUND);    
                fondo.getChildren().addAll(cubicak,cubicak1,cubicak2);
                return fondo;
            case 'l':
                CubicCurve cubical1 = new CubicCurve();
                CubicCurve cubical2 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                //Cubica 1
                cubical1.setLayoutX(5);
                cubical1.setLayoutY(23);
                cubical1.setStartX(-1.99);
                cubical1.setStartY(19.2);
                cubical1.setEndX(1.2);
                cubical1.setEndY(19.2);
                cubical1.setControlX1(13.79);
                cubical1.setControlY1(-31.8);
                cubical1.setControlX2(-13.39);
                cubical1.setControlY2(-29.8);
                cubical1.setFill(Color.TRANSPARENT);
                cubical1.setStroke(dibujar.getColor());
                cubical1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubical1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubical2.setLayoutX(71.6);
                cubical2.setLayoutY(69);
                cubical2.setStartX(-66.4);
                cubical2.setStartY(-31);
                cubical2.setEndX(-58.3);
                cubical2.setEndY(-29.4);
                cubical2.setControlX1(-64.39);
                cubical2.setControlY1(-21.59);
                cubical2.setControlX2(-60.39);
                cubical2.setControlY2(-21.59);
                cubical2.setFill(Color.TRANSPARENT);
                cubical2.setStroke(dibujar.getColor());
                cubical2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubical2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubical1, cubical2);
                return fondo;
            case 'm':
                CubicCurve cubicam1 = new CubicCurve();
                CubicCurve cubicam2 = new CubicCurve();
                CubicCurve cubicam3 = new CubicCurve();
                CubicCurve cubicam4 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                //Cubica 1
                cubicam1.setLayoutX(19);
                cubicam1.setLayoutY(15);
                cubicam1.setStartX(-8.2);
                cubicam1.setStartY(30.4);
                cubicam1.setEndX(-13.6);
                cubicam1.setEndY(19.2);
                cubicam1.setControlX1(-3.2);
                cubicam1.setControlY1(4.39);
                cubicam1.setControlX2(-13.6);
                cubicam1.setControlY2(6);
                cubicam1.setFill(Color.TRANSPARENT);
                cubicam1.setStroke(dibujar.getColor());
                cubicam1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicam1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubicam2.setLayoutX(24);
                cubicam2.setLayoutY(16);
                cubicam2.setStartX(-7);
                cubicam2.setStartY(23.4);
                cubicam2.setEndX(-11.9);
                cubicam2.setEndY(17.79);
                cubicam2.setControlX1(-1.8);
                cubicam2.setControlY1(6.79);
                cubicam2.setControlX2(-11.9);
                cubicam2.setControlY2(3.19);
                cubicam2.setFill(Color.TRANSPARENT);
                cubicam2.setStroke(dibujar.getColor());
                cubicam2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicam2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 3
                cubicam3.setLayoutX(82.5);
                cubicam3.setLayoutY(53.5);
                cubicam3.setStartX(-60.89);
                cubicam3.setStartY(-12.5);
                cubicam3.setEndX(-65.4);
                cubicam3.setEndY(-14.58);
                cubicam3.setControlX1(-63.5);
                cubicam3.setControlY1(-5.7);
                cubicam3.setControlX2(-68.19);
                cubicam3.setControlY2(-5.7);
                cubicam3.setFill(Color.TRANSPARENT);
                cubicam3.setStroke(dibujar.getColor());
                cubicam3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicam3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 4
                cubicam4.setLayoutX(12);
                cubicam4.setLayoutY(24);
                cubicam4.setStartX(-7.93);
                cubicam4.setStartY(21.91);
                cubicam4.setEndX(-11.6);
                cubicam4.setEndY(11.4);
                cubicam4.setControlX1(-3.79);
                cubicam4.setControlY1(-9.8);
                cubicam4.setControlX2(-11.6);
                cubicam4.setControlY2(0.19);
                cubicam4.setFill(Color.TRANSPARENT);
                cubicam4.setStroke(dibujar.getColor());
                cubicam4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicam4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicam1, cubicam2, cubicam3, cubicam4);
                return fondo;
            case 'n':
                CubicCurve cubican1 = new CubicCurve();
                CubicCurve cubican2 = new CubicCurve();
                CubicCurve cubican3 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                //Cubica
                cubican1.setLayoutX(4.5);
                cubican1.setLayoutY(22);
                cubican1.setStartX(1.19);
                cubican1.setStartY(11.4);
                cubican1.setEndX(6.19);
                cubican1.setEndY(18.79);
                cubican1.setControlX1(3.69);
                cubican1.setControlY1(-4.8);
                cubican1.setControlX2(11.1);
                cubican1.setControlY2(7);
                cubican1.setFill(Color.TRANSPARENT);
                cubican1.setStroke(dibujar.getColor());
                cubican1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubican1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubican2.setLayoutX(14);
                cubican2.setLayoutY(25);
                cubican2.setStartX(-10.8);
                cubican2.setStartY(21);
                cubican2.setEndX(-13);
                cubican2.setEndY(11);
                cubican2.setControlX1(-5);
                cubican2.setControlY1(-10.39);
                cubican2.setControlX2(-13);
                cubican2.setControlY2(1.19);
                cubican2.setFill(Color.TRANSPARENT);
                cubican2.setStroke(dibujar.getColor());
                cubican2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubican2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 3
                cubican3.setLayoutX(74.2);
                cubican3.setLayoutY(56.5);
                cubican3.setStartX(-59.59);
                cubican3.setStartY(-14.58);
                cubican3.setEndX(-63.2);
                cubican3.setEndY(-16.5);
                cubican3.setControlX1(-61.2);
                cubican3.setControlY1(-10.3);
                cubican3.setControlX2(-66);
                cubican3.setControlY2(-6.7);
                cubican3.setFill(Color.TRANSPARENT);
                cubican3.setStroke(dibujar.getColor());
                cubican3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubican3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubican1, cubican2, cubican3);
                return fondo;
            case 'ñ':
                CubicCurve cubicañ1 = new CubicCurve();
                CubicCurve cubicañ2 = new CubicCurve();
                CubicCurve cubicañ3 = new CubicCurve();
                CubicCurve cubicañ4 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                //Cubica
                cubicañ1.setLayoutX(4.5);
                cubicañ1.setLayoutY(22);
                cubicañ1.setStartX(1.19);
                cubicañ1.setStartY(11.4);
                cubicañ1.setEndX(6.19);
                cubicañ1.setEndY(18.79);
                cubicañ1.setControlX1(3.69);
                cubicañ1.setControlY1(-4.8);
                cubicañ1.setControlX2(11.1);
                cubicañ1.setControlY2(7);
                cubicañ1.setFill(Color.TRANSPARENT);
                cubicañ1.setStroke(dibujar.getColor());
                cubicañ1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicañ1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubicañ2.setLayoutX(14);
                cubicañ2.setLayoutY(25);
                cubicañ2.setStartX(-10.8);
                cubicañ2.setStartY(21);
                cubicañ2.setEndX(-13);
                cubicañ2.setEndY(11);
                cubicañ2.setControlX1(-5);
                cubicañ2.setControlY1(-10.39);
                cubicañ2.setControlX2(-13);
                cubicañ2.setControlY2(1.19);
                cubicañ2.setFill(Color.TRANSPARENT);
                cubicañ2.setStroke(dibujar.getColor());
                cubicañ2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicañ2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 3
                cubicañ3.setLayoutX(74.2);
                cubicañ3.setLayoutY(56.5);
                cubicañ3.setStartX(-59.59);
                cubicañ3.setStartY(-14.58);
                cubicañ3.setEndX(-63.2);
                cubicañ3.setEndY(-16.5);
                cubicañ3.setControlX1(-61.2);
                cubicañ3.setControlY1(-10.3);
                cubicañ3.setControlX2(-66);
                cubicañ3.setControlY2(-6.7);
                cubicañ3.setFill(Color.TRANSPARENT);
                cubicañ3.setStroke(dibujar.getColor());
                cubicañ3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicañ3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 4
                cubicañ4.setLayoutX(71.2);
                cubicañ4.setLayoutY(35.5);
                cubicañ4.setStartX(-59.59);
                cubicañ4.setStartY(-14.58);
                cubicañ4.setEndX(-69.19);
                cubicañ4.setEndY(-12.7);
                cubicañ4.setControlX1(-63.2);
                cubicañ4.setControlY1(-8.9);
                cubicañ4.setControlX2(-65.4);
                cubicañ4.setControlY2(-19.89);
                cubicañ4.setFill(Color.TRANSPARENT);
                cubicañ4.setStroke(dibujar.getColor());
                cubicañ4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicañ4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicañ1, cubicañ2, cubicañ3, cubicañ4);
                return fondo;
            case 'o':
                CubicCurve cubicao1 = new CubicCurve();
                CubicCurve cubicao2 = new CubicCurve();
                CubicCurve cubicao3 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                //cubica 1
                cubicao1.setLayoutX(38);
                cubicao1.setLayoutY(44);
                cubicao1.setStartX(-36.7);
                cubicao1.setStartY(-8.21);
                cubicao1.setEndX(-24);
                cubicao1.setEndY(-8.21);
                cubicao1.setControlX1(-33.4);
                cubicao1.setControlY1(-20.4);
                cubicao1.setControlX2(-24);
                cubicao1.setControlY2(-20.4);
                cubicao1.setFill(Color.TRANSPARENT);
                cubicao1.setStroke(dibujar.getColor());
                cubicao1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicao1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica 2
                cubicao2.setLayoutX(38);
                cubicao2.setLayoutY(44.5);
                cubicao2.setStartX(-36.71);
                cubicao2.setStartY(-8.68);
                cubicao2.setEndX(-24.39);
                cubicao2.setEndY(-8.68);
                cubicao2.setControlX1(-39.6);
                cubicao2.setControlY1(7);
                cubicao2.setControlX2(-26.39);
                cubicao2.setControlY2(5.5);
                cubicao2.setFill(Color.TRANSPARENT);
                cubicao2.setStroke(dibujar.getColor());
                cubicao2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicao2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica 2
                cubicao3.setLayoutX(43);
                cubicao3.setLayoutY(52);
                cubicao3.setStartX(-38.93);
                cubicao3.setStartY(-22);
                cubicao3.setEndX(-26);
                cubicao3.setEndY(-19);
                cubicao3.setControlX1(-38.93);
                cubicao3.setControlY1(-15.88);
                cubicao3.setControlX2(-31.6);
                cubicao3.setControlY2(-14);
                cubicao3.setFill(Color.TRANSPARENT);
                cubicao3.setStroke(dibujar.getColor());
                cubicao3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicao3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicao1, cubicao2,cubicao3);
                return fondo;
            case 'p':
                CubicCurve cubicap1 = new CubicCurve();
                CubicCurve cubicap2 = new CubicCurve();
                CubicCurve cubicap3 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                //Cubica
                cubicap1.setLayoutX(13);
                cubicap1.setLayoutY(28);
                cubicap1.setStartX(-8.39);
                cubicap1.setStartY(29.79);
                cubicap1.setEndX(-13.19);
                cubicap1.setEndY(14.4);
                cubicap1.setControlX1(-10.19);
                cubicap1.setControlY1(-27.99);
                cubicap1.setControlX2(-5.19);
                cubicap1.setControlY2(6.79);
                cubicap1.setFill(Color.TRANSPARENT);
                cubicap1.setStroke(dibujar.getColor());
                cubicap1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicap1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubicap2.setLayoutX(13);
                cubicap2.setLayoutY(45);
                cubicap2.setStartX(-7.38);
                cubicap2.setStartY(-2.2);
                cubicap2.setEndX(3.7);
                cubicap2.setEndY(-2.2);
                cubicap2.setControlX1(-14.39);
                cubicap2.setControlY1(-8.8);
                cubicap2.setControlX2(2.39);
                cubicap2.setControlY2(5.79);
                cubicap2.setFill(Color.TRANSPARENT);
                cubicap2.setStroke(dibujar.getColor());
                cubicap2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicap2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 3
                cubicap3.setLayoutX(5);
                cubicap3.setLayoutY(31);
                cubicap3.setStartX(-0.38);
                cubicap3.setStartY(-0.2);
                cubicap3.setEndX(1.2);
                cubicap3.setEndY(12);
                cubicap3.setControlX1(12);
                cubicap3.setControlY1(-14.19);
                cubicap3.setControlX2(15.39);
                cubicap3.setControlY2(12);
                cubicap3.setFill(Color.TRANSPARENT);
                cubicap3.setStroke(dibujar.getColor());
                cubicap3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicap3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicap1, cubicap2, cubicap3);
                return fondo;
            case 'q':
                CubicCurve cubicaq1 = new CubicCurve();
                CubicCurve cubicaq2 = new CubicCurve();
                CubicCurve cubicaq3 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                //Cubica
                cubicaq1.setLayoutX(20);
                cubicaq1.setLayoutY(28);
                cubicaq1.setStartX(-6);
                cubicaq1.setStartY(29.59);
                cubicaq1.setEndX(0.19);
                cubicaq1.setEndY(6.4);
                cubicaq1.setControlX1(-6);
                cubicaq1.setControlY1(-48.59);
                cubicaq1.setControlX2(-8.6);
                cubicaq1.setControlY2(40);
                cubicaq1.setFill(Color.TRANSPARENT);
                cubicaq1.setStroke(dibujar.getColor());
                cubicaq1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaq1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubicaq2.setLayoutX(10);
                cubicaq2.setLayoutY(30);
                cubicaq2.setStartX(2.19);
                cubicaq2.setStartY(11);
                cubicaq2.setEndX(-8.7);
                cubicaq2.setEndY(11);
                cubicaq2.setControlX1(6);
                cubicaq2.setControlY1(5.19);
                cubicaq2.setControlX2(-5.2);
                cubicaq2.setControlY2(19);
                cubicaq2.setFill(Color.TRANSPARENT);
                cubicaq2.setStroke(dibujar.getColor());
                cubicaq2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaq2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 3
                cubicaq3.setLayoutX(5);
                cubicaq3.setLayoutY(29);
                cubicaq3.setStartX(8);
                cubicaq3.setStartY(-1);
                cubicaq3.setEndX(9.6);
                cubicaq3.setEndY(10);
                cubicaq3.setControlX1(-9.39);
                cubicaq3.setControlY1(-9.99);
                cubicaq3.setControlX2(-3.2);
                cubicaq3.setControlY2(21.79);
                cubicaq3.setFill(Color.TRANSPARENT);
                cubicaq3.setStroke(dibujar.getColor());
                cubicaq3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaq3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicaq1, cubicaq2, cubicaq3);
                return fondo;
            case 'r':
                CubicCurve cubicar1 = new CubicCurve();
                CubicCurve cubicar2 = new CubicCurve();
                CubicCurve cubicar3 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                //Cubica
                cubicar1.setLayoutX(-5.6);
                cubicar1.setLayoutY(28);
                cubicar1.setStartX(8.39);
                cubicar1.setStartY(-0.59);
                cubicar1.setEndX(5);
                cubicar1.setEndY(18);
                cubicar1.setControlX1(11);
                cubicar1.setControlY1(13.59);
                cubicar1.setControlX2(6.79);
                cubicar1.setControlY2(16.19);
                cubicar1.setFill(Color.TRANSPARENT);
                cubicar1.setStroke(dibujar.getColor());
                cubicar1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicar1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubicar2.setLayoutX(13);
                cubicar2.setLayoutY(28);
                cubicar2.setStartX(2.6);
                cubicar2.setStartY(-0.8);
                cubicar2.setEndX(5.2);
                cubicar2.setEndY(16);
                cubicar2.setControlX1(-3.39);
                cubicar2.setControlY1(-14.4);
                cubicar2.setControlX2(0.39);
                cubicar2.setControlY2(24.19);
                cubicar2.setFill(Color.TRANSPARENT);
                cubicar2.setStroke(dibujar.getColor());
                cubicar2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicar2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica 3
                cubicar3.setLayoutX(23);
                cubicar3.setLayoutY(37);
                cubicar3.setStartX(-20.6);
                cubicar3.setStartY(-10.18);
                cubicar3.setEndX(-7.17);
                cubicar3.setEndY(-10.18);
                cubicar3.setControlX1(-24.4);
                cubicar3.setControlY1(-6.4);
                cubicar3.setControlX2(-3.99);
                cubicar3.setControlY2(-6.4);
                cubicar3.setFill(Color.TRANSPARENT);
                cubicar3.setStroke(dibujar.getColor());
                cubicar3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicar3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicar1, cubicar2, cubicar3);
                return fondo;
            case 's':
                CubicCurve cubicas1 = new CubicCurve();
                CubicCurve cubicas2 = new CubicCurve();
                CubicCurve cubicas3 = new CubicCurve();
                CubicCurve cubicas4 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                //Cubica
                cubicas1.setLayoutX(6);
                cubicas1.setLayoutY(30);
                cubicas1.setStartX(7.79);
                cubicas1.setStartY(13.79);
                cubicas1.setEndX(-6);
                cubicas1.setEndY(-4.55);
                cubicas1.setControlX1(16.19);
                cubicas1.setControlY1(1);
                cubicas1.setControlX2(-3.6);
                cubicas1.setControlY2(1);
                cubicas1.setFill(Color.TRANSPARENT);
                cubicas1.setStroke(dibujar.getColor());
                cubicas1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicas1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubicas2.setLayoutX(-3);
                cubicas2.setLayoutY(67);
                cubicas2.setStartX(3.22);
                cubicas2.setStartY(-24.4);
                cubicas2.setEndX(3.22);
                cubicas2.setEndY(-40.4);
                cubicas2.setControlX1(5.19);
                cubicas2.setControlY1(-27.4);
                cubicas2.setControlX2(6.79);
                cubicas2.setControlY2(-30.59);
                cubicas2.setFill(Color.TRANSPARENT);
                cubicas2.setStroke(dibujar.getColor());
                cubicas2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicas2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 3
                cubicas3.setLayoutX(10);
                cubicas3.setLayoutY(77);
                cubicas3.setStartX(3.6);
                cubicas3.setStartY(-32.99);
                cubicas3.setEndX(3.6);
                cubicas3.setEndY(-32.99);
                cubicas3.setControlX1(-9.96);
                cubicas3.setControlY1(-33.21);
                cubicas3.setControlX2(-3.6);
                cubicas3.setControlY2(-28);
                cubicas3.setFill(Color.TRANSPARENT);
                cubicas3.setStroke(dibujar.getColor());
                cubicas3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicas3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica 4
                cubicas4.setLayoutX(19);
                cubicas4.setLayoutY(86.2);
                cubicas4.setStartX(-0.8);
                cubicas4.setStartY(-44.6);
                cubicas4.setEndX(-12);
                cubicas4.setEndY(-42);
                cubicas4.setControlX1(-0.8);
                cubicas4.setControlY1(-35);
                cubicas4.setControlX2(-4.2);
                cubicas4.setControlY2(-44.6);
                cubicas4.setFill(Color.TRANSPARENT);
                cubicas4.setStroke(dibujar.getColor());
                cubicas4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicas4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicas1, cubicas2, cubicas3, cubicas4);
                return fondo;
            case 't':
                CubicCurve cubicat1 = new CubicCurve();
                CubicCurve cubicat2 = new CubicCurve();
                Line lineat1 = new Line();
                fondo.setPrefSize(19, 60);
                //Cubica
                cubicat1.setLayoutX(9);
                cubicat1.setLayoutY(25);
                cubicat1.setStartX(-1.99);
                cubicat1.setStartY(19.22);
                cubicat1.setEndX(1.2);
                cubicat1.setEndY(19.22);
                cubicat1.setControlX1(3.6);
                cubicat1.setControlY1(-35);
                cubicat1.setControlX2(-5);
                cubicat1.setControlY2(-35);
                cubicat1.setFill(Color.TRANSPARENT);
                cubicat1.setStroke(dibujar.getColor());
                cubicat1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicat1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica 2
                cubicat2.setLayoutX(76);
                cubicat2.setLayoutY(71);
                cubicat2.setStartX(-66.4);
                cubicat2.setStartY(-31);
                cubicat2.setEndX(-58.39);
                cubicat2.setEndY(-29.4);
                cubicat2.setControlX1(-66.39);
                cubicat2.setControlY1(-21.59);
                cubicat2.setControlX2(-60.39);
                cubicat2.setControlY2(-21.59);
                cubicat2.setFill(Color.TRANSPARENT);
                cubicat2.setStroke(dibujar.getColor());
                cubicat2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicat2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea
                lineat1.setLayoutX(10);
                lineat1.setLayoutY(10);
                lineat1.setStartX(-9.39);
                lineat1.setStartY(3.59);
                lineat1.setEndX(6.39);
                lineat1.setEndY(3.59);
                lineat1.setFill(Color.TRANSPARENT);
                lineat1.setStroke(dibujar.getColor());
                lineat1.setStrokeLineCap(StrokeLineCap.ROUND);
                lineat1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicat1, cubicat2, lineat1);
                return fondo;
            case 'u':
                CubicCurve cubicau1= new CubicCurve();
                CubicCurve cubicau2 = new CubicCurve(); 
                fondo.setPrefSize(19,60);
                //cubica 1
                cubicau1.setLayoutX(36);
                cubicau1.setLayoutY(42);
                cubicau1.setStartX(-33.79);
                cubicau1.setStartY(-16.4);
                cubicau1.setEndX(-23.8);
                cubicau1.setEndY(-16.4);
                cubicau1.setControlX1(-40);
                cubicau1.setControlY1(5.59);
                cubicau1.setControlX2(-23.8);
                cubicau1.setControlY2(16);
                cubicau1.setFill(Color.TRANSPARENT);
                cubicau1.setStroke(dibujar.getColor());
                cubicau1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicau1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                // cubica 2
                cubicau2.setLayoutX(44);
                cubicau2.setLayoutY(57);
                cubicau2.setStartX(-31.8);
                cubicau2.setStartY(-28.59);
                cubicau2.setEndX(-26.39);
                cubicau2.setEndY(-15.59);
                cubicau2.setControlX1(-34);
                cubicau2.setControlY1(-7.95);
                cubicau2.setControlX2(-26.39);
                cubicau2.setControlY2(-7.95);
                cubicau2.setFill(Color.TRANSPARENT);
                cubicau2.setStroke(dibujar.getColor());
                cubicau2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicau2.setStrokeLineJoin(StrokeLineJoin.ROUND);  
                fondo.getChildren().addAll(cubicau1,cubicau2);
                return fondo;
            case 'v':
                CubicCurve cubicav1 = new CubicCurve();
                CubicCurve cubicav2 = new CubicCurve();
                CubicCurve cubicav3 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                //Cubica 1
                cubicav1.setLayoutX(12.89);
                cubicav1.setLayoutY(22.5);
                cubicav1.setStartX(-10.19);
                cubicav1.setStartY(3.8);
                cubicav1.setEndX(-0.89);
                cubicav1.setEndY(7.49);
                cubicav1.setControlX1(-8.1);
                cubicav1.setControlY1(45.1);
                cubicav1.setControlX2(1.34);
                cubicav1.setControlY2(13.29);
                cubicav1.setFill(Color.TRANSPARENT);
                cubicav1.setStroke(dibujar.getColor());
                cubicav1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicav1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica 2
                cubicav2.setLayoutX(65);
                cubicav2.setLayoutY(63.5);
                cubicav2.setStartX(-61.84);
                cubicav2.setStartY(-33.84);
                cubicav2.setEndX(-64.5);
                cubicav2.setEndY(-23.29);
                cubicav2.setControlX1(-61.84);
                cubicav2.setControlY1(-41.8);
                cubicav2.setControlX2(-66.39);
                cubicav2.setControlY2(-41.8);
                cubicav2.setFill(Color.TRANSPARENT);
                cubicav2.setStroke(dibujar.getColor());
                cubicav2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicav2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica3
                cubicav3.setLayoutX(80.2);
                cubicav3.setLayoutY(62);
                cubicav3.setStartX(-62.79);
                cubicav3.setStartY(-33.84);
                cubicav3.setEndX(-67.99);
                cubicav3.setEndY(-32.2);
                cubicav3.setControlX1(-72.79);
                cubicav3.setControlY1(-28.6);
                cubicav3.setControlX2(-76.8);
                cubicav3.setControlY2(-39);
                cubicav3.setFill(Color.TRANSPARENT);
                cubicav3.setStroke(dibujar.getColor());
                cubicav3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicav3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicav1,cubicav2,cubicav3);
                return fondo;
            case 'w':
                CubicCurve cubicaw1 = new CubicCurve();
                CubicCurve cubicaw2 = new CubicCurve();
                CubicCurve cubicaw3 = new CubicCurve();
                CubicCurve cubicaw4 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                //Cubica
                cubicaw1.setLayoutX(88.2);
                cubicaw1.setLayoutY(60);
                cubicaw1.setStartX(-71.19);
                cubicaw1.setStartY(-32.29);
                cubicaw1.setEndX(-75.59);
                cubicaw1.setEndY(-32.29);
                cubicaw1.setControlX1(-83.97);
                cubicaw1.setControlY1(-30.19);
                cubicaw1.setControlX2(-78.39);
                cubicaw1.setControlY2(-36.5);
                cubicaw1.setFill(Color.TRANSPARENT);
                cubicaw1.setStroke(dibujar.getColor());
                cubicaw1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaw1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubicaw2.setLayoutX(8.5);
                cubicaw2.setLayoutY(23);
                cubicaw2.setStartX(-6.4);
                cubicaw2.setStartY(3.8);
                cubicaw2.setEndX(-1.02);
                cubicaw2.setEndY(3.8);
                cubicaw2.setControlX1(-4.5);
                cubicaw2.setControlY1(44.5);
                cubicaw2.setControlX2(2.19);
                cubicaw2.setControlY2(11.9);
                cubicaw2.setFill(Color.TRANSPARENT);
                cubicaw2.setStroke(dibujar.getColor());
                cubicaw2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaw2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 3
                cubicaw3.setLayoutX(64);
                cubicaw3.setLayoutY(63);
                cubicaw3.setStartX(-61.84);
                cubicaw3.setStartY(-33.84);
                cubicaw3.setEndX(-64);
                cubicaw3.setEndY(-23.29);
                cubicaw3.setControlX1(-61.84);
                cubicaw3.setControlY1(-41.8);
                cubicaw3.setControlX2(-66.39);
                cubicaw3.setControlY2(-41.8);
                cubicaw3.setFill(Color.TRANSPARENT);
                cubicaw3.setStroke(dibujar.getColor());
                cubicaw3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaw3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica 4
                cubicaw4.setLayoutX(13.89);
                cubicaw4.setLayoutY(23);
                cubicaw4.setStartX(-6.4);
                cubicaw4.setStartY(3.8);
                cubicaw4.setEndX(-0.88);
                cubicaw4.setEndY(5.14);
                cubicaw4.setControlX1(-4.5);
                cubicaw4.setControlY1(44.5);
                cubicaw4.setControlX2(2.19);
                cubicaw4.setControlY2(11.9);
                cubicaw4.setFill(Color.TRANSPARENT);
                cubicaw4.setStroke(dibujar.getColor());
                cubicaw4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaw4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                 fondo.getChildren().addAll(cubicaw1, cubicaw2, cubicaw3, cubicaw4);
                return fondo;
            case 'x':
                CubicCurve cubicax1 = new CubicCurve();
                CubicCurve cubicax2 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                //Cubica
                cubicax1.setLayoutX(8.5);
                cubicax1.setLayoutY(23);
                cubicax1.setStartX(-8.5);
                cubicax1.setStartY(22.4);
                cubicax1.setEndX(5.7);
                cubicax1.setEndY(2.67);
                cubicax1.setControlX1(-4.29);
                cubicax1.setControlY1(30);
                cubicax1.setControlX2(1.52);
                cubicax1.setControlY2(2.30);
                cubicax1.setFill(Color.TRANSPARENT);
                cubicax1.setStroke(dibujar.getColor());
                cubicax1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicax1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubicax2.setLayoutX(13.89);
                cubicax2.setLayoutY(23.5);
                cubicax2.setStartX(-11.29);
                cubicax2.setStartY(2.9);
                cubicax2.setEndX(3.5);
                cubicax2.setEndY(22.19);
                cubicax2.setControlX1(-6.79);
                cubicax2.setControlY1(0.98);
                cubicax2.setControlX2(-3.9);
                cubicax2.setControlY2(29.19);
                cubicax2.setFill(Color.TRANSPARENT);
                cubicax2.setStroke(dibujar.getColor());
                cubicax2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicax2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicax1, cubicax2);
                return fondo;
            case 'y':
                CubicCurve cubicay1 = new CubicCurve();
                CubicCurve cubicay2 = new CubicCurve();
                CubicCurve cubicay3 = new CubicCurve();
                CubicCurve cubicay4 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                //Cubica
                cubicay1.setLayoutX(10.5);
                cubicay1.setLayoutY(19);
                cubicay1.setStartX(-6.5);
                cubicay1.setStartY(6.19);
                cubicay1.setEndX(1.5);
                cubicay1.setEndY(6.19);
                cubicay1.setControlX1(-10.5);
                cubicay1.setControlY1(28);
                cubicay1.setControlX2(4.9);
                cubicay1.setControlY2(28);
                cubicay1.setFill(Color.TRANSPARENT);
                cubicay1.setStroke(dibujar.getColor());
                cubicay1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicay1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubicay2.setLayoutX(55);
                cubicay2.setLayoutY(55);
                cubicay2.setStartX(-52.79);
                cubicay2.setStartY(-2.91);
                cubicay2.setEndX(-42.39);
                cubicay2.setEndY(-23.8);
                cubicay2.setControlX1(-55.39);
                cubicay2.setControlY1(10.59);
                cubicay2.setControlX2(-40.2);
                cubicay2.setControlY2(-0.2);
                cubicay2.setFill(Color.TRANSPARENT);
                cubicay2.setStroke(dibujar.getColor());
                cubicay2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicay2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 3
                cubicay3.setLayoutX(59);
                cubicay3.setLayoutY(69);
                cubicay3.setStartX(-56.89);
                cubicay3.setStartY(-17);
                cubicay3.setEndX(-42.5);
                cubicay3.setEndY(-33.8);
                cubicay3.setControlX1(-53.79);
                cubicay3.setControlY1(-27.14);
                cubicay3.setControlX2(-45.43);
                cubicay3.setControlY2(-27.14);
                cubicay3.setFill(Color.TRANSPARENT);
                cubicay3.setStroke(dibujar.getColor());
                cubicay3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicay3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica 4
                cubicay4.setLayoutX(66.2);
                cubicay4.setLayoutY(63);
                cubicay4.setStartX(-61.99);
                cubicay4.setStartY(-37.2);
                cubicay4.setEndX(-64);
                cubicay4.setEndY(-23.39);
                cubicay4.setControlX1(-61.84);
                cubicay4.setControlY1(-41.9);
                cubicay4.setControlX2(-66.39);
                cubicay4.setControlY2(-41.8);
                cubicay4.setFill(Color.TRANSPARENT);
                cubicay4.setStroke(dibujar.getColor());
                cubicay4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicay4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicay1, cubicay2, cubicay3, cubicay4);
                return fondo;
            case 'z':
                CubicCurve cubicaz1 = new CubicCurve();
                CubicCurve cubicaz2 = new CubicCurve();
                CubicCurve cubicaz3 = new CubicCurve();
                CubicCurve cubicaz4 = new CubicCurve();
                fondo.setPrefSize(19, 60);
                //Cubica
                cubicaz1.setLayoutX(8.5);
                cubicaz1.setLayoutY(28);
                cubicaz1.setStartX(-6.9);
                cubicaz1.setStartY(6);
                cubicaz1.setEndX(-0.9);
                cubicaz1.setEndY(9);
                cubicaz1.setControlX1(-0.9);
                cubicaz1.setControlY1(-5.99);
                cubicaz1.setControlX2(14.5);
                cubicaz1.setControlY2(-2);
                cubicaz1.setFill(Color.TRANSPARENT);
                cubicaz1.setStroke(dibujar.getColor());
                cubicaz1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaz1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubicaz2.setLayoutX(54);
                cubicaz2.setLayoutY(55);
                cubicaz2.setStartX(-52.79);
                cubicaz2.setStartY(-2.91);
                cubicaz2.setEndX(-41);
                cubicaz2.setEndY(-15.8);
                cubicaz2.setControlX1(-55.39);
                cubicaz2.setControlY1(10.59);
                cubicaz2.setControlX2(-46.2);
                cubicaz2.setControlY2(-2.91);
                cubicaz2.setFill(Color.TRANSPARENT);
                cubicaz2.setStroke(dibujar.getColor());
                cubicaz2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaz2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubic 3
                cubicaz3.setLayoutX(58);
                cubicaz3.setLayoutY(69);
                cubicaz3.setStartX(-56.89);
                cubicaz3.setStartY(-17);
                cubicaz3.setEndX(-40.59);
                cubicaz3.setEndY(-29.2);
                cubicaz3.setControlX1(-52.14);
                cubicaz3.setControlY1(-32.34);
                cubicaz3.setControlX2(-45.79);
                cubicaz3.setControlY2(-20.4);
                cubicaz3.setFill(Color.TRANSPARENT);
                cubicaz3.setStroke(dibujar.getColor());
                cubicaz3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaz3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica4
                cubicaz4.setLayoutX(15.5);
                cubicaz4.setLayoutY(30);
                cubicaz4.setStartX(-8.29);
                cubicaz4.setStartY(7.04);
                cubicaz4.setEndX(-3.5);
                cubicaz4.setEndY(12);
                cubicaz4.setControlX1(-14.62);
                cubicaz4.setControlY1(8.2);
                cubicaz4.setControlX2(3.9);
                cubicaz4.setControlY2(-0.59);
                cubicaz4.setFill(Color.TRANSPARENT);
                cubicaz4.setStroke(dibujar.getColor());
                cubicaz4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaz4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubicaz1, cubicaz2, cubicaz3, cubicaz4);
                return fondo;
            case ' ':
                
                return fondo;
            case '!':
                Ellipse elipse = new Ellipse();
                Circle circulo = new Circle();

                //Elipse
                elipse.setRadiusX(1);
                elipse.setRadiusY(20);
                elipse.setFill(dibujar.getColor());
                elipse.setStroke(dibujar.getColor());
                elipse.setLayoutX(11);
                elipse.setLayoutY(24);
                //Circulo
                circulo.setRadius(2);
                circulo.setFill(dibujar.getColor());
                circulo.setStroke(dibujar.getColor());
                circulo.setLayoutX(11);
                circulo.setLayoutY(50);
                fondo.getChildren().addAll(elipse, circulo);
                return fondo;
            case '¡':
                Ellipse elipse1 = new Ellipse();
                Circle circulo1 = new Circle();
                //Elipse
                elipse1.setRadiusX(1);
                elipse1.setRadiusY(20);
                elipse1.setFill(dibujar.getColor());
                elipse1.setStroke(dibujar.getColor());
                elipse1.setLayoutX(11);
                elipse1.setLayoutY(32);
                //Circulo
                circulo1.setRadius(2);
                circulo1.setFill(dibujar.getColor());
                circulo1.setStroke(dibujar.getColor());
                circulo1.setLayoutX(11);
                circulo1.setLayoutY(5);
                fondo.getChildren().addAll(elipse1, circulo1);
                return fondo;
            case '¿':
                CubicCurve cubica = new CubicCurve();
                Line linea1 = new Line();
                Circle circulo2 = new Circle();
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
                cubica.setStroke(dibujar.getColor());
                cubica.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea
                linea1.setLayoutX(21);
                linea1.setLayoutY(25);
                linea1.setStartX(3.8);
                linea1.setStartY(-13);
                linea1.setEndX(3.8);
                linea1.setEndY(7.8);
                linea1.setFill(Color.TRANSPARENT);
                linea1.setStroke(dibujar.getColor());
                linea1.setStrokeLineCap(StrokeLineCap.ROUND);
                linea1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Circulo
                circulo2.setRadius(3);
                circulo2.setFill(dibujar.getColor());
                circulo2.setStroke(dibujar.getColor());
                circulo2.setLayoutX(25);
                circulo2.setLayoutY(6);
                fondo.getChildren().addAll(cubica, linea1, circulo2);
                return fondo;
            case '?':
                CubicCurve cubica1 = new CubicCurve();
                Line linea2 = new Line();
                Circle circulo3 = new Circle();
                fondo.setPrefSize(34, 60);
                //Cubica
                cubica1.setLayoutX(-7);
                cubica1.setLayoutY(29);
                cubica1.setStartX(13.33);
                cubica1.setStartY(-24.19);
                cubica1.setEndX(13.33);
                cubica1.setEndY(-4.46);
                cubica1.setControlX1(36.19);
                cubica1.setControlY1(-35.93);
                cubica1.setControlX2(36.19);
                cubica1.setControlY2(4.59);
                cubica1.setFill(Color.TRANSPARENT);
                cubica1.setStroke(dibujar.getColor());
                cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea
                linea2.setLayoutX(2);
                linea2.setLayoutY(37);
                linea2.setStartX(3.8);
                linea2.setStartY(-13);
                linea2.setEndX(3.8);
                linea2.setEndY(7.8);
                linea2.setFill(Color.TRANSPARENT);
                linea2.setStroke(dibujar.getColor());
                linea2.setStrokeLineCap(StrokeLineCap.ROUND);
                linea2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Circulo
                circulo3.setRadius(3);
                circulo3.setFill(dibujar.getColor());
                circulo3.setStroke(dibujar.getColor());
                circulo3.setLayoutX(6);
                circulo3.setLayoutY(51);
                fondo.getChildren().addAll(cubica1, linea2, circulo3);
                return fondo;
            case '.':
                Circle circulo4 = new Circle();
                //Atributos del fondo
                fondo.setPrefSize(22, 60);
                //Circulo
                circulo4.setRadius(3);
                circulo4.setFill(dibujar.getColor());
                circulo4.setStroke(dibujar.getColor());
                circulo4.setLayoutX(9);
                circulo4.setLayoutY(47);
                fondo.getChildren().addAll(circulo4);
                return fondo;
            case ',':
                Circle circulo5 = new Circle();
                QuadCurve cuadratica = new QuadCurve();
                fondo.setPrefSize(22, 60);
                //Circulo
                circulo5.setRadius(2);
                circulo5.setFill(dibujar.getColor());
                circulo5.setStroke(dibujar.getColor());
                circulo5.setLayoutX(9);
                circulo5.setLayoutY(47);
                //Cuadratica
                cuadratica.setLayoutX(18);
                cuadratica.setLayoutY(77);
                cuadratica.setStartX(-9.39);
                cuadratica.setStartY(-20.59);
                cuadratica.setEndX(-7.62);
                cuadratica.setEndY(-31);
                cuadratica.setControlX(-5.8);
                cuadratica.setControlY(-25.4);
                cuadratica.setFill(Color.TRANSPARENT);
                cuadratica.setStroke(dibujar.getColor());
                cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
                cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(circulo5, cuadratica);
                return fondo;
            case ';':
                Circle circulo6 = new Circle();
                Circle circulo7 = new Circle();
                QuadCurve cuadratica1 = new QuadCurve();
                fondo.setPrefSize(22, 60);
                //Circulo
                circulo6.setRadius(2);
                circulo6.setFill(dibujar.getColor());
                circulo6.setStroke(dibujar.getColor());
                circulo6.setLayoutX(9);
                circulo6.setLayoutY(34);
                //Circulo2
                circulo7.setRadius(2);
                circulo7.setFill(dibujar.getColor());
                circulo7.setStroke(dibujar.getColor());
                circulo7.setLayoutX(9);
                circulo7.setLayoutY(47);
                //Cuadratica
                cuadratica1.setLayoutX(18);
                cuadratica1.setLayoutY(77);
                cuadratica1.setStartX(-9.39);
                cuadratica1.setStartY(-20.59);
                cuadratica1.setEndX(-7.62);
                cuadratica1.setEndY(-31);
                cuadratica1.setControlX(-5.8);
                cuadratica1.setControlY(-25.4);
                cuadratica1.setFill(Color.TRANSPARENT);
                cuadratica1.setStroke(dibujar.getColor());
                cuadratica1.setStrokeLineCap(StrokeLineCap.ROUND);
                cuadratica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(circulo6, cuadratica1, circulo7);
                return fondo;
            case ':':
                Circle circulo8 = new Circle();
                Circle circulo9 = new Circle();
                fondo.setPrefSize(22, 60);
                //Circulo
                circulo8.setRadius(2);
                circulo8.setFill(dibujar.getColor());
                circulo8.setStroke(dibujar.getColor());
                circulo8.setLayoutX(9);
                circulo8.setLayoutY(34);
                //Circulo2
                circulo9.setRadius(2);
                circulo9.setFill(dibujar.getColor());
                circulo9.setStroke(dibujar.getColor());
                circulo9.setLayoutX(9);
                circulo9.setLayoutY(47);
                fondo.getChildren().addAll(circulo8, circulo9);
                return fondo;
            case '(':
                QuadCurve cubica2 = new QuadCurve();
                fondo.setPrefSize(22, 60);
                //Cubica
                cubica2.setLayoutX(20);
                cubica2.setLayoutY(55);
                cubica2.setStartX(-6.6);
                cubica2.setStartY(1.8);
                cubica2.setEndX(-6.6);
                cubica2.setEndY(-51.8);
                cubica2.setControlX(-29.3);
                cubica2.setControlY(-25.8);
                cubica2.setFill(Color.TRANSPARENT);
                cubica2.setStroke(dibujar.getColor());
                cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubica2);
                return fondo;
            case ')':
                QuadCurve cubica3 = new QuadCurve();
                fondo.setPrefSize(22, 60);
                //Cubica
                cubica3.setLayoutX(9);
                cubica3.setLayoutY(55);
                cubica3.setStartX(-6.6);
                cubica3.setStartY(1.8);
                cubica3.setEndX(-6.6);
                cubica3.setEndY(-51.8);
                cubica3.setControlX(14.6);
                cubica3.setControlY(-25);
                cubica3.setFill(Color.TRANSPARENT);
                cubica3.setStroke(dibujar.getColor());
                cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubica3);
                return fondo;
            case '[':
                Line linea3 = new Line();
                Line linea4 = new Line();
                Line linea5 = new Line();
                fondo.setPrefSize(34, 60);
                //Linea Vertical
                linea3.setLayoutX(18);
                linea3.setLayoutY(34);
                linea3.setStartX(-13.6);
                linea3.setStartY(-27.6);
                linea3.setEndX(-13.69);
                linea3.setEndY(21.39);
                linea3.setFill(Color.TRANSPARENT);
                linea3.setStroke(dibujar.getColor());
                linea3.setStrokeLineCap(StrokeLineCap.ROUND);
                linea3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea Superior
                linea4.setLayoutX(14);
                linea4.setLayoutY(26);
                linea4.setStartX(-9.19);
                linea4.setStartY(-19.6);
                linea4.setEndX(8.8);
                linea4.setEndY(-19.6);
                linea4.setFill(Color.TRANSPARENT);
                linea4.setStroke(dibujar.getColor());
                linea4.setStrokeLineCap(StrokeLineCap.ROUND);
                linea4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea Inferior
                linea5.setLayoutX(14);
                linea5.setLayoutY(75);
                linea5.setStartX(-9.19);
                linea5.setStartY(-19.6);
                linea5.setEndX(8.8);
                linea5.setEndY(-19.6);
                linea5.setFill(Color.TRANSPARENT);
                linea5.setStroke(dibujar.getColor());
                linea5.setStrokeLineCap(StrokeLineCap.ROUND);
                linea5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(linea3, linea4, linea5);
                return fondo;
            case ']':
                Line linea6 = new Line();
                Line linea7 = new Line();
                Line linea8 = new Line();
                fondo.setPrefSize(34, 60);
                //Linea Vertical
                linea6.setLayoutX(44);
                linea6.setLayoutY(34);
                linea6.setStartX(-13.6);
                linea6.setStartY(-27.6);
                linea6.setEndX(-13.69);
                linea6.setEndY(21.39);
                linea6.setFill(Color.TRANSPARENT);
                linea6.setStroke(dibujar.getColor());
                linea6.setStrokeLineCap(StrokeLineCap.ROUND);
                linea6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea Superior
                linea7.setLayoutX(21);
                linea7.setLayoutY(26);
                linea7.setStartX(-9.19);
                linea7.setStartY(-19.6);
                linea7.setEndX(8.8);
                linea7.setEndY(-19.6);
                linea7.setFill(Color.TRANSPARENT);
                linea7.setStroke(dibujar.getColor());
                linea7.setStrokeLineCap(StrokeLineCap.ROUND);
                linea7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea Inferior
                linea8.setLayoutX(21);
                linea8.setLayoutY(75);
                linea8.setStartX(-9.19);
                linea8.setStartY(-19.6);
                linea8.setEndX(8.8);
                linea8.setEndY(-19.6);
                linea8.setFill(Color.TRANSPARENT);
                linea8.setStroke(dibujar.getColor());
                linea8.setStrokeLineCap(StrokeLineCap.ROUND);
                linea8.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(linea6, linea7, linea8);
                return fondo;
            case '{':
                CubicCurve cubica4 = new CubicCurve();
                CubicCurve cubica5 = new CubicCurve();
                fondo.setPrefSize(34, 60);
                //Cubica superior
                cubica4.setLayoutX(4);
                cubica4.setLayoutY(29);
                cubica4.setStartX(-0.2);
                cubica4.setStartY(1);
                cubica4.setEndX(17);
                cubica4.setEndY(-24.6);
                cubica4.setControlX1(17);
                cubica4.setControlY1(1);
                cubica4.setControlX2(-4.2);
                cubica4.setControlY2(-24.6);
                cubica4.setFill(Color.TRANSPARENT);
                cubica4.setStroke(dibujar.getColor());
                cubica4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica Inferior
                cubica5.setLayoutX(7);
                cubica5.setLayoutY(45);
                cubica5.setStartX(13.59);
                cubica5.setStartY(10.59);
                cubica5.setEndX(-4.2);
                cubica5.setEndY(-14);
                cubica5.setControlX1(-0.79);
                cubica5.setControlY1(10.59);
                cubica5.setControlX2(13.59);
                cubica5.setControlY2(-14);
                cubica5.setFill(Color.TRANSPARENT);
                cubica5.setStroke(dibujar.getColor());
                cubica5.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubica4, cubica5);
                return fondo;
            case '}':
                CubicCurve cubica6 = new CubicCurve();
                CubicCurve cubica7 = new CubicCurve();
                fondo.setPrefSize(34, 60);
                //Cubica superior
                cubica6.setLayoutX(11);
                cubica6.setLayoutY(15);
                cubica6.setStartX(11.08);
                cubica6.setStartY(15);
                cubica6.setEndX(-9.39);
                cubica6.setEndY(-11.4);
                cubica6.setControlX1(-8.12);
                cubica6.setControlY1(15);
                cubica6.setControlX2(11.08);
                cubica6.setControlY2(-11.4);
                cubica6.setFill(Color.TRANSPARENT);
                cubica6.setStroke(dibujar.getColor());
                cubica6.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica Inferior
                cubica7.setLayoutX(15);
                cubica7.setLayoutY(36);
                cubica7.setStartX(-11);
                cubica7.setStartY(20.39);
                cubica7.setEndX(8.21);
                cubica7.setEndY(-4.86);
                cubica7.setControlX1(8.21);
                cubica7.setControlY1(20.39);
                cubica7.setControlX2(-11);
                cubica7.setControlY2(-4.86);
                cubica7.setFill(Color.TRANSPARENT);
                cubica7.setStroke(dibujar.getColor());
                cubica7.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(cubica6, cubica7);
                return fondo;
            case '-':
                Line linea9 = new Line();
                fondo.setPrefSize(34, 60);
                linea9.setLayoutX(17);
                linea9.setLayoutY(25);
                linea9.setStartX(-14);
                linea9.setStartY(5);
                linea9.setEndX(14);
                linea9.setEndY(5);
                linea9.setFill(Color.TRANSPARENT);
                linea9.setStroke(dibujar.getColor());
                linea9.setStrokeLineCap(StrokeLineCap.ROUND);
                linea9.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(linea9);
                return fondo;
            case '_':
                Line linea10 = new Line();      
                fondo.setPrefSize(34, 60);
                linea10.setLayoutX(13);
                linea10.setLayoutY(50);
                linea10.setStartX(-10);
                linea10.setStartY(5);
                linea10.setEndX(15.2);
                linea10.setEndY(5);
                linea10.setFill(Color.TRANSPARENT);
                linea10.setStroke(dibujar.getColor());
                linea10.setStrokeLineCap(StrokeLineCap.ROUND);
                linea10.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(linea10);
                return fondo;
            case 39:
                Circle circulo10 = new Circle();
                QuadCurve cuadratica2 = new QuadCurve();
                fondo.setPrefSize(22, 60);
                //Circulo
                circulo10.setRadius(2);
                circulo10.setFill(dibujar.getColor());
                circulo10.setStroke(dibujar.getColor());
                circulo10.setLayoutX(9);
                circulo10.setLayoutY(5);
                //Cuadratica
                cuadratica2.setLayoutX(15);
                cuadratica2.setLayoutY(36);
                cuadratica2.setStartX(-4.8);
                cuadratica2.setStartY(-23);
                cuadratica2.setEndX(-7.62);
                cuadratica2.setEndY(-31);
                cuadratica2.setControlX(-7.62);
                cuadratica2.setControlY(-26);
                cuadratica2.setFill(Color.TRANSPARENT);
                cuadratica2.setStroke(dibujar.getColor());
                cuadratica2.setStrokeLineCap(StrokeLineCap.ROUND);
                cuadratica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(circulo10, cuadratica2);
                return fondo;
            case '"':
                Circle circulo11 = new Circle();
                QuadCurve cuadratica3 = new QuadCurve();
                Circle circulo12 = new Circle();
                QuadCurve cuadratica4 = new QuadCurve();
                fondo.setPrefSize(22, 60);
                //Circulo
                circulo11.setRadius(2);
                circulo11.setFill(dibujar.getColor());
                circulo11.setStroke(dibujar.getColor());
                circulo11.setLayoutX(6);
                circulo11.setLayoutY(5);
                //Circulo2
                circulo12.setRadius(2);
                circulo12.setFill(dibujar.getColor());
                circulo12.setStroke(dibujar.getColor());
                circulo12.setLayoutX(12);
                circulo12.setLayoutY(5);
                //Cuadratica
                cuadratica3.setLayoutX(12);
                cuadratica3.setLayoutY(36);
                cuadratica3.setStartX(-4.8);
                cuadratica3.setStartY(-23);
                cuadratica3.setEndX(-7.62);
                cuadratica3.setEndY(-31);
                cuadratica3.setControlX(-7.62);
                cuadratica3.setControlY(-26);
                cuadratica3.setFill(Color.TRANSPARENT);
                cuadratica3.setStroke(dibujar.getColor());
                cuadratica3.setStrokeLineCap(StrokeLineCap.ROUND);
                cuadratica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cuadratica2
                cuadratica4.setLayoutX(18);
                cuadratica4.setLayoutY(36);
                cuadratica4.setStartX(-4.8);
                cuadratica4.setStartY(-23);
                cuadratica4.setEndX(-7.62);
                cuadratica4.setEndY(-31);
                cuadratica4.setControlX(-7.62);
                cuadratica4.setControlY(-26);
                cuadratica4.setFill(Color.TRANSPARENT);
                cuadratica4.setStroke(dibujar.getColor());
                cuadratica4.setStrokeLineCap(StrokeLineCap.ROUND);
                cuadratica4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(circulo11, cuadratica3, circulo12, cuadratica4);
                return fondo;
            case '«':
                Line linea11 = new Line();
                Line linea12 = new Line();
                Line linea13 = new Line();
                Line linea14 = new Line();
                fondo.setPrefSize(34, 60);
                //Linea 1
                linea11.setLayoutX(11);
                linea11.setLayoutY(31);
                linea11.setStartX(-9.19);
                linea11.setStartY(0);
                linea11.setEndX(4);
                linea11.setEndY(-9);
                linea11.setFill(Color.TRANSPARENT);
                linea11.setStroke(dibujar.getColor());
                linea11.setStrokeLineCap(StrokeLineCap.ROUND);
                linea11.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea 2
                linea12.setLayoutX(11);
                linea12.setLayoutY(31);
                linea12.setStartX(-9.19);
                linea12.setStartY(0);
                linea12.setEndX(4);
                linea12.setEndY(9);
                linea12.setFill(Color.TRANSPARENT);
                linea12.setStroke(dibujar.getColor());
                linea12.setStrokeLineCap(StrokeLineCap.ROUND);
                linea12.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea 3
                linea13.setLayoutX(21);
                linea13.setLayoutY(31);
                linea13.setStartX(-9.19);
                linea13.setStartY(0);
                linea13.setEndX(4);
                linea13.setEndY(-9);
                linea13.setFill(Color.TRANSPARENT);
                linea13.setStroke(dibujar.getColor());
                linea13.setStrokeLineCap(StrokeLineCap.ROUND);
                linea13.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea 4
                linea14.setLayoutX(21);
                linea14.setLayoutY(31);
                linea14.setStartX(-9.19);
                linea14.setStartY(0);
                linea14.setEndX(4);
                linea14.setEndY(9);
                linea14.setFill(Color.TRANSPARENT);
                linea14.setStroke(dibujar.getColor());
                linea14.setStrokeLineCap(StrokeLineCap.ROUND);
                linea14.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(linea11, linea12, linea13, linea14);
                return fondo;
            case '»':
                Line linea15 = new Line();
                Line linea16 = new Line();
                Line linea17 = new Line();
                Line linea18 = new Line();
                fondo.setPrefSize(34, 60);
                //Linea 1
                linea15.setLayoutX(9);
                linea15.setLayoutY(31);
                linea15.setStartX(7);
                linea15.setStartY(0);
                linea15.setEndX(-4);
                linea15.setEndY(-9);
                linea15.setFill(Color.TRANSPARENT);
                linea15.setStroke(dibujar.getColor());
                linea15.setStrokeLineCap(StrokeLineCap.ROUND);
                linea15.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea 2
                linea16.setLayoutX(9);
                linea16.setLayoutY(31);
                linea16.setStartX(7);
                linea16.setStartY(0);
                linea16.setEndX(-4);
                linea16.setEndY(9);
                linea16.setFill(Color.TRANSPARENT);
                linea16.setStroke(dibujar.getColor());
                linea16.setStrokeLineCap(StrokeLineCap.ROUND);
                linea16.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea 3
                linea17.setLayoutX(19);
                linea17.setLayoutY(31);
                linea17.setStartX(7);
                linea17.setStartY(0);
                linea17.setEndX(-4);
                linea17.setEndY(-9);
                linea17.setFill(Color.TRANSPARENT);
                linea17.setStroke(dibujar.getColor());
                linea17.setStrokeLineCap(StrokeLineCap.ROUND);
                linea17.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea 4
                linea18.setLayoutX(19);
                linea18.setLayoutY(31);
                linea18.setStartX(7);
                linea18.setStartY(0);
                linea18.setEndX(-4);
                linea18.setEndY(9);
                linea18.setFill(Color.TRANSPARENT);
                linea18.setStroke(dibujar.getColor());
                linea18.setStrokeLineCap(StrokeLineCap.ROUND);
                linea18.setStrokeLineJoin(StrokeLineJoin.ROUND);
                fondo.getChildren().addAll(linea15, linea16, linea17, linea18);
                return fondo;
            case '^':
                // Se debe hacer diseño de nuevo símbolo
                return fondo;
            case '+':
                // Se debe hacer diseño de nuevo símbolo
                return fondo;
            default:
                return null;
        }
    }
    
}