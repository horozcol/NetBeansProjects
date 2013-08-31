/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu4java;

/**
 *
 * @author hol
 */
public class Perro {

    private String nombre;
    private String color;
    private double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void imprimirPerro() {
        System.out.println("El perro " + this.nombre + " es de color " + this.color + " y pesa " + this.peso + " Kilos.");
    }
}
