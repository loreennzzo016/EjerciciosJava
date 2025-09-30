package org.DWES.apuntesHashMapas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> personas = new ArrayList<>();

        // Añadir persona
        personas.add("Antonio");
        personas.add("Fernando");
        personas.add("Pedro");
        personas.add("Jose");
        personas.add("Maria");
        personas.add("Alonso");

        System.out.println("Lista de personas: " + personas);

        // Devolver el tamaño de mi arrayList
        System.out.println("Tamaño del arrayList: " +personas.size());

        // Añadir en una posición en concreto
        personas.add(1, "Luis");

        // Mostrar arrayList
        System.out.println("Lista de personas: " + personas);

        // Devolver la persona de la posición 3
        System.out.println("La persona en la posición 3 es: " + personas.get(3));

        // Eliminar elemento de arrayList
        personas.remove(3);
        System.out.println("Lista de personas: " + personas);

        // Comprobar si una persona está en el arrayList
        boolean estaAntonio=personas.contains("Antonio");
        System.out.println("Esta antonio en el ArrayList: " + estaAntonio);

        // Para machacar un elemento de un arrayList en la posicion que queramos
        personas.set(0, "Pepito");
        System.out.println("Lista: " + personas);

        // Saber en que posición está un elemento
        int posicionAlonso=personas.indexOf("Alonso");
        System.out.println("La posición de alonso es: " + posicionAlonso);

        // Comprobar si un arrayList está vacio
        if(personas.isEmpty()){
            System.out.println("La lista esta vacia");
        } else {
            System.out.println("La lista no esta vacia: " + personas);
        }

        // Limpiar el arrayList
        personas.clear();
        System.out.println("Lista de personas está vacía: " + personas);

        // Comporbar si un arrayList está vacío
        if (personas.isEmpty()){
            System.out.println("La lista esta vacia");
        } else  {
            System.out.println("La lista no esta vacia: " + personas);
        }
    }

}
