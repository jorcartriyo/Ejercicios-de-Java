
package ejercicio4_19;
import java.util.*;

public class Ejercicio4_19 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce números positivos y negativos, cuando quieras terminar introduce el 0 \nTe diré la cantidad de positivos y negativos que has introducido");
        boolean terminar=false;
        int negativo=0;
        int positivo=0;
        while (terminar==false){
        System.out.println("Introduce un número por favor (0 para terminar)");
        int numero=entrada.nextInt();
            if (numero<0 ){
                negativo=negativo+1;
            }
            else if (numero>=0 && numero!=0){
                positivo=positivo+1;
            }
            if (numero==0){                
                terminar=true;
            }
        }
        System.out.println("Has introducido " + positivo + " números positivos y " + negativo + " números negativos.");
    }
    
}
