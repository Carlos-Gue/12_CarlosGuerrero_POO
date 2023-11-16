/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05_12;

import javax.swing.JOptionPane;
/**
 *
 * @author cga20
 */
public class Estudiante_12 {
        // Atributos
    String nombre;
    int edad;
    String carrera;
    String universidad;
    String direccion;
    String telefono; 

    // Métodos
    public void mostrarDatosConsola() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Universidad: " + universidad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }

    public void mostrarDatosJOptionPane() {
        String mensaje = "Nombre: " + nombre + "\nEdad: " + edad + "\nCarrera: " + carrera
                         + "\nUniversidad: " + universidad + "\nDirección: " + direccion
                         + "\nTeléfono: " + telefono;
        JOptionPane.showMessageDialog(null, mensaje, "Datos del Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }
}
