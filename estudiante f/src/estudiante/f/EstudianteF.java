/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante.f;

/**
 *
 * @author Francisco
 */
     public class EstudianteF {

    /**
     * @param args the command line arguments
     */
         private String nombre,cuenta,carrera,horario;
         int edad;
    
                public Estudiante(string nombre,string cuenta,string carrera,string horario,int edad){
                setNombre(nombre);
                 setCuenta(cuenta);
                 setCarrera(carrera);
                  setHorario(horario);
                   setEdad(edad);
        
    }
                
    public void setNombre(String  n){nombre=n;}
    public void setCuenta(String  c){cuenta=c;}
    public void setCarrera(String  c){carrera=c;}
    public void setHorario(String  h){horario=h;}
    public void setEdad(int  e){edad=e;}
    
    public String getNombre(){return nombre;}
    public String getCuenta(){return cuenta;}
    public String getCarrera(){return carrera;}
    public String getHorario(){return horario;}
    public int  getEdad(){return edad;}
    
    
    public void imprimeEstudiante(){
        console.Write("\n nombre:"+getNombre()+"\n cuenta:"+getCuenta()+"\n carrera:"+getCarrera()+"\n horario:"+getHorario()+)
    
                }
     }
    
    
    
            
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
