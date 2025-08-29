
package cl.duoc.katajava.katasbasicas;

public class Kata15 {
    public static void ejecutar() {
        int numero = 5;
        System.out.println("Kata15 - Tabla del " + numero);
        for (int i = 1; i <= 10; i++)
            System.out.println(numero + " x " + i + " = " + (numero * i));
    }
}
