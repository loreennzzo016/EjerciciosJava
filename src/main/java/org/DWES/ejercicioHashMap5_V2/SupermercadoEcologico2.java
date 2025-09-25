package org.DWES.ejercicioHashMap5_V2;

import java.util.*;

public class SupermercadoEcologico2 {
    public static void main(String[] args) {
        // Diccionario de productos con precios y tipo de envase
        Map<String, Producto> productos = new HashMap<>();
        productos.put("guisantes", new Producto("bote", 1.50));
        productos.put("tomate frito", new Producto("bote", 2.10));
        productos.put("garbanzos", new Producto("bote", 1.80));
        productos.put("leche de avena", new Producto("brick", 2.50));
        productos.put("mermelada", new Producto("bote", 3.20));

        // Mapa para agrupar compras por producto
        Map<String, Integer> carrito = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al supermercado ecológico");
        System.out.println("Introduce el producto y cantidad (ejemplo: guisantes 3)");
        System.out.println("Escribe 'fin' para terminar la compra.\n");

        while (true) {
            System.out.print("Producto y cantidad: ");
            String entrada = scanner.nextLine().trim().toLowerCase();
            if (entrada.equals("fin")) break;

            String[] partes = entrada.split(" ");
            if (partes.length < 2) {
                System.out.println("Formato incorrecto. Usa: producto cantidad");
                continue;
            }

            try {
                int cantidad = Integer.parseInt(partes[partes.length - 1]);
                String nombreProducto = String.join(" ", Arrays.copyOf(partes, partes.length - 1));

                if (productos.containsKey(nombreProducto)) {
                    carrito.put(nombreProducto, carrito.getOrDefault(nombreProducto, 0) + cantidad);
                } else {
                    System.out.println("Producto no disponible.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Cantidad inválida.");
            }
        }

        // Solicitar código de descuento justo después de finalizar la compra
        System.out.print("\n¿Tienes un código de descuento? (escribe o pulsa Enter): ");
        String codigo = scanner.nextLine().trim().toUpperCase();
        boolean aplicarDescuento = codigo.equals("DESCUENTO");

        // Mostrar resumen
        double total = 0;
        System.out.println("\n Resumen de tu compra:");
        for (Map.Entry<String, Integer> entrada : carrito.entrySet()) {
            String nombre = entrada.getKey();
            int cantidad = entrada.getValue();
            Producto prod = productos.get(nombre);
            double subtotal = prod.precio * cantidad;
            total += subtotal;
            System.out.printf("- %d %s(s) de %s: %.2f €\n", cantidad, prod.envase, nombre, subtotal);
        }

        if (aplicarDescuento) {
            double descuento = total * 0.10;
            total -= descuento;
            System.out.printf("\n Código aplicado: DESCUENTO (-10%%)\nDescuento: %.2f €", descuento);
        }

        System.out.printf("\n\nTotal a pagar: %.2f €\n", total);
        scanner.close();
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
}