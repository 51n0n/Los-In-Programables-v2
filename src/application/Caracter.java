/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;

public class Caracter {
    
    //Atributos
    
    private char nombre;
    private AnchorPane fondo;
    private Line lineas;
    private QuadCurve cuadraticas;
    private CubicCurve cubicas;
    private Circle circulo;
    
    //Constructor
    
    public Caracter(char nombre, AnchorPane fondo, Line lineas, QuadCurve cuadraticas, CubicCurve cubicas) {
        this.nombre = nombre;
        this.fondo = fondo;
        this.lineas = lineas;
        this.cuadraticas = cuadraticas;
        this.cubicas = cubicas;
    }
    
    //Setters
    
    public void setNombre(char nombre) {
        this.nombre = nombre;
    }
    
    public void setFondo(AnchorPane fondo) {
        this.fondo = fondo;
    }
    
    public void setLineas(Line lineas) {
        this.lineas = lineas;
    }
    
    public void setCuadraticas(QuadCurve cuadraticas) {
        this.cuadraticas = cuadraticas;
    }
    
    public void setCubicas(CubicCurve cubicas) {
        this.cubicas = cubicas;
    }
    
    //Getters
    
    public char getNombre() {
        return nombre;
    }
    
    public AnchorPane getFondo() {
        return fondo;
    }
    
    public Line getLineas() {
        return lineas;
    }
    
    public QuadCurve getCuadraticas() {
        return cuadraticas;
    }
    
    public CubicCurve getCubicas() {
        return cubicas;
    }
    
}
