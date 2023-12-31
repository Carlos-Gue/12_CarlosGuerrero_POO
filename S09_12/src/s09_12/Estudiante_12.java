/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09_12;

/**
 *
 * @author cga20
 */
public class Estudiante_12 {
    // Atributos
    String nombre;
    String apellido;
    int edad;

    // Constructores
    public Estudiante_12() {
    }

    public Estudiante_12(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Métodos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad + " años");
    }

    // Métodos con valores de retorno
    public String obtenerNombreCompleto() {
        return nombre + " " + apellido;
    }

    // Sobrecarga de métodos
    public void saludar() {
        System.out.println("¡Hola! Soy " + nombre);
    }

    public void saludar(String saludoPersonalizado) {
        System.out.println(saludoPersonalizado + " Soy " + nombre);
    }
    public void presentarEstudiante() {
        System.out.println("    =================    ");
        System.out.println("    == Estudiante ==    ");
        System.out.println("    =================    ");
        System.out.println("");
    }
}
