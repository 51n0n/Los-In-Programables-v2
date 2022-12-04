/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.ArrayList;
import javafx.geometry.Point3D;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;

public class Estilos {
    
    Dibujar dibujar = new Dibujar();
    
    public void lineaNegrita(Line linea, AnchorPane fondo){
        Line ancho1 = new Line(linea.getStartX(),linea.getStartY(),linea.getEndX(),linea.getEndY());
        ancho1.setLayoutX(linea.getLayoutX());
        ancho1.setLayoutY(linea.getLayoutY());
        ancho1.setFill(Color.TRANSPARENT);
        ancho1.setStroke(dibujar.getColor());
        ancho1.setStrokeLineCap(StrokeLineCap.ROUND);
        ancho1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        ancho1.setTranslateX(1);
                    
        Line ancho2 = new Line(linea.getStartX(),linea.getStartY(),linea.getEndX(),linea.getEndY());
        ancho2.setLayoutX(linea.getLayoutX());
        ancho2.setLayoutY(linea.getLayoutY());
        ancho2.setFill(Color.TRANSPARENT);
        ancho2.setStroke(dibujar.getColor());
        ancho2.setStrokeLineCap(StrokeLineCap.ROUND);
        ancho2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        ancho2.setTranslateY(1);
        
        fondo.getChildren().addAll(ancho1,ancho2);
    }
    
    public void cuadraticaNegrita(QuadCurve cuadratica, AnchorPane fondo){
        QuadCurve ancho1 = new QuadCurve(cuadratica.getStartX(),cuadratica.getStartY(),cuadratica.getControlX(),cuadratica.getControlY(),cuadratica.getEndX(),cuadratica.getEndY());
        ancho1.setLayoutX(cuadratica.getLayoutX());
        ancho1.setLayoutY(cuadratica.getLayoutY());
        ancho1.setFill(Color.TRANSPARENT);
        ancho1.setStroke(dibujar.getColor());
        ancho1.setStrokeLineCap(StrokeLineCap.ROUND);
        ancho1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        ancho1.setTranslateX(1);
                    
        QuadCurve ancho2 = new QuadCurve(cuadratica.getStartX(),cuadratica.getStartY(),cuadratica.getControlX(),cuadratica.getControlY(),cuadratica.getEndX(),cuadratica.getEndY());
        ancho2.setLayoutX(cuadratica.getLayoutX());
        ancho2.setLayoutY(cuadratica.getLayoutY());
        ancho2.setFill(Color.TRANSPARENT);
        ancho2.setStroke(dibujar.getColor());
        ancho2.setStrokeLineCap(StrokeLineCap.ROUND);
        ancho2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        ancho2.setTranslateY(1);
        
        fondo.getChildren().addAll(ancho1,ancho2);
    }
    
    public void cubicaNegrita(CubicCurve cubica, AnchorPane fondo){
        CubicCurve ancho1 = new CubicCurve(cubica.getStartX(),cubica.getStartY(),cubica.getControlX1(),cubica.getControlY1(),cubica.getControlX2(),cubica.getControlY2(),cubica.getEndX(),cubica.getEndY());
        ancho1.setLayoutX(cubica.getLayoutX());
        ancho1.setLayoutY(cubica.getLayoutY());
        ancho1.setFill(Color.TRANSPARENT);
        ancho1.setStroke(dibujar.getColor());
        ancho1.setStrokeLineCap(StrokeLineCap.ROUND);
        ancho1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        ancho1.setTranslateX(1);
                    
        CubicCurve ancho2 = new CubicCurve(cubica.getStartX(),cubica.getStartY(),cubica.getControlX1(),cubica.getControlY1(),cubica.getControlX2(),cubica.getControlY2(),cubica.getEndX(),cubica.getEndY());
        ancho2.setLayoutX(cubica.getLayoutX());
        ancho2.setLayoutY(cubica.getLayoutY());
        ancho2.setFill(Color.TRANSPARENT);
        ancho2.setStroke(dibujar.getColor());
        ancho2.setStrokeLineCap(StrokeLineCap.ROUND);
        ancho2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        ancho2.setTranslateY(1);
        
        fondo.getChildren().addAll(ancho1,ancho2);
    }
    
    public void lineaControl(Line linea, AnchorPane fondo){
        Circle p1 = new Circle(linea.getStartX(),linea.getStartY(),2,dibujar.getColorControl());
        p1.setLayoutX(linea.getLayoutX());
        p1.setLayoutY(linea.getLayoutY());
        Circle p2 = new Circle(linea.getEndX(),linea.getEndY(),2,dibujar.getColorControl());
        p2.setLayoutX(linea.getLayoutX());
        p2.setLayoutY(linea.getLayoutY());
        
        fondo.getChildren().addAll(p1,p2);
    }
    
    public void cuadraticaControl(QuadCurve cuadratica, AnchorPane fondo){
        Circle p1 = new Circle(cuadratica.getStartX(),cuadratica.getStartY(),2,dibujar.getColorControl());
        p1.setLayoutX(cuadratica.getLayoutX());
        p1.setLayoutY(cuadratica.getLayoutY());
        Circle p2 = new Circle(cuadratica.getControlX(),cuadratica.getControlY(),2,dibujar.getColorControl());
        p2.setLayoutX(cuadratica.getLayoutX());
        p2.setLayoutY(cuadratica.getLayoutY());
        Circle p3 = new Circle(cuadratica.getEndX(),cuadratica.getEndY(),2,dibujar.getColorControl());
        p3.setLayoutX(cuadratica.getLayoutX());
        p3.setLayoutY(cuadratica.getLayoutY());
        
        fondo.getChildren().addAll(p1,p2,p3);
    }
    
    public void cubicaControl(CubicCurve cubica, AnchorPane fondo){
        Circle p1 = new Circle(cubica.getStartX(),cubica.getStartY(),2,dibujar.getColorControl());
        p1.setLayoutX(cubica.getLayoutX());
        p1.setLayoutY(cubica.getLayoutY());
        Circle p2 = new Circle(cubica.getControlX1(),cubica.getControlY1(),2,dibujar.getColorControl());
        p2.setLayoutX(cubica.getLayoutX());
        p2.setLayoutY(cubica.getLayoutY());
        Circle p3 = new Circle(cubica.getControlX2(),cubica.getControlY2(),2,dibujar.getColorControl());
        p3.setLayoutX(cubica.getLayoutX());
        p3.setLayoutY(cubica.getLayoutY());
        Circle p4 = new Circle(cubica.getEndX(),cubica.getEndY(),2,dibujar.getColorControl());
        p4.setLayoutX(cubica.getLayoutX());
        p4.setLayoutY(cubica.getLayoutY());
        
        fondo.getChildren().addAll(p1,p2,p3,p4);
    }
    
    public void subrayado(char c, AnchorPane fondo){
        Line sub = new Line();
        sub.setStartX(dibujar.tamañoCaracter(c));
        sub.setLayoutX(0);
        sub.setLayoutY(55);
        sub.setStroke(dibujar.getColor());
        fondo.getChildren().add(sub);
    }
    
    public void elipseNegrita(Ellipse elipse, AnchorPane fondo){
        Ellipse ancho1 = new Ellipse(elipse.getRadiusX(),elipse.getRadiusY());
        ancho1.setLayoutX(elipse.getLayoutX());
        ancho1.setLayoutY(elipse.getLayoutY());
        ancho1.setFill(dibujar.getColor());
        ancho1.setStroke(dibujar.getColor());
        ancho1.setTranslateX(1);
                    
        Ellipse ancho2 = new Ellipse(elipse.getRadiusX(),elipse.getRadiusY());
        ancho2.setLayoutX(elipse.getLayoutX());
        ancho2.setLayoutY(elipse.getLayoutY());
        ancho2.setFill(dibujar.getColor());
        ancho2.setStroke(dibujar.getColor());
        ancho2.setTranslateY(1);
        
        fondo.getChildren().addAll(ancho1,ancho2);
    }
    
    public void elipseControl(Ellipse elipse, AnchorPane fondo){
        Circle p1 = new Circle(elipse.getRadiusX(),elipse.getRadiusY(),2,dibujar.getColorControl());
        p1.setLayoutX(elipse.getLayoutX());
        p1.setLayoutY(elipse.getLayoutY());
        Circle p2 = new Circle(elipse.getCenterX(),elipse.getCenterY(),2,dibujar.getColorControl());
        p2.setLayoutX(elipse.getLayoutX());
        p2.setLayoutY(elipse.getLayoutY());
        
        fondo.getChildren().addAll(p1,p2);
    }
    
    public void circuloNegrita(Circle circulo, AnchorPane fondo){
        Circle ancho1 = new Circle(circulo.getRadius());
        ancho1.setLayoutX(circulo.getLayoutX());
        ancho1.setLayoutY(circulo.getLayoutY());
        ancho1.setFill(dibujar.getColor());
        ancho1.setStroke(dibujar.getColor());
        ancho1.setTranslateX(1);
                    
        Circle ancho2 = new Circle(circulo.getRadius());
        ancho2.setLayoutX(circulo.getLayoutX());
        ancho2.setLayoutY(circulo.getLayoutY());
        ancho2.setFill(dibujar.getColor());
        ancho2.setStroke(dibujar.getColor());
        ancho2.setTranslateY(1);
        
        fondo.getChildren().addAll(ancho1,ancho2);
    }
    
    public void circuloControl(Circle circulo, AnchorPane fondo){
        Circle p = new Circle();
        p.setRadius(2);
        p.setFill(dibujar.getColorControl());
        p.setLayoutX(circulo.getLayoutX());
        p.setLayoutY(circulo.getLayoutY());
        
        fondo.getChildren().add(p);
    }
    
    public void rotarPalabra(Palabra palabra){
        if (palabra.is_a() || palabra.isA()){
            double y = palabra.getHeight();
            double x = palabra.getWidth();
            int a = palabra.getAngulo();
            double rad = Math.toRadians(a);
            double sin = Math.sin(rad);
            double cos = Math.cos(rad);     

            if(a>360){
                while(a>360){
                    a=a-360;
                }
            }

            if(0<a && a<=90){ //primer cuadrante
                cos=cos*1;
                sin=sin*1;
            }

            if(90<a && a<=180){ //segundo cuadrante
                cos=cos*-1;
                sin=sin*1;
            }

            if(180<a && a<=270){ //tercer cuadrante
                cos=cos*-1;
                sin=sin*-1;
            }

            if(270<a && a<=360){ //cuarto cuadrante
                cos=cos*1;
                sin=sin*-1;
            }

            palabra.setWidth((x*cos)+(y*sin));
            palabra.setHeight((x*sin)+(y*cos));
            palabra.getFondo().setRotationAxis(new Point3D(0,0,1));
            palabra.getFondo().setRotate(a*(-1));
        }
    }
    
    public void invertirOrden(ArrayList<Palabra> palabras,int i, int j){
        while (i<j){
            Palabra aux = palabras.get(i);
            palabras.set(i, palabras.get(j));
            palabras.set(j, aux);
            i++;
            j--;
        }
    }
    
    public void traslación(Palabra palabra){
        palabra.getFondo().setTranslateX(palabra.gettX());
        palabra.getFondo().setTranslateY(palabra.gettY());
    }
    
}
