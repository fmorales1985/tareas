/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.pkgclass.computadora;

/**
 *
 * @author Francisco
 */
public abstract class Computadora {
    public String fabricante;
    public int tamano;
    public String color;
    public String sistemaOperativo;
    public int dicoDuro;
    public int memoriaRam;

    public Computadora() {
        
    }

    public Computadora(String fabricante, int tamano, String color, String sistemaOperativo, int dicoDuro, int memoriaRam) {
        this.fabricante = fabricante;
        this.tamano = tamano;
        this.color = color;
        this.sistemaOperativo = sistemaOperativo;
        this.dicoDuro = dicoDuro;
        this.memoriaRam = memoriaRam;
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

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getDicoDuro() {
        return dicoDuro;
    }

    public void setDicoDuro(int dicoDuro) {
        this.dicoDuro = dicoDuro;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
}
 
