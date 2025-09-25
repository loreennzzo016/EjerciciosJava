package org.DWES.ejercicioArrayList6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Luis", 32));
        personas.add(new Persona("Marta", 19));
        personas.add(new Persona("Carlos", 40));

        int edadReferencia = 30;
        int contador = 0;

        for (Persona p : personas) {
            if (p.getEdad() > edadReferencia) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " personas con edad mayor que " + edadReferencia + ".");
    }
}
