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
public class PesoScanner {
    public static void main(String[] args) {
        // Declaramos las variables
        String sexo;
        int peso, altura;

        // Declaramos el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Solicitamos el sexo
        System.out.println("Ingrese su sexo (H/M): ");
        sexo = sc.next();

        // Solicitamos el peso
        System.out.println("Ingrese su peso (kg): ");
        peso = sc.nextInt();

        // Solicitamos la altura
        System.out.println("Ingrese su altura (cm): ");
        altura = sc.nextInt();

        // Calculamos el peso ideal
        double pesoIdeal = 0;
        if (sexo.equalsIgnoreCase("H")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        // Imprimimos el peso ideal
        System.out.println("Su peso ideal es: " + pesoIdeal + " kg");
    }
}
