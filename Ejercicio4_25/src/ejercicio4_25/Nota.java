
package ejercicio4_25;


public class Nota { 

    public String calculaNota(int nota){        
      if (nota<5 && nota>=1){
       return "La estadística de las notas introducidas es: Deficiente.";   
      }
      if (nota>=5 && nota<6){
       return "La estadística de las notas introducidas es: Suficiente.";    
      }
      if (nota>=6 && nota<7){
       return "La estadística de las notas introducidas es: Bien.";   
      }
      if (nota>=7 && nota<9){
       return "La estadística de las notas introducidas es: Notable.";    
      }
      if (nota>=9 && nota<=10){
       return "La estadística de las notas introducidas es: Sobresaliente.";    
      }
      else{
       return "Por favor introcuce notas válidas, tienen que estar entre el 0 y el 10";
      }       
    }   
}
