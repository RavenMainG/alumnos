package Evidencia_Ep3_poo;

public class Persona {
    private double ingresosAnuales;
    private String estadoCivil;

    public Persona(double ingresosAnuales, String estadoCivil) {
        this.ingresosAnuales = ingresosAnuales;
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }
    
    public double valorImpuesto() {
        if(estadoCivil.equals("casado")){
            if(ingresosAnuales < 20000) {
                return (ingresosAnuales * 0.05);
            }

            return (ingresosAnuales * 0.03);
        }
        if(ingresosAnuales < 20000){
            return (ingresosAnuales * 0.08);
        }
        return (ingresosAnuales * 0.06);
    }    
}
