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
public class PreguntasScanner {
    public static void main(String[] args) {
        // Declaramos la variable
        String nombre;

        // Declaramos el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Solicitamos el nombre
        System.out.println("Ingrese su nombre completo: ");
        nombre = sc.nextLine();

        // Comprobamos si el nombre comienza con A
        if (nombre.charAt(0) == 'A') {
            // Imprimimos el nombre 3 veces
            System.out.println(nombre + " " + nombre + " " + nombre);
        } else {
            // Imprimimos el nombre una vez
            System.out.println(nombre);
        }
    }
}
