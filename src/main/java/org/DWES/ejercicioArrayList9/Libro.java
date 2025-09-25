package org.DWES.ejercicioArrayList9;

public class Libro {
    private String titulo;
    private Autor autor;
    private int anoPublicacion;

    public Libro(String titulo, Autor autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\", de " + autor + ", publicado en " + anoPublicacion;
    }
}
