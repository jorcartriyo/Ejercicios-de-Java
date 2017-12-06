
package ejercicio4_9;

import java.util.Scanner;

public class Ejercicio4_9 {  
    public static void main(String[] args) {
      //        Pedimos los números por pantalla y los almacenamos en una variable        
        System.out.println("Te voy a sumar los números naturales comprendidos entre los que tú introduzcas");
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int numero1=entrada.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2=entrada.nextInt();        
//        Restricción para que los números sean naturales
        while (numero1<0 ||numero2<0 ){
            System.out.println("Te he dicho que tienen que ser naturales, presta más atención");  
            System.out.println("Introduce el primer número");
            numero1=entrada.nextInt();
            System.out.println("Introduce el segundo número");
            numero2=entrada.nextInt();  
        }
//        cambio la varaible numero 1 por Valorinical para que al mostrarlo al final nos muestre el número introducido al principio
       
        int valorinicial=numero1;
       
//        Creo una variable nueva llamada resultado
        int resultado=0;
//        ejecuto un while para que haga la comprobación y la almacene en resultado
        while (numero1+1<numero2){
            ++numero1;
            resultado=resultado+numero1;                  
        }
        //este último if es por si el primer número es menor que el segundo//
        if (numero2<numero1){ System.out.println("El primer número introducido debe de ser menor que el segundo");
        }
        else System.out.println("La suma de los números naturales comprendidos entre " + valorinicial + " y " + numero2 + " es " + resultado);                 
    }    
}
