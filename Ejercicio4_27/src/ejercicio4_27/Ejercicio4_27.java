
package ejercicio4_27;

public class Ejercicio4_27 {

    public static void main(String[] args) {   
        int contador=0;
        for (int i=0;i<100;i++){ 
            double dadoDoble= 1+ Math.random()*6;       
            int dado=(int)dadoDoble;
            if(dado==6){            
                contador=contador+1;            
            }         
        }
          System.out.println("En 100 tiradas del dado ha salido un 6 " + contador + " veces."); 
    }    
}
