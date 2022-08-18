/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventanas;

import Logica.Circunstancia;
import Logica.Controlador;
import Logica.Mascota;
import Logica.Rutina;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class FrmAlimentos extends javax.swing.JPanel {

    Rutina Alimentacion = new Rutina();

    /**
     * Creates new form FrmAlimentos
     */
    public FrmAlimentos() {
        initComponents();
//        BtnAgua.setIcon(setIcono("/ImgComida/Agua.png", BtnAgua));
//        //BtnAgua.setPressedIcon(setIconoPresionado("/ImgComida/Agua.png", BtnAgua, 5, 5));
//        BtnConcentrado.setIcon(setIcono("/ImgComida/Concentrado.jpg", BtnConcentrado));
//       // BtnConcentrado.setPressedIcon(setIconoPresionado("/ImgComida/Concentrado.jpg", BtnConcentrado, 5, 5));
//        BtnLagartija.setIcon(setIcono("/ImgComida/Lagartija.png", BtnLagartija));
//       // BtnLagartija.setPressedIcon(setIconoPresionado("/ImgComida/Lagartija.png", BtnLagartija, 5, 5));
//        BtnLombriz.setIcon(setIcono("/ImgComida/Lombriz.jpg", BtnLombriz));
//       // BtnLombriz.setPressedIcon(setIconoPresionado("/ImgComida/Lombriz.jpg", BtnLombriz, 5, 5));
//        BtnMaiz.setIcon(setIcono("/ImgComida/Maiz.jpg", BtnMaiz));
//       // BtnMaiz.setPressedIcon(setIconoPresionado("/ImgComida/Maiz.jpg", BtnMaiz, 5, 5));

    }

    private void Alimentar(JButton btn, int val) {
        if (Mascota.inicializar().getCondicion().equals(Circunstancia.Despierto) && Mascota.inicializar().getHambre() > 0) {
            Mascota.inicializar().comer(Alimentacion.ConstAlm(val));
            Controlador.getControlador().actualizar(Mascota.inicializar());
            Controlador.getControlador().bloqueo(btn, 10);
        } else {
            JOptionPane.showMessageDialog(null, "Tu Mascota no puede Comer ahora", "Lo siento", JOptionPane.INFORMATION_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        BtnLombriz = new javax.swing.JButton();
        BtnLagartija = new javax.swing.JButton();
        BtnConcentrado = new javax.swing.JButton();
        BtnAgua = new javax.swing.JButton();
        BtnMaiz = new javax.swing.JButton();

        BtnLombriz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgComida/Lombriz.jpg"))); // NOI18N
        BtnLombriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLombrizActionPerformed(evt);
            }
        });

        BtnLagartija.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgComida/Lagartija.png"))); // NOI18N
        BtnLagartija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLagartijaActionPerformed(evt);
            }
        });

        BtnConcentrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgComida/Concentrado.jpg"))); // NOI18N
        BtnConcentrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConcentradoActionPerformed(evt);
            }
        });

        BtnAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgComida/Agua.png"))); // NOI18N
        BtnAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAguaActionPerformed(evt);
            }
        });

        BtnMaiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgComida/Maiz.jpg"))); // NOI18N
        BtnMaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMaizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnConcentrado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLagartija, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLombriz, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnMaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnMaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BtnLombriz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(BtnLagartija, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(BtnConcentrado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(BtnAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMaizActionPerformed
        Alimentar(BtnMaiz,3);
    }//GEN-LAST:event_BtnMaizActionPerformed

    private void BtnAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAguaActionPerformed
        Alimentar(BtnAgua,1);
    }//GEN-LAST:event_BtnAguaActionPerformed

    private void BtnConcentradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConcentradoActionPerformed
        Alimentar(BtnConcentrado,2);
    }//GEN-LAST:event_BtnConcentradoActionPerformed

    private void BtnLagartijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLagartijaActionPerformed
        Alimentar(BtnLagartija,5);
    }//GEN-LAST:event_BtnLagartijaActionPerformed

    private void BtnLombrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLombrizActionPerformed
        Alimentar(BtnLombriz,4);
    }//GEN-LAST:event_BtnLombrizActionPerformed
//    public Icon setIcono(String url, JButton boton) {
//
//        ImageIcon icon = new ImageIcon(getClass().getResource(url));
//
//        int ancho = boton.getWidth();
//        int alto = boton.getHeight();
//        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
//        return icono;
//    }

//    public Icon setIconoPresionado(String url, JButton boton, int ancho, int altura) {
//
//        ImageIcon icon = new ImageIcon(getClass().getResource(url));
//
//        int width = boton.getWidth() - ancho;
//        int height = boton.getHeight() - altura;
//
//        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
//
//        return icono;
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgua;
    private javax.swing.JButton BtnConcentrado;
    private javax.swing.JButton BtnLagartija;
    private javax.swing.JButton BtnLombriz;
    private javax.swing.JButton BtnMaiz;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
