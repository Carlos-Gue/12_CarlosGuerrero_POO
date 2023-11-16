/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e01_12;

import javax.swing.JOptionPane;
/**
 *
 * @author cga20
 */
public class NumeroScanner {

    private static int numeroUsuarioEntero;

        public static void main(String[] args) {
        // Generamos un número aleatorio
        int numeroAleatorio = (int) (Math.random() * 5) + 1;

        // Bucle de juego
        do {
            // Solicitamos al usuario un número
            String numeroUsuario = JOptionPane.showInputDialog("Adivina un número entre el 1 y el 5: ");

            // Convertimos el número a un entero
            int numeroUsuarioEntero = Integer.parseInt(numeroUsuario);

            // Comprobamos si el número es correcto
            if (numeroUsuarioEntero == numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "¡Has acertado!");
            } else {
                JOptionPane.showMessageDialog(null, "El número correcto es: " + numeroAleatorio);
            }
        } while (numeroUsuarioEntero != numeroAleatorio);
    }
}
