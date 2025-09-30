package org.DWES.ejercicioHashMap7;

import java.util.*;

public class BancoApp {
    private static Map<String, CuentaBancaria> cuentas = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n--- MENÚ BANCO ---");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Mostrar todas las cuentas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> crearCuenta();
                case 2 -> depositar();
                case 3 -> retirar();
                case 4 -> consultarSaldo();
                case 5 -> mostrarTodasLasCuentas();
                case 6 -> System.out.println("Gracias por usar BancoApp.");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
    }

    private static void crearCuenta() {
        System.out.print("Ingrese número de cuenta: ");
        String numero = scanner.nextLine();
        System.out.print("Ingrese saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        if (cuentas.containsKey(numero)) {
            System.out.println("Ya existe una cuenta con ese número.");
        } else {
            cuentas.put(numero, new CuentaBancaria(numero, saldo));
            System.out.println("Cuenta creada exitosamente.");
        }
    }

    private static void depositar() {
        CuentaBancaria cuenta = obtenerCuenta();
        if (cuenta != null) {
            System.out.print("Monto a depositar: ");
            double monto = scanner.nextDouble();
            scanner.nextLine();
            cuenta.depositar(monto);
        }
    }

    private static void retirar() {
        CuentaBancaria cuenta = obtenerCuenta();
        if (cuenta != null) {
            System.out.print("Monto a retirar: ");
            double monto = scanner.nextDouble();
            scanner.nextLine();
            cuenta.retirar(monto);
        }
    }

    private static void consultarSaldo() {
        CuentaBancaria cuenta = obtenerCuenta();
        if (cuenta != null) {
            System.out.println("Saldo actual: " + cuenta.getSaldo());
        }
    }

    private static void mostrarTodasLasCuentas() {
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas registradas.");
        } else {
            System.out.println("\n--- TODAS LAS CUENTAS ---");
            for (CuentaBancaria cuenta : cuentas.values()) {
                cuenta.mostrarInformacion();
            }
        }
    }

    private static CuentaBancaria obtenerCuenta() {
        System.out.print("Ingrese número de cuenta: ");
        String numero = scanner.nextLine();
        CuentaBancaria cuenta = cuentas.get(numero);

        if (cuenta == null) {
            System.out.println("Cuenta no encontrada.");
        }
        return cuenta;
    }
}