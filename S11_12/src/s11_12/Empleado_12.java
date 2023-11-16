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
public class Empleado_12 extends Persona_12 {

    public Empleado_12(String empresa, int salario, int horas, String nombre, int edad) {
        super(nombre, edad);
        this.empresa = empresa;
        this.salario = salario;
        this.horas = horas;
    }
    
    // Atributos
    private String empresa;
    private int salario;
    private int horas;

    // Métodos
    public void trabajar() {
    }

    public void mostrarEdad() {
    }
}
