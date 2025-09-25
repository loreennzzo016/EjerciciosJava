package org.DWES.ejercicioArrayList7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> inventario = new ArrayList<>();
            inventario.add(new Producto("Laptop", 800.0, 2));
            inventario.add(new Producto("Smartphone", 500.0, 3));
            inventario.add(new Producto("Tablet", 300.0, 5));
            inventario.add(new Producto("Monitor", 150.0, 4));

        double valorTotalInventario = 0;

        for (Producto producto : inventario) {
            valorTotalInventario += producto.getValorTotal();
        }

        System.out.println("El valor total del inventario es:" + valorTotalInventario + "€" );
    }
}
