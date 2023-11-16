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
public class S07_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto de la clase Persona1
        Persona1 persona1 = new Persona1();
        persona1.nombre = "Juan Perez";
        persona1.edad = 20;

        // Llamamos al método saludar()
        persona1.saludar("Maria");

        // Llamamos al método mostrarEdad()
        persona1.mostrarEdad();

        // Creamos un objeto de la clase Persona2
        Persona2 persona2 = new Persona2();
        persona2.nombre = "Ana Lopez";
        persona2.edad = 25;

        // Imprimimos el nombre
        System.out.println("Nombre: " + persona2.getNombre());

        // Imprimimos la edad
        System.out.println("Edad: " + persona2.getEdad());
    }
    
}
