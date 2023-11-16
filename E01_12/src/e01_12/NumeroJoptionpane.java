/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e01_12;

import java.util.Scanner;
/**
 *
 * @author cga20
 */
public class NumeroJoptionpane {

    private static int numeroUsuario;

public static void main(String[] args) {
    // Generamos un número aleatorio
    int numeroAleatorio = (int) (Math.random() * 5) + 1;

    // Declaramos un objeto Scanner para leer la entrada del usuario
    Scanner sc = new Scanner(System.in);

    // Bucle de juego
    do {
        // Solicitamos al usuario adivinar un número
        System.out.println("Adivina un número entre el 1 y el 5: ");

        // Leemos el número ingresado por el usuario
        int numeroUsuario = sc.nextInt();

        // Comprobamos si el número es correcto
        if (numeroUsuario == numeroAleatorio) {
            System.out.println("¡Has acertado!");
        } else {
            System.out.println("El número correcto es: " + numeroAleatorio);
        }
    } while (numeroUsuario != numeroAleatorio);
}
}
