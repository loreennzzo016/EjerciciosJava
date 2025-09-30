package org.DWES.ejercicioHashMap6;

import java.util.HashMap;
import java.util.Scanner;

public class Capitales {
    public static void main(String[] args) {

        // Diccionario inicial con capitales conocidas
        HashMap<String, String> capitales = new HashMap<>();
        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa de capitales.");
        System.out.println("Escribe 'salir' para terminar.\n");

        while (true) {
            System.out.print("Introduce el nombre de un país: ");
            String pais = scanner.nextLine().trim();

            if (pais.equalsIgnoreCase("salir")) {
                System.out.println("¡Hasta luego!");
                break;
            }

            if (capitales.containsKey(pais)) {
                System.out.println("La capital de " + pais + " es " + capitales.get(pais) + ".\n");
            } else {
                System.out.println("No conozco la capital de " + pais + ".");
                System.out.print("¿Cuál es la capital de " + pais + "? ");
                String nuevaCapital = scanner.nextLine().trim();
                capitales.put(pais, nuevaCapital);
                System.out.println("Gracias. He aprendido que la capital de " + pais + " es " + nuevaCapital + ".\n");
            }
        };
    }
}