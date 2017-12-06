
package ejercicio6_1;

import java.util.*;

public class Lista {  
    protected Vector v;  
    public Lista(){
        v = new Vector();       
    } 
 
    public void ponPrimero(Object ob){     
        v.insertElementAt(ob,0); 
    } 
 
    public void ponUltimo(Object ob){   
        v.addElement(ob); 
    }
 
    public boolean estaVacia(){ 
        boolean vacia;
        if (v.isEmpty()) vacia = true;
        else vacia=false;
        return vacia;  
    }
 
    public Object extraePrimero(){     
         return v.remove(0);
     
    }
 
    public Object extraeUltimo(){        
        return v.remove(v.size()-1);     
    }
  
    public void visualizaElementos(){
        for (int i = 0; i <v.size(); i++) {         
            System.out.print(v.elementAt(i)+ ", ");       
      }   
  }
}


