
package ejercicio4_6;

import javax.swing.JOptionPane;

public class Ejercicio4_6 {
    public static void main(String[] args) {
        //Pedimos los números por pantalla y los asignamos a una variable
        System.out.println("Introduce dos números y te diré si son divisibles entre sí");           
        int numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer núnero"));    
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número")); 
        //Establecemos una condición por si introducen el cero que les de opción a introducir otro número
        while (numero1==0 || numero2==0){
            numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer núnero distinto de 0"));
            numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número distinto de 0"));
        }
     //    Establecemos la condición para que nos indique que número es divisible entre el otro o si no son divisibles
       if (numero1%numero2==0){
           System.out.println("El número " + numero1 + " es divisible entre el número " + numero2);       }
       if (numero2%numero1==0){
           System.out.println("El número " + numero2 + " es divisible entre el número " + numero1);
       }

      if (numero1%numero2!=0 && numero2%numero1!=0) {
          System.out.println("Los números " + numero1 + " y " + numero2 + " no son divisibles entre si");
      }
  }
    
}
