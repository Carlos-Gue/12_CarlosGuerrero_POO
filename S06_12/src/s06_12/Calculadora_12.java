/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06_12;

/**
 *
 * @author cga20
 */
public class Calculadora_12 {
    
    // Constructores con valores predeterminados
    public Calculadora_12() {
    }

    public Calculadora_12(double num1, double num2) {
        System.out.println("Suma: " + sumar(num1, num2));
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Multiplicación: " + multiplicar(num1, num2));
        double resultadoDivision = dividir(num1, num2);
        if (!Double.isNaN(resultadoDivision)) {
            System.out.println("División: " + resultadoDivision);
        }
    }

    // Métodos con sobrecarga
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN;
        }
    }
}
