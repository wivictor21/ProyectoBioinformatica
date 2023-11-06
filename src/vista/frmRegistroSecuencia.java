/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import Atxy2k.CustomTextField.RestrictedTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author victorhuertas
 */
public class frmRegistroSecuencia extends javax.swing.JInternalFrame {

    /**
     * Creates new form DigitalizacionSecuencia
     */
    public frmRegistroSecuencia() {
        initComponents();
        RestrictedTextField objP = new RestrictedTextField(getTxtPrimerSecuencia(),"ACGT");
        objP.setLimit(60);
        objP.setAcceptSpace(false);
        objP.setOnlyText(true);
        objP.setOnlyCustomCharacters(true);
        RestrictedTextField objS = new RestrictedTextField(getTxtSegundaSecuencia(),"ACGT");
        objS.setLimit(60);
        objS.setAcceptSpace(false);
        objS.setOnlyText(true);
        objS.setOnlyCustomCharacters(true);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrimerSecuencia = new javax.swing.JTextField();
        txtSegundaSecuencia = new javax.swing.JTextField();
        lblPrimerContadorCaracteres = new javax.swing.JLabel();
        lblSegundoContadorCaracteres = new javax.swing.JLabel();
        lblSegundoContadorCaracteres1 = new javax.swing.JLabel();
        lblSegundoContadorCaracteres2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();

        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(65, 14, 115));
        jPanel1.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Secuenciación");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(100, 110, 219));
        jPanel2.setToolTipText("");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Digite la secuencia A:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Digite la secuencia B:");

        txtPrimerSecuencia.setBackground(new java.awt.Color(255, 255, 255));
        txtPrimerSecuencia.setForeground(new java.awt.Color(0, 0, 0));
        txtPrimerSecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerSecuenciaActionPerformed(evt);
            }
        });
        txtPrimerSecuencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrimerSecuenciaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimerSecuenciaKeyTyped(evt);
            }
        });

        txtSegundaSecuencia.setBackground(new java.awt.Color(255, 255, 255));
        txtSegundaSecuencia.setForeground(new java.awt.Color(0, 0, 0));
        txtSegundaSecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundaSecuenciaActionPerformed(evt);
            }
        });
        txtSegundaSecuencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSegundaSecuenciaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundaSecuenciaKeyTyped(evt);
            }
        });

        lblPrimerContadorCaracteres.setText("0");

        lblSegundoContadorCaracteres.setText("0");

        lblSegundoContadorCaracteres1.setText("/ 60");

        lblSegundoContadorCaracteres2.setText("/ 60");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("  \n  Digite la secuencia que desee, recuerde que en cualquiera de los campos tiene que ser menor\n  de 60 caracteres y mayor de 40 caracteres.\n\n        *Solo se puede digitar:\n\tA=Adenina\n\tC=Citosina\n\tG=Guanina\n\tT=Timina");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrimerSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtSegundaSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPrimerContadorCaracteres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSegundoContadorCaracteres1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblSegundoContadorCaracteres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSegundoContadorCaracteres2)))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrimerSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrimerContadorCaracteres)
                    .addComponent(lblSegundoContadorCaracteres1))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSegundaSecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSegundoContadorCaracteres)
                    .addComponent(lblSegundoContadorCaracteres2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btnEnviar.setBackground(new java.awt.Color(102, 102, 102));
        btnEnviar.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(btnEnviar)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnEnviar)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrimerSecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerSecuenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerSecuenciaActionPerformed

    private void txtSegundaSecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundaSecuenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundaSecuenciaActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtPrimerSecuenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimerSecuenciaKeyTyped
        if (Character.isLowerCase(evt.getKeyChar())) {
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        }
    }//GEN-LAST:event_txtPrimerSecuenciaKeyTyped

    private void txtSegundaSecuenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundaSecuenciaKeyTyped
        if (Character.isLowerCase(evt.getKeyChar())) {
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        }
        
    }//GEN-LAST:event_txtSegundaSecuenciaKeyTyped

    private void txtPrimerSecuenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimerSecuenciaKeyReleased
        lblPrimerContadorCaracteres.setText(String.valueOf(getTxtPrimerSecuencia().getText().length()));
        
    }//GEN-LAST:event_txtPrimerSecuenciaKeyReleased

    private void txtSegundaSecuenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundaSecuenciaKeyReleased
        lblSegundoContadorCaracteres.setText(String.valueOf(getTxtSegundaSecuencia().getText().length()));
        
    }//GEN-LAST:event_txtSegundaSecuenciaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblPrimerContadorCaracteres;
    private javax.swing.JLabel lblSegundoContadorCaracteres;
    private javax.swing.JLabel lblSegundoContadorCaracteres1;
    private javax.swing.JLabel lblSegundoContadorCaracteres2;
    private javax.swing.JTextField txtPrimerSecuencia;
    private javax.swing.JTextField txtSegundaSecuencia;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnEnviar() {
        return btnEnviar;
    }

    public void setBtnEnviar(JButton btnEnviar) {
        this.btnEnviar = btnEnviar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JTextField getTxtPrimerSecuencia() {
        return txtPrimerSecuencia;
    }

    public void setTxtPrimerSecuencia(JTextField txtPrimerSecuencia) {
        this.txtPrimerSecuencia = txtPrimerSecuencia;
    }

    public JTextField getTxtSegundaSecuencia() {
        return txtSegundaSecuencia;
    }

    public void setTxtSegundaSecuencia(JTextField txtSegundaSecuencia) {
        this.txtSegundaSecuencia = txtSegundaSecuencia;
    }

    public JLabel getLblPrimerContadorCaracteres() {
        return lblPrimerContadorCaracteres;
    }

    public void setLblPrimerContadorCaracteres(JLabel lblPrimerContadorCaracteres) {
        this.lblPrimerContadorCaracteres = lblPrimerContadorCaracteres;
    }

    public JLabel getLblSegundoContadorCaracteres() {
        return lblSegundoContadorCaracteres;
    }

    public void setLblSegundoContadorCaracteres(JLabel lblSegundoContadorCaracteres) {
        this.lblSegundoContadorCaracteres = lblSegundoContadorCaracteres;
    }

    public JLabel getLblSegundoContadorCaracteres1() {
        return lblSegundoContadorCaracteres1;
    }

    public void setLblSegundoContadorCaracteres1(JLabel lblSegundoContadorCaracteres1) {
        this.lblSegundoContadorCaracteres1 = lblSegundoContadorCaracteres1;
    }

    public JLabel getLblSegundoContadorCaracteres2() {
        return lblSegundoContadorCaracteres2;
    }

    public void setLblSegundoContadorCaracteres2(JLabel lblSegundoContadorCaracteres2) {
        this.lblSegundoContadorCaracteres2 = lblSegundoContadorCaracteres2;
    }  
    
}