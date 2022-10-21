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
                CubicCurve cubicaA2= new CubicCurve(-33,16.39,-27.6,38,-17.39,-17,3.79,-21.95);
                
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
                    Line subA = new Line();
                    subA.setStartX(45); //tamaño A es 45
                    subA.setLayoutX(0);
                    subA.setLayoutY(55);
                    fondo.getChildren().add(subA);
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
                CubicCurve cubicaB1 = new CubicCurve(-16.6,17,0.19,23.4,-6.8,-33,11.19,-24.8);
                CubicCurve cubicaB2 = new CubicCurve(-25.84,-3.8,-21.99,-22.99,27.19,-7.6,-1.1,7.8);
                CubicCurve cubicaB3 = new CubicCurve(-17.4,8.79,-4,22.59,16.4,-1.8,-8,-9);
                CubicCurve cubicaB4 = new CubicCurve(0.59,-31.3,-5,-15.59,23,-24.5,11.79,-35.5);

                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x

                //Atributos Lineas
                cubicaB1.setLayoutX(25);
                cubicaB1.setLayoutY(33);
                cubicaB1.setFill(Color.TRANSPARENT);
                cubicaB1.setStroke(dibujar.getColor());
                cubicaB1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaB1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //
                cubicaB2.setLayoutX(30);
                cubicaB2.setLayoutY(21);
                cubicaB2.setFill(Color.TRANSPARENT);
                cubicaB2.setStroke(dibujar.getColor());
                cubicaB2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaB2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //
                cubicaB3.setLayoutX(37);
                cubicaB3.setLayoutY(38);
                cubicaB3.setFill(Color.TRANSPARENT);
                cubicaB3.setStroke(dibujar.getColor());
                cubicaB3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaB3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //
                cubicaB4.setLayoutX(4);
                cubicaB4.setLayoutY(47.5);
                cubicaB4.setFill(Color.TRANSPARENT);
                cubicaB4.setStroke(dibujar.getColor());
                cubicaB4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaB4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    
                    CubicCurve anchoB1 = new CubicCurve(cubicaB1.getStartX(),cubicaB1.getStartY(),cubicaB1.getControlX1(),cubicaB1.getControlY1(),cubicaB1.getControlX2(),cubicaB1.getControlY2(),cubicaB1.getEndX(),cubicaB1.getEndY());
                    anchoB1.setLayoutX(25);
                    anchoB1.setLayoutY(33);
                    anchoB1.setFill(Color.TRANSPARENT);
                    anchoB1.setStroke(dibujar.getColor());
                    anchoB1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoB1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoB1.setTranslateX(1);
                    
                    CubicCurve anchoB2 = new CubicCurve(cubicaB1.getStartX(),cubicaB1.getStartY(),cubicaB1.getControlX1(),cubicaB1.getControlY1(),cubicaB1.getControlX2(),cubicaB1.getControlY2(),cubicaB1.getEndX(),cubicaB1.getEndY());
                    anchoB2.setLayoutX(25);
                    anchoB2.setLayoutY(33);
                    anchoB2.setFill(Color.TRANSPARENT);
                    anchoB2.setStroke(dibujar.getColor());
                    anchoB2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoB2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoB2.setTranslateY(1);
                    
                    CubicCurve anchoB3 = new CubicCurve(cubicaB2.getStartX(),cubicaB2.getStartY(),cubicaB2.getControlX1(),cubicaB2.getControlY1(),cubicaB2.getControlX2(),cubicaB2.getControlY2(),cubicaB2.getEndX(),cubicaB2.getEndY());
                    anchoB3.setLayoutX(30);
                    anchoB3.setLayoutY(21);
                    anchoB3.setFill(Color.TRANSPARENT);
                    anchoB3.setStroke(dibujar.getColor());
                    anchoB3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoB3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoB3.setTranslateX(1);
                    
                    CubicCurve anchoB4 = new CubicCurve(cubicaB2.getStartX(),cubicaB2.getStartY(),cubicaB2.getControlX1(),cubicaB2.getControlY1(),cubicaB2.getControlX2(),cubicaB2.getControlY2(),cubicaB2.getEndX(),cubicaB2.getEndY());
                    anchoB4.setLayoutX(30);
                    anchoB4.setLayoutY(21);
                    anchoB4.setFill(Color.TRANSPARENT);
                    anchoB4.setStroke(dibujar.getColor());
                    anchoB4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoB4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoB4.setTranslateY(1);
                    
                    CubicCurve anchoB5 = new CubicCurve(cubicaB3.getStartX(),cubicaB3.getStartY(),cubicaB3.getControlX1(),cubicaB3.getControlY1(),cubicaB3.getControlX2(),cubicaB3.getControlY2(),cubicaB3.getEndX(),cubicaB3.getEndY());
                    anchoB5.setLayoutX(37);
                    anchoB5.setLayoutY(38);
                    anchoB5.setFill(Color.TRANSPARENT);
                    anchoB5.setStroke(dibujar.getColor());
                    anchoB5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoB5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoB5.setTranslateX(1);
                    
                    CubicCurve anchoB6 = new CubicCurve(cubicaB3.getStartX(),cubicaB3.getStartY(),cubicaB3.getControlX1(),cubicaB3.getControlY1(),cubicaB3.getControlX2(),cubicaB3.getControlY2(),cubicaB3.getEndX(),cubicaB3.getEndY());
                    anchoB6.setLayoutX(37);
                    anchoB6.setLayoutY(38);
                    anchoB6.setFill(Color.TRANSPARENT);
                    anchoB6.setStroke(dibujar.getColor());
                    anchoB6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoB6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoB6.setTranslateY(1);
                    
                    CubicCurve anchoB7 = new CubicCurve(cubicaB4.getStartX(),cubicaB4.getStartY(),cubicaB4.getControlX1(),cubicaB4.getControlY1(),cubicaB4.getControlX2(),cubicaB4.getControlY2(),cubicaB4.getEndX(),cubicaB4.getEndY());
                    anchoB7.setLayoutX(4);
                    anchoB7.setLayoutY(47.5);
                    anchoB7.setFill(Color.TRANSPARENT);
                    anchoB7.setStroke(dibujar.getColor());
                    anchoB7.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoB7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoB7.setTranslateX(1);
                    
                    CubicCurve anchoB8 = new CubicCurve(cubicaB4.getStartX(),cubicaB4.getStartY(),cubicaB4.getControlX1(),cubicaB4.getControlY1(),cubicaB4.getControlX2(),cubicaB4.getControlY2(),cubicaB4.getEndX(),cubicaB4.getEndY());
                    anchoB8.setLayoutX(4);
                    anchoB8.setLayoutY(47.5);
                    anchoB8.setFill(Color.TRANSPARENT);
                    anchoB8.setStroke(dibujar.getColor());
                    anchoB8.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoB8.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoB8.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoB1,anchoB2,anchoB3,anchoB4,anchoB5,anchoB6,anchoB7,anchoB8);
                }
                
                if (palabra.isS()){
                    Line subB = new Line();
                    subB.setStartX(45); //tamaño B es 45
                    subB.setLayoutX(0);
                    subB.setLayoutY(55);
                    fondo.getChildren().add(subB);
                }
                
                if (dibujar.getControl()){
                    Circle pB1 = new Circle(cubicaB1.getStartX(),cubicaB1.getStartY(),2,Color.RED);
                    pB1.setLayoutX(25);
                    pB1.setLayoutY(33);
                    Circle pB2 = new Circle(cubicaB1.getControlX1(),cubicaB1.getControlY1(),2,Color.RED);
                    pB2.setLayoutX(25);
                    pB2.setLayoutY(33);
                    Circle pB3 = new Circle(cubicaB1.getControlX2(),cubicaB1.getControlY2(),2,Color.RED);
                    pB3.setLayoutX(25);
                    pB3.setLayoutY(33);
                    Circle pB4 = new Circle(cubicaB1.getEndX(),cubicaB1.getEndY(),2,Color.RED);
                    pB4.setLayoutX(25);
                    pB4.setLayoutY(33);
                    
                    Circle pB5 = new Circle(cubicaB2.getStartX(),cubicaB2.getStartY(),2,Color.RED);
                    pB5.setLayoutX(30);
                    pB5.setLayoutY(21);
                    Circle pB6 = new Circle(cubicaB2.getControlX1(),cubicaB2.getControlY1(),2,Color.RED);
                    pB6.setLayoutX(30);
                    pB6.setLayoutY(21);
                    Circle pB7 = new Circle(cubicaB2.getControlX2(),cubicaB2.getControlY2(),2,Color.RED);
                    pB7.setLayoutX(30);
                    pB7.setLayoutY(21);
                    Circle pB8 = new Circle(cubicaB2.getEndX(),cubicaB2.getEndY(),2,Color.RED);
                    pB8.setLayoutX(30);
                    pB8.setLayoutY(21);
                    
                    Circle pB9 = new Circle(cubicaB3.getStartX(),cubicaB3.getStartY(),2,Color.RED);
                    pB9.setLayoutX(37);
                    pB9.setLayoutY(38);
                    Circle pB10 = new Circle(cubicaB3.getControlX1(),cubicaB3.getControlY1(),2,Color.RED);
                    pB10.setLayoutX(37);
                    pB10.setLayoutY(38);
                    Circle pB11 = new Circle(cubicaB3.getControlX2(),cubicaB3.getControlY2(),2,Color.RED);
                    pB11.setLayoutX(37);
                    pB11.setLayoutY(38);
                    Circle pB12 = new Circle(cubicaB3.getEndX(),cubicaB3.getEndY(),2,Color.RED);
                    pB12.setLayoutX(37);
                    pB12.setLayoutY(38);
                    
                    Circle pB13 = new Circle(cubicaB4.getStartX(),cubicaB4.getStartY(),2,Color.RED);
                    pB13.setLayoutX(4);
                    pB13.setLayoutY(47.5);
                    Circle pB14 = new Circle(cubicaB4.getControlX1(),cubicaB4.getControlY1(),2,Color.RED);
                    pB14.setLayoutX(4);
                    pB14.setLayoutY(47.5);
                    Circle pB15 = new Circle(cubicaB4.getControlX2(),cubicaB4.getControlY2(),2,Color.RED);
                    pB15.setLayoutX(4);
                    pB15.setLayoutY(47.5);
                    Circle pB16 = new Circle(cubicaB4.getEndX(),cubicaB4.getEndY(),2,Color.RED);
                    pB16.setLayoutX(4);
                    pB16.setLayoutY(47.5);
                    
                    fondo.getChildren().addAll(pB1,pB2,pB3,pB4,pB5,pB6,pB7,pB8,pB9,pB10,pB11,pB12,pB13,pB14,pB15,pB16);
                }
                
                fondo.getChildren().addAll(cubicaB1,cubicaB2,cubicaB3,cubicaB4);
                return fondo;
            case 'C':
                CubicCurve cubicaC1 = new CubicCurve(6,-69.59,-13.39,-73.19,-26.39,-10.19,6.33,-30.79);
                CubicCurve cubicaC2 = new CubicCurve(-3.2,1,8.19,-9.2,-4.8,-17.8,-11.59,-9.2);
                CubicCurve cubicaC3 = new CubicCurve(-10.59,0.39,-10.59,6.59,3.4,-1.2,-5.2,-6.39);
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //Atributos Lineas
                cubicaC1.setLayoutX(23);
                cubicaC1.setLayoutY(78);
                cubicaC1.setFill(Color.TRANSPARENT);
                cubicaC1.setStroke(dibujar.getColor());
                cubicaC1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaC1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                cubicaC2.setLayoutX(33);
                cubicaC2.setLayoutY(46);
                cubicaC2.setFill(Color.TRANSPARENT);
                cubicaC2.setStroke(dibujar.getColor());
                cubicaC2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaC2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                cubicaC3.setLayoutX(35);
                cubicaC3.setLayoutY(15);
                cubicaC3.setFill(Color.TRANSPARENT);
                cubicaC3.setStroke(dibujar.getColor());
                cubicaC3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaC3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoC1 = new CubicCurve(cubicaC1.getStartX(),cubicaC1.getStartY(),cubicaC1.getControlX1(),cubicaC1.getControlY1(),cubicaC1.getControlX2(),cubicaC1.getControlY2(),cubicaC1.getEndX(),cubicaC1.getEndY());
                    anchoC1.setLayoutX(23);
                    anchoC1.setLayoutY(78);
                    anchoC1.setFill(Color.TRANSPARENT);
                    anchoC1.setStroke(dibujar.getColor());
                    anchoC1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoC1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoC1.setTranslateX(1);
                    
                    CubicCurve anchoC2 = new CubicCurve(cubicaC1.getStartX(),cubicaC1.getStartY(),cubicaC1.getControlX1(),cubicaC1.getControlY1(),cubicaC1.getControlX2(),cubicaC1.getControlY2(),cubicaC1.getEndX(),cubicaC1.getEndY());
                    anchoC2.setLayoutX(23);
                    anchoC2.setLayoutY(78);
                    anchoC2.setFill(Color.TRANSPARENT);
                    anchoC2.setStroke(dibujar.getColor());
                    anchoC2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoC2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoC2.setTranslateY(1);
                    
                    CubicCurve anchoC3 = new CubicCurve(cubicaC2.getStartX(),cubicaC2.getStartY(),cubicaC2.getControlX1(),cubicaC2.getControlY1(),cubicaC2.getControlX2(),cubicaC2.getControlY2(),cubicaC2.getEndX(),cubicaC2.getEndY());
                    anchoC3.setLayoutX(33);
                    anchoC3.setLayoutY(46);
                    anchoC3.setFill(Color.TRANSPARENT);
                    anchoC3.setStroke(dibujar.getColor());
                    anchoC3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoC3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoC3.setTranslateX(1);
                    
                    CubicCurve anchoC4 = new CubicCurve(cubicaC2.getStartX(),cubicaC2.getStartY(),cubicaC2.getControlX1(),cubicaC2.getControlY1(),cubicaC2.getControlX2(),cubicaC2.getControlY2(),cubicaC2.getEndX(),cubicaC2.getEndY());
                    anchoC4.setLayoutX(33);
                    anchoC4.setLayoutY(46);
                    anchoC4.setFill(Color.TRANSPARENT);
                    anchoC4.setStroke(dibujar.getColor());
                    anchoC4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoC4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoC4.setTranslateY(1);
                    
                    CubicCurve anchoC5 = new CubicCurve(cubicaC3.getStartX(),cubicaC3.getStartY(),cubicaC3.getControlX1(),cubicaC3.getControlY1(),cubicaC3.getControlX2(),cubicaC3.getControlY2(),cubicaC3.getEndX(),cubicaC3.getEndY());
                    anchoC5.setLayoutX(35);
                    anchoC5.setLayoutY(15);
                    anchoC5.setFill(Color.TRANSPARENT);
                    anchoC5.setStroke(dibujar.getColor());
                    anchoC5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoC5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoC5.setTranslateX(1);
                    
                    CubicCurve anchoC6 = new CubicCurve(cubicaC3.getStartX(),cubicaC3.getStartY(),cubicaC3.getControlX1(),cubicaC3.getControlY1(),cubicaC3.getControlX2(),cubicaC3.getControlY2(),cubicaC3.getEndX(),cubicaC3.getEndY());
                    anchoC6.setLayoutX(35);
                    anchoC6.setLayoutY(15);
                    anchoC6.setFill(Color.TRANSPARENT);
                    anchoC6.setStroke(dibujar.getColor());
                    anchoC6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoC6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoC6.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoC1,anchoC2,anchoC3,anchoC4,anchoC5,anchoC6);
                }
                
                if (palabra.isS()){
                    Line subC = new Line();
                    subC.setStartX(45); //tamaño C es 45
                    subC.setLayoutX(0);
                    subC.setLayoutY(55);
                    fondo.getChildren().add(subC);
                }
                
                if (dibujar.getControl()){
                    Circle pC1 = new Circle(cubicaC1.getStartX(),cubicaC1.getStartY(),2,Color.RED);
                    pC1.setLayoutX(23);
                    pC1.setLayoutY(78);
                    Circle pC2 = new Circle(cubicaC1.getControlX1(),cubicaC1.getControlY1(),2,Color.RED);
                    pC2.setLayoutX(23);
                    pC2.setLayoutY(78);
                    Circle pC3 = new Circle(cubicaC1.getControlX2(),cubicaC1.getControlY2(),2,Color.RED);
                    pC3.setLayoutX(23);
                    pC3.setLayoutY(78);
                    Circle pC4 = new Circle(cubicaC1.getEndX(),cubicaC1.getEndY(),2,Color.RED);
                    pC4.setLayoutX(23);
                    pC4.setLayoutY(78);
                    
                    Circle pC5 = new Circle(cubicaC2.getStartX(),cubicaC2.getStartY(),2,Color.RED);
                    pC5.setLayoutX(33);
                    pC5.setLayoutY(46);
                    Circle pC6 = new Circle(cubicaC2.getControlX1(),cubicaC2.getControlY1(),2,Color.RED);
                    pC6.setLayoutX(33);
                    pC6.setLayoutY(46);
                    Circle pC7 = new Circle(cubicaC2.getControlX2(),cubicaC2.getControlY2(),2,Color.RED);
                    pC7.setLayoutX(33);
                    pC7.setLayoutY(46);
                    Circle pC8 = new Circle(cubicaC2.getEndX(),cubicaC2.getEndY(),2,Color.RED);
                    pC8.setLayoutX(33);
                    pC8.setLayoutY(46);
                    
                    Circle pC9 = new Circle(cubicaC3.getStartX(),cubicaC3.getStartY(),2,Color.RED);
                    pC9.setLayoutX(35);
                    pC9.setLayoutY(15);
                    Circle pC10 = new Circle(cubicaC3.getControlX1(),cubicaC3.getControlY1(),2,Color.RED);
                    pC10.setLayoutX(35);
                    pC10.setLayoutY(15);
                    Circle pC11 = new Circle(cubicaC3.getControlX2(),cubicaC3.getControlY2(),2,Color.RED);
                    pC11.setLayoutX(35);
                    pC11.setLayoutY(15);
                    Circle pC12 = new Circle(cubicaC3.getEndX(),cubicaC3.getEndY(),2,Color.RED);
                    pC12.setLayoutX(35);
                    pC12.setLayoutY(15);
                    
                    fondo.getChildren().addAll(pC1,pC2,pC3,pC4,pC5,pC6,pC7,pC8,pC9,pC10,pC11,pC12);
                }
                
                fondo.getChildren().addAll(cubicaC1,cubicaC2,cubicaC3);
                return fondo;
            case 'D':
                CubicCurve cubicaD1 = new CubicCurve(3.2,-25.8,-6.8,-29.8,-6.8,14.59,-20.19,14.59);
                CubicCurve cubicaD2 = new CubicCurve(-1.51,-22.6,33.4,-8,10.19,28.19,-12.19,19);
                CubicCurve cubicaD3 = new CubicCurve(-34.6,-10,-43.19,-7.4,-43.19,-12.59,-34.6,-10);
                CubicCurve cubicaD4 = new CubicCurve(13.4,-34.76,-10,-39.19,-10,-6.8,7,-12.59);
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //Atributos Lineas
                cubicaD1.setLayoutX(32);
                cubicaD1.setLayoutY(35);
                cubicaD1.setFill(Color.TRANSPARENT);
                cubicaD1.setStroke(dibujar.getColor());
                cubicaD1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //guatita
                cubicaD2.setLayoutX(26);
                cubicaD2.setLayoutY(30);
                cubicaD2.setFill(Color.TRANSPARENT);
                cubicaD2.setStroke(dibujar.getColor());
                cubicaD2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                // colDita inferior izquierda
                cubicaD3.setLayoutX(48);
                cubicaD3.setLayoutY(59);
                cubicaD3.setFill(Color.TRANSPARENT);
                cubicaD3.setStroke(dibujar.getColor());
                cubicaD3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaD3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //curva superior izquierda
                cubicaD4.setLayoutX(10);
                cubicaD4.setLayoutY(42);
                cubicaD4.setFill(Color.TRANSPARENT);
                cubicaD4.setStroke(dibujar.getColor());
                cubicaD4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaD4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoD1 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD1.setLayoutX(32);
                    anchoD1.setLayoutY(35);
                    anchoD1.setFill(Color.TRANSPARENT);
                    anchoD1.setStroke(dibujar.getColor());
                    anchoD1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD1.setTranslateX(1);
                    
                    CubicCurve anchoD2 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD2.setLayoutX(32);
                    anchoD2.setLayoutY(35);
                    anchoD2.setFill(Color.TRANSPARENT);
                    anchoD2.setStroke(dibujar.getColor());
                    anchoD2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD2.setTranslateY(1);
                    
                    CubicCurve anchoD3 = new CubicCurve(cubicaD2.getStartX(),cubicaD2.getStartY(),cubicaD2.getControlX1(),cubicaD2.getControlY1(),cubicaD2.getControlX2(),cubicaD2.getControlY2(),cubicaD2.getEndX(),cubicaD2.getEndY());
                    anchoD3.setLayoutX(26);
                    anchoD3.setLayoutY(30);
                    anchoD3.setFill(Color.TRANSPARENT);
                    anchoD3.setStroke(dibujar.getColor());
                    anchoD3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD3.setTranslateX(1);
                    
                    CubicCurve anchoD4 = new CubicCurve(cubicaD2.getStartX(),cubicaD2.getStartY(),cubicaD2.getControlX1(),cubicaD2.getControlY1(),cubicaD2.getControlX2(),cubicaD2.getControlY2(),cubicaD2.getEndX(),cubicaD2.getEndY());
                    anchoD4.setLayoutX(26);
                    anchoD4.setLayoutY(30);
                    anchoD4.setFill(Color.TRANSPARENT);
                    anchoD4.setStroke(dibujar.getColor());
                    anchoD4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD4.setTranslateY(1);
                    
                    CubicCurve anchoD5 = new CubicCurve(cubicaD3.getStartX(),cubicaD3.getStartY(),cubicaD3.getControlX1(),cubicaD3.getControlY1(),cubicaD3.getControlX2(),cubicaD3.getControlY2(),cubicaD3.getEndX(),cubicaD3.getEndY());
                    anchoD5.setLayoutX(48);
                    anchoD5.setLayoutY(59);
                    anchoD5.setFill(Color.TRANSPARENT);
                    anchoD5.setStroke(dibujar.getColor());
                    anchoD5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD5.setTranslateX(1);
                    
                    CubicCurve anchoD6 = new CubicCurve(cubicaD3.getStartX(),cubicaD3.getStartY(),cubicaD3.getControlX1(),cubicaD3.getControlY1(),cubicaD3.getControlX2(),cubicaD3.getControlY2(),cubicaD3.getEndX(),cubicaD3.getEndY());
                    anchoD6.setLayoutX(48);
                    anchoD6.setLayoutY(59);
                    anchoD6.setFill(Color.TRANSPARENT);
                    anchoD6.setStroke(dibujar.getColor());
                    anchoD6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD6.setTranslateY(1);
                    
                    CubicCurve anchoD7 = new CubicCurve(cubicaD4.getStartX(),cubicaD4.getStartY(),cubicaD4.getControlX1(),cubicaD4.getControlY1(),cubicaD4.getControlX2(),cubicaD4.getControlY2(),cubicaD4.getEndX(),cubicaD4.getEndY());
                    anchoD7.setLayoutX(10);
                    anchoD7.setLayoutY(42);
                    anchoD7.setFill(Color.TRANSPARENT);
                    anchoD7.setStroke(dibujar.getColor());
                    anchoD7.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD7.setTranslateX(1);
                    
                    CubicCurve anchoD8 = new CubicCurve(cubicaD4.getStartX(),cubicaD4.getStartY(),cubicaD4.getControlX1(),cubicaD4.getControlY1(),cubicaD4.getControlX2(),cubicaD4.getControlY2(),cubicaD4.getEndX(),cubicaD4.getEndY());
                    anchoD8.setLayoutX(10);
                    anchoD8.setLayoutY(42);
                    anchoD8.setFill(Color.TRANSPARENT);
                    anchoD8.setStroke(dibujar.getColor());
                    anchoD8.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD8.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD8.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoD1,anchoD2,anchoD3,anchoD4,anchoD5,anchoD6,anchoD7,anchoD8);
                }
                
                if (palabra.isS()){
                    Line subD = new Line();
                    subD.setStartX(45); //tamaño D es 45
                    subD.setLayoutX(0);
                    subD.setLayoutY(55);
                    fondo.getChildren().add(subD);
                }
                
                if (dibujar.getControl()){
                    Circle pD1 = new Circle(cubicaD1.getStartX(),cubicaD1.getStartY(),2,Color.RED);
                    pD1.setLayoutX(32);
                    pD1.setLayoutY(35);
                    Circle pD2 = new Circle(cubicaD1.getControlX1(),cubicaD1.getControlY1(),2,Color.RED);
                    pD2.setLayoutX(32);
                    pD2.setLayoutY(35);
                    Circle pD3 = new Circle(cubicaD1.getControlX2(),cubicaD1.getControlY2(),2,Color.RED);
                    pD3.setLayoutX(32);
                    pD3.setLayoutY(35);
                    Circle pD4 = new Circle(cubicaD1.getEndX(),cubicaD1.getEndY(),2,Color.RED);
                    pD4.setLayoutX(32);
                    pD4.setLayoutY(35);
                    
                    Circle pD5 = new Circle(cubicaD2.getStartX(),cubicaD2.getStartY(),2,Color.RED);
                    pD5.setLayoutX(26);
                    pD5.setLayoutY(30);
                    Circle pD6 = new Circle(cubicaD2.getControlX1(),cubicaD2.getControlY1(),2,Color.RED);
                    pD6.setLayoutX(26);
                    pD6.setLayoutY(30);
                    Circle pD7 = new Circle(cubicaD2.getControlX2(),cubicaD2.getControlY2(),2,Color.RED);
                    pD7.setLayoutX(26);
                    pD7.setLayoutY(30);
                    Circle pD8 = new Circle(cubicaD2.getEndX(),cubicaD2.getEndY(),2,Color.RED);
                    pD8.setLayoutX(26);
                    pD8.setLayoutY(30);
                    
                    Circle pD9 = new Circle(cubicaD3.getStartX(),cubicaD3.getStartY(),2,Color.RED);
                    pD9.setLayoutX(48);
                    pD9.setLayoutY(59);
                    Circle pD10 = new Circle(cubicaD3.getControlX1(),cubicaD3.getControlY1(),2,Color.RED);
                    pD10.setLayoutX(48);
                    pD10.setLayoutY(59);
                    Circle pD11 = new Circle(cubicaD3.getControlX2(),cubicaD3.getControlY2(),2,Color.RED);
                    pD11.setLayoutX(48);
                    pD11.setLayoutY(59);
                    Circle pD12 = new Circle(cubicaD3.getEndX(),cubicaD3.getEndY(),2,Color.RED);
                    pD12.setLayoutX(48);
                    pD12.setLayoutY(59);
                    
                    Circle pD13 = new Circle(cubicaD4.getStartX(),cubicaD4.getStartY(),2,Color.RED);
                    pD13.setLayoutX(10);
                    pD13.setLayoutY(42);
                    Circle pD14 = new Circle(cubicaD4.getControlX1(),cubicaD4.getControlY1(),2,Color.RED);
                    pD14.setLayoutX(10);
                    pD14.setLayoutY(42);
                    Circle pD15 = new Circle(cubicaD4.getControlX2(),cubicaD4.getControlY2(),2,Color.RED);
                    pD15.setLayoutX(10);
                    pD15.setLayoutY(42);
                    Circle pD16 = new Circle(cubicaD4.getEndX(),cubicaD4.getEndY(),2,Color.RED);
                    pD16.setLayoutX(10);
                    pD16.setLayoutY(42);
                    
                    fondo.getChildren().addAll(pD1,pD2,pD3,pD4,pD5,pD6,pD7,pD8,pD9,pD10,pD11,pD12,pD13,pD14,pD15,pD16);
                }
                
                fondo.getChildren().addAll(cubicaD1,cubicaD2,cubicaD3,cubicaD4);
                return fondo;
            case 'E':
                CubicCurve cubicaE1 = new CubicCurve(6.2,19.2,-14.79,39.59,-30.6,11.59,-11.4,2.23);
                CubicCurve cubicaE2 = new CubicCurve(-0.6,3.23,3.79,-1,-7.79,3.23,-0.6,-7.6);
                CubicCurve cubicaE3 = new CubicCurve(0,-8.2,12,-23.99,20.39,-2,9.39,-5.8);
                CubicCurve cubicaE4 = new CubicCurve(-0.6,-9.8,1,-22.93,17.39,-13.8,9.39,-5.8);
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //PRIMERA inferior izquierda base
                cubicaE1.setLayoutX(27);
                cubicaE1.setLayoutY(24);
                /*
                cubicaE1.setStartX(6.2);(6.2,19.2,-14.79,39.59,-30.6,11.59,-11.4,2.23)
                cubicaE1.setStartY(19.2);
                cubicaE1.setEndX(-11.4);
                cubicaE1.setEndY(2.23);
                cubicaE1.setControlX1(-14.79);
                cubicaE1.setControlY1(39.59);
                cubicaE1.setControlX2(-30.6);
                cubicaE1.setControlY2(11.59);
                */
                cubicaE1.setFill(Color.TRANSPARENT);
                cubicaE1.setStroke(dibujar.getColor());
                cubicaE1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaE1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //centro union s
                cubicaE2.setLayoutX(16);
                cubicaE2.setLayoutY(23);
                /*
                cubicaE2.setStartX(-0.6);(-0.6,3.23,3.79,-1.0,-7.79,3.23,-0.6,-7.6)
                cubicaE2.setStartY(3.23);
                cubicaE2.setEndX(-0.6);
                cubicaE2.setEndY(-7.6);
                cubicaE2.setControlX1(3.79);
                cubicaE2.setControlY1(-1.0);
                cubicaE2.setControlX2(-7.79);
                cubicaE2.setControlY2(3.23);
                */
                cubicaE2.setFill(Color.TRANSPARENT);
                cubicaE2.setStroke(dibujar.getColor());
                cubicaE2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaE2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //curba superior
                cubicaE3.setLayoutX(15);
                cubicaE3.setLayoutY(24);
                /*
                cubicaE3.setStartX(0);(0,-8.2,12.0,-23.99,20.39,-2,9.39,-5.8)
                cubicaE3.setStartY(-8.2);
                cubicaE3.setEndX(9.39);
                cubicaE3.setEndY(-5.8);
                cubicaE3.setControlX1(12.0);
                cubicaE3.setControlY1(-23.99);
                cubicaE3.setControlX2(20.39);
                cubicaE3.setControlY2(-2);
                */
                cubicaE3.setFill(Color.TRANSPARENT);
                cubicaE3.setStroke(dibujar.getColor());
                cubicaE3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaE3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //colita inferior derecha
                cubicaE4.setLayoutX(23);
                cubicaE4.setLayoutY(50);
                /*
                cubicaE4.setStartX(-0.6); (-0.6,-9.8,1.0,-22.93,17.39,-13.8,9.39,-5.8)
                cubicaE4.setStartY(-9.8);
                cubicaE4.setEndX(9.39);
                cubicaE4.setEndY(-5.8);
                cubicaE4.setControlX1(1.0);
                cubicaE4.setControlY1(-22.93);
                cubicaE4.setControlX2(17.39);
                cubicaE4.setControlY2(-13.8);
                */
                cubicaE4.setFill(Color.TRANSPARENT);
                cubicaE4.setStroke(dibujar.getColor());
                cubicaE4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaE4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoE1 = new CubicCurve(cubicaE1.getStartX(),cubicaE1.getStartY(),cubicaE1.getControlX1(),cubicaE1.getControlY1(),cubicaE1.getControlX2(),cubicaE1.getControlY2(),cubicaE1.getEndX(),cubicaE1.getEndY());
                    anchoE1.setLayoutX(27);
                    anchoE1.setLayoutY(24);
                    anchoE1.setFill(Color.TRANSPARENT);
                    anchoE1.setStroke(dibujar.getColor());
                    anchoE1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoE1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoE1.setTranslateX(1);
                    
                    CubicCurve anchoE2 = new CubicCurve(cubicaE1.getStartX(),cubicaE1.getStartY(),cubicaE1.getControlX1(),cubicaE1.getControlY1(),cubicaE1.getControlX2(),cubicaE1.getControlY2(),cubicaE1.getEndX(),cubicaE1.getEndY());
                    anchoE2.setLayoutX(27);
                    anchoE2.setLayoutY(24);
                    anchoE2.setFill(Color.TRANSPARENT);
                    anchoE2.setStroke(dibujar.getColor());
                    anchoE2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoE2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoE2.setTranslateY(1);
                    
                    CubicCurve anchoE3 = new CubicCurve(cubicaE2.getStartX(),cubicaE2.getStartY(),cubicaE2.getControlX1(),cubicaE2.getControlY1(),cubicaE2.getControlX2(),cubicaE2.getControlY2(),cubicaE2.getEndX(),cubicaE2.getEndY());
                    anchoE3.setLayoutX(16);
                    anchoE3.setLayoutY(23);
                    anchoE3.setFill(Color.TRANSPARENT);
                    anchoE3.setStroke(dibujar.getColor());
                    anchoE3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoE3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoE3.setTranslateX(1);
                    
                    CubicCurve anchoE4 = new CubicCurve(cubicaE2.getStartX(),cubicaE2.getStartY(),cubicaE2.getControlX1(),cubicaE2.getControlY1(),cubicaE2.getControlX2(),cubicaE2.getControlY2(),cubicaE2.getEndX(),cubicaE2.getEndY());
                    anchoE4.setLayoutX(16);
                    anchoE4.setLayoutY(23);
                    anchoE4.setFill(Color.TRANSPARENT);
                    anchoE4.setStroke(dibujar.getColor());
                    anchoE4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoE4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoE4.setTranslateY(1);
                    
                    CubicCurve anchoE5 = new CubicCurve(cubicaE3.getStartX(),cubicaE3.getStartY(),cubicaE3.getControlX1(),cubicaE3.getControlY1(),cubicaE3.getControlX2(),cubicaE3.getControlY2(),cubicaE3.getEndX(),cubicaE3.getEndY());
                    anchoE5.setLayoutX(15);
                    anchoE5.setLayoutY(24);
                    anchoE5.setFill(Color.TRANSPARENT);
                    anchoE5.setStroke(dibujar.getColor());
                    anchoE5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoE5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoE5.setTranslateX(1);
                    
                    CubicCurve anchoE6 = new CubicCurve(cubicaE3.getStartX(),cubicaE3.getStartY(),cubicaE3.getControlX1(),cubicaE3.getControlY1(),cubicaE3.getControlX2(),cubicaE3.getControlY2(),cubicaE3.getEndX(),cubicaE3.getEndY());
                    anchoE6.setLayoutX(15);
                    anchoE6.setLayoutY(24);
                    anchoE6.setFill(Color.TRANSPARENT);
                    anchoE6.setStroke(dibujar.getColor());
                    anchoE6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoE6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoE6.setTranslateY(1);
                    
                    CubicCurve anchoE7 = new CubicCurve(cubicaE4.getStartX(),cubicaE4.getStartY(),cubicaE4.getControlX1(),cubicaE4.getControlY1(),cubicaE4.getControlX2(),cubicaE4.getControlY2(),cubicaE4.getEndX(),cubicaE4.getEndY());
                    anchoE7.setLayoutX(23);
                    anchoE7.setLayoutY(50);
                    anchoE7.setFill(Color.TRANSPARENT);
                    anchoE7.setStroke(dibujar.getColor());
                    anchoE7.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoE7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoE7.setTranslateX(1);
                    
                    CubicCurve anchoE8 = new CubicCurve(cubicaE4.getStartX(),cubicaE4.getStartY(),cubicaE4.getControlX1(),cubicaE4.getControlY1(),cubicaE4.getControlX2(),cubicaE4.getControlY2(),cubicaE4.getEndX(),cubicaE4.getEndY());
                    anchoE8.setLayoutX(23);
                    anchoE8.setLayoutY(50);
                    anchoE8.setFill(Color.TRANSPARENT);
                    anchoE8.setStroke(dibujar.getColor());
                    anchoE8.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoE8.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoE8.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoE1,anchoE2,anchoE3,anchoE4,anchoE5,anchoE6,anchoE7,anchoE8);
                }
                if (palabra.isS()){
                    Line subE = new Line();
                    subE.setStartX(45); //tamaño E es 45
                    subE.setLayoutX(0);
                    subE.setLayoutY(55);
                    fondo.getChildren().add(subE);
                }
                
                if (dibujar.getControl()){
                    Circle pE1 = new Circle(cubicaE1.getStartX(),cubicaE1.getStartY(),2,Color.RED);
                    pE1.setLayoutX(27);
                    pE1.setLayoutY(24);
                    Circle pE2 = new Circle(cubicaE1.getControlX1(),cubicaE1.getControlY1(),2,Color.RED);
                    pE2.setLayoutX(27);
                    pE2.setLayoutY(24);
                    Circle pE3 = new Circle(cubicaE1.getControlX2(),cubicaE1.getControlY2(),2,Color.RED);
                    pE3.setLayoutX(27);
                    pE3.setLayoutY(24);
                    Circle pE4 = new Circle(cubicaE1.getEndX(),cubicaE1.getEndY(),2,Color.RED);
                    pE4.setLayoutX(27);
                    pE4.setLayoutY(24);
                    
                    Circle pE5 = new Circle(cubicaE2.getStartX(),cubicaE2.getStartY(),2,Color.RED);
                    pE5.setLayoutX(16);
                    pE5.setLayoutY(23);
                    Circle pE6 = new Circle(cubicaE2.getControlX1(),cubicaE2.getControlY1(),2,Color.RED);
                    pE6.setLayoutX(16);
                    pE6.setLayoutY(23);
                    Circle pE7 = new Circle(cubicaE2.getControlX2(),cubicaE2.getControlY2(),2,Color.RED);
                    pE7.setLayoutX(16);
                    pE7.setLayoutY(23);
                    Circle pE8 = new Circle(cubicaE2.getEndX(),cubicaE2.getEndY(),2,Color.RED);
                    pE8.setLayoutX(16);
                    pE8.setLayoutY(23);
                    
                    Circle pE9 = new Circle(cubicaE3.getStartX(),cubicaE3.getStartY(),2,Color.RED);
                    pE9.setLayoutX(15);
                    pE9.setLayoutY(24);
                    Circle pE10 = new Circle(cubicaE3.getControlX1(),cubicaE3.getControlY1(),2,Color.RED);
                    pE10.setLayoutX(15);
                    pE10.setLayoutY(24);
                    Circle pE11 = new Circle(cubicaE3.getControlX2(),cubicaE3.getControlY2(),2,Color.RED);
                    pE11.setLayoutX(15);
                    pE11.setLayoutY(24);
                    Circle pE12 = new Circle(cubicaE3.getEndX(),cubicaE3.getEndY(),2,Color.RED);
                    pE12.setLayoutX(15);
                    pE12.setLayoutY(24);
                    
                    Circle pE13 = new Circle(cubicaE4.getStartX(),cubicaE4.getStartY(),2,Color.RED);
                    pE13.setLayoutX(23);
                    pE13.setLayoutY(50);
                    Circle pE14 = new Circle(cubicaE4.getControlX1(),cubicaE4.getControlY1(),2,Color.RED);
                    pE14.setLayoutX(23);
                    pE14.setLayoutY(50);
                    Circle pE15 = new Circle(cubicaE4.getControlX2(),cubicaE4.getControlY2(),2,Color.RED);
                    pE15.setLayoutX(23);
                    pE15.setLayoutY(50);
                    Circle pE16 = new Circle(cubicaE4.getEndX(),cubicaE4.getEndY(),2,Color.RED);
                    pE16.setLayoutX(23);
                    pE16.setLayoutY(50);
                    
                    fondo.getChildren().addAll(pE1,pE2,pE3,pE4,pE5,pE6,pE7,pE8,pE9,pE10,pE11,pE12,pE13,pE14,pE15,pE16);
                }
                
                fondo.getChildren().addAll(cubicaE1,cubicaE2,cubicaE3,cubicaE4);
                return fondo;
            case 'F':
                Line lineaF1 = new Line(42.8,-2.4,50.39,-2.4);
                Line lineaF2 = new Line(44,-2.4,44,1.79);
                CubicCurve cubicaF1 = new CubicCurve(-22,32.4,-1.79,50,-11,-3.6,5.2,-3.67);
                CubicCurve cubicaF2 = new CubicCurve(-26.2,-4.59,-36,-4.59,-39.79,-24.39,5.2,-14.6);
                CubicCurve cubicaF3 = new CubicCurve(8.2,-11.39,17,-19.32,19.6,-5.4,11,-5.4);
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //central
                cubicaF1.setLayoutX(26);
                cubicaF1.setLayoutY(14);
                /*
                cubicaF1.setStartX(-22);(-22,32.4,-1.79,50,-11,-3.6,5.2,-3.67)
                cubicaF1.setStartY(32.4);
                cubicaF1.setEndX(5.2);
                cubicaF1.setEndY(-3.67);
                cubicaF1.setControlX1(-1.79);
                cubicaF1.setControlY1(50);
                cubicaF1.setControlX2(-11);
                cubicaF1.setControlY2(-3.6);
                */
                cubicaF1.setFill(Color.TRANSPARENT);
                cubicaF1.setStroke(dibujar.getColor());
                cubicaF1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaF1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //superior
                cubicaF2.setLayoutX(36);
                cubicaF2.setLayoutY(26);
                /*
                cubicaF2.setStartX(-26.2);(-26.2,-4.59,-36,-4.59,-39.79,-24.39,5.2,-14.6)
                cubicaF2.setStartY(-4.59);
                cubicaF2.setEndX(5.2);
                cubicaF2.setEndY(-14.6);
                cubicaF2.setControlX1(-36.0);
                cubicaF2.setControlY1(-4.59);
                cubicaF2.setControlX2(-39.79);
                cubicaF2.setControlY2(-24.39);
                */
                cubicaF2.setFill(Color.TRANSPARENT);
                cubicaF2.setStroke(dibujar.getColor());
                cubicaF2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaF2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //colita superior
                cubicaF3.setLayoutX(-1);
                cubicaF3.setLayoutY(27);
                /*
                cubicaF3.setStartX(8.2);(8.2,-11.39,17,-19.32,19.6,-5.4,11,-5.4)
                cubicaF3.setStartY(-11.39);
                cubicaF3.setEndX(11.0);
                cubicaF3.setEndY(-5.4);
                cubicaF3.setControlX1(17.0);
                cubicaF3.setControlY1(-19.32);
                cubicaF3.setControlX2(19.6);
                cubicaF3.setControlY2(-5.4);
                */
                cubicaF3.setFill(Color.TRANSPARENT);
                cubicaF3.setStroke(dibujar.getColor());
                cubicaF3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaF3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //linea central
                lineaF1.setLayoutX(-23);
                lineaF1.setLayoutY(30);
                /*
                lineaF1.setStartX(42.8);(42.8,-2.4,50.39,-2.4)
                lineaF1.setStartY(-2.4);
                lineaF1.setEndX(50.39);
                lineaF1.setEndY(-2.4);
                */
                lineaF1.setFill(Color.TRANSPARENT);
                lineaF1.setStroke(dibujar.getColor());
                lineaF1.setStrokeLineCap(StrokeLineCap.ROUND);
                lineaF1.setStrokeLineJoin(StrokeLineJoin.ROUND);       
                //linFea terminal central
                lineaF2.setLayoutX(-16);
                lineaF2.setLayoutY(30);
                /*
                lineaF2.setStartX(44.0);(44,-2.4,44,1.79)
                lineaF2.setStartY(-2.4);
                lineaF2.setEndX(44);
                lineaF2.setEndY(1.79);
                */
                lineaF2.setFill(Color.TRANSPARENT);
                lineaF2.setStroke(dibujar.getColor());
                lineaF2.setStrokeLineCap(StrokeLineCap.ROUND);
                lineaF2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoF1 = new CubicCurve(cubicaF1.getStartX(),cubicaF1.getStartY(),cubicaF1.getControlX1(),cubicaF1.getControlY1(),cubicaF1.getControlX2(),cubicaF1.getControlY2(),cubicaF1.getEndX(),cubicaF1.getEndY());
                    anchoF1.setLayoutX(26);
                    anchoF1.setLayoutY(14);
                    anchoF1.setFill(Color.TRANSPARENT);
                    anchoF1.setStroke(dibujar.getColor());
                    anchoF1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoF1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoF1.setTranslateX(1);
                    
                    CubicCurve anchoF2 = new CubicCurve(cubicaF1.getStartX(),cubicaF1.getStartY(),cubicaF1.getControlX1(),cubicaF1.getControlY1(),cubicaF1.getControlX2(),cubicaF1.getControlY2(),cubicaF1.getEndX(),cubicaF1.getEndY());
                    anchoF2.setLayoutX(26);
                    anchoF2.setLayoutY(14);
                    anchoF2.setFill(Color.TRANSPARENT);
                    anchoF2.setStroke(dibujar.getColor());
                    anchoF2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoF2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoF2.setTranslateY(1);
                    
                    CubicCurve anchoF3 = new CubicCurve(cubicaF2.getStartX(),cubicaF2.getStartY(),cubicaF2.getControlX1(),cubicaF2.getControlY1(),cubicaF2.getControlX2(),cubicaF2.getControlY2(),cubicaF2.getEndX(),cubicaF2.getEndY());
                    anchoF3.setLayoutX(36);
                    anchoF3.setLayoutY(26);
                    anchoF3.setFill(Color.TRANSPARENT);
                    anchoF3.setStroke(dibujar.getColor());
                    anchoF3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoF3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoF3.setTranslateX(1);
                    
                    CubicCurve anchoF4 = new CubicCurve(cubicaF2.getStartX(),cubicaF2.getStartY(),cubicaF2.getControlX1(),cubicaF2.getControlY1(),cubicaF2.getControlX2(),cubicaF2.getControlY2(),cubicaF2.getEndX(),cubicaF2.getEndY());
                    anchoF4.setLayoutX(36);
                    anchoF4.setLayoutY(26);
                    anchoF4.setFill(Color.TRANSPARENT);
                    anchoF4.setStroke(dibujar.getColor());
                    anchoF4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoF4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoF4.setTranslateY(1);
                    
                    CubicCurve anchoF5 = new CubicCurve(cubicaF3.getStartX(),cubicaF3.getStartY(),cubicaF3.getControlX1(),cubicaF3.getControlY1(),cubicaF3.getControlX2(),cubicaF3.getControlY2(),cubicaF3.getEndX(),cubicaF3.getEndY());
                    anchoF5.setLayoutX(-1);
                    anchoF5.setLayoutY(27);
                    anchoF5.setFill(Color.TRANSPARENT);
                    anchoF5.setStroke(dibujar.getColor());
                    anchoF5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoF5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoF5.setTranslateX(1);
                    
                    CubicCurve anchoF6 = new CubicCurve(cubicaF3.getStartX(),cubicaF3.getStartY(),cubicaF3.getControlX1(),cubicaF3.getControlY1(),cubicaF3.getControlX2(),cubicaF3.getControlY2(),cubicaF3.getEndX(),cubicaF3.getEndY());
                    anchoF6.setLayoutX(-1);
                    anchoF6.setLayoutY(27);
                    anchoF6.setFill(Color.TRANSPARENT);
                    anchoF6.setStroke(dibujar.getColor());
                    anchoF6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoF6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoF6.setTranslateY(1);
                    
                    Line anchoF7 = new Line(lineaF1.getStartX(),lineaF1.getStartY(),lineaF1.getEndX(),lineaF1.getEndY());
                    anchoF7.setLayoutX(-23);
                    anchoF7.setLayoutY(30);
                    anchoF7.setFill(Color.TRANSPARENT);
                    anchoF7.setStroke(dibujar.getColor());
                    anchoF7.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoF7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoF7.setTranslateX(1);
                    
                    Line anchoF8 = new Line(lineaF1.getStartX(),lineaF1.getStartY(),lineaF1.getEndX(),lineaF1.getEndY());
                    anchoF8.setLayoutX(-23);
                    anchoF8.setLayoutY(30);
                    anchoF8.setFill(Color.TRANSPARENT);
                    anchoF8.setStroke(dibujar.getColor());
                    anchoF8.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoF8.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoF8.setTranslateY(1);
                    
                    Line anchoF9 = new Line(lineaF2.getStartX(),lineaF2.getStartY(),lineaF2.getEndX(),lineaF2.getEndY());
                    anchoF9.setLayoutX(-16);
                    anchoF9.setLayoutY(30);
                    anchoF9.setFill(Color.TRANSPARENT);
                    anchoF9.setStroke(dibujar.getColor());
                    anchoF9.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoF9.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoF9.setTranslateX(1);
                    
                    Line anchoF10 = new Line(lineaF2.getStartX(),lineaF2.getStartY(),lineaF2.getEndX(),lineaF2.getEndY());
                    anchoF10.setLayoutX(-16);
                    anchoF10.setLayoutY(30);
                    anchoF10.setFill(Color.TRANSPARENT);
                    anchoF10.setStroke(dibujar.getColor());
                    anchoF10.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoF10.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoF10.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoF1,anchoF2,anchoF3,anchoF4,anchoF5,anchoF6,anchoF7,anchoF8,anchoF9,anchoF10);
                }
                if (palabra.isS()){
                    Line subF = new Line();
                    subF.setStartX(45); //tamaño F es 45
                    subF.setLayoutX(0);
                    subF.setLayoutY(55);
                    fondo.getChildren().add(subF);
                }
                
                if (dibujar.getControl()){
                    Circle pF1 = new Circle(cubicaF1.getStartX(),cubicaF1.getStartY(),2,Color.RED);
                    pF1.setLayoutX(26);
                    pF1.setLayoutY(14);
                    Circle pF2 = new Circle(cubicaF1.getControlX1(),cubicaF1.getControlY1(),2,Color.RED);
                    pF2.setLayoutX(26);
                    pF2.setLayoutY(14);
                    Circle pF3 = new Circle(cubicaF1.getControlX2(),cubicaF1.getControlY2(),2,Color.RED);
                    pF3.setLayoutX(26);
                    pF3.setLayoutY(14);
                    Circle pF4 = new Circle(cubicaF1.getEndX(),cubicaF1.getEndY(),2,Color.RED);
                    pF4.setLayoutX(26);
                    pF4.setLayoutY(14);
                    
                    Circle pF5 = new Circle(cubicaF2.getStartX(),cubicaF2.getStartY(),2,Color.RED);
                    pF5.setLayoutX(36);
                    pF5.setLayoutY(26);
                    Circle pF6 = new Circle(cubicaF2.getControlX1(),cubicaF2.getControlY1(),2,Color.RED);
                    pF6.setLayoutX(36);
                    pF6.setLayoutY(26);
                    Circle pF7 = new Circle(cubicaF2.getControlX2(),cubicaF2.getControlY2(),2,Color.RED);
                    pF7.setLayoutX(36);
                    pF7.setLayoutY(26);
                    Circle pF8 = new Circle(cubicaF2.getEndX(),cubicaF2.getEndY(),2,Color.RED);
                    pF8.setLayoutX(36);
                    pF8.setLayoutY(26);
                    
                    Circle pF9 = new Circle(cubicaF3.getStartX(),cubicaF3.getStartY(),2,Color.RED);
                    pF9.setLayoutX(-1);
                    pF9.setLayoutY(27);
                    Circle pF10 = new Circle(cubicaF3.getControlX1(),cubicaF3.getControlY1(),2,Color.RED);
                    pF10.setLayoutX(-1);
                    pF10.setLayoutY(27);
                    Circle pF11 = new Circle(cubicaF3.getControlX2(),cubicaF3.getControlY2(),2,Color.RED);
                    pF11.setLayoutX(-1);
                    pF11.setLayoutY(27);
                    Circle pF12 = new Circle(cubicaF3.getEndX(),cubicaF3.getEndY(),2,Color.RED);
                    pF12.setLayoutX(-1);
                    pF12.setLayoutY(27);
                    
                    Circle pF13 = new Circle(lineaF1.getStartX(),lineaF1.getStartY(),2,Color.RED);
                    pF13.setLayoutX(-23);
                    pF13.setLayoutY(30);
                    Circle pF14 = new Circle(lineaF1.getEndX(),lineaF1.getEndY(),2,Color.RED);
                    pF14.setLayoutX(-23);
                    pF14.setLayoutY(30);
                    
                    Circle pF15 = new Circle(lineaF2.getStartX(),lineaF2.getStartY(),2,Color.RED);
                    pF15.setLayoutX(-16);
                    pF15.setLayoutY(30);
                    Circle pF16 = new Circle(lineaF2.getEndX(),lineaF2.getEndY(),2,Color.RED);
                    pF16.setLayoutX(-16);
                    pF16.setLayoutY(30);
                    
                    fondo.getChildren().addAll(pF1,pF2,pF3,pF4,pF5,pF6,pF7,pF8,pF9,pF10,pF11,pF12,pF13,pF14,pF15,pF16);
                }
                
                fondo.getChildren().addAll(cubicaF1,cubicaF2,cubicaF3,lineaF1,lineaF2);
                return fondo;
            case 'G':
                CubicCurve cubicaG1 = new CubicCurve(-22,25.4,-31.19,37.40,8.20,49.79,3.39,9.49);
                CubicCurve cubicaG2 = new CubicCurve(7.20,25.79,-1.2,44.79,-25.39,33.79,-13,15.6);
                CubicCurve cubicaG3 = new CubicCurve(-24.39,-1.9,20.2,16.4,-9.19,-18.99,-22.6,4.43);
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //lado izquiero primera
                cubicaG1.setLayoutX(33);
                cubicaG1.setLayoutY(15);
                /*
                cubicasG.setStartX(-22);(-22,25.4,-31.19,37.40,8.20,49.79,3.39,9.49)
                cubicasG.setStartY(25.4);
                cubicasG.setEndX(3.39);
                cubicasG.setEndY(9.49);
                cubicasG.setControlX1(-31.19);
                cubicasG.setControlY1(37.40);
                cubicasG.setControlX2(8.20);
                cubicasG.setControlY2(49.79);
                */
                cubicaG1.setFill(Color.TRANSPARENT);
                cubicaG1.setStroke(dibujar.getColor());
                cubicaG1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaG1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                cubicaG2.setLayoutX(29);
                cubicaG2.setLayoutY(0);
                /*
                cubicaG2.setStartX(7.20);(7.20,25.79,-1.2,44.79,-25.39,33.79,-13,15.6)
                cubicaG2.setStartY(25.79);
                cubicaG2.setEndX(-13);
                cubicaG2.setEndY(15.6);
                cubicaG2.setControlX1(-1.2);
                cubicaG2.setControlY1(44.79);
                cubicaG2.setControlX2(-25.39);
                cubicaG2.setControlY2(33.79);
                */
                cubicaG2.setFill(Color.TRANSPARENT);
                cubicaG2.setStroke(dibujar.getColor());
                cubicaG2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaG2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                cubicaG3.setLayoutX(38);
                cubicaG3.setLayoutY(12);
                /*
                cubicaG3.setStartX(-24.39);(-24.39,-1.9,20.2,16.4,-9.19,-18.99,-22.6,4.43)
                cubicaG3.setStartY(-1.9);
                cubicaG3.setEndX(-22.6);
                cubicaG3.setEndY(4.43);
                cubicaG3.setControlX1(20.2);
                cubicaG3.setControlY1(16.4);
                cubicaG3.setControlX2(-9.19);
                cubicaG3.setControlY2(-18.99);
                */
                cubicaG3.setFill(Color.TRANSPARENT);
                cubicaG3.setStroke(dibujar.getColor());
                cubicaG3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaG3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoG1 = new CubicCurve(cubicaG1.getStartX(),cubicaG1.getStartY(),cubicaG1.getControlX1(),cubicaG1.getControlY1(),cubicaG1.getControlX2(),cubicaG1.getControlY2(),cubicaG1.getEndX(),cubicaG1.getEndY());
                    anchoG1.setLayoutX(33);
                    anchoG1.setLayoutY(15);
                    anchoG1.setFill(Color.TRANSPARENT);
                    anchoG1.setStroke(dibujar.getColor());
                    anchoG1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoG1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoG1.setTranslateX(1);
                    
                    CubicCurve anchoG2 = new CubicCurve(cubicaG1.getStartX(),cubicaG1.getStartY(),cubicaG1.getControlX1(),cubicaG1.getControlY1(),cubicaG1.getControlX2(),cubicaG1.getControlY2(),cubicaG1.getEndX(),cubicaG1.getEndY());
                    anchoG2.setLayoutX(33);
                    anchoG2.setLayoutY(15);
                    anchoG2.setFill(Color.TRANSPARENT);
                    anchoG2.setStroke(dibujar.getColor());
                    anchoG2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoG2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoG2.setTranslateY(1);
                    
                    CubicCurve anchoG3 = new CubicCurve(cubicaG2.getStartX(),cubicaG2.getStartY(),cubicaG2.getControlX1(),cubicaG2.getControlY1(),cubicaG2.getControlX2(),cubicaG2.getControlY2(),cubicaG2.getEndX(),cubicaG2.getEndY());
                    anchoG3.setLayoutX(29);
                    anchoG3.setLayoutY(0);
                    anchoG3.setFill(Color.TRANSPARENT);
                    anchoG3.setStroke(dibujar.getColor());
                    anchoG3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoG3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoG3.setTranslateX(1);
                    
                    CubicCurve anchoG4 = new CubicCurve(cubicaG2.getStartX(),cubicaG2.getStartY(),cubicaG2.getControlX1(),cubicaG2.getControlY1(),cubicaG2.getControlX2(),cubicaG2.getControlY2(),cubicaG2.getEndX(),cubicaG2.getEndY());
                    anchoG4.setLayoutX(29);
                    anchoG4.setLayoutY(0);
                    anchoG4.setFill(Color.TRANSPARENT);
                    anchoG4.setStroke(dibujar.getColor());
                    anchoG4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoG4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoG4.setTranslateY(1);
                    
                    CubicCurve anchoG5 = new CubicCurve(cubicaG3.getStartX(),cubicaG3.getStartY(),cubicaG3.getControlX1(),cubicaG3.getControlY1(),cubicaG3.getControlX2(),cubicaG3.getControlY2(),cubicaG3.getEndX(),cubicaG3.getEndY());
                    anchoG5.setLayoutX(38);
                    anchoG5.setLayoutY(12);
                    anchoG5.setFill(Color.TRANSPARENT);
                    anchoG5.setStroke(dibujar.getColor());
                    anchoG5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoG5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoG5.setTranslateX(1);
                    
                    CubicCurve anchoG6 = new CubicCurve(cubicaG3.getStartX(),cubicaG3.getStartY(),cubicaG3.getControlX1(),cubicaG3.getControlY1(),cubicaG3.getControlX2(),cubicaG3.getControlY2(),cubicaG3.getEndX(),cubicaG3.getEndY());
                    anchoG6.setLayoutX(38);
                    anchoG6.setLayoutY(12);
                    anchoG6.setFill(Color.TRANSPARENT);
                    anchoG6.setStroke(dibujar.getColor());
                    anchoG6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoG6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoG6.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoG1,anchoG2,anchoG3,anchoG4,anchoG5,anchoG6);
                }
                if (palabra.isS()){
                    Line subG = new Line();
                    subG.setStartX(45); //tamaño G es 45
                    subG.setLayoutX(0);
                    subG.setLayoutY(55);
                    fondo.getChildren().add(subG);
                }
                
                if (dibujar.getControl()){
                    Circle pG1 = new Circle(cubicaG1.getStartX(),cubicaG1.getStartY(),2,Color.RED);
                    pG1.setLayoutX(33);
                    pG1.setLayoutY(15);
                    Circle pG2 = new Circle(cubicaG1.getControlX1(),cubicaG1.getControlY1(),2,Color.RED);
                    pG2.setLayoutX(33);
                    pG2.setLayoutY(15);
                    Circle pG3 = new Circle(cubicaG1.getControlX2(),cubicaG1.getControlY2(),2,Color.RED);
                    pG3.setLayoutX(33);
                    pG3.setLayoutY(15);
                    Circle pG4 = new Circle(cubicaG1.getEndX(),cubicaG1.getEndY(),2,Color.RED);
                    pG4.setLayoutX(33);
                    pG4.setLayoutY(15);
                    
                    Circle pG5 = new Circle(cubicaG2.getStartX(),cubicaG2.getStartY(),2,Color.RED);
                    pG5.setLayoutX(29);
                    pG5.setLayoutY(0);
                    Circle pG6 = new Circle(cubicaG2.getControlX1(),cubicaG2.getControlY1(),2,Color.RED);
                    pG6.setLayoutX(29);
                    pG6.setLayoutY(0);
                    Circle pG7 = new Circle(cubicaG2.getControlX2(),cubicaG2.getControlY2(),2,Color.RED);
                    pG7.setLayoutX(29);
                    pG7.setLayoutY(0);
                    Circle pG8 = new Circle(cubicaG2.getEndX(),cubicaG2.getEndY(),2,Color.RED);
                    pG8.setLayoutX(29);
                    pG8.setLayoutY(0);
                    
                    Circle pG9 = new Circle(cubicaG3.getStartX(),cubicaG3.getStartY(),2,Color.RED);
                    pG9.setLayoutX(38);
                    pG9.setLayoutY(12);
                    Circle pG10 = new Circle(cubicaG3.getControlX1(),cubicaG3.getControlY1(),2,Color.RED);
                    pG10.setLayoutX(38);
                    pG10.setLayoutY(12);
                    Circle pG11 = new Circle(cubicaG3.getControlX2(),cubicaG3.getControlY2(),2,Color.RED);
                    pG11.setLayoutX(38);
                    pG11.setLayoutY(12);
                    Circle pG12 = new Circle(cubicaG3.getEndX(),cubicaG3.getEndY(),2,Color.RED);
                    pG12.setLayoutX(38);
                    pG12.setLayoutY(12);
                    
                    fondo.getChildren().addAll(pG1,pG2,pG3,pG4,pG5,pG6,pG7,pG8,pG9,pG10,pG11,pG12);
                }
                
                fondo.getChildren().addAll(cubicaG1,cubicaG2,cubicaG3);
                return fondo;
            case 'H':
                Line lineaH = new Line(-13.39,-1.8,-0.6,-1.8);
                CubicCurve cubicaH1 = new CubicCurve(-33,32.79,-15.39,48.19,-31,-5.99,-6.75,-5.99);
                CubicCurve cubicaH2 = new CubicCurve(-11.8,9.19,-8.85,22.9,-37.39,3.8,5.21,1.01);
                CubicCurve cubicaH3 = new CubicCurve(-5.6,24.4,-21,58.19,-27.7,6.2,-5.6,-5.9);
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //lado izquiero primera
                cubicaH1.setLayoutX(35);
                cubicaH1.setLayoutY(15);
                /*
                cubicaH1.setStartX(-33);(-33,32.79,-15.39,48.19,-31,-5.99,-6.75,-5.99)
                cubicaH1.setStartY(32.79);
                cubicaH1.setEndX(-6.75);
                cubicaH1.setEndY(-5.99);
                cubicaH1.setControlX1(-15.39);
                cubicaH1.setControlY1(48.19);
                cubicaH1.setControlX2(-31);
                cubicaH1.setControlY2(-5.99);
                */
                cubicaH1.setFill(Color.TRANSPARENT);
                cubicaH1.setStroke(dibujar.getColor());
                cubicaH1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaH1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                // supeHrior izquierdo colita
                cubicaH2.setLayoutX(22);
                cubicaH2.setLayoutY(8);
                /*
                cubicaH2.setStartX(-11.8);(-11.8,9.19,-8.85,22.9,-37.39,3.8,5.21,1.01)
                cubicaH2.setStartY(9.19);
                cubicaH2.setEndX(5.21);
                cubicaH2.setEndY(1.01);
                cubicaH2.setControlX1(-8.85);
                cubicaH2.setControlY1(22.9);
                cubicaH2.setControlX2(-37.39);
                cubicaH2.setControlY2(3.8);
                */
                cubicaH2.setFill(Color.TRANSPARENT);
                cubicaH2.setStroke(dibujar.getColor());
                cubicaH2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaH2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //dereHcha segunda
                cubicaH3.setLayoutX(45);
                cubicaH3.setLayoutY(16);
                /*
                cubicaH3.setStartX(-5.6);(-5.6,24.4,-21,58.19,-27.7,6.2,-5.6,-5.9)
                cubicaH3.setStartY(24.4);
                cubicaH3.setEndX(-5.6);
                cubicaH3.setEndY(-5.9);
                cubicaH3.setControlX1(-21);
                cubicaH3.setControlY1(58.19);
                cubicaH3.setControlX2(-27.7);
                cubicaH3.setControlY2(6.2);
                */
                cubicaH3.setFill(Color.TRANSPARENT);
                cubicaH3.setStroke(dibujar.getColor());
                cubicaH3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaH3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //central
                lineaH.setLayoutX(27);
                lineaH.setLayoutY(30);
                /*
                lineaH.setStartX(-13.39);(-13.39,-1.8,-0.6,-1.8)
                lineaH.setStartY(-1.8);
                lineaH.setEndX(-0.6);
                lineaH.setEndY(-1.8);
                */
                lineaH.setFill(Color.TRANSPARENT);
                lineaH.setStroke(dibujar.getColor());
                lineaH.setStrokeLineCap(StrokeLineCap.ROUND);
                lineaH.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoH1 = new CubicCurve(cubicaH1.getStartX(),cubicaH1.getStartY(),cubicaH1.getControlX1(),cubicaH1.getControlY1(),cubicaH1.getControlX2(),cubicaH1.getControlY2(),cubicaH1.getEndX(),cubicaH1.getEndY());
                    anchoH1.setLayoutX(35);
                    anchoH1.setLayoutY(15);
                    anchoH1.setFill(Color.TRANSPARENT);
                    anchoH1.setStroke(dibujar.getColor());
                    anchoH1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoH1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoH1.setTranslateX(1);
                    
                    CubicCurve anchoH2 = new CubicCurve(cubicaH1.getStartX(),cubicaH1.getStartY(),cubicaH1.getControlX1(),cubicaH1.getControlY1(),cubicaH1.getControlX2(),cubicaH1.getControlY2(),cubicaH1.getEndX(),cubicaH1.getEndY());
                    anchoH2.setLayoutX(35);
                    anchoH2.setLayoutY(15);
                    anchoH2.setFill(Color.TRANSPARENT);
                    anchoH2.setStroke(dibujar.getColor());
                    anchoH2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoH2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoH2.setTranslateY(1);
                    
                    CubicCurve anchoH3 = new CubicCurve(cubicaH2.getStartX(),cubicaH2.getStartY(),cubicaH2.getControlX1(),cubicaH2.getControlY1(),cubicaH2.getControlX2(),cubicaH2.getControlY2(),cubicaH2.getEndX(),cubicaH2.getEndY());
                    anchoH3.setLayoutX(22);
                    anchoH3.setLayoutY(8);
                    anchoH3.setFill(Color.TRANSPARENT);
                    anchoH3.setStroke(dibujar.getColor());
                    anchoH3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoH3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoH3.setTranslateX(1);
                    
                    CubicCurve anchoH4 = new CubicCurve(cubicaH2.getStartX(),cubicaH2.getStartY(),cubicaH2.getControlX1(),cubicaH2.getControlY1(),cubicaH2.getControlX2(),cubicaH2.getControlY2(),cubicaH2.getEndX(),cubicaH2.getEndY());
                    anchoH4.setLayoutX(22);
                    anchoH4.setLayoutY(8);
                    anchoH4.setFill(Color.TRANSPARENT);
                    anchoH4.setStroke(dibujar.getColor());
                    anchoH4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoH4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoH4.setTranslateY(1);
                    
                    CubicCurve anchoH5 = new CubicCurve(cubicaH3.getStartX(),cubicaH3.getStartY(),cubicaH3.getControlX1(),cubicaH3.getControlY1(),cubicaH3.getControlX2(),cubicaH3.getControlY2(),cubicaH3.getEndX(),cubicaH3.getEndY());
                    anchoH5.setLayoutX(45);
                    anchoH5.setLayoutY(16);
                    anchoH5.setFill(Color.TRANSPARENT);
                    anchoH5.setStroke(dibujar.getColor());
                    anchoH5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoH5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoH5.setTranslateX(1);
                    
                    CubicCurve anchoH6 = new CubicCurve(cubicaH3.getStartX(),cubicaH3.getStartY(),cubicaH3.getControlX1(),cubicaH3.getControlY1(),cubicaH3.getControlX2(),cubicaH3.getControlY2(),cubicaH3.getEndX(),cubicaH3.getEndY());
                    anchoH6.setLayoutX(45);
                    anchoH6.setLayoutY(16);
                    anchoH6.setFill(Color.TRANSPARENT);
                    anchoH6.setStroke(dibujar.getColor());
                    anchoH6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoH6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoH6.setTranslateY(1);
                    
                    Line anchoH7 = new Line(lineaH.getStartX(),lineaH.getStartY(),lineaH.getEndX(),lineaH.getEndY());
                    anchoH7.setLayoutX(27);
                    anchoH7.setLayoutY(30);
                    anchoH7.setFill(Color.TRANSPARENT);
                    anchoH7.setStroke(dibujar.getColor());
                    anchoH7.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoH7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoH7.setTranslateX(1);
                    
                    Line anchoH8 = new Line(lineaH.getStartX(),lineaH.getStartY(),lineaH.getEndX(),lineaH.getEndY());
                    anchoH8.setLayoutX(27);
                    anchoH8.setLayoutY(30);
                    anchoH8.setFill(Color.TRANSPARENT);
                    anchoH8.setStroke(dibujar.getColor());
                    anchoH8.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoH8.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoH8.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoH1,anchoH2,anchoH3,anchoH4,anchoH5,anchoH6,anchoH7,anchoH8);
                }
                if (palabra.isS()){
                    Line subH = new Line();
                    subH.setStartX(45); //tamaño H es 45
                    subH.setLayoutX(0);
                    subH.setLayoutY(55);
                    fondo.getChildren().add(subH);
                }
                
                if (dibujar.getControl()){
                    Circle pH1 = new Circle(cubicaH1.getStartX(),cubicaH1.getStartY(),2,Color.RED);
                    pH1.setLayoutX(35);
                    pH1.setLayoutY(15);
                    Circle pH2 = new Circle(cubicaH1.getControlX1(),cubicaH1.getControlY1(),2,Color.RED);
                    pH2.setLayoutX(35);
                    pH2.setLayoutY(15);
                    Circle pH3 = new Circle(cubicaH1.getControlX2(),cubicaH1.getControlY2(),2,Color.RED);
                    pH3.setLayoutX(35);
                    pH3.setLayoutY(15);
                    Circle pH4 = new Circle(cubicaH1.getEndX(),cubicaH1.getEndY(),2,Color.RED);
                    pH4.setLayoutX(35);
                    pH4.setLayoutY(15);
                    
                    Circle pH5 = new Circle(cubicaH2.getStartX(),cubicaH2.getStartY(),2,Color.RED);
                    pH5.setLayoutX(22);
                    pH5.setLayoutY(8);
                    Circle pH6 = new Circle(cubicaH2.getControlX1(),cubicaH2.getControlY1(),2,Color.RED);
                    pH6.setLayoutX(22);
                    pH6.setLayoutY(8);
                    Circle pH7 = new Circle(cubicaH2.getControlX2(),cubicaH2.getControlY2(),2,Color.RED);
                    pH7.setLayoutX(22);
                    pH7.setLayoutY(8);
                    Circle pH8 = new Circle(cubicaH2.getEndX(),cubicaH2.getEndY(),2,Color.RED);
                    pH8.setLayoutX(22);
                    pH8.setLayoutY(8);
                    
                    Circle pH9 = new Circle(cubicaH3.getStartX(),cubicaH3.getStartY(),2,Color.RED);
                    pH9.setLayoutX(45);
                    pH9.setLayoutY(16);
                    Circle pH10 = new Circle(cubicaH3.getControlX1(),cubicaH3.getControlY1(),2,Color.RED);
                    pH10.setLayoutX(45);
                    pH10.setLayoutY(16);
                    Circle pH11 = new Circle(cubicaH3.getControlX2(),cubicaH3.getControlY2(),2,Color.RED);
                    pH11.setLayoutX(45);
                    pH11.setLayoutY(16);
                    Circle pH12 = new Circle(cubicaH3.getEndX(),cubicaH3.getEndY(),2,Color.RED);
                    pH12.setLayoutX(45);
                    pH12.setLayoutY(16);
                    
                    Circle pH13 = new Circle(lineaH.getStartX(),lineaH.getStartY(),2,Color.RED);
                    pH13.setLayoutX(27);
                    pH13.setLayoutY(30);
                    Circle pH14 = new Circle(lineaH.getEndX(),lineaH.getEndY(),2,Color.RED);
                    pH14.setLayoutX(27);
                    pH14.setLayoutY(30);
                    
                    fondo.getChildren().addAll(pH1,pH2,pH3,pH4,pH5,pH6,pH7,pH8,pH9,pH10,pH11,pH12,pH13,pH14);
                }
                
                fondo.getChildren().addAll(cubicaH1,cubicaH2,cubicaH3,lineaH);
                return fondo;
            case 'I':
                CubicCurve cubicaI1 = new CubicCurve(-12.59,9.4,-16.4,19.19,-42.4,1.9,8.59,-0.02);
                CubicCurve cubicaI2 = new CubicCurve(-31.4,31.59,-14.59,31.59,-27.79,-8.02,-2.39,-10.02);
                CubicCurve cubicaI3 = new CubicCurve(11.59,-13.4,0,-13.4,0,-23.59,7.2,-23.59);
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //SUPERIOR
                cubicaI1.setLayoutX(32);
                cubicaI1.setLayoutY(9);
                /*
                cubicaI1.setStartX(-12.59);(-12.59,9.4,-16.4,19.19,-42.4,1.9,8.59,-0.02)
                cubicaI1.setStartY(9.4);
                cubicaI1.setEndX(8.59);
                cubicaI1.setEndY(-0.02);
                cubicaI1.setControlX1(-16.4);
                cubicaI1.setControlY1(19.19);
                cubicaI1.setControlX2(-42.4);
                cubicaI1.setControlY2(1.9);
                */
                cubicaI1.setFill(Color.TRANSPARENT);
                cubicaI1.setStroke(dibujar.getColor());
                cubicaI1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaI1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //BASE
                cubicaI2.setLayoutX(44);
                cubicaI2.setLayoutY(19);
                /*
                cubicaI2.setStartX(-31.4);(-31.4,31.59,-14.59,31.59,-27.79,-8.02,-2.39,-10.02)
                cubicaI2.setStartY(31.59);
                cubicaI2.setEndX(-2.39);
                cubicaI2.setEndY(-10.02);
                cubicaI2.setControlX1(-14.59);
                cubicaI2.setControlY1(31.59);
                cubicaI2.setControlX2(-27.79);
                cubicaI2.setControlY2(-8.02);
                */
                cubicaI2.setFill(Color.TRANSPARENT);
                cubicaI2.setStroke(dibujar.getColor());
                cubicaI2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaI2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //FINALI BASE
                cubicaI3.setLayoutX(1);
                cubicaI3.setLayoutY(64);
                /*
                cubicaI3.setStartX(11.59);(11.59,-13.4,0,-13.4,0,-23.59,7.2,-23.59)
                cubicaI3.setStartY(-13.4);
                cubicaI3.setEndX(7.2);
                cubicaI3.setEndY(-23.59);
                cubicaI3.setControlX1(0);
                cubicaI3.setControlY1(-13.4);
                cubicaI3.setControlX2(0);
                cubicaI3.setControlY2(-23.59);
                */
                cubicaI3.setFill(Color.TRANSPARENT);
                cubicaI3.setStroke(dibujar.getColor());
                cubicaI3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaI3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoI1 = new CubicCurve(cubicaI1.getStartX(),cubicaI1.getStartY(),cubicaI1.getControlX1(),cubicaI1.getControlY1(),cubicaI1.getControlX2(),cubicaI1.getControlY2(),cubicaI1.getEndX(),cubicaI1.getEndY());
                    anchoI1.setLayoutX(32);
                    anchoI1.setLayoutY(9);
                    anchoI1.setFill(Color.TRANSPARENT);
                    anchoI1.setStroke(dibujar.getColor());
                    anchoI1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoI1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoI1.setTranslateX(1);
                    
                    CubicCurve anchoI2 = new CubicCurve(cubicaI1.getStartX(),cubicaI1.getStartY(),cubicaI1.getControlX1(),cubicaI1.getControlY1(),cubicaI1.getControlX2(),cubicaI1.getControlY2(),cubicaI1.getEndX(),cubicaI1.getEndY());
                    anchoI2.setLayoutX(32);
                    anchoI2.setLayoutY(9);
                    anchoI2.setFill(Color.TRANSPARENT);
                    anchoI2.setStroke(dibujar.getColor());
                    anchoI2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoI2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoI2.setTranslateY(1);
                    
                    CubicCurve anchoI3 = new CubicCurve(cubicaI2.getStartX(),cubicaI2.getStartY(),cubicaI2.getControlX1(),cubicaI2.getControlY1(),cubicaI2.getControlX2(),cubicaI2.getControlY2(),cubicaI2.getEndX(),cubicaI2.getEndY());
                    anchoI3.setLayoutX(44);
                    anchoI3.setLayoutY(19);
                    anchoI3.setFill(Color.TRANSPARENT);
                    anchoI3.setStroke(dibujar.getColor());
                    anchoI3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoI3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoI3.setTranslateX(1);
                    
                    CubicCurve anchoI4 = new CubicCurve(cubicaI2.getStartX(),cubicaI2.getStartY(),cubicaI2.getControlX1(),cubicaI2.getControlY1(),cubicaI2.getControlX2(),cubicaI2.getControlY2(),cubicaI2.getEndX(),cubicaI2.getEndY());
                    anchoI4.setLayoutX(44);
                    anchoI4.setLayoutY(19);
                    anchoI4.setFill(Color.TRANSPARENT);
                    anchoI4.setStroke(dibujar.getColor());
                    anchoI4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoI4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoI4.setTranslateY(1);
                    
                    CubicCurve anchoI5 = new CubicCurve(cubicaI3.getStartX(),cubicaI3.getStartY(),cubicaI3.getControlX1(),cubicaI3.getControlY1(),cubicaI3.getControlX2(),cubicaI3.getControlY2(),cubicaI3.getEndX(),cubicaI3.getEndY());
                    anchoI5.setLayoutX(1);
                    anchoI5.setLayoutY(64);
                    anchoI5.setFill(Color.TRANSPARENT);
                    anchoI5.setStroke(dibujar.getColor());
                    anchoI5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoI5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoI5.setTranslateX(1);
                    
                    CubicCurve anchoI6 = new CubicCurve(cubicaI3.getStartX(),cubicaI3.getStartY(),cubicaI3.getControlX1(),cubicaI3.getControlY1(),cubicaI3.getControlX2(),cubicaI3.getControlY2(),cubicaI3.getEndX(),cubicaI3.getEndY());
                    anchoI6.setLayoutX(1);
                    anchoI6.setLayoutY(64);
                    anchoI6.setFill(Color.TRANSPARENT);
                    anchoI6.setStroke(dibujar.getColor());
                    anchoI6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoI6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoI6.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoI1,anchoI2,anchoI3,anchoI4,anchoI5,anchoI6);
                }
                if (palabra.isS()){
                    Line subI = new Line();
                    subI.setStartX(45); //tamaño I es 45
                    subI.setLayoutX(0);
                    subI.setLayoutY(55);
                    fondo.getChildren().add(subI);
                }
                
                if (dibujar.getControl()){
                    Circle pI1 = new Circle(cubicaI1.getStartX(),cubicaI1.getStartY(),2,Color.RED);
                    pI1.setLayoutX(32);
                    pI1.setLayoutY(9);
                    Circle pI2 = new Circle(cubicaI1.getControlX1(),cubicaI1.getControlY1(),2,Color.RED);
                    pI2.setLayoutX(32);
                    pI2.setLayoutY(9);
                    Circle pI3 = new Circle(cubicaI1.getControlX2(),cubicaI1.getControlY2(),2,Color.RED);
                    pI3.setLayoutX(32);
                    pI3.setLayoutY(9);
                    Circle pI4 = new Circle(cubicaI1.getEndX(),cubicaI1.getEndY(),2,Color.RED);
                    pI4.setLayoutX(32);
                    pI4.setLayoutY(9);
                    
                    Circle pI5 = new Circle(cubicaI2.getStartX(),cubicaI2.getStartY(),2,Color.RED);
                    pI5.setLayoutX(44);
                    pI5.setLayoutY(19);
                    Circle pI6 = new Circle(cubicaI2.getControlX1(),cubicaI2.getControlY1(),2,Color.RED);
                    pI6.setLayoutX(44);
                    pI6.setLayoutY(19);
                    Circle pI7 = new Circle(cubicaI2.getControlX2(),cubicaI2.getControlY2(),2,Color.RED);
                    pI7.setLayoutX(44);
                    pI7.setLayoutY(19);
                    Circle pI8 = new Circle(cubicaI2.getEndX(),cubicaI2.getEndY(),2,Color.RED);
                    pI8.setLayoutX(44);
                    pI8.setLayoutY(19);
                    
                    Circle pI9 = new Circle(cubicaI3.getStartX(),cubicaI3.getStartY(),2,Color.RED);
                    pI9.setLayoutX(1);
                    pI9.setLayoutY(64);
                    Circle pI10 = new Circle(cubicaI3.getControlX1(),cubicaI3.getControlY1(),2,Color.RED);
                    pI10.setLayoutX(1);
                    pI10.setLayoutY(64);
                    Circle pI11 = new Circle(cubicaI3.getControlX2(),cubicaI3.getControlY2(),2,Color.RED);
                    pI11.setLayoutX(1);
                    pI11.setLayoutY(64);
                    Circle pI12 = new Circle(cubicaI3.getEndX(),cubicaI3.getEndY(),2,Color.RED);
                    pI12.setLayoutX(1);
                    pI12.setLayoutY(64);
                    
                    fondo.getChildren().addAll(pI1,pI2,pI3,pI4,pI5,pI6,pI7,pI8,pI9,pI10,pI11,pI12);
                }
                
                fondo.getChildren().addAll(cubicaI1,cubicaI2,cubicaI3);
                return fondo;
            case 'J':
                CubicCurve cubicaJ1 = new CubicCurve(-29.59,35.8,-24.2,57,-27.7,6.2,-0.7,-11.68);
                CubicCurve cubicaJ2 = new CubicCurve(-10.79,17.20,-16.4,31.2,-46.33,6.9,7.25,1.35);
                CubicCurve cubicaJ3 = new CubicCurve(-29.59,37,-29.59,6.8,-9.75,33,-2.2,21.6);
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //medio
                cubicaJ1.setLayoutX(39);
                cubicaJ1.setLayoutY(17);
                /*
                cubicaJ1.setStartX(-29.59);(-29.59,35.8,-24.2,57,-27.7,6.2,-0.7,-11.68)
                cubicaJ1.setStartY(35.8);
                cubicaJ1.setEndX(-0.7);
                cubicaJ1.setEndY(-11.68);
                cubicaJ1.setControlX1(-24.2);
                cubicaJ1.setControlY1(57);
                cubicaJ1.setControlX2(-27.7);
                cubicaJ1.setControlY2(6.2);
                */
                cubicaJ1.setFill(Color.TRANSPARENT);
                cubicaJ1.setStroke(dibujar.getColor());
                cubicaJ1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaJ1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //superior
                cubicaJ2.setLayoutX(30);
                cubicaJ2.setLayoutY(5);
                /*
                cubicaJ2.setStartX(-10.79);(-10.79,17.20,-16.4,31.2,-46.33,6.9,7.25,1.35)
                cubicaJ2.setStartY(17.20);
                cubicaJ2.setEndX(7.25);
                cubicaJ2.setEndY(1.35);
                cubicaJ2.setControlX1(-16.4);
                cubicaJ2.setControlY1(31.2);
                cubicaJ2.setControlX2(-46.33);
                cubicaJ2.setControlY2(6.9);
                */
                cubicaJ2.setFill(Color.TRANSPARENT);
                cubicaJ2.setStroke(dibujar.getColor());
                cubicaJ2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaJ2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //FINALJ BASE
                cubicaJ3.setLayoutX(39);
                cubicaJ3.setLayoutY(16);
                /*
                cubicaJ3.setStartX(-29.59);(-29.59,37,-29.59,6.8,-9.75,33,-2.2,21.6)
                cubicaJ3.setStartY(37);
                cubicaJ3.setEndX(-2.2);
                cubicaJ3.setEndY(21.6);
                cubicaJ3.setControlX1(-29.59);
                cubicaJ3.setControlY1(6.8);
                cubicaJ3.setControlX2(-9.75);
                cubicaJ3.setControlY2(33);
                */
                cubicaJ3.setFill(Color.TRANSPARENT);
                cubicaJ3.setStroke(dibujar.getColor());
                cubicaJ3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaJ3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoJ1 = new CubicCurve(cubicaJ1.getStartX(),cubicaJ1.getStartY(),cubicaJ1.getControlX1(),cubicaJ1.getControlY1(),cubicaJ1.getControlX2(),cubicaJ1.getControlY2(),cubicaJ1.getEndX(),cubicaJ1.getEndY());
                    anchoJ1.setLayoutX(39);
                    anchoJ1.setLayoutY(17);
                    anchoJ1.setFill(Color.TRANSPARENT);
                    anchoJ1.setStroke(dibujar.getColor());
                    anchoJ1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoJ1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoJ1.setTranslateX(1);
                    
                    CubicCurve anchoJ2 = new CubicCurve(cubicaJ1.getStartX(),cubicaJ1.getStartY(),cubicaJ1.getControlX1(),cubicaJ1.getControlY1(),cubicaJ1.getControlX2(),cubicaJ1.getControlY2(),cubicaJ1.getEndX(),cubicaJ1.getEndY());
                    anchoJ2.setLayoutX(39);
                    anchoJ2.setLayoutY(17);
                    anchoJ2.setFill(Color.TRANSPARENT);
                    anchoJ2.setStroke(dibujar.getColor());
                    anchoJ2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoJ2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoJ2.setTranslateY(1);
                    
                    CubicCurve anchoJ3 = new CubicCurve(cubicaJ2.getStartX(),cubicaJ2.getStartY(),cubicaJ2.getControlX1(),cubicaJ2.getControlY1(),cubicaJ2.getControlX2(),cubicaJ2.getControlY2(),cubicaJ2.getEndX(),cubicaJ2.getEndY());
                    anchoJ3.setLayoutX(30);
                    anchoJ3.setLayoutY(5);
                    anchoJ3.setFill(Color.TRANSPARENT);
                    anchoJ3.setStroke(dibujar.getColor());
                    anchoJ3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoJ3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoJ3.setTranslateX(1);
                    
                    CubicCurve anchoJ4 = new CubicCurve(cubicaJ2.getStartX(),cubicaJ2.getStartY(),cubicaJ2.getControlX1(),cubicaJ2.getControlY1(),cubicaJ2.getControlX2(),cubicaJ2.getControlY2(),cubicaJ2.getEndX(),cubicaJ2.getEndY());
                    anchoJ4.setLayoutX(30);
                    anchoJ4.setLayoutY(5);
                    anchoJ4.setFill(Color.TRANSPARENT);
                    anchoJ4.setStroke(dibujar.getColor());
                    anchoJ4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoJ4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoJ4.setTranslateY(1);
                    
                    CubicCurve anchoJ5 = new CubicCurve(cubicaJ3.getStartX(),cubicaJ3.getStartY(),cubicaJ3.getControlX1(),cubicaJ3.getControlY1(),cubicaJ3.getControlX2(),cubicaJ3.getControlY2(),cubicaJ3.getEndX(),cubicaJ3.getEndY());
                    anchoJ5.setLayoutX(39);
                    anchoJ5.setLayoutY(16);
                    anchoJ5.setFill(Color.TRANSPARENT);
                    anchoJ5.setStroke(dibujar.getColor());
                    anchoJ5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoJ5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoJ5.setTranslateX(1);
                    
                    CubicCurve anchoJ6 = new CubicCurve(cubicaJ3.getStartX(),cubicaJ3.getStartY(),cubicaJ3.getControlX1(),cubicaJ3.getControlY1(),cubicaJ3.getControlX2(),cubicaJ3.getControlY2(),cubicaJ3.getEndX(),cubicaJ3.getEndY());
                    anchoJ6.setLayoutX(39);
                    anchoJ6.setLayoutY(16);
                    anchoJ6.setFill(Color.TRANSPARENT);
                    anchoJ6.setStroke(dibujar.getColor());
                    anchoJ6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoJ6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoJ6.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoJ1,anchoJ2,anchoJ3,anchoJ4,anchoJ5,anchoJ6);
                }
                if (palabra.isS()){
                    Line subJ = new Line();
                    subJ.setStartX(45); //tamaño J es 45
                    subJ.setLayoutX(0);
                    subJ.setLayoutY(55);
                    fondo.getChildren().add(subJ);
                }
                
                if (dibujar.getControl()){
                    Circle pJ1 = new Circle(cubicaJ1.getStartX(),cubicaJ1.getStartY(),2,Color.RED);
                    pJ1.setLayoutX(39);
                    pJ1.setLayoutY(17);
                    Circle pJ2 = new Circle(cubicaJ1.getControlX1(),cubicaJ1.getControlY1(),2,Color.RED);
                    pJ2.setLayoutX(39);
                    pJ2.setLayoutY(17);
                    Circle pJ3 = new Circle(cubicaJ1.getControlX2(),cubicaJ1.getControlY2(),2,Color.RED);
                    pJ3.setLayoutX(39);
                    pJ3.setLayoutY(17);
                    Circle pJ4 = new Circle(cubicaJ1.getEndX(),cubicaJ1.getEndY(),2,Color.RED);
                    pJ4.setLayoutX(39);
                    pJ4.setLayoutY(17);
                    
                    Circle pJ5 = new Circle(cubicaJ2.getStartX(),cubicaJ2.getStartY(),2,Color.RED);
                    pJ5.setLayoutX(30);
                    pJ5.setLayoutY(5);
                    Circle pJ6 = new Circle(cubicaJ2.getControlX1(),cubicaJ2.getControlY1(),2,Color.RED);
                    pJ6.setLayoutX(30);
                    pJ6.setLayoutY(5);
                    Circle pJ7 = new Circle(cubicaJ2.getControlX2(),cubicaJ2.getControlY2(),2,Color.RED);
                    pJ7.setLayoutX(30);
                    pJ7.setLayoutY(5);
                    Circle pJ8 = new Circle(cubicaJ2.getEndX(),cubicaJ2.getEndY(),2,Color.RED);
                    pJ8.setLayoutX(30);
                    pJ8.setLayoutY(5);
                    
                    Circle pJ9 = new Circle(cubicaJ3.getStartX(),cubicaJ3.getStartY(),2,Color.RED);
                    pJ9.setLayoutX(39);
                    pJ9.setLayoutY(16);
                    Circle pJ10 = new Circle(cubicaJ3.getControlX1(),cubicaJ3.getControlY1(),2,Color.RED);
                    pJ10.setLayoutX(39);
                    pJ10.setLayoutY(16);
                    Circle pJ11 = new Circle(cubicaJ3.getControlX2(),cubicaJ3.getControlY2(),2,Color.RED);
                    pJ11.setLayoutX(39);
                    pJ11.setLayoutY(16);
                    Circle pJ12 = new Circle(cubicaJ3.getEndX(),cubicaJ3.getEndY(),2,Color.RED);
                    pJ12.setLayoutX(39);
                    pJ12.setLayoutY(16);
                    
                    fondo.getChildren().addAll(pJ1,pJ2,pJ3,pJ4,pJ5,pJ6,pJ7,pJ8,pJ9,pJ10,pJ11,pJ12);
                }
                
                fondo.getChildren().addAll(cubicaJ1,cubicaJ2,cubicaJ3);
                return fondo;
            case 'K':
                CubicCurve cubicaK1 = new CubicCurve(-33,32.79,-14.59,53.19,-27.8,-6,-10.59,-6);
                CubicCurve cubicaK2 = new CubicCurve(-11.8,9.19,-8.85,22.9,-42.8,4.79,2.32,1.01);
                CubicCurve cubicaK3 = new CubicCurve(-30.45,35.7,-6,40.59,-23.39,11.79,-12,15.79);
                CubicCurve cubicaK4 = new CubicCurve(-21,46.6,-35.39,48.08,-14.39,25.99,-39.59,24.59);

                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x

                //PRIMERA izquierda
                cubicaK1.setLayoutX(35);
                cubicaK1.setLayoutY(14);
                /*
                cubicasK.setStartX(-33);(-33,32.79,-14.59,53.19,-27.8,-6,-10.59,-6)
                cubicasK.setStartY(32.79);
                cubicasK.setEndX(-10.59);
                cubicasK.setEndY(-6);
                cubicasK.setControlX1(-14.59);
                cubicasK.setControlY1(53.19);
                cubicasK.setControlX2(-27.8);
                cubicasK.setControlY2(-6);
                */
                cubicaK1.setFill(Color.TRANSPARENT);
                cubicaK1.setStroke(dibujar.getColor());
                cubicaK1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaK1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito izquierda
                cubicaK2.setLayoutX(23);
                cubicaK2.setLayoutY(7);
                /*
                cubica1K.setStartX(-11.8);(-11.8,9.19,-8.85,22.9,-42.8,4.79,2.32,1.01)
                cubica1K.setStartY(9.19);
                cubica1K.setEndX(2.32);
                cubica1K.setEndY(1.01);
                cubica1K.setControlX1(-8.85);
                cubica1K.setControlY1(22.9);
                cubica1K.setControlX2(-42.8);
                cubica1K.setControlY2(4.79);
                */
                cubicaK2.setFill(Color.TRANSPARENT);
                cubicaK2.setStroke(dibujar.getColor());
                cubicaK2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaK2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecha superior
                cubicaK3.setLayoutX(50);
                cubicaK3.setLayoutY(-7);
                /*
                cubica2K.setStartX(-30.45);(-30.45,35.7,-6,40.59,-23.39,11.79,-12,15.79)
                cubica2K.setStartY(35.7);
                cubica2K.setEndX(-12);
                cubica2K.setEndY(15.79);
                cubica2K.setControlX1(-6);
                cubica2K.setControlY1(40.59);
                cubica2K.setControlX2(-23.39);
                cubica2K.setControlY2(11.79);
                */
                cubicaK3.setFill(Color.TRANSPARENT);
                cubicaK3.setStroke(dibujar.getColor());
                cubicaK3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaK3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecha inferior
                cubicaK4.setLayoutX(60);
                cubicaK4.setLayoutY(4);
                /*
                cubica3K.setStartX(-21);(-21,46.6,-35.39,48.08,-14.39,25.99,-39.59,24.59)
                cubica3K.setStartY(46.6);
                cubica3K.setEndX(-39.59);
                cubica3K.setEndY(24.59);
                cubica3K.setControlX1(-35.39);
                cubica3K.setControlY1(48.08);
                cubica3K.setControlX2(-14.39);
                cubica3K.setControlY2(25.99);
                */
                cubicaK4.setFill(Color.TRANSPARENT);
                cubicaK4.setStroke(dibujar.getColor());
                cubicaK4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaK4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoK1 = new CubicCurve(cubicaK1.getStartX(),cubicaK1.getStartY(),cubicaK1.getControlX1(),cubicaK1.getControlY1(),cubicaK1.getControlX2(),cubicaK1.getControlY2(),cubicaK1.getEndX(),cubicaK1.getEndY());
                    anchoK1.setLayoutX(35);
                    anchoK1.setLayoutY(14);
                    anchoK1.setFill(Color.TRANSPARENT);
                    anchoK1.setStroke(dibujar.getColor());
                    anchoK1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoK1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoK1.setTranslateX(1);
                    
                    CubicCurve anchoK2 = new CubicCurve(cubicaK1.getStartX(),cubicaK1.getStartY(),cubicaK1.getControlX1(),cubicaK1.getControlY1(),cubicaK1.getControlX2(),cubicaK1.getControlY2(),cubicaK1.getEndX(),cubicaK1.getEndY());
                    anchoK2.setLayoutX(35);
                    anchoK2.setLayoutY(14);
                    anchoK2.setFill(Color.TRANSPARENT);
                    anchoK2.setStroke(dibujar.getColor());
                    anchoK2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoK2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoK2.setTranslateY(1);
                    
                    CubicCurve anchoK3 = new CubicCurve(cubicaK2.getStartX(),cubicaK2.getStartY(),cubicaK2.getControlX1(),cubicaK2.getControlY1(),cubicaK2.getControlX2(),cubicaK2.getControlY2(),cubicaK2.getEndX(),cubicaK2.getEndY());
                    anchoK3.setLayoutX(23);
                    anchoK3.setLayoutY(7);
                    anchoK3.setFill(Color.TRANSPARENT);
                    anchoK3.setStroke(dibujar.getColor());
                    anchoK3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoK3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoK3.setTranslateX(1);
                    
                    CubicCurve anchoK4 = new CubicCurve(cubicaK2.getStartX(),cubicaK2.getStartY(),cubicaK2.getControlX1(),cubicaK2.getControlY1(),cubicaK2.getControlX2(),cubicaK2.getControlY2(),cubicaK2.getEndX(),cubicaK2.getEndY());
                    anchoK4.setLayoutX(23);
                    anchoK4.setLayoutY(7);
                    anchoK4.setFill(Color.TRANSPARENT);
                    anchoK4.setStroke(dibujar.getColor());
                    anchoK4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoK4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoK4.setTranslateY(1);
                    
                    CubicCurve anchoK5 = new CubicCurve(cubicaK3.getStartX(),cubicaK3.getStartY(),cubicaK3.getControlX1(),cubicaK3.getControlY1(),cubicaK3.getControlX2(),cubicaK3.getControlY2(),cubicaK3.getEndX(),cubicaK3.getEndY());
                    anchoK5.setLayoutX(50);
                    anchoK5.setLayoutY(-7);
                    anchoK5.setFill(Color.TRANSPARENT);
                    anchoK5.setStroke(dibujar.getColor());
                    anchoK5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoK5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoK5.setTranslateX(1);
                    
                    CubicCurve anchoK6 = new CubicCurve(cubicaK3.getStartX(),cubicaK3.getStartY(),cubicaK3.getControlX1(),cubicaK3.getControlY1(),cubicaK3.getControlX2(),cubicaK3.getControlY2(),cubicaK3.getEndX(),cubicaK3.getEndY());
                    anchoK6.setLayoutX(50);
                    anchoK6.setLayoutY(-7);
                    anchoK6.setFill(Color.TRANSPARENT);
                    anchoK6.setStroke(dibujar.getColor());
                    anchoK6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoK6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoK6.setTranslateY(1);
                    
                    CubicCurve anchoK7 = new CubicCurve(cubicaK4.getStartX(),cubicaK4.getStartY(),cubicaK4.getControlX1(),cubicaK4.getControlY1(),cubicaK4.getControlX2(),cubicaK4.getControlY2(),cubicaK4.getEndX(),cubicaK4.getEndY());
                    anchoK7.setLayoutX(60);
                    anchoK7.setLayoutY(4);
                    anchoK7.setFill(Color.TRANSPARENT);
                    anchoK7.setStroke(dibujar.getColor());
                    anchoK7.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoK7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoK7.setTranslateX(1);
                    
                    CubicCurve anchoK8 = new CubicCurve(cubicaK4.getStartX(),cubicaK4.getStartY(),cubicaK4.getControlX1(),cubicaK4.getControlY1(),cubicaK4.getControlX2(),cubicaK4.getControlY2(),cubicaK4.getEndX(),cubicaK4.getEndY());
                    anchoK8.setLayoutX(60);
                    anchoK8.setLayoutY(4);
                    anchoK8.setFill(Color.TRANSPARENT);
                    anchoK8.setStroke(dibujar.getColor());
                    anchoK8.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoK8.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoK8.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoK1,anchoK2,anchoK3,anchoK4,anchoK5,anchoK6,anchoK7,anchoK8);
                }
                if (palabra.isS()){
                    Line subK = new Line();
                    subK.setStartX(45); //tamaño K es 45
                    subK.setLayoutX(0);
                    subK.setLayoutY(55);
                    fondo.getChildren().add(subK);
                }
                
                if (dibujar.getControl()){
                    Circle pK1 = new Circle(cubicaK1.getStartX(),cubicaK1.getStartY(),2,Color.RED);
                    pK1.setLayoutX(35);
                    pK1.setLayoutY(14);
                    Circle pK2 = new Circle(cubicaK1.getControlX1(),cubicaK1.getControlY1(),2,Color.RED);
                    pK2.setLayoutX(35);
                    pK2.setLayoutY(14);
                    Circle pK3 = new Circle(cubicaK1.getControlX2(),cubicaK1.getControlY2(),2,Color.RED);
                    pK3.setLayoutX(35);
                    pK3.setLayoutY(14);
                    Circle pK4 = new Circle(cubicaK1.getEndX(),cubicaK1.getEndY(),2,Color.RED);
                    pK4.setLayoutX(35);
                    pK4.setLayoutY(14);
                    
                    Circle pK5 = new Circle(cubicaK2.getStartX(),cubicaK2.getStartY(),2,Color.RED);
                    pK5.setLayoutX(23);
                    pK5.setLayoutY(7);
                    Circle pK6 = new Circle(cubicaK2.getControlX1(),cubicaK2.getControlY1(),2,Color.RED);
                    pK6.setLayoutX(23);
                    pK6.setLayoutY(7);
                    Circle pK7 = new Circle(cubicaK2.getControlX2(),cubicaK2.getControlY2(),2,Color.RED);
                    pK7.setLayoutX(23);
                    pK7.setLayoutY(7);
                    Circle pK8 = new Circle(cubicaK2.getEndX(),cubicaK2.getEndY(),2,Color.RED);
                    pK8.setLayoutX(23);
                    pK8.setLayoutY(7);
                    
                    Circle pK9 = new Circle(cubicaK3.getStartX(),cubicaK3.getStartY(),2,Color.RED);
                    pK9.setLayoutX(50);
                    pK9.setLayoutY(-7);
                    Circle pK10 = new Circle(cubicaK3.getControlX1(),cubicaK3.getControlY1(),2,Color.RED);
                    pK10.setLayoutX(50);
                    pK10.setLayoutY(-7);
                    Circle pK11 = new Circle(cubicaK3.getControlX2(),cubicaK3.getControlY2(),2,Color.RED);
                    pK11.setLayoutX(50);
                    pK11.setLayoutY(-7);
                    Circle pK12 = new Circle(cubicaK3.getEndX(),cubicaK3.getEndY(),2,Color.RED);
                    pK12.setLayoutX(50);
                    pK12.setLayoutY(-7);
                    
                    Circle pK13 = new Circle(cubicaK4.getStartX(),cubicaK4.getStartY(),2,Color.RED);
                    pK13.setLayoutX(60);
                    pK13.setLayoutY(4);
                    Circle pK14 = new Circle(cubicaK4.getControlX1(),cubicaK4.getControlY1(),2,Color.RED);
                    pK14.setLayoutX(60);
                    pK14.setLayoutY(4);
                    Circle pK15 = new Circle(cubicaK4.getControlX2(),cubicaK4.getControlY2(),2,Color.RED);
                    pK15.setLayoutX(60);
                    pK15.setLayoutY(4);
                    Circle pK16 = new Circle(cubicaK4.getEndX(),cubicaK4.getEndY(),2,Color.RED);
                    pK16.setLayoutX(60);
                    pK16.setLayoutY(4);
                    
                    fondo.getChildren().addAll(pK1,pK2,pK3,pK4,pK5,pK6,pK7,pK8,pK9,pK10,pK11,pK12,pK13,pK14,pK15,pK16);
                }
                
                fondo.getChildren().addAll(cubicaK1,cubicaK2,cubicaK3,cubicaK4);
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
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoD1 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD1.setLayoutX(32);
                    anchoD1.setLayoutY(35);
                    anchoD1.setFill(Color.TRANSPARENT);
                    anchoD1.setStroke(dibujar.getColor());
                    anchoD1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD1.setTranslateX(1);
                    
                    CubicCurve anchoD2 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD2.setLayoutX(32);
                    anchoD2.setLayoutY(35);
                    anchoD2.setFill(Color.TRANSPARENT);
                    anchoD2.setStroke(dibujar.getColor());
                    anchoD2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD2.setTranslateY(1);
                }
                if (palabra.isS()){
                    Line subE = new Line();
                    subE.setStartX(45); //tamaño E es 45
                    subE.setLayoutX(0);
                    subE.setLayoutY(55);
                    fondo.getChildren().add(subE);
                }
                
                if (dibujar.getControl()){
                    Circle pD1 = new Circle(cubicaD1.getStartX(),cubicaD1.getStartY(),2,Color.RED);
                    pD1.setLayoutX(32);
                    pD1.setLayoutY(35);
                    Circle pD2 = new Circle(cubicaD1.getControlX1(),cubicaD1.getControlY1(),2,Color.RED);
                    pD2.setLayoutX(32);
                    pD2.setLayoutY(35);
                    Circle pD3 = new Circle(cubicaD1.getControlX2(),cubicaD1.getControlY2(),2,Color.RED);
                    pD3.setLayoutX(32);
                    pD3.setLayoutY(35);
                    Circle pD4 = new Circle(cubicaD1.getEndX(),cubicaD1.getEndY(),2,Color.RED);
                    pD4.setLayoutX(32);
                    pD4.setLayoutY(35);
                }
                
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
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoD1 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD1.setLayoutX(32);
                    anchoD1.setLayoutY(35);
                    anchoD1.setFill(Color.TRANSPARENT);
                    anchoD1.setStroke(dibujar.getColor());
                    anchoD1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD1.setTranslateX(1);
                    
                    CubicCurve anchoD2 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD2.setLayoutX(32);
                    anchoD2.setLayoutY(35);
                    anchoD2.setFill(Color.TRANSPARENT);
                    anchoD2.setStroke(dibujar.getColor());
                    anchoD2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD2.setTranslateY(1);
                }
                if (palabra.isS()){
                    Line subE = new Line();
                    subE.setStartX(45); //tamaño E es 45
                    subE.setLayoutX(0);
                    subE.setLayoutY(55);
                    fondo.getChildren().add(subE);
                }
                
                if (dibujar.getControl()){
                    Circle pD1 = new Circle(cubicaD1.getStartX(),cubicaD1.getStartY(),2,Color.RED);
                    pD1.setLayoutX(32);
                    pD1.setLayoutY(35);
                    Circle pD2 = new Circle(cubicaD1.getControlX1(),cubicaD1.getControlY1(),2,Color.RED);
                    pD2.setLayoutX(32);
                    pD2.setLayoutY(35);
                    Circle pD3 = new Circle(cubicaD1.getControlX2(),cubicaD1.getControlY2(),2,Color.RED);
                    pD3.setLayoutX(32);
                    pD3.setLayoutY(35);
                    Circle pD4 = new Circle(cubicaD1.getEndX(),cubicaD1.getEndY(),2,Color.RED);
                    pD4.setLayoutX(32);
                    pD4.setLayoutY(35);
                }
                
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
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoD1 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD1.setLayoutX(32);
                    anchoD1.setLayoutY(35);
                    anchoD1.setFill(Color.TRANSPARENT);
                    anchoD1.setStroke(dibujar.getColor());
                    anchoD1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD1.setTranslateX(1);
                    
                    CubicCurve anchoD2 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD2.setLayoutX(32);
                    anchoD2.setLayoutY(35);
                    anchoD2.setFill(Color.TRANSPARENT);
                    anchoD2.setStroke(dibujar.getColor());
                    anchoD2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD2.setTranslateY(1);
                }
                if (palabra.isS()){
                    Line subE = new Line();
                    subE.setStartX(45); //tamaño E es 45
                    subE.setLayoutX(0);
                    subE.setLayoutY(55);
                    fondo.getChildren().add(subE);
                }
                
                if (dibujar.getControl()){
                    Circle pD1 = new Circle(cubicaD1.getStartX(),cubicaD1.getStartY(),2,Color.RED);
                    pD1.setLayoutX(32);
                    pD1.setLayoutY(35);
                    Circle pD2 = new Circle(cubicaD1.getControlX1(),cubicaD1.getControlY1(),2,Color.RED);
                    pD2.setLayoutX(32);
                    pD2.setLayoutY(35);
                    Circle pD3 = new Circle(cubicaD1.getControlX2(),cubicaD1.getControlY2(),2,Color.RED);
                    pD3.setLayoutX(32);
                    pD3.setLayoutY(35);
                    Circle pD4 = new Circle(cubicaD1.getEndX(),cubicaD1.getEndY(),2,Color.RED);
                    pD4.setLayoutX(32);
                    pD4.setLayoutY(35);
                }
                
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
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoD1 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD1.setLayoutX(32);
                    anchoD1.setLayoutY(35);
                    anchoD1.setFill(Color.TRANSPARENT);
                    anchoD1.setStroke(dibujar.getColor());
                    anchoD1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD1.setTranslateX(1);
                    
                    CubicCurve anchoD2 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD2.setLayoutX(32);
                    anchoD2.setLayoutY(35);
                    anchoD2.setFill(Color.TRANSPARENT);
                    anchoD2.setStroke(dibujar.getColor());
                    anchoD2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD2.setTranslateY(1);
                }
                if (palabra.isS()){
                    Line subE = new Line();
                    subE.setStartX(45); //tamaño E es 45
                    subE.setLayoutX(0);
                    subE.setLayoutY(55);
                    fondo.getChildren().add(subE);
                }
                
                if (dibujar.getControl()){
                    Circle pD1 = new Circle(cubicaD1.getStartX(),cubicaD1.getStartY(),2,Color.RED);
                    pD1.setLayoutX(32);
                    pD1.setLayoutY(35);
                    Circle pD2 = new Circle(cubicaD1.getControlX1(),cubicaD1.getControlY1(),2,Color.RED);
                    pD2.setLayoutX(32);
                    pD2.setLayoutY(35);
                    Circle pD3 = new Circle(cubicaD1.getControlX2(),cubicaD1.getControlY2(),2,Color.RED);
                    pD3.setLayoutX(32);
                    pD3.setLayoutY(35);
                    Circle pD4 = new Circle(cubicaD1.getEndX(),cubicaD1.getEndY(),2,Color.RED);
                    pD4.setLayoutX(32);
                    pD4.setLayoutY(35);
                }
                
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
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoD1 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD1.setLayoutX(32);
                    anchoD1.setLayoutY(35);
                    anchoD1.setFill(Color.TRANSPARENT);
                    anchoD1.setStroke(dibujar.getColor());
                    anchoD1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD1.setTranslateX(1);
                    
                    CubicCurve anchoD2 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD2.setLayoutX(32);
                    anchoD2.setLayoutY(35);
                    anchoD2.setFill(Color.TRANSPARENT);
                    anchoD2.setStroke(dibujar.getColor());
                    anchoD2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD2.setTranslateY(1);
                }
                if (palabra.isS()){
                    Line subE = new Line();
                    subE.setStartX(45); //tamaño E es 45
                    subE.setLayoutX(0);
                    subE.setLayoutY(55);
                    fondo.getChildren().add(subE);
                }
                
                if (dibujar.getControl()){
                    Circle pD1 = new Circle(cubicaD1.getStartX(),cubicaD1.getStartY(),2,Color.RED);
                    pD1.setLayoutX(32);
                    pD1.setLayoutY(35);
                    Circle pD2 = new Circle(cubicaD1.getControlX1(),cubicaD1.getControlY1(),2,Color.RED);
                    pD2.setLayoutX(32);
                    pD2.setLayoutY(35);
                    Circle pD3 = new Circle(cubicaD1.getControlX2(),cubicaD1.getControlY2(),2,Color.RED);
                    pD3.setLayoutX(32);
                    pD3.setLayoutY(35);
                    Circle pD4 = new Circle(cubicaD1.getEndX(),cubicaD1.getEndY(),2,Color.RED);
                    pD4.setLayoutX(32);
                    pD4.setLayoutY(35);
                }
                
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
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoD1 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD1.setLayoutX(32);
                    anchoD1.setLayoutY(35);
                    anchoD1.setFill(Color.TRANSPARENT);
                    anchoD1.setStroke(dibujar.getColor());
                    anchoD1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD1.setTranslateX(1);
                    
                    CubicCurve anchoD2 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD2.setLayoutX(32);
                    anchoD2.setLayoutY(35);
                    anchoD2.setFill(Color.TRANSPARENT);
                    anchoD2.setStroke(dibujar.getColor());
                    anchoD2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD2.setTranslateY(1);
                }
                if (palabra.isS()){
                    Line subE = new Line();
                    subE.setStartX(45); //tamaño E es 45
                    subE.setLayoutX(0);
                    subE.setLayoutY(55);
                    fondo.getChildren().add(subE);
                }
                
                if (dibujar.getControl()){
                    Circle pD1 = new Circle(cubicaD1.getStartX(),cubicaD1.getStartY(),2,Color.RED);
                    pD1.setLayoutX(32);
                    pD1.setLayoutY(35);
                    Circle pD2 = new Circle(cubicaD1.getControlX1(),cubicaD1.getControlY1(),2,Color.RED);
                    pD2.setLayoutX(32);
                    pD2.setLayoutY(35);
                    Circle pD3 = new Circle(cubicaD1.getControlX2(),cubicaD1.getControlY2(),2,Color.RED);
                    pD3.setLayoutX(32);
                    pD3.setLayoutY(35);
                    Circle pD4 = new Circle(cubicaD1.getEndX(),cubicaD1.getEndY(),2,Color.RED);
                    pD4.setLayoutX(32);
                    pD4.setLayoutY(35);
                }
                
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
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoD1 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD1.setLayoutX(32);
                    anchoD1.setLayoutY(35);
                    anchoD1.setFill(Color.TRANSPARENT);
                    anchoD1.setStroke(dibujar.getColor());
                    anchoD1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD1.setTranslateX(1);
                    
                    CubicCurve anchoD2 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD2.setLayoutX(32);
                    anchoD2.setLayoutY(35);
                    anchoD2.setFill(Color.TRANSPARENT);
                    anchoD2.setStroke(dibujar.getColor());
                    anchoD2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD2.setTranslateY(1);
                }
                if (palabra.isS()){
                    Line subE = new Line();
                    subE.setStartX(45); //tamaño E es 45
                    subE.setLayoutX(0);
                    subE.setLayoutY(55);
                    fondo.getChildren().add(subE);
                }
                
                if (dibujar.getControl()){
                    Circle pD1 = new Circle(cubicaD1.getStartX(),cubicaD1.getStartY(),2,Color.RED);
                    pD1.setLayoutX(32);
                    pD1.setLayoutY(35);
                    Circle pD2 = new Circle(cubicaD1.getControlX1(),cubicaD1.getControlY1(),2,Color.RED);
                    pD2.setLayoutX(32);
                    pD2.setLayoutY(35);
                    Circle pD3 = new Circle(cubicaD1.getControlX2(),cubicaD1.getControlY2(),2,Color.RED);
                    pD3.setLayoutX(32);
                    pD3.setLayoutY(35);
                    Circle pD4 = new Circle(cubicaD1.getEndX(),cubicaD1.getEndY(),2,Color.RED);
                    pD4.setLayoutX(32);
                    pD4.setLayoutY(35);
                }
                
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
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoD1 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD1.setLayoutX(32);
                    anchoD1.setLayoutY(35);
                    anchoD1.setFill(Color.TRANSPARENT);
                    anchoD1.setStroke(dibujar.getColor());
                    anchoD1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD1.setTranslateX(1);
                    
                    CubicCurve anchoD2 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD2.setLayoutX(32);
                    anchoD2.setLayoutY(35);
                    anchoD2.setFill(Color.TRANSPARENT);
                    anchoD2.setStroke(dibujar.getColor());
                    anchoD2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD2.setTranslateY(1);
                }
                if (palabra.isS()){
                    Line subE = new Line();
                    subE.setStartX(45); //tamaño E es 45
                    subE.setLayoutX(0);
                    subE.setLayoutY(55);
                    fondo.getChildren().add(subE);
                }
                
                if (dibujar.getControl()){
                    Circle pD1 = new Circle(cubicaD1.getStartX(),cubicaD1.getStartY(),2,Color.RED);
                    pD1.setLayoutX(32);
                    pD1.setLayoutY(35);
                    Circle pD2 = new Circle(cubicaD1.getControlX1(),cubicaD1.getControlY1(),2,Color.RED);
                    pD2.setLayoutX(32);
                    pD2.setLayoutY(35);
                    Circle pD3 = new Circle(cubicaD1.getControlX2(),cubicaD1.getControlY2(),2,Color.RED);
                    pD3.setLayoutX(32);
                    pD3.setLayoutY(35);
                    Circle pD4 = new Circle(cubicaD1.getEndX(),cubicaD1.getEndY(),2,Color.RED);
                    pD4.setLayoutX(32);
                    pD4.setLayoutY(35);
                }
                
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
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoD1 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD1.setLayoutX(32);
                    anchoD1.setLayoutY(35);
                    anchoD1.setFill(Color.TRANSPARENT);
                    anchoD1.setStroke(dibujar.getColor());
                    anchoD1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD1.setTranslateX(1);
                    
                    CubicCurve anchoD2 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD2.setLayoutX(32);
                    anchoD2.setLayoutY(35);
                    anchoD2.setFill(Color.TRANSPARENT);
                    anchoD2.setStroke(dibujar.getColor());
                    anchoD2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD2.setTranslateY(1);
                }
                if (palabra.isS()){
                    Line subE = new Line();
                    subE.setStartX(45); //tamaño E es 45
                    subE.setLayoutX(0);
                    subE.setLayoutY(55);
                    fondo.getChildren().add(subE);
                }
                
                if (dibujar.getControl()){
                    Circle pD1 = new Circle(cubicaD1.getStartX(),cubicaD1.getStartY(),2,Color.RED);
                    pD1.setLayoutX(32);
                    pD1.setLayoutY(35);
                    Circle pD2 = new Circle(cubicaD1.getControlX1(),cubicaD1.getControlY1(),2,Color.RED);
                    pD2.setLayoutX(32);
                    pD2.setLayoutY(35);
                    Circle pD3 = new Circle(cubicaD1.getControlX2(),cubicaD1.getControlY2(),2,Color.RED);
                    pD3.setLayoutX(32);
                    pD3.setLayoutY(35);
                    Circle pD4 = new Circle(cubicaD1.getEndX(),cubicaD1.getEndY(),2,Color.RED);
                    pD4.setLayoutX(32);
                    pD4.setLayoutY(35);
                }
                
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
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoD1 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD1.setLayoutX(32);
                    anchoD1.setLayoutY(35);
                    anchoD1.setFill(Color.TRANSPARENT);
                    anchoD1.setStroke(dibujar.getColor());
                    anchoD1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD1.setTranslateX(1);
                    
                    CubicCurve anchoD2 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD2.setLayoutX(32);
                    anchoD2.setLayoutY(35);
                    anchoD2.setFill(Color.TRANSPARENT);
                    anchoD2.setStroke(dibujar.getColor());
                    anchoD2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD2.setTranslateY(1);
                }
                if (palabra.isS()){
                    Line subE = new Line();
                    subE.setStartX(45); //tamaño E es 45
                    subE.setLayoutX(0);
                    subE.setLayoutY(55);
                    fondo.getChildren().add(subE);
                }
                
                if (dibujar.getControl()){
                    Circle pD1 = new Circle(cubicaD1.getStartX(),cubicaD1.getStartY(),2,Color.RED);
                    pD1.setLayoutX(32);
                    pD1.setLayoutY(35);
                    Circle pD2 = new Circle(cubicaD1.getControlX1(),cubicaD1.getControlY1(),2,Color.RED);
                    pD2.setLayoutX(32);
                    pD2.setLayoutY(35);
                    Circle pD3 = new Circle(cubicaD1.getControlX2(),cubicaD1.getControlY2(),2,Color.RED);
                    pD3.setLayoutX(32);
                    pD3.setLayoutY(35);
                    Circle pD4 = new Circle(cubicaD1.getEndX(),cubicaD1.getEndY(),2,Color.RED);
                    pD4.setLayoutX(32);
                    pD4.setLayoutY(35);
                }
                
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
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoD1 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD1.setLayoutX(32);
                    anchoD1.setLayoutY(35);
                    anchoD1.setFill(Color.TRANSPARENT);
                    anchoD1.setStroke(dibujar.getColor());
                    anchoD1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD1.setTranslateX(1);
                    
                    CubicCurve anchoD2 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD2.setLayoutX(32);
                    anchoD2.setLayoutY(35);
                    anchoD2.setFill(Color.TRANSPARENT);
                    anchoD2.setStroke(dibujar.getColor());
                    anchoD2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD2.setTranslateY(1);
                }
                if (palabra.isS()){
                    Line subE = new Line();
                    subE.setStartX(45); //tamaño E es 45
                    subE.setLayoutX(0);
                    subE.setLayoutY(55);
                    fondo.getChildren().add(subE);
                }
                
                if (dibujar.getControl()){
                    Circle pD1 = new Circle(cubicaD1.getStartX(),cubicaD1.getStartY(),2,Color.RED);
                    pD1.setLayoutX(32);
                    pD1.setLayoutY(35);
                    Circle pD2 = new Circle(cubicaD1.getControlX1(),cubicaD1.getControlY1(),2,Color.RED);
                    pD2.setLayoutX(32);
                    pD2.setLayoutY(35);
                    Circle pD3 = new Circle(cubicaD1.getControlX2(),cubicaD1.getControlY2(),2,Color.RED);
                    pD3.setLayoutX(32);
                    pD3.setLayoutY(35);
                    Circle pD4 = new Circle(cubicaD1.getEndX(),cubicaD1.getEndY(),2,Color.RED);
                    pD4.setLayoutX(32);
                    pD4.setLayoutY(35);
                }
                
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
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoD1 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD1.setLayoutX(32);
                    anchoD1.setLayoutY(35);
                    anchoD1.setFill(Color.TRANSPARENT);
                    anchoD1.setStroke(dibujar.getColor());
                    anchoD1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD1.setTranslateX(1);
                    
                    CubicCurve anchoD2 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD2.setLayoutX(32);
                    anchoD2.setLayoutY(35);
                    anchoD2.setFill(Color.TRANSPARENT);
                    anchoD2.setStroke(dibujar.getColor());
                    anchoD2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD2.setTranslateY(1);
                }
                if (palabra.isS()){
                    Line subE = new Line();
                    subE.setStartX(45); //tamaño E es 45
                    subE.setLayoutX(0);
                    subE.setLayoutY(55);
                    fondo.getChildren().add(subE);
                }
                
                if (dibujar.getControl()){
                    Circle pD1 = new Circle(cubicaD1.getStartX(),cubicaD1.getStartY(),2,Color.RED);
                    pD1.setLayoutX(32);
                    pD1.setLayoutY(35);
                    Circle pD2 = new Circle(cubicaD1.getControlX1(),cubicaD1.getControlY1(),2,Color.RED);
                    pD2.setLayoutX(32);
                    pD2.setLayoutY(35);
                    Circle pD3 = new Circle(cubicaD1.getControlX2(),cubicaD1.getControlY2(),2,Color.RED);
                    pD3.setLayoutX(32);
                    pD3.setLayoutY(35);
                    Circle pD4 = new Circle(cubicaD1.getEndX(),cubicaD1.getEndY(),2,Color.RED);
                    pD4.setLayoutX(32);
                    pD4.setLayoutY(35);
                }
                
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
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoD1 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD1.setLayoutX(32);
                    anchoD1.setLayoutY(35);
                    anchoD1.setFill(Color.TRANSPARENT);
                    anchoD1.setStroke(dibujar.getColor());
                    anchoD1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD1.setTranslateX(1);
                    
                    CubicCurve anchoD2 = new CubicCurve(cubicaD1.getStartX(),cubicaD1.getStartY(),cubicaD1.getControlX1(),cubicaD1.getControlY1(),cubicaD1.getControlX2(),cubicaD1.getControlY2(),cubicaD1.getEndX(),cubicaD1.getEndY());
                    anchoD2.setLayoutX(32);
                    anchoD2.setLayoutY(35);
                    anchoD2.setFill(Color.TRANSPARENT);
                    anchoD2.setStroke(dibujar.getColor());
                    anchoD2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoD2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoD2.setTranslateY(1);
                }
                if (palabra.isS()){
                    Line subE = new Line();
                    subE.setStartX(45); //tamaño E es 45
                    subE.setLayoutX(0);
                    subE.setLayoutY(55);
                    fondo.getChildren().add(subE);
                }
                
                if (dibujar.getControl()){
                    Circle pD1 = new Circle(cubicaD1.getStartX(),cubicaD1.getStartY(),2,Color.RED);
                    pD1.setLayoutX(32);
                    pD1.setLayoutY(35);
                    Circle pD2 = new Circle(cubicaD1.getControlX1(),cubicaD1.getControlY1(),2,Color.RED);
                    pD2.setLayoutX(32);
                    pD2.setLayoutY(35);
                    Circle pD3 = new Circle(cubicaD1.getControlX2(),cubicaD1.getControlY2(),2,Color.RED);
                    pD3.setLayoutX(32);
                    pD3.setLayoutY(35);
                    Circle pD4 = new Circle(cubicaD1.getEndX(),cubicaD1.getEndY(),2,Color.RED);
                    pD4.setLayoutX(32);
                    pD4.setLayoutY(35);
                }
                
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
                return fondo;
            case '+':
                return fondo;
            default:
                return null;
        }
    }
    
}