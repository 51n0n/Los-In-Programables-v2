/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;

public class CrearCaracteres {
    
    private static AnchorPane lienzo = new AnchorPane();
    
    public AnchorPane leerEntrada() {
        String entrada = "Hola mundo";
        int size = entrada.length(); // Se guarda el tamaño de la cadena
        char[] cadena = new char[size]; // Se crea un arreglo para guardar los caracteres de la cadena
        for (int i=0;i<size;i++){ //Se recorre el arreglo
            cadena[i]=entrada.charAt(i);
        }
        for (int j=0;j<size;j++){ //Se lee el arreglo
            System.out.print(cadena[j]);
        }
        if (validarEntrada(cadena,size)){
            dibujarEntrada(cadena,size);
        }
        else{
            System.out.println("Entrada no válida");
        }
        return lienzo;
    }
    
    public boolean validarEntrada(char[] cadena, int size){
        boolean validar = true;
        for (int i=0;i<size;i++){
            if ((esLetra(cadena[i]))||(esSimbolo(cadena[i]))||(cadena[i] == ' ')){
            }
            else{
                validar = false;
            }
        }
        return validar;
    }
    
    public void dibujarEntrada(char[] cadena, int size){
        

        int espacioEnFila = 23; // Guarda cuanto espacio queda en una fila -1 cada caracter ingresado.
        int letraCont = 0; // Contará las letras en una palabra +1 cada letra ingresada.
        int posActualX = 0; // Guardará la posición X a usar al momento de dibujar.
        int posActualY = 0; // Guardará la posición Y a usar al momento de dibujar.
        
        for (int i=0;i<size;i++){ // Se recorre la cadena
            
            if (esLetra(cadena[i])){
                int j = i;
                while(esLetra(cadena[j])){
                    letraCont++;
                    j++;
                }
                if (letraCont <= espacioEnFila){
                    //dibujar en la misma fila
                    while(i<j){
                        lienzo.getChildren().add(dibujarLetras(cadena[i]));
                        lienzo.getChildren().get(i).setLayoutX(posActualX);
                        lienzo.getChildren().get(i).setLayoutY(posActualY);
                        posActualX++;
                        i++;
                    }
                    i--;
                }
                else{
                    //dibujar en una nueva fila
                    espacioEnFila = 23;
                    posActualX = 0;
                    posActualY++;
                    while(i<j){
                        lienzo.getChildren().add(dibujarLetras(cadena[i]));
                        lienzo.getChildren().get(i).setLayoutX(posActualX);
                        lienzo.getChildren().get(i).setLayoutY(posActualY);
                        posActualX++;
                        i++;
                    }
                    i--;
                }
            }
            else{
                espacioEnFila--;
                letraCont = 0;
                lienzo.getChildren().add(dibujarSimbolos(cadena[i]));
                lienzo.getChildren().get(i).setLayoutX(posActualX);
                lienzo.getChildren().get(i).setLayoutY(posActualY);
                posActualX++;
            }
        }
    }
    
    public AnchorPane dibujarLetras(char caracter){
        
        AnchorPane nuevoNodo = new AnchorPane();
        
        switch (caracter){
            case 'A':
                nuevoNodo = crear_A();
                break;
            case 'B':
                nuevoNodo = crear_B();
                break;
            case 'C':
                break;
            case 'D':
                break;
            case 'E':
                break;
            case 'F':
                break;
            case 'G':
                break;
            case 'H':
                break;
            case 'I':
                break;
            case 'J':
                break;
            case 'K':
                break;
            case 'L':
                break;
            case 'M':
                break;
            case 'N':
                break;
            case 'Ñ':
                break;
            case 'O':
                break;
            case 'P':
                break;
            case 'Q':
                break;
            case 'R':
                break;
            case 'S':
                break;
            case 'T':
                break;
            case 'U':
                break;
            case 'V':
                break;
            case 'W':
                break;
            case 'X':
                break;
            case 'Y':
                break;
            case 'Z':
                break;
            case 'a':
                break;
            case 'b':
                break;
            case 'c':
                break;
            case 'd':
                break;
            case 'e':
                break;
            case 'f':
                break;
            case 'g':
                break;
            case 'h':
                break;
            case 'i':
                break;
            case 'j':
                break;
            case 'k':
                break;
            case 'l':
                break;
            case 'm':
                break;
            case 'n':
                break;
            case 'ñ':
                break;
            case 'o':
                break;
            case 'p':
                break;
            case 'q':
                break;
            case 'r':
                break;
            case 's':
                break;
            case 't':
                break;
            case 'u':
                break;
            case 'v':
                break;
            case 'w':
                break;
            case 'x':
                break;
            case 'y':
                break;
            case 'z':
                break;
        }
        return nuevoNodo;
    }
    
    public AnchorPane dibujarSimbolos(char caracter){
        
        AnchorPane nuevoNodo = new AnchorPane();
        
        switch (caracter){
            case ' ':
                break;
            case '!':
                break;
            case '¡':
                break;
            case '¿':
                break;
            case '?':
                break;
            case '.':
                break;
            case ',':
                break;
            case ';':
                break;
            case ':':
                break;
            case '(':
                break;
            case ')':
                break;
            case '[':
                break;
            case ']':
                break;
            case '{':
                break;
            case '}':
                break;
            case '-':
                break;
            case '_':
                break;
            case 39:
                break;
            case '"':
                break;
            case '«':
                break;
            case '»':
                break;
        }
        return nuevoNodo;
    }
    
    public boolean esLetra(char caracter){
        
        /* Se crea un arreglo que contiene las 27 letras del abecedario español, minúsculas y mayúsculas,
           en orden de mayor frecuencia de uso (según google).*/        
        char[] letras = {'e','a','o','s','r','n','i','d','l','c','t','u','m','p','b','g','v','y','q','h','f','z','j','ñ','x','k','w'
                        ,'E','A','O','S','R','N','I','D','L','C','T','U','M','P','B','G','V','Y','G','H','F','Z','J','Ñ','X','K','W'};
        
        boolean esLetra = false;
        for (int i=0;i<54;i++){
            if (caracter == letras[i]){
                esLetra = true;
            }
        }
        return esLetra;
    }
    
    public boolean esSimbolo(char caracter){
        
        char[] simbolos = {'!','¡','¿','?','.',',',';',':','(',')','[',']','{','}','-','_',39,'"','«','»'};
        
        boolean esSimbolo = false;
        for (int i=0;i<20;i++){
            if (caracter == simbolos[i]){
                esSimbolo = true;
            }
        }
        return esSimbolo;
    }
    
    public AnchorPane crear_A() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line linea = new Line();
        QuadCurve cuadratica = new QuadCurve();
        CubicCurve cubica = new CubicCurve();
        
        //Atributos del Fondo
        fondo.setPrefHeight(60.0); //y
        fondo.setPrefWidth(45.0);  //x      
        
        //Atributos primera linea
        cuadratica.setLayoutX(18.0);
        cuadratica.setLayoutY(60.0);
        cuadratica.setStartX(27.0);
        cuadratica.setStartY(-30.0);
        cuadratica.setEndX(16.75);
        cuadratica.setEndY(-54.0);
        cuadratica.setControlX(2.5);
        cuadratica.setFill(Color.TRANSPARENT);
        cuadratica.setStroke(Color.BLACK);
        cuadratica.setStrokeLineCap(StrokeLineCap.ROUND);
        cuadratica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        linea.setLayoutX(29.0);
        linea.setLayoutY(27.0);
        linea.setStartX(-12.5);
        linea.setStartY(0);
        linea.setEndX(0);
        linea.setEndY(0);
        linea.setFill(Color.TRANSPARENT);
        linea.setStroke(Color.BLACK);
        linea.setStrokeLineCap(StrokeLineCap.ROUND);
        linea.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        cubica.setLayoutX(33.0);
        cubica.setLayoutY(29.0);
        cubica.setStartX(-33.0);
        cubica.setStartY(10.25);
        cubica.setEndX(1.75);
        cubica.setEndY(-20.0);
        cubica.setControlX1(-28.0);
        cubica.setControlY1(35.0);
        cubica.setControlX2(-15.25);
        cubica.setControlY2(-14.75);
        cubica.setFill(Color.TRANSPARENT);
        cubica.setStroke(Color.BLACK);
        cubica.setStrokeLineCap(StrokeLineCap.ROUND);
        cubica.setStrokeLineJoin(StrokeLineJoin.ROUND);
        
        fondo.getChildren().addAll(cuadratica,linea,cubica);
        
        return fondo;
    }
    
    public AnchorPane crear_B() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubicas1 = new CubicCurve();
        CubicCurve cubicas2 = new CubicCurve();
        CubicCurve cubicas3 = new CubicCurve();
        //Constructor Caracter
        Caracter caracter_B = new Caracter('B',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_B.getFondo().setLayoutX(200.0); //layouts mientras no esten dentro de un gridpane
        caracter_B.getFondo().setLayoutY(270.0);
        caracter_B.getFondo().setPrefHeight(60.0); //y
        caracter_B.getFondo().setPrefWidth(45.0);  //x      
        
        //Atributos primera linea pirmera curba de la b
        cubicas1.setLayoutX(27.0);
        cubicas1.setLayoutY(19.0);
        cubicas1.setStartX(-24.3);
        cubicas1.setStartY(-5.8);
        cubicas1.setEndX(-2.8);
        cubicas1.setEndY(9.86);
        cubicas1.setControlX1(-22.59);
        cubicas1.setControlY1(-25);
        cubicas1.setControlX2(34.59);
        cubicas1.setControlY2(-5.8);
        cubicas1.setFill(Color.TRANSPARENT);
        cubicas1.setStroke(Color.BLACK);
        cubicas1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //segunda parte
        cubicas2.setLayoutX(33);
        cubicas2.setLayoutY(38);
        cubicas2.setStartX(-17.19);
        cubicas2.setStartY(11);
        cubicas2.setEndX(-8);
        cubicas2.setEndY(-9);
        cubicas2.setControlX1(-4);
        cubicas2.setControlY1(25.19);
        cubicas2.setControlX2(23.59);
        cubicas2.setControlY2(-1.6);
        cubicas2.setFill(Color.TRANSPARENT);
        cubicas2.setStroke(Color.BLACK);
        cubicas2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //tercera parte
        cubicas3.setLayoutX(33);
        cubicas3.setLayoutY(38);
        cubicas3.setStartX(-17.19);
        cubicas3.setStartY(11);
        cubicas3.setEndX(-8);
        cubicas3.setEndY(-9);
        cubicas3.setControlX1(-4);
        cubicas3.setControlY1(25.19);
        cubicas3.setControlX2(23.59);
        cubicas3.setControlY2(-1.6);
        cubicas3.setFill(Color.TRANSPARENT);
        cubicas3.setStroke(Color.BLACK);
        cubicas3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_B.getFondo().getChildren().addAll(cubicas,cubicas1,cubicas2);
        return (caracter_B.getFondo());
    }
    
}
