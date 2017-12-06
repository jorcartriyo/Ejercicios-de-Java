
package ejercicioi6_4;
import java.util.*;
public class Ejercicioi6_4 {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Caracter car=new Caracter();
        System.out.println("Introduce un número para saber su caracter");
        System.out.println(car.ascii(entrada.nextInt()));
        System.out.println("Introduce un caracter para saber su número");
        System.out.println(car.ordinal(entrada.next().charAt(0)));   
    }
    
}
