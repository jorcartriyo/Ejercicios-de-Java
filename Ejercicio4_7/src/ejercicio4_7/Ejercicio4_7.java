
package ejercicio4_7;

import java.util.Scanner;

public class Ejercicio4_7 {
    public static void main(String[] args) {         
//    Pedimos los números y los guardamos en variables 
        System.out.println("Introduce tres números y te diré cual de ellos es mayor");    
        Scanner  entrada=new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero1=entrada.nextInt();   
        System.out.println("Introduce el segundo número");
        int numero2=entrada.nextInt();
        System.out.println("Introduce el tercer número");
        int numero3=entrada.nextInt();
     //   Establecemos el condicional, para calcular el mayor
        if (numero1>numero2 && numero1>numero3){
            System.out.println("El número " + numero1 + " es el mayor");
               }
        else if(numero2>numero1 && numero2>numero3){
            System.out.println("El número " + numero2 + " es el mayor");
             }
        else if(numero3>numero1 && numero3>numero2){
            System.out.println("El número " + numero3 + " es el mayor");
        }else  {
            System.out.println("Los tres números son iguales");
         }
        /*El último else es por si introducen tres números iguales
        */
   }
}
