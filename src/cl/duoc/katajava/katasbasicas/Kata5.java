
package cl.duoc.katajava.katasbasicas;

public class Kata5 {
    
    public static void operarLogicamenteOr(){
        
        boolean estaLLoviendo = true;
        boolean llevoParaguas = false;
        boolean protegido = estaLLoviendo || llevoParaguas;
        
        System.out.println("Kata5 - protegido de la lluvia? " + protegido);
        
    }
    
}
