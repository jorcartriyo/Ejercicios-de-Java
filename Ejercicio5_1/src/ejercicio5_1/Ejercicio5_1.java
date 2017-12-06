
package ejercicio5_1;
import java.util.*;
public class Ejercicio5_1 {
    
    public static void main(String[] args) {        
        Scanner entrada=new Scanner(System.in);
        boolean salir=false;
        while (salir==false){
            System.out.println("Quieres jugar con la urna: \n1.Normal \n2.Trampa \n3.Salir");
            int eleccion=entrada.nextInt();
            switch(eleccion){
                case 1:
                  //Llamamos al constructor urna    
                    urna Urna=new urna();
                  //Imprimimos el resultado
                    System.out.println(Urna.sacaBola());
                    break;
                case 2:
                  //Llamamos al constructor urna trampa   
                    urnaTrampa UrnaT=new urnaTrampa();
                  //Imprimimos el resultado
                    System.out.println(UrnaT.sacaBolasTrampa());
                    break;
                case 3:
                    salir=true;
            }
         }       
   }                         
}




