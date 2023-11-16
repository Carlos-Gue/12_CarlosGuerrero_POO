/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05_12;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author cga20
 */
public class S05_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro_12 libro = new Libro_12();

        libro.titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        libro.autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        libro.genero = JOptionPane.showInputDialog("Ingrese el género del libro:");
        libro.añoPublicacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicación del libro:"));
        libro.editorial = JOptionPane.showInputDialog("Ingrese la editorial del libro:");
        libro.precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del libro:"));

        libro.infoJ();

        Estudiante_12 estudiante = new Estudiante_12();

        estudiante.nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        estudiante.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        estudiante.carrera = JOptionPane.showInputDialog("Ingrese la carrera del estudiante:");
        estudiante.universidad = JOptionPane.showInputDialog("Ingrese la universidad del estudiante:");
        estudiante.direccion = JOptionPane.showInputDialog("Ingrese la dirección del estudiante:");
        estudiante.telefono = JOptionPane.showInputDialog("Ingrese el número de teléfono del estudiante:");

        estudiante.mostrarDatosJOptionPane();

        Scanner scanner = new Scanner(System.in);

        CuentaBancaria_12 cuenta = new CuentaBancaria_12();
        System.out.println("Ingrese los datos de la cuenta bancaria:");
        cuenta.ingresarDatosDesdeScanner();

        Auto_12 auto = new Auto_12();
        System.out.println("\nIngrese los datos del auto:");
        auto.ingresarDatosDesdeScanner();

        cuenta.ingresarDinero(1000);
        cuenta.retirarDinero(500);
        cuenta.consultarSaldo();
        cuenta.cambiarTipoCuenta("Ahorros");

        auto.arrancar();
        auto.acelerar();
        auto.frenar();
        auto.detener();
    }
    
}
