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
    private static final CrearCaracteres llamar = new CrearCaracteres(); // Objeto clase CrearCaracteres
    private static Color colorActual = Color.BLACK; // Valor inicial para el color de las letras
    private static Color colorControl = Color.RED;
    private static boolean puntosControl = false;
    
    private static double espacioEnFila;
    private static int charCont;
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
    
    public void guardarPalabras(String entrada, AnchorPane lienzo){
        
        double fila = lienzo.getWidth() - 34;
        
        espacioEnFila = fila; // Guarda cuanto espacio queda en una fila.
        charCont = 0; // Contador de caracteres dibujados.
        posActualX = 0; // Guardará la posición X a usar al momento de dibujar.
        posActualY = 0; // Guardará la posición Y a usar al momento de dibujar.
        
        int cont = 0;
        
        ArrayList<Palabra> palabras = new ArrayList<>();
        
        // Se guardan palabras y espacios
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
        
        boolean r = false;
        // Comprobaremos los comandos de cada palabra
        for (int i=0;i<palabras.size();i++){
            String p = palabras.get(i).getPalabra();
            cont = i;
            if (p.charAt(0) == '^'){ // Si el primer caracter es ^
                boolean salir = false;
                int j;
                for (j=1;j<p.length() && !salir && cont<palabras.size();j++){
                    switch (p.charAt(j)){
                        case 'N':
                            if (j+1 < p.length() && cont > 0){
                                if ((p.charAt(j+1) == ',' || p.charAt(j-1) == ',') && !palabras.get(cont-1).isN()){
                                    do{
                                        cont--;
                                    }while (" ".equals(palabras.get(cont).getPalabra()) && !palabras.get(cont).isN());
                                }
                            }
                            else if(j-1 > 0 && cont > 0){
                                if (p.charAt(j-1) == ',' && !palabras.get(cont-1).isN()){
                                    do{
                                        cont--;
                                    }while (" ".equals(palabras.get(cont).getPalabra()) && !palabras.get(cont).isN());
                                }
                            }
                            if (p.charAt(j-1) == 'N' || p.charAt(j-1) == 'K' || p.charAt(j-1) == 'S'){
                                j--;
                                salir = true;
                            }
                            else{
                                palabras.get(cont).setN(true);
                            }
                            break;
                        case 'K':
                            if (j+1 < p.length() && cont > 0){
                                if ((p.charAt(j+1) == ',' || p.charAt(j-1) == ',') && !palabras.get(cont-1).isK()){
                                    do{
                                        cont--;
                                    }while (" ".equals(palabras.get(cont).getPalabra()) && !palabras.get(cont).isK());
                                }
                            }
                            else if(j-1 > 0 && cont > 0){
                                if (p.charAt(j-1) == ',' && !palabras.get(cont-1).isK()){
                                    do{
                                        cont--;
                                    }while (" ".equals(palabras.get(cont).getPalabra()) && !palabras.get(cont).isK());
                                }
                            }
                            if (p.charAt(j-1) == 'N' || p.charAt(j-1) == 'K' || p.charAt(j-1) == 'S'){
                                j--;
                                salir = true;
                            }
                            else{
                                palabras.get(cont).setK(true);
                            }
                            break;
                        case 'S':
                            if (j+1 < p.length() && cont > 0){
                                if ((p.charAt(j+1) == ',' || p.charAt(j-1) == ',') && !palabras.get(cont-1).isS()){
                                    do{
                                        cont--;
                                    }while (" ".equals(palabras.get(cont).getPalabra()) && !palabras.get(cont).isS());
                                }
                            }
                            else if(j-1 > 0 && cont > 0){
                                if (p.charAt(j-1) == ',' && !palabras.get(cont-1).isS()){
                                    do{
                                        cont--;
                                    }while (" ".equals(palabras.get(cont).getPalabra()) && !palabras.get(cont).isS());
                                }
                            }
                            if (p.charAt(j-1) == 'N' || p.charAt(j-1) == 'K' || p.charAt(j-1) == 'S'){
                                j--;
                                salir = true;
                            }
                            else{
                                palabras.get(cont).setS(true);
                            }
                            break;
                            /*
                        case 'T':
                            break;
                            */
                        case 'R':
                            r = true;
                            break;
                        case ',':
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
                }
                if (j > 1){
                    palabras.get(i).setPalabra(p.substring(j)); // Se elimina la cadena de comando de la palabra
                    // Elimina desde 0 hasta j-1 reemplazando por la cadena desde j hasta el final
                }
            }
        }

        // Al terminar este ciclo tenemos un arreglo de palabras sin caracteres de comando, listo para dibujar
        // Además cada palabra tiene sus estilos asignados por los comandos anteriores
        if (!r){
            for (int i=0;i<palabras.size();i++){
                String p = palabras.get(i).getPalabra();
                if (tamañoPalabra(p) > espacioEnFila && tamañoPalabra(p) < fila){ // espacioEnFila < tamañoPalabra < 1035
                    espacioEnFila = fila;
                    posActualX = 0;
                    posActualY = posActualY + 60;
                }
                dibujarPalabra(palabras.get(i),lienzo);
            }
        }
        else{
            for (int i=palabras.size()-1;i>=0;i--){
                String p = palabras.get(i).getPalabra();
                if (tamañoPalabra(p) > espacioEnFila && tamañoPalabra(p) < fila){ // espacioEnFila < tamañoPalabra < 1035
                    espacioEnFila = fila;
                    posActualX = 0;
                    posActualY = posActualY + 60;
                }
                dibujarPalabra(palabras.get(i),lienzo);
            }
        }
    }
    
    public void dibujarPalabra(Palabra palabra, AnchorPane lienzo){
        
        double fila = lienzo.getWidth() - 34;
        
        for (int i=0;i<palabra.getPalabra().length();i++){
            if (posActualX + tamañoCaracter(palabra.getPalabra().charAt(i)) > fila){
                lienzo.getChildren().add(llamar.dibujarCaracter('-', palabra));
                lienzo.getChildren().get(charCont).setLayoutX(posActualX);
                lienzo.getChildren().get(charCont).setLayoutY(posActualY);
                charCont++;
                espacioEnFila = fila;
                posActualX = 0;
                posActualY = posActualY + 60;
            }
            lienzo.getChildren().add(llamar.dibujarCaracter(palabra.getPalabra().charAt(i), palabra)); // Se agrega el nodo
            lienzo.getChildren().get(charCont).setLayoutX(posActualX); // Posición X para el nodo
            lienzo.getChildren().get(charCont).setLayoutY(posActualY); // Posición Y para el nodo
            posActualX = posActualX + tamañoCaracter(palabra.getPalabra().charAt(i)); // Aumento de la posición X por el espacio usado
            espacioEnFila = espacioEnFila - tamañoCaracter(palabra.getPalabra().charAt(i)); // Se resta el espacio usado al disponible
            charCont++;
        }
    }
    
    public boolean esLetra(char caracter){
        
        /* Se crea un arreglo que contiene las 27 letras del abecedario español, minúsculas y mayúsculas,
           en orden de mayor frecuencia de uso (según google).*/        
        char[] letras = {'e','a','o','s','r','n','i','d','l','c','t','u','m','p','b','g','v','y','q','h','f','z','j','ñ','x','k','w'
                        ,'E','A','O','S','R','N','I','D','L','C','T','U','M','P','B','G','V','Y','Q','H','F','Z','J','Ñ','X','K','W'};
        
        boolean esLetra = false; // Se inicializa el retorno en false hasta encontrar la letra
        for (int i=0;i<letras.length;i++){ // Se recorre el arreglo
            if (caracter == letras[i]){ // Si el caracter es igual a un caracter de la lista entonces es letra
                esLetra = true;
                break;
            }
        }
        return esLetra;
    }
    
    public boolean esSimbolo(char caracter){
        
        char[] simbolos = {'!','¡','¿','?','.',',',';',':','(',')','[',']','{','}','-','_',39,'"','«','»','^','+'};
        // Se usa el código ascii 39 para la comilla simple, ya que el compilador no permite poner el caracter entre comillas simples
        boolean esSimbolo = false; // Se inicializa el retorno en false hasta encontrar el símbolo
        for (int i=0;i<simbolos.length;i++){ // Se recorre el arreglo
            if (caracter == simbolos[i]){ // Si el caracter es igual a un caracter de la lista entonces es símbolo
                esSimbolo = true;
                break;
            }
        }
        return esSimbolo;
    }
    public double tamañoPalabra(String cadena){
        double cont = 0;
        for (int i=0;i<cadena.length();i++){
            cont = cont + tamañoCaracter(cadena.charAt(i));
        }
        return cont;
    }
    public double tamañoCaracter(char caracter){
        double tamaño;
        // Retorna el tamaño que usarán los caracteres al momento de dibujar
        switch(caracter){
            case 'a':
                tamaño = 16;
                break;
            case 'b':
                tamaño = 16;
                break;
            case 'c':
                tamaño = 17;
                break;
            case 'd':
                tamaño = 16;
                break;
            case 'e':
                tamaño = 15;
                break;
            case 'f':
                tamaño = 16;
                break;
            case 'g':
                tamaño = 19;
                break;
            case 'h':
                tamaño = 19;
                break;
            case 'i':
                tamaño = 19;
                break;
            case 'j':
                tamaño = 19;
                break;
            case 'k':
                tamaño = 19;
                break;
            case 'l':
                tamaño = 19;
                break;
            case 'm':
                tamaño = 19;
                break;
            case 'n':
                tamaño = 19;
                break;
            case 'ñ':
                tamaño = 19;
                break;
            case 'o':
                tamaño = 19;
                break;
            case 'p':
                tamaño = 19;
                break;
            case 'q':
                tamaño = 19;
                break;
            case 'r':
                tamaño = 19;
                break;
            case 's':
                tamaño = 19;
                break;
            case 't':
                tamaño = 19;
                break;
            case 'u':
                tamaño = 19;
                break;
            case 'v':
                tamaño = 19;
                break;
            case 'w':
                tamaño = 19;
                break;
            case 'x':
                tamaño = 19;
                break;
            case 'y':
                tamaño = 19;
                break;
            case 'z':
                tamaño = 19;
                break;
            case ' ':
                tamaño = 30;
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
            case '^':
                tamaño = 0;
                break;
            case '+':
                tamaño = 0;
                break;
            default:
                tamaño = 45;
                break;
        }
        return tamaño;
    }
    
    public void setLienzo(AnchorPane newLienzo){ // Getter de lienzo
        lienzo = newLienzo;
    }
    
    public AnchorPane getLienzo(){ // Getter de lienzo
        return lienzo;
    }
    
    public void setColor(Color nuevoColor){ // Setter del color de las letras
        colorActual = nuevoColor;
    }
    
    public Color getColor(){ // Getter del color de las letras
        return colorActual;
    }
    
    public void setControl(boolean control){
        puntosControl = control;
    }
    
    public boolean getControl(){
        return puntosControl;
    }

    public void setColorControl(Color colorControl) {
        Dibujar.colorControl = colorControl;
    }

    public Color getColorControl() {
        return colorControl;
    }
    
}
