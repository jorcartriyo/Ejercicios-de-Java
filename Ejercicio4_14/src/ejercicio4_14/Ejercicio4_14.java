package ejercicio4_14;

public class Ejercicio4_14 {

    public static void main(String[] args) {
        int contador=0;
//       Establecemos un bucle para inicie un contador de 100, lo he iniciado a dos para que el 
//       resto primero sea 0 y empiece con el Hola. Le he puesto un contador para que veas que 
//       lo imprime 100 veces
      for (int i=2;i<=101;i++){
          contador++;
            int n=i%2; // Ponemos una variable "n" que nos recoja el resultado del resto de dividir el número del bucle entre dos
       switch (n){ //Asignamos "n" al parámetro del switch ya que al dividir los pares le dará de resto 0 y 1 en los impares
        
           case 0:
               System.out.println(contador + " Hola");
               break;
           case 1:
               System.out.println(contador + " Adios");
               break;
        }      
     }
}
}

    
    
