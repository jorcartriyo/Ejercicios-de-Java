
package ejercicio4_21;

public class Ejercicio4_21 {

    public static void main(String[] args) {       
        System.out.println("Tablas de Multiplicar");
        int multiplicador=1;
        int multiplicando=0;
        int resultado=0;
       
        System.out.println("tabla del " + multiplicador); 
        while (resultado<100){
        multiplicando++;
        resultado=multiplicador*multiplicando;           
        System.out.println(multiplicador + " x " + multiplicando + " = " + resultado); 
            if (resultado/10==multiplicador){      
                multiplicando=0; 
                multiplicador++;
                if (resultado/10<10){
                System.out.println("\ntabla del " + multiplicador); 
                }
            }
         }   
      } 
}
    
