package org.DWES.ejercicioHashMap2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // Crear HashMap con los usuarios y sus contraseñas
        Map<String, String> usuarios = new HashMap<>();
        usuarios.put("nombre1", "contraseña1");
        usuarios.put("nombre2", "contraseña2");
        usuarios.put("nombre3", "contraseña3");

        Scanner scanner = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Nombre de usuario: ");
            String nombre = scanner.nextLine();

            System.out.print("Contraseña: ");
            String clave = scanner.nextLine();

            // Verificar las credenciales
            if (usuarios.containsKey(nombre) && usuarios.get(nombre).equals(clave)) {
                System.out.println("Has accedido al área restringida " + nombre + "!");
                return;
            } else {
                intentos--;
                System.out.println("Lo siento, no tiene acceso al área restringida. Quedan " + intentos + " intentos.");
                if (intentos == 0) {
                    System.out.println("Has agotado todos los intentos. Acceso bloqueado.");
                }
            }
        }
    }
}
