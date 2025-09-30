package org.DWES.ejercicioArrayList2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int suma = 0;
        int minimo = 100;
        int maximo = 0;

        // Tamaño aleatorio entre 10 y 20
        int tan = (int) (Math.random() * 11 + 10);

        ArrayList<Integer> a = new ArrayList<>();

        // Rellenar la lista con valores aleatorios entre 0 y 100
        for (int i = 0; i < tan; i++) {
            a.add((int) (Math.random() * 101));
        }

        // Mostrar lista
        System.out.println("Lista: " + a);

        // Calcular suma, mínimo y máximo
        for (int n : a) {
            suma += n;
            if (n < minimo) minimo = n;
            if (n > maximo) maximo = n;
        }

        // Mostrar resultados
        System.out.println("La suma total es: " + suma);
        System.out.println("La media es: " + (double) suma / tan);
        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);

        // También usando Collections
        System.out.println();
        System.out.println("El valor máximo (Collections): " + Collections.max(a));
        System.out.println("El valor mínimo (Collections): " + Collections.min(a));
    }
}