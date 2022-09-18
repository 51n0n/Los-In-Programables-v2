/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class Dibujar {
    
    private static AnchorPane lienzo = new AnchorPane(); // Nodo que guardará las letras dibujadas
    private static CrearCaracteres llamar = new CrearCaracteres(); // "Puntero"
    private static Color colorActual = Color.BLACK; // Valor inicial para el color de las letras
    
    public boolean validarEntrada(String entrada){
        boolean validar = true; // Se inicia el retorno en true hasta encontrar una entrada no válida
        int size = entrada.length(); // Se guarda el tamaño de la cadena ingresada
        
        for (int i=0;i<size;i++){ // Se recorre el arreglo buscando entradas no validas
            if ((esLetra(entrada.charAt(i)))||(esSimbolo(entrada.charAt(i)))||(entrada.charAt(i) == ' ')){
            } // Las entradas deben ser letras, simbolos, o un espacio
            else{ // Si se encuentra algo distinto entonces el retorno será false y se terminará el ciclo
                validar = false;
                break;
            }
        }
        return validar;
    }
    
    public void dibujarEntrada(String entrada){
        
        lienzo.setLayoutX(30); // Posición (0,0) para las letras
        lienzo.setLayoutY(60);
        lienzo.setPrefSize(1035, 450);
        int size = entrada.length(); // Se guarda el tamaño de la cadena ingresada
        char[] cadena = new char[size]; // Se crea un arreglo de caracteres del tamaño de la cadena ingresada
        
        for (int i=0;i<size;i++){ //Se recorre el arreglo y se guardan los caracteres en las posiciones del arreglo
            cadena[i]=entrada.charAt(i);
        }
        //1035x450
        double espacioEnFila = 1035; // Guarda cuanto espacio queda en una fila.
        double letraCont = 0; // Contará el espacio a usar de las letras de una palabra.
        double posActualX = 0; // Guardará la posición X a usar al momento de dibujar.
        double posActualY = 0; // Guardará la posición Y a usar al momento de dibujar.
        
        for (int i=0;i<size;i++){ // Se recorre la cadena
            if (esLetra(cadena[i])){ // Si el caracter es una letra
                int j = i; // Guardamos el contador en j para no alterar i
                while(j<size){ // Recorremos la palabra actual (una cantidad de letras seguidas)
                    if (esLetra(cadena[j])){ // Buscamos el tamaño que ocupará la palabra
                        letraCont = letraCont + tamañoCaracter(cadena[j]);
                        System.out.println(letraCont);
                        j++;
                    }
                    else{ // Cuando se encuentre algo distinto a una letra (simbolo o espacio) se finaliza el ciclo
                        break;
                    }
                }
                if (letraCont <= espacioEnFila){ // Se dibuja en la fila actual si el tamaño de la palabra es menor al disponible
                    //dibujar en la misma fila
                    while(i<j){ // Desde el inicio al final de la palabra
                        lienzo.getChildren().add(dibujarLetras(cadena[i])); // Se agrega el nodo
                        lienzo.getChildren().get(i).setLayoutX(posActualX); // Posición X para el nodo
                        lienzo.getChildren().get(i).setLayoutY(posActualY); // Posición Y para el nodo
                        posActualX = posActualX + tamañoCaracter(cadena[i]); // Aumento de la posición X por el espacio usado
                        espacioEnFila = espacioEnFila - tamañoCaracter(cadena[i]); // Se resta el espacio usado al disponible
                        i++; // Siguiente caracter
                    }
                }
                else{ // Si el tamaño de la palabra es mayor al espacio disponible
                    //dibujar en una nueva fila
                    espacioEnFila = 1035; // Se reestablece el espacio disponible
                    posActualX = 0; // Se posiciona la X al inicio
                    posActualY = posActualY + 60; // Se aumenta la Y para una nueva fila
                    while(i<j){
                        lienzo.getChildren().add(dibujarLetras(cadena[i])); // Se agrega el nodo
                        lienzo.getChildren().get(i).setLayoutX(posActualX); // Posición X para el nodo
                        lienzo.getChildren().get(i).setLayoutY(posActualY); // Posición Y para el nodo
                        posActualX = posActualX + tamañoCaracter(cadena[i]); // Aumento de la posición X por el espacio usado
                        espacioEnFila = espacioEnFila - tamañoCaracter(cadena[i]); // Se resta el espacio usado al disponible
                        i++; // Siguiente caracter
                    }
                }
                i--; // Se resta 1 al contador que es la posición del siguiente caracter
            }
            else{ // Si no es letra
                letraCont = 0; // No hay letras, así que el contador de palabras debe ser cero, y se dibujará de inmediato
                if (tamañoCaracter(cadena[i]) > espacioEnFila){ // Si el caracter usa más espacio que el disponible se usa una nueva fila
                    espacioEnFila = 1035;
                    posActualY = posActualY + 60;
                    posActualX = 0;
                }
                lienzo.getChildren().add(dibujarSimbolos(cadena[i])); // Se agrega el nodo
                lienzo.getChildren().get(i).setLayoutX(posActualX); // Posición X para el nodo
                lienzo.getChildren().get(i).setLayoutY(posActualY); // Posición Y para el nodo
                espacioEnFila = espacioEnFila - tamañoCaracter(cadena[i]); // Aumento de la posición X por el espacio usado
                posActualX = posActualX + tamañoCaracter(cadena[i]); // Se resta el espacio usado al disponible
            }
        }
        
    }
    
    public AnchorPane dibujarLetras(char caracter){
        
        AnchorPane nuevoNodo = new AnchorPane(); // Objeto para el retorno
        
        switch (caracter){ // Este switch recibe el caracter que se va a dibujar y llama al método del caracter correspondiente
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
        
        AnchorPane nuevoNodo = new AnchorPane(); // Objeto para el retorno
        
        switch (caracter){ // Este switch recibe el caracter que se va a dibujar y llama al método del caracter correspondiente
            case ' ':
                // Nodo vacío para Espacio
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
        
        boolean esLetra = false; // Se inicializa el retorno en false hasta encontrar la letra
        for (int i=0;i<54;i++){ // Se recorre el arreglo
            if (caracter == letras[i]){ // Si el caracter es igual a un caracter de la lista entonces es letra
                esLetra = true;
            }
        }
        return esLetra;
    }
    
    public boolean esSimbolo(char caracter){
        
        char[] simbolos = {'!','¡','¿','?','.',',',';',':','(',')','[',']','{','}','-','_',39,'"','«','»'};
        // Se usa el código ascii 39 para la comilla simple, ya que el compilador no permite poner el caracter entre comillas simples
        boolean esSimbolo = false; // Se inicializa el retorno en false hasta encontrar el símbolo
        for (int i=0;i<20;i++){ // Se recorre el arreglo
            if (caracter == simbolos[i]){ // Si el caracter es igual a un caracter de la lista entonces es símbolo
                esSimbolo = true;
            }
        }
        return esSimbolo;
    }
    
    public double tamañoCaracter(char caracter){
        // Retorna el tamaño que usarán los caracteres al momento de dibujar
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
    
    public static AnchorPane getLienzo() { // Getter de lienzo
        return lienzo;
    }
    
    public static void setColor(Color nuevoColor){ // Setter del color de las letras
        colorActual = nuevoColor;
    }
    
    public static Color getColor(){ // Getter del color de las letras
        return colorActual;
    }
    
}
