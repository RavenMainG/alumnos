package Niurka.evidenciapoo;

public class persona {
    private double ingresosanuales;
    private String estadocivil;

    public persona (double ingresosanuales, String estadocivil) 
    {

this.ingresosanuales = ingresosanuales;
this.estadocivil = estadocivil;

    }

public String getestadocivil(){
    return estadocivil;
}
public void setestadocivil(String estadocivil){
    this.estadocivil =estadocivil;
}
public double getingresosanuales(){
    return ingresosanuales;
}
public void setingresosanuales(double ingresosanuales){
    this.ingresosanuales = ingresosanuales;
}
public double valorimpuesto(){
    if(estadocivil.equals("casaso")){
        if(ingresosanuales<20000){
            return (ingresosanuales*0.05);
        }
        return (ingresosanuales*0.03);
    }
    if(ingresosanuales<20000){
        return (ingresosanuales*0.08);
    }
    return(ingresosanuales*0.06);
}
}
