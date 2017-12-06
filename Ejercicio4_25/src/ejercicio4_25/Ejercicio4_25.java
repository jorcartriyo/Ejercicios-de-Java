
package ejercicio4_25;
import java.util.*;

 class Ejercicio4_25 {

    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Introduce las notas de los examenes, número entero entre el 1 y el 10 por favor, para que te diga la estadística.\n0 para terminar");
      int numeroNotas=0;
      int sumaNotas=0;
      int resultado=0;
      Nota calcula=new Nota();  
      int entradaNota=entrada.nextInt(); 
      while (entradaNota!=0){ 
        numeroNotas++;
        sumaNotas=sumaNotas+entradaNota;
        System.out.println("Siguiente nota, por favor.\n0 para terminar");   
        entradaNota=entrada.nextInt();    
      } 
     resultado=sumaNotas/numeroNotas;     
     System.out.println(calcula.calculaNota(resultado));
    }
 }
    
