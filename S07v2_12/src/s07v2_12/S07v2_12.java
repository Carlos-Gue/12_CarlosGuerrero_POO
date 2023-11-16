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
public class S07v2_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona_12 persona1 = new Persona_12();
        persona1.nombre = "Victor";
        persona1.edad = 26;

        Persona_12 persona2 = new Persona_12();
        persona2.nombre = "Lucia";
        persona2.edad = 23;

        System.out.println(persona1.presentarse());
        persona1.Edad();

        System.out.println("La edad de " + persona1.getNombre() + " en días es: " + persona1.edadEnDias());
        System.out.println("¿Es mayor de edad? " + (persona1.esMayorDeEdad() ? "Sí" : "No"));

        System.out.println();

        System.out.println(persona2.presentarse());
        persona2.Edad();
        System.out.println("La edad de " + persona2.getNombre() + " en días es: " + persona2.edadEnDias());
        System.out.println("¿Es mayor de 18 años? " + (persona2.esMayorDeEdad() ? "Sí" : "No"));  
    }    
}
