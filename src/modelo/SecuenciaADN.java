/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author victorhuertas
 */
public abstract class SecuenciaADN {

    private String primeraSecuencia, segundaSecuencia,identidad, porcentajeSimilitud, primerNombre, segundoNombre;

    public SecuenciaADN(String primeraSecuencia, String segundaSecuencia, String identidad, String porcentajeSimilitud, String primerNombre, String segundoNombre) {
        this.primeraSecuencia = primeraSecuencia;
        this.segundaSecuencia = segundaSecuencia;
        this.identidad = identidad;
        this.porcentajeSimilitud = porcentajeSimilitud;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
    }

    public SecuenciaADN() {
        this.primeraSecuencia = "*";
        this.segundaSecuencia = "*";
        this.identidad = "";
        this.porcentajeSimilitud = "";
        this.primerNombre="*";
        this.segundoNombre="*";
    }

    public String getPrimeraSecuencia() {
        return primeraSecuencia;
    }

    public void setPrimeraSecuencia(String primeraSecuencia) {
        this.primeraSecuencia = primeraSecuencia;
    }

    public String getSegundaSecuencia() {
        return segundaSecuencia;
    }

    public void setSegundaSecuencia(String segundaSecuencia) {
        this.segundaSecuencia = segundaSecuencia;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getPorcentajeSimilitud() {
        return porcentajeSimilitud;
    }

    public void setPorcentajeSimilitud(String porcentajeSimilitud) {
        this.porcentajeSimilitud = porcentajeSimilitud;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    
    public abstract void calcularIdentidad();
    public abstract void calcularporcentajeSimilitud();
    public abstract String calcularPrimeraLongitud();
    public abstract String calcularSegundaLongitud();
    public abstract String graficarSecuencias();
    
    @Override
    public String toString() {
        return "\nPrimera secuencia: " + primeraSecuencia
                + "\nSegunda secuencia: " + segundaSecuencia
                + "\nIdentidad: " + identidad
                + "\nPorcentaje similitud: " + porcentajeSimilitud;
    }
    
}
