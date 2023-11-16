/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09_12;

import java.util.Scanner;
/**
 *
 * @author cga20
 */
public class Calculadora_12 {
    // Atributos
    int a;
    int b;
    int sum, res, mul, div;

    // Método
    public void suma() {
        sum = a + b;
    }

    public void resta() {
        res = a - b;
    }

    public void multiplicar() {
        mul = a * b;
    }

    public void dividir() {
        if (b != 0) {
            div = a / b;
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }

    public void preguntar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        a = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        b = scanner.nextInt();
        System.out.println("");
    }

    public void responder() {
        System.out.println("La suma de " + a + " y " + b + " es: " + sum);
        System.out.println("La resta de " + a + " y " + b + " es: " + res);
        System.out.println("La multiplicación de " + a + " y " + b + " es: " + mul);
        if (b != 0) {
            System.out.println("La división de " + a + " y " + b + " es: " + div);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        
    }

    public void presentar() {
        System.out.println("    =================    ");
        System.out.println("    == Calculadora ==    ");
        System.out.println("    =================    ");
        System.out.println("");
    }
}
