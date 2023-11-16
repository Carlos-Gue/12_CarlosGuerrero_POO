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
public class Deportista_12 extends Persona_12 {

    public Deportista_12(String deporte, int nivel, String club, String nombre, int edad) {
        super(nombre, edad);
        this.deporte = deporte;
        this.nivel = nivel;
        this.club = club;
    }
    
    // Atributos
    private String deporte;
    private int nivel;
    private String club;

    // Métodos
    public void entrenar() {
    }

    public void mostrarEdad() {
    }   
}
