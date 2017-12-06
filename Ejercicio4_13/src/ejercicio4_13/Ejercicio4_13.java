
package ejercicio4_13;

import java.util.Scanner;

public class Ejercicio4_13 {

    public static void main(String[] args) {
    
        //Pedimos la entrada de datos por teclado, almacenando los datos en dos variables 
        System.out.println("Introduce dos números y te calcularé los pares que hay entre ellos, el resultado de su suma y cuantos hay...");
        Scanner entrada=new Scanner(System.in);  
        System.out.println("Introduce el primer número");
        int numero1=entrada.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2=entrada.nextInt();
        int contador=0;
        int resultado=0;
        //Contemplamos la posibilidad de que el usuario introduzca dos números iguales
        while (numero1==numero2){
            System.out.println("Por favor introduce dos números diferentes ");
            numero1=entrada.nextInt();
            numero2=entrada.nextInt();
        }
        System.out.print("Los numeros pares que hay entre " + numero1 + " y " + numero2 + " son ");

        //Hacemos la operación si el número primero introducido es menor que el segundo
        while (numero1<numero2-1){
            ++numero1;
            if (numero1%2==0){
                contador++;
              resultado=resultado+numero1; 
                System.out.print( numero1 + ", ");  
            }
        }
        //Hacemos la operación si el número primero introducido es mayor que el segundo
        while (numero2<numero1-1){
            ++numero2;
            if (numero2%2==0){
                contador++;
              resultado=resultado+numero2; 
                System.out.print( numero2 + ", ");
            }
        }
        System.out.print( "\n");  
        System.out.println("El resultado de su suma es " + resultado); 
        System.out.println("Hay " + contador + " números pares");
    }
}

	
    

