/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opraciones.aritmeticas;

/**
 *
 * @author Francisco
 */
public class OpracionesAritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int z=65;
    int y=52;
    
    int suma=z+y;
    int resta=z-y;
    int multiplicacion=z*y;
    double division=(double)z/y;
    int resto=z%y;
    
     System.out.println("La suma entre Z y Y es " +suma);
     System.out.println("La resta entre Z y Y es " +resta);
     System.out.println("La multiplicacion entre Z y Y es " +multiplicacion);
     System.out.println("La divicion entre Z y Y es " +division);
     System.out.println("El resto de Z y Y es " +resto);
    }
    
}
