
package ejercicio4_12;

import java.util.Scanner;

public class Ejercicio4_12 {

    public static void main(String[] args) {     
      Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un número entero para que te calcule su factorial");        
//        Declaramos las variables de tipo long para que pueda manejar números de alta envergadura
        long resultado=1; 
        long numero=entrada.nextInt();
//        hacemos un bucle, para que no admita un número que no sea entero
        while (numero<0){
            System.out.println("Por favor asergurate que el número sea positivo");
            numero=entrada.nextInt();                     
        }        
//       Calculamos el factorial e imprimimos por pantalla
        for (long i=numero;i>0;i--){
            resultado=i*resultado;                   
          }
        System.out.println("El factorial de " + numero+ " es " + resultado);
   }
} 
    

