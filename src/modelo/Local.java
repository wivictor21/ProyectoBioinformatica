/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;
import vista.frmPrincipal;

/**
 *
 * @author practicantefaciso1
 */
public class Local extends SecuenciaADN {

    private String primeraSecuenciaRecortada, segundaSecuenciaRecortada, primeraPos, segundaPos;
    private frmPrincipal frmInicio;

    public Local(String primeraSecuenciaRecortada, String segundaSecuenciaRecortada, String primeraPos, String segundaPos, frmPrincipal frmInicio, String primeraSecuencia, String segundaSecuencia, String identidad, String porcentajeSimilitud, String primerNombre, String segundoNombre) {
        super(primeraSecuencia, segundaSecuencia, identidad, porcentajeSimilitud, primerNombre, segundoNombre);
        this.primeraSecuenciaRecortada = primeraSecuenciaRecortada;
        this.segundaSecuenciaRecortada = segundaSecuenciaRecortada;
        this.primeraPos = primeraPos;
        this.segundaPos = segundaPos;
        this.frmInicio = frmInicio;
    }

    public Local() {
        this.primeraSecuenciaRecortada = "";
        this.segundaSecuenciaRecortada = "";
        this.primeraPos = "";
        this.segundaPos = "";
        this.frmInicio = new frmPrincipal();
    }

    public String getPrimeraSecuenciaRecortada() {
        return primeraSecuenciaRecortada;
    }

    public void setPrimeraSecuenciaRecortada(String primeraSecuenciaRecortada) {
        this.primeraSecuenciaRecortada = primeraSecuenciaRecortada;
    }

    public String getSegundaSecuenciaRecortada() {
        return segundaSecuenciaRecortada;
    }

    public void setSegundaSecuenciaRecortada(String segundaSecuenciaRecortada) {
        this.segundaSecuenciaRecortada = segundaSecuenciaRecortada;
    }

    public String getPrimeraPos() {
        return primeraPos;
    }

    public void setPrimeraPos(String primeraPos) {
        this.primeraPos = primeraPos;
    }

    public String getSegundaPos() {
        return segundaPos;
    }

    public void setSegundaPos(String segundaPos) {
        this.segundaPos = segundaPos;
    }

    @Override
    public void calcularIdentidad() {
        int cont = 0;
        int x = Math.min(getPrimeraSecuenciaRecortada().length(), getSegundaSecuenciaRecortada().length());
        for (int i = 0; i < x; i++) {
            if (getPrimeraSecuenciaRecortada().charAt(i) == getSegundaSecuenciaRecortada().charAt(i)) {
                cont++;
            }
        }
        setIdentidad(cont + "");
    }

    @Override
    public void calcularporcentajeSimilitud() {
        if (getPrimeraSecuenciaRecortada().length() == getSegundaSecuenciaRecortada().length()) {
            float x = Math.max(getPrimeraSecuenciaRecortada().length(), getSegundaSecuenciaRecortada().length());
            setPorcentajeSimilitud(String.format("%.2f", Integer.parseInt(getIdentidad()) * 100 / x) + "%");
        } else {
            setPorcentajeSimilitud("No aplica");
        }
    }

    @Override
    public String calcularPrimeraLongitud() {
        return getPrimeraSecuenciaRecortada().length() + "";
    }

    @Override
    public String calcularSegundaLongitud() {
        return getSegundaSecuenciaRecortada().length() + "";
    }

    @Override
    public String graficarSecuencias() {
        String suma = "";
        int x = Math.min(getPrimeraSecuenciaRecortada().length(), getSegundaSecuenciaRecortada().length());
        for (int j = 0; j < x; j++) {
            suma += "\t" + getPrimeraSecuenciaRecortada().charAt(j);
        }
        suma += "\n";
        for (int j = 0; j < x; j++) {
            if (getPrimeraSecuenciaRecortada().charAt(j) == getSegundaSecuenciaRecortada().charAt(j)) {
                suma += "\t1";
            } else if (getPrimeraSecuenciaRecortada().charAt(j) != getSegundaSecuenciaRecortada().charAt(j)) {
                suma += "\t0";
            }

        }
        suma += "\n";
        for (int j = 0; j < x; j++) {
            suma += "\t" + getSegundaSecuenciaRecortada().charAt(j);
        }
        return suma;
    }

    public void recortarSecuencias() {
        int a, b, c, d = 0;
        String[] separar = getPrimeraPos().split(",");
        String[] separar2 = getSegundaPos().split(",");
        a = Integer.parseInt(separar[0]);
        b = Integer.parseInt(separar[1]);
        c = Integer.parseInt(separar2[0]);
        d = Integer.parseInt(separar2[1]);
        //A
        if (a == b) {
            JOptionPane.showMessageDialog(frmInicio, "El primer dato no puede ser igual que el segundo dato en la secuencia *A*");
        }
        if (a > b) {
            JOptionPane.showMessageDialog(frmInicio, "En la primer dato no puede ser mayor que el segundo dato en la secuencia *A*");
        }
        if (a < 0) {
            JOptionPane.showMessageDialog(frmInicio, "El primer dato de la secuencia *A* no puede ser negativo");
        }
        if (a > 62) {
            JOptionPane.showMessageDialog(frmInicio, "El primer dato de la secuencia *A* es un dato muy elevado");
        }
        if (b < 0) {
            JOptionPane.showMessageDialog(frmInicio, "El segundo dato de la secuencia *A* no puede ser negativo");
        }
        if (b == 0) {
            JOptionPane.showMessageDialog(frmInicio, "El segundo dato de la secuencia *A* no puede ser cero");
        }
        if (b > 62) {
            JOptionPane.showMessageDialog(frmInicio, "El segundo dato de la secuencia *A* es un dato muy elevado");
        }
        //B
        if (c == d) {
            JOptionPane.showMessageDialog(frmInicio, "El primer dato no puede ser igual que el segundo dato en la secuencia *B*");
        }
        if (c > d) {
            JOptionPane.showMessageDialog(frmInicio, "En la primer dato no puede ser mayor que el segundo dato en la secuencia *B*");
        }
        if (c < 0) {
            JOptionPane.showMessageDialog(frmInicio, "El primer dato de la secuencia *B* no puede ser negativo");
        }
        if (c > 62) {
            JOptionPane.showMessageDialog(frmInicio, "El primer dato de la secuencia *B* es un dato muy elevado");
        }
        if (d < 0) {
            JOptionPane.showMessageDialog(frmInicio, "El segundo dato de la secuencia *B* no puede ser negativo");
        }
        if (d == 0) {
            JOptionPane.showMessageDialog(frmInicio, "El segundo dato de la secuencia *B* no puede ser cero");
        }
        if (d > 62) {
            JOptionPane.showMessageDialog(frmInicio, "El segundo dato de la secuencia *B* es un dato muy elevado");
        }
        if (a != b || a < b || a > 0 || a < 62 || b > 0 || b != 0 || b < 62 || c != d || c < d || c > 0 || c < 62 || d > 0 || d != 0 || d < 62) {
            setPrimeraSecuenciaRecortada(getPrimeraSecuencia().substring(a, b));
            setSegundaSecuenciaRecortada(getSegundaSecuencia().substring(c, d));
        }

    }
}
