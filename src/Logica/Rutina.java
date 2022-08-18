/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Alimentos.Agua;
import Alimentos.Alimentos;
import Alimentos.Concentrado;
import Alimentos.Lagartija;
import Alimentos.Lombriz;
import Alimentos.Maiz;
import Habitos.Aletear;
import Habitos.Cacarear;
import Habitos.Caminar;
import Habitos.Entretenimiento;
import Habitos.Escarbar;
import Habitos.Volar;
import Medicina.Inyeccion;
import Medicina.Medicamentos;
import Medicina.Pastillas;
import Medicina.PosioSalud;

/**
 *
 * @author andre
 */
public class Rutina {

    public Medicamentos ConstMed(int tipo) {
        switch (tipo) {
            case 1:
                return new Inyeccion();
            case 2:
                return new Pastillas();
            case 3:
                return new PosioSalud();
            default:
                return null;
        }
    }

    public Entretenimiento ConstActv(int tipo) {
        switch (tipo) {
            case 1:
                return new Aletear();
            case 2:
                return new Cacarear();
            case 3:
                return new Escarbar();
            case 4:
                return new Caminar();
            case 5:
            return new  Volar();
            default:
                return null;
        }
    }

    public Alimentos ConstAlm(int tipo) {
        switch (tipo) {
            case 1:
                return new Agua();
            case 2:
                return new Concentrado();
            case 3:
                return new Maiz();
            case 4:
                return new Lombriz();
            case 5:
                return new Lagartija();
            default:
                return null;
        }
    }
}
