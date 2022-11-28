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
    private static final Estilos estilos = new Estilos();
    
    private static double espacioEnFila;
    private static int charCont;
    private static double posActualX;
    private static double posActualY;
    
    public boolean validarEntrada(String entrada){
        boolean validar = true; // Se inicia el retorno en true hasta encontrar una entrada no válida
        int size = entrada.length(); // Se guarda el tamaño de la cadena ingresada
        
        for (int i=0;i<size;i++){ // Se recorre el arreglo buscando entradas no validas
            if ((esLetra(entrada.charAt(i)))||(esSimbolo(entrada.charAt(i)))||(entrada.charAt(i) == ' ')||esNumero(entrada.charAt(i))){
            } // Las entradas deben ser letras, simbolos, o un espacio
            else{ // Si se encuentra algo distinto entonces el retorno será false y se terminará el ciclo
                validar = false;
                break;
            }
        }
        return validar;
    }
    
    public void nuevoMetodoDibujo(String entrada, AnchorPane lienzo){
        
        ArrayList<Palabra> palabras = new ArrayList<>(); // Array en el que se guardan palabras y espacios
        ArrayList<Palabra> comodin = new ArrayList<>(); // Array sin espacios
        
        // IDEA : Crear método esPalabra (o esEspacio) en clase Palabra, al recorrer el array solo se deberá
        //        validar esPalabra para trabajar los comandos, entonces no hay necesidad de comodin.
        
        // Guardar Entrada | Final: Array de Objetos Palabra
        int cont = 0; // Contador de Palabras
        for (int i=0;i<entrada.length();i++){ // Se recorre la entrada
            
            palabras.add(new Palabra(false,false,false)); // Nuevo objeto Palabra
            
            if (entrada.charAt(i) != ' '){ // i es inicio de Palabra
                int j = i;
                while (j<entrada.length()){
                    if (entrada.charAt(j) != ' '){
                        j++;
                    }
                    else{
                        break;
                    }
                }
                // Al salir, j es final de Palabra
                palabras.get(cont).setPalabra(entrada.substring(i, j)); // Se guarda la Palabra
                i = j-1;
            }
            else{
                palabras.get(cont).setPalabra(" "); // Se guarda Espacio
            }
            cont++; // Siguiente Palabra
        }
        
        // Rellenar array comodin sin espacios | Al Final: Array sin Objetos Palabra de espacios
        for (int i=0;i<palabras.size();i++){
            if(!" ".equals(palabras.get(i).getPalabra())){
                comodin.add(palabras.get(i));        
            }
        
        }
        
        // Validar y guardar comandos (parseo) | Al Final: Comandos validados y guardados como String en Objetos Palabra
        int contComa = 0;
        for (int i=0;i<comodin.size();i++){
            String p = comodin.get(i).getPalabra(); //p es cada objeto del arreglo
            for (int k=0;k<p.length();k++){
                if (p.charAt(k) == '^'){ // Si el primer caracter es ^
                    boolean cComa = false; // booleano si contiene coma
                    boolean salir = false; // booleano para poder cerrar ciclos
                    int j = k;
                    if (k+1 < p.length()){ // cualquier comando valido debe medir almenos 2 posiciones (^N)
                        for (j=k+1;j<p.length() && !salir;j++){
                            if(escoman2(p.charAt(j-1)) && escoman1(p.charAt(j))){ // j-1coman2 jcoman1
                                if(j+1<p.length()){
                                    if(!escoman2(p.charAt(j+1)) && !escoman1(p.charAt(j+1))){
                                        salir = true;
                                    }
                                }
                                else{
                                    //fin de comando
                                    salir = true;
                                }
                            }
                            else if((escoman1(p.charAt(j-1)) && escoman2(p.charAt(j)))||(escoman2(p.charAt(j))&&esNumero(p.charAt(j-1)))){ // j-1coman1 jcoman2
                                //continuar
                                if(j+1<p.length()){
                                    if(!escoman2(p.charAt(j+1)) && !escoman1(p.charAt(j+1))){
                                        salir = true;
                                        j--;
                                    }
                                }
                                if (p.charAt(j) == ','){
                                    contComa++;
                                    cComa = true;
                                }
                            }
                            else if (escoman2(p.charAt(j-1)) &&  escoman2(p.charAt(j))){ // j-1coman2 jcoman2
                                if (!(p.charAt(j-1) == ',' && p.charAt(j) == ',')){
                                    salir = true;
                                    j--;
                                }
                            }
                            else if (escoman2(p.charAt(j-1)) && escoman3(p.charAt(j))){ // j-1coman2 jcoman3
                                while(j+1<p.length()){ // ^a234,Nasf
                                    try{
                                        Integer.parseInt(p.charAt(j+1)+"");
                                        j++;
                                    }
                                    catch(NumberFormatException e){
                                        break;
                                    }
                                }
                            }
                            else{
                                salir = true;
                                j--;
                            }
                        }
                        j--;
                    }
                    if (j>k){
                        if (cComa){ // Comando con comas abc^N,K
                            if (j+1 == p.length()){ // La posición j es la última de la palabra
                                if (!escoman2(p.charAt(j))){
                                    j++;
                                }
                                comodin.get(i).setComando2(p.substring(k, j));
                                if (k>0){ // Hay palabra antes
                                    comodin.get(i).setPalabra(p.substring(0, k));
                                    p = comodin.get(i).getPalabra();
                                }
                                else{
                                    comodin.get(i).setPalabra("");
                                }
                            }
                        }
                        else{ // Comando sin comas ^N+Sabc
                            if (k == 0 && j+1<p.length()){ // El comando comienza en la primera posición y hay palabra después del comando
                                comodin.get(i).setComando(p.substring(k, j+1));
                                comodin.get(i).setPalabra(p.substring(j+1));// ^Nabc^N,K
                                p = comodin.get(i).getPalabra();
                                k=-1;
                            }
                        }
                    }
                }
            }
        }
        
        // Guardar palabras y comandos en el arreglo palabras | Al Final: Arreglo palabras con palabra y comandos separados
        int j = 0;
        for (int i=0;i<comodin.size();i++){
            while(palabras.get(j).esEspacio()){
                j++;
            }
            palabras.get(j).setPalabra(comodin.get(i).getPalabra());
            palabras.get(j).setComando(comodin.get(i).getComando());
            palabras.get(j).setComando2(comodin.get(i).getComando2());
            j++;
        }
        
        // Recorrer comandos y asignar valores booleanos | Al Final: Objetos Palabra con estilos asignados
        for (int i=0;i<palabras.size();i++){
            if (!palabras.get(i).esEspacio()){ // Si la palabra no es un espacio
                if (!"".equals(palabras.get(i).getComando())){ // Si hay comando sin comas
                    String com = palabras.get(i).getComando();
                    for (int k=0;k<com.length();k++){
                        switch (com.charAt(k)){
                            case 'N':
                                palabras.get(i).setN(true);
                                break;
                            case 'K':
                                palabras.get(i).setK(true);
                                break;
                            case 'S':
                                palabras.get(i).setS(true);
                                break;
                            case 'A':
                                String ver="";
                                int w=k+1;
                                while(w<com.length()){
                                    try{
                                        Integer.parseInt(com.charAt(w)+"");//encuentra 1 solo numero
                                         ver = ver.concat(com.charAt(w)+"");// a si mismo se concatena con los njumeros de arriba
                                        w++;
                                    }
                                    catch(NumberFormatException e){
                                        break;
                                    }
                                }
                                palabras.get(i).setAngulo(Integer.parseInt(ver));//manda todos los numeros
                                palabras.get(i).setA(true);
                                break;
                            case 'a':
                                String ser="";
                                int c=k+1;
                                while(c<com.length()){
                                    try{
                                        Integer.parseInt(com.charAt(c)+"");//encuentra 1 solo numero
                                        ser = ser.concat(com.charAt(c)+"");// a si mismo se concatena con los njumeros de arriba
                                        c++;
                                    }
                                    catch(NumberFormatException e){
                                        break;
                                    }
                                }
                                palabras.get(i).setAngulo(Integer.parseInt(ser));//manda todos los numeros
                                palabras.get(i).setA(true);
                                break;
                            default:
                                break;
                        }
                    }
                }
                if (!"".equals(palabras.get(i).getComando2())){ // Si hay comando con comas
                    String com = palabras.get(i).getComando2();
                    boolean salir = false;
                    int k = com.length()-1; // Guarda la posición final del comando
                    for (int p=i;p>=0 && !salir;p--){ // Recorre hacia atras las palabras desde la posición i
                        if (!"".equals(palabras.get(p).getPalabra()) && !" ".equals(palabras.get(p).getPalabra())){
                            // Si existe palabra y no es espacio
                            while (k>0){ // Recorre hacia atras el comando
                                if (com.charAt(k) != ','){ // ^N,K,S k=5
                                    switch (com.charAt(k)){
                                        case 'N':
                                            palabras.get(p).setN(true);
                                            break;
                                        case 'K':
                                            palabras.get(p).setK(true);
                                            break;
                                        case 'S':
                                            palabras.get(p).setS(true);
                                            break;
                                        case 'A':
                                            String ver="";
                                            int w=k+1;
                                            while(true){
                                                try{
                                                    Integer.parseInt(com.charAt(w)+"");//encuentra 1 solo numero
                                                     ver = ver.concat(com.charAt(w)+"");// a si mismo se concatena con los njumeros de arriba
                                                    w++;
                                                }
                                                catch(NumberFormatException e){
                                                    break;
                                                }
                                            }
                                            palabras.get(p).setAngulo(Integer.parseInt(ver));//manda todos los numeros
                                            palabras.get(p).setA(true);
                                            break;
                                        case 'a':
                                            String ser="";
                                            int c=k+1;
                                            while(true){
                                                try{
                                                    Integer.parseInt(com.charAt(c)+"");//encuentra 1 solo numero
                                                    ser = ser.concat(com.charAt(c)+"");// a si mismo se concatena con los njumeros de arriba
                                                    c++;
                                                }
                                                catch(NumberFormatException e){
                                                    break;
                                                }
                                            }
                                            palabras.get(p).setAngulo(Integer.parseInt(ser));//manda todos los numeros
                                            palabras.get(p).setA(true);
                                            break;
                                        case '^':
                                            salir = true;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                else{
                                    break;
                                }
                                k--;
                            }
                            k--;
                        }
                    }
                }
            }
        }
        
        for(int i=0;i<palabras.size();i++){
            System.out.println(i);
            System.out.println("N: "+palabras.get(i).isN());
            System.out.println("K: "+palabras.get(i).isK());
            System.out.println("S: "+palabras.get(i).isS());
            System.out.println("");
        }
        
        // Crear objetos de dibujo en interfaz con estilos asignados | Al Final: Palabras dibujadas con estilos y sin posición
        for (int i=0;i<palabras.size();i++){
            newDibujarPalabra(palabras.get(i));
            System.out.println(palabras.get(i).getWidth());
        }
        for (int i=0;i<palabras.size();i++){
            estilos.rotarPalabra(palabras.get(i));
        }
        
        // Posicionar objetos de dibujo | Al Final: Palabras posicionadas
        double fila = lienzo.getWidth() - 34;
        espacioEnFila = fila; // Guarda cuanto espacio queda en una fila
        posActualX = 20; // Guardará la posición X a usar al momento de dibujar
        posActualY = 20; // Guardará la posición Y a usar al momento de dibujar
        
        for (int i=0;i<palabras.size();i++){
            if (palabras.get(i).getWidth() > espacioEnFila){
                espacioEnFila = fila;
                posActualX = 20;
                posActualY = posActualY + 60;
            }
            palabras.get(i).getFondo().setLayoutX(posActualX);
            palabras.get(i).getFondo().setLayoutY(posActualY);
            posActualX = posActualX + palabras.get(i).getWidth(); // Aumento de la posición X por el espacio usado
            espacioEnFila = espacioEnFila - palabras.get(i).getWidth(); // Se resta el espacio usado al disponible
        }
    }
    
    public void newDibujarPalabra(Palabra palabra){
        String p = palabra.getPalabra();
        AnchorPane fondo = palabra.getFondo();
        double pos = 0;
        for (int i=0;i<p.length();i++){
            AnchorPane aux = llamar.dibujarCaracter(p.charAt(i), palabra);
            aux.setLayoutX(pos);
            fondo.getChildren().add(aux); // Se agregan los caracteres
            pos = pos + tamañoCaracter(p.charAt(i)); // Posición de los caracteres respecto a la palabra
        }
        palabra.setWidth(pos);
        lienzo.getChildren().add(fondo); // Se agrega la palabra a la interfaz
    }
    
    public void guardarPalabras(String entrada, AnchorPane lienzo){
        
        double fila = lienzo.getWidth() - 34;
        
        espacioEnFila = fila; // Guarda cuanto espacio queda en una fila.
        charCont = 0; // Contador de caracteres dibujados.
        posActualX = 20; // Guardará la posición X a usar al momento de dibujar.
        posActualY = 20; // Guardará la posición Y a usar al momento de dibujar.
        
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
                posActualX = 20;
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
                        ,'E','A','O','S','R','N','I','D','L','C','T','U','M','P','B','G','V','Y','Q','H','F','Z','J','Ñ','X','K','W'
                        ,'á','é','í','ó','ú','Á','É','Í','Ó','Ú'};
        
        boolean esLetra = false; // Se inicializa el retorno en false hasta encontrar la letra
        for (int i=0;i<letras.length;i++){ // Se recorre el arreglo
            if (caracter == letras[i]){ // Si el caracter es igual a un caracter de la lista entonces es letra
                esLetra = true;
                break;
            }
        }
        return esLetra;
    }
    public boolean esNumero(char caracter){
        
        /* Se crea un arreglo que contiene las 27 letras del abecedario español, minúsculas y mayúsculas,
           en orden de mayor frecuencia de uso (según google).*/        

        boolean esNumero = false; // Se inicializa el retorno en false hasta encontrar la letra
        try { // Si el caracter es igual a un caracter de la lista entonces es letra
            Integer.parseInt(caracter+"");
                esNumero = true;
           
        }
        catch(NumberFormatException e){
        }

        return esNumero;
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
    
    public boolean escoman1(char caracter){
        
        char[] ver = {'N','K','S'};
        
        boolean esver = false;
        for (int i=0;i<ver.length;i++){
            if (caracter == ver[i]){
                esver = true;
                break;
            }
        }
        return esver;
    }
    
    public boolean escoman2(char caracter){
        
        char[] ver = {'^','+',','};
        
        boolean esver = false;
        for (int i=0;i<ver.length;i++){
            if (caracter == ver[i]){
                esver = true;
                break;
            }
        }
        return esver;
    }
    
    public boolean escoman3(char caracter){
        
        char[] ver = {'a','A'};
        
        boolean esver = false;
        for (int i=0;i<ver.length;i++){
            if (caracter == ver[i]){
                esver = true;
                break;
            }
        }
        return esver;
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
            case 'á':
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
            case 'é':
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
            case 'í':
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
            case 'ó':
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
            case 'ú':
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
