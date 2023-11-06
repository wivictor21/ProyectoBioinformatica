/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author victorhuertas
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public frmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEscritorio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        opcRegistroDatos = new javax.swing.JMenu();
        opcRegistroSecuencia = new javax.swing.JMenuItem();
        opcRegistroFASTA = new javax.swing.JMenuItem();
        opcAlineamieto = new javax.swing.JMenu();
        opcAlineamientoGlobal = new javax.swing.JMenuItem();
        opcAlineamientoLocal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblEscritorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ADNFondo.gif"))); // NOI18N
        lblEscritorio.setText("Imagen");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Victor Julio Huertas Gómez - 20182578066");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BioInformatica");

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorderPainted(false);

        opcRegistroDatos.setBackground(new java.awt.Color(51, 51, 51));
        opcRegistroDatos.setBorder(null);
        opcRegistroDatos.setForeground(new java.awt.Color(255, 255, 255));
        opcRegistroDatos.setText("Registro");
        opcRegistroDatos.setActionCommand("Ingreso de datos");
        opcRegistroDatos.setBorderPainted(false);
        opcRegistroDatos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        opcRegistroSecuencia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        opcRegistroSecuencia.setBackground(new java.awt.Color(51, 51, 51));
        opcRegistroSecuencia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        opcRegistroSecuencia.setForeground(new java.awt.Color(255, 255, 255));
        opcRegistroSecuencia.setText("Manual");
        opcRegistroSecuencia.setActionCommand("Registro de datos de Secuenciación");
        opcRegistroSecuencia.setBorder(null);
        opcRegistroSecuencia.setBorderPainted(false);
        opcRegistroSecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcRegistroSecuenciaActionPerformed(evt);
            }
        });
        opcRegistroDatos.add(opcRegistroSecuencia);

        opcRegistroFASTA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        opcRegistroFASTA.setBackground(new java.awt.Color(51, 51, 51));
        opcRegistroFASTA.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        opcRegistroFASTA.setForeground(new java.awt.Color(255, 255, 255));
        opcRegistroFASTA.setText("Fasta");
        opcRegistroFASTA.setBorder(null);
        opcRegistroFASTA.setBorderPainted(false);
        opcRegistroFASTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcRegistroFASTAActionPerformed(evt);
            }
        });
        opcRegistroDatos.add(opcRegistroFASTA);

        jMenuBar1.add(opcRegistroDatos);

        opcAlineamieto.setBackground(new java.awt.Color(51, 51, 51));
        opcAlineamieto.setForeground(new java.awt.Color(255, 255, 255));
        opcAlineamieto.setText("Alineamiento");
        opcAlineamieto.setToolTipText("");
        opcAlineamieto.setBorderPainted(false);
        opcAlineamieto.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        opcAlineamientoGlobal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        opcAlineamientoGlobal.setBackground(new java.awt.Color(51, 51, 51));
        opcAlineamientoGlobal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        opcAlineamientoGlobal.setForeground(new java.awt.Color(255, 255, 255));
        opcAlineamientoGlobal.setText("Global");
        opcAlineamientoGlobal.setBorder(null);
        opcAlineamientoGlobal.setBorderPainted(false);
        opcAlineamientoGlobal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcAlineamientoGlobalActionPerformed(evt);
            }
        });
        opcAlineamieto.add(opcAlineamientoGlobal);

        opcAlineamientoLocal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        opcAlineamientoLocal.setBackground(new java.awt.Color(51, 51, 51));
        opcAlineamientoLocal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        opcAlineamientoLocal.setForeground(new java.awt.Color(255, 255, 255));
        opcAlineamientoLocal.setText("Local");
        opcAlineamientoLocal.setBorder(null);
        opcAlineamientoLocal.setBorderPainted(false);
        opcAlineamientoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcAlineamientoLocalActionPerformed(evt);
            }
        });
        opcAlineamieto.add(opcAlineamientoLocal);

        jMenuBar1.add(opcAlineamieto);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(813, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(696, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 812, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcAlineamientoGlobalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcAlineamientoGlobalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcAlineamientoGlobalActionPerformed

    private void opcRegistroSecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcRegistroSecuenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcRegistroSecuenciaActionPerformed

    private void opcAlineamientoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcAlineamientoLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcAlineamientoLocalActionPerformed

    private void opcRegistroFASTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcRegistroFASTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcRegistroFASTAActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblEscritorio;
    private javax.swing.JMenuItem opcAlineamientoGlobal;
    private javax.swing.JMenuItem opcAlineamientoLocal;
    private javax.swing.JMenu opcAlineamieto;
    private javax.swing.JMenu opcRegistroDatos;
    private javax.swing.JMenuItem opcRegistroFASTA;
    private javax.swing.JMenuItem opcRegistroSecuencia;
    // End of variables declaration//GEN-END:variables

    
    
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

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }



    public JMenuItem getOpcAlineamientoGlobal() {
        return opcAlineamientoGlobal;
    }

    public void setOpcAlineamientoGlobal(JMenuItem opcAlineamientoGlobal) {
        this.opcAlineamientoGlobal = opcAlineamientoGlobal;
    }

    public JMenuItem getOpcAlineamientoLocal() {
        return opcAlineamientoLocal;
    }

    public void setOpcAlineamientoLocal(JMenuItem opcAlineamientoLocal) {
        this.opcAlineamientoLocal = opcAlineamientoLocal;
    }

    public JMenu getOpcAlineamieto() {
        return opcAlineamieto;
    }

    public void setOpcAlineamieto(JMenu opcAlineamieto) {
        this.opcAlineamieto = opcAlineamieto;
    }

    public JMenu getOpcRegistroDatos() {
        return opcRegistroDatos;
    }

    public void setOpcRegistroDatos(JMenu opcRegistroDatos) {
        this.opcRegistroDatos = opcRegistroDatos;
    }

    public JMenuItem getOpcRegistroSecuencia() {
        return opcRegistroSecuencia;
    }

    public void setOpcRegistroSecuencia(JMenuItem opcRegistroSecuencia) {
        this.opcRegistroSecuencia = opcRegistroSecuencia;
    }

    public JMenuItem getOpcRegistroFASTA() {
        return opcRegistroFASTA;
    }

    public void setOpcRegistroFASTA(JMenuItem opcRegistroFASTA) {
        this.opcRegistroFASTA = opcRegistroFASTA;
    }

    public JLabel getLblEscritorio() {
        return lblEscritorio;
    }

    public void setLblEscritorio(JLabel lblEscritorio) {
        this.lblEscritorio = lblEscritorio;
    }
    
    
    
}

