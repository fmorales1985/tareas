/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

package promedio;

public class promedio
{
    public static void main(String[] args){

    String nombre,expediente;
    int c1;
    int c2;
    int c3;
    int prom;
    
    Scanner dato=new Scanner (System.in);
    System.out.print("Nombre :");
    nombre = dato.next();
    System.out.print("Expediente :");
    expediente = dato.next();
    

    System.out.print("Calificacion 1 :  ");
    c1=dato.nextInt();
             
    System.out.print("Calificacion 2 :  ");
    c2=dato.nextInt();
               
    System.out.print("Calificacion 3 :  ");
    c3=dato.nextInt();
               
    prom=(c1+c2+c3)/3;
    System.out.print("Promedio Final es =");
    System.out.println(prom);
              
    if(prom<60){
    System.out.print("Esta Reprobado");
    }else{ 
    System.out.print("Esta Aprobado");
    }
}
}
