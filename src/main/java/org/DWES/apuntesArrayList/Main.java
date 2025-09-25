package org.DWES.apuntesArrayList;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> mapa = new HashMap<>();

        // Añadir datos al Mapa
        mapa.put("A", 1);
        mapa.put("B", 2);
        mapa.put("C", 3);

        System.out.println("mapa: " + mapa);

        // Sustituir valor en Mapa
        mapa.put("A", 4);
        mapa.put("D", 4);
        mapa.put("E", 2);

        System.out.println("mapa: " + mapa);

        // Obtener el dato de una clave (Clave es el primer dato, Valor es el segundo dato)
        System.out.println("El valor de la clave A: " + mapa.get("A"));

        // Para saber si está una clave o no
        System.out.println("¿Está la clave A? " + mapa.containsKey("A"));

        // Para saber si está un valor o no
        System.out.println("Está el valor 4? " + mapa.containsValue(4));

        // Borrar un elemento del mapa
        mapa.remove("A");
        System.out.println("mapa: " + mapa);

        // Saber tamaño del mapa
        System.out.println("El tamaño del mapa es: " + mapa.size());

        // Comprobar si está vacío o no
        System.out.println("El mapa está vacío: " + mapa.isEmpty());

        // Devolver todas las claves
        System.out.println("Conjunto de claves: " + mapa.keySet());

        // Devolver todos los valores
        System.out.println("Conjunto de valores: " + mapa.values());

        // Borrar mapa entero
        mapa.clear();
        System.out.println("mapa: " + mapa);


    }
}
