
package ejercicio4_5;

import java.util.Scanner;

public class Ejercicio4_5 {

    public static void main(String[] args) {
   // Pido un nummero por pantalla introduciendola en una variable
		
	Scanner entrada = new Scanner(System.in);
		
	System.out.println("Introduce un número y te diré si es par o impar");
		
	int numero = entrada.nextInt();
                
//	Establezco la condición imprimiendo por pantalla una u otra

            if (numero%2 == 0) {
			
		System.out.println("El número " + numero + " es par");
			
            }  
            else{ System.out.println("El número " + numero + " es impar");
            }
    }
    
}
