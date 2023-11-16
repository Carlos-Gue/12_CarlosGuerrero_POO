/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11_12;

/**
 *
 * @author cga20
 */
public class Persona_12 {

    public Persona_12(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Atributos
    private String nombre;
    private int edad;
    

    // Métodos
    public void saludar() {
        System.out.println("Hola, mi nombre es " + this.nombre);
    }

    public void mostrarEdad() {
        System.out.println("Mi edad es " + this.edad);
    }
}
