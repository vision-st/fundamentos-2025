
package cl.duoc.katajava.katasbasicas;

/**
 * Kata7 - Determinar si un número es par o impar
 * <p>
 * Algoritmo: utiliza el operador módulo (%) para determinar paridad.
 * Teoría aplicada: operadores aritméticos, if/else, decisiones condicionales.
 */
public class Kata7 {
    public static void ejecutar() {
        int numero = 8;
        if (numero % 2 == 0)
            System.out.println("Kata7 - " + numero + " es par.");
        else
            System.out.println("Kata7 - " + numero + " es impar.");
    }
}
