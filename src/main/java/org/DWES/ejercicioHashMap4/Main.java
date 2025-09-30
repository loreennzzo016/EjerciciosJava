package org.DWES.ejercicioHashMap4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear el diccionario
        HashMap<String, String> diccionario = new HashMap<>();

        // Añadir palabras al diccionario
        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("gracias", "thank you");
        diccionario.put("por favor", "please");
        diccionario.put("amor", "love");

        // Crear el escáner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una palabra en español: ");
        String palabra = scanner.nextLine().toLowerCase();

        // Buscar la traducción
        if (diccionario.containsKey(palabra)) {
            System.out.println("La traducción en inglés es: " + diccionario.get(palabra));
        } else {
            System.out.println("Lo siento, esa palabra no está en el diccionario.");
        }
    }
}
