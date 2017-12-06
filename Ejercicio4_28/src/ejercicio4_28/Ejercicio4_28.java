package ejercicio4_28;

public class Ejercicio4_28 {

    public static void main(String[] args) { 
        //Creo dos objetos "dados", para lanzarlos
        Dado dado=new Dado();
        Dado dado2=new Dado();
        int contador=0;  
        for (int i=0;i<100;i++){         
            if (dado.tirada()+dado.tirada()==10){
                contador++;            
            }
        }        
        System.out.println("Las veces que los dos dados en las 100 tiradas han sumado 10 es de: " + contador);
    }    
}
