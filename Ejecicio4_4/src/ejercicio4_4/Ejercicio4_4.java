
package ejercicio4_4;

import java.util.Scanner;

public class Ejercicio4_4 {

    public static void main(String[] args) {    
    //Pido en número por pantalla, guardandolo en una variable         
    Scanner entrada = new Scanner(System.in);			
    System.out.println("Introduce un número y te diré si es positivo o negativo");			
    int numero = entrada.nextInt();			
    //Establezco la condición para que me imprima un resultado y otro                
        if (numero<0) {
            System.out.println("El número " + numero + " es negativo");
        } 			
        else { System.out.println("El número " + numero + " es positivo");
        }
    }
}
