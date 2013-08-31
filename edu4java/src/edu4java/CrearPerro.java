/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu4java;

/**
 *
 * @author hol
 */
public class CrearPerro {

    public static void main(String[] s) {
        Perro perro1 = new Perro();
        perro1.setNombre("Puffy");
        perro1.setColor("Café");
        perro1.setPeso(35.4);
        Perro perro2 = new Perro();
        perro2.setNombre("Jack");
        perro2.setColor("Blanco y café");
        perro2.setPeso(6.4);
        perro1.imprimirPerro();
        perro2.imprimirPerro();

    }
}
