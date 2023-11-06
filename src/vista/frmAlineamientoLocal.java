/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author victorhuertas
 */
public class frmAlineamientoLocal extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmAlineamientoGlobal
     */
    public frmAlineamientoLocal() {
        initComponents();
    }

    /**
     * This method is called from within the c onstructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtSegundaSecuencia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtIdentidad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPrimerSecuencia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSimilitud = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtPrimeraSecLongitud = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtSegundaSecLongitud = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlineamiento = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        lblPrimerNombre = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        txtSegundoNombre = new javax.swing.JTextField();
        lblSegundoNombre = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(112, 0, 77));
        jPanel1.setPreferredSize(new java.awt.Dimension(902, 650));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alineamiento Local");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(100, 110, 219));
        jPanel7.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Secuencia 2:");

        txtSegundaSecuencia.setEditable(false);
        txtSegundaSecuencia.setBackground(new java.awt.Color(255, 255, 255));
        txtSegundaSecuencia.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtSegundaSecuencia.setForeground(new java.awt.Color(0, 0, 0));
        txtSegundaSecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundaSecuenciaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Puntaje Indentidad:");

        txtIdentidad.setEditable(false);
        txtIdentidad.setBackground(new java.awt.Color(255, 255, 255));
        txtIdentidad.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtIdentidad.setForeground(new java.awt.Color(0, 0, 0));
        txtIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentidadActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Secuencia 1:");

        txtPrimerSecuencia.setEditable(false);
        txtPrimerSecuencia.setBackground(new java.awt.Color(255, 255, 255));
        txtPrimerSecuencia.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtPrimerSecuencia.setForeground(new java.awt.Color(0, 0, 0));
        txtPrimerSecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerSecuenciaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Porcentaje de Similitud: ");

        txtSimilitud.setEditable(false);
        txtSimilitud.setBackground(new java.awt.Color(255, 255, 255));
        txtSimilitud.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtSimilitud.setForeground(new java.awt.Color(0, 0, 0));
        txtSimilitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSimilitudActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Longitud de Secuencia 1: ");

        txtPrimeraSecLongitud.setEditable(false);
        txtPrimeraSecLongitud.setBackground(new java.awt.Color(255, 255, 255));
        txtPrimeraSecLongitud.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtPrimeraSecLongitud.setForeground(new java.awt.Color(0, 0, 0));
        txtPrimeraSecLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimeraSecLongitudActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Longitud de Secuencia 2: ");

        txtSegundaSecLongitud.setEditable(false);
        txtSegundaSecLongitud.setBackground(new java.awt.Color(255, 255, 255));
        txtSegundaSecLongitud.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtSegundaSecLongitud.setForeground(new java.awt.Color(0, 0, 0));
        txtSegundaSecLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundaSecLongitudActionPerformed(evt);
            }
        });

        txtAlineamiento.setBackground(new java.awt.Color(66, 66, 66));
        txtAlineamiento.setColumns(20);
        txtAlineamiento.setFont(new java.awt.Font("Lucida Grande", 1, 28)); // NOI18N
        txtAlineamiento.setForeground(new java.awt.Color(204, 204, 204));
        txtAlineamiento.setRows(5);
        txtAlineamiento.setTabSize(1);
        jScrollPane1.setViewportView(txtAlineamiento);

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Alineamiento");

        lblPrimerNombre.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lblPrimerNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblPrimerNombre.setText("Nombre de la Secuencia 1:");

        txtPrimerNombre.setEditable(false);
        txtPrimerNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtPrimerNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtPrimerNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtPrimerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerNombreActionPerformed(evt);
            }
        });

        txtSegundoNombre.setEditable(false);
        txtSegundoNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtSegundoNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtSegundoNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtSegundoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoNombreActionPerformed(evt);
            }
        });

        lblSegundoNombre.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lblSegundoNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblSegundoNombre.setText("Nombre de la Secuencia 2:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPrimerSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSegundaSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtPrimeraSecLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtSimilitud, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtSegundaSecLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(lblPrimerNombre)
                                            .addGap(133, 133, 133)))
                                    .addGap(378, 378, 378)))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGap(184, 184, 184)
                                    .addComponent(txtPrimerNombre))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(lblSegundoNombre)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPrimerSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtSegundaSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtSimilitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtPrimeraSecLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtSegundaSecLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimerNombre)
                    .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSegundoNombre)
                    .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentidadActionPerformed

    private void txtSegundaSecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundaSecuenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundaSecuenciaActionPerformed

    private void txtPrimerSecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerSecuenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerSecuenciaActionPerformed

    private void txtSimilitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSimilitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSimilitudActionPerformed

    private void txtPrimeraSecLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimeraSecLongitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimeraSecLongitudActionPerformed

    private void txtSegundaSecLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundaSecLongitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundaSecLongitudActionPerformed

    private void txtSegundoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundoNombreActionPerformed

    private void txtPrimerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPrimerNombre;
    private javax.swing.JLabel lblSegundoNombre;
    private javax.swing.JTextArea txtAlineamiento;
    private javax.swing.JTextField txtIdentidad;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtPrimerSecuencia;
    private javax.swing.JTextField txtPrimeraSecLongitud;
    private javax.swing.JTextField txtSegundaSecLongitud;
    private javax.swing.JTextField txtSegundaSecuencia;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtSimilitud;
    // End of variables declaration//GEN-END:variables

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel7() {
        return jPanel7;
    }

    public void setjPanel7(JPanel jPanel7) {
        this.jPanel7 = jPanel7;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getTxtAlineamiento() {
        return txtAlineamiento;
    }

    public void setTxtAlineamiento(JTextArea txtAlineamiento) {
        this.txtAlineamiento = txtAlineamiento;
    }

    public JTextField getTxtIdentidad() {
        return txtIdentidad;
    }

    public void setTxtIdentidad(JTextField txtIdentidad) {
        this.txtIdentidad = txtIdentidad;
    }

    public JTextField getTxtPrimerSecuencia() {
        return txtPrimerSecuencia;
    }

    public void setTxtPrimerSecuencia(JTextField txtPrimerSecuencia) {
        this.txtPrimerSecuencia = txtPrimerSecuencia;
    }

    public JTextField getTxtPrimeraSecLongitud() {
        return txtPrimeraSecLongitud;
    }

    public void setTxtPrimeraSecLongitud(JTextField txtPrimeraSecLongitud) {
        this.txtPrimeraSecLongitud = txtPrimeraSecLongitud;
    }

    public JTextField getTxtSegundaSecLongitud() {
        return txtSegundaSecLongitud;
    }

    public void setTxtSegundaSecLongitud(JTextField txtSegundaSecLongitud) {
        this.txtSegundaSecLongitud = txtSegundaSecLongitud;
    }

    public JTextField getTxtSegundaSecuencia() {
        return txtSegundaSecuencia;
    }

    public void setTxtSegundaSecuencia(JTextField txtSegundaSecuencia) {
        this.txtSegundaSecuencia = txtSegundaSecuencia;
    }

    public JTextField getTxtSimilitud() {
        return txtSimilitud;
    }

    public void setTxtSimilitud(JTextField txtSimilitud) {
        this.txtSimilitud = txtSimilitud;
    }

    public JLabel getLblPrimerNombre() {
        return lblPrimerNombre;
    }

    public void setLblPrimerNombre(JLabel lblPrimerNombre) {
        this.lblPrimerNombre = lblPrimerNombre;
    }

    public JLabel getLblSegundoNombre() {
        return lblSegundoNombre;
    }

    public void setLblSegundoNombre(JLabel lblSegundoNombre) {
        this.lblSegundoNombre = lblSegundoNombre;
    }

    public JTextField getTxtPrimerNombre() {
        return txtPrimerNombre;
    }

    public JTextField getTxtSegundoNombre() {
        return txtSegundoNombre;
    }

    public void setTxtSegundoNombre(JTextField txtSegundoNombre) {
        this.txtSegundoNombre = txtSegundoNombre;
    }

}
