/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Global;
import modelo.Local;
import modelo.SecuenciaADN;
import vista.frmAlineamientoGlobal;
import vista.frmAlineamientoLocal;
import vista.frmPrincipal;
import vista.frmRegistroSecuencia;
import vista.frmRegistroSecuenciaFasta;

/**
 *
 * @author victorhuertas
 */
public class Facade implements ActionListener {

    private frmPrincipal frmInicio;
    private frmRegistroSecuencia frmRegistro;
    private frmRegistroSecuenciaFasta frmFasta;
    private frmAlineamientoGlobal frmGlobal;
    private frmAlineamientoLocal frmLocal;
    private SecuenciaADN objSecuencia;

    public Facade(frmPrincipal frmInicio, frmRegistroSecuencia frmRegistro, frmRegistroSecuenciaFasta frmFasta, frmAlineamientoGlobal frmGlobal, frmAlineamientoLocal frmLocal, SecuenciaADN objSecuencia) {
        this.frmInicio = frmInicio;
        this.frmRegistro = frmRegistro;
        this.frmFasta = frmFasta;
        this.frmGlobal = frmGlobal;
        this.frmLocal = frmLocal;
        this.objSecuencia = objSecuencia;
    }

    public Facade() throws IOException {
        this.frmInicio = new frmPrincipal();
        this.frmRegistro = new frmRegistroSecuencia();
        this.frmFasta = new frmRegistroSecuenciaFasta();
        this.frmGlobal = new frmAlineamientoGlobal();
        this.frmLocal = new frmAlineamientoLocal();
        this.objSecuencia = new Global();
        iniComponentesInicio();
    }

    public void inicio() {
        frmInicio.setTitle("Secuenciacion");
        frmInicio.setVisible(true);
    }

    public void iniComponentesInicio() {
        frmInicio.getOpcRegistroSecuencia().addActionListener(this);
        frmInicio.getOpcRegistroFASTA().addActionListener(this);
        frmInicio.getOpcAlineamientoGlobal().addActionListener(this);
        frmInicio.getOpcAlineamientoLocal().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Registo de Secuencias de ADN
        if (frmInicio.getOpcRegistroSecuencia() == e.getSource()) {
            if (frmRegistro != null) {
                frmRegistro.dispose();
            }
            if (frmFasta != null) {
                frmFasta.dispose();
            }
            if (frmGlobal != null) {
                frmGlobal.dispose();
                frmGlobal = null;
            }
            if (frmLocal != null) {
                frmLocal.dispose();
                frmLocal = null;
            }
            frmRegistro = new frmRegistroSecuencia();
            frmInicio.getLblEscritorio().add(frmRegistro);
            frmRegistro.setVisible(true);
            frmRegistro.getBtnEnviar().addActionListener(this);
        }
        //Enviar Datos al Registro
        if (frmRegistro.getBtnEnviar() == e.getSource()) {
            if (frmRegistro.getTxtPrimerSecuencia().getText().length() < 1 && frmRegistro.getTxtSegundaSecuencia().getText().length() < 1) {
                JOptionPane.showMessageDialog(frmInicio, "No se puede Registrar, no hay elementos en ninguna de las secuencias");
            } else if (frmRegistro.getTxtPrimerSecuencia().getText().length() < 1) {
                JOptionPane.showMessageDialog(frmInicio, "No se puede Registrar, no hay datos en la Secuencia A");
            } else if (frmRegistro.getTxtSegundaSecuencia().getText().length() < 1) {
                JOptionPane.showMessageDialog(frmInicio, "No se puede Registrar, no hay datos en la Secuencia B");
            } else if (frmRegistro.getTxtPrimerSecuencia().getText().length() > 60 || frmRegistro.getTxtSegundaSecuencia().getText().length() > 60) {
                JOptionPane.showMessageDialog(frmInicio, "No se puede Registrar, Ambas secuencias son mayores de 60");
            } else {
                objSecuencia.setPrimerNombre("*");
                objSecuencia.setSegundoNombre("*");
                objSecuencia.setPrimeraSecuencia(frmRegistro.getTxtPrimerSecuencia().getText());
                objSecuencia.setSegundaSecuencia(frmRegistro.getTxtSegundaSecuencia().getText());
                JOptionPane.showMessageDialog(frmInicio, "Secuencia Registrada");
                if (frmRegistro != null) {
                    frmRegistro.dispose();
                }
            }
        }
        //Registo de Secuencias FASTA
        if (frmInicio.getOpcRegistroFASTA() == e.getSource()) {
            if (frmRegistro != null) {
                frmRegistro.dispose();
            }
            if (frmFasta != null) {
                frmFasta.dispose();
            }
            if (frmGlobal != null) {
                frmGlobal.dispose();
                frmGlobal = null;
            }
            if (frmLocal != null) {
                frmLocal.dispose();
                frmLocal = null;
            }
            frmFasta = new frmRegistroSecuenciaFasta();
            frmInicio.getLblEscritorio().add(frmFasta);
            frmFasta.setVisible(true);
            frmFasta.getBtnEnviar().addActionListener(this);
        }
        //Enviar Datos Fasta
        if (frmFasta.getBtnEnviar() == e.getSource()) {
            if (frmFasta.getPrimerFasta() == "x" && frmFasta.getSegundoFasta() == "x") {
                JOptionPane.showMessageDialog(frmInicio, "No se puede Registrar, no hay elementos en ninguna de las secuencias");
            } else if (frmFasta.getSegundoFasta() == "x") {
                JOptionPane.showMessageDialog(frmInicio, "No se puede Registrar, no hay elementos en la primer secuencias");
            } else if (frmFasta.getPrimerFasta() == "x") {
                JOptionPane.showMessageDialog(frmInicio, "No se puede Registrar, no hay elementos en la segunda secuencias");
            } else{
                   
                
                String []primerSecuencias=frmFasta.getPrimerFasta().split("\n");
                String []segundoSecuencias=frmFasta.getSegundoFasta().split("\n");
                
                String []primerNombre=frmFasta.getPrimerFasta().split("\\|");
                String []segundoNombre=frmFasta.getSegundoFasta().split("\\|");
                
                objSecuencia.setPrimeraSecuencia(primerSecuencias[1].substring(0,60));
                objSecuencia.setSegundaSecuencia(segundoSecuencias[1].substring(0,60));
                objSecuencia.setPrimerNombre(primerNombre[4].split(",")[0]);
                objSecuencia.setSegundoNombre(segundoNombre[4].split(",")[0]);
                JOptionPane.showMessageDialog(frmInicio, "Secuencia Registrada");
                if (frmFasta != null) {
                    frmFasta.dispose();
                }
            }

        }
        //Ver Resultados de Secuenciacion Global
        if (frmInicio.getOpcAlineamientoGlobal() == e.getSource()) {
            if (objSecuencia.getPrimeraSecuencia() != "*" && objSecuencia.getSegundaSecuencia() != "*") {
                if (frmRegistro != null) {
                    frmRegistro.dispose();
                }
                if (frmFasta != null) {
                    frmFasta.dispose();
                }
                if (frmGlobal != null) {
                    frmGlobal.dispose();
                    frmGlobal = null;
                }
                if (frmLocal != null) {
                    frmLocal.dispose();
                    frmLocal = null;
                }
                frmGlobal = new frmAlineamientoGlobal();
                if (objSecuencia.getPrimerNombre() != "*") {
                    frmGlobal.getLblPrimerNombre().setVisible(true);
                    frmGlobal.getLblSegundoNombre().setVisible(true);
                    frmGlobal.getTxtPrimerNombre().setVisible(true);
                    frmGlobal.getTxtSegundoNombre().setVisible(true);
                    frmGlobal.getTxtPrimerNombre().setText(objSecuencia.getPrimerNombre());
                    frmGlobal.getTxtSegundoNombre().setText(objSecuencia.getSegundoNombre());
                }else{
                    frmGlobal.getLblPrimerNombre().setVisible(false);
                    frmGlobal.getLblSegundoNombre().setVisible(false);
                    frmGlobal.getTxtPrimerNombre().setVisible(false);
                    frmGlobal.getTxtSegundoNombre().setVisible(false);
                }
                objSecuencia.calcularIdentidad();
                objSecuencia.calcularporcentajeSimilitud();
                frmGlobal.getTxtPrimerSecuencia().setText(objSecuencia.getPrimeraSecuencia());
                frmGlobal.getTxtSegundaSecuencia().setText(objSecuencia.getSegundaSecuencia());
                frmGlobal.getTxtIdentidad().setText(objSecuencia.getIdentidad() + "");
                frmGlobal.getTxtSimilitud().setText(objSecuencia.getPorcentajeSimilitud());
                frmGlobal.getTxtPrimeraSecLongitud().setText(objSecuencia.calcularPrimeraLongitud());
                frmGlobal.getTxtSegundaSecLongitud().setText(objSecuencia.calcularSegundaLongitud());
                frmGlobal.getTxtAlineamiento().setText(objSecuencia.graficarSecuencias());
                frmInicio.getLblEscritorio().add(frmGlobal);
                frmGlobal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(frmInicio, "Necesita Registrar primero las secuencias");
            }
        }
        //Ver Resultados de Secuenciacion Local
        if (frmInicio.getOpcAlineamientoLocal() == e.getSource()) {

            if (objSecuencia.getPrimeraSecuencia() != "*" && objSecuencia.getSegundaSecuencia() != "*") {
                if (frmRegistro != null) {
                    frmRegistro.dispose();
                }
                if (frmFasta != null) {
                    frmFasta.dispose();
                }
                if (frmGlobal != null) {
                    frmGlobal.dispose();
                    frmGlobal = null;
                }
                if (frmLocal != null) {
                    frmLocal.dispose();
                    frmLocal = null;
                }
                frmLocal = new frmAlineamientoLocal();
                if (objSecuencia.getPrimerNombre() != "*") {
                    frmLocal.getLblPrimerNombre().setVisible(true);
                    frmLocal.getLblSegundoNombre().setVisible(true);
                    frmLocal.getTxtPrimerNombre().setVisible(true);
                    frmLocal.getTxtSegundoNombre().setVisible(true);
                    frmLocal.getTxtPrimerNombre().setText(objSecuencia.getPrimerNombre());
                    frmLocal.getTxtSegundoNombre().setText(objSecuencia.getSegundoNombre());
                }else{
                    frmLocal.getLblPrimerNombre().setVisible(false);
                    frmLocal.getLblSegundoNombre().setVisible(false);
                    frmLocal.getTxtPrimerNombre().setVisible(false);
                    frmLocal.getTxtSegundoNombre().setVisible(false);
                }
                Local objLocal = new Local();
                objLocal.setPrimeraPos(JOptionPane.showInputDialog("Digite la posicion que desea en la secuencia *A* (ejemp: [1,9]): "));
                objLocal.setSegundaPos(JOptionPane.showInputDialog("Digite la posicion que desea en la secuencia *B* (ejemp: [13,21]): "));
                try {
                    objLocal.setPrimeraSecuencia(objSecuencia.getPrimeraSecuencia());
                    objLocal.setSegundaSecuencia(objSecuencia.getSegundaSecuencia());
                    objLocal.recortarSecuencias();
                    objLocal.calcularIdentidad();
                    objLocal.calcularporcentajeSimilitud();
                    frmLocal.getTxtPrimerSecuencia().setText(objLocal.getPrimeraSecuenciaRecortada());
                    frmLocal.getTxtSegundaSecuencia().setText(objLocal.getSegundaSecuenciaRecortada());
                    frmLocal.getTxtIdentidad().setText(objLocal.getIdentidad() + "");
                    frmLocal.getTxtSimilitud().setText(objLocal.getPorcentajeSimilitud());
                    frmLocal.getTxtPrimeraSecLongitud().setText(objLocal.calcularPrimeraLongitud());
                    frmLocal.getTxtSegundaSecLongitud().setText(objLocal.calcularSegundaLongitud());
                    frmLocal.getTxtAlineamiento().setText(objLocal.graficarSecuencias());
                    frmInicio.getLblEscritorio().add(frmLocal);
                    frmLocal.setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frmInicio, "Error no se pudo enviar, recuerde en digitar [n,n] donde n es un numero entero positivo");
                }

            } else {
                JOptionPane.showMessageDialog(frmInicio, "Necesita Registrar primero las secuencias");
            }
        }
    }

}
