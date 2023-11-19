/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadorcircutosdev;

/**
 *
 * @author dani-ideas
 */
public class SeleccionTipoCirciuto extends javax.swing.JFrame {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel2.setText("Seleciona el cicuito");

        buttonRegresarSTC.setText("Regresar");
        buttonRegresarSTC.setActionCommand("RegresarInicio");
        buttonRegresarSTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegresarSTCActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Capacitores");

        jLabel4.setText("Resistencias");

        buttonGenerar.setText("Generar");
        buttonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGenerarActionPerformed(evt);
            }
        });

        buttonGroup1.add(capSerie);
        capSerie.setText("Serie");
        capSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capSerieActionPerformed(evt);
            }
        });

        buttonGroup1.add(capParalelo);
        capParalelo.setText("Paralelo");
        capParalelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capParaleloActionPerformed(evt);
            }
        });

        buttonGroup1.add(resSerie);
        resSerie.setText("Serie");
        resSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resSerieActionPerformed(evt);
            }
        });

        buttonGroup1.add(resParalelo);
        resParalelo.setText("Paralelo");
        resParalelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resParaleloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonRegresarSTC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(capSerie)
                    .addComponent(capParalelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(resSerie)
                    .addComponent(resParalelo))
                .addGap(144, 144, 144))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonGenerar)
                .addGap(305, 305, 305))
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegresarSTC)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(capSerie)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(capParalelo)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 201, Short.MAX_VALUE)
                                .addComponent(buttonGenerar)
                                .addGap(39, 39, 39))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(resSerie)
                        .addGap(18, 18, 18)
                        .addComponent(resParalelo)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegresarSTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegresarSTCActionPerformed
        Presentacion ventanaP= new Presentacion();
        ventanaP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonRegresarSTCActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buttonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGenerarActionPerformed
        CalculoCircutoConImagen ventanaCCCI= new CalculoCircutoConImagen();
        ventanaCCCI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonGenerarActionPerformed

    private void resSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resSerieActionPerformed

    private void resParaleloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resParaleloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resParaleloActionPerformed

    private void capParaleloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capParaleloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capParaleloActionPerformed

    private void capSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capSerieActionPerformed

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
            java.util.logging.Logger.getLogger(SeleccionTipoCirciuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionTipoCirciuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionTipoCirciuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionTipoCirciuto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionTipoCirciuto().setVisible(true);
            }
        });
    }

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
    private javax.swing.JRadioButton resParalelo;
    private javax.swing.JRadioButton resSerie;
    // End of variables declaration//GEN-END:variables
}
