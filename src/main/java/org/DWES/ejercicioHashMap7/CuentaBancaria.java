package org.DWES.ejercicioHashMap7;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
        } else if (monto <= 0) {
            System.out.println("El monto debe ser positivo.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        }
    }

    public void mostrarInformacion() {
        System.out.println("Cuenta: " + numeroCuenta + " | Saldo: " + saldo);
    }
}
