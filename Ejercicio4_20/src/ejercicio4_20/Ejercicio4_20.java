
package ejercicio4_20;

import java.util.*;

public class Ejercicio4_20 {

    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce los números que quieras. \nTe diré la media aritmética de los números que has introducido. \nCuando quieras parar introduce el 0.");
        boolean terminar=false;
        int contador=0;
        double calculo=0;
        double numerosAcumulados=0;
        while (terminar==false){
        System.out.println("Introduce un número por favor (0 para terminar)");
        int numero=entrada.nextInt();
           contador++;
           numerosAcumulados=numero+numerosAcumulados;
            if (numero==0){ 
                contador=contador-1;
                terminar=true;
         }
            }
        calculo=numerosAcumulados/contador; 
        System.out.printf("La media aritmética de los números que has introducido es  "  + "%1.2f", calculo);
        }
        
    }
    
