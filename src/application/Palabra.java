/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

public class Palabra {
    
    // Atributos
    public String palabra = new String();
    public String comando = new String();
    public String comando2 = new String();
    public boolean n;
    public boolean k;
    public boolean s;
    
    // Métodos
    public Palabra(boolean n, boolean k, boolean s){
        this.n = n;
        this.k = k;
        this.s = s;
        this.palabra = "";
        this.comando = "";
        this.comando2 = "";
    }
    
    public boolean esEspacio(){
        return " ".equals(palabra);
    }
    
    public String getPalabra(){
        return palabra;
    }
    
    public void setPalabra(String palabra){
        this.palabra = palabra;
    }

    public String getComando2() {
        return comando2;
    }

    public void setComando2(String comando2) {
        this.comando2 = comando2;
    }
    
    public String getComando(){
        return comando;
    }

    public void setComando(String comando){
        this.comando = comando;
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
    
}
