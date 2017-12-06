
package ejercicio4_11;

import javax.swing.JOptionPane;

public class Ejercicio4_11 {
    public static void main(String[] args) {
//Declaramos la variable a -1 y pedimos un numero por teclado haciendo un while para que si el número es menor que 0 lo pida otra vez
     long numero=-1L;
     while (numero<0){
     numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número positivo para que te diga su factorial "));   
     }
//     Cambiamos la variable numero por numero 2 para mostrar al final el numero que hemos introducido y creamos
//     otra variable resultado para las operaciones, las variables las declaro de tipo long, porque los factoriales
//     implican un manejo de números muy grandes            
     long numero2=numero;
     long resultado=1L;  
//     Hacemos el bucle, para que calcule el factorial
     while (numero2>0){       
        resultado=resultado*numero2;
          numero2--;           
     }
//  Imprimimos el resultado por pantalla
    System.out.println("El factorial de " + numero + " es " + resultado);     
    }    
}
