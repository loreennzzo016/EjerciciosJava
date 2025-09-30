package org.DWES.ejercicioArrayList9;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> coleccion = new ArrayList<>();

    public Biblioteca() {
    }

    public void agregarLibro(Libro libro) {
        coleccion.add(libro);
    }

    public ArrayList<Libro> buscarPorTitulo(String titulo) {
        ArrayList<Libro> resultados = new ArrayList<>();
        for (Libro libro : coleccion) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
               resultados.add(libro);
            }
        }
        return resultados;
    }

    public void listarLibros() {
        for (Libro libro : coleccion) {
            System.out.println("Titulo " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Año de publicación: " + libro.getAnoPublicacion());
            System.out.println("-------------------------");
        }

    }
}