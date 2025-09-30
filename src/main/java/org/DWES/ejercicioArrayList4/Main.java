package org.DWES.ejercicioArrayList4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();

        System.out.println("Introduce 10 palabras:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            String palabra = sc.nextLine();
            palabras.add(palabra);
        }

        System.out.println("Lista sin ordenar: " + palabras);

        // Ordenar la lista alfabéticamente
        Collections.sort(palabras);

        //Ordenar al revés
        Collections.reverse(palabras);

        // Mostrar la lista ordenada
        System.out.println("Lista ordenada: " + palabras);
    }
}
