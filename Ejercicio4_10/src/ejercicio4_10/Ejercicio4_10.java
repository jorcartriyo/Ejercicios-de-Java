
package ejercicio4_10;

import java.util.Scanner;

public class Ejercicio4_10 {
    public static void main(String[] args) {       
//    Pedimos al usuario que introduzca un número y lo almacenamos en una variable
    System.out.println("Te voy a sumar los números naturales pares menores que el número que tú introducas");
    System.out.println("Introduce un número por favor");
    Scanner entrada=new Scanner(System.in); 
    int numero=entrada.nextInt(); 
    int resultado=0; 
//    Ponemos un bucle, por si no introduce un número natural para que se lo vuelva a pedir
    while (numero<0){
        System.out.println("Por favor intruduce un número natural");
        numero=entrada.nextInt();
    }
//    Cambio la variable numero a numPedido, para poder mostrarla al final    
    int numPedido=numero;    
//    Si el nímero introducido es impar le sumo 1
    if (numPedido%2!=0){
         numPedido=++numPedido;
    }
//    Ejecuto el bucle para que haga la suma hasta llegar a 0
     while (numPedido>0){
      numPedido=numPedido-2;
     resultado=resultado+numPedido;    
     }  
//      Imprimo el resultado por pantalla
    System.out.println("La suma de los números pares naturales menores que " + numero + " es " + resultado);  
  }    
}
