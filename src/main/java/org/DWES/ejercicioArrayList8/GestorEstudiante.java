package org.DWES.ejercicioArrayList8;

import java.util.ArrayList;

public class GestorEstudiante {
    private ArrayList<Estudiante> estudiantes;

    public GestorEstudiante() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public double calcularPromedioGeneral() {
        double sumaTotal = 0;
        int cantidadNotas = 0;

        for (Estudiante estudiante : estudiantes) {
            for (double nota : estudiante.getCalificaciones()) {
                sumaTotal += nota;
                cantidadNotas++;
            }
        }

        return cantidadNotas == 0 ? 0 : sumaTotal / cantidadNotas;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
