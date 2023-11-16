/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_calculadora;

/**
 *
 * @author cga20
 */
public class Actividad_Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ACTIVIDAD DE CALCULADORA 1");
        System.out.println("");

        Calculadora1 miCalculadora1 = new Calculadora1();
        miCalculadora1.sumar(5, 3);
        miCalculadora1.restar(10, 4);
        miCalculadora1.multiplicar(7, 6);
        miCalculadora1.dividir(8, 2);
        miCalculadora1.dividir(6, 0);
        System.out.println("");
        
        
        System.out.println("ACTIVIDAD DE CALCULADORA 2");
        System.out.println("");

        Calculadora2 miCalculadora2 = new Calculadora2();
        int resultadoSuma = miCalculadora2.sumar(5, 3);
        System.out.println("La suma es: " + resultadoSuma);

        int resultadoResta = miCalculadora2.restar(10, 4);
        System.out.println("La resta es: " + resultadoResta);

        int resultadoMultiplicacion = miCalculadora2.multiplicar(7, 6);
        System.out.println("La multiplicación es: " + resultadoMultiplicacion);

        Calculadora2.dividir(8, 2);
        Calculadora2.dividir(6, 0);
    }
}