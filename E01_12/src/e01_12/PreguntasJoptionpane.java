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
public class PreguntasJoptionpane {
    public static void main(String[] args) {
        // Declaramos la variable
        String nombre;

        // Solicitamos el nombre
        nombre = JOptionPane.showInputDialog("Ingrese su nombre completo: ");

        // Comprobamos si el nombre comienza con A
        if (nombre.charAt(0) == 'A') {
            // Imprimimos el nombre 3 veces
            JOptionPane.showMessageDialog(null, nombre + " " + nombre + " " + nombre);
        } else {
            // Imprimimos el nombre una vez
            JOptionPane.showMessageDialog(null, nombre);
        }
    }
}
