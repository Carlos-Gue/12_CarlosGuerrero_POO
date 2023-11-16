/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07_12;

/**
 *
 * @author cga20
 */
public class Persona1 {

    // Atributos
    String nombre;
    int edad;

    // Métodos con parámetros
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre + ", mi nombre es " + this.nombre);
    }

    public void mostrarEdad() {
        System.out.println("Mi edad es " + this.edad);
    }
}
