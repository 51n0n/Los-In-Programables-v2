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
    
    Estilos estilos = new Estilos();
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
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                
                //Atributos Lineas
                cubicaA1.setLayoutX(41);
                cubicaA1.setLayoutY(44);
                cubicaA1.setFill(Color.TRANSPARENT);
                cubicaA1.setStroke(dibujar.getColor());
                cubicaA1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaA1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                lineaA.setLayoutX(29);
                lineaA.setLayoutY(27);
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
                    estilos.cubicaNegrita(cubicaA1, fondo);
                    estilos.cubicaNegrita(cubicaA2, fondo);
                    estilos.lineaNegrita(lineaA, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaA1, fondo);
                    estilos.cubicaControl(cubicaA2, fondo);
                    estilos.lineaControl(lineaA, fondo);
                }
                
                fondo.getChildren().addAll(cubicaA1,cubicaA2,lineaA);
                return fondo;
            case 'B':
                CubicCurve cubicaB1 = new CubicCurve(-16.6,17,0.19,23.4,-6.8,-33,11.19,-24.8);
                CubicCurve cubicaB2 = new CubicCurve(-25.84,-3.8,-21.99,-22.99,27.19,-7.6,-1.1,7.8);
                CubicCurve cubicaB3 = new CubicCurve(-17.4,8.79,-4,22.59,16.4,-1.8,-8,-9);
                CubicCurve cubicaB4 = new CubicCurve(0.59,-31.3,-5,-15.59,23,-24.5,11.79,-35.5);

                //Atributos del Fondo
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x

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
                    subB.setStroke(dibujar.getColor());
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
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
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
                    subC.setStroke(dibujar.getColor());
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
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
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
                    subD.setStroke(dibujar.getColor());
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
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //PRIMERA inferior izquierda base
                cubicaE1.setLayoutX(27);
                cubicaE1.setLayoutY(24);
                cubicaE1.setFill(Color.TRANSPARENT);
                cubicaE1.setStroke(dibujar.getColor());
                cubicaE1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaE1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //centro union s
                cubicaE2.setLayoutX(16);
                cubicaE2.setLayoutY(23);
                cubicaE2.setFill(Color.TRANSPARENT);
                cubicaE2.setStroke(dibujar.getColor());
                cubicaE2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaE2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //curba superior
                cubicaE3.setLayoutX(15);
                cubicaE3.setLayoutY(24);
                cubicaE3.setFill(Color.TRANSPARENT);
                cubicaE3.setStroke(dibujar.getColor());
                cubicaE3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaE3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //colita inferior derecha
                cubicaE4.setLayoutX(23);
                cubicaE4.setLayoutY(50);
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
                    subE.setStroke(dibujar.getColor());
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
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //central
                cubicaF1.setLayoutX(26);
                cubicaF1.setLayoutY(14);
                cubicaF1.setFill(Color.TRANSPARENT);
                cubicaF1.setStroke(dibujar.getColor());
                cubicaF1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaF1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //superior
                cubicaF2.setLayoutX(36);
                cubicaF2.setLayoutY(26);
                cubicaF2.setFill(Color.TRANSPARENT);
                cubicaF2.setStroke(dibujar.getColor());
                cubicaF2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaF2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //colita superior
                cubicaF3.setLayoutX(-1);
                cubicaF3.setLayoutY(27);
                cubicaF3.setFill(Color.TRANSPARENT);
                cubicaF3.setStroke(dibujar.getColor());
                cubicaF3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaF3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //linea central
                lineaF1.setLayoutX(-23);
                lineaF1.setLayoutY(30);
                lineaF1.setFill(Color.TRANSPARENT);
                lineaF1.setStroke(dibujar.getColor());
                lineaF1.setStrokeLineCap(StrokeLineCap.ROUND);
                lineaF1.setStrokeLineJoin(StrokeLineJoin.ROUND);       
                //linFea terminal central
                lineaF2.setLayoutX(-16);
                lineaF2.setLayoutY(30);
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
                    subF.setStroke(dibujar.getColor());
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
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //lado izquiero primera
                cubicaG1.setLayoutX(33);
                cubicaG1.setLayoutY(15);
                cubicaG1.setFill(Color.TRANSPARENT);
                cubicaG1.setStroke(dibujar.getColor());
                cubicaG1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaG1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                cubicaG2.setLayoutX(29);
                cubicaG2.setLayoutY(0);
                cubicaG2.setFill(Color.TRANSPARENT);
                cubicaG2.setStroke(dibujar.getColor());
                cubicaG2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaG2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                cubicaG3.setLayoutX(38);
                cubicaG3.setLayoutY(12);
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
                    subG.setStroke(dibujar.getColor());
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
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //lado izquiero primera
                cubicaH1.setLayoutX(35);
                cubicaH1.setLayoutY(15);
                cubicaH1.setFill(Color.TRANSPARENT);
                cubicaH1.setStroke(dibujar.getColor());
                cubicaH1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaH1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                // supeHrior izquierdo colita
                cubicaH2.setLayoutX(22);
                cubicaH2.setLayoutY(8);
                cubicaH2.setFill(Color.TRANSPARENT);
                cubicaH2.setStroke(dibujar.getColor());
                cubicaH2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaH2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //dereHcha segunda
                cubicaH3.setLayoutX(45);
                cubicaH3.setLayoutY(16);
                cubicaH3.setFill(Color.TRANSPARENT);
                cubicaH3.setStroke(dibujar.getColor());
                cubicaH3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaH3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //central
                lineaH.setLayoutX(27);
                lineaH.setLayoutY(30);
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
                    subH.setStroke(dibujar.getColor());
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
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //SUPERIOR
                cubicaI1.setLayoutX(32);
                cubicaI1.setLayoutY(9);
                cubicaI1.setFill(Color.TRANSPARENT);
                cubicaI1.setStroke(dibujar.getColor());
                cubicaI1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaI1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //BASE
                cubicaI2.setLayoutX(44);
                cubicaI2.setLayoutY(19);
                cubicaI2.setFill(Color.TRANSPARENT);
                cubicaI2.setStroke(dibujar.getColor());
                cubicaI2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaI2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //FINALI BASE
                cubicaI3.setLayoutX(1);
                cubicaI3.setLayoutY(64);
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
                    subI.setStroke(dibujar.getColor());
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
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //medio
                cubicaJ1.setLayoutX(39);
                cubicaJ1.setLayoutY(17);
                cubicaJ1.setFill(Color.TRANSPARENT);
                cubicaJ1.setStroke(dibujar.getColor());
                cubicaJ1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaJ1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //superior
                cubicaJ2.setLayoutX(30);
                cubicaJ2.setLayoutY(5);
                cubicaJ2.setFill(Color.TRANSPARENT);
                cubicaJ2.setStroke(dibujar.getColor());
                cubicaJ2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaJ2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //FINALJ BASE
                cubicaJ3.setLayoutX(39);
                cubicaJ3.setLayoutY(16);
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
                    subJ.setStroke(dibujar.getColor());
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
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x

                //PRIMERA izquierda
                cubicaK1.setLayoutX(35);
                cubicaK1.setLayoutY(14);
                cubicaK1.setFill(Color.TRANSPARENT);
                cubicaK1.setStroke(dibujar.getColor());
                cubicaK1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaK1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito izquierda
                cubicaK2.setLayoutX(23);
                cubicaK2.setLayoutY(7);
                cubicaK2.setFill(Color.TRANSPARENT);
                cubicaK2.setStroke(dibujar.getColor());
                cubicaK2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaK2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecha superior
                cubicaK3.setLayoutX(50);
                cubicaK3.setLayoutY(-7);
                cubicaK3.setFill(Color.TRANSPARENT);
                cubicaK3.setStroke(dibujar.getColor());
                cubicaK3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaK3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecha inferior
                cubicaK4.setLayoutX(60);
                cubicaK4.setLayoutY(4);
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
                    subK.setStroke(dibujar.getColor());
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
                CubicCurve cubicaL1 = new CubicCurve(-31.19,37.6,1.19,41.4,-29,-5.59,-4,-7.18);
                CubicCurve cubicaL2 = new CubicCurve(-33.6,-12.8,-10.95,-2,4.4,-13.93,-10.95,-17.09);
                CubicCurve cubicaL3 = new CubicCurve(-35.25,-10.79,-51.39,-24.2,5.4,2,-1.8,-14.59);
                //Atributos del Fondo
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //BASE
                cubicaL1.setLayoutX(39);
                cubicaL1.setLayoutY(13);
                cubicaL1.setFill(Color.TRANSPARENT);
                cubicaL1.setStroke(dibujar.getColor());
                cubicaL1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaL1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito
                cubicaL2.setLayoutX(47);
                cubicaL2.setLayoutY(23);
                cubicaL2.setFill(Color.TRANSPARENT);
                cubicaL2.setStroke(dibujar.getColor());
                cubicaL2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaL2.setStrokeLineJoin(StrokeLineJoin.ROUND);       
                //
                cubicaL3.setLayoutX(42);
                cubicaL3.setLayoutY(61);
                cubicaL3.setFill(Color.TRANSPARENT);
                cubicaL3.setStroke(dibujar.getColor());
                cubicaL3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaL3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoL1 = new CubicCurve(cubicaL1.getStartX(),cubicaL1.getStartY(),cubicaL1.getControlX1(),cubicaL1.getControlY1(),cubicaL1.getControlX2(),cubicaL1.getControlY2(),cubicaL1.getEndX(),cubicaL1.getEndY());
                    anchoL1.setLayoutX(39);
                    anchoL1.setLayoutY(13);
                    anchoL1.setFill(Color.TRANSPARENT);
                    anchoL1.setStroke(dibujar.getColor());
                    anchoL1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoL1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoL1.setTranslateX(1);
                    
                    CubicCurve anchoL2 = new CubicCurve(cubicaL1.getStartX(),cubicaL1.getStartY(),cubicaL1.getControlX1(),cubicaL1.getControlY1(),cubicaL1.getControlX2(),cubicaL1.getControlY2(),cubicaL1.getEndX(),cubicaL1.getEndY());
                    anchoL2.setLayoutX(39);
                    anchoL2.setLayoutY(13);
                    anchoL2.setFill(Color.TRANSPARENT);
                    anchoL2.setStroke(dibujar.getColor());
                    anchoL2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoL2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoL2.setTranslateY(1);
                    
                    CubicCurve anchoL3 = new CubicCurve(cubicaL2.getStartX(),cubicaL2.getStartY(),cubicaL2.getControlX1(),cubicaL2.getControlY1(),cubicaL2.getControlX2(),cubicaL2.getControlY2(),cubicaL2.getEndX(),cubicaL2.getEndY());
                    anchoL3.setLayoutX(47);
                    anchoL3.setLayoutY(23);
                    anchoL3.setFill(Color.TRANSPARENT);
                    anchoL3.setStroke(dibujar.getColor());
                    anchoL3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoL3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoL3.setTranslateX(1);
                    
                    CubicCurve anchoL4 = new CubicCurve(cubicaL2.getStartX(),cubicaL2.getStartY(),cubicaL2.getControlX1(),cubicaL2.getControlY1(),cubicaL2.getControlX2(),cubicaL2.getControlY2(),cubicaL2.getEndX(),cubicaL2.getEndY());
                    anchoL4.setLayoutX(47);
                    anchoL4.setLayoutY(23);
                    anchoL4.setFill(Color.TRANSPARENT);
                    anchoL4.setStroke(dibujar.getColor());
                    anchoL4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoL4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoL4.setTranslateY(1);
                    
                    CubicCurve anchoL5 = new CubicCurve(cubicaL3.getStartX(),cubicaL3.getStartY(),cubicaL3.getControlX1(),cubicaL3.getControlY1(),cubicaL3.getControlX2(),cubicaL3.getControlY2(),cubicaL3.getEndX(),cubicaL3.getEndY());
                    anchoL5.setLayoutX(42);
                    anchoL5.setLayoutY(61);
                    anchoL5.setFill(Color.TRANSPARENT);
                    anchoL5.setStroke(dibujar.getColor());
                    anchoL5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoL5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoL5.setTranslateX(1);
                    
                    CubicCurve anchoL6 = new CubicCurve(cubicaL3.getStartX(),cubicaL3.getStartY(),cubicaL3.getControlX1(),cubicaL3.getControlY1(),cubicaL3.getControlX2(),cubicaL3.getControlY2(),cubicaL3.getEndX(),cubicaL3.getEndY());
                    anchoL6.setLayoutX(42);
                    anchoL6.setLayoutY(61);
                    anchoL6.setFill(Color.TRANSPARENT);
                    anchoL6.setStroke(dibujar.getColor());
                    anchoL6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoL6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoL6.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoL1,anchoL2,anchoL3,anchoL4,anchoL5,anchoL6);
                }
                if (palabra.isS()){
                    Line subL = new Line();
                    subL.setStartX(45); //tamaño L es 45
                    subL.setLayoutX(0);
                    subL.setLayoutY(55);
                    subL.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subL);
                }
                
                if (dibujar.getControl()){
                    Circle pL1 = new Circle(cubicaL1.getStartX(),cubicaL1.getStartY(),2,Color.RED);
                    pL1.setLayoutX(39);
                    pL1.setLayoutY(13);
                    Circle pL2 = new Circle(cubicaL1.getControlX1(),cubicaL1.getControlY1(),2,Color.RED);
                    pL2.setLayoutX(39);
                    pL2.setLayoutY(13);
                    Circle pL3 = new Circle(cubicaL1.getControlX2(),cubicaL1.getControlY2(),2,Color.RED);
                    pL3.setLayoutX(39);
                    pL3.setLayoutY(13);
                    Circle pL4 = new Circle(cubicaL1.getEndX(),cubicaL1.getEndY(),2,Color.RED);
                    pL4.setLayoutX(39);
                    pL4.setLayoutY(13);
                    
                    Circle pL5 = new Circle(cubicaL2.getStartX(),cubicaL2.getStartY(),2,Color.RED);
                    pL5.setLayoutX(47);
                    pL5.setLayoutY(23);
                    Circle pL6 = new Circle(cubicaL2.getControlX1(),cubicaL2.getControlY1(),2,Color.RED);
                    pL6.setLayoutX(47);
                    pL6.setLayoutY(23);
                    Circle pL7 = new Circle(cubicaL2.getControlX2(),cubicaL2.getControlY2(),2,Color.RED);
                    pL7.setLayoutX(47);
                    pL7.setLayoutY(23);
                    Circle pL8 = new Circle(cubicaL2.getEndX(),cubicaL2.getEndY(),2,Color.RED);
                    pL8.setLayoutX(47);
                    pL8.setLayoutY(23);
                    
                    Circle pL9 = new Circle(cubicaL3.getStartX(),cubicaL3.getStartY(),2,Color.RED);
                    pL9.setLayoutX(42);
                    pL9.setLayoutY(61);
                    Circle pL10 = new Circle(cubicaL3.getControlX1(),cubicaL3.getControlY1(),2,Color.RED);
                    pL10.setLayoutX(42);
                    pL10.setLayoutY(61);
                    Circle pL11 = new Circle(cubicaL3.getControlX2(),cubicaL3.getControlY2(),2,Color.RED);
                    pL11.setLayoutX(42);
                    pL11.setLayoutY(61);
                    Circle pL12 = new Circle(cubicaL3.getEndX(),cubicaL3.getEndY(),2,Color.RED);
                    pL12.setLayoutX(42);
                    pL12.setLayoutY(61);
                    
                    fondo.getChildren().addAll(pL1,pL2,pL3,pL4,pL5,pL6,pL7,pL8,pL9,pL10,pL11,pL12);
                }
                
                fondo.getChildren().addAll(cubicaL1,cubicaL2,cubicaL3);
                return fondo;
            case 'M':
                CubicCurve cubicaM1 = new CubicCurve(-33,35,-13.8,48,-31.39,-6,-10.59,-6);   
                CubicCurve cubicaM2 = new CubicCurve(-11.19,20.79,-7.29,6.99,-26,-1.59,-11.19,-10);
                CubicCurve cubicaM3 = new CubicCurve(-22.16,11.94,-13.39,2.59,-15.59,-20.16,-1.4,-20.16);
                CubicCurve cubicaM4 = new CubicCurve(-29.64,36,0.4,44,-29.64,-2.4,-11.8,-6.59);
                QuadCurve cuadraticaM = new QuadCurve(-33.16,-4.9,-19,2.5,-10.39,-14.59);
                //Atributos del Fondo
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //PRIMERA izquierda
                cubicaM1.setLayoutX(33);
                cubicaM1.setLayoutY(14);
                cubicaM1.setFill(Color.TRANSPARENT);
                cubicaM1.setStroke(dibujar.getColor());
                cubicaM1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaM1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //medioM izquierdo
                cubicaM2.setLayoutX(34);
                cubicaM2.setLayoutY(18);
                cubicaM2.setFill(Color.TRANSPARENT);
                cubicaM2.setStroke(dibujar.getColor());
                cubicaM2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaM2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                // mediMo derecho
                cubicaM3.setLayoutX(44);
                cubicaM3.setLayoutY(28);
                cubicaM3.setFill(Color.TRANSPARENT);
                cubicaM3.setStroke(dibujar.getColor());
                cubicaM3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaM3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecho
                cubicaM4.setLayoutX(54);
                cubicaM4.setLayoutY(15);
                cubicaM4.setFill(Color.TRANSPARENT);
                cubicaM4.setStroke(dibujar.getColor());
                cubicaM4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaM4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cuadrMatica
                cuadraticaM.setLayoutX(56);
                cuadraticaM.setLayoutY(55.5);
                cuadraticaM.setFill(Color.TRANSPARENT);
                cuadraticaM.setStroke(dibujar.getColor());
                cuadraticaM.setStrokeLineCap(StrokeLineCap.ROUND);
                cuadraticaM.setStrokeLineJoin(StrokeLineJoin.ROUND);     
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoM1 = new CubicCurve(cubicaM1.getStartX(),cubicaM1.getStartY(),cubicaM1.getControlX1(),cubicaM1.getControlY1(),cubicaM1.getControlX2(),cubicaM1.getControlY2(),cubicaM1.getEndX(),cubicaM1.getEndY());
                    anchoM1.setLayoutX(33);
                    anchoM1.setLayoutY(14);
                    anchoM1.setFill(Color.TRANSPARENT);
                    anchoM1.setStroke(dibujar.getColor());
                    anchoM1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoM1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoM1.setTranslateX(1);
                    
                    CubicCurve anchoM2 = new CubicCurve(cubicaM1.getStartX(),cubicaM1.getStartY(),cubicaM1.getControlX1(),cubicaM1.getControlY1(),cubicaM1.getControlX2(),cubicaM1.getControlY2(),cubicaM1.getEndX(),cubicaM1.getEndY());
                    anchoM2.setLayoutX(33);
                    anchoM2.setLayoutY(14);
                    anchoM2.setFill(Color.TRANSPARENT);
                    anchoM2.setStroke(dibujar.getColor());
                    anchoM2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoM2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoM2.setTranslateY(1);
                    
                    CubicCurve anchoM3 = new CubicCurve(cubicaM2.getStartX(),cubicaM2.getStartY(),cubicaM2.getControlX1(),cubicaM2.getControlY1(),cubicaM2.getControlX2(),cubicaM2.getControlY2(),cubicaM2.getEndX(),cubicaM2.getEndY());
                    anchoM3.setLayoutX(34);
                    anchoM3.setLayoutY(18);
                    anchoM3.setFill(Color.TRANSPARENT);
                    anchoM3.setStroke(dibujar.getColor());
                    anchoM3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoM3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoM3.setTranslateX(1);
                    
                    CubicCurve anchoM4 = new CubicCurve(cubicaM2.getStartX(),cubicaM2.getStartY(),cubicaM2.getControlX1(),cubicaM2.getControlY1(),cubicaM2.getControlX2(),cubicaM2.getControlY2(),cubicaM2.getEndX(),cubicaM2.getEndY());
                    anchoM4.setLayoutX(34);
                    anchoM4.setLayoutY(18);
                    anchoM4.setFill(Color.TRANSPARENT);
                    anchoM4.setStroke(dibujar.getColor());
                    anchoM4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoM4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoM4.setTranslateY(1);
                    
                    CubicCurve anchoM5 = new CubicCurve(cubicaM3.getStartX(),cubicaM3.getStartY(),cubicaM3.getControlX1(),cubicaM3.getControlY1(),cubicaM3.getControlX2(),cubicaM3.getControlY2(),cubicaM3.getEndX(),cubicaM3.getEndY());
                    anchoM5.setLayoutX(44);
                    anchoM5.setLayoutY(28);
                    anchoM5.setFill(Color.TRANSPARENT);
                    anchoM5.setStroke(dibujar.getColor());
                    anchoM5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoM5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoM5.setTranslateX(1);
                    
                    CubicCurve anchoM6 = new CubicCurve(cubicaM3.getStartX(),cubicaM3.getStartY(),cubicaM3.getControlX1(),cubicaM3.getControlY1(),cubicaM3.getControlX2(),cubicaM3.getControlY2(),cubicaM3.getEndX(),cubicaM3.getEndY());
                    anchoM6.setLayoutX(44);
                    anchoM6.setLayoutY(28);
                    anchoM6.setFill(Color.TRANSPARENT);
                    anchoM6.setStroke(dibujar.getColor());
                    anchoM6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoM6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoM6.setTranslateY(1);
                    
                    CubicCurve anchoM7 = new CubicCurve(cubicaM4.getStartX(),cubicaM4.getStartY(),cubicaM4.getControlX1(),cubicaM4.getControlY1(),cubicaM4.getControlX2(),cubicaM4.getControlY2(),cubicaM4.getEndX(),cubicaM4.getEndY());
                    anchoM7.setLayoutX(54);
                    anchoM7.setLayoutY(15);
                    anchoM7.setFill(Color.TRANSPARENT);
                    anchoM7.setStroke(dibujar.getColor());
                    anchoM7.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoM7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoM7.setTranslateX(1);
                    
                    CubicCurve anchoM8 = new CubicCurve(cubicaM4.getStartX(),cubicaM4.getStartY(),cubicaM4.getControlX1(),cubicaM4.getControlY1(),cubicaM4.getControlX2(),cubicaM4.getControlY2(),cubicaM4.getEndX(),cubicaM4.getEndY());
                    anchoM8.setLayoutX(54);
                    anchoM8.setLayoutY(15);
                    anchoM8.setFill(Color.TRANSPARENT);
                    anchoM8.setStroke(dibujar.getColor());
                    anchoM8.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoM8.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoM8.setTranslateY(1);
                    
                    QuadCurve anchoM9 = new QuadCurve(cuadraticaM.getStartX(),cuadraticaM.getStartY(),cuadraticaM.getControlX(),cuadraticaM.getControlY(),cuadraticaM.getEndX(),cuadraticaM.getEndY());
                    anchoM9.setLayoutX(56);
                    anchoM9.setLayoutY(55.5);
                    anchoM9.setFill(Color.TRANSPARENT);
                    anchoM9.setStroke(dibujar.getColor());
                    anchoM9.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoM9.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoM9.setTranslateX(1);
                    
                    QuadCurve anchoM10 = new QuadCurve(cuadraticaM.getStartX(),cuadraticaM.getStartY(),cuadraticaM.getControlX(),cuadraticaM.getControlY(),cuadraticaM.getEndX(),cuadraticaM.getEndY());
                    anchoM10.setLayoutX(56);
                    anchoM10.setLayoutY(55.5);
                    anchoM10.setFill(Color.TRANSPARENT);
                    anchoM10.setStroke(dibujar.getColor());
                    anchoM10.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoM10.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoM10.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoM1,anchoM2,anchoM3,anchoM4,anchoM5,anchoM6,anchoM7,anchoM8,anchoM9,anchoM10);
                }
                if (palabra.isS()){
                    Line subM = new Line();
                    subM.setStartX(45); //tamaño M es 45
                    subM.setLayoutX(0);
                    subM.setLayoutY(55);
                    subM.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subM);
                }
                
                if (dibujar.getControl()){
                    Circle pM1 = new Circle(cubicaM1.getStartX(),cubicaM1.getStartY(),2,Color.RED);
                    pM1.setLayoutX(33);
                    pM1.setLayoutY(14);
                    Circle pM2 = new Circle(cubicaM1.getControlX1(),cubicaM1.getControlY1(),2,Color.RED);
                    pM2.setLayoutX(33);
                    pM2.setLayoutY(14);
                    Circle pM3 = new Circle(cubicaM1.getControlX2(),cubicaM1.getControlY2(),2,Color.RED);
                    pM3.setLayoutX(33);
                    pM3.setLayoutY(14);
                    Circle pM4 = new Circle(cubicaM1.getEndX(),cubicaM1.getEndY(),2,Color.RED);
                    pM4.setLayoutX(33);
                    pM4.setLayoutY(14);
                    
                    Circle pM5 = new Circle(cubicaM2.getStartX(),cubicaM2.getStartY(),2,Color.RED);
                    pM5.setLayoutX(34);
                    pM5.setLayoutY(18);
                    Circle pM6 = new Circle(cubicaM2.getControlX1(),cubicaM2.getControlY1(),2,Color.RED);
                    pM6.setLayoutX(34);
                    pM6.setLayoutY(18);
                    Circle pM7 = new Circle(cubicaM2.getControlX2(),cubicaM2.getControlY2(),2,Color.RED);
                    pM7.setLayoutX(34);
                    pM7.setLayoutY(18);
                    Circle pM8 = new Circle(cubicaM2.getEndX(),cubicaM2.getEndY(),2,Color.RED);
                    pM8.setLayoutX(34);
                    pM8.setLayoutY(18);
                    
                    Circle pM9 = new Circle(cubicaM3.getStartX(),cubicaM3.getStartY(),2,Color.RED);
                    pM9.setLayoutX(44);
                    pM9.setLayoutY(28);
                    Circle pM10 = new Circle(cubicaM3.getControlX1(),cubicaM3.getControlY1(),2,Color.RED);
                    pM10.setLayoutX(44);
                    pM10.setLayoutY(28);
                    Circle pM11 = new Circle(cubicaM3.getControlX2(),cubicaM3.getControlY2(),2,Color.RED);
                    pM11.setLayoutX(44);
                    pM11.setLayoutY(28);
                    Circle pM12 = new Circle(cubicaM3.getEndX(),cubicaM3.getEndY(),2,Color.RED);
                    pM12.setLayoutX(44);
                    pM12.setLayoutY(28);
                    
                    Circle pM13 = new Circle(cubicaM4.getStartX(),cubicaM4.getStartY(),2,Color.RED);
                    pM13.setLayoutX(54);
                    pM13.setLayoutY(15);
                    Circle pM14 = new Circle(cubicaM4.getControlX1(),cubicaM4.getControlY1(),2,Color.RED);
                    pM14.setLayoutX(54);
                    pM14.setLayoutY(15);
                    Circle pM15 = new Circle(cubicaM4.getControlX2(),cubicaM4.getControlY2(),2,Color.RED);
                    pM15.setLayoutX(54);
                    pM15.setLayoutY(15);
                    Circle pM16 = new Circle(cubicaM4.getEndX(),cubicaM4.getEndY(),2,Color.RED);
                    pM16.setLayoutX(54);
                    pM16.setLayoutY(15);
                    
                    Circle pM17 = new Circle(cuadraticaM.getStartX(),cuadraticaM.getStartY(),2,Color.RED);
                    pM17.setLayoutX(56);
                    pM17.setLayoutY(55.5);
                    Circle pM18 = new Circle(cuadraticaM.getControlX(),cuadraticaM.getControlY(),2,Color.RED);
                    pM18.setLayoutX(56);
                    pM18.setLayoutY(55.5);
                    Circle pM19 = new Circle(cuadraticaM.getEndX(),cuadraticaM.getEndY(),2,Color.RED);
                    pM19.setLayoutX(56);
                    pM19.setLayoutY(55.5);
                    
                    fondo.getChildren().addAll(pM1,pM2,pM3,pM4,pM5,pM6,pM7,pM8,pM9,pM10,pM11,pM12,pM13,pM14,pM15,pM16,pM17,pM18,pM19);
                }
                
                fondo.getChildren().addAll(cubicaM1,cubicaM2,cubicaM3,cubicaM4,cuadraticaM);
                return fondo;
            case 'N':
                CubicCurve cubicaN1 = new CubicCurve(-31.39,37.4,-22.4,41,-16.99,9.59,-22.4,-5.4);
                CubicCurve cubicaN2 = new CubicCurve(-7.59,26.4,-22.4,13.4,-19.19,-9.4,-31.8,-16.53);
                CubicCurve cubicaN3 = new CubicCurve(-28.19,35.4,-34.6,13.79,-30.19,-18,-19.6,-4.2);
                CubicCurve cubicaN4 = new CubicCurve(-8.39,-3.4,-11.19,2.79,2.8,0.4,-5.59,-7.2);
                //Atributos del Fondo
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x      
                //izquierdo
                cubicaN1.setLayoutX(33);
                cubicaN1.setLayoutY(13);
                cubicaN1.setFill(Color.TRANSPARENT);
                cubicaN1.setStroke(dibujar.getColor());
                cubicaN1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaN1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //medio
                cubicaN2.setLayoutX(42);
                cubicaN2.setLayoutY(24);
                cubicaN2.setFill(Color.TRANSPARENT);
                cubicaN2.setStroke(dibujar.getColor());
                cubicaN2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaN2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecho
                cubicaN3.setLayoutX(62);
                cubicaN3.setLayoutY(14);
                cubicaN3.setFill(Color.TRANSPARENT);
                cubicaN3.setStroke(dibujar.getColor());
                cubicaN3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaN3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito
                cubicaN4.setLayoutX(46);
                cubicaN4.setLayoutY(15);
                cubicaN4.setFill(Color.TRANSPARENT);
                cubicaN4.setStroke(dibujar.getColor());
                cubicaN4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaN4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoN1 = new CubicCurve(cubicaN1.getStartX(),cubicaN1.getStartY(),cubicaN1.getControlX1(),cubicaN1.getControlY1(),cubicaN1.getControlX2(),cubicaN1.getControlY2(),cubicaN1.getEndX(),cubicaN1.getEndY());
                    anchoN1.setLayoutX(33);
                    anchoN1.setLayoutY(13);
                    anchoN1.setFill(Color.TRANSPARENT);
                    anchoN1.setStroke(dibujar.getColor());
                    anchoN1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoN1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoN1.setTranslateX(1);
                    
                    CubicCurve anchoN2 = new CubicCurve(cubicaN1.getStartX(),cubicaN1.getStartY(),cubicaN1.getControlX1(),cubicaN1.getControlY1(),cubicaN1.getControlX2(),cubicaN1.getControlY2(),cubicaN1.getEndX(),cubicaN1.getEndY());
                    anchoN2.setLayoutX(33);
                    anchoN2.setLayoutY(13);
                    anchoN2.setFill(Color.TRANSPARENT);
                    anchoN2.setStroke(dibujar.getColor());
                    anchoN2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoN2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoN2.setTranslateY(1);
                    
                    CubicCurve anchoN3 = new CubicCurve(cubicaN2.getStartX(),cubicaN2.getStartY(),cubicaN2.getControlX1(),cubicaN2.getControlY1(),cubicaN2.getControlX2(),cubicaN2.getControlY2(),cubicaN2.getEndX(),cubicaN2.getEndY());
                    anchoN3.setLayoutX(42);
                    anchoN3.setLayoutY(24);
                    anchoN3.setFill(Color.TRANSPARENT);
                    anchoN3.setStroke(dibujar.getColor());
                    anchoN3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoN3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoN3.setTranslateX(1);
                    
                    CubicCurve anchoN4 = new CubicCurve(cubicaN2.getStartX(),cubicaN2.getStartY(),cubicaN2.getControlX1(),cubicaN2.getControlY1(),cubicaN2.getControlX2(),cubicaN2.getControlY2(),cubicaN2.getEndX(),cubicaN2.getEndY());
                    anchoN4.setLayoutX(42);
                    anchoN4.setLayoutY(24);
                    anchoN4.setFill(Color.TRANSPARENT);
                    anchoN4.setStroke(dibujar.getColor());
                    anchoN4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoN4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoN4.setTranslateY(1);
                    
                    CubicCurve anchoN5 = new CubicCurve(cubicaN3.getStartX(),cubicaN3.getStartY(),cubicaN3.getControlX1(),cubicaN3.getControlY1(),cubicaN3.getControlX2(),cubicaN3.getControlY2(),cubicaN3.getEndX(),cubicaN3.getEndY());
                    anchoN5.setLayoutX(62);
                    anchoN5.setLayoutY(14);
                    anchoN5.setFill(Color.TRANSPARENT);
                    anchoN5.setStroke(dibujar.getColor());
                    anchoN5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoN5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoN5.setTranslateX(1);
                    
                    CubicCurve anchoN6 = new CubicCurve(cubicaN3.getStartX(),cubicaN3.getStartY(),cubicaN3.getControlX1(),cubicaN3.getControlY1(),cubicaN3.getControlX2(),cubicaN3.getControlY2(),cubicaN3.getEndX(),cubicaN3.getEndY());
                    anchoN6.setLayoutX(62);
                    anchoN6.setLayoutY(14);
                    anchoN6.setFill(Color.TRANSPARENT);
                    anchoN6.setStroke(dibujar.getColor());
                    anchoN6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoN6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoN6.setTranslateY(1);
                    
                    CubicCurve anchoN7 = new CubicCurve(cubicaN4.getStartX(),cubicaN4.getStartY(),cubicaN4.getControlX1(),cubicaN4.getControlY1(),cubicaN4.getControlX2(),cubicaN4.getControlY2(),cubicaN4.getEndX(),cubicaN4.getEndY());
                    anchoN7.setLayoutX(46);
                    anchoN7.setLayoutY(15);
                    anchoN7.setFill(Color.TRANSPARENT);
                    anchoN7.setStroke(dibujar.getColor());
                    anchoN7.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoN7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoN7.setTranslateX(1);
                    
                    CubicCurve anchoN8 = new CubicCurve(cubicaN4.getStartX(),cubicaN4.getStartY(),cubicaN4.getControlX1(),cubicaN4.getControlY1(),cubicaN4.getControlX2(),cubicaN4.getControlY2(),cubicaN4.getEndX(),cubicaN4.getEndY());
                    anchoN8.setLayoutX(46);
                    anchoN8.setLayoutY(15);
                    anchoN8.setFill(Color.TRANSPARENT);
                    anchoN8.setStroke(dibujar.getColor());
                    anchoN8.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoN8.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoN8.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoN1,anchoN2,anchoN3,anchoN4,anchoN5,anchoN6,anchoN7,anchoN8);
                }
                if (palabra.isS()){
                    Line subN = new Line();
                    subN.setStartX(45); //tamaño N es 45
                    subN.setLayoutX(0);
                    subN.setLayoutY(55);
                    subN.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subN);
                }
                
                if (dibujar.getControl()){
                    Circle pN1 = new Circle(cubicaN1.getStartX(),cubicaN1.getStartY(),2,Color.RED);
                    pN1.setLayoutX(33);
                    pN1.setLayoutY(13);
                    Circle pN2 = new Circle(cubicaN1.getControlX1(),cubicaN1.getControlY1(),2,Color.RED);
                    pN2.setLayoutX(33);
                    pN2.setLayoutY(13);
                    Circle pN3 = new Circle(cubicaN1.getControlX2(),cubicaN1.getControlY2(),2,Color.RED);
                    pN3.setLayoutX(33);
                    pN3.setLayoutY(13);
                    Circle pN4 = new Circle(cubicaN1.getEndX(),cubicaN1.getEndY(),2,Color.RED);
                    pN4.setLayoutX(33);
                    pN4.setLayoutY(13);
                    
                    Circle pN5 = new Circle(cubicaN2.getStartX(),cubicaN2.getStartY(),2,Color.RED);
                    pN5.setLayoutX(42);
                    pN5.setLayoutY(24);
                    Circle pN6 = new Circle(cubicaN2.getControlX1(),cubicaN2.getControlY1(),2,Color.RED);
                    pN6.setLayoutX(42);
                    pN6.setLayoutY(24);
                    Circle pN7 = new Circle(cubicaN2.getControlX2(),cubicaN2.getControlY2(),2,Color.RED);
                    pN7.setLayoutX(42);
                    pN7.setLayoutY(24);
                    Circle pN8 = new Circle(cubicaN2.getEndX(),cubicaN2.getEndY(),2,Color.RED);
                    pN8.setLayoutX(42);
                    pN8.setLayoutY(24);
                    
                    Circle pN9 = new Circle(cubicaN3.getStartX(),cubicaN3.getStartY(),2,Color.RED);
                    pN9.setLayoutX(62);
                    pN9.setLayoutY(14);
                    Circle pN10 = new Circle(cubicaN3.getControlX1(),cubicaN3.getControlY1(),2,Color.RED);
                    pN10.setLayoutX(62);
                    pN10.setLayoutY(14);
                    Circle pN11 = new Circle(cubicaN3.getControlX2(),cubicaN3.getControlY2(),2,Color.RED);
                    pN11.setLayoutX(62);
                    pN11.setLayoutY(14);
                    Circle pN12 = new Circle(cubicaN3.getEndX(),cubicaN3.getEndY(),2,Color.RED);
                    pN12.setLayoutX(62);
                    pN12.setLayoutY(14);
                    
                    Circle pN13 = new Circle(cubicaN4.getStartX(),cubicaN4.getStartY(),2,Color.RED);
                    pN13.setLayoutX(46);
                    pN13.setLayoutY(15);
                    Circle pN14 = new Circle(cubicaN4.getControlX1(),cubicaN4.getControlY1(),2,Color.RED);
                    pN14.setLayoutX(46);
                    pN14.setLayoutY(15);
                    Circle pN15 = new Circle(cubicaN4.getControlX2(),cubicaN4.getControlY2(),2,Color.RED);
                    pN15.setLayoutX(46);
                    pN15.setLayoutY(15);
                    Circle pN16 = new Circle(cubicaN4.getEndX(),cubicaN4.getEndY(),2,Color.RED);
                    pN16.setLayoutX(46);
                    pN16.setLayoutY(15);
                    
                    fondo.getChildren().addAll(pN1,pN2,pN3,pN4,pN5,pN6,pN7,pN8,pN9,pN10,pN11,pN12,pN13,pN14,pN15,pN16);
                }
                
                fondo.getChildren().addAll(cubicaN1,cubicaN2,cubicaN3,cubicaN4);
                return fondo;
            case 'Ñ':
                CubicCurve cubicaÑ1 = new CubicCurve(-31.39,37.4,-22.4,41,-16.99,9.59,-22.4,-5.4);
                CubicCurve cubicaÑ2 = new CubicCurve(-7.59,26.4,-22.4,13.4,-19.19,-9.4,-31.8,-16.53);
                CubicCurve cubicaÑ3 = new CubicCurve(-28.19,35.4,-34.6,13.79,-30.19,-18,-19.6,-4.2);
                CubicCurve cubicaÑ4 = new CubicCurve(-8.39,-3.4,-11.19,2.79,2.8,0.4,-5.59,-7.2);
                CubicCurve cubicaÑ5 = new CubicCurve(-8.39,-14.8,-20.39,-3.8,-25.19,-24,-37.89,-11.53);
                //Atributos del Fondo
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //izquierdo
                cubicaÑ1.setLayoutX(33);
                cubicaÑ1.setLayoutY(13);
                cubicaÑ1.setFill(Color.TRANSPARENT);
                cubicaÑ1.setStroke(dibujar.getColor());
                cubicaÑ1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaÑ1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //medio
                cubicaÑ2.setLayoutX(42);
                cubicaÑ2.setLayoutY(24);
                cubicaÑ2.setFill(Color.TRANSPARENT);
                cubicaÑ2.setStroke(dibujar.getColor());
                cubicaÑ2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaÑ2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecÑho
                cubicaÑ3.setLayoutX(62);
                cubicaÑ3.setLayoutY(14);
                cubicaÑ3.setFill(Color.TRANSPARENT);
                cubicaÑ3.setStroke(dibujar.getColor());
                cubicaÑ3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaÑ3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachiÑto
                cubicaÑ4.setLayoutX(46);
                cubicaÑ4.setLayoutY(15);
                cubicaÑ4.setFill(Color.TRANSPARENT);
                cubicaÑ4.setStroke(dibujar.getColor());
                cubicaÑ4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaÑ4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                // linea superior
                cubicaÑ5.setLayoutX(46);
                cubicaÑ5.setLayoutY(20);
                cubicaÑ5.setFill(Color.TRANSPARENT);
                cubicaÑ5.setStroke(dibujar.getColor());
                cubicaÑ5.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaÑ5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoÑ1 = new CubicCurve(cubicaÑ1.getStartX(),cubicaÑ1.getStartY(),cubicaÑ1.getControlX1(),cubicaÑ1.getControlY1(),cubicaÑ1.getControlX2(),cubicaÑ1.getControlY2(),cubicaÑ1.getEndX(),cubicaÑ1.getEndY());
                    anchoÑ1.setLayoutX(33);
                    anchoÑ1.setLayoutY(13);
                    anchoÑ1.setFill(Color.TRANSPARENT);
                    anchoÑ1.setStroke(dibujar.getColor());
                    anchoÑ1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoÑ1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoÑ1.setTranslateX(1);
                    
                    CubicCurve anchoÑ2 = new CubicCurve(cubicaÑ1.getStartX(),cubicaÑ1.getStartY(),cubicaÑ1.getControlX1(),cubicaÑ1.getControlY1(),cubicaÑ1.getControlX2(),cubicaÑ1.getControlY2(),cubicaÑ1.getEndX(),cubicaÑ1.getEndY());
                    anchoÑ2.setLayoutX(33);
                    anchoÑ2.setLayoutY(13);
                    anchoÑ2.setFill(Color.TRANSPARENT);
                    anchoÑ2.setStroke(dibujar.getColor());
                    anchoÑ2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoÑ2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoÑ2.setTranslateY(1);
                    
                    CubicCurve anchoÑ3 = new CubicCurve(cubicaÑ2.getStartX(),cubicaÑ2.getStartY(),cubicaÑ2.getControlX1(),cubicaÑ2.getControlY1(),cubicaÑ2.getControlX2(),cubicaÑ2.getControlY2(),cubicaÑ2.getEndX(),cubicaÑ2.getEndY());
                    anchoÑ3.setLayoutX(42);
                    anchoÑ3.setLayoutY(24);
                    anchoÑ3.setFill(Color.TRANSPARENT);
                    anchoÑ3.setStroke(dibujar.getColor());
                    anchoÑ3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoÑ3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoÑ3.setTranslateX(1);
                    
                    CubicCurve anchoÑ4 = new CubicCurve(cubicaÑ2.getStartX(),cubicaÑ2.getStartY(),cubicaÑ2.getControlX1(),cubicaÑ2.getControlY1(),cubicaÑ2.getControlX2(),cubicaÑ2.getControlY2(),cubicaÑ2.getEndX(),cubicaÑ2.getEndY());
                    anchoÑ4.setLayoutX(42);
                    anchoÑ4.setLayoutY(24);
                    anchoÑ4.setFill(Color.TRANSPARENT);
                    anchoÑ4.setStroke(dibujar.getColor());
                    anchoÑ4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoÑ4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoÑ4.setTranslateY(1);
                    
                    CubicCurve anchoÑ5 = new CubicCurve(cubicaÑ3.getStartX(),cubicaÑ3.getStartY(),cubicaÑ3.getControlX1(),cubicaÑ3.getControlY1(),cubicaÑ3.getControlX2(),cubicaÑ3.getControlY2(),cubicaÑ3.getEndX(),cubicaÑ3.getEndY());
                    anchoÑ5.setLayoutX(62);
                    anchoÑ5.setLayoutY(14);
                    anchoÑ5.setFill(Color.TRANSPARENT);
                    anchoÑ5.setStroke(dibujar.getColor());
                    anchoÑ5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoÑ5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoÑ5.setTranslateX(1);
                    
                    CubicCurve anchoÑ6 = new CubicCurve(cubicaÑ3.getStartX(),cubicaÑ3.getStartY(),cubicaÑ3.getControlX1(),cubicaÑ3.getControlY1(),cubicaÑ3.getControlX2(),cubicaÑ3.getControlY2(),cubicaÑ3.getEndX(),cubicaÑ3.getEndY());
                    anchoÑ6.setLayoutX(62);
                    anchoÑ6.setLayoutY(14);
                    anchoÑ6.setFill(Color.TRANSPARENT);
                    anchoÑ6.setStroke(dibujar.getColor());
                    anchoÑ6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoÑ6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoÑ6.setTranslateY(1);
                    
                    CubicCurve anchoÑ7 = new CubicCurve(cubicaÑ4.getStartX(),cubicaÑ4.getStartY(),cubicaÑ4.getControlX1(),cubicaÑ4.getControlY1(),cubicaÑ4.getControlX2(),cubicaÑ4.getControlY2(),cubicaÑ4.getEndX(),cubicaÑ4.getEndY());
                    anchoÑ7.setLayoutX(46);
                    anchoÑ7.setLayoutY(15);
                    anchoÑ7.setFill(Color.TRANSPARENT);
                    anchoÑ7.setStroke(dibujar.getColor());
                    anchoÑ7.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoÑ7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoÑ7.setTranslateX(1);
                    
                    CubicCurve anchoÑ8 = new CubicCurve(cubicaÑ4.getStartX(),cubicaÑ4.getStartY(),cubicaÑ4.getControlX1(),cubicaÑ4.getControlY1(),cubicaÑ4.getControlX2(),cubicaÑ4.getControlY2(),cubicaÑ4.getEndX(),cubicaÑ4.getEndY());
                    anchoÑ8.setLayoutX(46);
                    anchoÑ8.setLayoutY(15);
                    anchoÑ8.setFill(Color.TRANSPARENT);
                    anchoÑ8.setStroke(dibujar.getColor());
                    anchoÑ8.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoÑ8.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoÑ8.setTranslateY(1);
                    
                    CubicCurve anchoÑ9 = new CubicCurve(cubicaÑ5.getStartX(),cubicaÑ5.getStartY(),cubicaÑ5.getControlX1(),cubicaÑ5.getControlY1(),cubicaÑ5.getControlX2(),cubicaÑ5.getControlY2(),cubicaÑ5.getEndX(),cubicaÑ5.getEndY());
                    anchoÑ9.setLayoutX(46);
                    anchoÑ9.setLayoutY(20);
                    anchoÑ9.setFill(Color.TRANSPARENT);
                    anchoÑ9.setStroke(dibujar.getColor());
                    anchoÑ9.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoÑ9.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoÑ9.setTranslateX(1);
                    
                    CubicCurve anchoÑ10 = new CubicCurve(cubicaÑ5.getStartX(),cubicaÑ5.getStartY(),cubicaÑ5.getControlX1(),cubicaÑ5.getControlY1(),cubicaÑ5.getControlX2(),cubicaÑ5.getControlY2(),cubicaÑ5.getEndX(),cubicaÑ5.getEndY());
                    anchoÑ10.setLayoutX(46);
                    anchoÑ10.setLayoutY(20);
                    anchoÑ10.setFill(Color.TRANSPARENT);
                    anchoÑ10.setStroke(dibujar.getColor());
                    anchoÑ10.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoÑ10.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoÑ10.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoÑ1,anchoÑ2,anchoÑ3,anchoÑ4,anchoÑ5,anchoÑ6,anchoÑ7,anchoÑ8,anchoÑ9,anchoÑ10);
                }
                if (palabra.isS()){
                    Line subÑ = new Line();
                    subÑ.setStartX(45); //tamaño Ñ es 45
                    subÑ.setLayoutX(0);
                    subÑ.setLayoutY(55);
                    subÑ.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subÑ);
                }
                
                if (dibujar.getControl()){
                    Circle pÑ1 = new Circle(cubicaÑ1.getStartX(),cubicaÑ1.getStartY(),2,Color.RED);
                    pÑ1.setLayoutX(33);
                    pÑ1.setLayoutY(13);
                    Circle pÑ2 = new Circle(cubicaÑ1.getControlX1(),cubicaÑ1.getControlY1(),2,Color.RED);
                    pÑ2.setLayoutX(33);
                    pÑ2.setLayoutY(13);
                    Circle pÑ3 = new Circle(cubicaÑ1.getControlX2(),cubicaÑ1.getControlY2(),2,Color.RED);
                    pÑ3.setLayoutX(33);
                    pÑ3.setLayoutY(13);
                    Circle pÑ4 = new Circle(cubicaÑ1.getEndX(),cubicaÑ1.getEndY(),2,Color.RED);
                    pÑ4.setLayoutX(33);
                    pÑ4.setLayoutY(13);
                    
                    Circle pÑ5 = new Circle(cubicaÑ2.getStartX(),cubicaÑ2.getStartY(),2,Color.RED);
                    pÑ5.setLayoutX(42);
                    pÑ5.setLayoutY(24);
                    Circle pÑ6 = new Circle(cubicaÑ2.getControlX1(),cubicaÑ2.getControlY1(),2,Color.RED);
                    pÑ6.setLayoutX(42);
                    pÑ6.setLayoutY(24);
                    Circle pÑ7 = new Circle(cubicaÑ2.getControlX2(),cubicaÑ2.getControlY2(),2,Color.RED);
                    pÑ7.setLayoutX(42);
                    pÑ7.setLayoutY(24);
                    Circle pÑ8 = new Circle(cubicaÑ2.getEndX(),cubicaÑ2.getEndY(),2,Color.RED);
                    pÑ8.setLayoutX(42);
                    pÑ8.setLayoutY(24);
                    
                    Circle pÑ9 = new Circle(cubicaÑ3.getStartX(),cubicaÑ3.getStartY(),2,Color.RED);
                    pÑ9.setLayoutX(62);
                    pÑ9.setLayoutY(14);
                    Circle pÑ10 = new Circle(cubicaÑ3.getControlX1(),cubicaÑ3.getControlY1(),2,Color.RED);
                    pÑ10.setLayoutX(62);
                    pÑ10.setLayoutY(14);
                    Circle pÑ11 = new Circle(cubicaÑ3.getControlX2(),cubicaÑ3.getControlY2(),2,Color.RED);
                    pÑ11.setLayoutX(62);
                    pÑ11.setLayoutY(14);
                    Circle pÑ12 = new Circle(cubicaÑ3.getEndX(),cubicaÑ3.getEndY(),2,Color.RED);
                    pÑ12.setLayoutX(62);
                    pÑ12.setLayoutY(14);
                    
                    Circle pÑ13 = new Circle(cubicaÑ4.getStartX(),cubicaÑ4.getStartY(),2,Color.RED);
                    pÑ13.setLayoutX(46);
                    pÑ13.setLayoutY(15);
                    Circle pÑ14 = new Circle(cubicaÑ4.getControlX1(),cubicaÑ4.getControlY1(),2,Color.RED);
                    pÑ14.setLayoutX(46);
                    pÑ14.setLayoutY(15);
                    Circle pÑ15 = new Circle(cubicaÑ4.getControlX2(),cubicaÑ4.getControlY2(),2,Color.RED);
                    pÑ15.setLayoutX(46);
                    pÑ15.setLayoutY(15);
                    Circle pÑ16 = new Circle(cubicaÑ4.getEndX(),cubicaÑ4.getEndY(),2,Color.RED);
                    pÑ16.setLayoutX(46);
                    pÑ16.setLayoutY(15);
                    
                    Circle pÑ17 = new Circle(cubicaÑ5.getStartX(),cubicaÑ5.getStartY(),2,Color.RED);
                    pÑ17.setLayoutX(46);
                    pÑ17.setLayoutY(20);
                    Circle pÑ18 = new Circle(cubicaÑ5.getControlX1(),cubicaÑ5.getControlY1(),2,Color.RED);
                    pÑ18.setLayoutX(46);
                    pÑ18.setLayoutY(20);
                    Circle pÑ19 = new Circle(cubicaÑ5.getControlX2(),cubicaÑ5.getControlY2(),2,Color.RED);
                    pÑ19.setLayoutX(46);
                    pÑ19.setLayoutY(20);
                    Circle pÑ20 = new Circle(cubicaÑ5.getEndX(),cubicaÑ5.getEndY(),2,Color.RED);
                    pÑ20.setLayoutX(46);
                    pÑ20.setLayoutY(20);
                    
                    fondo.getChildren().addAll(pÑ1,pÑ2,pÑ3,pÑ4,pÑ5,pÑ6,pÑ7,pÑ8,pÑ9,pÑ10,pÑ11,pÑ12,pÑ13,pÑ14,pÑ15,pÑ16,pÑ17,pÑ18,pÑ19,pÑ20);
                }
                
                fondo.getChildren().addAll(cubicaÑ1,cubicaÑ2,cubicaÑ3,cubicaÑ4,cubicaÑ5);
                return fondo;
            case 'O':
                CubicCurve cubicaO1 = new CubicCurve(-19.6,37.6,-39,39.6,-37,-6,-17.2,-2.59);
                CubicCurve cubicaO2 = new CubicCurve(-33.6,-12.59,-39.8,1.59,-21.8,-9.4,-8.39,6.99);
                CubicCurve cubicaO3 = new CubicCurve(-18.55,37.66,-3.39,35,3.6,-4.2,-19.6,-4.2);
                //Atributos del Fondo
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //IZQUIERDO
                cubicaO1.setLayoutX(39);
                cubicaO1.setLayoutY(13);
                cubicaO1.setFill(Color.TRANSPARENT);
                cubicaO1.setStroke(dibujar.getColor());
                cubicaO1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaO1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //MEDIO
                cubicaO2.setLayoutX(49);
                cubicaO2.setLayoutY(24);
                cubicaO2.setFill(Color.TRANSPARENT);
                cubicaO2.setStroke(dibujar.getColor());
                cubicaO2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaO2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //DERECHO
                cubicaO3.setLayoutX(39);
                cubicaO3.setLayoutY(13);
                cubicaO3.setFill(Color.TRANSPARENT);
                cubicaO3.setStroke(dibujar.getColor());
                cubicaO3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaO3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoO1 = new CubicCurve(cubicaO1.getStartX(),cubicaO1.getStartY(),cubicaO1.getControlX1(),cubicaO1.getControlY1(),cubicaO1.getControlX2(),cubicaO1.getControlY2(),cubicaO1.getEndX(),cubicaO1.getEndY());
                    anchoO1.setLayoutX(39);
                    anchoO1.setLayoutY(13);
                    anchoO1.setFill(Color.TRANSPARENT);
                    anchoO1.setStroke(dibujar.getColor());
                    anchoO1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoO1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoO1.setTranslateX(1);
                    
                    CubicCurve anchoO2 = new CubicCurve(cubicaO1.getStartX(),cubicaO1.getStartY(),cubicaO1.getControlX1(),cubicaO1.getControlY1(),cubicaO1.getControlX2(),cubicaO1.getControlY2(),cubicaO1.getEndX(),cubicaO1.getEndY());
                    anchoO2.setLayoutX(39);
                    anchoO2.setLayoutY(13);
                    anchoO2.setFill(Color.TRANSPARENT);
                    anchoO2.setStroke(dibujar.getColor());
                    anchoO2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoO2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoO2.setTranslateY(1);
                    
                    CubicCurve anchoO3 = new CubicCurve(cubicaO2.getStartX(),cubicaO2.getStartY(),cubicaO2.getControlX1(),cubicaO2.getControlY1(),cubicaO2.getControlX2(),cubicaO2.getControlY2(),cubicaO2.getEndX(),cubicaO2.getEndY());
                    anchoO3.setLayoutX(49);
                    anchoO3.setLayoutY(24);
                    anchoO3.setFill(Color.TRANSPARENT);
                    anchoO3.setStroke(dibujar.getColor());
                    anchoO3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoO3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoO3.setTranslateX(1);
                    
                    CubicCurve anchoO4 = new CubicCurve(cubicaO2.getStartX(),cubicaO2.getStartY(),cubicaO2.getControlX1(),cubicaO2.getControlY1(),cubicaO2.getControlX2(),cubicaO2.getControlY2(),cubicaO2.getEndX(),cubicaO2.getEndY());
                    anchoO4.setLayoutX(49);
                    anchoO4.setLayoutY(24);
                    anchoO4.setFill(Color.TRANSPARENT);
                    anchoO4.setStroke(dibujar.getColor());
                    anchoO4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoO4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoO4.setTranslateY(1);
                    
                    CubicCurve anchoO5 = new CubicCurve(cubicaO3.getStartX(),cubicaO3.getStartY(),cubicaO3.getControlX1(),cubicaO3.getControlY1(),cubicaO3.getControlX2(),cubicaO3.getControlY2(),cubicaO3.getEndX(),cubicaO3.getEndY());
                    anchoO5.setLayoutX(39);
                    anchoO5.setLayoutY(13);
                    anchoO5.setFill(Color.TRANSPARENT);
                    anchoO5.setStroke(dibujar.getColor());
                    anchoO5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoO5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoO5.setTranslateX(1);
                    
                    CubicCurve anchoO6 = new CubicCurve(cubicaO3.getStartX(),cubicaO3.getStartY(),cubicaO3.getControlX1(),cubicaO3.getControlY1(),cubicaO3.getControlX2(),cubicaO3.getControlY2(),cubicaO3.getEndX(),cubicaO3.getEndY());
                    anchoO6.setLayoutX(39);
                    anchoO6.setLayoutY(13);
                    anchoO6.setFill(Color.TRANSPARENT);
                    anchoO6.setStroke(dibujar.getColor());
                    anchoO6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoO6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoO6.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoO1,anchoO2,anchoO3,anchoO4,anchoO5,anchoO6);
                }
                if (palabra.isS()){
                    Line subO = new Line();
                    subO.setStartX(45); //tamaño O es 45
                    subO.setLayoutX(0);
                    subO.setLayoutY(55);
                    subO.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subO);
                }
                
                if (dibujar.getControl()){
                    Circle pO1 = new Circle(cubicaO1.getStartX(),cubicaO1.getStartY(),2,Color.RED);
                    pO1.setLayoutX(39);
                    pO1.setLayoutY(13);
                    Circle pO2 = new Circle(cubicaO1.getControlX1(),cubicaO1.getControlY1(),2,Color.RED);
                    pO2.setLayoutX(39);
                    pO2.setLayoutY(13);
                    Circle pO3 = new Circle(cubicaO1.getControlX2(),cubicaO1.getControlY2(),2,Color.RED);
                    pO3.setLayoutX(39);
                    pO3.setLayoutY(13);
                    Circle pO4 = new Circle(cubicaO1.getEndX(),cubicaO1.getEndY(),2,Color.RED);
                    pO4.setLayoutX(39);
                    pO4.setLayoutY(13);
                    
                    Circle pO5 = new Circle(cubicaO2.getStartX(),cubicaO2.getStartY(),2,Color.RED);
                    pO5.setLayoutX(49);
                    pO5.setLayoutY(24);
                    Circle pO6 = new Circle(cubicaO2.getControlX1(),cubicaO2.getControlY1(),2,Color.RED);
                    pO6.setLayoutX(49);
                    pO6.setLayoutY(24);
                    Circle pO7 = new Circle(cubicaO2.getControlX2(),cubicaO2.getControlY2(),2,Color.RED);
                    pO7.setLayoutX(49);
                    pO7.setLayoutY(24);
                    Circle pO8 = new Circle(cubicaO2.getEndX(),cubicaO2.getEndY(),2,Color.RED);
                    pO8.setLayoutX(49);
                    pO8.setLayoutY(24);
                    
                    Circle pO9 = new Circle(cubicaO3.getStartX(),cubicaO3.getStartY(),2,Color.RED);
                    pO9.setLayoutX(39);
                    pO9.setLayoutY(13);
                    Circle pO10 = new Circle(cubicaO3.getControlX1(),cubicaO3.getControlY1(),2,Color.RED);
                    pO10.setLayoutX(39);
                    pO10.setLayoutY(13);
                    Circle pO11 = new Circle(cubicaO3.getControlX2(),cubicaO3.getControlY2(),2,Color.RED);
                    pO11.setLayoutX(39);
                    pO11.setLayoutY(13);
                    Circle pO12 = new Circle(cubicaO3.getEndX(),cubicaO3.getEndY(),2,Color.RED);
                    pO12.setLayoutX(39);
                    pO12.setLayoutY(13);
                    
                    fondo.getChildren().addAll(pO1,pO2,pO3,pO4,pO5,pO6,pO7,pO8,pO9,pO10,pO11,pO12);
                }
                
                fondo.getChildren().addAll(cubicaO1,cubicaO2,cubicaO3);
                return fondo;
            case 'P':
                CubicCurve cubicaP1 = new CubicCurve(-31.8,34.4,-22.4,41,-16.44,11.48,-13.8,-2.4);
                CubicCurve cubicaP2 = new CubicCurve(-8.6,15,-13.39,27.59,-32.39,9.59,-8.6,4);
                CubicCurve cubicaP3 = new CubicCurve(-21.6,-10.59,21.39,-28.8,8.6,28.2,-12.91,9.7);
                //Atributos del Fondo
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //CENTRAL
                cubicaP1.setLayoutX(35);
                cubicaP1.setLayoutY(15);
                cubicaP1.setFill(Color.TRANSPARENT);
                cubicaP1.setStroke(dibujar.getColor());
                cubicaP1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaP1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito
                cubicaP2.setLayoutX(25);
                cubicaP2.setLayoutY(3);
                cubicaP2.setFill(Color.TRANSPARENT);
                cubicaP2.setStroke(dibujar.getColor());
                cubicaP2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaP2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //CURVAAAA
                cubicaP3.setLayoutX(34);
                cubicaP3.setLayoutY(19);
                cubicaP3.setFill(Color.TRANSPARENT);
                cubicaP3.setStroke(dibujar.getColor());
                cubicaP3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaP3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoP1 = new CubicCurve(cubicaP1.getStartX(),cubicaP1.getStartY(),cubicaP1.getControlX1(),cubicaP1.getControlY1(),cubicaP1.getControlX2(),cubicaP1.getControlY2(),cubicaP1.getEndX(),cubicaP1.getEndY());
                    anchoP1.setLayoutX(35);
                    anchoP1.setLayoutY(15);
                    anchoP1.setFill(Color.TRANSPARENT);
                    anchoP1.setStroke(dibujar.getColor());
                    anchoP1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoP1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoP1.setTranslateX(1);
                    
                    CubicCurve anchoP2 = new CubicCurve(cubicaP1.getStartX(),cubicaP1.getStartY(),cubicaP1.getControlX1(),cubicaP1.getControlY1(),cubicaP1.getControlX2(),cubicaP1.getControlY2(),cubicaP1.getEndX(),cubicaP1.getEndY());
                    anchoP2.setLayoutX(35);
                    anchoP2.setLayoutY(15);
                    anchoP2.setFill(Color.TRANSPARENT);
                    anchoP2.setStroke(dibujar.getColor());
                    anchoP2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoP2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoP2.setTranslateY(1);
                    
                    CubicCurve anchoP3 = new CubicCurve(cubicaP2.getStartX(),cubicaP2.getStartY(),cubicaP2.getControlX1(),cubicaP2.getControlY1(),cubicaP2.getControlX2(),cubicaP2.getControlY2(),cubicaP2.getEndX(),cubicaP2.getEndY());
                    anchoP3.setLayoutX(25);
                    anchoP3.setLayoutY(3);
                    anchoP3.setFill(Color.TRANSPARENT);
                    anchoP3.setStroke(dibujar.getColor());
                    anchoP3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoP3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoP3.setTranslateX(1);
                    
                    CubicCurve anchoP4 = new CubicCurve(cubicaP2.getStartX(),cubicaP2.getStartY(),cubicaP2.getControlX1(),cubicaP2.getControlY1(),cubicaP2.getControlX2(),cubicaP2.getControlY2(),cubicaP2.getEndX(),cubicaP2.getEndY());
                    anchoP4.setLayoutX(25);
                    anchoP4.setLayoutY(3);
                    anchoP4.setFill(Color.TRANSPARENT);
                    anchoP4.setStroke(dibujar.getColor());
                    anchoP4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoP4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoP4.setTranslateY(1);
                    
                    CubicCurve anchoP5 = new CubicCurve(cubicaP3.getStartX(),cubicaP3.getStartY(),cubicaP3.getControlX1(),cubicaP3.getControlY1(),cubicaP3.getControlX2(),cubicaP3.getControlY2(),cubicaP3.getEndX(),cubicaP3.getEndY());
                    anchoP5.setLayoutX(34);
                    anchoP5.setLayoutY(19);
                    anchoP5.setFill(Color.TRANSPARENT);
                    anchoP5.setStroke(dibujar.getColor());
                    anchoP5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoP5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoP5.setTranslateX(1);
                    
                    CubicCurve anchoP6 = new CubicCurve(cubicaP3.getStartX(),cubicaP3.getStartY(),cubicaP3.getControlX1(),cubicaP3.getControlY1(),cubicaP3.getControlX2(),cubicaP3.getControlY2(),cubicaP3.getEndX(),cubicaP3.getEndY());
                    anchoP6.setLayoutX(34);
                    anchoP6.setLayoutY(19);
                    anchoP6.setFill(Color.TRANSPARENT);
                    anchoP6.setStroke(dibujar.getColor());
                    anchoP6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoP6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoP6.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoP1,anchoP2,anchoP3,anchoP4,anchoP5,anchoP6);
                }
                if (palabra.isS()){
                    Line subP = new Line();
                    subP.setStartX(45); //tamaño P es 45
                    subP.setLayoutX(0);
                    subP.setLayoutY(55);
                    subP.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subP);
                }
                
                if (dibujar.getControl()){
                    Circle pP1 = new Circle(cubicaP1.getStartX(),cubicaP1.getStartY(),2,Color.RED);
                    pP1.setLayoutX(35);
                    pP1.setLayoutY(15);
                    Circle pP2 = new Circle(cubicaP1.getControlX1(),cubicaP1.getControlY1(),2,Color.RED);
                    pP2.setLayoutX(35);
                    pP2.setLayoutY(15);
                    Circle pP3 = new Circle(cubicaP1.getControlX2(),cubicaP1.getControlY2(),2,Color.RED);
                    pP3.setLayoutX(35);
                    pP3.setLayoutY(15);
                    Circle pP4 = new Circle(cubicaP1.getEndX(),cubicaP1.getEndY(),2,Color.RED);
                    pP4.setLayoutX(35);
                    pP4.setLayoutY(15);
                    
                    Circle pP5 = new Circle(cubicaP2.getStartX(),cubicaP2.getStartY(),2,Color.RED);
                    pP5.setLayoutX(25);
                    pP5.setLayoutY(3);
                    Circle pP6 = new Circle(cubicaP2.getControlX1(),cubicaP2.getControlY1(),2,Color.RED);
                    pP6.setLayoutX(25);
                    pP6.setLayoutY(3);
                    Circle pP7 = new Circle(cubicaP2.getControlX2(),cubicaP2.getControlY2(),2,Color.RED);
                    pP7.setLayoutX(25);
                    pP7.setLayoutY(3);
                    Circle pP8 = new Circle(cubicaP2.getEndX(),cubicaP2.getEndY(),2,Color.RED);
                    pP8.setLayoutX(25);
                    pP8.setLayoutY(3);
                    
                    Circle pP9 = new Circle(cubicaP3.getStartX(),cubicaP3.getStartY(),2,Color.RED);
                    pP9.setLayoutX(34);
                    pP9.setLayoutY(19);
                    Circle pP10 = new Circle(cubicaP3.getControlX1(),cubicaP3.getControlY1(),2,Color.RED);
                    pP10.setLayoutX(34);
                    pP10.setLayoutY(19);
                    Circle pP11 = new Circle(cubicaP3.getControlX2(),cubicaP3.getControlY2(),2,Color.RED);
                    pP11.setLayoutX(34);
                    pP11.setLayoutY(19);
                    Circle pP12 = new Circle(cubicaP3.getEndX(),cubicaP3.getEndY(),2,Color.RED);
                    pP12.setLayoutX(34);
                    pP12.setLayoutY(19);
                    
                    fondo.getChildren().addAll(pP1,pP2,pP3,pP4,pP5,pP6,pP7,pP8,pP9,pP10,pP11,pP12);
                }
                
                fondo.getChildren().addAll(cubicaP1,cubicaP2,cubicaP3);
                return fondo;
            case 'Q':
                CubicCurve cubicaQ1 = new CubicCurve(-19.6,37.6,-39,39.6,-37,-6,-19.6,-4.2);
                CubicCurve cubicaQ2 = new CubicCurve(-18.55,37.66,-3.39,35,3.39,-8.19,-16.6,0.8);
                CubicCurve cubicaQ3 = new CubicCurve(-31,-25.19,-42.2,-21.59,-42.2,0.6,-28.79,-8.79);
                CubicCurve cubicaQ4 = new CubicCurve(-31.2,0.8,-59.6,-28.79,-27.6,-28.79,-43,-18.59);
                //Atributos del Fondo
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x

                //izquierdo
                cubicaQ1.setLayoutX(39);
                cubicaQ1.setLayoutY(13);
                cubicaQ1.setFill(Color.TRANSPARENT);
                cubicaQ1.setStroke(dibujar.getColor());
                cubicaQ1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaQ1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecho
                cubicaQ2.setLayoutX(39);
                cubicaQ2.setLayoutY(13);
                cubicaQ2.setFill(Color.TRANSPARENT);
                cubicaQ2.setStroke(dibujar.getColor());
                cubicaQ2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaQ2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //centro
                cubicaQ3.setLayoutX(53);
                cubicaQ3.setLayoutY(39);
                cubicaQ3.setFill(Color.TRANSPARENT);
                cubicaQ3.setStroke(dibujar.getColor());
                cubicaQ3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaQ3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito inferior derecho
                cubicaQ4.setLayoutX(65.5);
                cubicaQ4.setLayoutY(50);
                cubicaQ4.setFill(Color.TRANSPARENT);
                cubicaQ4.setStroke(dibujar.getColor());
                cubicaQ4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaQ4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoQ1 = new CubicCurve(cubicaQ1.getStartX(),cubicaQ1.getStartY(),cubicaQ1.getControlX1(),cubicaQ1.getControlY1(),cubicaQ1.getControlX2(),cubicaQ1.getControlY2(),cubicaQ1.getEndX(),cubicaQ1.getEndY());
                    anchoQ1.setLayoutX(39);
                    anchoQ1.setLayoutY(13);
                    anchoQ1.setFill(Color.TRANSPARENT);
                    anchoQ1.setStroke(dibujar.getColor());
                    anchoQ1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoQ1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoQ1.setTranslateX(1);
                    
                    CubicCurve anchoQ2 = new CubicCurve(cubicaQ1.getStartX(),cubicaQ1.getStartY(),cubicaQ1.getControlX1(),cubicaQ1.getControlY1(),cubicaQ1.getControlX2(),cubicaQ1.getControlY2(),cubicaQ1.getEndX(),cubicaQ1.getEndY());
                    anchoQ2.setLayoutX(39);
                    anchoQ2.setLayoutY(13);
                    anchoQ2.setFill(Color.TRANSPARENT);
                    anchoQ2.setStroke(dibujar.getColor());
                    anchoQ2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoQ2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoQ2.setTranslateY(1);
                    
                    CubicCurve anchoQ3 = new CubicCurve(cubicaQ2.getStartX(),cubicaQ2.getStartY(),cubicaQ2.getControlX1(),cubicaQ2.getControlY1(),cubicaQ2.getControlX2(),cubicaQ2.getControlY2(),cubicaQ2.getEndX(),cubicaQ2.getEndY());
                    anchoQ3.setLayoutX(39);
                    anchoQ3.setLayoutY(13);
                    anchoQ3.setFill(Color.TRANSPARENT);
                    anchoQ3.setStroke(dibujar.getColor());
                    anchoQ3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoQ3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoQ3.setTranslateX(1);
                    
                    CubicCurve anchoQ4 = new CubicCurve(cubicaQ2.getStartX(),cubicaQ2.getStartY(),cubicaQ2.getControlX1(),cubicaQ2.getControlY1(),cubicaQ2.getControlX2(),cubicaQ2.getControlY2(),cubicaQ2.getEndX(),cubicaQ2.getEndY());
                    anchoQ4.setLayoutX(39);
                    anchoQ4.setLayoutY(13);
                    anchoQ4.setFill(Color.TRANSPARENT);
                    anchoQ4.setStroke(dibujar.getColor());
                    anchoQ4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoQ4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoQ4.setTranslateY(1);
                    
                    CubicCurve anchoQ5 = new CubicCurve(cubicaQ3.getStartX(),cubicaQ3.getStartY(),cubicaQ3.getControlX1(),cubicaQ3.getControlY1(),cubicaQ3.getControlX2(),cubicaQ3.getControlY2(),cubicaQ3.getEndX(),cubicaQ3.getEndY());
                    anchoQ5.setLayoutX(53);
                    anchoQ5.setLayoutY(39);
                    anchoQ5.setFill(Color.TRANSPARENT);
                    anchoQ5.setStroke(dibujar.getColor());
                    anchoQ5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoQ5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoQ5.setTranslateX(1);
                    
                    CubicCurve anchoQ6 = new CubicCurve(cubicaQ3.getStartX(),cubicaQ3.getStartY(),cubicaQ3.getControlX1(),cubicaQ3.getControlY1(),cubicaQ3.getControlX2(),cubicaQ3.getControlY2(),cubicaQ3.getEndX(),cubicaQ3.getEndY());
                    anchoQ6.setLayoutX(53);
                    anchoQ6.setLayoutY(39);
                    anchoQ6.setFill(Color.TRANSPARENT);
                    anchoQ6.setStroke(dibujar.getColor());
                    anchoQ6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoQ6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoQ6.setTranslateY(1);
                    
                    CubicCurve anchoQ7 = new CubicCurve(cubicaQ4.getStartX(),cubicaQ4.getStartY(),cubicaQ4.getControlX1(),cubicaQ4.getControlY1(),cubicaQ4.getControlX2(),cubicaQ4.getControlY2(),cubicaQ4.getEndX(),cubicaQ4.getEndY());
                    anchoQ7.setLayoutX(65.5);
                    anchoQ7.setLayoutY(50);
                    anchoQ7.setFill(Color.TRANSPARENT);
                    anchoQ7.setStroke(dibujar.getColor());
                    anchoQ7.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoQ7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoQ7.setTranslateX(1);
                    
                    CubicCurve anchoQ8 = new CubicCurve(cubicaQ4.getStartX(),cubicaQ4.getStartY(),cubicaQ4.getControlX1(),cubicaQ4.getControlY1(),cubicaQ4.getControlX2(),cubicaQ4.getControlY2(),cubicaQ4.getEndX(),cubicaQ4.getEndY());
                    anchoQ8.setLayoutX(65.5);
                    anchoQ8.setLayoutY(50);
                    anchoQ8.setFill(Color.TRANSPARENT);
                    anchoQ8.setStroke(dibujar.getColor());
                    anchoQ8.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoQ8.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoQ8.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoQ1,anchoQ2,anchoQ3,anchoQ4,anchoQ5,anchoQ6,anchoQ7,anchoQ8);
                }
                if (palabra.isS()){
                    Line subQ = new Line();
                    subQ.setStartX(45); //tamaño Q es 45
                    subQ.setLayoutX(0);
                    subQ.setLayoutY(55);
                    subQ.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subQ);
                }
                
                if (dibujar.getControl()){
                    Circle pQ1 = new Circle(cubicaQ1.getStartX(),cubicaQ1.getStartY(),2,Color.RED);
                    pQ1.setLayoutX(39);
                    pQ1.setLayoutY(13);
                    Circle pQ2 = new Circle(cubicaQ1.getControlX1(),cubicaQ1.getControlY1(),2,Color.RED);
                    pQ2.setLayoutX(39);
                    pQ2.setLayoutY(13);
                    Circle pQ3 = new Circle(cubicaQ1.getControlX2(),cubicaQ1.getControlY2(),2,Color.RED);
                    pQ3.setLayoutX(39);
                    pQ3.setLayoutY(13);
                    Circle pQ4 = new Circle(cubicaQ1.getEndX(),cubicaQ1.getEndY(),2,Color.RED);
                    pQ4.setLayoutX(39);
                    pQ4.setLayoutY(13);
                    
                    Circle pQ5 = new Circle(cubicaQ2.getStartX(),cubicaQ2.getStartY(),2,Color.RED);
                    pQ5.setLayoutX(39);
                    pQ5.setLayoutY(13);
                    Circle pQ6 = new Circle(cubicaQ2.getControlX1(),cubicaQ2.getControlY1(),2,Color.RED);
                    pQ6.setLayoutX(39);
                    pQ6.setLayoutY(13);
                    Circle pQ7 = new Circle(cubicaQ2.getControlX2(),cubicaQ2.getControlY2(),2,Color.RED);
                    pQ7.setLayoutX(39);
                    pQ7.setLayoutY(13);
                    Circle pQ8 = new Circle(cubicaQ2.getEndX(),cubicaQ2.getEndY(),2,Color.RED);
                    pQ8.setLayoutX(39);
                    pQ8.setLayoutY(13);
                    
                    Circle pQ9 = new Circle(cubicaQ3.getStartX(),cubicaQ3.getStartY(),2,Color.RED);
                    pQ9.setLayoutX(53);
                    pQ9.setLayoutY(39);
                    Circle pQ10 = new Circle(cubicaQ3.getControlX1(),cubicaQ3.getControlY1(),2,Color.RED);
                    pQ10.setLayoutX(53);
                    pQ10.setLayoutY(39);
                    Circle pQ11 = new Circle(cubicaQ3.getControlX2(),cubicaQ3.getControlY2(),2,Color.RED);
                    pQ11.setLayoutX(53);
                    pQ11.setLayoutY(39);
                    Circle pQ12 = new Circle(cubicaQ3.getEndX(),cubicaQ3.getEndY(),2,Color.RED);
                    pQ12.setLayoutX(53);
                    pQ12.setLayoutY(39);
                    
                    Circle pQ13 = new Circle(cubicaQ4.getStartX(),cubicaQ4.getStartY(),2,Color.RED);
                    pQ13.setLayoutX(65.5);
                    pQ13.setLayoutY(50);
                    Circle pQ14 = new Circle(cubicaQ4.getControlX1(),cubicaQ4.getControlY1(),2,Color.RED);
                    pQ14.setLayoutX(65.5);
                    pQ14.setLayoutY(50);
                    Circle pQ15 = new Circle(cubicaQ4.getControlX2(),cubicaQ4.getControlY2(),2,Color.RED);
                    pQ15.setLayoutX(65.5);
                    pQ15.setLayoutY(50);
                    Circle pQ16 = new Circle(cubicaQ4.getEndX(),cubicaQ4.getEndY(),2,Color.RED);
                    pQ16.setLayoutX(65.5);
                    pQ16.setLayoutY(50);
                    
                    fondo.getChildren().addAll(pQ1,pQ2,pQ3,pQ4,pQ5,pQ6,pQ7,pQ8,pQ9,pQ10,pQ11,pQ12,pQ13,pQ14,pQ15,pQ16);
                }
                
                fondo.getChildren().addAll(cubicaQ1,cubicaQ2,cubicaQ3,cubicaQ4);
                return fondo;
            case 'R':
                CubicCurve cubicaR1 = new CubicCurve(-32.6,33.6,-19.19,42.2,-16.39,-10.11,0.6,-12.8);
                CubicCurve cubicaR2 = new CubicCurve(-19.39,-14.11,16.8,-25.2,9.6,14.59,-11.19,7.9);
                CubicCurve cubicaR3 = new CubicCurve(-21,46.6,-35.39,48.08,-14.39,25.99,-38.6,25.99);
                CubicCurve cubicaR4 = new CubicCurve(-8.6,15.4,-15.19,25.4,-26.19,8.79,-8.6,4);
                //Atributos del Fondo
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x 
                //centro
                cubicaR1.setLayoutX(35);
                cubicaR1.setLayoutY(16);
                cubicaR1.setFill(Color.TRANSPARENT);
                cubicaR1.setStroke(dibujar.getColor());
                cubicaR1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaR1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //superior derecha
                cubicaR2.setLayoutX(34);
                cubicaR2.setLayoutY(22);
                cubicaR2.setFill(Color.TRANSPARENT);
                cubicaR2.setStroke(dibujar.getColor());
                cubicaR2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaR2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //inferior derecha
                cubicaR3.setLayoutX(60);
                cubicaR3.setLayoutY(4);
                cubicaR3.setFill(Color.TRANSPARENT);
                cubicaR3.setStroke(dibujar.getColor());
                cubicaR3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaR3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachiRto 
                cubicaR4.setLayoutX(26);
                cubicaR4.setLayoutY(3);
                cubicaR4.setFill(Color.TRANSPARENT);
                cubicaR4.setStroke(dibujar.getColor());
                cubicaR4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaR4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoR1 = new CubicCurve(cubicaR1.getStartX(),cubicaR1.getStartY(),cubicaR1.getControlX1(),cubicaR1.getControlY1(),cubicaR1.getControlX2(),cubicaR1.getControlY2(),cubicaR1.getEndX(),cubicaR1.getEndY());
                    anchoR1.setLayoutX(35);
                    anchoR1.setLayoutY(16);
                    anchoR1.setFill(Color.TRANSPARENT);
                    anchoR1.setStroke(dibujar.getColor());
                    anchoR1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoR1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoR1.setTranslateX(1);
                    
                    CubicCurve anchoR2 = new CubicCurve(cubicaR1.getStartX(),cubicaR1.getStartY(),cubicaR1.getControlX1(),cubicaR1.getControlY1(),cubicaR1.getControlX2(),cubicaR1.getControlY2(),cubicaR1.getEndX(),cubicaR1.getEndY());
                    anchoR2.setLayoutX(35);
                    anchoR2.setLayoutY(16);
                    anchoR2.setFill(Color.TRANSPARENT);
                    anchoR2.setStroke(dibujar.getColor());
                    anchoR2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoR2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoR2.setTranslateY(1);
                    
                    CubicCurve anchoR3 = new CubicCurve(cubicaR2.getStartX(),cubicaR2.getStartY(),cubicaR2.getControlX1(),cubicaR2.getControlY1(),cubicaR2.getControlX2(),cubicaR2.getControlY2(),cubicaR2.getEndX(),cubicaR2.getEndY());
                    anchoR3.setLayoutX(34);
                    anchoR3.setLayoutY(22);
                    anchoR3.setFill(Color.TRANSPARENT);
                    anchoR3.setStroke(dibujar.getColor());
                    anchoR3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoR3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoR3.setTranslateX(1);
                    
                    CubicCurve anchoR4 = new CubicCurve(cubicaR2.getStartX(),cubicaR2.getStartY(),cubicaR2.getControlX1(),cubicaR2.getControlY1(),cubicaR2.getControlX2(),cubicaR2.getControlY2(),cubicaR2.getEndX(),cubicaR2.getEndY());
                    anchoR4.setLayoutX(34);
                    anchoR4.setLayoutY(22);
                    anchoR4.setFill(Color.TRANSPARENT);
                    anchoR4.setStroke(dibujar.getColor());
                    anchoR4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoR4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoR4.setTranslateY(1);
                    
                    CubicCurve anchoR5 = new CubicCurve(cubicaR3.getStartX(),cubicaR3.getStartY(),cubicaR3.getControlX1(),cubicaR3.getControlY1(),cubicaR3.getControlX2(),cubicaR3.getControlY2(),cubicaR3.getEndX(),cubicaR3.getEndY());
                    anchoR5.setLayoutX(60);
                    anchoR5.setLayoutY(4);
                    anchoR5.setFill(Color.TRANSPARENT);
                    anchoR5.setStroke(dibujar.getColor());
                    anchoR5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoR5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoR5.setTranslateX(1);
                    
                    CubicCurve anchoR6 = new CubicCurve(cubicaR3.getStartX(),cubicaR3.getStartY(),cubicaR3.getControlX1(),cubicaR3.getControlY1(),cubicaR3.getControlX2(),cubicaR3.getControlY2(),cubicaR3.getEndX(),cubicaR3.getEndY());
                    anchoR6.setLayoutX(60);
                    anchoR6.setLayoutY(4);
                    anchoR6.setFill(Color.TRANSPARENT);
                    anchoR6.setStroke(dibujar.getColor());
                    anchoR6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoR6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoR6.setTranslateY(1);
                    
                    CubicCurve anchoR7 = new CubicCurve(cubicaR4.getStartX(),cubicaR4.getStartY(),cubicaR4.getControlX1(),cubicaR4.getControlY1(),cubicaR4.getControlX2(),cubicaR4.getControlY2(),cubicaR4.getEndX(),cubicaR4.getEndY());
                    anchoR7.setLayoutX(26);
                    anchoR7.setLayoutY(3);
                    anchoR7.setFill(Color.TRANSPARENT);
                    anchoR7.setStroke(dibujar.getColor());
                    anchoR7.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoR7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoR7.setTranslateX(1);
                    
                    CubicCurve anchoR8 = new CubicCurve(cubicaR4.getStartX(),cubicaR4.getStartY(),cubicaR4.getControlX1(),cubicaR4.getControlY1(),cubicaR4.getControlX2(),cubicaR4.getControlY2(),cubicaR4.getEndX(),cubicaR4.getEndY());
                    anchoR8.setLayoutX(26);
                    anchoR8.setLayoutY(3);
                    anchoR8.setFill(Color.TRANSPARENT);
                    anchoR8.setStroke(dibujar.getColor());
                    anchoR8.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoR8.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoR8.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoR1,anchoR2,anchoR3,anchoR4,anchoR5,anchoR6,anchoR7,anchoR8);
                }
                if (palabra.isS()){
                    Line subR = new Line();
                    subR.setStartX(45); //tamaño R es 45
                    subR.setLayoutX(0);
                    subR.setLayoutY(55);
                    subR.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subR);
                }
                
                if (dibujar.getControl()){
                    Circle pR1 = new Circle(cubicaR1.getStartX(),cubicaR1.getStartY(),2,Color.RED);
                    pR1.setLayoutX(35);
                    pR1.setLayoutY(16);
                    Circle pR2 = new Circle(cubicaR1.getControlX1(),cubicaR1.getControlY1(),2,Color.RED);
                    pR2.setLayoutX(35);
                    pR2.setLayoutY(16);
                    Circle pR3 = new Circle(cubicaR1.getControlX2(),cubicaR1.getControlY2(),2,Color.RED);
                    pR3.setLayoutX(35);
                    pR3.setLayoutY(16);
                    Circle pR4 = new Circle(cubicaR1.getEndX(),cubicaR1.getEndY(),2,Color.RED);
                    pR4.setLayoutX(35);
                    pR4.setLayoutY(16);
                    
                    Circle pR5 = new Circle(cubicaR2.getStartX(),cubicaR2.getStartY(),2,Color.RED);
                    pR5.setLayoutX(34);
                    pR5.setLayoutY(22);
                    Circle pR6 = new Circle(cubicaR2.getControlX1(),cubicaR2.getControlY1(),2,Color.RED);
                    pR6.setLayoutX(34);
                    pR6.setLayoutY(22);
                    Circle pR7 = new Circle(cubicaR2.getControlX2(),cubicaR2.getControlY2(),2,Color.RED);
                    pR7.setLayoutX(34);
                    pR7.setLayoutY(22);
                    Circle pR8 = new Circle(cubicaR2.getEndX(),cubicaR2.getEndY(),2,Color.RED);
                    pR8.setLayoutX(34);
                    pR8.setLayoutY(22);
                    
                    Circle pR9 = new Circle(cubicaR3.getStartX(),cubicaR3.getStartY(),2,Color.RED);
                    pR9.setLayoutX(60);
                    pR9.setLayoutY(4);
                    Circle pR10 = new Circle(cubicaR3.getControlX1(),cubicaR3.getControlY1(),2,Color.RED);
                    pR10.setLayoutX(60);
                    pR10.setLayoutY(4);
                    Circle pR11 = new Circle(cubicaR3.getControlX2(),cubicaR3.getControlY2(),2,Color.RED);
                    pR11.setLayoutX(60);
                    pR11.setLayoutY(4);
                    Circle pR12 = new Circle(cubicaR3.getEndX(),cubicaR3.getEndY(),2,Color.RED);
                    pR12.setLayoutX(60);
                    pR12.setLayoutY(4);
                    
                    Circle pR13 = new Circle(cubicaR4.getStartX(),cubicaR4.getStartY(),2,Color.RED);
                    pR13.setLayoutX(26);
                    pR13.setLayoutY(3);
                    Circle pR14 = new Circle(cubicaR4.getControlX1(),cubicaR4.getControlY1(),2,Color.RED);
                    pR14.setLayoutX(26);
                    pR14.setLayoutY(3);
                    Circle pR15 = new Circle(cubicaR4.getControlX2(),cubicaR4.getControlY2(),2,Color.RED);
                    pR15.setLayoutX(26);
                    pR15.setLayoutY(3);
                    Circle pR16 = new Circle(cubicaR4.getEndX(),cubicaR4.getEndY(),2,Color.RED);
                    pR16.setLayoutX(26);
                    pR16.setLayoutY(3);
                    
                    fondo.getChildren().addAll(pR1,pR2,pR3,pR4,pR5,pR6,pR7,pR8,pR9,pR10,pR11,pR12,pR13,pR14,pR15,pR16);
                }
                
                fondo.getChildren().addAll(cubicaR1,cubicaR2,cubicaR3,cubicaR4);
                return fondo;
            case 'S':
                CubicCurve cubicaS1 = new CubicCurve(-47.6,44.2,-35.39,48.08,-11.79,30.79,-42.2,13.8);
                CubicCurve cubicaS2 = new CubicCurve(11.59,-13.4,0,-13.4,0,-23.59,7.2,-23.59);
                CubicCurve cubicaS3 = new CubicCurve(-1.6,2.79,-23.79,-9.8,1.79,-16,4.7,-5.4);
                //Atributos del Fondo
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //guatita media
                cubicaS1.setLayoutX(65);
                cubicaS1.setLayoutY(7);
                cubicaS1.setFill(Color.TRANSPARENT);
                cubicaS1.setStroke(dibujar.getColor());
                cubicaS1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaS1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito inferior
                cubicaS2.setLayoutX(9);
                cubicaS2.setLayoutY(65);
                cubicaS2.setFill(Color.TRANSPARENT);
                cubicaS2.setStroke(dibujar.getColor());
                cubicaS2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaS2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //superSior cachito
                cubicaS3.setLayoutX(26);
                cubicaS3.setLayoutY(19);
                cubicaS3.setFill(Color.TRANSPARENT);
                cubicaS3.setStroke(dibujar.getColor());
                cubicaS3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaS3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoS1 = new CubicCurve(cubicaS1.getStartX(),cubicaS1.getStartY(),cubicaS1.getControlX1(),cubicaS1.getControlY1(),cubicaS1.getControlX2(),cubicaS1.getControlY2(),cubicaS1.getEndX(),cubicaS1.getEndY());
                    anchoS1.setLayoutX(65);
                    anchoS1.setLayoutY(7);
                    anchoS1.setFill(Color.TRANSPARENT);
                    anchoS1.setStroke(dibujar.getColor());
                    anchoS1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoS1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoS1.setTranslateX(1);
                    
                    CubicCurve anchoS2 = new CubicCurve(cubicaS1.getStartX(),cubicaS1.getStartY(),cubicaS1.getControlX1(),cubicaS1.getControlY1(),cubicaS1.getControlX2(),cubicaS1.getControlY2(),cubicaS1.getEndX(),cubicaS1.getEndY());
                    anchoS2.setLayoutX(65);
                    anchoS2.setLayoutY(7);
                    anchoS2.setFill(Color.TRANSPARENT);
                    anchoS2.setStroke(dibujar.getColor());
                    anchoS2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoS2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoS2.setTranslateY(1);
                    
                    CubicCurve anchoS3 = new CubicCurve(cubicaS2.getStartX(),cubicaS2.getStartY(),cubicaS2.getControlX1(),cubicaS2.getControlY1(),cubicaS2.getControlX2(),cubicaS2.getControlY2(),cubicaS2.getEndX(),cubicaS2.getEndY());
                    anchoS3.setLayoutX(9);
                    anchoS3.setLayoutY(65);
                    anchoS3.setFill(Color.TRANSPARENT);
                    anchoS3.setStroke(dibujar.getColor());
                    anchoS3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoS3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoS3.setTranslateX(1);
                    
                    CubicCurve anchoS4 = new CubicCurve(cubicaS2.getStartX(),cubicaS2.getStartY(),cubicaS2.getControlX1(),cubicaS2.getControlY1(),cubicaS2.getControlX2(),cubicaS2.getControlY2(),cubicaS2.getEndX(),cubicaS2.getEndY());
                    anchoS4.setLayoutX(9);
                    anchoS4.setLayoutY(65);
                    anchoS4.setFill(Color.TRANSPARENT);
                    anchoS4.setStroke(dibujar.getColor());
                    anchoS4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoS4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoS4.setTranslateY(1);
                    
                    CubicCurve anchoS5 = new CubicCurve(cubicaS3.getStartX(),cubicaS3.getStartY(),cubicaS3.getControlX1(),cubicaS3.getControlY1(),cubicaS3.getControlX2(),cubicaS3.getControlY2(),cubicaS3.getEndX(),cubicaS3.getEndY());
                    anchoS5.setLayoutX(26);
                    anchoS5.setLayoutY(19);
                    anchoS5.setFill(Color.TRANSPARENT);
                    anchoS5.setStroke(dibujar.getColor());
                    anchoS5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoS5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoS5.setTranslateX(1);
                    
                    CubicCurve anchoS6 = new CubicCurve(cubicaS3.getStartX(),cubicaS3.getStartY(),cubicaS3.getControlX1(),cubicaS3.getControlY1(),cubicaS3.getControlX2(),cubicaS3.getControlY2(),cubicaS3.getEndX(),cubicaS3.getEndY());
                    anchoS6.setLayoutX(26);
                    anchoS6.setLayoutY(19);
                    anchoS6.setFill(Color.TRANSPARENT);
                    anchoS6.setStroke(dibujar.getColor());
                    anchoS6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoS6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoS6.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoS1,anchoS2,anchoS3,anchoS4,anchoS5,anchoS6);
                }
                if (palabra.isS()){
                    Line subS = new Line();
                    subS.setStartX(45); //tamaño S es 45
                    subS.setLayoutX(0);
                    subS.setLayoutY(55);
                    subS.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subS);
                }
                
                if (dibujar.getControl()){
                    Circle pS1 = new Circle(cubicaS1.getStartX(),cubicaS1.getStartY(),2,Color.RED);
                    pS1.setLayoutX(65);
                    pS1.setLayoutY(7);
                    Circle pS2 = new Circle(cubicaS1.getControlX1(),cubicaS1.getControlY1(),2,Color.RED);
                    pS2.setLayoutX(65);
                    pS2.setLayoutY(7);
                    Circle pS3 = new Circle(cubicaS1.getControlX2(),cubicaS1.getControlY2(),2,Color.RED);
                    pS3.setLayoutX(65);
                    pS3.setLayoutY(7);
                    Circle pS4 = new Circle(cubicaS1.getEndX(),cubicaS1.getEndY(),2,Color.RED);
                    pS4.setLayoutX(65);
                    pS4.setLayoutY(7);
                    
                    Circle pS5 = new Circle(cubicaS2.getStartX(),cubicaS2.getStartY(),2,Color.RED);
                    pS5.setLayoutX(9);
                    pS5.setLayoutY(65);
                    Circle pS6 = new Circle(cubicaS2.getControlX1(),cubicaS2.getControlY1(),2,Color.RED);
                    pS6.setLayoutX(9);
                    pS6.setLayoutY(65);
                    Circle pS7 = new Circle(cubicaS2.getControlX2(),cubicaS2.getControlY2(),2,Color.RED);
                    pS7.setLayoutX(9);
                    pS7.setLayoutY(65);
                    Circle pS8 = new Circle(cubicaS2.getEndX(),cubicaS2.getEndY(),2,Color.RED);
                    pS8.setLayoutX(9);
                    pS8.setLayoutY(65);
                    
                    Circle pS9 = new Circle(cubicaS3.getStartX(),cubicaS3.getStartY(),2,Color.RED);
                    pS9.setLayoutX(26);
                    pS9.setLayoutY(19);
                    Circle pS10 = new Circle(cubicaS3.getControlX1(),cubicaS3.getControlY1(),2,Color.RED);
                    pS10.setLayoutX(26);
                    pS10.setLayoutY(19);
                    Circle pS11 = new Circle(cubicaS3.getControlX2(),cubicaS3.getControlY2(),2,Color.RED);
                    pS11.setLayoutX(26);
                    pS11.setLayoutY(19);
                    Circle pS12 = new Circle(cubicaS3.getEndX(),cubicaS3.getEndY(),2,Color.RED);
                    pS12.setLayoutX(26);
                    pS12.setLayoutY(19);
                    
                    fondo.getChildren().addAll(pS1,pS2,pS3,pS4,pS5,pS6,pS7,pS8,pS9,pS10,pS11,pS12);
                }
                
                fondo.getChildren().addAll(cubicaS1,cubicaS2,cubicaS3);
                return fondo;
            case 'T':
                CubicCurve cubicaT1 = new CubicCurve(-24.4,26.79,-3,36.39,-37.2,-20.59,0.27,-12.79);
                CubicCurve cubicaT2 = new CubicCurve(-21.59,7.79,-31.59,-9.2,1.79,1.79,12.2,0);
                CubicCurve cubicaT3 = new CubicCurve(-15.2,-5.79,-12,6.59,-22,2.99,-25.2,-1.01);
                //Atributos del Fondo
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x       
                //central
                cubicaT1.setLayoutX(41);
                cubicaT1.setLayoutY(21);
                cubicaT1.setFill(Color.TRANSPARENT);
                cubicaT1.setStroke(dibujar.getColor());
                cubicaT1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaT1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //superior central
                cubicaT2.setLayoutX(28);
                cubicaT2.setLayoutY(8);
                cubicaT2.setFill(Color.TRANSPARENT);
                cubicaT2.setStroke(dibujar.getColor());
                cubicaT2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaT2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachiTto superior
                cubicaT3.setLayoutX(32);
                cubicaT3.setLayoutY(17);
                cubicaT3.setFill(Color.TRANSPARENT);
                cubicaT3.setStroke(dibujar.getColor());
                cubicaT3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaT3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoT1 = new CubicCurve(cubicaT1.getStartX(),cubicaT1.getStartY(),cubicaT1.getControlX1(),cubicaT1.getControlY1(),cubicaT1.getControlX2(),cubicaT1.getControlY2(),cubicaT1.getEndX(),cubicaT1.getEndY());
                    anchoT1.setLayoutX(41);
                    anchoT1.setLayoutY(21);
                    anchoT1.setFill(Color.TRANSPARENT);
                    anchoT1.setStroke(dibujar.getColor());
                    anchoT1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoT1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoT1.setTranslateX(1);
                    
                    CubicCurve anchoT2 = new CubicCurve(cubicaT1.getStartX(),cubicaT1.getStartY(),cubicaT1.getControlX1(),cubicaT1.getControlY1(),cubicaT1.getControlX2(),cubicaT1.getControlY2(),cubicaT1.getEndX(),cubicaT1.getEndY());
                    anchoT2.setLayoutX(41);
                    anchoT2.setLayoutY(21);
                    anchoT2.setFill(Color.TRANSPARENT);
                    anchoT2.setStroke(dibujar.getColor());
                    anchoT2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoT2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoT2.setTranslateY(1);
                    
                    CubicCurve anchoT3 = new CubicCurve(cubicaT2.getStartX(),cubicaT2.getStartY(),cubicaT2.getControlX1(),cubicaT2.getControlY1(),cubicaT2.getControlX2(),cubicaT2.getControlY2(),cubicaT2.getEndX(),cubicaT2.getEndY());
                    anchoT3.setLayoutX(28);
                    anchoT3.setLayoutY(8);
                    anchoT3.setFill(Color.TRANSPARENT);
                    anchoT3.setStroke(dibujar.getColor());
                    anchoT3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoT3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoT3.setTranslateX(1);
                    
                    CubicCurve anchoT4 = new CubicCurve(cubicaT2.getStartX(),cubicaT2.getStartY(),cubicaT2.getControlX1(),cubicaT2.getControlY1(),cubicaT2.getControlX2(),cubicaT2.getControlY2(),cubicaT2.getEndX(),cubicaT2.getEndY());
                    anchoT4.setLayoutX(28);
                    anchoT4.setLayoutY(8);
                    anchoT4.setFill(Color.TRANSPARENT);
                    anchoT4.setStroke(dibujar.getColor());
                    anchoT4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoT4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoT4.setTranslateY(1);
                    
                    CubicCurve anchoT5 = new CubicCurve(cubicaT3.getStartX(),cubicaT3.getStartY(),cubicaT3.getControlX1(),cubicaT3.getControlY1(),cubicaT3.getControlX2(),cubicaT3.getControlY2(),cubicaT3.getEndX(),cubicaT3.getEndY());
                    anchoT5.setLayoutX(32);
                    anchoT5.setLayoutY(17);
                    anchoT5.setFill(Color.TRANSPARENT);
                    anchoT5.setStroke(dibujar.getColor());
                    anchoT5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoT5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoT5.setTranslateX(1);
                    
                    CubicCurve anchoT6 = new CubicCurve(cubicaT3.getStartX(),cubicaT3.getStartY(),cubicaT3.getControlX1(),cubicaT3.getControlY1(),cubicaT3.getControlX2(),cubicaT3.getControlY2(),cubicaT3.getEndX(),cubicaT3.getEndY());
                    anchoT6.setLayoutX(32);
                    anchoT6.setLayoutY(17);
                    anchoT6.setFill(Color.TRANSPARENT);
                    anchoT6.setStroke(dibujar.getColor());
                    anchoT6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoT6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoT6.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoT1,anchoT2,anchoT3,anchoT4,anchoT5,anchoT6);
                }
                if (palabra.isS()){
                    Line subT = new Line();
                    subT.setStartX(45); //tamaño T es 45
                    subT.setLayoutX(0);
                    subT.setLayoutY(55);
                    subT.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subT);
                }
                
                if (dibujar.getControl()){
                    Circle pT1 = new Circle(cubicaT1.getStartX(),cubicaT1.getStartY(),2,Color.RED);
                    pT1.setLayoutX(41);
                    pT1.setLayoutY(21);
                    Circle pT2 = new Circle(cubicaT1.getControlX1(),cubicaT1.getControlY1(),2,Color.RED);
                    pT2.setLayoutX(41);
                    pT2.setLayoutY(21);
                    Circle pT3 = new Circle(cubicaT1.getControlX2(),cubicaT1.getControlY2(),2,Color.RED);
                    pT3.setLayoutX(41);
                    pT3.setLayoutY(21);
                    Circle pT4 = new Circle(cubicaT1.getEndX(),cubicaT1.getEndY(),2,Color.RED);
                    pT4.setLayoutX(41);
                    pT4.setLayoutY(21);
                    
                    Circle pT5 = new Circle(cubicaT2.getStartX(),cubicaT2.getStartY(),2,Color.RED);
                    pT5.setLayoutX(28);
                    pT5.setLayoutY(8);
                    Circle pT6 = new Circle(cubicaT2.getControlX1(),cubicaT2.getControlY1(),2,Color.RED);
                    pT6.setLayoutX(28);
                    pT6.setLayoutY(8);
                    Circle pT7 = new Circle(cubicaT2.getControlX2(),cubicaT2.getControlY2(),2,Color.RED);
                    pT7.setLayoutX(28);
                    pT7.setLayoutY(8);
                    Circle pT8 = new Circle(cubicaT2.getEndX(),cubicaT2.getEndY(),2,Color.RED);
                    pT8.setLayoutX(28);
                    pT8.setLayoutY(8);
                    
                    Circle pT9 = new Circle(cubicaT3.getStartX(),cubicaT3.getStartY(),2,Color.RED);
                    pT9.setLayoutX(32);
                    pT9.setLayoutY(17);
                    Circle pT10 = new Circle(cubicaT3.getControlX1(),cubicaT3.getControlY1(),2,Color.RED);
                    pT10.setLayoutX(32);
                    pT10.setLayoutY(17);
                    Circle pT11 = new Circle(cubicaT3.getControlX2(),cubicaT3.getControlY2(),2,Color.RED);
                    pT11.setLayoutX(32);
                    pT11.setLayoutY(17);
                    Circle pT12 = new Circle(cubicaT3.getEndX(),cubicaT3.getEndY(),2,Color.RED);
                    pT12.setLayoutX(32);
                    pT12.setLayoutY(17);
                    
                    fondo.getChildren().addAll(pT1,pT2,pT3,pT4,pT5,pT6,pT7,pT8,pT9,pT10,pT11,pT12);
                }
                
                fondo.getChildren().addAll(cubicaT1,cubicaT2,cubicaT3);
                return fondo;
            case 'U':
                QuadCurve cuadraticaU = new QuadCurve(-1,-15.6,-12.2,-13.74,-10,-31.8);
                CubicCurve cubicaU1 = new CubicCurve(-10.2,-5.8,-7.2,48.79,-42.6,44,-33,1.8);
                CubicCurve cubicaU2 = new CubicCurve(-11.89,22.5,-27.5,19.69,-5.29,-4.3,-5.29,16.1);
                //Atributos del Fondo
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //BASE
                cubicaU1.setLayoutX(46);
                cubicaU1.setLayoutY(16);
                cubicaU1.setFill(Color.TRANSPARENT);
                cubicaU1.setStroke(dibujar.getColor());
                cubicaU1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaU1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //
                cubicaU2.setLayoutX(18.5);
                cubicaU2.setLayoutY(1.5);
                cubicaU2.setFill(Color.TRANSPARENT);
                cubicaU2.setStroke(dibujar.getColor());
                cubicaU2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaU2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //COLITUA DE UNION
                cuadraticaU.setLayoutX(44);
                cuadraticaU.setLayoutY(65);
                cuadraticaU.setFill(Color.TRANSPARENT);
                cuadraticaU.setStroke(dibujar.getColor());
                cuadraticaU.setStrokeLineCap(StrokeLineCap.ROUND);
                cuadraticaU.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoU1 = new CubicCurve(cubicaU1.getStartX(),cubicaU1.getStartY(),cubicaU1.getControlX1(),cubicaU1.getControlY1(),cubicaU1.getControlX2(),cubicaU1.getControlY2(),cubicaU1.getEndX(),cubicaU1.getEndY());
                    anchoU1.setLayoutX(46);
                    anchoU1.setLayoutY(16);
                    anchoU1.setFill(Color.TRANSPARENT);
                    anchoU1.setStroke(dibujar.getColor());
                    anchoU1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoU1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoU1.setTranslateX(1);
                    
                    CubicCurve anchoU2 = new CubicCurve(cubicaU1.getStartX(),cubicaU1.getStartY(),cubicaU1.getControlX1(),cubicaU1.getControlY1(),cubicaU1.getControlX2(),cubicaU1.getControlY2(),cubicaU1.getEndX(),cubicaU1.getEndY());
                    anchoU2.setLayoutX(46);
                    anchoU2.setLayoutY(16);
                    anchoU2.setFill(Color.TRANSPARENT);
                    anchoU2.setStroke(dibujar.getColor());
                    anchoU2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoU2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoU2.setTranslateY(1);
                    
                    CubicCurve anchoU3 = new CubicCurve(cubicaU2.getStartX(),cubicaU2.getStartY(),cubicaU2.getControlX1(),cubicaU2.getControlY1(),cubicaU2.getControlX2(),cubicaU2.getControlY2(),cubicaU2.getEndX(),cubicaU2.getEndY());
                    anchoU3.setLayoutX(18.5);
                    anchoU3.setLayoutY(1.5);
                    anchoU3.setFill(Color.TRANSPARENT);
                    anchoU3.setStroke(dibujar.getColor());
                    anchoU3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoU3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoU3.setTranslateX(1);
                    
                    CubicCurve anchoU4 = new CubicCurve(cubicaU2.getStartX(),cubicaU2.getStartY(),cubicaU2.getControlX1(),cubicaU2.getControlY1(),cubicaU2.getControlX2(),cubicaU2.getControlY2(),cubicaU2.getEndX(),cubicaU2.getEndY());
                    anchoU4.setLayoutX(18.5);
                    anchoU4.setLayoutY(1.5);
                    anchoU4.setFill(Color.TRANSPARENT);
                    anchoU4.setStroke(dibujar.getColor());
                    anchoU4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoU4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoU4.setTranslateY(1);
                    
                    QuadCurve anchoU5 = new QuadCurve(cuadraticaU.getStartX(),cuadraticaU.getStartY(),cuadraticaU.getControlX(),cuadraticaU.getControlY(),cuadraticaU.getEndX(),cuadraticaU.getEndY());
                    anchoU5.setLayoutX(44);
                    anchoU5.setLayoutY(65);
                    anchoU5.setFill(Color.TRANSPARENT);
                    anchoU5.setStroke(dibujar.getColor());
                    anchoU5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoU5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoU5.setTranslateX(1);
                    
                    QuadCurve anchoU6 = new QuadCurve(cuadraticaU.getStartX(),cuadraticaU.getStartY(),cuadraticaU.getControlX(),cuadraticaU.getControlY(),cuadraticaU.getEndX(),cuadraticaU.getEndY());
                    anchoU6.setLayoutX(44);
                    anchoU6.setLayoutY(65);
                    anchoU6.setFill(Color.TRANSPARENT);
                    anchoU6.setStroke(dibujar.getColor());
                    anchoU6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoU6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoU6.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoU1,anchoU2,anchoU3,anchoU4,anchoU5,anchoU6);
                }
                if (palabra.isS()){
                    Line subU = new Line();
                    subU.setStartX(45); //tamaño U es 45
                    subU.setLayoutX(0);
                    subU.setLayoutY(55);
                    subU.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subU);
                }
                
                if (dibujar.getControl()){
                    Circle pU1 = new Circle(cubicaU1.getStartX(),cubicaU1.getStartY(),2,Color.RED);
                    pU1.setLayoutX(46);
                    pU1.setLayoutY(16);
                    Circle pU2 = new Circle(cubicaU1.getControlX1(),cubicaU1.getControlY1(),2,Color.RED);
                    pU2.setLayoutX(46);
                    pU2.setLayoutY(16);
                    Circle pU3 = new Circle(cubicaU1.getControlX2(),cubicaU1.getControlY2(),2,Color.RED);
                    pU3.setLayoutX(46);
                    pU3.setLayoutY(16);
                    Circle pU4 = new Circle(cubicaU1.getEndX(),cubicaU1.getEndY(),2,Color.RED);
                    pU4.setLayoutX(46);
                    pU4.setLayoutY(16);
                    
                    Circle pU5 = new Circle(cubicaU2.getStartX(),cubicaU2.getStartY(),2,Color.RED);
                    pU5.setLayoutX(18.5);
                    pU5.setLayoutY(1.5);
                    Circle pU6 = new Circle(cubicaU2.getControlX1(),cubicaU2.getControlY1(),2,Color.RED);
                    pU6.setLayoutX(18.5);
                    pU6.setLayoutY(1.5);
                    Circle pU7 = new Circle(cubicaU2.getControlX2(),cubicaU2.getControlY2(),2,Color.RED);
                    pU7.setLayoutX(18.5);
                    pU7.setLayoutY(1.5);
                    Circle pU8 = new Circle(cubicaU2.getEndX(),cubicaU2.getEndY(),2,Color.RED);
                    pU8.setLayoutX(18.5);
                    pU8.setLayoutY(1.5);
                    
                    Circle pU9 = new Circle(cuadraticaU.getStartX(),cuadraticaU.getStartY(),2,Color.RED);
                    pU9.setLayoutX(44);
                    pU9.setLayoutY(65);
                    Circle pU10 = new Circle(cuadraticaU.getControlX(),cuadraticaU.getControlY(),2,Color.RED);
                    pU10.setLayoutX(44);
                    pU10.setLayoutY(65);
                    Circle pU11 = new Circle(cuadraticaU.getEndX(),cuadraticaU.getEndY(),2,Color.RED);
                    pU11.setLayoutX(44);
                    pU11.setLayoutY(65);
                    
                    fondo.getChildren().addAll(pU1,pU2,pU3,pU4,pU5,pU6,pU7,pU8,pU9,pU10,pU11);
                }
                
                fondo.getChildren().addAll(cubicaU1,cubicaU2,cuadraticaU);
                return fondo;
            case 'V':
                CubicCurve cubicaV1 = new CubicCurve(-7.59,26.4,-25.44,3.99,-15,-14.19,-19.59,-14.19);
                CubicCurve cubicaV2 = new CubicCurve(-31.39,37.4,-28,29.39,-17,8.39,-22.59,-3.19);
                CubicCurve cubicaV3 = new CubicCurve(-6.06,5.19,-11.39,15.2,-22.19,3.6,-4.59,-9.19);       
                //Atributos del Fondo
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //izquiera linea
                cubicaV1.setLayoutX(34);
                cubicaV1.setLayoutY(24);
                cubicaV1.setFill(Color.TRANSPARENT);
                cubicaV1.setStroke(dibujar.getColor());
                cubicaV1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaV1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecha linea
                cubicaV2.setLayoutX(58);
                cubicaV2.setLayoutY(13);
                cubicaV2.setFill(Color.TRANSPARENT);
                cubicaV2.setStroke(dibujar.getColor());
                cubicaV2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaV2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito
                cubicaV3.setLayoutX(18);
                cubicaV3.setLayoutY(19);
                cubicaV3.setFill(Color.TRANSPARENT);
                cubicaV3.setStroke(dibujar.getColor());
                cubicaV3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaV3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoV1 = new CubicCurve(cubicaV1.getStartX(),cubicaV1.getStartY(),cubicaV1.getControlX1(),cubicaV1.getControlY1(),cubicaV1.getControlX2(),cubicaV1.getControlY2(),cubicaV1.getEndX(),cubicaV1.getEndY());
                    anchoV1.setLayoutX(34);
                    anchoV1.setLayoutY(24);
                    anchoV1.setFill(Color.TRANSPARENT);
                    anchoV1.setStroke(dibujar.getColor());
                    anchoV1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoV1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoV1.setTranslateX(1);
                    
                    CubicCurve anchoV2 = new CubicCurve(cubicaV1.getStartX(),cubicaV1.getStartY(),cubicaV1.getControlX1(),cubicaV1.getControlY1(),cubicaV1.getControlX2(),cubicaV1.getControlY2(),cubicaV1.getEndX(),cubicaV1.getEndY());
                    anchoV2.setLayoutX(34);
                    anchoV2.setLayoutY(24);
                    anchoV2.setFill(Color.TRANSPARENT);
                    anchoV2.setStroke(dibujar.getColor());
                    anchoV2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoV2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoV2.setTranslateY(1);
                    
                    CubicCurve anchoV3 = new CubicCurve(cubicaV2.getStartX(),cubicaV2.getStartY(),cubicaV2.getControlX1(),cubicaV2.getControlY1(),cubicaV2.getControlX2(),cubicaV2.getControlY2(),cubicaV2.getEndX(),cubicaV2.getEndY());
                    anchoV3.setLayoutX(58);
                    anchoV3.setLayoutY(13);
                    anchoV3.setFill(Color.TRANSPARENT);
                    anchoV3.setStroke(dibujar.getColor());
                    anchoV3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoV3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoV3.setTranslateX(1);
                    
                    CubicCurve anchoV4 = new CubicCurve(cubicaV2.getStartX(),cubicaV2.getStartY(),cubicaV2.getControlX1(),cubicaV2.getControlY1(),cubicaV2.getControlX2(),cubicaV2.getControlY2(),cubicaV2.getEndX(),cubicaV2.getEndY());
                    anchoV4.setLayoutX(58);
                    anchoV4.setLayoutY(13);
                    anchoV4.setFill(Color.TRANSPARENT);
                    anchoV4.setStroke(dibujar.getColor());
                    anchoV4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoV4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoV4.setTranslateY(1);
                    
                    CubicCurve anchoV5 = new CubicCurve(cubicaV3.getStartX(),cubicaV3.getStartY(),cubicaV3.getControlX1(),cubicaV3.getControlY1(),cubicaV3.getControlX2(),cubicaV3.getControlY2(),cubicaV3.getEndX(),cubicaV3.getEndY());
                    anchoV5.setLayoutX(18);
                    anchoV5.setLayoutY(19);
                    anchoV5.setFill(Color.TRANSPARENT);
                    anchoV5.setStroke(dibujar.getColor());
                    anchoV5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoV5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoV5.setTranslateX(1);
                    
                    CubicCurve anchoV6 = new CubicCurve(cubicaV3.getStartX(),cubicaV3.getStartY(),cubicaV3.getControlX1(),cubicaV3.getControlY1(),cubicaV3.getControlX2(),cubicaV3.getControlY2(),cubicaV3.getEndX(),cubicaV3.getEndY());
                    anchoV6.setLayoutX(18);
                    anchoV6.setLayoutY(19);
                    anchoV6.setFill(Color.TRANSPARENT);
                    anchoV6.setStroke(dibujar.getColor());
                    anchoV6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoV6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoV6.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoV1,anchoV2,anchoV3,anchoV4,anchoV5,anchoV6);
                }
                if (palabra.isS()){
                    Line subV = new Line();
                    subV.setStartX(45); //tamaño V es 45
                    subV.setLayoutX(0);
                    subV.setLayoutY(55);
                    subV.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subV);
                }
                
                if (dibujar.getControl()){
                    Circle pV1 = new Circle(cubicaV1.getStartX(),cubicaV1.getStartY(),2,Color.RED);
                    pV1.setLayoutX(34);
                    pV1.setLayoutY(24);
                    Circle pV2 = new Circle(cubicaV1.getControlX1(),cubicaV1.getControlY1(),2,Color.RED);
                    pV2.setLayoutX(34);
                    pV2.setLayoutY(24);
                    Circle pV3 = new Circle(cubicaV1.getControlX2(),cubicaV1.getControlY2(),2,Color.RED);
                    pV3.setLayoutX(34);
                    pV3.setLayoutY(24);
                    Circle pV4 = new Circle(cubicaV1.getEndX(),cubicaV1.getEndY(),2,Color.RED);
                    pV4.setLayoutX(34);
                    pV4.setLayoutY(24);
                    
                    Circle pV5 = new Circle(cubicaV2.getStartX(),cubicaV2.getStartY(),2,Color.RED);
                    pV5.setLayoutX(58);
                    pV5.setLayoutY(13);
                    Circle pV6 = new Circle(cubicaV2.getControlX1(),cubicaV2.getControlY1(),2,Color.RED);
                    pV6.setLayoutX(58);
                    pV6.setLayoutY(13);
                    Circle pV7 = new Circle(cubicaV2.getControlX2(),cubicaV2.getControlY2(),2,Color.RED);
                    pV7.setLayoutX(58);
                    pV7.setLayoutY(13);
                    Circle pV8 = new Circle(cubicaV2.getEndX(),cubicaV2.getEndY(),2,Color.RED);
                    pV8.setLayoutX(58);
                    pV8.setLayoutY(13);
                    
                    Circle pV9 = new Circle(cubicaV3.getStartX(),cubicaV3.getStartY(),2,Color.RED);
                    pV9.setLayoutX(18);
                    pV9.setLayoutY(19);
                    Circle pV10 = new Circle(cubicaV3.getControlX1(),cubicaV3.getControlY1(),2,Color.RED);
                    pV10.setLayoutX(18);
                    pV10.setLayoutY(19);
                    Circle pV11 = new Circle(cubicaV3.getControlX2(),cubicaV3.getControlY2(),2,Color.RED);
                    pV11.setLayoutX(18);
                    pV11.setLayoutY(19);
                    Circle pV12 = new Circle(cubicaV3.getEndX(),cubicaV3.getEndY(),2,Color.RED);
                    pV12.setLayoutX(18);
                    pV12.setLayoutY(19);
                    
                    fondo.getChildren().addAll(pV1,pV2,pV3,pV4,pV5,pV6,pV7,pV8,pV9,pV10,pV11,pV12);
                }
                
                fondo.getChildren().addAll(cubicaV1,cubicaV2,cubicaV3);
                return fondo;
            case 'W':
                CubicCurve cubicaW1 = new CubicCurve(-9.95,25.4,-25.19,14.6,-13.19,-14.19,-19.59,-14.19);
                CubicCurve cubicaW2 = new CubicCurve(-34.59,35,-36.8,27.6,-24.19,10.5,-27.19,-2.8);
                CubicCurve cubicaW3 = new CubicCurve(-10.19,24.6,-22.8,6.8,-13,-6.19,-18.8,-14.47);
                CubicCurve cubicaW4 = new CubicCurve(-34.59,35,-36.8,-27.6,-20.4,11,-28.59,-4.39);
                CubicCurve cubicaW5 = new CubicCurve(-4.59,0,-8.19,7,-18,0,-4.59,-9.19);
                //Atributos del Fondo
                fondo.setPrefHeight(60);//y
                fondo.setPrefWidth(45);//x
                //PRIMERA izquierda
                cubicaW1.setLayoutX(27);
                cubicaW1.setLayoutY(24);
                cubicaW1.setFill(Color.TRANSPARENT);
                cubicaW1.setStroke(dibujar.getColor());
                cubicaW1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaW1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //izquierda centro
                cubicaW2.setLayoutX(51);
                cubicaW2.setLayoutY(13);
                cubicaW2.setFill(Color.TRANSPARENT);
                cubicaW2.setStroke(dibujar.getColor());
                cubicaW2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaW2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecha centro
                cubicaW3.setLayoutX(42);
                cubicaW3.setLayoutY(24);
                cubicaW3.setFill(Color.TRANSPARENT);
                cubicaW3.setStroke(dibujar.getColor());
                cubicaW3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaW3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecha
                cubicaW4.setLayoutX(67);
                cubicaW4.setLayoutY(14);
                cubicaW4.setFill(Color.TRANSPARENT);
                cubicaW4.setStroke(dibujar.getColor());
                cubicaW4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaW4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachiWto
                cubicaW5.setLayoutX(12);
                cubicaW5.setLayoutY(19);
                cubicaW5.setFill(Color.TRANSPARENT);
                cubicaW5.setStroke(dibujar.getColor());
                cubicaW5.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaW5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    
                }
                
                if (palabra.isN()){
                    CubicCurve anchoW1 = new CubicCurve(cubicaW1.getStartX(),cubicaW1.getStartY(),cubicaW1.getControlX1(),cubicaW1.getControlY1(),cubicaW1.getControlX2(),cubicaW1.getControlY2(),cubicaW1.getEndX(),cubicaW1.getEndY());
                    anchoW1.setLayoutX(27);
                    anchoW1.setLayoutY(24);
                    anchoW1.setFill(Color.TRANSPARENT);
                    anchoW1.setStroke(dibujar.getColor());
                    anchoW1.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoW1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoW1.setTranslateX(1);
                    
                    CubicCurve anchoW2 = new CubicCurve(cubicaW1.getStartX(),cubicaW1.getStartY(),cubicaW1.getControlX1(),cubicaW1.getControlY1(),cubicaW1.getControlX2(),cubicaW1.getControlY2(),cubicaW1.getEndX(),cubicaW1.getEndY());
                    anchoW2.setLayoutX(27);
                    anchoW2.setLayoutY(24);
                    anchoW2.setFill(Color.TRANSPARENT);
                    anchoW2.setStroke(dibujar.getColor());
                    anchoW2.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoW2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoW2.setTranslateY(1);
                    
                    CubicCurve anchoW3 = new CubicCurve(cubicaW2.getStartX(),cubicaW2.getStartY(),cubicaW2.getControlX1(),cubicaW2.getControlY1(),cubicaW2.getControlX2(),cubicaW2.getControlY2(),cubicaW2.getEndX(),cubicaW2.getEndY());
                    anchoW3.setLayoutX(51);
                    anchoW3.setLayoutY(13);
                    anchoW3.setFill(Color.TRANSPARENT);
                    anchoW3.setStroke(dibujar.getColor());
                    anchoW3.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoW3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoW3.setTranslateX(1);
                    
                    CubicCurve anchoW4 = new CubicCurve(cubicaW2.getStartX(),cubicaW2.getStartY(),cubicaW2.getControlX1(),cubicaW2.getControlY1(),cubicaW2.getControlX2(),cubicaW2.getControlY2(),cubicaW2.getEndX(),cubicaW2.getEndY());
                    anchoW4.setLayoutX(51);
                    anchoW4.setLayoutY(13);
                    anchoW4.setFill(Color.TRANSPARENT);
                    anchoW4.setStroke(dibujar.getColor());
                    anchoW4.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoW4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoW4.setTranslateY(1);
                    
                    CubicCurve anchoW5 = new CubicCurve(cubicaW3.getStartX(),cubicaW3.getStartY(),cubicaW3.getControlX1(),cubicaW3.getControlY1(),cubicaW3.getControlX2(),cubicaW3.getControlY2(),cubicaW3.getEndX(),cubicaW3.getEndY());
                    anchoW5.setLayoutX(42);
                    anchoW5.setLayoutY(24);
                    anchoW5.setFill(Color.TRANSPARENT);
                    anchoW5.setStroke(dibujar.getColor());
                    anchoW5.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoW5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoW5.setTranslateX(1);
                    
                    CubicCurve anchoW6 = new CubicCurve(cubicaW3.getStartX(),cubicaW3.getStartY(),cubicaW3.getControlX1(),cubicaW3.getControlY1(),cubicaW3.getControlX2(),cubicaW3.getControlY2(),cubicaW3.getEndX(),cubicaW3.getEndY());
                    anchoW6.setLayoutX(42);
                    anchoW6.setLayoutY(24);
                    anchoW6.setFill(Color.TRANSPARENT);
                    anchoW6.setStroke(dibujar.getColor());
                    anchoW6.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoW6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoW6.setTranslateY(1);
                    
                    CubicCurve anchoW7 = new CubicCurve(cubicaW4.getStartX(),cubicaW4.getStartY(),cubicaW4.getControlX1(),cubicaW4.getControlY1(),cubicaW4.getControlX2(),cubicaW4.getControlY2(),cubicaW4.getEndX(),cubicaW4.getEndY());
                    anchoW7.setLayoutX(67);
                    anchoW7.setLayoutY(14);
                    anchoW7.setFill(Color.TRANSPARENT);
                    anchoW7.setStroke(dibujar.getColor());
                    anchoW7.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoW7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoW7.setTranslateX(1);
                    
                    CubicCurve anchoW8 = new CubicCurve(cubicaW4.getStartX(),cubicaW4.getStartY(),cubicaW4.getControlX1(),cubicaW4.getControlY1(),cubicaW4.getControlX2(),cubicaW4.getControlY2(),cubicaW4.getEndX(),cubicaW4.getEndY());
                    anchoW8.setLayoutX(67);
                    anchoW8.setLayoutY(14);
                    anchoW8.setFill(Color.TRANSPARENT);
                    anchoW8.setStroke(dibujar.getColor());
                    anchoW8.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoW8.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoW8.setTranslateY(1);
                    
                    CubicCurve anchoW9 = new CubicCurve(cubicaW5.getStartX(),cubicaW5.getStartY(),cubicaW5.getControlX1(),cubicaW5.getControlY1(),cubicaW5.getControlX2(),cubicaW5.getControlY2(),cubicaW5.getEndX(),cubicaW5.getEndY());
                    anchoW9.setLayoutX(12);
                    anchoW9.setLayoutY(19);
                    anchoW9.setFill(Color.TRANSPARENT);
                    anchoW9.setStroke(dibujar.getColor());
                    anchoW9.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoW9.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoW9.setTranslateX(1);
                    
                    CubicCurve anchoW10 = new CubicCurve(cubicaW5.getStartX(),cubicaW5.getStartY(),cubicaW5.getControlX1(),cubicaW5.getControlY1(),cubicaW5.getControlX2(),cubicaW5.getControlY2(),cubicaW5.getEndX(),cubicaW5.getEndY());
                    anchoW10.setLayoutX(12);
                    anchoW10.setLayoutY(19);
                    anchoW10.setFill(Color.TRANSPARENT);
                    anchoW10.setStroke(dibujar.getColor());
                    anchoW10.setStrokeLineCap(StrokeLineCap.ROUND);
                    anchoW10.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    anchoW10.setTranslateY(1);
                    
                    fondo.getChildren().addAll(anchoW1,anchoW2,anchoW3,anchoW4,anchoW5,anchoW6,anchoW7,anchoW8,anchoW9,anchoW10);
                }
                if (palabra.isS()){
                    Line subW = new Line();
                    subW.setStartX(45); //tamaño W es 45
                    subW.setLayoutX(0);
                    subW.setLayoutY(55);
                    subW.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subW);
                }
                
                if (dibujar.getControl()){
                    Circle pW1 = new Circle(cubicaW1.getStartX(),cubicaW1.getStartY(),2,Color.RED);
                    pW1.setLayoutX(27);
                    pW1.setLayoutY(24);
                    Circle pW2 = new Circle(cubicaW1.getControlX1(),cubicaW1.getControlY1(),2,Color.RED);
                    pW2.setLayoutX(27);
                    pW2.setLayoutY(24);
                    Circle pW3 = new Circle(cubicaW1.getControlX2(),cubicaW1.getControlY2(),2,Color.RED);
                    pW3.setLayoutX(27);
                    pW3.setLayoutY(24);
                    Circle pW4 = new Circle(cubicaW1.getEndX(),cubicaW1.getEndY(),2,Color.RED);
                    pW4.setLayoutX(27);
                    pW4.setLayoutY(24);
                    
                    Circle pW5 = new Circle(cubicaW2.getStartX(),cubicaW2.getStartY(),2,Color.RED);
                    pW5.setLayoutX(51);
                    pW5.setLayoutY(13);
                    Circle pW6 = new Circle(cubicaW2.getControlX1(),cubicaW2.getControlY1(),2,Color.RED);
                    pW6.setLayoutX(51);
                    pW6.setLayoutY(13);
                    Circle pW7 = new Circle(cubicaW2.getControlX2(),cubicaW2.getControlY2(),2,Color.RED);
                    pW7.setLayoutX(51);
                    pW7.setLayoutY(13);
                    Circle pW8 = new Circle(cubicaW2.getEndX(),cubicaW2.getEndY(),2,Color.RED);
                    pW8.setLayoutX(51);
                    pW8.setLayoutY(13);
                    
                    Circle pW9 = new Circle(cubicaW3.getStartX(),cubicaW3.getStartY(),2,Color.RED);
                    pW9.setLayoutX(42);
                    pW9.setLayoutY(24);
                    Circle pW10 = new Circle(cubicaW3.getControlX1(),cubicaW3.getControlY1(),2,Color.RED);
                    pW10.setLayoutX(42);
                    pW10.setLayoutY(24);
                    Circle pW11 = new Circle(cubicaW3.getControlX2(),cubicaW3.getControlY2(),2,Color.RED);
                    pW11.setLayoutX(42);
                    pW11.setLayoutY(24);
                    Circle pW12 = new Circle(cubicaW3.getEndX(),cubicaW3.getEndY(),2,Color.RED);
                    pW12.setLayoutX(42);
                    pW12.setLayoutY(24);
                    
                    Circle pW13 = new Circle(cubicaW4.getStartX(),cubicaW4.getStartY(),2,Color.RED);
                    pW13.setLayoutX(67);
                    pW13.setLayoutY(14);
                    Circle pW14 = new Circle(cubicaW4.getControlX1(),cubicaW4.getControlY1(),2,Color.RED);
                    pW14.setLayoutX(67);
                    pW14.setLayoutY(14);
                    Circle pW15 = new Circle(cubicaW4.getControlX2(),cubicaW4.getControlY2(),2,Color.RED);
                    pW15.setLayoutX(67);
                    pW15.setLayoutY(14);
                    Circle pW16 = new Circle(cubicaW4.getEndX(),cubicaW4.getEndY(),2,Color.RED);
                    pW16.setLayoutX(67);
                    pW16.setLayoutY(14);
                    
                    Circle pW17 = new Circle(cubicaW5.getStartX(),cubicaW5.getStartY(),2,Color.RED);
                    pW17.setLayoutX(12);
                    pW17.setLayoutY(19);
                    Circle pW18 = new Circle(cubicaW5.getControlX1(),cubicaW5.getControlY1(),2,Color.RED);
                    pW18.setLayoutX(12);
                    pW18.setLayoutY(19);
                    Circle pW19 = new Circle(cubicaW5.getControlX2(),cubicaW5.getControlY2(),2,Color.RED);
                    pW19.setLayoutX(12);
                    pW19.setLayoutY(19);
                    Circle pW20 = new Circle(cubicaW5.getEndX(),cubicaW5.getEndY(),2,Color.RED);
                    pW20.setLayoutX(12);
                    pW20.setLayoutY(19);
                    
                    fondo.getChildren().addAll(pW1,pW2,pW3,pW4,pW5,pW6,pW7,pW8,pW9,pW10,pW11,pW12,pW13,pW14,pW15,pW16,pW17,pW18,pW19,pW20);
                }
                
                fondo.getChildren().addAll(cubicaW1,cubicaW2,cubicaW3,cubicaW4,cubicaW5);
                return fondo;
            case 'X':
                CubicCurve cubicasX = new CubicCurve(-34.0,24.19,-13.8,22.4,-6.19,-5.8,-29.6,-14.0);
                CubicCurve cubica1X = new CubicCurve(-4.0,20.8,-19.6,15.0,-22.4,-7.8,-5.8,-18.19);
                CubicCurve cubica2X = new CubicCurve(-3.99,1.2,-10.19,12.6,-23.8,-5,-5.73,-8.13);
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //izquierda 
                cubicasX.setLayoutX(40.0);
                cubicasX.setLayoutY(25.0);
                cubicasX.setFill(Color.TRANSPARENT);
                cubicasX.setStroke(dibujar.getColor());
                cubicasX.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasX.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //derecha
                cubica1X.setLayoutX(42.0);
                cubica1X.setLayoutY(28.0);
                cubica1X.setFill(Color.TRANSPARENT);
                cubica1X.setStroke(dibujar.getColor());
                cubica1X.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1X.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //izquierda
                cubica2X.setLayoutX(16.0);
                cubica2X.setLayoutY(19.0);
                cubica2X.setFill(Color.TRANSPARENT);
                cubica2X.setStroke(dibujar.getColor());
                cubica2X.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2X.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //TIPOS
                if (palabra.isK()){
                    cubicasX.setRotate(7);
                    cubica1X.setRotate(7);
                    cubica2X.setRotate(7);
                }
                fondo.getChildren().addAll(cubicasX,cubica1X,cubica2X);
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicasX, fondo);
                    estilos.cubicaNegrita(cubica1X, fondo);
                    estilos.cubicaNegrita(cubica2X, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicasX, fondo);
                    estilos.cubicaControl(cubica1X, fondo);
                    estilos.cubicaControl(cubica2X, fondo);
                }               
            
            return fondo;
            case 'Y':
                CubicCurve cubicasY = new CubicCurve(-15.6,-3.39,-14.12,20.0,-20.79,31.39,-29.6,23.39);
                CubicCurve cubica1Y = new CubicCurve(-25.5,27.8,-36.39,16.8,-27.8,9.39,-29.39,3.8);
                CubicCurve cubica2Y = new CubicCurve(-8.89,17.90,-18.5,17.90,-5.29,-4.30,-3.10,11.3);
                CubicCurve cubica3Y = new CubicCurve(-12.0,40.40,-7.0,45.8,9.2,51.0,4.6,9.0);
                CubicCurve cubica4Y = new CubicCurve(4.39,-5.80,-2.40,-17.60,18.79,-17.60,9.39,-5.80);
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //base derecha media  
                cubicasY.setLayoutX(48.0);
                cubicasY.setLayoutY(10.0);              
                cubicasY.setFill(Color.TRANSPARENT);
                cubicasY.setStroke(dibujar.getColor());
                cubicasY.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasY.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //base izquierda media
                cubica1Y.setLayoutX(44.5);
                cubica1Y.setLayoutY(6.0);
                cubica1Y.setFill(Color.TRANSPARENT);
                cubica1Y.setStroke(dibujar.getColor());
                cubica1Y.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1Y.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito izquierdo
                cubica2Y.setLayoutX(18.5);
                cubica2Y.setLayoutY(0.5);
                cubica2Y.setFill(Color.TRANSPARENT);
                cubica2Y.setStroke(dibujar.getColor());
                cubica2Y.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2Y.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //inferior derec0ha
                cubica3Y.setLayoutX(28.0);
                cubica3Y.setLayoutY(9.0);
                cubica3Y.setFill(Color.TRANSPARENT);
                cubica3Y.setStroke(dibujar.getColor());
                cubica3Y.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica3Y.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito inferior
                cubica4Y.setLayoutX(11.5);
                cubica4Y.setLayoutY(55.0);
                cubica4Y.setFill(Color.TRANSPARENT);
                cubica4Y.setStroke(dibujar.getColor());
                cubica4Y.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica4Y.setStrokeLineJoin(StrokeLineJoin.ROUND);
                if (palabra.isK()){
                    cubicasY.setRotate(7);
                    cubica1Y.setRotate(7);
                    cubica2Y.setRotate(7);
                    cubica3Y.setRotate(7);
                    cubica4Y.setRotate(7);
                }   
                fondo.getChildren().addAll(cubicasY,cubica2Y,cubica1Y,cubica3Y,cubica4Y);
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicasY, fondo);
                    estilos.cubicaNegrita(cubica1Y, fondo);
                    estilos.cubicaNegrita(cubica2Y, fondo);
                    estilos.cubicaNegrita(cubica3Y, fondo);
                    estilos.cubicaNegrita(cubica4Y, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicasY, fondo);
                    estilos.cubicaControl(cubica1Y, fondo);
                    estilos.cubicaControl(cubica2Y, fondo);
                    estilos.cubicaControl(cubica3Y, fondo);
                    estilos.cubicaControl(cubica4Y, fondo);
                }   
                return fondo;
            case 'Z':
                CubicCurve cubicasZ = new CubicCurve(-22.0,26.6,-13.39,18.0,-7.2,-5.19,2.39,-12.6);
                CubicCurve cubica1Z = new CubicCurve(-8.39,-14.80,-14.39,-10.0,-25.79,-24.0,-36.39,-12.0);  
                CubicCurve cubica2Z = new CubicCurve(-2.19,-0.19,-5.73,8.8,-18.39,-2.39,-5.73,-8.13);
                CubicCurve cubica3Z = new CubicCurve(3.60,18.19,-10.39,27.0,-14.79,13.39,-23.19,19.79);
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                //central
                cubicasZ.setLayoutX(32.0);
                cubicasZ.setLayoutY(22.0);
                cubicasZ.setFill(Color.TRANSPARENT);
                cubicasZ.setStroke(dibujar.getColor());
                cubicasZ.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicasZ.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //superior
                cubica1Z.setLayoutX(43.0);
                cubica1Z.setLayoutY(24.0);
                cubica1Z.setFill(Color.TRANSPARENT);
                cubica1Z.setStroke(dibujar.getColor());
                cubica1Z.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1Z.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cachito
                cubica2Z.setLayoutX(16.5);
                cubica2Z.setLayoutY(17.0);
                cubica2Z.setFill(Color.TRANSPARENT);
                cubica2Z.setStroke(dibujar.getColor());
                cubica2Z.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2Z.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //inferior 
                cubica3Z.setLayoutX(32.0);
                cubica3Z.setLayoutY(30.0);
                cubica3Z.setFill(Color.TRANSPARENT);
                cubica3Z.setStroke(dibujar.getColor());
                cubica3Z.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica3Z.setStrokeLineJoin(StrokeLineJoin.ROUND);
                if (palabra.isK()){
                    cubicasZ.setRotate(7);
                    cubica1Z.setRotate(7);
                    cubica2Z.setRotate(7);
                    cubica3Z.setRotate(7);
                }
                fondo.getChildren().addAll(cubicasZ,cubica1Z,cubica2Z,cubica3Z);
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicasZ, fondo);
                    estilos.cubicaNegrita(cubica1Z, fondo);
                    estilos.cubicaNegrita(cubica2Z, fondo);
                    estilos.cubicaNegrita(cubica3Z, fondo);    
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicasZ, fondo);
                    estilos.cubicaControl(cubica1Z, fondo);
                    estilos.cubicaControl(cubica2Z, fondo);
                    estilos.cubicaControl(cubica3Z, fondo);
                }
                return fondo;
            case 'a':
                CubicCurve cubicaa= new CubicCurve(-36,-6.54,-33.59,-19.0,-23.76,-21.0,-23.76,-6.54);
                CubicCurve cubicaa1 = new CubicCurve(-34.8,-7.8,-37.0,5.17,-22.76,5.17,-22.76,-7.8);
                CubicCurve cubicaa2 = new CubicCurve(-31.76,-15.4,-35.2,7.0,-29.79,7.0,-26.79,-3.59);
                fondo.setPrefSize(19,60);
                //primerabase
                cubicaa.setLayoutX(36);
                cubicaa.setLayoutY(42);
                cubicaa.setFill(Color.TRANSPARENT);
                cubicaa.setStroke(dibujar.getColor());
                cubicaa.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaa.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //curva 
                cubicaa1.setLayoutX(35);
                cubicaa1.setLayoutY(44);
                cubicaa1.setFill(Color.TRANSPARENT);
                cubicaa1.setStroke(dibujar.getColor());
                cubicaa1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaa1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //unioaan
                cubicaa2.setLayoutX(45);
                cubicaa2.setLayoutY(42);
                cubicaa2.setFill(Color.TRANSPARENT);
                cubicaa2.setStroke(dibujar.getColor());
                cubicaa2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaa2.setStrokeLineJoin(StrokeLineJoin.ROUND); 
                if (palabra.isK()){
                    cubicaa.setRotate(7);
                    cubicaa1.setRotate(7);
                    cubicaa2.setRotate(7);
                }
                fondo.getChildren().addAll(cubicaa,cubicaa1,cubicaa2);
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaa, fondo);
                    estilos.cubicaNegrita(cubicaa1, fondo);
                    estilos.cubicaNegrita(cubicaa2, fondo);   
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaa, fondo);
                    estilos.cubicaControl(cubicaa1, fondo);
                    estilos.cubicaControl(cubicaa2, fondo);
                }
                return fondo; 
           case 'b':
                CubicCurve cubicab= new CubicCurve(-29.79,-33.8,-40.59,2.4,-39.0,10.79,-27.19,6.0);
                CubicCurve cubicab1 = new CubicCurve(-45.39,-25.3,-38.07,-27.03,-31.20,-20.95,-38.07,-12.9);
                CubicCurve cubicab2 = new CubicCurve(-35.0,-26.5,-39.04,-24.08,-30.37,-20.68,-22.19,-26.5);
                fondo.setPrefSize(19,60);
                //primerabase
                cubicab.setLayoutX(39.0);
                cubicab.setLayoutY(38.0);
                cubicab.setFill(Color.TRANSPARENT);
                cubicab.setStroke(dibujar.getColor());
                cubicab.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicab.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //curvba 
                cubicab1.setLayoutX(50);
                cubicab1.setLayoutY(56.5);
                cubicab1.setFill(Color.TRANSPARENT);
                cubicab1.setStroke(dibujar.getColor());
                cubicab1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicab1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //uniobn
                cubicab2.setLayoutX(40.0);
                cubicab2.setLayoutY(58.0);
                cubicab2.setFill(Color.TRANSPARENT);
                cubicab2.setStroke(dibujar.getColor());
                cubicab2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicab2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                if (palabra.isK()){
                    cubicab.setRotate(7);
                    cubicab1.setRotate(7);
                    cubicab2.setRotate(7);
                }
                fondo.getChildren().addAll(cubicab,cubicab1,cubicab2);  
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicab, fondo);
                    estilos.cubicaNegrita(cubicab1, fondo);
                    estilos.cubicaNegrita(cubicab2, fondo);   
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicab, fondo);
                    estilos.cubicaControl(cubicab1, fondo);
                    estilos.cubicaControl(cubicab2, fondo);
                }              
                return fondo;
            case 'c':
                CubicCurve cubicac= new CubicCurve(-43.60,-5.8,-38.39,-0.8,-32,-5.8,-32,-11.69);
                CubicCurve cubicac1 = new CubicCurve(-30.8,-14,-40.6,-18.4,-42.6,-2.2,-37.2,2.79);   
                fondo.setPrefSize(19,60);
                //primerabase
                cubicac.setLayoutX(48);
                cubicac.setLayoutY(48.898);
                cubicac.setFill(Color.TRANSPARENT);
                cubicac.setStroke(dibujar.getColor());
                cubicac.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicac.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //curva
                cubicac1.setLayoutX(42);
                cubicac1.setLayoutY(41);
                cubicac1.setFill(Color.TRANSPARENT);
                cubicac1.setStroke(dibujar.getColor());
                cubicac1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicac1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                if (palabra.isK()){
                    cubicac.setRotate(7);
                    cubicac1.setRotate(7);
                }
                fondo.getChildren().addAll(cubicac,cubicac1);
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicac, fondo);
                    estilos.cubicaNegrita(cubicac1, fondo);   
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicac, fondo);
                    estilos.cubicaControl(cubicac1, fondo);
                }
                return fondo;
            case 'd':
                CubicCurve cubicad = new CubicCurve(-35.8,-6.54,-32.39,-20.8,-22,-20.8,-23.76,-6.54);
                CubicCurve cubicad1 = new CubicCurve(-34.6,-7.8,-37.6,7,-22.76,5.17,-22.76,-7.8);
                CubicCurve cubicad2 = new CubicCurve(-37.19,-11.8,-44.59,6.0,-44.59,-21.4,-37.19,-47.4);
                fondo.setPrefSize(19, 60);
                // superior
                cubicad.setLayoutX(35);
                cubicad.setLayoutY(42);
                cubicad.setFill(Color.TRANSPARENT);
                cubicad.setStroke(dibujar.getColor());
                cubicad.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicad.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //inferior
                cubicad1.setLayoutX(34);
                cubicad1.setLayoutY(43);
                cubicad1.setFill(Color.TRANSPARENT);
                cubicad1.setStroke(dibujar.getColor());
                cubicad1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicad1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                // unidon
                cubicad2.setLayoutX(54);
                cubicad2.setLayoutY(51);
                cubicad2.setFill(Color.TRANSPARENT);
                cubicad2.setStroke(dibujar.getColor());
                cubicad2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicad2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                if (palabra.isK()){
                    cubicad.setRotate(7);
                    cubicad1.setRotate(7);
                    cubicad2.setRotate(7);
                }
                fondo.getChildren().addAll(cubicad, cubicad1,cubicad2);
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicad, fondo);
                    estilos.cubicaNegrita(cubicad1, fondo);
                    estilos.cubicaNegrita(cubicad2, fondo);   
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicad, fondo);
                    estilos.cubicaControl(cubicad1, fondo);
                    estilos.cubicaControl(cubicad2, fondo);
                }
                return fondo;
            case 'e':
                CubicCurve cubicae= new CubicCurve(-39.19,-8,-36.39,-24.59,-21,-14.59,-39.19,-2.8);
                CubicCurve cubicae1 = new CubicCurve(-38.59,-6.59,-43.39,12.19,-32.69,10.59,-28.06,0.59);   
                fondo.setPrefSize(19,60);
                //primerabase
                cubicae.setLayoutX(40.5);
                cubicae.setLayoutY(41);
                cubicae.setFill(Color.TRANSPARENT);
                cubicae.setStroke(dibujar.getColor());
                cubicae.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicae.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //base union
                cubicae1.setLayoutX(40.5);
                cubicae1.setLayoutY(37);
                cubicae1.setFill(Color.TRANSPARENT);
                cubicae1.setStroke(dibujar.getColor());
                cubicae1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicae1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                if (palabra.isK()){
                    cubicae.setRotate(7);
                    cubicae1.setRotate(7);
                }
                fondo.getChildren().addAll(cubicae,cubicae1);
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicae, fondo);
                    estilos.cubicaNegrita(cubicae1, fondo);  
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicae, fondo);
                    estilos.cubicaControl(cubicae1, fondo);
                }
                return fondo;
            case 'f':
                CubicCurve cubicaf= new CubicCurve(-60.78,-14.8,-66.18,-79,-50.99,-53.59,-60.78,-23.0);
                CubicCurve cubicaf1= new CubicCurve(-70.60,-31.20,-58.39,-18,-74.8,13.2,-70.60,-28.4);
                CubicCurve cubicaf2= new CubicCurve(-63.2,-30.9,-76.19,-25.24,-80.69,-34.31,-72.33,-34.31);
                fondo.setPrefSize(19,60);

                //primera inferior
                cubicaf.setLayoutX(64.99);
                cubicaf.setLayoutY(59.0);
                cubicaf.setFill(Color.TRANSPARENT);
                cubicaf.setStroke(dibujar.getColor());
                cubicaf.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaf.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea inferior
                cubicaf1.setLayoutX(75);
                cubicaf1.setLayoutY(66); 
                cubicaf1.setFill(Color.TRANSPARENT);
                cubicaf1.setStroke(dibujar.getColor());
                cubicaf1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaf1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //linefa media
                cubicaf2.setLayoutX(77.2);
                cubicaf2.setLayoutY(69.5);
                cubicaf2.setFill(Color.TRANSPARENT);
                cubicaf2.setStroke(dibujar.getColor());
                cubicaf2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaf2.setStrokeLineJoin(StrokeLineJoin.ROUND);   
                if (palabra.isK()){
                    cubicaf.setRotate(7);
                    cubicaf1.setRotate(7);
                    cubicaf2.setRotate(7);
                }
                fondo.getChildren().addAll(cubicaf,cubicaf1,cubicaf2);
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaf, fondo);
                    estilos.cubicaNegrita(cubicaf1, fondo);
                    estilos.cubicaNegrita(cubicaf2, fondo);   
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaf, fondo);
                    estilos.cubicaControl(cubicaf1, fondo);
                    estilos.cubicaControl(cubicaf2, fondo);
                }
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
                CubicCurve cubicau1= new CubicCurve(-33.79, -16.4, -40, 5.59, -23.8, 16, -23.8, -16.4);
                CubicCurve cubicau2 = new CubicCurve(-31.8, -28.59, -34, -7.95, -26.39, -7.95, -26.39, -15.59); 
                fondo.setPrefSize(19,60);
                //cubica 1
                cubicau1.setLayoutX(36);
                cubicau1.setLayoutY(42);
                cubicau1.setFill(Color.TRANSPARENT);
                cubicau1.setStroke(dibujar.getColor());
                cubicau1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicau1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                // cubica 2
                cubicau2.setLayoutX(44);
                cubicau2.setLayoutY(57);
                cubicau2.setFill(Color.TRANSPARENT);
                cubicau2.setStroke(dibujar.getColor());
                cubicau2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicau2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR Cursiva de manera correcta
                }
                
                if (palabra.isN()){
                    //Negrita
                    CubicCurve negritau1 = new CubicCurve(cubicau1.getStartX(), cubicau1.getStartY(), cubicau1.getControlX1(), cubicau1.getControlY1()
                            ,cubicau1.getControlX2(), cubicau1.getControlY2(), cubicau1.getEndX(), cubicau1.getEndY());
                    
                    negritau1.setLayoutX(36);
                    negritau1.setLayoutY(42);
                    negritau1.setFill(Color.TRANSPARENT);
                    negritau1.setStroke(dibujar.getColor());
                    negritau1.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritau1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritau1.setTranslateX(1);
                    
                    CubicCurve negritau1_2 = new CubicCurve(cubicau1.getStartX(), cubicau1.getStartY(), cubicau1.getControlX1(), cubicau1.getControlY1()
                            ,cubicau1.getControlX2(), cubicau1.getControlY2(), cubicau1.getEndX(), cubicau1.getEndY());
                    
                    negritau1_2.setLayoutX(36);
                    negritau1_2.setLayoutY(42);
                    negritau1_2.setFill(Color.TRANSPARENT);
                    negritau1_2.setStroke(dibujar.getColor());
                    negritau1_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritau1_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritau1_2.setTranslateY(1);
                    
                    CubicCurve negritau2 = new CubicCurve(cubicau2.getStartX(), cubicau2.getStartY(), cubicau2.getControlX1(), cubicau2.getControlY1()
                            ,cubicau2.getControlX2(), cubicau2.getControlY2(), cubicau2.getEndX(), cubicau2.getEndY());
                    
                    negritau2.setLayoutX(44);
                    negritau2.setLayoutY(57);
                    negritau2.setFill(Color.TRANSPARENT);
                    negritau2.setStroke(dibujar.getColor());
                    negritau2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritau2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritau2.setTranslateX(1);
                    
                    CubicCurve negritau2_2 = new CubicCurve(cubicau2.getStartX(), cubicau2.getStartY(), cubicau2.getControlX1(), cubicau2.getControlY1()
                            ,cubicau2.getControlX2(), cubicau2.getControlY2(), cubicau2.getEndX(), cubicau2.getEndY());
                    
                    negritau2_2.setLayoutX(44);
                    negritau2_2.setLayoutY(57);
                    negritau2_2.setFill(Color.TRANSPARENT);
                    negritau2_2.setStroke(dibujar.getColor());
                    negritau2_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritau2_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritau2_2.setTranslateY(1);
                    
                    fondo.getChildren().addAll(negritau1, negritau1_2, negritau2, negritau2_2);
                }
                
                if (palabra.isS()){
                    //Subrayado
                    Line subu = new Line();
                    subu.setStartX(19);
                    subu.setLayoutX(0);
                    subu.setLayoutY(55);
                    subu.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subu);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                    Circle pu1_1 = new Circle(cubicau1.getStartX(), cubicau1.getStartY(), 2, Color.RED);
                    pu1_1.setLayoutX(36);
                    pu1_1.setLayoutY(42);
                    Circle pu1_2 = new Circle(cubicau1.getControlX1(), cubicau1.getControlY1(), 2, Color.RED);
                    pu1_2.setLayoutX(36);
                    pu1_2.setLayoutY(42);
                    Circle pu1_3 = new Circle(cubicau1.getControlX2(), cubicau1.getControlY2(), 2, Color.RED);
                    pu1_3.setLayoutX(36);
                    pu1_3.setLayoutY(42);
                    Circle pu1_4 = new Circle(cubicau1.getEndX(), cubicau1.getEndY(), 2, Color.RED);
                    pu1_4.setLayoutX(36);
                    pu1_4.setLayoutY(42);
                    
                    Circle pu2_1 = new Circle(cubicau2.getStartX(), cubicau2.getStartY(), 2, Color.RED);
                    pu2_1.setLayoutX(44);
                    pu2_1.setLayoutY(57);
                    Circle pu2_2 = new Circle(cubicau2.getControlX1(), cubicau2.getControlY1(), 2, Color.RED);
                    pu2_2.setLayoutX(44);
                    pu2_2.setLayoutY(57);
                    Circle pu2_3 = new Circle(cubicau2.getControlX2(), cubicau2.getControlY2(), 2, Color.RED);
                    pu2_3.setLayoutX(44);
                    pu2_3.setLayoutY(57);
                    Circle pu2_4 = new Circle(cubicau2.getEndX(), cubicau2.getEndY(), 2, Color.RED);
                    pu2_4.setLayoutX(44);
                    pu2_4.setLayoutY(57);
                    
                    fondo.getChildren().addAll(pu1_1, pu1_2, pu1_3, pu1_4, pu2_1, pu2_2, pu2_3, pu2_4);
                }
                
                fondo.getChildren().addAll(cubicau1,cubicau2);
                return fondo;
            case 'v':
                CubicCurve cubicav1 = new CubicCurve(-10.19, 3.8, -8.1, 45.1, 1.34, 13.29, -0.89, 7.49);
                CubicCurve cubicav2 = new CubicCurve(-61.84, -33.84, -61.84, -41.8, -66.39, -41.8, -64.5, -23.29);
                CubicCurve cubicav3 = new CubicCurve(-62.79, -33.84, -72.79, -28.6, -76.8, -39, -67.99, -32.2);
                fondo.setPrefSize(19, 60);
                //Cubica 1
                cubicav1.setLayoutX(12.89);
                cubicav1.setLayoutY(22.5);
                cubicav1.setFill(Color.TRANSPARENT);
                cubicav1.setStroke(dibujar.getColor());
                cubicav1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicav1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica 2
                cubicav2.setLayoutX(65);
                cubicav2.setLayoutY(63.5);
                cubicav2.setFill(Color.TRANSPARENT);
                cubicav2.setStroke(dibujar.getColor());
                cubicav2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicav2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica3
                cubicav3.setLayoutX(80.2);
                cubicav3.setLayoutY(62);
                cubicav3.setFill(Color.TRANSPARENT);
                cubicav3.setStroke(dibujar.getColor());
                cubicav3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicav3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    CubicCurve negritav1 = new CubicCurve(cubicav1.getStartX(), cubicav1.getStartY(), cubicav1.getControlX1(), cubicav1.getControlY1()
                            ,cubicav1.getControlX2(), cubicav1.getControlY2(), cubicav1.getEndX(), cubicav1.getEndY());
                    
                    negritav1.setLayoutX(12.89);
                    negritav1.setLayoutY(22.5);
                    negritav1.setFill(Color.TRANSPARENT);
                    negritav1.setStroke(dibujar.getColor());
                    negritav1.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritav1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritav1.setTranslateX(1);
                    
                    CubicCurve negritav1_2 = new CubicCurve(cubicav1.getStartX(), cubicav1.getStartY(), cubicav1.getControlX1(), cubicav1.getControlY1()
                            ,cubicav1.getControlX2(), cubicav1.getControlY2(), cubicav1.getEndX(), cubicav1.getEndY());
                    
                    negritav1_2.setLayoutX(12.89);
                    negritav1_2.setLayoutY(22.5);
                    negritav1_2.setFill(Color.TRANSPARENT);
                    negritav1_2.setStroke(dibujar.getColor());
                    negritav1_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritav1_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritav1_2.setTranslateY(1);
                    
                    CubicCurve negritav2 = new CubicCurve(cubicav2.getStartX(), cubicav2.getStartY(), cubicav2.getControlX1(), cubicav2.getControlY1()
                            ,cubicav2.getControlX2(), cubicav2.getControlY2(), cubicav2.getEndX(), cubicav2.getEndY());
                    
                    negritav2.setLayoutX(65);
                    negritav2.setLayoutY(63.5);
                    negritav2.setFill(Color.TRANSPARENT);
                    negritav2.setStroke(dibujar.getColor());
                    negritav2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritav2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritav2.setTranslateX(1);
                    
                    CubicCurve negritav2_2 = new CubicCurve(cubicav2.getStartX(), cubicav2.getStartY(), cubicav2.getControlX1(), cubicav2.getControlY1()
                            ,cubicav2.getControlX2(), cubicav2.getControlY2(), cubicav2.getEndX(), cubicav2.getEndY());
                    
                    negritav2_2.setLayoutX(65);
                    negritav2_2.setLayoutY(63.5);
                    negritav2_2.setFill(Color.TRANSPARENT);
                    negritav2_2.setStroke(dibujar.getColor());
                    negritav2_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritav2_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritav2_2.setTranslateY(1);
                    
                    CubicCurve negritav3 = new CubicCurve(cubicav3.getStartX(), cubicav3.getStartY(), cubicav3.getControlX1(), cubicav3.getControlY1()
                            ,cubicav3.getControlX2(), cubicav3.getControlY2(), cubicav3.getEndX(), cubicav3.getEndY());
                    
                    negritav3.setLayoutX(80.2);
                    negritav3.setLayoutY(62);
                    negritav3.setFill(Color.TRANSPARENT);
                    negritav3.setStroke(dibujar.getColor());
                    negritav3.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritav3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritav3.setTranslateX(1);
                    
                    CubicCurve negritav3_2 = new CubicCurve(cubicav3.getStartX(), cubicav3.getStartY(), cubicav3.getControlX1(), cubicav3.getControlY1()
                            ,cubicav3.getControlX2(), cubicav3.getControlY2(), cubicav3.getEndX(), cubicav3.getEndY());
                    
                    negritav3_2.setLayoutX(80.2);
                    negritav3_2.setLayoutY(62);
                    negritav3_2.setFill(Color.TRANSPARENT);
                    negritav3_2.setStroke(dibujar.getColor());
                    negritav3_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritav3_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritav3_2.setTranslateY(1);
                    
                    fondo.getChildren().addAll(negritav1, negritav1_2, negritav2, negritav2_2, negritav3, negritav3_2);
                }
                
                if (palabra.isS()){
                    Line subv = new Line();
                    subv.setStartX(19);
                    subv.setLayoutX(0);
                    subv.setLayoutY(55);
                    subv.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subv);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                    Circle pv1_1 = new Circle(cubicav1.getStartX(), cubicav1.getStartY(), 2, Color.RED);
                    pv1_1.setLayoutX(12.89);
                    pv1_1.setLayoutY(22.5);
                    Circle pv1_2 = new Circle(cubicav1.getControlX1(), cubicav1.getControlY1(), 2, Color.RED);
                    pv1_2.setLayoutX(12.89);
                    pv1_2.setLayoutY(22.5);
                    Circle pv1_3 = new Circle(cubicav1.getControlX2(), cubicav1.getControlY2(), 2, Color.RED);
                    pv1_3.setLayoutX(12.89);
                    pv1_3.setLayoutY(22.5);
                    Circle pv1_4 = new Circle(cubicav1.getEndX(), cubicav1.getEndY(), 2, Color.RED);
                    pv1_4.setLayoutX(12.89);
                    pv1_4.setLayoutY(22.5);
                    
                    Circle pv2_1 = new Circle(cubicav2.getStartX(), cubicav2.getStartY(), 2, Color.RED);
                    pv2_1.setLayoutX(65);
                    pv2_1.setLayoutY(63.5);
                    Circle pv2_2 = new Circle(cubicav2.getControlX1(), cubicav2.getControlY1(), 2, Color.RED);
                    pv2_2.setLayoutX(65);
                    pv2_2.setLayoutY(63.5);
                    Circle pv2_3 = new Circle(cubicav2.getControlX2(), cubicav2.getControlY2(), 2, Color.RED);
                    pv2_3.setLayoutX(65);
                    pv2_3.setLayoutY(63.5);
                    Circle pv2_4 = new Circle(cubicav2.getEndX(), cubicav2.getEndY(), 2, Color.RED);
                    pv2_4.setLayoutX(65);
                    pv2_4.setLayoutY(63.5);
                    
                    Circle pv3_1 = new Circle(cubicav3.getStartX(), cubicav3.getStartY(), 2, Color.RED);
                    pv3_1.setLayoutX(80.2);
                    pv3_1.setLayoutY(62);
                    Circle pv3_2 = new Circle(cubicav3.getControlX1(), cubicav3.getControlY1(), 2, Color.RED);
                    pv3_2.setLayoutX(80.2);
                    pv3_2.setLayoutY(62);
                    Circle pv3_3 = new Circle(cubicav3.getControlX2(), cubicav3.getControlY2(), 2, Color.RED);
                    pv3_3.setLayoutX(80.2);
                    pv3_3.setLayoutY(62);
                    Circle pv3_4 = new Circle(cubicav3.getEndX(), cubicav3.getEndY(), 2, Color.RED);
                    pv3_4.setLayoutX(80.2);
                    pv3_4.setLayoutY(62);
                    
                    fondo.getChildren().addAll(pv1_1, pv1_2, pv1_3, pv1_4, pv2_1, pv2_2, pv2_3, pv2_4, pv3_1, pv3_2, pv3_3, pv3_4);
                }
                
                fondo.getChildren().addAll(cubicav1,cubicav2,cubicav3);
                return fondo;
            case 'w':
                CubicCurve cubicaw1 = new CubicCurve(-71.19, -32.29, -83.97, -30.19, -78.39, -36.5, -75.59, -32.29);
                CubicCurve cubicaw2 = new CubicCurve(-6.4, 3.8, -4.5, 44.5, 2.19, 11.9, -1.02, 3.8);
                CubicCurve cubicaw3 = new CubicCurve(-61.84, -33.84, -61.84, -41.8, -66.39, -41.8, -64, -23.29);
                CubicCurve cubicaw4 = new CubicCurve(-6.4, 3.8, -4.5, 44.5, 2.19, 11.9, -0.88, 5.14);
                fondo.setPrefSize(19, 60);
                //Cubica
                cubicaw1.setLayoutX(88.2);
                cubicaw1.setLayoutY(60);
                cubicaw1.setFill(Color.TRANSPARENT);
                cubicaw1.setStroke(dibujar.getColor());
                cubicaw1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaw1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubicaw2.setLayoutX(8.5);
                cubicaw2.setLayoutY(23);
                cubicaw2.setFill(Color.TRANSPARENT);
                cubicaw2.setStroke(dibujar.getColor());
                cubicaw2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaw2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 3
                cubicaw3.setLayoutX(64);
                cubicaw3.setLayoutY(63);
                cubicaw3.setFill(Color.TRANSPARENT);
                cubicaw3.setStroke(dibujar.getColor());
                cubicaw3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaw3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica 4
                cubicaw4.setLayoutX(13.89);
                cubicaw4.setLayoutY(23);
                cubicaw4.setFill(Color.TRANSPARENT);
                cubicaw4.setStroke(dibujar.getColor());
                cubicaw4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaw4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    CubicCurve negritaw1 = new CubicCurve(cubicaw1.getStartX(), cubicaw1.getStartY(), cubicaw1.getControlX1(), cubicaw1.getControlY1()
                            ,cubicaw1.getControlX2(), cubicaw1.getControlY2(), cubicaw1.getEndX(), cubicaw1.getEndY());
                    
                    negritaw1.setLayoutX(88.2);
                    negritaw1.setLayoutY(60);
                    negritaw1.setFill(Color.TRANSPARENT);
                    negritaw1.setStroke(dibujar.getColor());
                    negritaw1.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaw1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaw1.setTranslateX(1);
                    
                    CubicCurve negritaw1_2 = new CubicCurve(cubicaw1.getStartX(), cubicaw1.getStartY(), cubicaw1.getControlX1(), cubicaw1.getControlY1()
                            ,cubicaw1.getControlX2(), cubicaw1.getControlY2(), cubicaw1.getEndX(), cubicaw1.getEndY());
                    
                    negritaw1_2.setLayoutX(88.2);
                    negritaw1_2.setLayoutY(60);
                    negritaw1_2.setFill(Color.TRANSPARENT);
                    negritaw1_2.setStroke(dibujar.getColor());
                    negritaw1_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaw1_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaw1_2.setTranslateY(1);
                    
                    CubicCurve negritaw2 = new CubicCurve(cubicaw2.getStartX(), cubicaw2.getStartY(), cubicaw2.getControlX1(), cubicaw2.getControlY1()
                            ,cubicaw2.getControlX2(), cubicaw2.getControlY2(), cubicaw2.getEndX(), cubicaw2.getEndY());
                    
                    negritaw2.setLayoutX(8.5);
                    negritaw2.setLayoutY(23);
                    negritaw2.setFill(Color.TRANSPARENT);
                    negritaw2.setStroke(dibujar.getColor());
                    negritaw2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaw2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaw2.setTranslateX(1);
                    
                    CubicCurve negritaw2_2 = new CubicCurve(cubicaw2.getStartX(), cubicaw2.getStartY(), cubicaw2.getControlX1(), cubicaw2.getControlY1()
                            ,cubicaw2.getControlX2(), cubicaw2.getControlY2(), cubicaw2.getEndX(), cubicaw2.getEndY());
                    
                    negritaw2_2.setLayoutX(8.5);
                    negritaw2_2.setLayoutY(23);
                    negritaw2_2.setFill(Color.TRANSPARENT);
                    negritaw2_2.setStroke(dibujar.getColor());
                    negritaw2_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaw2_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaw2_2.setTranslateY(1);
                    
                    CubicCurve negritaw3 = new CubicCurve(cubicaw3.getStartX(), cubicaw3.getStartY(), cubicaw3.getControlX1(), cubicaw3.getControlY1()
                            ,cubicaw3.getControlX2(), cubicaw3.getControlY2(), cubicaw3.getEndX(), cubicaw3.getEndY());
                    
                    negritaw3.setLayoutX(64);
                    negritaw3.setLayoutY(63);
                    negritaw3.setFill(Color.TRANSPARENT);
                    negritaw3.setStroke(dibujar.getColor());
                    negritaw3.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaw3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaw3.setTranslateX(1);
                    
                    CubicCurve negritaw3_2 = new CubicCurve(cubicaw3.getStartX(), cubicaw3.getStartY(), cubicaw3.getControlX1(), cubicaw3.getControlY1()
                            ,cubicaw3.getControlX2(), cubicaw3.getControlY2(), cubicaw3.getEndX(), cubicaw3.getEndY());
                    
                    negritaw3_2.setLayoutX(64);
                    negritaw3_2.setLayoutY(63);
                    negritaw3_2.setFill(Color.TRANSPARENT);
                    negritaw3_2.setStroke(dibujar.getColor());
                    negritaw3_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaw3_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaw3_2.setTranslateY(1);
                    
                    CubicCurve negritaw4 = new CubicCurve(cubicaw4.getStartX(), cubicaw4.getStartY(), cubicaw4.getControlX1(), cubicaw4.getControlY1()
                            ,cubicaw4.getControlX2(), cubicaw4.getControlY2(), cubicaw4.getEndX(), cubicaw4.getEndY());
                    
                    negritaw4.setLayoutX(13.89);
                    negritaw4.setLayoutY(23);
                    negritaw4.setFill(Color.TRANSPARENT);
                    negritaw4.setStroke(dibujar.getColor());
                    negritaw4.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaw4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaw4.setTranslateX(1);
                    
                    CubicCurve negritaw4_2 = new CubicCurve(cubicaw4.getStartX(), cubicaw4.getStartY(), cubicaw4.getControlX1(), cubicaw4.getControlY1()
                            ,cubicaw4.getControlX2(), cubicaw4.getControlY2(), cubicaw4.getEndX(), cubicaw4.getEndY());
                    
                    negritaw4_2.setLayoutX(13.89);
                    negritaw4_2.setLayoutY(23);
                    negritaw4_2.setFill(Color.TRANSPARENT);
                    negritaw4_2.setStroke(dibujar.getColor());
                    negritaw4_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaw4_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaw4_2.setTranslateY(1);
                    
                    fondo.getChildren().addAll(negritaw1, negritaw1_2, negritaw2, negritaw2_2, negritaw3, negritaw3_2, negritaw4, negritaw4_2);
                }
                
                if (palabra.isS()){
                    Line subw = new Line();
                    subw.setStartX(19);
                    subw.setLayoutX(0);
                    subw.setLayoutY(55);
                    subw.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subw);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                    Circle pw1_1 = new Circle(cubicaw1.getStartX(), cubicaw1.getStartY(), 2, Color.RED);
                    pw1_1.setLayoutX(88.2);
                    pw1_1.setLayoutY(60);
                    Circle pw1_2 = new Circle(cubicaw1.getControlX1(), cubicaw1.getControlY1(), 2, Color.RED);
                    pw1_2.setLayoutX(88.2);
                    pw1_2.setLayoutY(60);
                    Circle pw1_3 = new Circle(cubicaw1.getControlX2(), cubicaw1.getControlY2(), 2, Color.RED);
                    pw1_3.setLayoutX(88.2);
                    pw1_3.setLayoutY(60);
                    Circle pw1_4 = new Circle(cubicaw1.getEndX(), cubicaw1.getEndY(), 2, Color.RED);
                    pw1_4.setLayoutX(88.2);
                    pw1_4.setLayoutY(60);
                    
                    Circle pw2_1 = new Circle(cubicaw2.getStartX(), cubicaw2.getStartY(), 2, Color.RED);
                    pw2_1.setLayoutX(8.5);
                    pw2_1.setLayoutY(23);
                    Circle pw2_2 = new Circle(cubicaw2.getControlX1(), cubicaw2.getControlY1(), 2, Color.RED);
                    pw2_2.setLayoutX(8.5);
                    pw2_2.setLayoutY(23);
                    Circle pw2_3 = new Circle(cubicaw2.getControlX2(), cubicaw2.getControlY2(), 2, Color.RED);
                    pw2_3.setLayoutX(8.5);
                    pw2_3.setLayoutY(23);
                    Circle pw2_4 = new Circle(cubicaw2.getEndX(), cubicaw2.getEndY(), 2, Color.RED);
                    pw2_4.setLayoutX(8.5);
                    pw2_4.setLayoutY(23);
                    
                    Circle pw3_1 = new Circle(cubicaw3.getStartX(), cubicaw3.getStartY(), 2, Color.RED);
                    pw3_1.setLayoutX(64);
                    pw3_1.setLayoutY(63);
                    Circle pw3_2 = new Circle(cubicaw3.getControlX1(), cubicaw3.getControlY1(), 2, Color.RED);
                    pw3_2.setLayoutX(64);
                    pw3_2.setLayoutY(63);
                    Circle pw3_3 = new Circle(cubicaw3.getControlX2(), cubicaw3.getControlY2(), 2, Color.RED);
                    pw3_3.setLayoutX(64);
                    pw3_3.setLayoutY(63);
                    Circle pw3_4 = new Circle(cubicaw3.getEndX(), cubicaw3.getEndY(), 2, Color.RED);
                    pw3_4.setLayoutX(64);
                    pw3_4.setLayoutY(63);
                    
                    Circle pw4_1 = new Circle(cubicaw4.getStartX(), cubicaw4.getStartY(), 2, Color.RED);
                    pw4_1.setLayoutX(13.89);
                    pw4_1.setLayoutY(23);
                    Circle pw4_2 = new Circle(cubicaw4.getControlX1(), cubicaw4.getControlY1(), 2, Color.RED);
                    pw4_2.setLayoutX(13.89);
                    pw4_2.setLayoutY(23);
                    Circle pw4_3 = new Circle(cubicaw4.getControlX2(), cubicaw4.getControlY2(), 2, Color.RED);
                    pw4_3.setLayoutX(13.89);
                    pw4_3.setLayoutY(23);
                    Circle pw4_4 = new Circle(cubicaw4.getEndX(), cubicaw4.getEndY(), 2, Color.RED);
                    pw4_4.setLayoutX(13.89);
                    pw4_4.setLayoutY(23);
                    
                    fondo.getChildren().addAll(pw1_1, pw1_2, pw1_3, pw1_4, pw2_1, pw2_2, pw2_3, pw2_4, pw3_1, pw3_2, pw3_3, pw3_4, pw4_1, pw4_2, pw4_3, pw4_4);
                }
                
                 fondo.getChildren().addAll(cubicaw1, cubicaw2, cubicaw3, cubicaw4);
                return fondo;
            case 'x':
                CubicCurve cubicax1 = new CubicCurve(-8.5, 22.4, -4.29, 30, 1.52, 2.30, 5.7, 2.67);
                CubicCurve cubicax2 = new CubicCurve(-11.29, 2.9, -6.79, 0.98, -3.9, 29.19, 3.5, 22.19);
                fondo.setPrefSize(19, 60);
                //Cubica
                cubicax1.setLayoutX(8.5);
                cubicax1.setLayoutY(23);
                cubicax1.setFill(Color.TRANSPARENT);
                cubicax1.setStroke(dibujar.getColor());
                cubicax1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicax1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubicax2.setLayoutX(13.89);
                cubicax2.setLayoutY(23.5);
                cubicax2.setFill(Color.TRANSPARENT);
                cubicax2.setStroke(dibujar.getColor());
                cubicax2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicax2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    CubicCurve negritax1 = new CubicCurve(cubicax1.getStartX(), cubicax1.getStartY(), cubicax1.getControlX1(), cubicax1.getControlY1()
                            ,cubicax1.getControlX2(), cubicax1.getControlY2(), cubicax1.getEndX(), cubicax1.getEndY());
                    
                    negritax1.setLayoutX(8.5);
                    negritax1.setLayoutY(23);
                    negritax1.setFill(Color.TRANSPARENT);
                    negritax1.setStroke(dibujar.getColor());
                    negritax1.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritax1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritax1.setTranslateX(1);
                    
                    CubicCurve negritax1_2 = new CubicCurve(cubicax1.getStartX(), cubicax1.getStartY(), cubicax1.getControlX1(), cubicax1.getControlY1()
                            ,cubicax1.getControlX2(), cubicax1.getControlY2(), cubicax1.getEndX(), cubicax1.getEndY());
                    
                    negritax1_2.setLayoutX(8.5);
                    negritax1_2.setLayoutY(23);
                    negritax1_2.setFill(Color.TRANSPARENT);
                    negritax1_2.setStroke(dibujar.getColor());
                    negritax1_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritax1_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritax1_2.setTranslateY(1);
                    
                    CubicCurve negritax2 = new CubicCurve(cubicax2.getStartX(), cubicax2.getStartY(), cubicax2.getControlX1(), cubicax2.getControlY1()
                            ,cubicax2.getControlX2(), cubicax2.getControlY2(), cubicax2.getEndX(), cubicax2.getEndY());
                    
                    negritax2.setLayoutX(13.89);
                    negritax2.setLayoutY(23.5);
                    negritax2.setFill(Color.TRANSPARENT);
                    negritax2.setStroke(dibujar.getColor());
                    negritax2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritax2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritax2.setTranslateX(1);
                    
                    CubicCurve negritax2_2 = new CubicCurve(cubicax2.getStartX(), cubicax2.getStartY(), cubicax2.getControlX1(), cubicax2.getControlY1()
                            ,cubicax2.getControlX2(), cubicax2.getControlY2(), cubicax2.getEndX(), cubicax2.getEndY());
                    
                    negritax2_2.setLayoutX(13.89);
                    negritax2_2.setLayoutY(23.5);
                    negritax2_2.setFill(Color.TRANSPARENT);
                    negritax2_2.setStroke(dibujar.getColor());
                    negritax2_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritax2_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritax2_2.setTranslateY(1);
                    
                    fondo.getChildren().addAll(negritax1, negritax1_2, negritax2, negritax2_2);
                }
                
                if (palabra.isS()){
                    Line subx = new Line();
                    subx.setStartX(19);
                    subx.setLayoutX(0);
                    subx.setLayoutY(55);
                    subx.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subx);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                    Circle px1_1 = new Circle(cubicax1.getStartX(), cubicax1.getStartY(), 2, Color.RED);
                    px1_1.setLayoutX(8.5);
                    px1_1.setLayoutY(23);
                    Circle px1_2 = new Circle(cubicax1.getControlX1(), cubicax1.getControlY1(), 2, Color.RED);
                    px1_2.setLayoutX(8.5);
                    px1_2.setLayoutY(23);
                    Circle px1_3 = new Circle(cubicax1.getControlX2(), cubicax1.getControlY2(), 2, Color.RED);
                    px1_3.setLayoutX(8.5);
                    px1_3.setLayoutY(23);
                    Circle px1_4 = new Circle(cubicax1.getEndX(), cubicax1.getEndY(), 2, Color.RED);
                    px1_4.setLayoutX(8.5);
                    px1_4.setLayoutY(23);
                    
                    Circle px2_1 = new Circle(cubicax2.getStartX(), cubicax2.getStartY(), 2, Color.RED);
                    px2_1.setLayoutX(13.89);
                    px2_1.setLayoutY(23.5);
                    Circle px2_2 = new Circle(cubicax2.getControlX1(), cubicax2.getControlY1(), 2, Color.RED);
                    px2_2.setLayoutX(13.89);
                    px2_2.setLayoutY(23.5);
                    Circle px2_3 = new Circle(cubicax2.getControlX2(), cubicax2.getControlY2(), 2, Color.RED);
                    px2_3.setLayoutX(13.89);
                    px2_3.setLayoutY(23.5);
                    Circle px2_4 = new Circle(cubicax2.getEndX(), cubicax2.getEndY(), 2, Color.RED);
                    px2_4.setLayoutX(13.89);
                    px2_4.setLayoutY(23.5);
                    
                    fondo.getChildren().addAll(px1_1, px1_2, px1_3, px1_4, px2_1, px2_2, px2_3, px2_4);
                }
                
                fondo.getChildren().addAll(cubicax1, cubicax2);
                return fondo;
            case 'y':
                CubicCurve cubicay1 = new CubicCurve(-6.5, 6.19, -10.5, 28, 4.9, 28, 1.5, 6.19);
                CubicCurve cubicay2 = new CubicCurve(-52.79, -2.91, -55.39, 10.59, -40.2, -0.2, -42.39, -23.8);
                CubicCurve cubicay3 = new CubicCurve(-56.89, -17, -53.79, -27.14, -45.43, -27.14, -42.5, -33.8);
                CubicCurve cubicay4 = new CubicCurve(-61.99, -37.2, -61.84, -41.9, -66.39, -41.8, -64, -23.39);
                fondo.setPrefSize(19, 60);
                //Cubica
                cubicay1.setLayoutX(10.5);
                cubicay1.setLayoutY(19);
                cubicay1.setFill(Color.TRANSPARENT);
                cubicay1.setStroke(dibujar.getColor());
                cubicay1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicay1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubicay2.setLayoutX(55);
                cubicay2.setLayoutY(55);
                cubicay2.setFill(Color.TRANSPARENT);
                cubicay2.setStroke(dibujar.getColor());
                cubicay2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicay2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 3
                cubicay3.setLayoutX(59);
                cubicay3.setLayoutY(69);
                cubicay3.setFill(Color.TRANSPARENT);
                cubicay3.setStroke(dibujar.getColor());
                cubicay3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicay3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica 4
                cubicay4.setLayoutX(66.2);
                cubicay4.setLayoutY(63);
                cubicay4.setFill(Color.TRANSPARENT);
                cubicay4.setStroke(dibujar.getColor());
                cubicay4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicay4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    CubicCurve negritay1 = new CubicCurve(cubicay1.getStartX(), cubicay1.getStartY(), cubicay1.getControlX1(), cubicay1.getControlY1()
                            ,cubicay1.getControlX2(), cubicay1.getControlY2(), cubicay1.getEndX(), cubicay1.getEndY());
                    
                    negritay1.setLayoutX(10.5);
                    negritay1.setLayoutY(19);
                    negritay1.setFill(Color.TRANSPARENT);
                    negritay1.setStroke(dibujar.getColor());
                    negritay1.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritay1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritay1.setTranslateX(1);
                    
                    CubicCurve negritay1_2 = new CubicCurve(cubicay1.getStartX(), cubicay1.getStartY(), cubicay1.getControlX1(), cubicay1.getControlY1()
                            ,cubicay1.getControlX2(), cubicay1.getControlY2(), cubicay1.getEndX(), cubicay1.getEndY());
                    
                    negritay1_2.setLayoutX(10.5);
                    negritay1_2.setLayoutY(19);
                    negritay1_2.setFill(Color.TRANSPARENT);
                    negritay1_2.setStroke(dibujar.getColor());
                    negritay1_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritay1_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritay1_2.setTranslateY(1);
                    
                    CubicCurve negritay2 = new CubicCurve(cubicay2.getStartX(), cubicay2.getStartY(), cubicay2.getControlX1(), cubicay2.getControlY1()
                            ,cubicay2.getControlX2(), cubicay2.getControlY2(), cubicay2.getEndX(), cubicay2.getEndY());
                    
                    negritay2.setLayoutX(55);
                    negritay2.setLayoutY(55);
                    negritay2.setFill(Color.TRANSPARENT);
                    negritay2.setStroke(dibujar.getColor());
                    negritay2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritay2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritay2.setTranslateX(1);
                    
                    CubicCurve negritay2_2 = new CubicCurve(cubicay2.getStartX(), cubicay2.getStartY(), cubicay2.getControlX1(), cubicay2.getControlY1()
                            ,cubicay2.getControlX2(), cubicay2.getControlY2(), cubicay2.getEndX(), cubicay2.getEndY());
                    
                    negritay2_2.setLayoutX(55);
                    negritay2_2.setLayoutY(55);
                    negritay2_2.setFill(Color.TRANSPARENT);
                    negritay2_2.setStroke(dibujar.getColor());
                    negritay2_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritay2_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritay2_2.setTranslateY(1);
                    
                    CubicCurve negritay3 = new CubicCurve(cubicay3.getStartX(), cubicay3.getStartY(), cubicay3.getControlX1(), cubicay3.getControlY1()
                            ,cubicay3.getControlX2(), cubicay3.getControlY2(), cubicay3.getEndX(), cubicay3.getEndY());
                    
                    negritay3.setLayoutX(59);
                    negritay3.setLayoutY(69);
                    negritay3.setFill(Color.TRANSPARENT);
                    negritay3.setStroke(dibujar.getColor());
                    negritay3.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritay3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritay3.setTranslateX(1);
                    
                    CubicCurve negritay3_2 = new CubicCurve(cubicay3.getStartX(), cubicay3.getStartY(), cubicay3.getControlX1(), cubicay3.getControlY1()
                            ,cubicay3.getControlX2(), cubicay3.getControlY2(), cubicay3.getEndX(), cubicay3.getEndY());
                    
                    negritay3_2.setLayoutX(59);
                    negritay3_2.setLayoutY(69);
                    negritay3_2.setFill(Color.TRANSPARENT);
                    negritay3_2.setStroke(dibujar.getColor());
                    negritay3_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritay3_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritay3_2.setTranslateY(1);
                    
                    CubicCurve negritay4 = new CubicCurve(cubicay4.getStartX(), cubicay4.getStartY(), cubicay4.getControlX1(), cubicay4.getControlY1()
                            ,cubicay4.getControlX2(), cubicay4.getControlY2(), cubicay4.getEndX(), cubicay4.getEndY());
                    
                    negritay4.setLayoutX(66.2);
                    negritay4.setLayoutY(63);
                    negritay4.setFill(Color.TRANSPARENT);
                    negritay4.setStroke(dibujar.getColor());
                    negritay4.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritay4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritay4.setTranslateX(1);
                    
                    CubicCurve negritay4_2 = new CubicCurve(cubicay4.getStartX(), cubicay4.getStartY(), cubicay4.getControlX1(), cubicay4.getControlY1()
                            ,cubicay4.getControlX2(), cubicay4.getControlY2(), cubicay4.getEndX(), cubicay4.getEndY());
                    
                    negritay4_2.setLayoutX(66.2);
                    negritay4_2.setLayoutY(63);
                    negritay4_2.setFill(Color.TRANSPARENT);
                    negritay4_2.setStroke(dibujar.getColor());
                    negritay4_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritay4_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritay4_2.setTranslateY(1);
                    
                    fondo.getChildren().addAll(negritay1, negritay1_2, negritay2, negritay2_2, negritay3, negritay3_2, negritay4, negritay4_2);
                }
                
                if (palabra.isS()){
                    Line suby = new Line();
                    suby.setStartX(19);
                    suby.setLayoutX(0);
                    suby.setLayoutY(55);
                    suby.setStroke(dibujar.getColor());
                    fondo.getChildren().add(suby);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                    Circle py1_1 = new Circle(cubicay1.getStartX(), cubicay1.getStartY(), 2, Color.RED);
                    py1_1.setLayoutX(10.5);
                    py1_1.setLayoutY(19);
                    Circle py1_2 = new Circle(cubicay1.getControlX1(), cubicay1.getControlY1(), 2, Color.RED);
                    py1_2.setLayoutX(10.5);
                    py1_2.setLayoutY(19);
                    Circle py1_3 = new Circle(cubicay1.getControlX2(), cubicay1.getControlY2(), 2, Color.RED);
                    py1_3.setLayoutX(10.5);
                    py1_3.setLayoutY(19);
                    Circle py1_4 = new Circle(cubicay1.getEndX(), cubicay1.getEndY(), 2, Color.RED);
                    py1_4.setLayoutX(10.5);
                    py1_4.setLayoutY(19);
                    
                    Circle py2_1 = new Circle(cubicay2.getStartX(), cubicay2.getStartY(), 2, Color.RED);
                    py2_1.setLayoutX(55);
                    py2_1.setLayoutY(55);
                    Circle py2_2 = new Circle(cubicay2.getControlX1(), cubicay2.getControlY1(), 2, Color.RED);
                    py2_2.setLayoutX(55);
                    py2_2.setLayoutY(55);
                    Circle py2_3 = new Circle(cubicay2.getControlX2(), cubicay2.getControlY2(), 2, Color.RED);
                    py2_3.setLayoutX(55);
                    py2_3.setLayoutY(55);
                    Circle py2_4 = new Circle(cubicay2.getEndX(), cubicay2.getEndY(), 2, Color.RED);
                    py2_4.setLayoutX(55);
                    py2_4.setLayoutY(55);
                    
                    Circle py3_1 = new Circle(cubicay3.getStartX(), cubicay3.getStartY(), 2, Color.RED);
                    py3_1.setLayoutX(59);
                    py3_1.setLayoutY(69);
                    Circle py3_2 = new Circle(cubicay3.getControlX1(), cubicay3.getControlY1(), 2, Color.RED);
                    py3_2.setLayoutX(59);
                    py3_2.setLayoutY(69);
                    Circle py3_3 = new Circle(cubicay3.getControlX2(), cubicay3.getControlY2(), 2, Color.RED);
                    py3_3.setLayoutX(59);
                    py3_3.setLayoutY(69);
                    Circle py3_4 = new Circle(cubicay3.getEndX(), cubicay3.getEndY(), 2, Color.RED);
                    py3_4.setLayoutX(59);
                    py3_4.setLayoutY(69);
                    
                    Circle py4_1 = new Circle(cubicay4.getStartX(), cubicay4.getStartY(), 2, Color.RED);
                    py4_1.setLayoutX(66.2);
                    py4_1.setLayoutY(63);
                    Circle py4_2 = new Circle(cubicay4.getControlX1(), cubicay4.getControlY1(), 2, Color.RED);
                    py4_2.setLayoutX(66.2);
                    py4_2.setLayoutY(63);
                    Circle py4_3 = new Circle(cubicay4.getControlX2(), cubicay4.getControlY2(), 2, Color.RED);
                    py4_3.setLayoutX(66.2);
                    py4_3.setLayoutY(63);
                    Circle py4_4 = new Circle(cubicay4.getEndX(), cubicay4.getEndY(), 2, Color.RED);
                    py4_4.setLayoutX(66.2);
                    py4_4.setLayoutY(66);
                    
                    fondo.getChildren().addAll(py1_1, py1_2, py1_3, py1_4, py2_1, py2_2, py2_3, py2_4, py3_1, py3_2, py3_3, py3_4, py4_1, py4_2, py4_3, py4_4);
                }
                
                fondo.getChildren().addAll(cubicay1, cubicay2, cubicay3, cubicay4);
                return fondo;
            case 'z':
                CubicCurve cubicaz1 = new CubicCurve(-6.9, 6, -0.9, -5.99, 14.5, -2, -0.9, 9);
                CubicCurve cubicaz2 = new CubicCurve(-52.79, -2.91, -55.39, 10.59, -46.2, -2.91, -41, -15.8);
                CubicCurve cubicaz3 = new CubicCurve(-56.89, -17, -52.14, -32.34, -45.79, -20.4, -40.59, -29.2);
                CubicCurve cubicaz4 = new CubicCurve(-8.29, 7.04, -14.62, 8.2, 3.9, -0.59, -3.5, 12);
                fondo.setPrefSize(19, 60);
                //Cubica
                cubicaz1.setLayoutX(8.5);
                cubicaz1.setLayoutY(28);
                cubicaz1.setFill(Color.TRANSPARENT);
                cubicaz1.setStroke(dibujar.getColor());
                cubicaz1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaz1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica 2
                cubicaz2.setLayoutX(54);
                cubicaz2.setLayoutY(55);
                cubicaz2.setFill(Color.TRANSPARENT);
                cubicaz2.setStroke(dibujar.getColor());
                cubicaz2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaz2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubic 3
                cubicaz3.setLayoutX(58);
                cubicaz3.setLayoutY(69);
                cubicaz3.setFill(Color.TRANSPARENT);
                cubicaz3.setStroke(dibujar.getColor());
                cubicaz3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaz3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //cubica4
                cubicaz4.setLayoutX(15.5);
                cubicaz4.setLayoutY(30);
                cubicaz4.setFill(Color.TRANSPARENT);
                cubicaz4.setStroke(dibujar.getColor());
                cubicaz4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaz4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    CubicCurve negritaz1 = new CubicCurve(cubicaz1.getStartX(), cubicaz1.getStartY(), cubicaz1.getControlX1(), cubicaz1.getControlY1()
                            ,cubicaz1.getControlX2(), cubicaz1.getControlY2(), cubicaz1.getEndX(), cubicaz1.getEndY());
                    
                    negritaz1.setLayoutX(8.5);
                    negritaz1.setLayoutY(28);
                    negritaz1.setFill(Color.TRANSPARENT);
                    negritaz1.setStroke(dibujar.getColor());
                    negritaz1.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaz1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaz1.setTranslateX(1);
                    
                    CubicCurve negritaz1_2 = new CubicCurve(cubicaz1.getStartX(), cubicaz1.getStartY(), cubicaz1.getControlX1(), cubicaz1.getControlY1()
                            ,cubicaz1.getControlX2(), cubicaz1.getControlY2(), cubicaz1.getEndX(), cubicaz1.getEndY());
                    
                    negritaz1_2.setLayoutX(8.5);
                    negritaz1_2.setLayoutY(28);
                    negritaz1_2.setFill(Color.TRANSPARENT);
                    negritaz1_2.setStroke(dibujar.getColor());
                    negritaz1_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaz1_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaz1_2.setTranslateY(1);
                    
                    CubicCurve negritaz2 = new CubicCurve(cubicaz2.getStartX(), cubicaz2.getStartY(), cubicaz2.getControlX1(), cubicaz2.getControlY1()
                            ,cubicaz2.getControlX2(), cubicaz2.getControlY2(), cubicaz2.getEndX(), cubicaz2.getEndY());
                    
                    negritaz2.setLayoutX(54);
                    negritaz2.setLayoutY(55);
                    negritaz2.setFill(Color.TRANSPARENT);
                    negritaz2.setStroke(dibujar.getColor());
                    negritaz2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaz2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaz2.setTranslateX(1);
                    
                    CubicCurve negritaz2_2 = new CubicCurve(cubicaz2.getStartX(), cubicaz2.getStartY(), cubicaz2.getControlX1(), cubicaz2.getControlY1()
                            ,cubicaz2.getControlX2(), cubicaz2.getControlY2(), cubicaz2.getEndX(), cubicaz2.getEndY());
                    
                    negritaz2_2.setLayoutX(54);
                    negritaz2_2.setLayoutY(55);
                    negritaz2_2.setFill(Color.TRANSPARENT);
                    negritaz2_2.setStroke(dibujar.getColor());
                    negritaz2_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaz2_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaz2_2.setTranslateY(1);
                    
                    CubicCurve negritaz3 = new CubicCurve(cubicaz3.getStartX(), cubicaz3.getStartY(), cubicaz3.getControlX1(), cubicaz3.getControlY1()
                            ,cubicaz3.getControlX2(), cubicaz3.getControlY2(), cubicaz3.getEndX(), cubicaz3.getEndY());
                    
                    negritaz3.setLayoutX(58);
                    negritaz3.setLayoutY(69);
                    negritaz3.setFill(Color.TRANSPARENT);
                    negritaz3.setStroke(dibujar.getColor());
                    negritaz3.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaz3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaz3.setTranslateX(1);
                    
                    CubicCurve negritaz3_2 = new CubicCurve(cubicaz3.getStartX(), cubicaz3.getStartY(), cubicaz3.getControlX1(), cubicaz3.getControlY1()
                            ,cubicaz3.getControlX2(), cubicaz3.getControlY2(), cubicaz3.getEndX(), cubicaz3.getEndY());
                    
                    negritaz3_2.setLayoutX(58);
                    negritaz3_2.setLayoutY(69);
                    negritaz3_2.setFill(Color.TRANSPARENT);
                    negritaz3_2.setStroke(dibujar.getColor());
                    negritaz3_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaz3_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaz3_2.setTranslateY(1);
                    
                    CubicCurve negritaz4 = new CubicCurve(cubicaz4.getStartX(), cubicaz4.getStartY(), cubicaz4.getControlX1(), cubicaz4.getControlY1()
                            ,cubicaz4.getControlX2(), cubicaz4.getControlY2(), cubicaz4.getEndX(), cubicaz4.getEndY());
                    
                    negritaz4.setLayoutX(15.5);
                    negritaz4.setLayoutY(30);
                    negritaz4.setFill(Color.TRANSPARENT);
                    negritaz4.setStroke(dibujar.getColor());
                    negritaz4.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaz4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaz4.setTranslateX(1);
                    
                    CubicCurve negritaz4_2 = new CubicCurve(cubicaz4.getStartX(), cubicaz4.getStartY(), cubicaz4.getControlX1(), cubicaz4.getControlY1()
                            ,cubicaz4.getControlX2(), cubicaz4.getControlY2(), cubicaz4.getEndX(), cubicaz4.getEndY());
                    
                    negritaz4_2.setLayoutX(15.5);
                    negritaz4_2.setLayoutY(30);
                    negritaz4_2.setFill(Color.TRANSPARENT);
                    negritaz4_2.setStroke(dibujar.getColor());
                    negritaz4_2.setStrokeLineCap(StrokeLineCap.ROUND);
                    negritaz4_2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                    negritaz4_2.setTranslateY(1);
                    
                    fondo.getChildren().addAll(negritaz1, negritaz1_2, negritaz2, negritaz2_2, negritaz3, negritaz3_2, negritaz4, negritaz4_2);
                }
                
                if (palabra.isS()){
                    Line subz = new Line();
                    subz.setStartX(19);
                    subz.setLayoutX(0);
                    subz.setLayoutY(55);
                    subz.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subz);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                    Circle pz1_1 = new Circle(cubicaz1.getStartX(), cubicaz1.getStartY(), 2, Color.RED);
                    pz1_1.setLayoutX(8.5);
                    pz1_1.setLayoutY(28);
                    Circle pz1_2 = new Circle(cubicaz1.getControlX1(), cubicaz1.getControlY1(), 2, Color.RED);
                    pz1_2.setLayoutX(8.5);
                    pz1_2.setLayoutY(28);
                    Circle pz1_3 = new Circle(cubicaz1.getControlX2(), cubicaz1.getControlY2(), 2, Color.RED);
                    pz1_3.setLayoutX(8.5);
                    pz1_3.setLayoutY(28);
                    Circle pz1_4 = new Circle(cubicaz1.getEndX(), cubicaz1.getEndY(), 2, Color.RED);
                    pz1_4.setLayoutX(8.5);
                    pz1_4.setLayoutY(28);
                    
                    Circle pz2_1 = new Circle(cubicaz2.getStartX(), cubicaz2.getStartY(), 2, Color.RED);
                    pz2_1.setLayoutX(54);
                    pz2_1.setLayoutY(55);
                    Circle pz2_2 = new Circle(cubicaz2.getControlX1(), cubicaz2.getControlY1(), 2, Color.RED);
                    pz2_2.setLayoutX(54);
                    pz2_2.setLayoutY(55);
                    Circle pz2_3 = new Circle(cubicaz2.getControlX2(), cubicaz2.getControlY2(), 2, Color.RED);
                    pz2_3.setLayoutX(54);
                    pz2_3.setLayoutY(55);
                    Circle pz2_4 = new Circle(cubicaz2.getEndX(), cubicaz2.getEndY(), 2, Color.RED);
                    pz2_4.setLayoutX(54);
                    pz2_4.setLayoutY(55);
                    
                    Circle pz3_1 = new Circle(cubicaz3.getStartX(), cubicaz3.getStartY(), 2, Color.RED);
                    pz3_1.setLayoutX(58);
                    pz3_1.setLayoutY(69);
                    Circle pz3_2 = new Circle(cubicaz3.getControlX1(), cubicaz3.getControlY1(), 2, Color.RED);
                    pz3_2.setLayoutX(58);
                    pz3_2.setLayoutY(69);
                    Circle pz3_3 = new Circle(cubicaz3.getControlX2(), cubicaz3.getControlY2(), 2, Color.RED);
                    pz3_3.setLayoutX(58);
                    pz3_3.setLayoutY(69);
                    Circle pz3_4 = new Circle(cubicaz3.getEndX(), cubicaz3.getEndY(), 2, Color.RED);
                    pz3_4.setLayoutX(58);
                    pz3_4.setLayoutY(69);
                    
                    Circle pz4_1 = new Circle(cubicaz4.getStartX(), cubicaz4.getStartY(), 2, Color.RED);
                    pz4_1.setLayoutX(15.5);
                    pz4_1.setLayoutY(30);
                    Circle pz4_2 = new Circle(cubicaz4.getControlX1(), cubicaz4.getControlY1(), 2, Color.RED);
                    pz4_2.setLayoutX(15.5);
                    pz4_2.setLayoutY(30);
                    Circle pz4_3 = new Circle(cubicaz4.getControlX2(), cubicaz4.getControlY2(), 2, Color.RED);
                    pz4_3.setLayoutX(15.5);
                    pz4_3.setLayoutY(30);
                    Circle pz4_4 = new Circle(cubicaz4.getEndX(), cubicaz4.getEndY(), 2, Color.RED);
                    pz4_4.setLayoutX(15.5);
                    pz4_4.setLayoutY(30);
                    
                    fondo.getChildren().addAll(pz1_1, pz1_2, pz1_3, pz1_4, pz2_1, pz2_2, pz2_3, pz2_4, pz3_1, pz3_2, pz3_3, pz3_4, pz4_1, pz4_2, pz4_3, pz4_4);
                }
                
                fondo.getChildren().addAll(cubicaz1, cubicaz2, cubicaz3, cubicaz4);
                return fondo;
            case ' ':
                
                return fondo;
            case '!':
                Ellipse elipse = new Ellipse(1, 20);
                Circle circulo = new Circle(3, dibujar.getColor());
                
                fondo.setPrefSize(19, 60);

                //Elipse
                elipse.setFill(dibujar.getColor());
                elipse.setStroke(dibujar.getColor());
                elipse.setLayoutX(11);
                elipse.setLayoutY(24);
                //Circulo
                circulo.setLayoutX(11);
                circulo.setLayoutY(50);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subExclamacionInicial = new Line();
                    subExclamacionInicial.setStartX(34);
                    subExclamacionInicial.setLayoutX(0);
                    subExclamacionInicial.setLayoutY(55);
                    subExclamacionInicial.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subExclamacionInicial);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(elipse, circulo);
                return fondo;
            case '¡':
                Ellipse elipse1 = new Ellipse(1, 20);
                Circle circulo1 = new Circle(3, dibujar.getColor());
                
                fondo.setPrefSize(19, 60);
                
                //Elipse
                elipse1.setFill(dibujar.getColor());
                elipse1.setStroke(dibujar.getColor());
                elipse1.setLayoutX(11);
                elipse1.setLayoutY(32);
                //Circulo
                circulo1.setLayoutX(11);
                circulo1.setLayoutY(5);
                fondo.getChildren().addAll(elipse1, circulo1);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subExclamacionFinal = new Line();
                    subExclamacionFinal.setStartX(34);
                    subExclamacionFinal.setLayoutX(0);
                    subExclamacionFinal.setLayoutY(55);
                    subExclamacionFinal.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subExclamacionFinal);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                return fondo;
            case '¿':
                CubicCurve cubica = new CubicCurve(13.33, -25.19, -18.66, -36.79, -18.66, -0.47, 13.33, -7.46);
                Line linea1 = new Line(3.8, -13., 3.8, 7.8);
                Circle circulo2 = new Circle(3, dibujar.getColor());
                fondo.setPrefSize(34, 60);
                //Cubica
                cubica.setLayoutX(12);
                cubica.setLayoutY(59);
                cubica.setFill(Color.TRANSPARENT);
                cubica.setStroke(dibujar.getColor());
                cubica.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea
                linea1.setLayoutX(21);
                linea1.setLayoutY(25);
                linea1.setFill(Color.TRANSPARENT);
                linea1.setStroke(dibujar.getColor());
                linea1.setStrokeLineCap(StrokeLineCap.ROUND);
                linea1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Circulo
                circulo2.setLayoutX(25);
                circulo2.setLayoutY(6);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subInterrogacionInicial = new Line();
                    subInterrogacionInicial.setStartX(34);
                    subInterrogacionInicial.setLayoutX(0);
                    subInterrogacionInicial.setLayoutY(55);
                    subInterrogacionInicial.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subInterrogacionInicial);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(cubica, linea1, circulo2);
                return fondo;
            case '?':
                CubicCurve cubica1 = new CubicCurve(13.33, -24.19, 36.19, -35.93, 36.19, 4.59, 13.33, -4.46);
                Line linea2 = new Line(3.8, -13, 3.8, 7.8);
                Circle circulo3 = new Circle(3, dibujar.getColor());
                fondo.setPrefSize(34, 60);
                //Cubica
                cubica1.setLayoutX(-7);
                cubica1.setLayoutY(29);
                cubica1.setFill(Color.TRANSPARENT);
                cubica1.setStroke(dibujar.getColor());
                cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea
                linea2.setLayoutX(2);
                linea2.setLayoutY(37);
                linea2.setFill(Color.TRANSPARENT);
                linea2.setStroke(dibujar.getColor());
                linea2.setStrokeLineCap(StrokeLineCap.ROUND);
                linea2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Circulo
                circulo3.setLayoutX(6);
                circulo3.setLayoutY(51);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subInterrogacionFinal = new Line();
                    subInterrogacionFinal.setStartX(34);
                    subInterrogacionFinal.setLayoutX(0);
                    subInterrogacionFinal.setLayoutY(55);
                    subInterrogacionFinal.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subInterrogacionFinal);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(cubica1, linea2, circulo3);
                return fondo;
            case '.':
                Circle circulo4 = new Circle(3, dibujar.getColor());
                //Atributos del fondo
                fondo.setPrefSize(22, 60);
                //Circulo
                circulo4.setLayoutX(9);
                circulo4.setLayoutY(47);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subPunto = new Line();
                    subPunto.setStartX(22);
                    subPunto.setLayoutX(0);
                    subPunto.setLayoutY(55);
                    subPunto.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subPunto);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(circulo4);
                return fondo;
            case ',':
                Circle circulo5 = new Circle(3, dibujar.getColor());
                QuadCurve cuadratica = new QuadCurve(-9.39, -20.59, -5.8, -25.4, -7.62, -31);
                fondo.setPrefSize(22, 60);
                //Circulo
                circulo5.setLayoutX(9);
                circulo5.setLayoutY(47);
                //Cuadratica
                cuadratica.setLayoutX(18);
                cuadratica.setLayoutY(77);
                cuadratica.setFill(Color.TRANSPARENT);
                cuadratica.setStroke(dibujar.getColor());
                cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
                cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subComa = new Line();
                    subComa.setStartX(22);
                    subComa.setLayoutX(0);
                    subComa.setLayoutY(55);
                    subComa.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subComa);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(circulo5, cuadratica);
                return fondo;
            case ';':
                Circle circulo6 = new Circle(3, dibujar.getColor());
                Circle circulo7 = new Circle(3, dibujar.getColor());
                QuadCurve cuadratica1 = new QuadCurve(-9.39, -20.59, -5.8, -25.4, -7.62, -31);
                fondo.setPrefSize(22, 60);
                //Circulo
                circulo6.setLayoutX(9);
                circulo6.setLayoutY(34);
                //Circulo2
                circulo7.setLayoutX(9);
                circulo7.setLayoutY(47);
                //Cuadratica
                cuadratica1.setLayoutX(18);
                cuadratica1.setLayoutY(77);
                cuadratica1.setControlX(-5.8);
                cuadratica1.setControlY(-25.4);
                cuadratica1.setFill(Color.TRANSPARENT);
                cuadratica1.setStroke(dibujar.getColor());
                cuadratica1.setStrokeLineCap(StrokeLineCap.ROUND);
                cuadratica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subPuntoyComa = new Line();
                    subPuntoyComa.setStartX(22);
                    subPuntoyComa.setLayoutX(0);
                    subPuntoyComa.setLayoutY(55);
                    subPuntoyComa.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subPuntoyComa);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(circulo6, cuadratica1, circulo7);
                return fondo;
            case ':':
                Circle circulo8 = new Circle(3, dibujar.getColor());
                Circle circulo9 = new Circle(3, dibujar.getColor());
                fondo.setPrefSize(22, 60);
                //Circulo
                circulo8.setLayoutX(9);
                circulo8.setLayoutY(34);
                //Circulo2
                circulo9.setLayoutX(9);
                circulo9.setLayoutY(47);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subDosPuntos = new Line();
                    subDosPuntos.setStartX(22);
                    subDosPuntos.setLayoutX(0);
                    subDosPuntos.setLayoutY(55);
                    subDosPuntos.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subDosPuntos);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(circulo8, circulo9);
                return fondo;
            case '(':
                QuadCurve cubica2 = new QuadCurve(-6.6, 1.8, -29.3, -25.8, -6.59, -50);
                fondo.setPrefSize(22, 60);
                //Cubica
                cubica2.setLayoutX(20);
                cubica2.setLayoutY(51);
                cubica2.setFill(Color.TRANSPARENT);
                cubica2.setStroke(dibujar.getColor());
                cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subParentesisInicial = new Line();
                    subParentesisInicial.setStartX(22);
                    subParentesisInicial.setLayoutX(0);
                    subParentesisInicial.setLayoutY(55);
                    subParentesisInicial.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subParentesisInicial);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(cubica2);
                return fondo;
            case ')':
                QuadCurve cubica3 = new QuadCurve(-6.6, 1.8, 14.6, -25, -6.59, -50);
                fondo.setPrefSize(22, 60);
                //Cubica
                cubica3.setLayoutX(9);
                cubica3.setLayoutY(51);
                cubica3.setFill(Color.TRANSPARENT);
                cubica3.setStroke(dibujar.getColor());
                cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subParentesisFinal = new Line();
                    subParentesisFinal.setStartX(22);
                    subParentesisFinal.setLayoutX(0);
                    subParentesisFinal.setLayoutY(55);
                    subParentesisFinal.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subParentesisFinal);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(cubica3);
                return fondo;
            case '[':
                Line linea3 = new Line(-13.69, -24.59, -13.69, 21.39);
                Line linea4 = new Line(-9.19, -19.6, 8.8, -19.6);
                Line linea5 = new Line(-9.19, -19.6, 8.8, -19.6);
                fondo.setPrefSize(34, 60);
                //Linea Vertical
                linea3.setLayoutX(18);
                linea3.setLayoutY(29);
                linea3.setFill(Color.TRANSPARENT);
                linea3.setStroke(dibujar.getColor());
                linea3.setStrokeLineCap(StrokeLineCap.ROUND);
                linea3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea Superior
                linea4.setLayoutX(14);
                linea4.setLayoutY(24);
                linea4.setFill(Color.TRANSPARENT);
                linea4.setStroke(dibujar.getColor());
                linea4.setStrokeLineCap(StrokeLineCap.ROUND);
                linea4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea Inferior
                linea5.setLayoutX(14);
                linea5.setLayoutY(70);
                linea5.setFill(Color.TRANSPARENT);
                linea5.setStroke(dibujar.getColor());
                linea5.setStrokeLineCap(StrokeLineCap.ROUND);
                linea5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subCorcheteInicial = new Line();
                    subCorcheteInicial.setStartX(34);
                    subCorcheteInicial.setLayoutX(0);
                    subCorcheteInicial.setLayoutY(55);
                    subCorcheteInicial.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subCorcheteInicial);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(linea3, linea4, linea5);
                return fondo;
            case ']':
                Line linea6 = new Line(-13.7, -24.59, -13.69, 21.39);
                Line linea7 = new Line(-9.19, -19.6, 8.8, -19.6);
                Line linea8 = new Line(-9.19, -19.6, 8.8, -19.6);
                fondo.setPrefSize(34, 60);
                //Linea Vertical
                linea6.setLayoutX(44);
                linea6.setLayoutY(29);
                linea6.setFill(Color.TRANSPARENT);
                linea6.setStroke(dibujar.getColor());
                linea6.setStrokeLineCap(StrokeLineCap.ROUND);
                linea6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea Superior
                linea7.setLayoutX(21);
                linea7.setLayoutY(24);
                linea7.setFill(Color.TRANSPARENT);
                linea7.setStroke(dibujar.getColor());
                linea7.setStrokeLineCap(StrokeLineCap.ROUND);
                linea7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea Inferior
                linea8.setLayoutX(21);
                linea8.setLayoutY(70);
                linea8.setFill(Color.TRANSPARENT);
                linea8.setStroke(dibujar.getColor());
                linea8.setStrokeLineCap(StrokeLineCap.ROUND);
                linea8.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subCorcheteFinal = new Line();
                    subCorcheteFinal.setStartX(34);
                    subCorcheteFinal.setLayoutX(0);
                    subCorcheteFinal.setLayoutY(55);
                    subCorcheteFinal.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subCorcheteFinal);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(linea6, linea7, linea8);
                return fondo;
            case '{':
                CubicCurve cubica4 = new CubicCurve(-0.2, 2, 17, 1, -0.2, -24.6, 17, -24.6);
                CubicCurve cubica5 = new CubicCurve(13.59, 10.59, -4.2, 10.58, 13.59, -14, -4.2, -14);
                fondo.setPrefSize(34, 60);
                //Cubica superior
                cubica4.setLayoutX(4);
                cubica4.setLayoutY(26);
                cubica4.setFill(Color.TRANSPARENT);
                cubica4.setStroke(dibujar.getColor());
                cubica4.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica Inferior
                cubica5.setLayoutX(7);
                cubica5.setLayoutY(42);
                cubica5.setFill(Color.TRANSPARENT);
                cubica5.setStroke(dibujar.getColor());
                cubica5.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica5.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subLlaveInicial = new Line();
                    subLlaveInicial.setStartX(34);
                    subLlaveInicial.setLayoutX(0);
                    subLlaveInicial.setLayoutY(55);
                    subLlaveInicial.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subLlaveInicial);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(cubica4, cubica5);
                return fondo;
            case '}':
                CubicCurve cubica6 = new CubicCurve(11.08, 15, -8.12, 15, 11.08, -11.4, -9.39, -11.4);
                CubicCurve cubica7 = new CubicCurve(-11, 20.39, 8.21, 20.39, -11, -4.86, 8.21, -4.86);
                fondo.setPrefSize(34, 60);
                //Cubica superior
                cubica6.setLayoutX(11);
                cubica6.setLayoutY(13);
                cubica6.setFill(Color.TRANSPARENT);
                cubica6.setStroke(dibujar.getColor());
                cubica6.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica6.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cubica Inferior
                cubica7.setLayoutX(14);
                cubica7.setLayoutY(33);
                cubica7.setFill(Color.TRANSPARENT);
                cubica7.setStroke(dibujar.getColor());
                cubica7.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica7.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subLlaveFinal = new Line();
                    subLlaveFinal.setStartX(34);
                    subLlaveFinal.setLayoutX(0);
                    subLlaveFinal.setLayoutY(55);
                    subLlaveFinal.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subLlaveFinal);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(cubica6, cubica7);
                return fondo;
            case '-':
                Line linea9 = new Line(-14, 5, 14, 5);
                fondo.setPrefSize(34, 60);
                linea9.setLayoutX(17);
                linea9.setLayoutY(24);
                linea9.setFill(Color.TRANSPARENT);
                linea9.setStroke(dibujar.getColor());
                linea9.setStrokeLineCap(StrokeLineCap.ROUND);
                linea9.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subGuion = new Line();
                    subGuion.setStartX(34);
                    subGuion.setLayoutX(0);
                    subGuion.setLayoutY(55);
                    subGuion.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subGuion);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(linea9);
                return fondo;
            case '_':
                Line linea10 = new Line(-10, 5, 15.2, 5);      
                fondo.setPrefSize(34, 60);
                linea10.setLayoutX(13);
                linea10.setLayoutY(44);
                linea10.setFill(Color.TRANSPARENT);
                linea10.setStroke(dibujar.getColor());
                linea10.setStrokeLineCap(StrokeLineCap.ROUND);
                linea10.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subGuionBajo = new Line();
                    subGuionBajo.setStartX(34);
                    subGuionBajo.setLayoutX(0);
                    subGuionBajo.setLayoutY(55);
                    subGuionBajo.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subGuionBajo);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(linea10);
                return fondo;
            case 39:
                Circle circulo10 = new Circle(2, dibujar.getColor());
                QuadCurve cuadratica2 = new QuadCurve(-4.8, -23, -7.62, -26, -7.62, -31);
                fondo.setPrefSize(22, 60);
                //Circulo
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
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subComillaSimple = new Line();
                    subComillaSimple.setStartX(22);
                    subComillaSimple.setLayoutX(0);
                    subComillaSimple.setLayoutY(55);
                    subComillaSimple.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subComillaSimple);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(circulo10, cuadratica2);
                return fondo;
            case '"':
                Circle circulo11 = new Circle(2, dibujar.getColor());
                QuadCurve cuadratica3 = new QuadCurve(-4.8, -23, -7.62, -26, -7.62, -31);
                Circle circulo12 = new Circle(2, dibujar.getColor());
                QuadCurve cuadratica4 = new QuadCurve(-4.8, -23, -7.62, -26, -7.62, -31);
                fondo.setPrefSize(22, 60);
                //Circulo
                circulo11.setLayoutX(6);
                circulo11.setLayoutY(5);
                //Circulo2
                circulo12.setLayoutX(12);
                circulo12.setLayoutY(5);
                //Cuadratica
                cuadratica3.setLayoutX(12);
                cuadratica3.setLayoutY(36);
                cuadratica3.setFill(Color.TRANSPARENT);
                cuadratica3.setStroke(dibujar.getColor());
                cuadratica3.setStrokeLineCap(StrokeLineCap.ROUND);
                cuadratica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Cuadratica2
                cuadratica4.setLayoutX(18);
                cuadratica4.setLayoutY(36);
                cuadratica4.setFill(Color.TRANSPARENT);
                cuadratica4.setStroke(dibujar.getColor());
                cuadratica4.setStrokeLineCap(StrokeLineCap.ROUND);
                cuadratica4.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subComillaDoble = new Line();
                    subComillaDoble.setStartX(22);
                    subComillaDoble.setLayoutX(0);
                    subComillaDoble.setLayoutY(55);
                    subComillaDoble.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subComillaDoble);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(circulo11, cuadratica3, circulo12, cuadratica4);
                return fondo;
            case '«':
                Line linea11 = new Line(-9.19, 0, 4, -9);
                Line linea12 = new Line(-9.19, 0, 4, 9);
                Line linea13 = new Line(-9.19, 0, 4, -9);
                Line linea14 = new Line(-9.19, 0, 4, 9);
                fondo.setPrefSize(34, 60);
                //Linea 1
                linea11.setLayoutX(11);
                linea11.setLayoutY(31);
                linea11.setFill(Color.TRANSPARENT);
                linea11.setStroke(dibujar.getColor());
                linea11.setStrokeLineCap(StrokeLineCap.ROUND);
                linea11.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea 2
                linea12.setLayoutX(11);
                linea12.setLayoutY(31);
                linea12.setFill(Color.TRANSPARENT);
                linea12.setStroke(dibujar.getColor());
                linea12.setStrokeLineCap(StrokeLineCap.ROUND);
                linea12.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea 3
                linea13.setLayoutX(21);
                linea13.setLayoutY(31);
                linea13.setFill(Color.TRANSPARENT);
                linea13.setStroke(dibujar.getColor());
                linea13.setStrokeLineCap(StrokeLineCap.ROUND);
                linea13.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea 4
                linea14.setLayoutX(21);
                linea14.setLayoutY(31);
                linea14.setFill(Color.TRANSPARENT);
                linea14.setStroke(dibujar.getColor());
                linea14.setStrokeLineCap(StrokeLineCap.ROUND);
                linea14.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subComillaE1 = new Line();
                    subComillaE1.setStartX(34);
                    subComillaE1.setLayoutX(0);
                    subComillaE1.setLayoutY(55);
                    subComillaE1.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subComillaE1);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
                fondo.getChildren().addAll(linea11, linea12, linea13, linea14);
                return fondo;
            case '»':
                Line linea15 = new Line(7, 0, -4, -9);
                Line linea16 = new Line(7, 0, -4, 9);
                Line linea17 = new Line(7, 0, -4, -9);
                Line linea18 = new Line(7, 0, -4, 9);
                fondo.setPrefSize(34, 60);
                //Linea 1
                linea15.setLayoutX(9);
                linea15.setLayoutY(31);
                linea15.setFill(Color.TRANSPARENT);
                linea15.setStroke(dibujar.getColor());
                linea15.setStrokeLineCap(StrokeLineCap.ROUND);
                linea15.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea 2
                linea16.setLayoutX(9);
                linea16.setLayoutY(31);
                linea16.setFill(Color.TRANSPARENT);
                linea16.setStroke(dibujar.getColor());
                linea16.setStrokeLineCap(StrokeLineCap.ROUND);
                linea16.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea 3
                linea17.setLayoutX(19);
                linea17.setLayoutY(31);
                linea17.setFill(Color.TRANSPARENT);
                linea17.setStroke(dibujar.getColor());
                linea17.setStrokeLineCap(StrokeLineCap.ROUND);
                linea17.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Linea 4
                linea18.setLayoutX(19);
                linea18.setLayoutY(31);
                linea18.setFill(Color.TRANSPARENT);
                linea18.setStroke(dibujar.getColor());
                linea18.setStrokeLineCap(StrokeLineCap.ROUND);
                linea18.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    //FALTA IMPLEMENTAR
                }
                
                if (palabra.isN()){
                    //
                }
                
                if (palabra.isS()){
                    Line subComillaE2 = new Line();
                    subComillaE2.setStartX(34);
                    subComillaE2.setLayoutX(0);
                    subComillaE2.setLayoutY(55);
                    subComillaE2.setStroke(dibujar.getColor());
                    fondo.getChildren().add(subComillaE2);
                }
                
                if (dibujar.getControl()){
                    //Puntos de control
                }
                
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