package org.DWES.ejercicioArrayList1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> personas = new ArrayList<>();

        //Añadir personas
        personas.add("Daniel");
        personas.add("Pablo");
        personas.add("Samuel");
        personas.add("Howard");
        personas.add("Nacho");
        personas.add("Lorenzo");

        System.out.println("Listas: " + personas);

        //Devolver el tamaño de mi ArrayList
        System.out.println("Tamaño del vector: " + personas.size());

        personas.add(1,"Jesús");

        //Añadir personas por posición
        System.out.println("Listas: " + personas);

        //Devuelve la persona de la posición 3
        System.out.println("Persona de la posición 3: " +  personas.get(3));

        //Borrar un elementoç
        personas.remove(3);
        System.out.println("Listas: " + personas);

        //Comprobar si una persona esta en el ArrayList
        boolean existe = personas.contains("Lorenzo");
        System.out.println("Esta Lorenzo en el ArrayList: " + existe);

        //Para subescribir un elemento de un ArrayList en la posición que queramos
        personas.set(0, "Luis");
        System.out.println("Listas: " + personas);

        //Para saber en que posición está el elemento
        int posicionLuis = personas.indexOf("Luis");
        System.out.println("Luis: " + personas.get(posicionLuis));

        //Última posición de un elemento repetido
        int ultimaposicionLuis = personas.lastIndexOf("Luis");
        System.out.println("La última posición de Luis es: " + ultimaposicionLuis);

        //Comprobar si un ArrayList
        if (personas.isEmpty()== true) {
            System.out.println("Este arraylist está vaío");
        } else {
            System.out.println("No está vacío: " +  personas);
        }

        //Borrar un Arraylist entero
        personas.clear();
        System.out.println("Listas: " + personas);

        //Comprobar si un ArrayList
        if (personas.isEmpty()== true) {
            System.out.println("Este arraylist está vaío");
        } else {
            System.out.println("No está vacío: " +  personas);
        }
    }
}
