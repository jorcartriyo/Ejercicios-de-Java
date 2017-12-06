
package ejercicio4_30;

import javax.swing.JOptionPane;

public class Ejercicio4_30 {

    public static void main(String[] args) {  
        boolean salir=false;     
        boolean continuar=false;
        while (salir==false){ 
            double aleatorio=Math.random()*100+1;
            int numero=(int)aleatorio;
            //JOptionPane.showMessageDialog(null, numero);//Esta linea, es para probar el número 
            int intentos=5; 
            boolean terminar=false;
            int adivina=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número del 1 al 100 que creas que ha salido.\nTienes 5 intentos."));  
            if (numero==adivina){
                    adivina=Integer.parseInt(JOptionPane.showInputDialog("Muy bien, has acertado, el número era el  " + numero + "\nPulsa 0 para terminar.\nCualquier otro para continuar."));
                    terminar=true;
                    continuar=true;
            }
                if (adivina==0){
                    salir=true;               
                }            
            while (terminar==false && intentos!=1){                
                while (adivina<1 || adivina>100){
                    JOptionPane.showMessageDialog(null,"Por favor introduce un número válido del 1 al 100.");
                    adivina=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número del 1 al 100."));
                }  
                intentos--;         

                if (numero<adivina){
                    JOptionPane.showMessageDialog(null,"Te has pasado, prueba con un número más bajo.\n Te quedan " + intentos + " intentos" );
                }
                else if (numero>adivina){
                    JOptionPane.showMessageDialog(null,"No llegas, prueba con un número más alto.\n Te quedan " + intentos + " intentos");
                }            
                
                if (numero==adivina){
                    adivina=Integer.parseInt(JOptionPane.showInputDialog("Muy bien, has acertado, el número era el  " + numero + "\nPulsa 0 para terminar.\nCualquier otro para continuar."));
                    terminar=true;
                    continuar=true;
                    if (adivina==0){
                    salir=false;               
                }
                } 
                  adivina=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número del 1 al 100 ")); 
            } 
                if (numero!=adivina && continuar==false){
                    adivina=Integer.parseInt(JOptionPane.showInputDialog("Lo siento no lo has conseguido, el número era " + numero + "\nPulsa 0 para terminar.\nCualquier otro para continuar.")); 
                }
                if (adivina==0){
                    salir=true;               
                }       
        }
   }
}
