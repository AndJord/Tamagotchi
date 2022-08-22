/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Ventanas;

import Logica.Circunstancia;
import Logica.Controlador;
import Logica.Mascota;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author angel
 */
public class InternoDespertaryDormir extends javax.swing.JInternalFrame {

    private int contador = 1;
    private Mascota mascota = Mascota.inicializar();

    public InternoDespertaryDormir() {
        initComponents();

    }
// tiempo de dormir
    Timer ciclo = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            contador += 1;
            tiempoDormido();
        }
    });

    private void tiempoDormido() {
        if (contador == 10) {
            mascota.setEnergia(mascota.getEnergia() + 25);
            Controlador.getControlador().actualizar(mascota);
            contador = 1;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnDormirse = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();
        BtnDespertarse = new javax.swing.JButton();

        BtnDormirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgDormirYdespertar/BotonDormirse.jpg"))); // NOI18N
        BtnDormirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDormirseActionPerformed(evt);
            }
        });

        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgPrincipal/close_25px.png"))); // NOI18N
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        BtnDespertarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgDormirYdespertar/Despertarse.jpg"))); // NOI18N
        BtnDespertarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDespertarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnDormirse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnDespertarse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnDespertarse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDormirse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void BtnDormirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDormirseActionPerformed
        // TODO add your handling code here:
        Controlador.getControlador().dormir();
        mascota.setCircunstancia(Circunstancia.Dormido);
        ciclo.restart(); 
                mascota.setEnergia(mascota.getEnergia() + 20);
                mascota.setAnimo(mascota.getAnimo()-30);
               System.out.println(" Energia = " +mascota.getEnergia()+" Animo" + mascota.getAnimo());
                JOptionPane.showMessageDialog(null, "ZZzzzZ Estoy Dormido");

    }//GEN-LAST:event_BtnDormirseActionPerformed

    private void BtnDespertarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDespertarseActionPerformed
        // TODO add your handling code here:
        Controlador.getControlador().despertar();
        mascota.setCircunstancia(Circunstancia.Despierto);
        ciclo.stop();
        try {

            if (mascota.getEnergia() == 90 || mascota.getEnergia() == 100) {
                JOptionPane.showMessageDialog(null, " Que Rico es dormir");
                mascota.getCircunstancia();

            } else {
                JOptionPane.showMessageDialog(null, " Suaveee, Que tengo sueño");
                mascota.getCircunstancia();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No puedo Despertar por " + e.getMessage());
        }
    }//GEN-LAST:event_BtnDespertarseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnDespertarse;
    private javax.swing.JButton BtnDormirse;
    // End of variables declaration//GEN-END:variables
}
