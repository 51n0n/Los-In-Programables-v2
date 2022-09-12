/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import javafx.scene.layout.AnchorPane;

public class Dibujar {
    
    private static AnchorPane lienzo = new AnchorPane();
    private static CrearCaracteres llamar = new CrearCaracteres();
    
    public AnchorPane leerEntrada() {
        String entrada = "Hola mundo";
        int size = entrada.length(); // Se guarda el tamaño de la cadena completa en "size"
        char[] cadena = new char[size]; // Se crea un arreglo de caracteres "cadena" con tamaño "size"
        for (int i=0;i<size;i++){ //Se recorre el arreglo y se guardan los caracteres en las posiciones del arreglo "cadena"
            cadena[i]=entrada.charAt(i);
        }
        for (int j=0;j<size;j++){ //Se lee el arreglo
            System.out.print(cadena[j]);
        }
        if (validarEntrada(cadena,size)){ // Se llama a la funcion validarEntrada y solo se dibujará si la entrada es válida
            dibujarEntrada(cadena,size); //
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
        
        //1035x450
        double espacioEnFila = 1035; // Guarda cuanto espacio queda en una fila.
        double letraCont = 0; // Contará el espacio a usar de las letras de una palabra.
        double posActualX = 0; // Guardará la posición X a usar al momento de dibujar.
        double posActualY = 0; // Guardará la posición Y a usar al momento de dibujar.
        
        for (int i=0;i<size;i++){ // Se recorre la cadena
            
            if (esLetra(cadena[i])){
                int j = i;
                while(esLetra(cadena[j])){
                    letraCont = letraCont + dibujarLetras(cadena[j]).getPrefWidth();
                    j++;
                }
                if (letraCont <= espacioEnFila){
                    //dibujar en la misma fila
                    while(i<j){
                        lienzo.getChildren().add(dibujarLetras(cadena[i]));
                        lienzo.getChildren().get(i).setLayoutX(posActualX);
                        lienzo.getChildren().get(i).setLayoutY(posActualY);
                        posActualX = posActualX + lienzo.getChildren().get(i).getLayoutX();
                        espacioEnFila = espacioEnFila - lienzo.getChildren().get(i).getLayoutX();
                        i++;
                    }
                    i--;
                }
                else{
                    //dibujar en una nueva fila
                    espacioEnFila = 1035;
                    posActualX = 0;
                    posActualY = posActualY + 60;
                    while(i<j){
                        lienzo.getChildren().add(dibujarLetras(cadena[i]));
                        lienzo.getChildren().get(i).setLayoutX(posActualX);
                        lienzo.getChildren().get(i).setLayoutY(posActualY);
                        posActualX = posActualX + lienzo.getChildren().get(i).getLayoutX();
                        espacioEnFila = espacioEnFila - lienzo.getChildren().get(i).getLayoutX();
                        i++;
                    }
                    i--;
                }
            }
            else{ // falta condicional si hay espacio para el simbolo
                letraCont = 0;
                if ((lienzo.getChildren().get(i).getLayoutX()) > espacioEnFila){
                    posActualY = posActualY + 60;
                }
                lienzo.getChildren().add(dibujarSimbolos(cadena[i]));
                lienzo.getChildren().get(i).setLayoutX(posActualX);
                lienzo.getChildren().get(i).setLayoutY(posActualY);
                espacioEnFila = espacioEnFila - lienzo.getChildren().get(i).getLayoutX();
                posActualX = posActualX + lienzo.getChildren().get(i).getLayoutX();
            }
        }
    }
    
    public AnchorPane dibujarLetras(char caracter){
        
        AnchorPane nuevoNodo = new AnchorPane();
        
        switch (caracter){
            case 'A':
                nuevoNodo = llamar.crear_A();
                break;
            case 'B':
                nuevoNodo = llamar.crear_B();
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
