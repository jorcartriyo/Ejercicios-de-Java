
package ejercicio.pkg6_5;

public class Cadena {
   private String cadena;
   private String encriptado;
   private int metodoEncriptado;   
   public Cadena(String cadena){    
        this.cadena=cadena;
        metodoEncriptado=(int)(Math.random()*10+1);
   }
  
   public String visualizaCadena(){      
        return cadena; 
   }
   
   public String invierteCadena(){
       //convierto la cadena en caracteres
       char[] array=cadena.toCharArray();  
       int quitaCaracteres=0;       
            for(int i=0;i<array.length;i++){               
                 quitaCaracteres++;
                //invierto la cadena en caracteres 
                array[i]=cadena.charAt(array.length-quitaCaracteres);          
            } 
                //devuelvo los caracteres invertidos
                String invertido =String.valueOf(array);     
                return invertido;
   }
   //he creado el menú aqui para no tener que crearlo en el metodo main
   public String menu(){
       return "\n0.Volver a introducir cadena\n1.Invertir la cadena\n2.Encriptar la cadena.\n3.Desencriptar la cadena. \n4.Visualizar la cadena. \n5.Salir. \n";     
   }
   
   public String encriptaCadena(){        
       char [] array=cadena.toCharArray();         
        for(int i=0;i<array.length;i++){ 
            /*He generado el metodoEncriptado que es un número del 1 al 10 para que cambie 
            los caracteres ese número*/
            array[i]=(char)(array[i]+(char)metodoEncriptado);
        }
        //devuelvo los caracteres encriptados
        encriptado =String.valueOf(array); 
        return encriptado;
   }
     public String desencriptaCadena(){    
      char[] arrayD=encriptado.toCharArray(); 
        for(int i=0;i<arrayD.length;i++){
            //hago lo contrario restandole los caracteres encriptados
            arrayD[i]=(char)(arrayD[i]-(char)metodoEncriptado); 
        } 
        String desencriptado =String.valueOf(arrayD);        
        return desencriptado;        
  }    
}
    

