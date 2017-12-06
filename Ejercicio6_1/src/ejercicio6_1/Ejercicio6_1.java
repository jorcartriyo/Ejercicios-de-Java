
package ejercicio6_1;
import java.util.Scanner;
public class Ejercicio6_1 {   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        //Creo tres objetos, uno para cada ejercicio
        Object objetoLista;
        Object objetoPila;
        Object objetoCola;
        //Llamo a los tres constructores
        Pila pila=new Pila();
        Lista lista=new Lista();   
        Cola cola=new Cola();
        boolean salir=false;
        //Hago un menú para elegir entre cada ejercicio
        System.out.println("Elige que lista quieres probar ");
        System.out.println("\n1.Lista normal\n2.Pila\n3.Cola");
        int c=entrada.nextInt();
        switch (c){
            //Las comprobaciones del primer ejercicio
            case 1:
                while (salir==false){
                    System.out.println("Elige lo que quieres hacer con la lista");
                    System.out.println("\n0.Salir\n1.Mostrar si la lista está vacia\n2.Poner el primer número\n3.Poner el primer caracter\n4.Poner el último número\n5.Poner el último caracter\n6.Visualizar los elementos\n7.Extraer el primero\n8.Extraer el último");
                    int e=entrada.nextInt();
                    switch(e){
                        case 0: salir=true;
                            break;
                        case 1: 
                            System.out.println(lista.estaVacia());
                            break;
                        case 2:
                            System.out.println("Entra por teclado el número que quieres poner el primero"); 
                            objetoLista=entrada.nextInt();                      
                            lista.ponPrimero(objetoLista);
                            System.out.println("Has metido en la lista " + objetoLista);
                            break;
                            case 3:
                            System.out.println("Entra por teclado el caracter que quieres poner el primero"); 
                            objetoLista=entrada.next();
                            lista.ponPrimero(objetoLista);
                            System.out.println("Has metido en la lista " + objetoLista);
                            break;  
                        case 4:
                            System.out.println("Entra por teclado el número que quieres poner el último"); 
                            objetoLista=entrada.nextInt();
                            lista.ponUltimo(objetoLista); 
                            System.out.println("Has metido en la lista " + objetoLista);
                            break;
                        case 5:
                            System.out.println("Entra por teclado el caracter que quieres poner el último"); 
                            objetoLista=entrada.next();
                            lista.ponUltimo(objetoLista);
                            System.out.println("Has metido en la lista " + objetoLista);
                            break;    
                        case 6: 
                            lista.visualizaElementos();
                            break;
                        case 7:
                            System.out.println("Has sacado de la lista el " + lista.extraePrimero()); 
                            break;
                        case 8: 
                            System.out.println("Has sacado de la lista el " + lista.extraeUltimo());
                            break;
                    }         
                }
                break;
            //Las comprobaciones del segundo ejercicio    
            case 2:    
                while (salir==false){
                    System.out.println("Elige lo que quieres hacer con la pila");
                    System.out.println("\n0.Salir\n1.Apilar un número\n2.Apilar un caracter\n3.Sacar el primer objeto\n4.Mostrar si la pila esta vacia\n5.Visualizar el objeto de la cima\n6.Visualizar toda la pila");
                    int e=entrada.nextInt();                    
                    switch(e){
                        case 0: salir=true;
                            break;
                        case 1:  
                            System.out.println("Inserta un número en la pila ");   
                            objetoPila=entrada.nextInt();                                           
                            pila.push(objetoPila);
                            System.out.println("Has insertado un " + objetoPila); 
                            break;
                        case 2:  
                            System.out.println("Inserta un caracter en la pila ");   
                            objetoPila=entrada.next();                                           
                            pila.push(objetoPila);
                            System.out.println("Has insertado un " + objetoPila); 
                            break;   
                        case 3:                       
                            System.out.println("Has quitado un " + pila.pop() ); 
                            break;
                        case 4: 
                            System.out.println(pila.vacia());
                            break;
                        case 5: 
                            System.out.print("El elemento de la cima es "); pila.cima();System.out.println("\n");
                            break; 
                        case 6: 
                            System.out.print("La pila está compuesta por "); pila.visualizaPila();System.out.println("\n");
                            break;                       
                    }         
                } 
                break;
            //Las comprobaciones del tercer ejercicio    
            case 3:    
                while (salir==false){
                    System.out.println("Elige lo que quieres hacer con la cola");
                    System.out.println("\n0.Salir\n1.Poner un número en la cola\n2.Poner un caracter en la cola\n3.Sacar el último objeto\n4.Mostrar si la pila esta vacia\n5.Visualizar el objeto de la cola\n6.Visualizar toda la pila");
                    int e=entrada.nextInt();                    
                    switch(e){
                        case 0: salir=true;
                            break;
                        case 1:  
                            System.out.println("Inserta un número en la cola ");   
                            objetoCola=entrada.nextInt();                                           
                            cola.ponEnCola(objetoCola);
                            System.out.println("Has insertado un " + objetoCola); 
                            break;
                        case 2:  
                            System.out.println("Inserta un caracter en la pila ");   
                            objetoCola=entrada.next();                                           
                            cola.ponEnCola(objetoCola);
                            System.out.println("Has insertado un " + objetoCola); 
                            break;   
                        case 3:                       
                            System.out.println("Has quitado un " + cola.extraeDeCola()); 
                            break;
                        case 4: 
                            System.out.println(cola.vacia());
                            break;
                        case 5: 
                            System.out.print("El elemento de la cola es "); cola.frente();System.out.println("\n");
                            break; 
                        case 6: 
                            System.out.print("La cola está compuesta por "); cola.visualizaCola();System.out.println("\n");
                            break;                       
                    }         
                } 
                    break;    
        }   
    }
}
