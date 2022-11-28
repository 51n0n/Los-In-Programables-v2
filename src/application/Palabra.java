/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import javafx.scene.layout.AnchorPane;

public class Palabra {
    
    // Atributos
    public AnchorPane fondo = new AnchorPane();
    public String palabra = new String();
    public String comando = new String();
    public String comando2 = new String();
    public double width;
    public double height;
    public boolean n;
    public boolean k;
    public boolean s;
    public boolean A =false;
    public boolean a =false;
    public int angulo;
    
    // Métodos
    public Palabra(boolean n, boolean k, boolean s){
        this.n = n;
        this.k = k;
        this.s = s;
        this.palabra = "";
        this.comando = "";
        this.comando2 = "";
    }
    
    public boolean esEspacio(){
        return " ".equals(palabra);
    }
    
    public AnchorPane getFondo() {
        return fondo;
    }
    
    public void setFondo(AnchorPane fondo) {
        this.fondo = fondo;
    }
    
    public String getPalabra(){
        return palabra;
    }
    
    public void setPalabra(String palabra){
        this.palabra = palabra;
    }
    
    public String getComando2() {
        return comando2;
    }
    
    public void setComando2(String comando2) {
        this.comando2 = comando2;
    }
    
    public String getComando(){
        return comando;
    }
    
    public void setComando(String comando){
        this.comando = comando;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public int getAngulo() {
        return angulo;
    }
    
    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }
    
    public boolean isN(){
        return n;
    }
    
    public void setN(boolean n){
        this.n = n;
    }
    
    public boolean isK(){
        return k;
    }
    
    public void setK(boolean k){
        this.k = k;
    }
    
    public boolean isS(){
        return s;
    }
    
    public void setS(boolean s){
        this.s = s;
    }
    
    public boolean isA(){
        return A;
    }
    
    public void setA(boolean A){
        this.A = A;
    }
    
    public boolean isa(){
        return a;
    }
    
    public void seta(boolean a){
        this.a = a;
    }
}
