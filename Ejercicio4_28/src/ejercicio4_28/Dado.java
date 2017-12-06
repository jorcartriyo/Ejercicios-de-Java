
package ejercicio4_28;

public class Dado {
private int dado;
private double dadoDoble;
   public Dado(){         
      double dadoDoble= 1+ Math.random()*6; 
      dado=(int)dadoDoble;
    }
    public int tirada(){             
      dadoDoble= 1+ Math.random()*6;  
      dado=(int)dadoDoble;  
      return dado;
    }     
}
