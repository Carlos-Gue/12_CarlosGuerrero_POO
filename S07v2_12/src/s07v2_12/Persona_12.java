/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07v2_12;

/**
 *
 * @author cga20
 */
public class Persona_12 {
    // Atributos
    String nombre;
    int edad;
    double altura;

    // Constructor
    public Persona_12(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Métodos
    // Sobrecarga de métodos
    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    public void saludar(String nombre) {
        System.out.println("Hola, soy " + nombre);
    }

    // Métodos con valores de retorno
    public double calcularEdadPromedio(Persona_12 persona1, Persona_12 persona2) {
        return (persona1.edad + persona2.edad) / 2.0;
    }

    public double calcularIMC() {
        return altura / Math.pow(edad, 2);
    }

    // Métodos con parámetros y argumentos
    public void subirEdad(int cantidad) {
        edad += cantidad;
    }

    public void aumentarAltura(double cantidad) {
        altura += cantidad;
    }
}
