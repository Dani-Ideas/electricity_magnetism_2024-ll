/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadorcircutosdev;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dani-ideas
 */
public class SeleccionTipoCirciuto extends javax.swing.JFrame {
    private int caseCircuit=0;
    /**
     * Creates new form SeleccionTipoCirciuto
     */
    public SeleccionTipoCirciuto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonRegresarSTC = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonGenerar = new javax.swing.JButton();
        capSerie = new javax.swing.JRadioButton();
        capParalelo = new javax.swing.JRadioButton();
        resSerie = new javax.swing.JRadioButton();
        resParalelo = new javax.swing.JRadioButton();
        jLabelFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 35, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("Seleciona tu circuito");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        buttonRegresarSTC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonRegresarSTC.setText("Regresar");
        buttonRegresarSTC.setActionCommand("RegresarInicio");
        buttonRegresarSTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegresarSTCActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRegresarSTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 50));

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 110, 50));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Capacitores");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Resistencias");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        buttonGenerar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonGenerar.setText("Generar");
        buttonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 110, 50));

        buttonGroup1.add(capSerie);
        capSerie.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        capSerie.setSelected(true);
        capSerie.setText("Serie");
        capSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capSerieActionPerformed(evt);
            }
        });
        getContentPane().add(capSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        buttonGroup1.add(capParalelo);
        capParalelo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        capParalelo.setText("Paralelo");
        capParalelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capParaleloActionPerformed(evt);
            }
        });
        getContentPane().add(capParalelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        buttonGroup1.add(resSerie);
        resSerie.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resSerie.setText("Serie");
        resSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resSerieActionPerformed(evt);
            }
        });
        getContentPane().add(resSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        buttonGroup1.add(resParalelo);
        resParalelo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resParalelo.setText("Paralelo");
        resParalelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resParaleloActionPerformed(evt);
            }
        });
        getContentPane().add(resParalelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons/fondo2.jpg"))); // NOI18N
        jLabelFondo2.setText("jLabel5");
        getContentPane().add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("FinalizeCalledExplicitly")
    private void buttonRegresarSTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegresarSTCActionPerformed
        Presentacion ventanaP= new Presentacion();
        ventanaP.setVisible(true);
        this.setVisible(false);
         try {
            this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(CalculoCircutoConImagen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonRegresarSTCActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buttonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGenerarActionPerformed
        CalculoCircutoConImagen ventanaCCCI= new CalculoCircutoConImagen(caseCircuit);
        ventanaCCCI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonGenerarActionPerformed

    private void resSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resSerieActionPerformed
        caseCircuit =1;
    }//GEN-LAST:event_resSerieActionPerformed

    private void resParaleloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resParaleloActionPerformed
        caseCircuit =2;
    }//GEN-LAST:event_resParaleloActionPerformed

    private void capParaleloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capParaleloActionPerformed
        caseCircuit =3;
    }//GEN-LAST:event_capParaleloActionPerformed

    private void capSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capSerieActionPerformed
        caseCircuit =4;
    }//GEN-LAST:event_capSerieActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGenerar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonRegresarSTC;
    private javax.swing.JRadioButton capParalelo;
    private javax.swing.JRadioButton capSerie;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JRadioButton resParalelo;
    private javax.swing.JRadioButton resSerie;
    // End of variables declaration//GEN-END:variables
}
