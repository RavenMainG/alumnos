package pooescuela;

public class Docente extends Persona{
    String profesion;
    
    public Docente() {

    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void imprimirDatos() {
    
        System.out.println("Codigo: "+ getCodigo());
   
        System.out.println("Nombre: "+ getNombre());
   
        System.out.println("Edad: "+ getEdad());
   
        System.out.println("Profesion: "+ getProfesion());
   
    }

    public void leerDocente() {
        super.leer();;
        System.out.println("Ingresa tu profesion");
        profesion = sc.next();
    }
    
    
}
