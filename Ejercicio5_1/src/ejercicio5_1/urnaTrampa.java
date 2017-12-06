
package ejercicio5_1;
//Creo una clase urnaTrampa que herede de urna
public class urnaTrampa extends urna {
    private int probabilidad;
    private boolean bolasIguales;
    public urnaTrampa(){    
      super();
    }    
//   En este calculo la probabilidad de que cambie, devuelve verdadero si se cumple y falso si no.
    public boolean calculoProbabilidad(){
         probabilidad=(int)Math.round((Math.random()*100));
         if (probabilidad<20) return true;
         else return false;
    }
//  Este método comprueba que haya siempre dos bolas diferentes
    public boolean bolasIguales(){
    bolasIguales=false;
           for (int i=0;i<urna[cantidadBolas-1];i++){
                for (int j=1;j<cantidadBolas;j++){
                    if (urna[i]==urna[i+j])bolasIguales=true;                      
                    }               
           }
    return bolasIguales;  
    }
    
    public String sacaBolasTrampa(){        
            for(int i=0;i<urna.length-1;i++){ 
                if (urna[i]==urna[i+1]){                    
                    //Va diciendo en consola las operaciones que hace con las bolas
                    System.out.print("\nSaco una bola " + colorBola(i) + " y una bola " + colorBola(i+1) + " y meto una bola Negra, ");
                    //Saco la primera y meto la segunda negra
                    urna[i]=-1;
                    urna[i+1]=1;
                    //Si no son iguales saca la primera (-1) y mete una blanca (0)              
                }else{               
                        //Va diciendo en consola las operaciones que hace con las bolas
                        System.out.print("\nSaco una bola " + colorBola(i) + " y una bola " + colorBola(i+1) + " y meto una bola Blanca, ");
                        urna[i]=-1;
                        urna[i+1]=0;   
                }
                //Comprueba que las bolas que hay en la urna son iguales
                if (bolasIguales==false && calculoProbabilidad()==true){
                    //Cambia la segunda bola de color.                 
                    if (urna[i+1]==0){
                        urna[i+1]=1; 
                            System.out.print("La Bola siguiente va a cambiar de Blanca a Negra ");
                            }  
                    else {
                        urna[i+1]=0;
                         System.out.print("La bola siguiente va a cambiar de Negra a Blanca");
                    }                               
                    }
            }   
            //Devuelve el resultado final a la consola
            if (urna[cantidadBolas-1]==1){         
               return "\nDe " + (cantidadBolas) + " bolas que había en la urna la última bola que queda es Negra";
             }
            else {
               return "\nDe " + (cantidadBolas) + " bolas que había en la urna la última bola que queda es Blanca";         
            }         
    }
}
    

