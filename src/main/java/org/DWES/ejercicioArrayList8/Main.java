package org.DWES.ejercicioArrayList8;

public class Main {
    public static void main(String[] args) {
        Estudiante juan = new Estudiante("Juan");
        juan.agregarCalificacion(8.5);
        juan.agregarCalificacion(9.0);
        juan.agregarCalificacion(6.7);
        juan.agregarCalificacion(2.4);

        Estudiante maria = new Estudiante("María");
        maria.agregarCalificacion(7.0);
        maria.agregarCalificacion(5.6);
        maria.agregarCalificacion(9.0);

        GestorEstudiante gestor = new GestorEstudiante();
        gestor.agregarEstudiante(juan);
        gestor.agregarEstudiante(maria);

        double promedioGeneral = gestor.calcularPromedioGeneral();
        System.out.println("Promedio general: " + String.format("%.3f", promedioGeneral));

    }
}
