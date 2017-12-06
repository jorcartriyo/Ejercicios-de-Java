
package ejercicio4_24;
import javax.swing.AbstractAction.*;
import javax.swing.JOptionPane;
public class Ejercicio4_24 {

    public static void main(String[] args) {     
      double nota=Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota del examen, para que te diga el resultado"));
      while(nota<0 || nota>10){
          JOptionPane.showMessageDialog(null,"Por favor introcuce una nóta valida, tiene que estar entre el 0 y el 10");
          nota=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del examen, para que te diga el resultado"));
      }
      if (nota<3){
          JOptionPane.showMessageDialog(null,"Tienes un Muy deficiente."); 
          JOptionPane.showMessageDialog(null,"Hay que estudiar más"); 
      }
      if (nota>=3 && nota<5){
          JOptionPane.showMessageDialog(null,"Tienes un Insuficiente."); 
          JOptionPane.showMessageDialog(null,"Te falta un achuchoncillo"); 
      }
      if (nota>=5 && nota<6){
          JOptionPane.showMessageDialog(null,"Tienes un Suficiente."); 
          JOptionPane.showMessageDialog(null,"¿No te irás a conformar?"); 
      }
      if (nota>=6 && nota<7){
          JOptionPane.showMessageDialog(null,"Tienes un Bien."); 
          JOptionPane.showMessageDialog(null,"Aún puedes hacerlo mejor"); 
      }
      if (nota>=7 && nota<9){
          JOptionPane.showMessageDialog(null,"Tienes Notable."); 
          JOptionPane.showMessageDialog(null,"Eso está pero que muy bien"); 
      }
      if (nota>=9 && nota<=10){
          JOptionPane.showMessageDialog(null,"Tienes Sobresaliente."); 
          JOptionPane.showMessageDialog(null,"Eres un crack"); 
      }
    }    
}
