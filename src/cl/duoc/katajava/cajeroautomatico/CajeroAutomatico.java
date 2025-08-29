/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.katajava.cajeroautomatico;


import java.util.Scanner;

public class CajeroAutomatico {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.0;
        String historial = "";
        int opcion;
        do {
            System.out.println("\n=== Cajero Automático ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Historial de movimientos");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Saldo: $" + saldo);
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    historial += "Depósito: $" + deposito + "\n";
                    System.out.println("Depósito exitoso.");
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        historial += "Retiro: $" + retiro + "\n";
                        System.out.println("Retiro exitoso.");
                    } else {
                        System.out.println("Fondos insuficientes o monto inválido.");
                    }
                    break;
                case 4:
                    if (historial.equals(""))
                        System.out.println("No hay movimientos.");
                    else
                        System.out.println("=== Historial ===\n" + historial);
                    break;
                case 5:
                    System.out.println("Gracias por usar el cajero.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}
