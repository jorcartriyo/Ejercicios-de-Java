
package ejercicio4_1;

import javax.swing.JOptionPane;

public class Ejercicio4_1 {

	public static void main(String[] args) {
            
       // Pongo al interlocutor en situación
       System.out.println("Calcularé la hipotenusa de un triángulo rectángulo con los dos catetos que tú introduzcas");
                
                // Declaro variables
		int cateto1=Integer.parseInt(JOptionPane.showInputDialog("introduce un cateto"));
		
		int cateto2=Integer.parseInt(JOptionPane.showInputDialog("introduce un cateto"));	
		
		double hipotenusa=Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
                
        //Imprime por pantalla el resultado redondeando a dos decimales

	System.out.printf("La Hipotenusa de tu triángulo es " + "%1.2f",hipotenusa);
	}
}

