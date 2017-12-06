
package ejercicio4_22;
import java.util.*;
public class Ejercicio4_22 {

    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    System.out.println("Introduce un número mayor que 1 y te diré si es primo o no....");
    int numero=entrada.nextInt();
    int decreciente=numero;
    boolean primo=false;
    while (numero<1){
    System.out.println("Por favor introduce un número mayor que 1.....");
    numero=entrada.nextInt();
    }
    while (decreciente>2 && primo==false){
      decreciente--;        
         if (numero%decreciente==0){
          primo=true;
          }
    }
    if (primo==true){
        System.out.println("El número " + numero + " no es primo");
    }else{
         System.out.println("El número " + numero + " es primo");
    }
  }    
}
