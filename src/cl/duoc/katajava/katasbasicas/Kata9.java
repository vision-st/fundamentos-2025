
package cl.duoc.katajava.katasbasicas;

/**
 * Kata9 - Clasificación por rango de edad
 * <p>
 * Algoritmo: evalúa rangos de edad con if/else if.
 * Teoría aplicada: operadores de comparación, decisiones múltiples.
 */
public class Kata9 {
    public static void ejecutar() {
        int edad = 25;
        if (edad < 13)
            System.out.println("Kata9 - Eres un niño.");
        else if (edad < 18)
            System.out.println("Kata9 - Eres adolescente.");
        else if (edad < 60)
            System.out.println("Kata9 - Eres adulto.");
        else
            System.out.println("Kata9 - Eres adulto mayor.");
    }
}
