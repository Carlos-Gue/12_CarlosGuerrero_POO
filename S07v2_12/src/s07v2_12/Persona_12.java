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
    String nombre;
    int edad;

    public String presentarse() {
        return "Hola, mi nombre es " + nombre + " y tengo " + edad + " años.";
    }

    public void Edad() {
        System.out.println("Tengo " + edad + " años");
    }

    public void acciones() {
        System.out.println("Estoy Caminando");
    }

    public int edadEnDias() {
        return edad * 365;
    }

    public int ObtenerEdad(int par) {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public boolean esMayorDeEdad(int edadLimite) {
        return edad >= edadLimite;
    }
}
