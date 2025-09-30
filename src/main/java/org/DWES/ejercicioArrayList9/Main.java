package org.DWES.ejercicioArrayList9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("Isabel Allende", "Chilena");
        Autor autor3 = new Autor("JK.Rowling", "Britanico");

        Libro libro1 = new Libro("Cien años de soledad", autor1, 1967);
        Libro libro2 = new Libro("Harry Potter 1", autor3, 1982);
        Libro libro3 = new Libro("Harry Potter 2", autor3, 1982);
        Libro libro4 = new Libro("La casa de los espíritus", autor2, 1982);


        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);

        biblioteca.listarLibros();

        System.out.println("\nBuscando libro por título:");
        ArrayList<Libro> encontrado = biblioteca.buscarPorTitulo("Cien años de soledad");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}
