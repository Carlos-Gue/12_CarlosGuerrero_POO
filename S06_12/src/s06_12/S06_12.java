/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s06_12;

import java.util.Scanner;
/**
 *
 * @author cga20
 */
public class S06_12 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //estudiante
        Estudiante_12 estudiante = new Estudiante_12("Carlos", "Guerrero", 23);
        estudiante.mostrarInformacion();
        estudiante.saludar();
        estudiante.saludar("¡Hola a todos!");
        System.out.println("Nombre Completo: " + estudiante.obtenerNombreCompleto());
        
        //calculadora
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        // Uso del constructor con valores predeterminados
        Calculadora_12 calculadora = new Calculadora_12(num1, num2);
    }
}
