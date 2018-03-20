
package celular;

package pkgabstract.pkgclass.Celular;
   
//declaracion de  fabricante

import java.io.Console;

class Samsung extends Celular {
     public String sistema;
    public String memoria;
    
    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
}
    


class LG extends Celular {
     public String sistema;
    public String memoria;
    
    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
}

public class AbstractClasscelular{
    public static void main(String[] args) {
        // TODO code application logic here
        Samsung Samsung = new Samsung();
        Samsung.fabricante="Samsung";
       Samsung.color="Negro";
        Samsung.sistema="3G";
        Samsung.tamano =10;
       Samsung.memoria="16GIGA";
                
        
       
           LG LG = new LG();
         LG.fabricante=" LG";
        LG.color="Blanco";
         LG.sistema="3G";
         LG.tamano =14;
        LG.memoria="2GIGA";
        
   
                
        
        System.out.println("CELULAR Samsung");
        System.out.println("FABRICANTE: " + Samsung.getFabricante());
        System.out.println("COLOR: " + Samsung.getColor());
        System.out.println("SISTEMA: " + Samsung.getSistema());
        System.out.println("TAMANO: " + Samsung.getTamano());
        System.out.println("MEMORIA: " + Samsung.getMemoria());
          
         System.out.println("CELULAR LG");
        System.out.println("FABRICANTE: " + LG.getFabricante());
        System.out.println("COLOR: " + LG.getColor());
        System.out.println("SISTEMA: " + LG.getSistema());
        System.out.println("TAMANO: " + LG.getTamano());
        System.out.println("MEMORIA: " + LG.getMemoria());       
                
        
      
        
        
    }
}

    


    

