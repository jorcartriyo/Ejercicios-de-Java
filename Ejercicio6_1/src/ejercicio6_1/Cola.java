
package ejercicio6_1;


public class Cola extends Lista{
    
    public Cola(){      
       super();     
    }      
    
    public Object extraeDeCola(){
       return extraeUltimo();        
    }
    
    public void ponEnCola(Object ob){
        ponUltimo(ob);          
    }
    
    public boolean vacia(){
        return estaVacia();
    }
 
    public void frente(){    
        System.out.print(v.elementAt(v.size()-1));   
    }
    public void visualizaCola(){
        visualizaElementos();
    }   
}
