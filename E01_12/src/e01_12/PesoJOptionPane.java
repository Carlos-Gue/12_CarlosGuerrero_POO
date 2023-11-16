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
public class PesoJOptionPane {
    public static void main(String[] args) {
        // Declaramos las variables
        String sexo;
        int peso, altura;

        // Solicitamos el sexo
        sexo = JOptionPane.showInputDialog("Ingrese su sexo (H/M): ");

        // Solicitamos el peso
        peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su peso (kg): "));

        // Solicitamos la altura
        altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura (cm): "));

        // Calculamos el peso ideal
        double pesoIdeal = 0;
        if (sexo.equalsIgnoreCase("H")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        // Imprimimos el peso ideal
        JOptionPane.showMessageDialog(null, "Su peso ideal es: " + pesoIdeal + " kg");
    }
}
