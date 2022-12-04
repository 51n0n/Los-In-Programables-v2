/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import javafx.scene.layout.AnchorPane;

public class Palabra {
    
    // Atributos
    public AnchorPane fondo;
    public String palabra;
    public String comando;
    public String comando2;
    public double width;
    public double height;
    public int angulo;
    public int tX;
    public int tY;
    public boolean n;
    public boolean k;

    public int getAucont() {
        return aucont;
    }

    public void setAucont(int aucont) {
        this.aucont = aucont;
    }
    public boolean s;
    public boolean v;
    public boolean h;
    public int aucont;
    
    // Métodos
    public Palabra(){
        this.fondo = new AnchorPane();
        this.palabra = "";
        this.comando = "";
        this.comando2 = "";
        this.width = 0;
        this.height = 0;
        this.angulo = 0;
        this.tX = 0;
        this.tY = 0;
        this.n = false;
        this.k = false;
        this.s = false;
        this.v = false;
        this.h = false;
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
    
    public String getComando(){
        return comando;
    }
    
    public void setComando(String comando){
        this.comando = comando;
    }
    
    public String getComando2() {
        return comando2;
    }
    
    public void setComando2(String comando2) {
        this.comando2 = comando2;
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
    
    public int gettX() {
        return tX;
    }
    
    public void settX(int tX) {
        this.tX = tX;
    }
    
    public int gettY() {
        return tY;
    }
    
    public void settY(int tY) {
        this.tY = tY;
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
    
    public boolean isV() {
        return v;
    }
    
    public void setV(boolean v) {
        this.v = v;
    }
    
    public boolean isH() {
        return h;
    }
    
    public void setH(boolean h) {
        this.h = h;
    }
    
}