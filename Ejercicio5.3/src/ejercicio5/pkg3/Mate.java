
package ejercicio5.pkg3;

public class Mate {
    public static long factorial(int numeroFactorial){
        long resultadoFactorial=1;
        while (numeroFactorial>0){       
            resultadoFactorial=resultadoFactorial*numeroFactorial;
            numeroFactorial--;
        }
        return resultadoFactorial;
    }

    
    public static String primo(int numeroPrimo){
        String devuelve="";
        int salida=0; 
        for  (int i=2;i<numeroPrimo;i++){
            if (numeroPrimo%i==0)salida++;           
        } 
        if (salida==0) devuelve = "El número " + numeroPrimo + " Es primo.";  
        else devuelve = "El número " + numeroPrimo + " No es primo."+"\n"; 
        return devuelve;
        }
    
    
       
     public static String perfecto(int numeroPerfecto){
        String devuelve="";
        int resultado=0;
        int division=0;
        for (int i=2;i<=numeroPerfecto;i++){            
            division=numeroPerfecto/i;
            if (numeroPerfecto%i==0)
                resultado=division+resultado;     
        }
        if (resultado==numeroPerfecto) devuelve = "El número " + numeroPerfecto + " es perfecto. "
           + "La suma de sus divisores es " + resultado;
        else devuelve= "El número " + numeroPerfecto + " No es perfecto. "+"\n"; 
        return devuelve;
     } 
     
     
    public static String amigos(int A, int B){
        String devuelve="";
        int resultadoA=0;
        int divisionA=0;
        int divisionB=0;
        int resultadoB=0;
        for (int i=2;i<=A;i++){            
            divisionA=A/i;
            if (A%i==0)
                resultadoA=divisionA+resultadoA;            
        }      
        for (int i=2;i<=B;i++){            
            divisionB=B/i;
            if (B%i==0)
                resultadoB=divisionB+resultadoB;     
        }
        if (resultadoA==B || resultadoB==A)devuelve= "Los números " + A + " y " + B + " son amigos.";
        else devuelve = "Los números " + A + " y " + B + " No son amigos."+"\n" ;
        return devuelve;
    }
    
        public static String primos(int A, int B){
        String devuelve="";      
        int divisionA=0;
        int divisionB=0;
        int resultado=0;
        for (int i=1;i<=A-1;i++){ 
            if (A%i==0)divisionA=A/i;
                for (int j=1;j<=B-1;j++){
                     if (B%i==0)divisionB=B/i;
                            divisionB=B/j;
                                if (divisionA==divisionB)
                                     resultado++;    
            }      
        }            
        if (resultado==0)devuelve= "Los números " + A + " y " + B + " son Primos.";
        else devuelve = "Los números " + A + " y " + B + " No son Primos."+"\n" ;
        return devuelve;
    }
    
    
     public static double euler(){
        double euler = 0;
        //reciclo el metodo del factorial para calcular el euler
        for (int i = 0; i < 39; i++) {
            euler = euler+ 1/(double) (factorial(i));
        }
        //Aquí declaro euler como final, ya que es una constante, para que no se pueda modificar.
        final double eulerfinal=euler;
        return eulerfinal;
     }     
        
     public static String potencia(int B, int P){
         int resultado=1;
         for (int i = 0; i < P; i++) {
             resultado = resultado*B;             
         }
        return B + " Elevado a  " +  P + "  = " + resultado +"\n";           
     }   
     
      public static String menu(){
        return "\n0.Salir\n1.Calcula Factorial\n2.Calcula Primo.\n3.Número perfecto. \n4.Número amigo. \n5.Número euler.\n6.Exponente.\n7.Comparar numeros Primos. \n";     
      }
}