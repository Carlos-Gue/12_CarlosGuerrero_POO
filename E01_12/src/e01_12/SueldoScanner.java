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
public class SueldoScanner {
    public static void main(String[] args) {
        // Declaramos las variables
        int horasTrabajadas;
        double sueldoPorHora;
        double sueldoBruto;
        double bono;

        // Declaramos el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Solicitamos las horas trabajadas
        System.out.println("Ingrese las horas trabajadas: ");
        horasTrabajadas = sc.nextInt();

        // Solicitamos el sueldo por hora
        System.out.println("Ingrese el sueldo por hora: ");
        sueldoPorHora = sc.nextDouble();

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
        System.out.println("El sueldo bruto es: " + sueldoBruto + " soles" + "\nEl bono es: " + bono + " soles" + "\nEl sueldo neto es: " + sueldoNeto + " soles");
    }
}
