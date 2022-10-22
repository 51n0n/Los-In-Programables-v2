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
    
    public void subrayado(char c, AnchorPane fondo){
        Line sub = new Line();
        sub.setStartX(dibujar.tamañoCaracter(c));
        sub.setLayoutX(0);
        sub.setLayoutY(55);
        sub.setStroke(dibujar.getColor());
        fondo.getChildren().add(sub);
    }
    
    public void lineaControl(Line linea, AnchorPane fondo){
        Circle p1 = new Circle(linea.getStartX(),linea.getStartY(),2,Color.RED);
        p1.setLayoutX(linea.getLayoutX());
        p1.setLayoutY(linea.getLayoutY());
        Circle p2 = new Circle(linea.getEndX(),linea.getEndY(),2,Color.RED);
        p2.setLayoutX(linea.getLayoutX());
        p2.setLayoutY(linea.getLayoutY());
        
        fondo.getChildren().addAll(p1,p2);
    }
    
    public void cuadraticaControl(QuadCurve cuadratica, AnchorPane fondo){
        Circle p1 = new Circle(cuadratica.getStartX(),cuadratica.getStartY(),2,Color.RED);
        p1.setLayoutX(cuadratica.getLayoutX());
        p1.setLayoutY(cuadratica.getLayoutY());
        Circle p2 = new Circle(cuadratica.getControlX(),cuadratica.getControlY(),2,Color.RED);
        p2.setLayoutX(cuadratica.getLayoutX());
        p2.setLayoutY(cuadratica.getLayoutY());
        Circle p3 = new Circle(cuadratica.getEndX(),cuadratica.getEndY(),2,Color.RED);
        p3.setLayoutX(cuadratica.getLayoutX());
        p3.setLayoutY(cuadratica.getLayoutY());
        
        fondo.getChildren().addAll(p1,p2,p3);
    }
    
    public void cubicaControl(CubicCurve cubica, AnchorPane fondo){
        Circle p1 = new Circle(cubica.getStartX(),cubica.getStartY(),2,Color.RED);
        p1.setLayoutX(cubica.getLayoutX());
        p1.setLayoutY(cubica.getLayoutY());
        Circle p2 = new Circle(cubica.getControlX1(),cubica.getControlY1(),2,Color.RED);
        p2.setLayoutX(cubica.getLayoutX());
        p2.setLayoutY(cubica.getLayoutY());
        Circle p3 = new Circle(cubica.getControlX2(),cubica.getControlY2(),2,Color.RED);
        p3.setLayoutX(cubica.getLayoutX());
        p3.setLayoutY(cubica.getLayoutY());
        Circle p4 = new Circle(cubica.getEndX(),cubica.getEndY(),2,Color.RED);
        p4.setLayoutX(cubica.getLayoutX());
        p4.setLayoutY(cubica.getLayoutY());
        
        fondo.getChildren().addAll(p1,p2,p3,p4);
    }
    
}
