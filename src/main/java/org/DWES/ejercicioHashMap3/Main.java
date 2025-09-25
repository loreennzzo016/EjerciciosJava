package org.DWES.ejercicioHashMap3;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Estudiante>> grupo = new HashMap<>();

        Estudiante estudiante1 = new Estudiante("Ana", 20);
        Estudiante estudiante2 = new Estudiante("Luis", 22);
        Estudiante estudiante3 = new Estudiante("María", 21);

        grupo.put("grupo1", new ArrayList<>());
        grupo.put("grupo2", new ArrayList<>());

        grupo.get("grupo1").add(estudiante1);
        grupo.get("grupo1").add(estudiante2);
        grupo.get("grupo2").add(estudiante3);

        for (String key : grupo.keySet()) {
            System.out.println("Clave: " + key);
            for (Estudiante estudiante : grupo.get(key)) {
                System.out.println(estudiante);
            }
        }
    }
}