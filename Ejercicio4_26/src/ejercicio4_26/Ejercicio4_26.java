
package ejercicio4_26;
import javax.swing.JOptionPane;

public class Ejercicio4_26 {

    public static void main(String[] args) {
        System.out.println("Vamos a lanzar una moneda, elige cara o cruz, a ver si aciertas");       
        boolean salir=true;
        while (salir==true){
            Moneda moneda=new Moneda(); 
            int eleccion=Integer.parseInt(JOptionPane.showInputDialog("1 Cara. 2 Cruz. 3 Salir"));
            if (eleccion<=0 || eleccion>3){
                JOptionPane.showMessageDialog(null,"Por favor introduce un número válido. 1, 2, 3");       
            }
            else if (eleccion==3){
            salir=false;      
            }
            else {
                JOptionPane.showMessageDialog(null,moneda.lanzamiento());
            switch (eleccion) { 
               case 1:
                     if(moneda.resultadoLanzamiento()<=0.50){
                        JOptionPane.showMessageDialog(null,"Has ganado");
                     }else{
                        JOptionPane.showMessageDialog(null,"Lo siento, inténtalo de nuevo");   
                     }
                    break;
                case 2:
                     if(moneda.resultadoLanzamiento()>=0.51){ 
                        JOptionPane.showMessageDialog(null,"Has ganado");         
                     }else{
                        JOptionPane.showMessageDialog(null,"Lo siento, inténtalo de nuevo");     
                    }
                     break;     
            }
            }
        }    
    }    
}
