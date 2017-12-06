
package ejercicio5_1;
//Creo la clase urna
public class urna { 
//Declaro las variables principales privadas   
 protected int[] urna;
 protected int cantidadBolas;
 private int color;
    //Creo el constructor urna que llena la urna de bolas
    urna(){
        //En primer lugar busco un indice de cantidad de bolas aleatorio entre 2 y 102      
        cantidadBolas=(int)Math.round((Math.random()*100)+2);
        /*Leno la urna de bolas aleatoriamente (0 para las blancas y 1 para las negras)
        según los indices aleatorios que se han generado antes*/
        urna=new int[cantidadBolas]; 
        System.out.print("Urna ["); //Esto es para simular la apertura de la urna con las bolas que va a llevar
        for (int j=0;j<urna.length;j++){
            int bolas=(int)Math.round(Math.random());
            urna[j]=bolas; 
            System.out.print(colorBola(j) + ", ");// Esto es para llenar la urna con las bolas en la salida.
        } 
        System.out.print("]");// Esto es para cerrar la urna
    }
    //Método para determinar de que color es cada bola. 
    public String colorBola(int color){       
       if (urna[color]==1) return "Negra";
       else return "Blanca";      
    }
    //Método que calcula el algoritmo según el ejercicio
    public String sacaBola(){
        /*Mientras que recorre el array si el indice en el que se encuentra y el siguiente
        son iguales saca el primero (-1) y mete una bola negra (1)*/
        for(int i=0;i<urna.length-1;i++){        
            if (urna[i]==urna[i+1]){ 
                //Va diciendo en consola las operaciones que hace con las bolas
                System.out.print("\nSaco una bola " + colorBola(i) + " y una bola " + colorBola(i+1) + " y meto una bola Negra, ");
                urna[i]=-1;
                urna[i+1]=1;
            //Si no son iguales saca la primera (-1) y mete una blanca (0)      
             }else{
                //Va diciendo en consola las operaciones que hace con las bolas
                System.out.print("\nSaco una bola " + colorBola(i) + " y una bola " + colorBola(i+1) + " y meto una bola Blanca, ");
                urna[i]=-1;
                urna[i+1]=0;   
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
                        
	
   

