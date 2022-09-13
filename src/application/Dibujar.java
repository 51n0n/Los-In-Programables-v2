/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import javafx.scene.layout.AnchorPane;

public class Dibujar {
    
    private static AnchorPane lienzo = new AnchorPane();
    private static CrearCaracteres llamar = new CrearCaracteres();
    
    public boolean validarEntrada(String entrada){
        boolean validar = true;
        int size = entrada.length();
        char[] cadena = new char[size];
        
        for (int i=0;i<size;i++){ //Se recorre el arreglo y se guardan los caracteres en las posiciones del arreglo "cadena"
            cadena[i]=entrada.charAt(i);
        }
        
        for (int i=0;i<size;i++){
            if ((esLetra(cadena[i]))||(esSimbolo(cadena[i]))||(cadena[i] == ' ')){
            }
            else{
                validar = false;
            }
        }
        return validar;
    }
    
    public void dibujarEntrada(String entrada){
        
        lienzo.setLayoutX(30);
        lienzo.setLayoutY(60);
        lienzo.setPrefSize(1035, 450);
        int size = entrada.length();
        char[] cadena = new char[size];
        boolean salir;
        
        for (int i=0;i<size;i++){ //Se recorre el arreglo y se guardan los caracteres en las posiciones del arreglo "cadena"
            cadena[i]=entrada.charAt(i);
        }
        //1035x450
        double espacioEnFila = 1035; // Guarda cuanto espacio queda en una fila.
        double letraCont = 0; // Contará el espacio a usar de las letras de una palabra.
        double posActualX = 0; // Guardará la posición X a usar al momento de dibujar.
        double posActualY = 0; // Guardará la posición Y a usar al momento de dibujar.
        
        for (int i=0;i<size;i++){ // Se recorre la cadena
            salir = false;
            if (esLetra(cadena[i])){
                int j = i;
                while(j<size && salir==false){
                    if (esLetra(cadena[j])){
                        letraCont = letraCont + tamañoCaracter(cadena[j]);
                        System.out.println(letraCont);
                        j++;
                    }
                    else{
                        salir=true;
                    }
                }
                if (letraCont <= espacioEnFila){
                    //dibujar en la misma fila
                    while(i<j){
                        System.out.println(posActualX+" "+i);
                        lienzo.getChildren().add(dibujarLetras(cadena[i]));
                        lienzo.getChildren().get(i).setLayoutX(posActualX);
                        lienzo.getChildren().get(i).setLayoutY(posActualY);
                        posActualX = posActualX + tamañoCaracter(cadena[i]);
                        espacioEnFila = espacioEnFila - tamañoCaracter(cadena[i]);
                        System.out.println(posActualX+" "+i);
                        i++;
                    }
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
                        posActualX = posActualX + tamañoCaracter(cadena[i]);
                        espacioEnFila = espacioEnFila - tamañoCaracter(cadena[i]);
                        i++;
                    }
                }
                i--;
            }
            else{
                letraCont = 0;
                if (tamañoCaracter(cadena[i]) > espacioEnFila){
                    posActualY = posActualY + 60;
                    posActualX = 0;
                }
                lienzo.getChildren().add(dibujarSimbolos(cadena[i]));
                lienzo.getChildren().get(i).setLayoutX(posActualX);
                lienzo.getChildren().get(i).setLayoutY(posActualY);
                espacioEnFila = espacioEnFila - tamañoCaracter(cadena[i]);
                posActualX = posActualX + tamañoCaracter(cadena[i]);
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
                nuevoNodo = llamar.crear_C();
                break;
            case 'D':
                nuevoNodo = llamar.crear_D();
                break;
            case 'E':
                nuevoNodo = llamar.crear_E();
                break;
            case 'F':
                nuevoNodo = llamar.crear_F();
                break;
            case 'G':
                nuevoNodo = llamar.crear_G();
                break;
            case 'H':
                nuevoNodo = llamar.crear_H();
                break;
            case 'I':
                nuevoNodo = llamar.crear_I();
                break;
            case 'J':
                nuevoNodo = llamar.crear_J();
                break;
            case 'K':
                nuevoNodo = llamar.crear_K();
                break;
            case 'L':
                nuevoNodo = llamar.crear_L();
                break;
            case 'M':
                nuevoNodo = llamar.crear_M();
                break;
            case 'N':
                nuevoNodo = llamar.crear_N();
                break;
            case 'Ñ':
                nuevoNodo = llamar.crear_Ñ();
                break;
            case 'O':
                nuevoNodo = llamar.crear_O();
                break;
            case 'P':
                nuevoNodo = llamar.crear_P();
                break;
            case 'Q':
                nuevoNodo = llamar.crear_Q();
                break;
            case 'R':
                nuevoNodo = llamar.crear_R();
                break;
            case 'S':
                nuevoNodo = llamar.crear_S();
                break;
            case 'T':
                nuevoNodo = llamar.crear_T();
                break;
            case 'U':
                nuevoNodo = llamar.crear_U();
                break;
            case 'V':
                nuevoNodo = llamar.crear_V();
                break;
            case 'W':
                nuevoNodo = llamar.crear_W();
                break;
            case 'X':
                nuevoNodo = llamar.crear_X();
                break;
            case 'Y':
                nuevoNodo = llamar.crear_Y();
                break;
            case 'Z':
                nuevoNodo = llamar.crear_Z();
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
                nuevoNodo = llamar.crear_exclamacionFinal();
                break;
            case '¡':
                nuevoNodo = llamar.crear_exclamacionInicial();
                break;
            case '¿':
                nuevoNodo = llamar.crear_interrogacionInicial();
                break;
            case '?':
                nuevoNodo = llamar.crear_interrogacionFinal();
                break;
            case '.':
                nuevoNodo = llamar.crear_Punto();
                break;
            case ',':
                nuevoNodo = llamar.crear_Coma();
                break;
            case ';':
                nuevoNodo = llamar.crear_PuntoyComa();
                break;
            case ':':
                nuevoNodo = llamar.crear_DosPuntos();
                break;
            case '(':
                nuevoNodo = llamar.crear_ParentesisInicio();
                break;
            case ')':
                nuevoNodo = llamar.crear_ParentesisFinal();
                break;
            case '[':
                nuevoNodo = llamar.crear_CorcheteInicio();
                break;
            case ']':
                nuevoNodo = llamar.crear_CorcheteFinal();
                break;
            case '{':
                nuevoNodo = llamar.crear_LlaveInicial();
                break;
            case '}':
                nuevoNodo = llamar.crear_LlaveFinal();
                break;
            case '-':
                nuevoNodo = llamar.crear_Guion();
                break;
            case '_':
                nuevoNodo = llamar.crear_GuionBajo();
                break;
            case 39:
                nuevoNodo = llamar.crear_ComillaSimple();
                break;
            case '"':
                nuevoNodo = llamar.crear_ComillasDoble();
                break;
            case '«':
                nuevoNodo = llamar.crear_ComillasEspañolaInicio();
                break;
            case '»':
                nuevoNodo = llamar.crear_ComillasEspañolaFinal();
                break;
        }
        return nuevoNodo;
    }
    
    public boolean esLetra(char caracter){
        
        /* Se crea un arreglo que contiene las 27 letras del abecedario español, minúsculas y mayúsculas,
           en orden de mayor frecuencia de uso (según google).*/        
        char[] letras = {'e','a','o','s','r','n','i','d','l','c','t','u','m','p','b','g','v','y','q','h','f','z','j','ñ','x','k','w'
                        ,'E','A','O','S','R','N','I','D','L','C','T','U','M','P','B','G','V','Y','Q','H','F','Z','J','Ñ','X','K','W'};
        
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
    
    public double tamañoCaracter(char caracter){
        
        if((caracter == '!')||(caracter == '¡')){
            return 22;
        }
        else if(caracter == 'i'){
            return 34;
        }
        else{
            return 45;
        }
    }
    
    public static AnchorPane getLienzo() {
        return lienzo;
    }
    
}
