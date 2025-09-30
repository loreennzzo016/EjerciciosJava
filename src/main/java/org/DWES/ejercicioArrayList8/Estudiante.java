package org.DWES.ejercicioArrayList8;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private ArrayList<Double> calificaciones;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    public void agregarCalificacion(double nota) {
        calificaciones.add(nota);
    }

    public double calcularPromedio() {
        if (calificaciones.isEmpty()) return 0;
        double suma = 0;
        for (double nota : calificaciones) {
            suma += nota;
        }
        return suma / calificaciones.size();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }
}
