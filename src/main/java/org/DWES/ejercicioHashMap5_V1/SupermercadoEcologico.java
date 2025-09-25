package org.DWES.ejercicioHashMap5_V1;

import java.util.*;

public class SupermercadoEcologico {
    public static void main(String[] args) {
        // Diccionario de productos con precios
        Map<String, Producto> productos = new HashMap<>();
        productos.put("guisantes", new Producto("bote", 1.50));
        productos.put("tomate frito", new Producto("brick", 2.10));
        productos.put("garbanzos", new Producto("bote", 1.80));
        productos.put("leche de avena", new Producto("brick", 2.50));
        productos.put("mermelada", new Producto("bote", 3.20));

        // Lista para almacenar la compra
        List<Compra> carrito = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a su Supermercado Ecologico: ");
        System.out.println("Escribe 'fin' para terminar la compra. \n");

        while (true) {
            System.out.print("Introduce el nombre del producto (o 'fin' para terminar): ");
            String nombreProducto = sc.nextLine().trim().toLowerCase();
            if (nombreProducto.equals("fin")) break;

            System.out.print("Introduce el tipo de envase: ");
            String envase = sc.nextLine().trim().toLowerCase();

            System.out.print("Introduce la cantidad: ");
            String cantidadStr = sc.nextLine().trim();

            try {
                int cantidad = Integer.parseInt(cantidadStr);
                Producto producto = productos.get(nombreProducto);

                if (producto != null && producto.envase.equalsIgnoreCase(envase)) {
                    carrito.add(new Compra(nombreProducto, envase, cantidad));
                } else {
                    System.out.println("Producto o envase no disponible.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Cantidad incorrecta.\n");
            }
        }

        // Mostrar Resumen
        // Mostrar Resumen
        double total = 0;
        System.out.println("\n🧾 Resumen de tu compra:");
        for (Compra compra : carrito) {
            Producto prod = productos.get(compra.nombre);
            double subtotal = prod.precio * compra.cantidad;
            total += subtotal;

            System.out.println("- Producto: " + compra.nombre);
            System.out.println("  Envase: " + compra.envase);
            System.out.println("  Cantidad: " + compra.cantidad);
            System.out.printf("  Precio unitario: %.2f €\n", prod.precio);
            System.out.printf("  Subtotal: %.2f €\n\n", subtotal);
        }

        System.out.printf("💰 Total a pagar: %.2f €\n", total);
    }

    // Clase para representar un producto
    static class Producto {
        String envase;
        double precio;

        Producto(String envase, double precio) {
            this.envase = envase;
            this.precio = precio;
        }
    }

    // Clase para representar una compra
    static class Compra {
        String nombre;
        String envase;
        int cantidad;

        Compra(String nombre, String envase, int cantidad) {
            this.nombre = nombre;
            this.envase = envase;
            this.cantidad = cantidad;
        }
    }
}