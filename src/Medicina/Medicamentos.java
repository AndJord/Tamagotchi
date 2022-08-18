/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medicina;

/**
 *
 * @author angel
 */
public class Medicamentos {
 private double duracion;
private int  curar;

    public double getDuracion() {
        return duracion;
    }

    public int getCurar() {
        return curar;
    }

    public Medicamentos(int curar) {
        this.duracion = 1000;
        this.curar = curar;
    }
 
}
