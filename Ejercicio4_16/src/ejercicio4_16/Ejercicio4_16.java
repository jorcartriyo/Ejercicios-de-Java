package ejercicio4_16;
import java.util.*;
public class Ejercicio4_16 {
  
   public static void main(String[] args) {
//       Pedimos los números por teclado
       Scanner teclado=new Scanner(System.in);
       System.out.println("Introduce los números que quieras y te calcularé cual es el mayor y cual el menor");
       System.out.println("¿Cuantos números quieres introducir?");
       int numerosIntroducir=teclado.nextInt();
       int numero;      
       System.out.print("Introduzca un número:");  
       numero=teclado.nextInt();
//       Declaramos variables
       int mayor=numero;
       int menor=numero;
       menor=numero;
//       Ejecutamos los calculos de cual es el mayor
      for(int i=1;i<numerosIntroducir;i++) {
            System.out.print("Introduzca un número:");            
            numero=teclado.nextInt();
            
            if (numero>=mayor){
                 mayor=numero;
            }
            if (numero<=menor){
                menor=numero;
            }
//       Imprimimos resultado por pantalla
     }
     System.out.println("El mayor de los números introducidos es: " + mayor );  
     System.out.println("El nenor de los números introducidos es: " + menor );     
}      
}
   
    
    
