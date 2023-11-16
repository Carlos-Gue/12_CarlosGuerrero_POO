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
public class SueldoJoptionpane {
    public static void main(String[] args) {
        // Declaramos las variables
        int horasTrabajadas;
        double sueldoPorHora;
        double sueldoBruto;
        double bono;

        // Solicitamos las horas trabajadas
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas: "));

        // Solicitamos el sueldo por hora
        sueldoPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo por hora: "));

        // Calculamos el sueldo bruto
        sueldoBruto = horasTrabajadas * sueldoPorHora;

        // Si supera las 100 horas, se le da un bono
        if (horasTrabajadas > 100) {
            bono = 100;
        } else {
            bono = 0;
        }

        // Calculamos el sueldo neto
        double sueldoNeto = sueldoBruto + bono;

        // Imprimimos el resultado
        JOptionPane.showMessageDialog(null, "El sueldo bruto es: " + sueldoBruto + " soles" + "\nEl bono es: " + bono + " soles" + "\nEl sueldo neto es: " + sueldoNeto + " soles");
    }
}
