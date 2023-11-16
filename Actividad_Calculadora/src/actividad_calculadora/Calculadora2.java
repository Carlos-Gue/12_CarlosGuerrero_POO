/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_calculadora;

/**
 *
 * @author cga20
 */
public class Calculadora2 {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void dividir(int a, int b) {
        if (b != 0) {
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
