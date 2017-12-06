
package ejercicio4_8;

import javax.swing.JOptionPane;

public class Ejercicio4_8 {

    public static void main(String[] args) {
 //   Pedimos los datos por teclado y los introducimos en una variable
    System.out.println("Cuando introduzcas la hipotenusa y los catetos te voy a decir como es el triangulo ");
    int hipotenusa=Integer.parseInt(JOptionPane.showInputDialog("Por favor introduce la hipotenusa"));    
    int cateto1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un cateto"));
    int cateto2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el otro cateto"));    
//    Establecemos la condición, para que compruebe los datos e imprima el resultado por pantalla
    if (hipotenusa>=cateto1+cateto2){     
        JOptionPane.showMessageDialog(null,"No es un triángulo");
    }     
    else if (Math.pow(hipotenusa, 2)==Math.pow(cateto1, 2)+ Math.pow(cateto2, 2)){        
        JOptionPane.showMessageDialog(null,"Se trata de un triángulo rectángulo");
         
    }
    else  if (Math.pow(hipotenusa, 2)>Math.pow(cateto1, 2)+ Math.pow(cateto2, 2)){         
      JOptionPane.showMessageDialog(null,"Se trata de un triángulo obtosángulo");     
    }    
    else if (Math.pow(hipotenusa, 2)<Math.pow(cateto1, 2)+ Math.pow(cateto2, 2)){              
      JOptionPane.showMessageDialog(null,"Se trata de un triángulo acutángulo");         
   }
 }    
}
