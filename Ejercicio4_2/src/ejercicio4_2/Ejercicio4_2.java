
package ejercicio4_2;

import javax.swing.JOptionPane;

public class Ejercicio4_2 {

    public static void main(String[] args) {

                // Declaro variables pidiendolas por pantalla
		
		int Numero_Unid = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades se han vendido?"));
		
		int Pvp = Integer.parseInt(JOptionPane.showInputDialog("¿Qué precio tiene cada unidad?"));
		
                //Realizo las operacione pertinentes asignando el resultado a otra variable    
		
                double Ganancia_Total = Pvp*Numero_Unid;
		
		double Ganancia_Unitaria = Ganancia_Total/5;
                
                //Imprimo por pantalla el resultado	

		System.out.println("La ganancia del diseñador es: " + Ganancia_Unitaria*2);
			
		System.out.println("La ganancia de cada fabricante es: " + Ganancia_Unitaria);	
              
    }
    
}
