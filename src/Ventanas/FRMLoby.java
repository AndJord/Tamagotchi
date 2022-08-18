/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Logica.Circunstancia;
import Logica.Controlador;
import Logica.Mascota;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author andre
 */
public class FRMLoby extends javax.swing.JFrame {

    FrmAlimentos alimentos = new FrmAlimentos();
    FrmEstado estados = new FrmEstado();
    FrmMedicina medicinas = new FrmMedicina();
    FrmActividades actividades = new FrmActividades();
    FrmDespertaryDormir siesta = new FrmDespertaryDormir();
    Mascota mascota = Mascota.inicializar();
    private Controlador controlador;

    /**
     * Creates new form Juego
     */
    public FRMLoby() {
        initComponents();
        BtnBano.setIcon(setIcono("/ImgLoby/Icono baño.jpg", BtnBano));
        BtnBano.setPressedIcon(setIconoPresionado("/ImgLoby/Icono baño.jpg", BtnBano, 5, 5));
        BtnComida.setIcon(setIcono("/ImgLoby/icono Comidas.png", BtnComida));
        BtnComida.setPressedIcon(setIconoPresionado("/ImgLoby/icono Comidas.png", BtnComida, 5, 5));
        BtnDormir.setIcon(setIcono("/ImgLoby/BotonDormirse.jpg", BtnDormir));
        BtnDormir.setPressedIcon(setIconoPresionado("/ImgLoby/BotonDormirse.jpg", BtnDormir, 5, 5));
        BtnEstados.setIcon(setIcono("/ImgLoby/IconoEstado.png", BtnEstados));
        BtnEstados.setPressedIcon(setIconoPresionado("/ImgLoby/IconoEstado.png", BtnEstados, 5, 5));
        BtnActividades.setIcon(setIcono("/ImgLoby/icono deportes.png", BtnActividades));
        BtnActividades.setPressedIcon(setIconoPresionado("/ImgLoby/icono deportes.png", BtnActividades, 5, 5));
        BtnMedicina.setIcon(setIcono("/ImgLoby/IconoHospital.jpg", BtnMedicina));
        BtnMedicina.setPressedIcon(setIconoPresionado("/ImgLoby/IconoHospital.jpg", BtnMedicina, 5, 5));
        Nombrar();
        controlador = Controlador.instanciar(this, Mascota.inicializar(), estados);
        lblEdad.setText(Integer.toString(Mascota.inicializar().getEdad()));
        lblBotones.add(estados);
        estados.setVisible(true);
        alimentos.setVisible(false);
        deshabilitar();
        actividadBtns();
    }

    public void setlblEdad(String lblEdad) {
        this.lblEdad.setText(lblEdad);
    }

    private void Nombrar() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la mascota", "Bienvenido", 3);
        this.lblNombre.setText(nombre);
    }

    private void actividadBtns() {
        try {
            this.BtnComida.addActionListener((ActionListener) this);
            this.BtnBano.addActionListener((ActionListener) this);
            this.BtnActividades.addActionListener((ActionListener) this);
            this.BtnDormir.addActionListener((ActionListener) this);
            this.BtnEstados.addActionListener((ActionListener) this);
            this.BtnMedicina.addActionListener((ActionListener) this);
        } catch (Exception e) {
        }
    }

    private void deshabilitar() {
        try {
            if (alimentos.isVisible()) {
                botones(false, true, true, true, true);
            } else if (estados.isVisible()) {
                botones(true, false, true, true, true);
            } else if (medicinas.isVisible()) {
                botones(true, true, false, true, true);
            } else if (actividades.isVisible()) {
                botones(true, true, true, false, true);
            } else if (siesta.isVisible()) {
                botones(true, true, true, true, false);
            }
        } catch (Exception e) {
        }
    }

    private void botones(boolean val1, boolean val2, boolean val3, boolean val4, boolean val5) {
        try {
            BtnComida.setEnabled(val1);
            BtnEstados.setEnabled(val2);
            BtnMedicina.setEnabled(val3);
            BtnActividades.setEnabled(val4);
            BtnDormir.setEnabled(val5);
        } catch (Exception e) {}
        }

    private void Mostrar(JPanel objeto) {
        lblBotones.add(objeto);
        lblBotones.validate();
    }

    private void frames(boolean val1, boolean val2, boolean val3, boolean val4, boolean val5) {
        alimentos.setVisible(val1);
        estados.setVisible(val2);
        medicinas.setVisible(val3);
        actividades.setVisible(val4);
        siesta.setVisible(val5);
    }

    private void metodo(boolean val1, boolean val2, boolean val3, boolean val4, boolean val5, JPanel panel) {
        frames(val1, val2, val3, val4, val5);
        Mostrar(panel);
        deshabilitar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/ImgPrincipal/EscenarioLoby.jpg"));
        Image image = icon.getImage();
        dskLoby = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        BtnBano = new javax.swing.JButton();
        BtnEstados = new javax.swing.JButton();
        BtnActividades = new javax.swing.JButton();
        BtnComida = new javax.swing.JButton();
        BtnMedicina = new javax.swing.JButton();
        BtnDormir = new javax.swing.JButton();
        lblEtapa = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblBotones = new javax.swing.JPanel();

        jButton6.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setForeground(new java.awt.Color(255, 204, 102));

        BtnBano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBanoActionPerformed(evt);
            }
        });

        BtnEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEstadosActionPerformed(evt);
            }
        });

        BtnActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActividadesActionPerformed(evt);
            }
        });

        BtnComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComidaActionPerformed(evt);
            }
        });

        BtnMedicina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMedicinaActionPerformed(evt);
            }
        });

        BtnDormir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDormirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnComida, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBano, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDormir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnBano, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnDormir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnMedicina, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnComida, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblEtapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pollo/Saludable/HuevoSaludable.jpg"))); // NOI18N

        javax.swing.GroupLayout lblBotonesLayout = new javax.swing.GroupLayout(lblBotones);
        lblBotones.setLayout(lblBotonesLayout);
        lblBotonesLayout.setHorizontalGroup(
            lblBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lblBotonesLayout.setVerticalGroup(
            lblBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        dskLoby.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskLoby.setLayer(lblEtapa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskLoby.setLayer(lblEdad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskLoby.setLayer(lblNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskLoby.setLayer(lblBotones, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dskLobyLayout = new javax.swing.GroupLayout(dskLoby);
        dskLoby.setLayout(dskLobyLayout);
        dskLobyLayout.setHorizontalGroup(
            dskLobyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dskLobyLayout.createSequentialGroup()
                .addGroup(dskLobyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dskLobyLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(lblEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dskLobyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dskLobyLayout.setVerticalGroup(
            dskLobyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dskLobyLayout.createSequentialGroup()
                .addGap(18, 84, Short.MAX_VALUE)
                .addGroup(dskLobyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dskLobyLayout.createSequentialGroup()
                        .addGroup(dskLobyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dskLobyLayout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addGroup(dskLobyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dskLobyLayout.createSequentialGroup()
                                .addComponent(lblEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)))
                        .addComponent(lblBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dskLoby)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskLoby)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDormirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDormirActionPerformed

    }//GEN-LAST:event_BtnDormirActionPerformed

    private void BtnMedicinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMedicinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMedicinaActionPerformed

    private void BtnComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnComidaActionPerformed

    private void BtnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActividadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnActividadesActionPerformed

    private void BtnEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEstadosActionPerformed

    }//GEN-LAST:event_BtnEstadosActionPerformed

    private void BtnBanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBanoActionPerformed
        if (mascota.getNecesidades() > 0 && Mascota.inicializar().getCircunstancia().equals(Circunstancia.Despierto)) {
            this.mascota.setNecesidades(mascota.getNecesidades());
            Controlador.getControlador().actualizar(mascota);
        } else {
            JOptionPane.showMessageDialog(null, "¡OPS!, tu Mascota no quiere ir al baño", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BtnBanoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMLoby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMLoby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMLoby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMLoby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMLoby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMLoby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMLoby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMLoby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMLoby().setVisible(true);
            }
        });
    }

    public Icon setIcono(String url, JButton boton) {

        ImageIcon icon = new ImageIcon(getClass().getResource(url));

        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    public Icon setIconoPresionado(String url, JButton boton, int ancho, int altura) {

        ImageIcon icon = new ImageIcon(getClass().getResource(url));

        int width = boton.getWidth() - ancho;
        int height = boton.getHeight() - altura;

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

        return icono;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActividades;
    private javax.swing.JButton BtnBano;
    private javax.swing.JButton BtnComida;
    private javax.swing.JButton BtnDormir;
    private javax.swing.JButton BtnEstados;
    private javax.swing.JButton BtnMedicina;
    private javax.swing.JDesktopPane dskLoby;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel lblBotones;
    private javax.swing.JLabel lblEdad;
    public javax.swing.JLabel lblEtapa;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();

        if (evt.equals(BtnComida)) {
            metodo(true, false, false, false, false, alimentos);
        } else if (evt.equals(BtnEstados)) {
            metodo(false, true, false, false, false, estados);
        } else if (evt.equals(BtnMedicina)) {
            metodo(false, false, true, false, false, medicinas);
        } else if (evt.equals(BtnActividades)) {
            metodo(false, false, false, true, false, actividades);
        } else if (evt.equals(BtnDormir)) {
            metodo(false, false, false, false, true, siesta);
        }
    }
}
