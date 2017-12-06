
package ejercicio4_26;

public class Moneda {
    private double resultado;
    public Moneda(){
        resultado=Math.random();
    }
    public double resultadoLanzamiento(){
        return resultado;
    }
    public String lanzamiento(){                  
        if (resultado<=0.50){
            return "Ha salido cara";
        }
        else{
            return "Ha salido cruz";
       }
    }    
}
