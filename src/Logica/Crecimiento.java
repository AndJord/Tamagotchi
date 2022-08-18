/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Logica;

/**
 *
 * @author andre
 */
public enum Crecimiento {
    Huevo(1),Bebe(2),Joven(3),Adulto(4);
    
    private int valor;

    private Crecimiento(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
