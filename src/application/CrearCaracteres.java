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
                
                fondo.getChildren().addAll(cubicaA1,cubicaA2,lineaA);
                
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
                
                fondo.getChildren().addAll(cubicaB1,cubicaB2,cubicaB3,cubicaB4);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaB1, fondo);
                    estilos.cubicaNegrita(cubicaB2, fondo);
                    estilos.cubicaNegrita(cubicaB3, fondo);
                    estilos.cubicaNegrita(cubicaB4, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaB1, fondo);
                    estilos.cubicaControl(cubicaB2, fondo);
                    estilos.cubicaControl(cubicaB3, fondo);
                    estilos.cubicaControl(cubicaB4, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaC1,cubicaC2,cubicaC3);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaC1, fondo);
                    estilos.cubicaNegrita(cubicaC2, fondo);
                    estilos.cubicaNegrita(cubicaC3, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaC1, fondo);
                    estilos.cubicaControl(cubicaC2, fondo);
                    estilos.cubicaControl(cubicaC3, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaD1,cubicaD2,cubicaD3,cubicaD4);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaD1, fondo);
                    estilos.cubicaNegrita(cubicaD2, fondo);
                    estilos.cubicaNegrita(cubicaD3, fondo);
                    estilos.cubicaNegrita(cubicaD4, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaD1, fondo);
                    estilos.cubicaControl(cubicaD2, fondo);
                    estilos.cubicaControl(cubicaD3, fondo);
                    estilos.cubicaControl(cubicaD4, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaE1,cubicaE2,cubicaE3,cubicaE4);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaE1, fondo);
                    estilos.cubicaNegrita(cubicaE2, fondo);
                    estilos.cubicaNegrita(cubicaE3, fondo);
                    estilos.cubicaNegrita(cubicaE4, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaE1, fondo);
                    estilos.cubicaControl(cubicaE2, fondo);
                    estilos.cubicaControl(cubicaE3, fondo);
                    estilos.cubicaControl(cubicaE4, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaF1,cubicaF2,cubicaF3,lineaF1,lineaF2);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaF1, fondo);
                    estilos.cubicaNegrita(cubicaF2, fondo);
                    estilos.cubicaNegrita(cubicaF3, fondo);
                    estilos.lineaNegrita(lineaF1, fondo);
                    estilos.lineaNegrita(lineaF2, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaF1, fondo);
                    estilos.cubicaControl(cubicaF2, fondo);
                    estilos.cubicaControl(cubicaF3, fondo);
                    estilos.lineaControl(lineaF1, fondo);
                    estilos.lineaControl(lineaF2, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaG1,cubicaG2,cubicaG3);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaG1, fondo);
                    estilos.cubicaNegrita(cubicaG2, fondo);
                    estilos.cubicaNegrita(cubicaG3, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaG1, fondo);
                    estilos.cubicaControl(cubicaG2, fondo);
                    estilos.cubicaControl(cubicaG3, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaH1,cubicaH2,cubicaH3,lineaH);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaH1, fondo);
                    estilos.cubicaNegrita(cubicaH2, fondo);
                    estilos.cubicaNegrita(cubicaH3, fondo);
                    estilos.lineaNegrita(lineaH, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaH1, fondo);
                    estilos.cubicaControl(cubicaH2, fondo);
                    estilos.cubicaControl(cubicaH3, fondo);
                    estilos.lineaControl(lineaH, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaI1,cubicaI2,cubicaI3);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaI1, fondo);
                    estilos.cubicaNegrita(cubicaI2, fondo);
                    estilos.cubicaNegrita(cubicaI3, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaI1, fondo);
                    estilos.cubicaControl(cubicaI2, fondo);
                    estilos.cubicaControl(cubicaI3, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaJ1,cubicaJ2,cubicaJ3);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaJ1, fondo);
                    estilos.cubicaNegrita(cubicaJ2, fondo);
                    estilos.cubicaNegrita(cubicaJ3, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaJ1, fondo);
                    estilos.cubicaControl(cubicaJ2, fondo);
                    estilos.cubicaControl(cubicaJ3, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaK1,cubicaK2,cubicaK3,cubicaK4);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaK1, fondo);
                    estilos.cubicaNegrita(cubicaK2, fondo);
                    estilos.cubicaNegrita(cubicaK3, fondo);
                    estilos.cubicaNegrita(cubicaK4, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaK1, fondo);
                    estilos.cubicaControl(cubicaK2, fondo);
                    estilos.cubicaControl(cubicaK3, fondo);
                    estilos.cubicaControl(cubicaK4, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaL1,cubicaL2,cubicaL3);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaL1, fondo);
                    estilos.cubicaNegrita(cubicaL2, fondo);
                    estilos.cubicaNegrita(cubicaL3, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaL1, fondo);
                    estilos.cubicaControl(cubicaL2, fondo);
                    estilos.cubicaControl(cubicaL3, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaM1,cubicaM2,cubicaM3,cubicaM4,cuadraticaM);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaM1, fondo);
                    estilos.cubicaNegrita(cubicaM2, fondo);
                    estilos.cubicaNegrita(cubicaM3, fondo);
                    estilos.cubicaNegrita(cubicaM4, fondo);
                    estilos.cuadraticaNegrita(cuadraticaM, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaM1, fondo);
                    estilos.cubicaControl(cubicaM2, fondo);
                    estilos.cubicaControl(cubicaM3, fondo);
                    estilos.cubicaControl(cubicaM4, fondo);
                    estilos.cuadraticaControl(cuadraticaM, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaN1,cubicaN2,cubicaN3,cubicaN4);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaN1, fondo);
                    estilos.cubicaNegrita(cubicaN2, fondo);
                    estilos.cubicaNegrita(cubicaN3, fondo);
                    estilos.cubicaNegrita(cubicaN4, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaN1, fondo);
                    estilos.cubicaControl(cubicaN2, fondo);
                    estilos.cubicaControl(cubicaN3, fondo);
                    estilos.cubicaControl(cubicaN4, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaÑ1,cubicaÑ2,cubicaÑ3,cubicaÑ4,cubicaÑ5);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaÑ1, fondo);
                    estilos.cubicaNegrita(cubicaÑ2, fondo);
                    estilos.cubicaNegrita(cubicaÑ3, fondo);
                    estilos.cubicaNegrita(cubicaÑ4, fondo);
                    estilos.cubicaNegrita(cubicaÑ5, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaÑ1, fondo);
                    estilos.cubicaControl(cubicaÑ2, fondo);
                    estilos.cubicaControl(cubicaÑ3, fondo);
                    estilos.cubicaControl(cubicaÑ4, fondo);
                    estilos.cubicaControl(cubicaÑ5, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaO1,cubicaO2,cubicaO3);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaO1, fondo);
                    estilos.cubicaNegrita(cubicaO2, fondo);
                    estilos.cubicaNegrita(cubicaO3, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaO1, fondo);
                    estilos.cubicaControl(cubicaO2, fondo);
                    estilos.cubicaControl(cubicaO3, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaP1,cubicaP2,cubicaP3);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaP1, fondo);
                    estilos.cubicaNegrita(cubicaP2, fondo);
                    estilos.cubicaNegrita(cubicaP3, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaP1, fondo);
                    estilos.cubicaControl(cubicaP2, fondo);
                    estilos.cubicaControl(cubicaP3, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaQ1,cubicaQ2,cubicaQ3,cubicaQ4);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaQ1, fondo);
                    estilos.cubicaNegrita(cubicaQ2, fondo);
                    estilos.cubicaNegrita(cubicaQ3, fondo);
                    estilos.cubicaNegrita(cubicaQ4, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaQ1, fondo);
                    estilos.cubicaControl(cubicaQ2, fondo);
                    estilos.cubicaControl(cubicaQ3, fondo);
                    estilos.cubicaControl(cubicaQ4, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaR1,cubicaR2,cubicaR3,cubicaR4);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaR1, fondo);
                    estilos.cubicaNegrita(cubicaR2, fondo);
                    estilos.cubicaNegrita(cubicaR3, fondo);
                    estilos.cubicaNegrita(cubicaR4, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaR1, fondo);
                    estilos.cubicaControl(cubicaR2, fondo);
                    estilos.cubicaControl(cubicaR3, fondo);
                    estilos.cubicaControl(cubicaR4, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaS1,cubicaS2,cubicaS3);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaS1, fondo);
                    estilos.cubicaNegrita(cubicaS2, fondo);
                    estilos.cubicaNegrita(cubicaS3, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaS1, fondo);
                    estilos.cubicaControl(cubicaS2, fondo);
                    estilos.cubicaControl(cubicaS3, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaT1,cubicaT2,cubicaT3);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaT1, fondo);
                    estilos.cubicaNegrita(cubicaT2, fondo);
                    estilos.cubicaNegrita(cubicaT3, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaT1, fondo);
                    estilos.cubicaControl(cubicaT2, fondo);
                    estilos.cubicaControl(cubicaT3, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaU1,cubicaU2,cuadraticaU);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaU1, fondo);
                    estilos.cubicaNegrita(cubicaU2, fondo);
                    estilos.cuadraticaNegrita(cuadraticaU, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaU1, fondo);
                    estilos.cubicaControl(cubicaU2, fondo);
                    estilos.cuadraticaControl(cuadraticaU, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaV1,cubicaV2,cubicaV3);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaV1, fondo);
                    estilos.cubicaNegrita(cubicaV2, fondo);
                    estilos.cubicaNegrita(cubicaV3, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaV1, fondo);
                    estilos.cubicaControl(cubicaV2, fondo);
                    estilos.cubicaControl(cubicaV3, fondo);
                }
                
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
                
                fondo.getChildren().addAll(cubicaW1,cubicaW2,cubicaW3,cubicaW4,cubicaW5);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaW1, fondo);
                    estilos.cubicaNegrita(cubicaW2, fondo);
                    estilos.cubicaNegrita(cubicaW3, fondo);
                    estilos.cubicaNegrita(cubicaW4, fondo);
                    estilos.cubicaNegrita(cubicaW5, fondo);
                }
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaW1, fondo);
                    estilos.cubicaControl(cubicaW2, fondo);
                    estilos.cubicaControl(cubicaW3, fondo);
                    estilos.cubicaControl(cubicaW4, fondo);
                    estilos.cubicaControl(cubicaW5, fondo);
                }
                
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
                    cubicau1.setRotate(7);
                    cubicau2.setRotate(7);
                }
                
                fondo.getChildren().addAll(cubicau1,cubicau2);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicau1, fondo);
                    estilos.cubicaNegrita(cubicau2, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicau1, fondo);
                    estilos.cubicaControl(cubicau2, fondo);
                }
                
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
                    cubicav1.setRotate(7);
                    cubicav2.setRotate(7);
                    cubicav3.setRotate(7);
                }
                
                fondo.getChildren().addAll(cubicav1,cubicav2,cubicav3);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicav1, fondo);
                    estilos.cubicaNegrita(cubicav2, fondo);
                    estilos.cubicaNegrita(cubicav3, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicav1, fondo);
                    estilos.cubicaControl(cubicav2, fondo);
                    estilos.cubicaControl(cubicav3, fondo);
                }
                
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
                    cubicaw1.setRotate(7);
                    cubicaw2.setRotate(7);
                    cubicaw3.setRotate(7);
                    cubicaw4.setRotate(7);
                }
                
                fondo.getChildren().addAll(cubicaw1, cubicaw2, cubicaw3, cubicaw4);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaw1, fondo);
                    estilos.cubicaNegrita(cubicaw2, fondo);
                    estilos.cubicaNegrita(cubicaw3, fondo);
                    estilos.cubicaNegrita(cubicaw4, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaw1, fondo);
                    estilos.cubicaControl(cubicaw2, fondo);
                    estilos.cubicaControl(cubicaw3, fondo);
                    estilos.cubicaControl(cubicaw4, fondo);
                }
                
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
                    cubicax1.setRotate(7);
                    cubicax2.setRotate(7);
                }
                
                fondo.getChildren().addAll(cubicax1, cubicax2);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicax1, fondo);
                    estilos.cubicaNegrita(cubicax2, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicax1, fondo);
                    estilos.cubicaControl(cubicax2, fondo);
                }
                
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
                    cubicay1.setRotate(7);
                    cubicay2.setRotate(7);
                    cubicay3.setRotate(7);
                    cubicay4.setRotate(7);
                }
                
                fondo.getChildren().addAll(cubicay1, cubicay2, cubicay3, cubicay4);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicay1, fondo);
                    estilos.cubicaNegrita(cubicay2, fondo);
                    estilos.cubicaNegrita(cubicay3, fondo);
                    estilos.cubicaNegrita(cubicay4, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicay1, fondo);
                    estilos.cubicaControl(cubicay2, fondo);
                    estilos.cubicaControl(cubicay3, fondo);
                    estilos.cubicaControl(cubicay4, fondo);
                }
                
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
                    cubicaz1.setRotate(7);
                    cubicaz2.setRotate(7);
                    cubicaz3.setRotate(7);
                    cubicaz4.setRotate(7);
                }
                
                fondo.getChildren().addAll(cubicaz1, cubicaz2, cubicaz3, cubicaz4);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubicaz1, fondo);
                    estilos.cubicaNegrita(cubicaz2, fondo);
                    estilos.cubicaNegrita(cubicaz3, fondo);
                    estilos.cubicaNegrita(cubicaz4, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubicaz1, fondo);
                    estilos.cubicaControl(cubicaz2, fondo);
                    estilos.cubicaControl(cubicaz3, fondo);
                    estilos.cubicaControl(cubicaz4, fondo);
                }
                
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
                    elipse.setRotate(7);
                    circulo.setRotate(7);
                }
                
                fondo.getChildren().addAll(elipse, circulo);
                
                if (palabra.isN()){
                    estilos.elipseNegrita(elipse, fondo);
                    estilos.circuloNegrita(circulo, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.elipseControl(elipse, fondo);
                    estilos.circuloControl(circulo, fondo);
                }
                
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
                
                if (palabra.isK()){
                    elipse1.setRotate(7);
                    circulo1.setRotate(7);
                }
                
                fondo.getChildren().addAll(elipse1, circulo1);
                
                if (palabra.isN()){
                    estilos.elipseNegrita(elipse1, fondo);
                    estilos.circuloNegrita(circulo1, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.elipseControl(elipse1, fondo);
                    estilos.circuloControl(circulo1, fondo);
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
                    cubica.setRotate(7);
                    linea1.setRotate(7);
                    circulo2.setRotate(7);
                }
                
                fondo.getChildren().addAll(cubica, linea1, circulo2);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubica, fondo);
                    estilos.lineaNegrita(linea1, fondo);
                    estilos.circuloNegrita(circulo2, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubica, fondo);
                    estilos.lineaControl(linea1, fondo);
                    estilos.circuloControl(circulo2, fondo);
                }
                
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
                    cubica1.setRotate(7);
                    linea2.setRotate(7);
                    circulo3.setRotate(7);
                }
                
                fondo.getChildren().addAll(cubica1, linea2, circulo3);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubica1, fondo);
                    estilos.lineaNegrita(linea2, fondo);
                    estilos.circuloNegrita(circulo3, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubica1, fondo);
                    estilos.lineaControl(linea2, fondo);
                    estilos.circuloControl(circulo3, fondo);
                }
                
                return fondo;
            case '.':
                Circle circulo4 = new Circle(3, dibujar.getColor());
                //Atributos del fondo
                fondo.setPrefSize(22, 60);
                //Circulo
                circulo4.setLayoutX(9);
                circulo4.setLayoutY(47);
                
                if (palabra.isK()){
                    circulo4.setRotate(7);
                }
                
                fondo.getChildren().addAll(circulo4);
                
                if (palabra.isN()){
                    estilos.circuloNegrita(circulo4, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.circuloControl(circulo4, fondo);
                }
                
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
                    circulo5.setRotate(7);
                    cuadratica.setRotate(7);
                }
                
                fondo.getChildren().addAll(circulo5, cuadratica);
                
                if (palabra.isN()){
                    estilos.circuloNegrita(circulo5, fondo);
                    estilos.cuadraticaNegrita(cuadratica, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.circuloControl(circulo5, fondo);
                    estilos.cuadraticaControl(cuadratica, fondo);
                }
                
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
                    circulo6.setRotate(7);
                    circulo7.setRotate(7);
                    cuadratica1.setRotate(7);
                }
                
                fondo.getChildren().addAll(circulo6, cuadratica1, circulo7);
                
                if (palabra.isN()){
                    estilos.circuloNegrita(circulo6, fondo);
                    estilos.circuloNegrita(circulo7, fondo);
                    estilos.cuadraticaNegrita(cuadratica1, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.circuloControl(circulo6, fondo);
                    estilos.circuloControl(circulo7, fondo);
                    estilos.cuadraticaControl(cuadratica1, fondo);
                }
                
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
                    circulo8.setRotate(7);
                    circulo9.setRotate(7);
                }
                
                fondo.getChildren().addAll(circulo8, circulo9);
                
                if (palabra.isN()){
                    estilos.circuloNegrita(circulo8, fondo);
                    estilos.circuloNegrita(circulo9, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.circuloControl(circulo8, fondo);
                    estilos.circuloControl(circulo9, fondo);
                }
                
                return fondo;
            case '(':
                QuadCurve cubica2 = new QuadCurve(-6.6, 1.8, -29.3, -25.8, -6.59, -50);
                fondo.setPrefSize(22, 60);
                //Cubica *Me equivoque en el nombre, es una cuadratica -F.S
                cubica2.setLayoutX(20);
                cubica2.setLayoutY(51);
                cubica2.setFill(Color.TRANSPARENT);
                cubica2.setStroke(dibujar.getColor());
                cubica2.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica2.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    cubica2.setRotate(7);
                }
                
                fondo.getChildren().addAll(cubica2);
                
                if (palabra.isN()){
                    estilos.cuadraticaNegrita(cubica2, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cuadraticaControl(cubica2, fondo);
                }
                
                return fondo;
            case ')':
                QuadCurve cubica3 = new QuadCurve(-6.6, 1.8, 14.6, -25, -6.59, -50);
                fondo.setPrefSize(22, 60);
                //Cubica *Lo mismo, es cuadratica -F.S
                cubica3.setLayoutX(9);
                cubica3.setLayoutY(51);
                cubica3.setFill(Color.TRANSPARENT);
                cubica3.setStroke(dibujar.getColor());
                cubica3.setStrokeLineCap(StrokeLineCap.ROUND);
                cubica3.setStrokeLineJoin(StrokeLineJoin.ROUND);
                
                if (palabra.isK()){
                    cubica3.setRotate(7);
                }
                
                fondo.getChildren().addAll(cubica3);
                
                if (palabra.isN()){
                    estilos.cuadraticaNegrita(cubica3, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cuadraticaControl(cubica3, fondo);
                }
                
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
                    linea3.setRotate(7);
                    linea4.setRotate(7);
                    linea5.setRotate(7);
                }
                
                fondo.getChildren().addAll(linea3, linea4, linea5);
                
                if (palabra.isN()){
                    estilos.lineaNegrita(linea3, fondo);
                    estilos.lineaNegrita(linea4, fondo);
                    estilos.lineaNegrita(linea5, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.lineaControl(linea3, fondo);
                    estilos.lineaControl(linea4, fondo);
                    estilos.lineaControl(linea5, fondo);
                }
                
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
                    linea6.setRotate(7);
                    linea7.setRotate(7);
                    linea8.setRotate(7);
                }
                
                fondo.getChildren().addAll(linea6, linea7, linea8);
                
                if (palabra.isN()){
                    estilos.lineaNegrita(linea6, fondo);
                    estilos.lineaNegrita(linea7, fondo);
                    estilos.lineaNegrita(linea8, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.lineaControl(linea6, fondo);
                    estilos.lineaControl(linea7, fondo);
                    estilos.lineaControl(linea8, fondo);
                }
                
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
                    cubica4.setRotate(7);
                    cubica5.setRotate(7);
                }
                
                fondo.getChildren().addAll(cubica4, cubica5);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubica4, fondo);
                    estilos.cubicaNegrita(cubica5, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubica4, fondo);
                    estilos.cubicaControl(cubica5, fondo);
                }
                
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
                    cubica6.setRotate(7);
                    cubica7.setRotate(7);
                }
                
                fondo.getChildren().addAll(cubica6, cubica7);
                
                if (palabra.isN()){
                    estilos.cubicaNegrita(cubica6, fondo);
                    estilos.cubicaNegrita(cubica7, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.cubicaControl(cubica6, fondo);
                    estilos.cubicaControl(cubica7, fondo);
                }
                
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
                    linea9.setRotate(7);
                }
                
                fondo.getChildren().addAll(linea9);
                
                if (palabra.isN()){
                    estilos.lineaNegrita(linea9, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.lineaControl(linea9, fondo);
                }
                
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
                    linea10.setRotate(7);
                }
                
                fondo.getChildren().addAll(linea10);
                
                if (palabra.isN()){
                    estilos.lineaNegrita(linea10, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.lineaControl(linea10, fondo);
                }
                
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
                    circulo10.setRotate(7);
                    cuadratica2.setRotate(7);
                }
                
                fondo.getChildren().addAll(circulo10, cuadratica2);
                
                if (palabra.isN()){
                    estilos.circuloNegrita(circulo10, fondo);
                    estilos.cuadraticaNegrita(cuadratica2, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.circuloControl(circulo10, fondo);
                    estilos.cuadraticaControl(cuadratica2, fondo);
                }
                
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
                    circulo11.setRotate(7);
                    cuadratica3.setRotate(7);
                    circulo12.setRotate(7);
                    cuadratica4.setRotate(7);
                }
                
                fondo.getChildren().addAll(circulo11, cuadratica3, circulo12, cuadratica4);
                
                if (palabra.isN()){
                    estilos.circuloNegrita(circulo11, fondo);
                    estilos.cuadraticaNegrita(cuadratica3, fondo);
                    estilos.circuloNegrita(circulo12, fondo);
                    estilos.cuadraticaNegrita(cuadratica4, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.circuloControl(circulo11, fondo);
                    estilos.cuadraticaControl(cuadratica3, fondo);
                    estilos.circuloControl(circulo12, fondo);
                    estilos.cuadraticaControl(cuadratica4, fondo);
                }
                
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
                    linea11.setRotate(7);
                    linea12.setRotate(7);
                    linea13.setRotate(7);
                    linea14.setRotate(7);
                }
                
                fondo.getChildren().addAll(linea11, linea12, linea13, linea14);
                
                if (palabra.isN()){
                    estilos.lineaNegrita(linea11, fondo);
                    estilos.lineaNegrita(linea12, fondo);
                    estilos.lineaNegrita(linea13, fondo);
                    estilos.lineaNegrita(linea14, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.lineaControl(linea11, fondo);
                    estilos.lineaControl(linea12, fondo);
                    estilos.lineaControl(linea13, fondo);
                    estilos.lineaControl(linea13, fondo);
                }
                
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
                    linea15.setRotate(7);
                    linea16.setRotate(7);
                    linea17.setRotate(7);
                    linea18.setRotate(7);
                }
                
                fondo.getChildren().addAll(linea15, linea16, linea17, linea18);
                
                if (palabra.isN()){
                    estilos.lineaNegrita(linea15, fondo);
                    estilos.lineaNegrita(linea16, fondo);
                    estilos.lineaNegrita(linea17, fondo);
                    estilos.lineaNegrita(linea18, fondo);
                }
                
                if (palabra.isS()){
                    estilos.subrayado(caracter, fondo);
                }
                
                if (dibujar.getControl()){
                    estilos.lineaControl(linea15, fondo);
                    estilos.lineaControl(linea16, fondo);
                    estilos.lineaControl(linea17, fondo);
                    estilos.lineaControl(linea18, fondo);
                }
                
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