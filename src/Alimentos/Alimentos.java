/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alimentos;

/**
 *
 * @author andre
 */
public class Alimentos {

    private int energia;
    private double tiempo;
    private int satisfaccion;
    private int necesidades;

    public int getEnergia() {
        return energia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public int getSatisfaccion() {
        return satisfaccion;
    }

    public int getNecesidades() {
        return necesidades;
    }

    public Alimentos(int energia, double tiempo, int satisfaccion, int necesidades) {
        this.energia = energia;
        this.tiempo = tiempo;
        this.satisfaccion = satisfaccion;
        this.necesidades = necesidades;
    }
}
