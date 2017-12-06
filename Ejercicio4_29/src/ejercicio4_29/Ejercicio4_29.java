
package ejercicio4_29;

 class quiniela{
    private double aleatorio=Math.random()*100; 
    public quiniela(){     
}
    public void generaQuiniela(){
        aleatorio=Math.random()*100; 
    }
    public String resultado(){        
        if (aleatorio>=0 && aleatorio<=50){
        return "1";
        }
        if (aleatorio>50 && aleatorio<=80){
        return "X";
        }
        if (aleatorio>80&& aleatorio<=100){
        return "2";    
        }
        else{
            return "error";        
    }
    }
    public double aleatorio(){
        return aleatorio;
    }
}

public class Ejercicio4_29 {    
    public static void main(String[] args) {      
        quiniela Quiniela=new quiniela();        
        for (int i=1;i<16;i++){
            Quiniela.generaQuiniela();
            System.out.print("Partido " +i + " Resultado ");
            System.out.println(Quiniela.resultado());
        }  
    }    
}
