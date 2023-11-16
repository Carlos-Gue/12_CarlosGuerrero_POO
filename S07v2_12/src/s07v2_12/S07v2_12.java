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
// Crear objetos
        Persona_12 persona1 = new Persona_12("Juan", 25, 1.80);
        Persona_12 persona2 = new Persona_12("Pedro", 30, 1.70);

        // Invocar métodos
        persona1.saludar();
        persona2.saludar("Marta");

        // Obtener el valor de retorno de un método
        double edadPromedio = persona1.calcularEdadPromedio(persona1, persona2);
        System.out.println("La edad promedio es: " + edadPromedio);

        // Invocar un método con parámetros y argumentos
        persona1.subirEdad(5);
        persona2.aumentarAltura(0.20);

        // Imprimir los atributos de los objetos
        System.out.println("El nombre de la persona 1 es: " + persona1.nombre);
        System.out.println("La edad de la persona 1 es: " + persona1.edad);
        System.out.println("La altura de la persona 1 es: " + persona1.altura);

        System.out.println("El nombre de la persona 2 es: " + persona2.nombre);
        System.out.println("La edad de la persona 2 es: " + persona2.edad);
        System.out.println("La altura de la persona 2 es: " + persona2.altura);
    }    
}
