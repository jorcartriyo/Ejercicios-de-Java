
package ejercicio4_18;

class Calculo{
   private long resultado; 
   private long numero1;
   public Calculo(){
   resultado=1;
  }  
  public void CalculoFactorial(long numero1){
    if (numero1>=0){
        while (numero1>0){       
          resultado=numero1*resultado;  
             numero1--;             
        }  
    }   
} 
  public long resultadoNumero(){
      
      return resultado;
  }
}

