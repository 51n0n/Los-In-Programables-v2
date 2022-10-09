/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.ArrayList;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class Dibujar {
    
    private static AnchorPane lienzo = new AnchorPane(); // Nodo que guardará las letras dibujadas
    private static CrearCaracteres llamar = new CrearCaracteres(); // "Puntero"
    private static Color colorActual = Color.BLACK; // Valor inicial para el color de las letras
    
    private static double espacioEnFila;
    private static double letraCont;
    private static double posActualX;
    private static double posActualY;
    
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
    
    public void guardarPalabras(String entrada){
        
        // Posición y tamaño del fondo de dibujo
        lienzo.setLayoutX(30);
        lienzo.setLayoutY(60);
        lienzo.setPrefSize(1035, 450);
        
        reiniciarVariables();
        int cont = 0;
        
        ArrayList<Palabra> palabras = new ArrayList<>();
        
        for (int i=0;i<entrada.length();i++){
            
            palabras.add(new Palabra(false,false,false));
            
            if (entrada.charAt(i) != ' '){
                int j = i;
                while (j<entrada.length()){
                    if (entrada.charAt(j) != ' '){
                        j++;
                    }
                    else{
                        break;
                    }
                }
                
                palabras.get(cont).setPalabra(entrada.substring(i, j));
                i = j-1;
            }
            else{
                palabras.get(cont).setPalabra(" ");
            }
            cont++;
        }
        System.out.println("1");
        for (int i=0;i<palabras.size();i++){
            System.out.println(palabras.get(i).getPalabra());
        }
        
        for (int i=0;i<palabras.size();i++){ // Comprobaremos los comandos que puedan tener cada palabra
            
            String p = palabras.get(i).getPalabra();
            cont = i;
            
            if (p.charAt(0) == '^'){ // Si el primer caracter es sombrero
                // Cambio de Estilo
                boolean salir = false;
                int j;
                for (j=1;j<p.length() && !salir && cont<palabras.size();j++){
                    switch (p.charAt(j)){
                        case 'N':
                            palabras.get(cont).setN(true);
                            break;
                        case 'K':
                            palabras.get(cont).setK(true);
                            break;
                        case 'S':
                            palabras.get(cont).setS(true);
                            break;
                        case 'T':
                            break;
                        case ',':
                            if (cont+1<palabras.size()){
                                cont++;
                            }
                            break;
                        case '+':
                            break;
                        default:
                            while(p.charAt(j-1) == ',' || p.charAt(j-1) == '+'){
                                j--;
                            }
                            salir = true;
                            j--;
                            break;
                    }
                    /*
                    if ( (p.charAt(j+1) == ',' || p.charAt(j+1) == '+') && !salir ){
                        if (p.charAt(j+1) == ','){
                            cont++;
                        }
                        j++;
                    }
                    else{
                        salir = true;
                    }
                    */
                }
                if (j > 1){
                    palabras.get(i).setPalabra(p.substring(j)); // Se elimina la cadena de comando de la palabra
                    // Elimina desde 0 hasta j reemplazando por la cadena desde j+1 hasta el final
                }
            }
        }
        System.out.println("2");
        for (int i=0;i<palabras.size();i++){
            System.out.println(palabras.get(i).getPalabra());
        }
        
        /*
        // Al terminar este ciclo tenemos un arreglo de palabras sin caracteres de comando, listo para dibujar
        // Además cada palabra tiene sus estilos asignados por los comandos anteriores
        cont = 0;
        for (int i=0;i<palabras.size();i++){
            for (int j=0;j<palabras.get(i).getPalabra().length();j++){
                
                lienzo.getChildren().add(dibujarLetras(palabras.get(i).getPalabra().charAt(j)));
                lienzo.getChildren().get(cont).setLayoutX(posActualX);
                lienzo.getChildren().get(cont).setLayoutY(posActualY);
                posActualX = posActualX + tamañoCaracter(palabras.get(i).getPalabra().charAt(j));
                espacioEnFila = espacioEnFila - tamañoCaracter(palabras.get(i).getPalabra().charAt(j));
                cont++;
            }
        }
        */
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
        
        reiniciarVariables();
        
        for (int i=0;i<size;i++){ // Se recorre la cadena
            if (esLetra(cadena[i])){ // Si el caracter es una letra
                int j = i; // Guardamos el contador en j para no alterar i
                while(j<size){ // Recorremos la palabra actual (una cantidad de letras seguidas)
                    if (esLetra(cadena[j])){ // Buscamos el tamaño que ocupará la palabra
                        letraCont = letraCont + tamañoCaracter(cadena[j]);
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
                nuevoNodo = llamar.crear_a();
                break;
            case 'b':
                nuevoNodo = llamar.crear_b();
                break;
            case 'c':
                nuevoNodo = llamar.crear_c();
                break;
            case 'd':
                nuevoNodo = llamar.crear_d();
                break;
            case 'e':
                nuevoNodo = llamar.crear_e();
                break;
            case 'f':
                nuevoNodo = llamar.crear_f();
                break;
            case 'g':
                nuevoNodo = llamar.crear_g();
                break;
            case 'h':
                nuevoNodo = llamar.crear_h();
                break;
            case 'i':
                nuevoNodo = llamar.crear_i();
                break;
            case 'j':
                nuevoNodo = llamar.crear_j();
                break;
            case 'k':
                nuevoNodo = llamar.crear_k();
                break;
            case 'l':
                nuevoNodo = llamar.crear_l();
                break;

            case 'm':
                nuevoNodo = llamar.crear_m();
                break;
            case 'n':
                nuevoNodo = llamar.crear_n();
                break;
            case 'ñ':
                nuevoNodo = llamar.crear_ñ();
                break;
            case 'o':
                nuevoNodo = llamar.crear_o();
                break;
            case 'p':
                nuevoNodo = llamar.crear_p();
                break;
            case 'q':
                nuevoNodo = llamar.crear_q();
                break;
            case 'r':
                nuevoNodo = llamar.crear_r();
                break;
            case 's':
                nuevoNodo = llamar.crear_s();
                break;
            case 't':
                nuevoNodo = llamar.crear_t();
                break;
            case 'u':
                nuevoNodo = llamar.crear_u();
                break;
            case 'v':
                nuevoNodo = llamar.crear_v();
                break;
            case 'w':
                nuevoNodo = llamar.crear_w();
                break;
            case 'x':
                nuevoNodo = llamar.crear_x();
                break;
            case 'y':
                nuevoNodo = llamar.crear_y();
                break;
            case 'z':
                nuevoNodo = llamar.crear_z();
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
    
    public void reiniciarVariables(){
        espacioEnFila = 1035; // Guarda cuanto espacio queda en una fila.
        letraCont = 0; // Contará el espacio a usar de las letras de una palabra.
        posActualX = 0; // Guardará la posición X a usar al momento de dibujar.
        posActualY = 0; // Guardará la posición Y a usar al momento de dibujar.
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
        double tamaño;
        // Retorna el tamaño que usarán los caracteres al momento de dibujar
        switch(caracter){
            case 'a':
                tamaño = 20;
                break;
            case 'b':
                tamaño = 22;
                break;
            case 'c':
                tamaño = 18;
                break;
            case 'd':
                tamaño = 18;
                break;
            case 'e':
                tamaño = 12;
                break;
            case 'f':
                tamaño = 24;
                break;
            case 'g':
                tamaño = 19;
                break;
            case 'h':
                tamaño = 15;
                break;
            case 'i':
                tamaño = 16;
                break;
            case 'j':
                tamaño = 12;
                break;
            case 'k':
                tamaño = 20;
                break;
            case 'l':
                tamaño = 20;
                break;
            case 'm':
                tamaño = 44;
                break;
            case 'n':
                tamaño = 34;
                break;
            case 'ñ':
                tamaño = 34;
                break;
            case 'o':
                tamaño = 22;
                break;
            case 'p':
                tamaño = 34;
                break;
            case 'q':
                tamaño = 32;
                break;
            case 'r':
                tamaño = 24;
                break;
            case 's':
                tamaño = 28;
                break;
            case 't':
                tamaño = 22;
                break;
            case 'u':
                tamaño = 22;
                break;
            case 'v':
                tamaño = 22;
                break;
            case 'w':
                tamaño = 38;
                break;
            case 'x':
                tamaño = 26;
                break;
            case 'y':
                tamaño = 26;
                break;
            case 'z':
                tamaño = 26;
                break;
            case '.':
                tamaño = 22;
                break;
            case ',':
                tamaño = 22;
                break;
            case ';':
                tamaño = 22;
                break;
            case ':':
                tamaño = 22;
                break;
            case 39:
                tamaño = 22;
                break;
            case '"':
                tamaño = 22;
                break;
            case '«':
                tamaño = 30;
                break;
            case '»':
                tamaño = 30;
                break;
            case '(':
                tamaño = 22;
                break;
            case ')':
                tamaño = 22;
                break;
            case '[':
                tamaño = 34;
                break;
            case ']':
                tamaño = 34;
                break;
            case '{':
                tamaño = 34;
                break;
            case '}':
                tamaño = 34;
                break;
            case '-':
                tamaño = 34;
                break;
            case '_':
                tamaño = 34;
                break;
            case '¿':
                tamaño = 34;
                break;
            case '?':
                tamaño = 34;
                break;
            case '¡':
                tamaño = 34;
                break;
            case '!':
                tamaño = 34;
                break;
            default:
                tamaño = 45;
                break;
        }
        return tamaño;
    }
    
    public AnchorPane getLienzo() { // Getter de lienzo
        return lienzo;
    }
    
    public void setColor(Color nuevoColor){ // Setter del color de las letras
        colorActual = nuevoColor;
    }
    
    public static Color getColor(){ // Getter del color de las letras
        return colorActual;
    }
    
}
