
package pkgabstract.pkgclass.computadora;
   
//declaracion de  fabricante

import java.io.Console;

class HP extends Computadora {
    public String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
    
class Dell extends Computadora {
    public String servicetag;
    public String modelo;
    
    public String getServicetag() {
        return servicetag;
    }

    public void setServicetag(String servicetag) {
        this.servicetag = servicetag;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
   
   
    
}

class Sony extends Computadora {
     public String modelo;
    public String serie;
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}

public class AbstractClassComputadora{
    public static void main(String[] args) {
        // TODO code application logic here
        Dell pcDell = new Dell();
        pcDell.fabricante="DELL";
        pcDell.color="Negro";
        pcDell.sistemaOperativo="Windows 10";
        pcDell.tamano = 20;
        pcDell.modelo="jk";
                
        
        
        
        HP pcHP = new HP();
        //pcHP.
        
        pcHP.fabricante="HP";
        pcHP.color="Verde";
        pcHP.sistemaOperativo="LINUX";
        pcHP.tamano = 30; 
        pcHP.modelo="FRANK";
        
        Sony pcSony = new Sony();
        //pcSony.
        pcSony.fabricante="SONY";
        pcSony.color="Roja";
        pcSony.sistemaOperativo="Windows 8";
        pcSony.tamano = 15;
        pcSony.modelo="Morales";
        pcSony.serie= "1985";      
                
        
        System.out.println("COMPUTADORA DELL");
        System.out.println("FABRICANTE: " + pcDell.getFabricante());
        System.out.println("COLOR: " + pcDell.getColor());
        System.out.println("SO: " + pcDell.getSistemaOperativo());
        System.out.println("TAMANO: " + pcDell.getTamano());
        System.out.println("Modelo: " + pcDell.getModelo());
        
        System.out.println("COMPUTADORA HP");
        System.out.println("FABRICANTE: " + pcHP.getFabricante());
        System.out.println("COLOR: " + pcHP.getColor());
        System.out.println("SO: " + pcHP.getSistemaOperativo());
        System.out.println("TAMANO: " + pcHP.getTamano());
        System.out.println("Modelo: " + pcHP.getModelo());
        
        System.out.println("COMPUTADORA SONY");
        System.out.println("FABRICANTE: " + pcSony.getFabricante());
        System.out.println("COLOR: " + pcSony.getColor());
        System.out.println("SO: " + pcSony.getSistemaOperativo());
        System.out.println("TAMANO: " + pcSony.getTamano());
        System.out.println("Modelo: " + pcSony.getModelo());
        System.out.println("serie: " + pcSony.getSerie());
        
        
        
    }
}

    

