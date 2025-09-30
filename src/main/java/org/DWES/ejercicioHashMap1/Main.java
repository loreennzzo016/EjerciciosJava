package org.DWES.ejercicioHashMap1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Array de palabras
        String[] palabras = {"Hola", "mundo", "hola", "Java", "Mundo", "java", "Hola"};

        // Crear el HashMap
        Map<String, Integer> contador = new HashMap<>();

        // Recorrer el array y contar las palabras
        for (String palabra : palabras) {
            String palabraNormalizada = palabra.toLowerCase(); // Ignorar mayúsculas

            // Actualizar el contador
            contador.put(palabraNormalizada, contador.getOrDefault(palabraNormalizada, 0) + 1);
        }

        // Mostrar resultados
        for (Map.Entry<String, Integer> entrada : contador.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}

