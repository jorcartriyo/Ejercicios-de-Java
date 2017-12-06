
package ejercicio4_18;
import java.util.*;

public class Ejercicio4_18 {

    public static void main(String[] args) {
//          Pedimos los dos números por teclado y los convertimos en variables.
        System.out.println("Si introduces dos números A y B te calcularé su combinatorio.\nRecuerda A>=B y ambos tienen que ser naturales.");
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce el número A");
        long a=entrada.nextLong();
        System.out.println("Introduce el número B");
        long b=entrada.nextLong(); 
//      Contemplamos la posibilidad de que ingrese un número negativo o que A<B
        while (a<0 || b<0 || a<b){
        System.out.println("Recuerda que los números tienen que ser iguales o mayores que 0 y que A no puede ser menor que B");   
        System.out.println("Introduce el número A");
        a=entrada.nextLong();
        System.out.println("Introduce el número B");
        b=entrada.nextLong();    
        }
//          Declaramos el resto de varialbles
        long combinatorio;
        long factorialA;
        long factorialB;
        long factorialAB;
//          Llamamos al constructor para cada factorial
        Calculo calculoA=new Calculo();
        Calculo calculoB=new Calculo();
        Calculo calculoAB=new Calculo();
//          Asigno cada calculo a la variable
        calculoA.CalculoFactorial(a);
        factorialA=calculoA.resultadoNumero(); 
        calculoB.CalculoFactorial(b);
        factorialB=calculoB.resultadoNumero();
        calculoAB.CalculoFactorial(a-b);
        factorialAB=calculoAB.resultadoNumero();
        combinatorio=factorialA/(factorialB*factorialAB);
//          Mostramos los datos por consola
        System.out.println("\n" + "  "+ factorialA + "\n-------- = " + combinatorio + "\n" + factorialB + " * " + factorialAB);
        System.out.println("El número combinatorio resultante de los números " + a + " y " + b + " es " + combinatorio);                   
    }    
}


