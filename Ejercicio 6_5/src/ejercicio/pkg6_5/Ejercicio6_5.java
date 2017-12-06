
package ejercicio.pkg6_5;
import java.util.*;   

public class Ejercicio6_5 {

    public static void main(String[] args) {     
      Scanner entrada=new Scanner(System.in);      
      System.out.println("Introduce la cadena de caracteres.");
      int eleccion=0;
      boolean salir=false;    
      Cadena cadena=new Cadena(entrada.next());
        System.out.println(cadena.menu());
        while (salir==false){
            cadena.menu();
            eleccion=entrada.nextInt();
            switch(eleccion){            
                case(0):
                    System.out.println("Introduce la cadena de caracteres.");cadena=new Cadena(entrada.next());System.out.println(cadena.menu());
                    break;
                case(1):
                    System.out.println(cadena.invierteCadena());System.out.println(cadena.menu());
                    break;
                case(2):
                    System.out.println(cadena.encriptaCadena());System.out.println(cadena.menu());
                    break;
                case(3):
                    if (cadena.encriptaCadena()==null) System.out.println("La cadena tiene que estar encriptada.");
                    else System.out.println(cadena.desencriptaCadena()); 
                    System.out.println(cadena.menu());
                    break;
                case(4):
                    System.out.println(cadena.visualizaCadena()); System.out.println(cadena.menu());
                    break;
                case(5):
                    System.out.println("Hasta otro día");salir=true;                
            }
        }   
    }    
}
