//Alumno Aprobado o Reprobado

import java.util.Scanner; 

public class Nota 
{ 
public static void main(String[] args) 
{ 
double calif, Nombre;
Scanner entrada = new Scanner (System.in);
System.out.print("Introduzca El nombre del Alumno");
Nombre= entrada.nextDouble();

System.out.print("Introduzca la calificacion Obtenida: "); 
calif = entrada.nextDouble(); 

if(calif >= 70) 
System.out.println("Alumno aprobado"); 
else 
System.out.println("Alumno reprobado"); 


} 

}

    

