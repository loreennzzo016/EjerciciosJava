package org.DWES.ejercicioArrayList5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Coche> coches = new ArrayList<>();

        coches.add(new Coche("Toyota", 22000));
        coches.add(new Coche("BMW", 35000));
        coches.add(new Coche("Audi", 35000));
        coches.add(new Coche("Ford", 18000));
        coches.add(new Coche("Audi", 32000));

        System.out.println("Lista sin ordenar:");
        for (Coche c : coches) {
            System.out.println(c);
        }

        // Ordenar por marca (alfabéticamente) y luego por precio (ascendente)
        Collections.sort(coches, new Comparator<Coche>() {
            @Override
            public int compare(Coche c1, Coche c2) {
                int marcaCompare = c1.getMarca().compareToIgnoreCase(c2.getMarca());
                return (marcaCompare != 0) ? marcaCompare : Double.compare(c1.getPrecio(), c2.getPrecio());
            }
        });

        System.out.println("\nLista ordenada por marca y precio:");
        for (Coche c : coches) {
            System.out.println(c);
        }
    }
}