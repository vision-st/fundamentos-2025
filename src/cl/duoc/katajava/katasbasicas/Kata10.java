package cl.duoc.katajava.katasbasicas;
/**
 * Kata10 - Acceso condicional
 * <p>
 * Algoritmo: verifica dos condiciones combinadas con AND lógico.
 * Teoría aplicada: operadores lógicos (&&), decisiones compuestas.
 */
public class Kata10 {
    public static void ejecutar() {
        int edad = 20;
        boolean tieneClaveActiva = true;
        if (edad >= 18 && tieneClaveActiva)
            System.out.println("Kata10 - Acceso permitido ✅");
        else
            System.out.println("Kata10 - Acceso denegado ❌");
    }
}