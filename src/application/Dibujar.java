/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import javafx.scene.layout.AnchorPane;
import static application.CrearCaracteres.*;

public class Dibujar {
    
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
}
