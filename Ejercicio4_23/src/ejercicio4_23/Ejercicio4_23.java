
package ejercicio4_23;
import java.util.*;
public class Ejercicio4_23 {
    public static void main(String[] args) {
      boolean salir=false;   
      Scanner entrada=new Scanner(System.in); 
      while (salir==false){ 
      System.out.println("Introduce el número de mes y te diré el que le pertenece.\nIntroduce 0 para salir");
      int mes=entrada.nextInt();   
      switch (mes){
          case 0:
                salir=true;
              break;   
          case 1:
                     System.out.println("El mes " + mes + " es Enero");
               break;
          case 2:
                     System.out.println("El mes " + mes + " es Febrero");
               break;
          case 3:
                     System.out.println("El mes " + mes + " es Marzo");
               break;
          case 4:
                     System.out.println("El mes " + mes + " es Abril");
               break;   
          case 5:
                     System.out.println("El mes " + mes + " es Mayo");
               break;
          case 6:
                     System.out.println("El mes " + mes + " es Junio");
               break;
          case 7:
                     System.out.println("El mes " + mes + " es Julio");
               break;
          case 8:
                     System.out.println("El mes " + mes + " es Agosto");
               break;
          case 9:
                     System.out.println("El mes " + mes + " es Septiembre");
               break;
          case 10:
                     System.out.println("El mes " + mes + " es Octubre");
               break;
          case 11:
                     System.out.println("El mes " + mes + " es Noviembre");
               break;
          case 12:
                     System.out.println("El mes " + mes + " es Diciembre");
               break;  
          default: System.out.println("El año tiene solo 12 meses, por favor introduce un número entre 1 y 12");               
    }   
      }
    }
    
}
