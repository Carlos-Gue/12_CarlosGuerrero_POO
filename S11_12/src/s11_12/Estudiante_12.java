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
public class Estudiante_12 extends Persona_12 {

    public Estudiante_12(String carrera, int promedio, int nmatricula, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.promedio = promedio;
        this.nmatricula = nmatricula;
    }
    
    // Atributos
    private String carrera;
    private int promedio;
    private int nmatricula;

    // Métodos
    public void estudiar() {
    }

    public void mostrarEdad() {
    }
}
