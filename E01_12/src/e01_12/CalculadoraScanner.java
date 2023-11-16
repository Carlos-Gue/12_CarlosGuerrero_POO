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
public class CalculadoraScanner {
    public static void main(String[] args) {
        // Declaramos las variables
        int numero1, numero2;
        String operacion;

        // Declaramos el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Solicitamos los números
        System.out.println("Ingrese el primer número: ");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        numero2 = sc.nextInt();

        // Solicitamos la operación
        System.out.println("Ingrese la operación (suma, resta, multiplicación o división): ");
        operacion = sc.next();

        // Realizamos la operación
        switch (operacion) {
            case "suma":
                System.out.println("El resultado de la suma es: " + (numero1 + numero2));
                break;
            case "resta":
                System.out.println("El resultado de la resta es: " + (numero1 - numero2));
                break;
            case "multiplicación":
                System.out.println("El resultado de la multiplicación es: " + (numero1 * numero2));
                break;
            case "división":
                System.out.println("El resultado de la división es: " + (numero1 / numero2));
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }
}
