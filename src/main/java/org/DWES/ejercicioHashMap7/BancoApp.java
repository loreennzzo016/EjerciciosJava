package org.DWES.ejercicioHashMap7;

import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta = null;

        while (true) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Mostrar información");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese número de cuenta: ");
                    String numero = scanner.next();
                    System.out.print("Ingrese saldo inicial: ");
                    double saldo = scanner.nextDouble();
                    cuenta = new CuentaBancaria(numero, saldo);
                    System.out.println("Cuenta creada exitosamente.");
                    break;
                case 2:
                    if (cuenta != null) {
                        System.out.print("Monto a depositar: ");
                        double deposito = scanner.nextDouble();
                        cuenta.depositar(deposito);
                    } else {
                        System.out.println("Primero debe crear una cuenta.");
                    }
                    break;
                case 3:
                    if (cuenta != null) {
                        System.out.print("Monto a retirar: ");
                        double retiro = scanner.nextDouble();
                        cuenta.retirar(retiro);
                    } else {
                        System.out.println("Primero debe crear una cuenta.");
                    }
                    break;
                case 4:
                    if (cuenta != null) {
                        cuenta.mostrarInformacion();
                    } else {
                        System.out.println("Primero debe crear una cuenta.");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar BancoApp.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}