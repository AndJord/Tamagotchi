package Logica;

import Alimentos.Alimentos;
import Habitos.Entretenimiento;
import Medicina.Medicamentos;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Mascota {

    private int edad;
    private Circunstancia circunstancia;
    private Crecimiento crecimiento;
    private Condicion condicion;
    private int energia;
    private int hambre;
    private int animo;
    private int necesidades;
    private int salud;
    private static Mascota pollo;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100) {
            this.edad = edad;
        }
    }

    public Crecimiento getEtapa() {
        return crecimiento;
    }

    public void setEtapa(Crecimiento crecimiento) {
        this.crecimiento = crecimiento;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia >= 0 && energia < 100) {
            this.energia = energia;
        } else if (energia >= 100) {
            this.energia = 100;
        } else if (energia < 0) {
            this.energia = 0;
        }
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        if (hambre >= 0 && hambre < 100) {
            this.hambre = hambre;
        } else if (hambre >= 100) {
            this.hambre = 100;
        } else if (hambre < 0) {
            this.hambre = 0;
        }
    }

    public int getAnimo() {
        return animo;
    }

    public void setAnimo(int animo) {
        if (animo >= 0 && animo < 100) {
            this.animo = animo;
        } else if (animo >= 100) {
            this.animo = 100;
        } else if (animo < 0) {
            this.animo = 0;
        }
    }

    public int getNecesidades() {
        return necesidades;
    }

    public void setNecesidades(int necesidades) {
        if (necesidades >= 0 && necesidades < 100) {
            this.necesidades = necesidades;
        } else if (necesidades >= 100) {
            this.necesidades = 100;
        } else if (necesidades < 0) {
            this.necesidades = 0;
        }
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        if (salud >= 0 && salud <= 100) {
            this.salud = salud;
        } else if (salud > 100) {
            this.salud = 100;
        } else if (salud < 0) {
            this.salud = 0;
        }
    }

    public Circunstancia getCircunstancia() {
        return circunstancia;
    }

    public void setCircunstancia(Circunstancia circunstancia) {
        this.circunstancia = circunstancia;
    }

    private Mascota() {
        edad = 1;
        circunstancia = Circunstancia.Despierto;
        crecimiento = crecimiento.Huevo;
        condicion = condicion.Saludable;
        energia = 50;
        hambre = 50;
        animo = 50;
        necesidades = 50;
        salud = 100;
    }

    public static Mascota inicializar() {
        if (pollo == null) {
            pollo = new Mascota();
        }
        return pollo;
    }

    public void comer(Alimentos objeto) {
        setNecesidades(getNecesidades() + objeto.getNecesidades());
        setEnergia(getEnergia() + objeto.getEnergia());
        setHambre(getHambre() - objeto.getSatisfaccion());
    }

    public void entretenerse(Entretenimiento objeto) {
        setEnergia(getEnergia() - objeto.getEnergia());
        setAnimo(getAnimo() - objeto.getEntretenimiento());
    }

    public void curar(Medicamentos objeto) {
        if (getCondicion().equals(Condicion.Saludable)) {
            setCondicion(Condicion.Enfermo);
            JOptionPane.showMessageDialog(null, "Lamentablemente Tu Mascota Esta Enferma", "Aviso", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, "Se Recomienda Utilizar Medicina Lo Mas Pronto Posible", "Recomendacion", JOptionPane.WARNING_MESSAGE);
            Controlador.getControlador().salud();
        } else if (getCondicion().equals(Condicion.Enfermo)) {
            setCondicion(Condicion.Saludable);
            setSalud(getSalud() + objeto.getCurar());
        }
    }

}
