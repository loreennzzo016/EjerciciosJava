package org.ejercicios.DWEC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HOLA BIENVENIDO AL PROGRAMA");

        System.out.println("Introduce un numero entre 1 y 100");
        int numeroUsuario = sc.nextInt();

        if (numeroUsuario < 1 || numeroUsuario > 100) {
            System.out.println("El numero introducido no es valido");
        } else {
            int numeroAleatorio = (int) (Math.random() * 100) + 1;
            int intentos = 0;
            boolean acertado = false;

            while (intentos < 10 && !acertado) {
                intentos++;
                if (numeroUsuario < numeroAleatorio) {
                    System.out.println("El numero es mayor");
                } else if (numeroUsuario > numeroAleatorio) {
                    System.out.println("El numero es menor");
                } else {
                    acertado = true;
                    System.out.println("Has acertado en " + intentos + " intentos");
                }

                if (!acertado && intentos < 10) {
                    System.out.println("Introduce otro numero");
                    numeroUsuario = sc.nextInt();
                }
            }

            if (!acertado) {
                System.out.println("Lo siento, has agotado tus 10 intentos. El numero era " + numeroAleatorio);
            }
        }
    }
}