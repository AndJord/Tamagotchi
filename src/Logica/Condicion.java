/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Logica;

/**
 *
 * @author andre
 */
public enum Condicion {
       Saludable(1),Enfermo(2);
    
    private int valor;

    private Condicion(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
