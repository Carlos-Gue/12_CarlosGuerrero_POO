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
public class CalculadoraJoptionpane {
    public static void main(String[] args) {
        // Declaramos las variables
        int numero1, numero2;
        String operacion;

        // Solicitamos los números
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));

        // Solicitamos la operación
        operacion = JOptionPane.showInputDialog("Ingrese la operación (suma, resta, multiplicación o división): ");

        // Realizamos la operación
        switch (operacion) {
            case "suma":
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + (numero1 + numero2));
                break;
            case "resta":
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + (numero1 - numero2));
                break;
            case "multiplicación":
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + (numero1 * numero2));
                break;
            case "división":
                JOptionPane.showMessageDialog(null, "El resultado de la división es: " + (numero1 / numero2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida.");
        }
    }
}
