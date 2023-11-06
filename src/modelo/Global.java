
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author practicantefaciso1
 */
public class Global extends SecuenciaADN{

    public Global(String primeraSecuencia, String segundaSecuencia, String identidad, String porcentajeSimilitud, String primerNombre, String segundoNombre) {
        super(primeraSecuencia, segundaSecuencia, identidad, porcentajeSimilitud, primerNombre, segundoNombre);
    }

    public Global() {
        super();
    }

    @Override
    public void calcularIdentidad() {
        int cont = 0;
        int x = Math.min(getPrimeraSecuencia().length(), getSegundaSecuencia().length());
        for (int i = 0; i < x; i++) {
            if (getPrimeraSecuencia().charAt(i) == getSegundaSecuencia().charAt(i)) {
                cont++;
            }
        }
        setIdentidad(cont+"");
    }

    @Override
    public void calcularporcentajeSimilitud() {
        if (getPrimeraSecuencia().length() == getSegundaSecuencia().length()) {
            float x = Math.max(getPrimeraSecuencia().length(), getSegundaSecuencia().length());
            setPorcentajeSimilitud(String.format("%.2f", Integer.parseInt(getIdentidad()) * 100 / x) + "%");
        } else {
            setPorcentajeSimilitud("No aplica");
        }
    }

    @Override
    public String calcularPrimeraLongitud() {
        return getPrimeraSecuencia().length() + "";
    }

    @Override
    public String calcularSegundaLongitud() {
        return getSegundaSecuencia().length() + "";
    }

    @Override
    public String graficarSecuencias() {
        String suma = "";
        int x = Math.min(getPrimeraSecuencia().length(), getSegundaSecuencia().length());
        for (int j = 0; j < x; j++) {
            suma += "\t" + getPrimeraSecuencia().charAt(j);
        }
        suma += "\n";
        for (int j = 0; j < x; j++) {
            if (getPrimeraSecuencia().charAt(j) == getSegundaSecuencia().charAt(j)) {
                suma += "\t1";
            } else if (getPrimeraSecuencia().charAt(j) != getSegundaSecuencia().charAt(j)) {
                suma += "\t0";
            }

        }
        suma += "\n";
        for (int j = 0; j < x; j++) {
            suma += "\t" + getSegundaSecuencia().charAt(j);
        }
        return suma;
    }
      
    
}
