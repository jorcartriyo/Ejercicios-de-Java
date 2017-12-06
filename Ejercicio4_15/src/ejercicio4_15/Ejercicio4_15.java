
package ejercicio4_15;
import java.util.*;
public class Ejercicio4_15 {

    public static void main(String[] args) {
        
//    Declaramos las varaiables pidiendolas por teclado

    Scanner entrada=new  Scanner (System.in); 
    System.out.println("Introduce dos números para que te diga los mútiplos de 3 que hay entre ellos" );
    System.out.println("Introduce el primer número");
    int numero1=entrada.nextInt();
    System.out.println("Introduce el segundo número");
    int numero2=entrada.nextInt();
    int resultado=0;
   
//Pensamos la opción de que los dos números introducidos puedan ser iguales

    while (numero1==numero2){
      System.out.println("Por favor introduce dos números diferentes ");
      
     numero1=entrada.nextInt();
     numero2=entrada.nextInt();
    }
    System.out.print( "Los múltiplos de 3 que hay entre el número  " + numero1 + " y el número " + numero2 + " son los números: "); 
   
//   La opción de que el número primero sea menor que el segundo

    if (numero1<numero2){
        while (numero1<numero2-1){
            ++numero1;
            if (numero1%3==0){
                resultado=resultado+numero1; 
                System.out.print(  numero1 + ", ");  
            }
        }
    }
// La opción de que el segundo número sea menor que el primero

    if (numero2<numero1){
        while (numero2<numero1-1){
         ++numero2;
            if (numero2%3==0){
                resultado=resultado+numero2; 
                System.out.print(  numero2 + ", ");  
            }
        }
    }
//  Y la opción de que no haya ningún múltiplo de 3 entre los dos números

    if (resultado==0) {
        System.out.print(  " 0 .No hay múltiplos de 3 entre los números " + numero1 + " y " + numero2);  
    }
  }
}



   
   
   
        
    
    

