
package ejercicio6_1;

public class Pila extends Lista {
    public Pila(){      
       super();     
    }      
    
    public Object pop(){
       return extraePrimero();        
    }
    
    public void push(Object ob){
        ponPrimero(ob);          
    }
    
    public boolean vacia(){
        return estaVacia();
    }
 
    public void cima(){    
        System.out.print(v.elementAt(0));   
    }
    public void visualizaPila(){
        visualizaElementos();
    }
}
