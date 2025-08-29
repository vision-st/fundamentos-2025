/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.katajava.katasbasicas;

import java.util.Scanner;

public class Kata14 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = 7, intento;
        do {
            System.out.print("Kata14 - Adivina el número (1-10): ");
            intento = sc.nextInt();
        } while (intento != numeroSecreto);
        System.out.println("Kata14 - ¡Correcto!");
    }
}