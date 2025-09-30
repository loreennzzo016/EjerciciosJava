package org.DWES.ejercicioArrayList3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Intoduce 10 números enteros: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + (i + 1) + ":");
            int num = sc.nextInt();
            numeros.add(num);
        }

        System.out.println("Lista sin ordenar: " + numeros);

        //Ordenar la lista
        Collections.sort(numeros);

        //Mostrar la lista ordenada
        System.out.println("Lista ordenada : " + numeros);
    }
}
