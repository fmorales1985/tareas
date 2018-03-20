/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celular;


/**
 *
 * @author Francisco
 */
public abstract class Celular {
    public String fabricante;
    public int tamano;
    public String color;
   
public  Celular (){
}

public Celular(String fabricante, int tamano, String color,) {
        this.fabricante = fabricante;
        this.tamano = tamano;
        this.color = color;
       
    }
    
public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
