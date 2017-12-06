
package ejercicio5.pkg3;
import java.util.*;
public class Ejercicio53 {
 
    public static void main(String[] args) {       
      Scanner entrada=new Scanner(System.in);     
      int eleccion;
      int numero;
      boolean salir=false;
      while (salir==false){
          System.out.println("Elige la opción que quieras: ");   
          System.out.println(Mate.menu());
          eleccion=entrada.nextInt();
            switch(eleccion){            
                case(0):
                    System.out.println("Hasta otro día");salir=true; 
                    break;      
                case(1):                    
                    System.out.println("Introduce el número del cual quieres saber su factorial ");       
                    long factorial=Mate.factorial(numero=entrada.nextInt());
                    System.out.println("El factorial de " + numero + " es " + factorial+ "\n");
                    break;
                case(2):
                    System.out.println("Introduce el número del cual quieres saber si es primo ");
                    System.out.println(Mate.primo(entrada.nextInt()));              
                    break;                    
                case(3):
                    System.out.println("Introduce el número del cual quieres saber si es perfecto" );
                    System.out.println(Mate.perfecto(entrada.nextInt()));
                    break;
                case 4:
                    System.out.println("Introduce los números que quieres saber si son amigos " );
                    System.out.println(Mate.amigos(entrada.nextInt(), entrada.nextInt()));
                    break;
                case 5:
                    System.out.println("El número euler es " + Mate.euler());   
                    break;
                case 6:
                    System.out.println("Introduce primero la base y luego el exponente" );
                    System.out.println(Mate.potencia(entrada.nextInt(), entrada.nextInt()));
                    break;
                case 7:
                    System.out.println("Introduce los números que quieres saber si son Primos " );
                    System.out.println(Mate.primos(entrada.nextInt(), entrada.nextInt()));
                    break;
            }      
        }
    }
}

