
package ejercicio4_17;

import java.util.Scanner;
public class Ejercicio4_17 {
    public static void main(String[] args) {
//      Pedimos los números por teclado e iniciamos variables
       Scanner teclado=new Scanner(System.in);
       System.out.println("Por favor introduzca números para que te calcule el mayor y el menor.");
       System.out.println("Cuando quiera parar de introducir números pulse el 0");
       int numero;      
       System.out.print("Introduzca un número:");  
       numero=teclado.nextInt();
       int mayor=numero;
       int menor=numero;
       menor=numero;
//      Ejecutamos el algoritmo con un while
      while (numero!=0){
      
            System.out.print("Introduzca un número:");            
            numero=teclado.nextInt();
            
            if (numero>=mayor){
                 mayor=numero;
            }
            if (numero<=menor & numero!=0){
                menor=numero;
            }
     }
//      Imprimimos el resultado
     System.out.println("El mayor de los números introducidos es: " + mayor );  
     System.out.println("El nenor de los números introducidos es: " + menor );
   
}      
} 

      
