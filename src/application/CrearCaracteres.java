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

public class CrearCaracteres {
    
    public void leer(String texto) {
        
        int size = texto.length(); // Se guarda el tamaño de la cadena
        char cadena[] = new char[size]; // Se crea un arreglo para guardar los caracteres de la cadena
        for (int i=0;i<=size;i++){ //Se recorre el arreglo
            cadena[i]=texto.charAt(i);
        }
        for (int j=0;j<=size;j++){ //Se lee el arreglo
            System.out.println(cadena[j]+" ");
        }
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
        
        return (fondo);
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
        cubicas1.setLayoutX(29.0);
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
        cubicas2.setLayoutX(35);
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
        cubicas3.setLayoutX(22);
        cubicas3.setLayoutY(34);
        cubicas3.setStartX(-16.19);
        cubicas3.setStartY(17.8);
        cubicas3.setEndX(5.59);
        cubicas3.setEndY(-29.59);
        cubicas3.setControlX1(4);
        cubicas3.setControlY1(22.6);
        cubicas3.setControlX2(-8.4);
        cubicas3.setControlY2(-29.59);
        cubicas3.setFill(Color.TRANSPARENT);
        cubicas3.setStroke(Color.BLACK);
        cubicas3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //cuarta
        cubicas.setLayoutX(5);
        cubicas.setLayoutY(45);
        cubicas.setStartX(-0.30);
        cubicas.setStartY(-32.59);
        cubicas.setEndX(10.8);
        cubicas.setEndY(-32.5900202);
        cubicas.setControlX1(-1.34);
        cubicas.setControlY1(-15.39);
        cubicas.setControlX2(16.4);
        cubicas.setControlY2(-21.4);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_B.getFondo().getChildren().addAll(cubicas,cubicas1,cubicas2,cubicas3);
        return (caracter_B.getFondo());
    }    
    public AnchorPane crear_C() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubicas1 = new CubicCurve();
        CubicCurve cubicas2 = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA 
        cubicas.setLayoutX(25);
        cubicas.setLayoutY(76);
        cubicas.setStartX(8.19);
        cubicas.setStartY(-64.19);
        cubicas.setEndX(5.99);
        cubicas.setEndY(-31.1);
        cubicas.setControlX1(-9.49);
        cubicas.setControlY1(-73.19);
        cubicas.setControlX2(-26.39);
        cubicas.setControlY2(-10.19);
        cubicas.setFill(Color.TRANSPARENT);
        cubicas.setStroke(Color.BLACK);
        cubicas.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //segunda
        cubicas1.setLayoutX(34);
        cubicas1.setLayoutY(44);
        cubicas1.setStartX(-3.2);
        cubicas1.setStartY(1);
        cubicas1.setEndX(-8.39);
        cubicas1.setEndY(-9.2);
        cubicas1.setControlX1(8.19);
        cubicas1.setControlY1(-9.2);
        cubicas1.setControlX2(-5.29);
        cubicas1.setControlY2(-14.0);
        cubicas1.setFill(Color.TRANSPARENT);
        cubicas1.setStroke(Color.BLACK);
        cubicas1.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        //tercera
        cubicas2.setLayoutX(38);
        cubicas2.setLayoutY(18);
        cubicas2.setStartX(-10.59);
        cubicas2.setStartY(-1.2);
        cubicas2.setEndX(-5.2);
        cubicas2.setEndY(-6.39);
        cubicas2.setControlX1(-10.59);
        cubicas2.setControlY1(6.59);
        cubicas2.setControlX2(3.4);
        cubicas2.setControlY2(-1.2);
        cubicas2.setFill(Color.TRANSPARENT);
        cubicas2.setStroke(Color.BLACK);
        cubicas2.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas2.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_C.getFondo().getChildren().addAll(cubicas,cubicas1,cubicas2);
        return (caracter_C.getFondo());
    }
    /*public AnchorPane crear_D(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_E(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_F(){
       
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_G(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_H(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_I(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_J() {
        
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        CubicCurve cubicas2 = new CubicCurve();
        CubicCurve cubicas3 = new CubicCurve();
        //Constructor Caracter
        Caracter caracter_J = new Caracter('J',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_J.getFondo().setLayoutX(250.0); //layouts mientras no esten dentro de un gridpane
        caracter_J.getFondo().setLayoutY(270.0);
        caracter_J.getFondo().setPrefHeight(60.0); //y
        caracter_J.getFondo().setPrefWidth(45.0);  //x 
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
        cubicas.setStroke(Color.BLACK);
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
        cubicas2.setStroke(Color.BLACK);
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
        cubicas3.setStroke(Color.BLACK);
        cubicas3.setStrokeLineCap(StrokeLineCap.ROUND);
        cubicas3.setStrokeLineJoin(StrokeLineJoin.ROUND);
        caracter_J.getFondo().getChildren().addAll(cubicas,cubicas2,cubicas3);
        return (caracter_J.getFondo());
    }
    public AnchorPane crear_K(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_L(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_M(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_N(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_O(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_P(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_Q(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_R(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_S(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_T(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_U(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_V(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_W(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_X(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_Y(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }
    public AnchorPane crear_Z(){
        //Objetos Clase Caracter
        AnchorPane fondo = new AnchorPane();
        Line lineas = new Line();
        QuadCurve cuadraticas = new QuadCurve();
        CubicCurve cubicas = new CubicCurve();
        
        //Constructor Caracter
        Caracter caracter_C = new Caracter('C',fondo,lineas,cuadraticas,cubicas);
        
        //Atributos del Fondo
        caracter_C.getFondo().setLayoutX(300.0); //layouts mientras no esten dentro de un gridpane
        caracter_C.getFondo().setLayoutY(270.0);
        caracter_C.getFondo().setPrefHeight(60.0); //y
        caracter_C.getFondo().setPrefWidth(45.0);  //x  
        
        
        //PRIMERA  
    }*/
        
    

    public AnchorPane crear_Punto(){
        //Objetos
        AnchorPane fondo = new AnchorPane();
        Circle circulo = new Circle();
        
        //Atributos del fondo
        fondo.setLayoutX(300.0);
        fondo.setLayoutY(270.0);
        fondo.setPrefHeight(60.0);
        fondo.setPrefWidth(45.0);
        
        //Circulo
        circulo.setRadius(3);
        circulo.setFill(Color.BLACK);
        circulo.setStroke(Color.BLACK);
        circulo.setLayoutX(9);
        circulo.setLayoutY(47);
        
        fondo.getChildren().addAll(circulo);
        return fondo;
    }
    /*public AnchorPane crear_Coma(){
        //Objetos
        AnchorPane fondo = new AnchorPane();
        Circle circulo = new Circle();
        QuadCurve cuadratica = 
    }*/
}