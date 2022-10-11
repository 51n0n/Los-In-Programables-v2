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
import javafx.scene.shape.Ellipse;

public class CrearCaracteres {
    
    public AnchorPane dibujarCaracter(char caracter){
        
        AnchorPane fondo = new AnchorPane();
        
        switch (caracter){
            case 'A':
                //Objetos
                Line lineaA = new Line();
                CubicCurve cubicaA1 = new CubicCurve();
                CubicCurve cubicaA2= new CubicCurve();
                
                //Atributos del Fondo
                fondo.setPrefHeight(60.0);//y
                fondo.setPrefWidth(45.0);//x
                
                //Atributos Lineas
                cubicaA1.setLayoutX(41);
                cubicaA1.setLayoutY(44);
                cubicaA1.setStartX(-1.2);
                cubicaA1.setStartY(4.79);
                cubicaA1.setEndX(-4.88);
                cubicaA1.setEndY(-35.8);
                cubicaA1.setControlX1(-11.6);
                cubicaA1.setControlY1(11.39);
                cubicaA1.setControlX2(-14.39);
                cubicaA1.setControlY2(-14.2);
                cubicaA1.setFill(Color.TRANSPARENT);
                cubicaA1.setStroke(getColor());
                cubicaA1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaA1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                lineaA.setLayoutX(29.0);
                lineaA.setLayoutY(27.0);
                lineaA.setStartX(-12.5);
                lineaA.setStartY(0);
                lineaA.setEndX(0);
                lineaA.setEndY(0);
                lineaA.setFill(Color.TRANSPARENT);
                lineaA.setStroke(getColor());
                lineaA.setStrokeLineCap(StrokeLineCap.ROUND);
                lineaA.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                cubicaA2.setLayoutX(33);
                cubicaA2.setLayoutY(29);
                cubicaA2.setStartX(-33);
                cubicaA2.setStartY(16.39);
                cubicaA2.setEndX(3.79);
                cubicaA2.setEndY(-21.95);
                cubicaA2.setControlX1(-27.60);
                cubicaA2.setControlY1(38);
                cubicaA2.setControlX2(-17.39);
                cubicaA2.setControlY2(-17);
                cubicaA2.setFill(Color.TRANSPARENT);
                cubicaA2.setStroke(getColor());
                cubicaA2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaA2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                fondo.getChildren().addAll(cubicaA1,cubicaA2,lineaA);
                return fondo;
            case 'B':
                
                return fondo;
            case 'C':
                
                return fondo;
            case 'D':
                
                return fondo;
            case 'E':
                
                return fondo;
            case 'F':
                
                return fondo;
            case 'G':
                
                return fondo;
            case 'H':
                
                return fondo;
            case 'I':
                
                return fondo;
            case 'J':
                
                return fondo;
            case 'K':
                
                return fondo;
            case 'L':
                
                return fondo;
            case 'M':
                
                return fondo;
            case 'N':
                
                return fondo;
            case 'Ñ':
                
                return fondo;
            case 'O':
                
                return fondo;
            case 'P':
                
                return fondo;
            case 'Q':
                
                return fondo;
            case 'R':
                
                return fondo;
            case 'S':
                
                return fondo;
            case 'T':
                
                return fondo;
            case 'U':
                
                return fondo;
            case 'V':
                
                return fondo;
            case 'W':
                
                return fondo;
            case 'X':
                
                return fondo;
            case 'Y':
                
                return fondo;
            case 'Z':
                
                return fondo;
            case 'a':
                CubicCurve cubicaa= new CubicCurve();
                CubicCurve cubicaa1 = new CubicCurve();
                CubicCurve cubicaa2 = new CubicCurve();
                fondo.setPrefSize(19,60);

                //primerabase
                cubicaa.setLayoutX(39.0);
                cubicaa.setLayoutY(38.0);
                cubicaa.setStartX(-29.79);
                cubicaa.setStartY(-33.8);
                cubicaa.setEndX(-27.19);
                cubicaa.setEndY(6.0);
                cubicaa.setControlX1(-40.59);
                cubicaa.setControlY1(2.4);
                cubicaa.setControlX2(-39.0);
                cubicaa.setControlY2(10.79);
                cubicaa.setFill(Color.TRANSPARENT);
                cubicaa.setStroke(getColor());
                cubicaa.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaa.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //curva 
                cubicaa1.setLayoutX(50);
                cubicaa1.setLayoutY(56.5);
                cubicaa1.setStartX(-45.39);
                cubicaa1.setStartY(-25.3);
                cubicaa1.setEndX(-38.07);
                cubicaa1.setEndY(-12.9);
                cubicaa1.setControlX1(-38.07);
                cubicaa1.setControlY1(-27.03);
                cubicaa1.setControlX2(-31.20);
                cubicaa1.setControlY2(-20.95);
                cubicaa1.setFill(Color.TRANSPARENT);
                cubicaa1.setStroke(getColor());
                cubicaa1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaa1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //unioaan
                cubicaa2.setLayoutX(40.0);
                cubicaa2.setLayoutY(58.0);
                cubicaa2.setStartX(-35.0);
                cubicaa2.setStartY(-26.5);
                cubicaa2.setEndX(-22.19);
                cubicaa2.setEndY(-26.5);
                cubicaa2.setControlX1(-39.04);
                cubicaa2.setControlY1(-24.08);
                cubicaa2.setControlX2(-30.37);
                cubicaa2.setControlY2(-20.68);
                cubicaa2.setFill(Color.TRANSPARENT);
                cubicaa2.setStroke(getColor());
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
                cubicab.setStroke(getColor());
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
                cubicab1.setStroke(getColor());
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
                cubicab2.setStroke(getColor());
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
                cubicac.setStroke(getColor());
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
                cubicac1.setStroke(getColor());
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
                cubicad.setStroke(getColor());
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
                cubicad1.setStroke(getColor());
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
                cubicad2.setStroke(getColor());
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
                cubicae.setStroke(getColor());
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
                cubicae1.setStroke(getColor());
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
                cubicaf.setStroke(getColor());
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
                cubicaf1.setStroke(getColor());
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
                cubicaf2.setStroke(getColor());
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
                cubicag.setStroke(getColor());
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
                cubicag1.setStroke(getColor());
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
                cubicag2.setStroke(getColor());
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
                cubicag3.setStroke(getColor());
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
                cubicah.setStroke(getColor());
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
                cubicah1.setStroke(getColor());
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
                cubicah2.setStroke(getColor());
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
                cubicai.setStroke(getColor());
                cubicai.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicai.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Circulo
                circuloi.setRadius(1);
                circuloi.setFill(getColor());
                circuloi.setStroke(getColor());
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
                cubicaj.setStroke(getColor());
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
                cubicaj1.setStroke(getColor());
                cubicaj1.setStrokeLineCap(StrokeLineCap.ROUND);
                cubicaj1.setStrokeLineJoin(StrokeLineJoin.ROUND);
                //Circulo
                circuloj.setRadius(1);
                circuloj.setFill(getColor());
                circuloj.setStroke(getColor());
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
                cubicak.setStroke(getColor());
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
                cubicak1.setStroke(getColor());
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
                cubicak2.setStroke(getColor());
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
                cubical1.setStroke(getColor());
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
                cubical2.setStroke(getColor());
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
                cubicam1.setStroke(getColor());
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
                cubicam2.setStroke(getColor());
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
                cubicam3.setStroke(getColor());
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
                cubicam4.setStroke(getColor());
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
                cubican1.setStroke(getColor());
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
                cubican2.setStroke(getColor());
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
                cubican3.setStroke(getColor());
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
                cubicañ1.setStroke(getColor());
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
                cubicañ2.setStroke(getColor());
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
                cubicañ3.setStroke(getColor());
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
                cubicañ4.setStroke(getColor());
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
                cubicao1.setStroke(getColor());
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
                cubicao2.setStroke(getColor());
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
                cubicao3.setStroke(getColor());
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
                cubicap1.setStroke(getColor());
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
                cubicap2.setStroke(getColor());
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
                cubicap3.setStroke(getColor());
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
                cubicaq1.setStroke(getColor());
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
                cubicaq2.setStroke(getColor());
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
                cubicaq3.setStroke(getColor());
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
                cubicar1.setStroke(getColor());
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
                cubicar2.setStroke(getColor());
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
                cubicar3.setStroke(getColor());
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
                cubicas1.setStroke(getColor());
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
                cubicas2.setStroke(getColor());
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
                cubicas3.setStroke(getColor());
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
                cubicas4.setStroke(getColor());
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
                cubicat1.setStroke(getColor());
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
                cubicat2.setStroke(getColor());
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
                lineat1.setStroke(getColor());
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
                cubicau1.setStroke(getColor());
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
                cubicau2.setStroke(getColor());
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
                cubicav1.setStroke(getColor());
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
                cubicav2.setStroke(getColor());
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
                cubicav3.setStroke(getColor());
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
                cubicaw1.setStroke(getColor());
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
                cubicaw2.setStroke(getColor());
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
                cubicaw3.setStroke(getColor());
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
                cubicaw4.setStroke(getColor());
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
                cubicax1.setStroke(getColor());
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
                cubicax2.setStroke(getColor());
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
                cubicay1.setStroke(getColor());
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
                cubicay2.setStroke(getColor());
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
                cubicay3.setStroke(getColor());
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
                cubicay4.setStroke(getColor());
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
                cubicaz1.setStroke(getColor());
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
                cubicaz2.setStroke(getColor());
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
                cubicaz3.setStroke(getColor());
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
                cubicaz4.setStroke(getColor());
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
                elipse.setFill(getColor());
                elipse.setStroke(getColor());
                elipse.setLayoutX(11);
                elipse.setLayoutY(24);

                //Circulo
                circulo.setRadius(2);
                circulo.setFill(getColor());
                circulo.setStroke(getColor());
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
                elipse1.setFill(getColor());
                elipse1.setStroke(getColor());
                elipse1.setLayoutX(11);
                elipse1.setLayoutY(32);

                //Circulo
                circulo1.setRadius(2);
                circulo1.setFill(getColor());
                circulo1.setStroke(getColor());
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
                cubica.setStroke(getColor());
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
                linea1.setStroke(getColor());
                linea1.setStrokeLineCap(StrokeLineCap.ROUND);
                linea1.setStrokeLineJoin(StrokeLineJoin.ROUND);

                //Circulo
                circulo2.setRadius(3);
                circulo2.setFill(getColor());
                circulo2.setStroke(getColor());
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
                cubica1.setStroke(getColor());
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
                linea2.setStroke(getColor());
                linea2.setStrokeLineCap(StrokeLineCap.ROUND);
                linea2.setStrokeLineJoin(StrokeLineJoin.ROUND);

                //Circulo
                circulo3.setRadius(3);
                circulo3.setFill(getColor());
                circulo3.setStroke(getColor());
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
                circulo4.setFill(getColor());
                circulo4.setStroke(getColor());
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
                circulo5.setFill(getColor());
                circulo5.setStroke(getColor());
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
                cuadratica.setStroke(getColor());
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
                circulo6.setFill(getColor());
                circulo6.setStroke(getColor());
                circulo6.setLayoutX(9);
                circulo6.setLayoutY(34);

                //Circulo2
                circulo7.setRadius(2);
                circulo7.setFill(getColor());
                circulo7.setStroke(getColor());
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
                cuadratica1.setStroke(getColor());
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
                circulo8.setFill(getColor());
                circulo8.setStroke(getColor());
                circulo8.setLayoutX(9);
                circulo8.setLayoutY(34);

                //Circulo2
                circulo9.setRadius(2);
                circulo9.setFill(getColor());
                circulo9.setStroke(getColor());
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
                cubica2.setStroke(getColor());
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
                cubica3.setStroke(getColor());
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
                linea3.setStroke(getColor());
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
                linea4.setStroke(getColor());
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
                linea5.setStroke(getColor());
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
                linea6.setStroke(getColor());
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
                linea7.setStroke(getColor());
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
                linea8.setStroke(getColor());
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
                cubica4.setStroke(getColor());
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
                cubica5.setStroke(getColor());
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
                cubica6.setStroke(getColor());
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
                cubica7.setStroke(getColor());
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
                linea9.setStroke(getColor());
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
                linea10.setStroke(getColor());
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
                circulo10.setFill(getColor());
                circulo10.setStroke(getColor());
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
                cuadratica2.setStroke(getColor());
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
                circulo11.setFill(getColor());
                circulo11.setStroke(getColor());
                circulo11.setLayoutX(6);
                circulo11.setLayoutY(5);

                //Circulo2
                circulo12.setRadius(2);
                circulo12.setFill(getColor());
                circulo12.setStroke(getColor());
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
                cuadratica3.setStroke(getColor());
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
                cuadratica4.setStroke(getColor());
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
                linea11.setStroke(getColor());
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
                linea12.setStroke(getColor());
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
                linea13.setStroke(getColor());
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
                linea14.setStroke(getColor());
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
                linea15.setStroke(getColor());
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
                linea16.setStroke(getColor());
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
                linea17.setStroke(getColor());
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
                linea18.setStroke(getColor());
                linea18.setStrokeLineCap(StrokeLineCap.ROUND);
                linea18.setStrokeLineJoin(StrokeLineJoin.ROUND);

                fondo.getChildren().addAll(linea15, linea16, linea17, linea18);
                return fondo;
            case '^':
                // Se debe hacer diseño de nuevo símbolo
                return fondo;
            default:
                return null;
        }
    }

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
        circulo.setRadius(2);
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(9);
        circulo.setLayoutY(47);
        
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
        circulo.setRadius(2);
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(9);
        circulo.setLayoutY(34);
        
        //Circulo2
        circulo2.setRadius(2);
        circulo2.setFill(getColor());
        circulo2.setStroke(getColor());
        circulo2.setLayoutX(9);
        circulo2.setLayoutY(47);
        
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
        circulo.setRadius(2);
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(9);
        circulo.setLayoutY(34);
        
        //Circulo2
        circulo2.setRadius(2);
        circulo2.setFill(getColor());
        circulo2.setStroke(getColor());
        circulo2.setLayoutX(9);
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
        circulo.setLayoutX(9);
        circulo.setLayoutY(5);
        
        //Cuadratica
        cuadratica.setLayoutX(15);
        cuadratica.setLayoutY(36);
        cuadratica.setStartX(-4.8);
        cuadratica.setStartY(-23);
        cuadratica.setEndX(-7.62);
        cuadratica.setEndY(-31);
        cuadratica.setControlX(-7.62);
        cuadratica.setControlY(-26);
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
        circulo.setLayoutX(6);
        circulo.setLayoutY(5);
        
        //Circulo2
        circulo2.setRadius(2);
        circulo2.setFill(getColor());
        circulo2.setStroke(getColor());
        circulo2.setLayoutX(12);
        circulo2.setLayoutY(5);
        
        //Cuadratica
        cuadratica.setLayoutX(12);
        cuadratica.setLayoutY(36);
        cuadratica.setStartX(-4.8);
        cuadratica.setStartY(-23);
        cuadratica.setEndX(-7.62);
        cuadratica.setEndY(-31);
        cuadratica.setControlX(-7.62);
        cuadratica.setControlY(-26);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(getColor());
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Cuadratica2
        cuadratica2.setLayoutX(18);
        cuadratica2.setLayoutY(36);
        cuadratica2.setStartX(-4.8);
        cuadratica2.setStartY(-23);
        cuadratica2.setEndX(-7.62);
        cuadratica2.setEndY(-31);
        cuadratica2.setControlX(-7.62);
        cuadratica2.setControlY(-26);
        cuadratica2.setFill(Color.TRANSPARENT);
        cuadratica2.setStroke(getColor());
        cuadratica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(circulo, cuadratica, circulo2, cuadratica2);
        return fondo;
    }
    public AnchorPane crear_ComillasEspañolaInicio(){
        AnchorPane fondo = new AnchorPane();
        Line linea = new Line();
        Line linea2 = new Line();
        Line linea3 = new Line();
        Line linea4 = new Line();
        
        fondo.setPrefSize(34, 60);
        
        //Linea 1
        linea.setLayoutX(11);
        linea.setLayoutY(31);
        linea.setStartX(-9.19);
        linea.setStartY(0);
        linea.setEndX(4);
        linea.setEndY(-9);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(getColor());
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea 2
        linea2.setLayoutX(11);
        linea2.setLayoutY(31);
        linea2.setStartX(-9.19);
        linea2.setStartY(0);
        linea2.setEndX(4);
        linea2.setEndY(9);
        linea2.setFill(Color.TRANSPARENT);
        linea2.setStroke(getColor());
        linea2.setStrokeLineCap(StrokeLineCap.ROUND);
        linea2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea 3
        linea3.setLayoutX(21);
        linea3.setLayoutY(31);
        linea3.setStartX(-9.19);
        linea3.setStartY(0);
        linea3.setEndX(4);
        linea3.setEndY(-9);
        linea3.setFill(Color.TRANSPARENT);
        linea3.setStroke(getColor());
        linea3.setStrokeLineCap(StrokeLineCap.ROUND);
        linea3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea 4
        linea4.setLayoutX(21);
        linea4.setLayoutY(31);
        linea4.setStartX(-9.19);
        linea4.setStartY(0);
        linea4.setEndX(4);
        linea4.setEndY(9);
        linea4.setFill(Color.TRANSPARENT);
        linea4.setStroke(getColor());
        linea4.setStrokeLineCap(StrokeLineCap.ROUND);
        linea4.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(linea, linea2, linea3, linea4);
        return fondo;
    }
    public AnchorPane crear_ComillasEspañolaFinal(){
        AnchorPane fondo = new AnchorPane();
        Line linea = new Line();
        Line linea2 = new Line();
        Line linea3 = new Line();
        Line linea4 = new Line();
        
        fondo.setPrefSize(34, 60);
        
        //Linea 1
        linea.setLayoutX(9);
        linea.setLayoutY(31);
        linea.setStartX(7);
        linea.setStartY(0);
        linea.setEndX(-4);
        linea.setEndY(-9);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(getColor());
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea 2
        linea2.setLayoutX(9);
        linea2.setLayoutY(31);
        linea2.setStartX(7);
        linea2.setStartY(0);
        linea2.setEndX(-4);
        linea2.setEndY(9);
        linea2.setFill(Color.TRANSPARENT);
        linea2.setStroke(getColor());
        linea2.setStrokeLineCap(StrokeLineCap.ROUND);
        linea2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea 3
        linea3.setLayoutX(19);
        linea3.setLayoutY(31);
        linea3.setStartX(7);
        linea3.setStartY(0);
        linea3.setEndX(-4);
        linea3.setEndY(-9);
        linea3.setFill(Color.TRANSPARENT);
        linea3.setStroke(getColor());
        linea3.setStrokeLineCap(StrokeLineCap.ROUND);
        linea3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea 4
        linea4.setLayoutX(19);
        linea4.setLayoutY(31);
        linea4.setStartX(7);
        linea4.setStartY(0);
        linea4.setEndX(-4);
        linea4.setEndY(9);
        linea4.setFill(Color.TRANSPARENT);
        linea4.setStroke(getColor());
        linea4.setStrokeLineCap(StrokeLineCap.ROUND);
        linea4.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(linea, linea2, linea3, linea4);
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
        linea.setLayoutX(44);
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
        linea2.setLayoutX(21);
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
        linea3.setLayoutX(21);
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
        
        linea.setLayoutX(17);
        linea.setLayoutY(25);
        linea.setStartX(-14);
        linea.setStartY(5);
        linea.setEndX(14);
        linea.setEndY(5);
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
        
        linea.setLayoutX(13);
        linea.setLayoutY(50);
        linea.setStartX(-10);
        linea.setStartY(5);
        linea.setEndX(15.2);
        linea.setEndY(5);
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
    public AnchorPane crear_exclamacionFinal(){
        AnchorPane fondo = new AnchorPane();
        Ellipse elipse = new Ellipse();
        Circle circulo = new Circle();
        
        //Elipse
        elipse.setRadiusX(1);
        elipse.setRadiusY(20);
        elipse.setFill(getColor());
        elipse.setStroke(getColor());
        elipse.setLayoutX(11);
        elipse.setLayoutY(24);
        
        //Circulo
        circulo.setRadius(2);
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(11);
        circulo.setLayoutY(50);
        
        fondo.getChildren().addAll(elipse, circulo);
        return fondo;
    }
    public AnchorPane crear_exclamacionInicial(){
        AnchorPane fondo = new AnchorPane();
        Ellipse elipse = new Ellipse();
        Circle circulo = new Circle();
        
        //Elipse
        elipse.setRadiusX(1);
        elipse.setRadiusY(20);
        elipse.setFill(getColor());
        elipse.setStroke(getColor());
        elipse.setLayoutX(11);
        elipse.setLayoutY(32);
        
        //Circulo
        circulo.setRadius(2);
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(11);
        circulo.setLayoutY(5);
        
        fondo.getChildren().addAll(elipse, circulo);
        return fondo;
    } 
// minusculas
    public AnchorPane crear_a(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica = new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve();
        fondo.setPrefSize(19, 60);
        // superior
        cubica.setLayoutX(35);
        cubica.setLayoutY(44);
        cubica.setStartX(-35.0);
        cubica.setStartY(-7.8);
        cubica.setEndX(-22.76);
        cubica.setEndY(-7.8);
        cubica.setControlX1(-37.0);
        cubica.setControlY1(5.17);
        cubica.setControlX2(-22.76);
        cubica.setControlY2(5.17);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //inferior
        cubica1.setLayoutX(36);
        cubica1.setLayoutY(42);
        cubica1.setStartX(-36.0);
        cubica1.setStartY(-6.54);
        cubica1.setEndX(-23.76);
        cubica1.setEndY(-6.54);
        cubica1.setControlX1(-33.59);
        cubica1.setControlY1(-19);
        cubica1.setControlX2(-23.76);
        cubica1.setControlY2(-21);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        // union
        cubica2.setLayoutX(45);
        cubica2.setLayoutY(42);
        cubica2.setStartX(-31.76);
        cubica2.setStartY(-15.4);
        cubica2.setEndX(-26.79);
        cubica2.setEndY(-3.59);
        cubica2.setControlX1(-35.2);
        cubica2.setControlY1(7.0);
        cubica2.setControlX2(-29.79);
        cubica2.setControlY2(7);
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
        fondo.setPrefSize(19,60);
        
        //primerabase
        cubica.setLayoutX(39.0);
        cubica.setLayoutY(38.0);
        cubica.setStartX(-29.79);
        cubica.setStartY(-33.8);
        cubica.setEndX(-27.19);
        cubica.setEndY(6.0);
        cubica.setControlX1(-40.59);
        cubica.setControlY1(2.4);
        cubica.setControlX2(-39.0);
        cubica.setControlY2(10.79);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //curva 
        cubica1.setLayoutX(50);
        cubica1.setLayoutY(56.5);
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
        cubica2.setLayoutY(58.0);
        cubica2.setStartX(-35.0);
        cubica2.setStartY(-26.5);
        cubica2.setEndX(-22.19);
        cubica2.setEndY(-26.5);
        cubica2.setControlX1(-39.04);
        cubica2.setControlY1(-24.08);
        cubica2.setControlX2(-30.37);
        cubica2.setControlY2(-20.68);
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
        fondo.setPrefSize(19,60);
        
        //primerabase
        cubica.setLayoutX(48);
        cubica.setLayoutY(48.898);
        cubica.setStartX(-43.60);
        cubica.setStartY(-5.8);
        cubica.setEndX(-32);
        cubica.setEndY(-11.69);
        cubica.setControlX1(-38.39);
        cubica.setControlY1(-0.8);
        cubica.setControlX2(-32);
        cubica.setControlY2(-5.8);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //curva
        cubica1.setLayoutX(42);
        cubica1.setLayoutY(41);
        cubica1.setStartX(-30.8);
        cubica1.setStartY(-14);
        cubica1.setEndX(-37.2);
        cubica1.setEndY(2.79);
        cubica1.setControlX1(-40.6);
        cubica1.setControlY1(-18.4);
        cubica1.setControlX2(-42.6);
        cubica1.setControlY2(-2.2);
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
        fondo.setPrefSize(19, 60);
        // superior
        cubica.setLayoutX(35);
        cubica.setLayoutY(42);
        cubica.setStartX(-35.8);
        cubica.setStartY(-6.54);
        cubica.setEndX(-23.76);
        cubica.setEndY(-6.54);
        cubica.setControlX1(-32.39);
        cubica.setControlY1(-20.8);
        cubica.setControlX2(-22);
        cubica.setControlY2(-20.8);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //inferior
        cubica1.setLayoutX(34);
        cubica1.setLayoutY(43);
        cubica1.setStartX(-34.6);
        cubica1.setStartY(-7.8);
        cubica1.setEndX(-22.76);
        cubica1.setEndY(-7.8);
        cubica1.setControlX1(-37.6);
        cubica1.setControlY1(7);
        cubica1.setControlX2(-22.76);
        cubica1.setControlY2(5.17);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        // union
        cubica2.setLayoutX(54);
        cubica2.setLayoutY(51);
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
        fondo.setPrefSize(19,60);
        
        //primerabase
        cubica.setLayoutX(40.5);
        cubica.setLayoutY(41);
        cubica.setStartX(-39.19);
        cubica.setStartY(-8);
        cubica.setEndX(-39.19);
        cubica.setEndY(-2.8);
        cubica.setControlX1(-36.39);
        cubica.setControlY1(-24.59);
        cubica.setControlX2(-21);
        cubica.setControlY2(-14.59);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //base union
        cubica1.setLayoutX(40.5);
        cubica1.setLayoutY(37);
        cubica1.setStartX(-38.59);
        cubica1.setStartY(-6.59);
        cubica1.setEndX(-28.06);
        cubica1.setEndY(0.59);
        cubica1.setControlX1(-43.39);
        cubica1.setControlY1(12.19);
        cubica1.setControlX2(-32.69);
        cubica1.setControlY2(10.59);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND); 
        fondo.getChildren().addAll(cubica,cubica1);
        return fondo;   
    }
    public AnchorPane crear_f(){   
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica= new CubicCurve();
        CubicCurve cubica1= new CubicCurve();
        CubicCurve cubica2= new CubicCurve();
        fondo.setPrefSize(19,60);
        
        //primera inferior
        cubica.setLayoutX(64.99);
        cubica.setLayoutY(59.0);
        cubica.setStartX(-60.78);
        cubica.setStartY(-14.8);
        cubica.setEndX(-60.78);
        cubica.setEndY(-23.0);
        cubica.setControlX1(-66.18);
        cubica.setControlY1(-79);
        cubica.setControlX2(-50.99);
        cubica.setControlY2(-53.59);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Linea inferior
        cubica1.setLayoutX(75);
        cubica1.setLayoutY(66);
        cubica1.setStartX(-70.60);
        cubica1.setStartY(-31.20);
        cubica1.setEndX(-70.60);
        cubica1.setEndY(-28.4);
        cubica1.setControlX1(-58.39);
        cubica1.setControlY1(-18);
        cubica1.setControlX2(-74.8);
        cubica1.setControlY2(13.2);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //linea media
        cubica2.setLayoutX(77.2);
        cubica2.setLayoutY(69.5);
        cubica2.setStartX(-63.2);
        cubica2.setStartY(-30.9);
        cubica2.setEndX(-72.33);
        cubica2.setEndY(-34.31);
        cubica2.setControlX1(-76.19);
        cubica2.setControlY1(-25.24);
        cubica2.setControlX2(-80.69);
        cubica2.setControlY2(-34.31);
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
        fondo.setPrefSize(19,60);
        //primerabase
        cubica.setLayoutX(35);
        cubica.setLayoutY(40);
        cubica.setStartX(-33.95);
        cubica.setStartY(-7.8);
        cubica.setEndX(-22.0);
        cubica.setEndY(-7.8);
        cubica.setControlX1(-37.5);
        cubica.setControlY1(3);
        cubica.setControlX2(-24.2);
        cubica.setControlY2(7);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //lateral
        cubica1.setLayoutX(56.2);
        cubica1.setLayoutY(57);
        cubica1.setStartX(-53.19);
        cubica1.setStartY(-5.8);
        cubica1.setEndX(-42.6);
        cubica1.setEndY(-36);
        cubica1.setControlX1(-55.39);
        cubica1.setControlY1(10.59);
        cubica1.setControlX2(-42.6);
        cubica1.setControlY2(-0.4);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //curva superior
        cubica2.setLayoutX(35.5);
        cubica2.setLayoutY(42);
        cubica2.setStartX(-34.94);
        cubica2.setStartY(-8.93);
        cubica2.setEndX(-23.39);
        cubica2.setEndY(-5.2);
        cubica2.setControlX1(-33.95);
        cubica2.setControlY1(-20.99);
        cubica2.setControlX2(-19.5);
        cubica2.setControlY2(-24.19);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND); 
        //union
        cubica3.setLayoutX(59.5);
        cubica3.setLayoutY(70);
        cubica3.setStartX(-56.89);
        cubica3.setStartY(-17);
        cubica3.setEndX(-42.5);
        cubica3.setEndY(-33.8);
        cubica3.setControlX1(-54.69);
        cubica3.setControlY1(-28.59);
        cubica3.setControlX2(-45.43);
        cubica3.setControlY2(-27.14);
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
        fondo.setPrefSize(19,60);
        
        //primera 
        cubica.setLayoutX(70.0);
        cubica.setLayoutY(51.0);
        cubica.setStartX(-67);
        cubica.setStartY(-4.4);
        cubica.setEndX(-70);
        cubica.setEndY(-8.59);
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
        cubica1.setEndX(-25.93);
        cubica1.setEndY(-6.2);
        cubica1.setControlX1(-34.6);
        cubica1.setControlY1(-19.39);
        cubica1.setControlX2(-20.8);
        cubica1.setControlY2(-19.4);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //union
        cubica2.setLayoutX(76);
        cubica2.setLayoutY(68.5);
        cubica2.setStartX(-62.69);
        cubica2.setStartY(-30.55);
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
        fondo.setPrefSize(19,60);
        //base
        cubica.setLayoutX(34.0);
        cubica.setLayoutY(44.0);
        cubica.setStartX(-28.39);
        cubica.setStartY(-17);
        cubica.setEndX(-18.19);
        cubica.setEndY(-7.2);
        cubica.setControlX1(-35);
        cubica.setControlY1(3.19);
        cubica.setControlX2(-23.8);
        cubica.setControlY2(8.79);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        //Circulo
        circulo.setRadius(1);
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(7);
        circulo.setLayoutY(19);
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
        cubica.setLayoutX(73.5);
        cubica.setLayoutY(79.5);
        cubica.setStartX(-65.7);
        cubica.setStartY(-52.9);
        cubica.setEndX(-72.89);
        cubica.setEndY(-29.09);
        cubica.setControlX1(-58.3);
        cubica.setControlY1(-36.5);
        cubica.setControlX2(-77.5);
        cubica.setControlY2(-5.09);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //union
        cubica1.setLayoutX(25);
        cubica1.setLayoutY(52);
        cubica1.setStartX(-24.5);
        cubica1.setStartY(-1.20);
        cubica1.setEndX(-10.2);
        cubica1.setEndY(-12.8);
        cubica1.setControlX1(-16.4);
        cubica1.setControlY1(-18.2);
        cubica1.setControlX2(-14.48);
        cubica1.setControlY2(-4.20);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //Circulo
        circulo.setRadius(1);
        circulo.setFill(getColor());
        circulo.setStroke(getColor());
        circulo.setLayoutX(8);
        circulo.setLayoutY(19);
        
        
        fondo.getChildren().addAll(cubica,cubica1,circulo);
        return fondo; 
    
    }
    public AnchorPane crear_k(){
        AnchorPane fondo = new AnchorPane();
        CubicCurve cubica= new CubicCurve();
        CubicCurve cubica1 = new CubicCurve();
        CubicCurve cubica2 = new CubicCurve(); 
        fondo.setPrefSize(19,60);
        
        // lateral
        cubica.setLayoutX(69);
        cubica.setLayoutY(49);
        cubica.setStartX(-66.39);
        cubica.setStartY(-3.59);
        cubica.setEndX(-70.79);
        cubica.setEndY(-7.8);
        cubica.setControlX1(-70.79);
        cubica.setControlY1(-63.0);
        cubica.setControlX2(-54.2);
        cubica.setControlY2(-57.4);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(getColor());
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //superior
        cubica1.setLayoutX(38);
        cubica1.setLayoutY(43);
        cubica1.setStartX(-36.4);
        cubica1.setStartY(-9.8);
        cubica1.setEndX(-36.4);
        cubica1.setEndY(-5.8);
        cubica1.setControlX1(-31.24);
        cubica1.setControlY1(-24.99);
        cubica1.setControlX2(-15.6);
        cubica1.setControlY2(-5.8);
        cubica1.setFill(Color.TRANSPARENT);
        cubica1.setStroke(getColor());
        cubica1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //inferior union
        cubica2.setLayoutX(75.5);
        cubica2.setLayoutY(69.5);
        cubica2.setStartX(-74.31);
        cubica2.setStartY(-32.9);
        cubica2.setEndX(-58.5);
        cubica2.setEndY(-27.09);
        cubica2.setControlX1(-53.3);
        cubica2.setControlY1(-36.9);
        cubica2.setControlX2(-69.3);
        cubica2.setControlY2(-17.3);
        cubica2.setFill(Color.TRANSPARENT);
        cubica2.setStroke(getColor());
        cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);    
        fondo.getChildren().addAll(cubica,cubica1,cubica2);
        return fondo; 
    
    }    
    public AnchorPane crear_l(){
        AnchorPane fondo = new AnchorPane();
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
        cubical1.setStroke(getColor());
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
        cubical2.setStroke(getColor());
        cubical2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubical2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubical1, cubical2);
        return fondo;
    }
    public AnchorPane crear_m(){
        AnchorPane fondo = new AnchorPane();
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
        cubicam1.setStroke(getColor());
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
        cubicam2.setStroke(getColor());
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
        cubicam3.setStroke(getColor());
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
        cubicam4.setStroke(getColor());
        cubicam4.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicam4.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubicam1, cubicam2, cubicam3, cubicam4);
        return fondo;
    }
    public AnchorPane crear_n(){
        AnchorPane fondo = new AnchorPane();
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
        cubican1.setStroke(getColor());
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
        cubican2.setStroke(getColor());
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
        cubican3.setStroke(getColor());
        cubican3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubican3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubican1, cubican2, cubican3);
        return fondo;
    }
    public AnchorPane crear_ñ(){
        AnchorPane fondo = new AnchorPane();
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
        cubicañ1.setStroke(getColor());
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
        cubicañ2.setStroke(getColor());
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
        cubicañ3.setStroke(getColor());
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
        cubicañ4.setStroke(getColor());
        cubicañ4.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicañ4.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubicañ1, cubicañ2, cubicañ3, cubicañ4);
        return fondo;
    }
    public AnchorPane crear_o(){
        AnchorPane fondo = new AnchorPane();
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
        cubicao1.setStroke(getColor());
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
        cubicao2.setStroke(getColor());
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
        cubicao3.setStroke(getColor());
        cubicao3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicao3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        fondo.getChildren().addAll(cubicao1, cubicao2,cubicao3);
        return fondo;
    }
    public AnchorPane crear_p(){
        AnchorPane fondo = new AnchorPane();
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
        cubicap1.setStroke(getColor());
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
        cubicap2.setStroke(getColor());
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
        cubicap3.setStroke(getColor());
        cubicap3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicap3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubicap1, cubicap2, cubicap3);
        return fondo;
    }
    public AnchorPane crear_q(){
        AnchorPane fondo = new AnchorPane();
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
        cubicaq1.setStroke(getColor());
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
        cubicaq2.setStroke(getColor());
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
        cubicaq3.setStroke(getColor());
        cubicaq3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicaq3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubicaq1, cubicaq2, cubicaq3);
        return fondo;
    }
    public AnchorPane crear_r(){
        AnchorPane fondo = new AnchorPane();
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
        cubicar1.setStroke(getColor());
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
        cubicar2.setStroke(getColor());
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
        cubicar3.setStroke(getColor());
        cubicar3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicar3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubicar1, cubicar2, cubicar3);
        return fondo;
    }
    public AnchorPane crear_s(){
        AnchorPane fondo = new AnchorPane();
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
        cubicas1.setStroke(getColor());
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
        cubicas2.setStroke(getColor());
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
        cubicas3.setStroke(getColor());
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
        cubicas4.setStroke(getColor());
        cubicas4.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas4.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubicas1, cubicas2, cubicas3, cubicas4);
        return fondo;
    }
    public AnchorPane crear_t(){
        AnchorPane fondo = new AnchorPane();
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
        cubicat1.setStroke(getColor());
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
        cubicat2.setStroke(getColor());
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
        lineat1.setStroke(getColor());
        lineat1.setStrokeLineCap(StrokeLineCap.ROUND);
        lineat1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubicat1, cubicat2, lineat1);
        return fondo;
    }
    public AnchorPane crear_u(){
        AnchorPane fondo = new AnchorPane();
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
        cubicau1.setStroke(getColor());
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
        cubicau2.setStroke(getColor());
        cubicau2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicau2.setStrokeLineJoin(StrokeLineJoin.ROUND);  
        
        fondo.getChildren().addAll(cubicau1,cubicau2);
        return fondo;   
    }
    public AnchorPane crear_w(){
        AnchorPane fondo = new AnchorPane();
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
        cubicaw1.setStroke(getColor());
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
        cubicaw2.setStroke(getColor());
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
        cubicaw3.setStroke(getColor());
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
        cubicaw4.setStroke(getColor());
        cubicaw4.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicaw4.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubicaw1, cubicaw2, cubicaw3, cubicaw4);
        return fondo;
    }
    public AnchorPane crear_v(){
        AnchorPane fondo = new AnchorPane();
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
        cubicav1.setStroke(getColor());
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
        cubicav2.setStroke(getColor());
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
        cubicav3.setStroke(getColor());
        cubicav3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicav3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubicav1,cubicav2,cubicav3);
        return fondo;
    }
    public AnchorPane crear_x(){
        AnchorPane fondo = new AnchorPane();
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
        cubicax1.setStroke(getColor());
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
        cubicax2.setStroke(getColor());
        cubicax2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicax2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubicax1, cubicax2);
        return fondo;
    }
    public AnchorPane crear_y(){
        AnchorPane fondo = new AnchorPane();
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
        cubicay1.setStroke(getColor());
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
        cubicay2.setStroke(getColor());
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
        cubicay3.setStroke(getColor());
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
        cubicay4.setStroke(getColor());
        cubicay4.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicay4.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubicay1, cubicay2, cubicay3, cubicay4);
        return fondo;
    }
    public AnchorPane crear_z(){
        AnchorPane fondo = new AnchorPane();
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
        cubicaz1.setStroke(getColor());
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
        cubicaz2.setStroke(getColor());
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
        cubicaz3.setStroke(getColor());
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
        cubicaz4.setStroke(getColor());
        cubicaz4.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicaz4.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cubicaz1, cubicaz2, cubicaz3, cubicaz4);
        return fondo;
    }
}