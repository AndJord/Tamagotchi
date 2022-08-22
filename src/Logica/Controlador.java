/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Ventanas.FRMLoby;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author andre
 */
public class Controlador {

    private FRMLoby loby;
    private Mascota mascota;

    public final int TIEMPO = 4000;
    private static Controlador unico;

    private int contador = 1;
    private double tiempo;
    private JButton btn;

    private Controlador(FRMLoby loby, Mascota mascota) {

        this.loby = loby;
        this.mascota = mascota;
        // this.estados = estados;
        ciclo.start();
        actualizar(mascota);

    }

    public static Controlador inicializar(FRMLoby juego, Mascota mascota) {

        if (unico == null) {
            unico = new Controlador(juego, mascota);
        }
        return unico;

    }

    public static Controlador getControlador() {
        return unico;
    }
//ciclo de tiempo del juego y la mascota
    Timer ciclo = new Timer(this.TIEMPO, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            sumarEdad();
            vida();
            actualizar(mascota);
            loby.setlblEdad(Integer.toString(mascota.getEdad()));
            crecimiento(mascota.getEdad());
            avisar();
            revisar();
        }
    });

    private void sumarEdad() {
        mascota.setEdad(mascota.getEdad() + 1);
    }

//actualizar estados
    public void actualizar(Mascota mascota) {
        try {
            loby.setEnergia(mascota.getEnergia());
            loby.setAnimo(mascota.getAnimo());
            loby.setHambre(mascota.getHambre());
            loby.setNecesidades(mascota.getNecesidades());
            loby.setSalud(mascota.getSalud());
            loby.lblEtapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pollo/" + mascota.getCondicion() + "/Pollo" + mascota.getEtapa() + mascota.getCondicion() + ".jpg")));
        } catch (Exception e) {
        }
    }
//estado de vida

    public void vida() {
        try {
            if (mascota.getCircunstancia().equals(Circunstancia.Despierto) && mascota.getCondicion().equals(Condicion.Saludable)) {
                afectacion(4, 2, 0);
            } else if (mascota.getCircunstancia().equals(Circunstancia.Dormido) && mascota.getCondicion().equals(Condicion.Saludable)) {
                afectacion(5, 0, 0);
            } else if (mascota.getCircunstancia().equals(Circunstancia.Despierto) && mascota.getCondicion().equals(Condicion.Enfermo)) {
                afectacion(8, 4, 8);
            } else if (mascota.getCircunstancia().equals(Circunstancia.Dormido) && mascota.getCondicion().equals(Condicion.Enfermo)) {
                afectacion(10, 2, 5);
            }
        } catch (Exception e) {
        }
    }
//afectacion de los estados

    private void afectacion(int val1, int val2, int val3) {
        this.mascota.setNecesidades(mascota.getNecesidades() + val1);
        this.mascota.setEnergia(mascota.getEnergia() - val2);
        this.mascota.setHambre(mascota.getHambre() + val1);
        this.mascota.setAnimo(mascota.getAnimo() + val1);
        this.mascota.setSalud(mascota.getSalud() - val3);
    }

    private void crecimiento(int edad) {
        try {
            switch (edad) {
                case 1:
                    mascota.setEtapa(Crecimiento.Huevo);
                    loby.lblEtapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pollo/" + mascota.getCondicion() + "/Huevo" + mascota.getCondicion() + ".jpg")));
                    break;
                case 4:
                    mascota.setEtapa(Crecimiento.Bebe);
                    loby.lblEtapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("Img/Pollo/" + mascota.getCondicion() + "/Pollito" + mascota.getCondicion() + ".jpg")));
                    break;
                case 12:
                    mascota.setEtapa(Crecimiento.Joven);
                    loby.lblEtapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pollo/" + mascota.getCondicion() + "/PolloJoven " + mascota.getCondicion() + ".jpg")));
                    break;
                case 20:
                    mascota.setEtapa(Crecimiento.Adulto);
                    loby.lblEtapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pollo/" + mascota.getCondicion() + " /Gallo " + mascota.getCondicion() + ".jpg")));
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
        }
    }

    public void dormir() {
        try {
            loby.lblEtapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pollo/Dormido/Pollo" + mascota.getEtapa() + "Durrmiendo.jpg")));
        } catch (Exception e) {
        }
    }

    public void despertar() {
        try {
            loby.lblEtapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pollo/" + mascota.getCondicion() + "/Pollo" + mascota.getEtapa() + mascota.getCondicion() + ".jpg")));
        } catch (Exception e) {
        }
    }
//bloqueo de  los botones alimentos, actividades, medicina

    public void bloqueo(JButton btn, double tiempo) {
        try {
            btn.setEnabled(false);
            this.btn = btn;
            this.tiempo = tiempo;
            bloqueado.restart();
        } catch (Exception e) {
        }
    }

    Timer bloqueado = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            contador += 1;
            System.out.println(contador);
            comparacion(btn, tiempo);
        }
    });

    private void comparacion(JButton btn, double tiempo) {
        try {
            if (contador == tiempo) {
                btn.setEnabled(true);
                bloqueado.stop();
                contador = 1;
            }
        } catch (Exception e) {
        }
    }
//aviso de punto crtitico en los estados

    private void avisar() {
        try {
            if (mascota.getAnimo() == 80) {
                JOptionPane.showMessageDialog(null, "Los niveles de Animo de tu mascota están casi al máximo, por favor juega con él", "AVISO", JOptionPane.WARNING_MESSAGE);
            }

            if (mascota.getHambre() == 85) {
                JOptionPane.showMessageDialog(null, "Tu Mascota Tiene Hambre, Aliméntala", "AVISO", JOptionPane.WARNING_MESSAGE);
            }

            if (mascota.getEnergia() == 10) {
                JOptionPane.showMessageDialog(null, "Tu Mascota Está Cansada", "AVISO", JOptionPane.WARNING_MESSAGE);
            }

            if (mascota.getNecesidades() == 75) {
                JOptionPane.showMessageDialog(null, "Tu Mascota Tiene Muchas Ganas De Ir Al Baño", "AVISO", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
        }
    }

    public void salud() {
        try {
            mascota.setCondicion(Condicion.Enfermo);
            loby.lblEtapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pollo/Enfermo/Pollo" + mascota.getEtapa() + "Enfermo.jpg")));
        } catch (Exception e) {
        }
    }

    private void revisar() {
        try {
            if (validarNecesidades() || validarAburrimiento() || validarHambre() || validarEnergia()) {
                salud();
            }
        } catch (Exception e) {
        }
    }

    private boolean validarNecesidades() {
        return mascota.getNecesidades() == 100;
    }

    private boolean validarAburrimiento() {
        return mascota.getAnimo() == 100;
    }

    private boolean validarHambre() {
        return mascota.getHambre() == 100;
    }

    private boolean validarEnergia() {
        return mascota.getEnergia() == 0;
    }

}
