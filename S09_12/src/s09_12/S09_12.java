/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09_12;

/**
 *
 * @author cga20
 */
public class S09_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CALCULADORA
        Calculadora_12 objcalculadora = new Calculadora_12();
        objcalculadora.presentar();
        objcalculadora.preguntar();
        objcalculadora.suma();
        objcalculadora.resta();
        objcalculadora.multiplicar();
        objcalculadora.dividir();
        objcalculadora.responder();
        
        //ANIMAL
        Animal_12 animal = new Animal_12();
        animal.preguntarAnimal();
        animal.presentarAnimal();
        animal.informacionAnimal();
        
        
        //ESTUDIANTE
        Estudiante_12 obEstudiante = new Estudiante_12();
        obEstudiante.presentarEstudiante();
        obEstudiante.mostrarInformacion();
        obEstudiante.obtenerNombreCompleto();
        obEstudiante.saludar();
        obEstudiante.saludar("carlos");
    }
    
}
