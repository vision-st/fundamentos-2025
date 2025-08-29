
package cl.duoc.katajava.katasbasicas;

public class Kata4 {
    
    public static void operarLogicamente(){
        
        boolean tieneBoleto = true;
        boolean asientoDisponible = true;
        boolean puedeEntrar = tieneBoleto && asientoDisponible;
        
        System.out.println("Kata4 - Puede entrar? " + asientoDisponible);
        
    }
    
}
