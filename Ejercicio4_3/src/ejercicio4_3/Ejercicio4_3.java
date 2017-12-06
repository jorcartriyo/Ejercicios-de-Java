
package ejercicio4_3;

import javax.swing.JOptionPane;

public class Ejercicio4_3 {

    public static void main(String[] args) {
   
                double S1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un lado del triángulo"));
		
		double S2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo lado del triángulo"));
		
		double S3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer lado del triángulo"));
		
                //Ejecuto las operaciones asignandalas a otra variable
                
		double T = (S1+S2+S3)/2;
		
		double Area = Math.sqrt(T*(T-S1)*(T-S2)*(T-S3));
                
                //Imprimo el resultado en pantalla restringiendolo a dos decimales
		                       
                 System.out.printf("La Hipotenusa de tu triángulo es " + "%1.2f", Area);
                      
    }    
}
