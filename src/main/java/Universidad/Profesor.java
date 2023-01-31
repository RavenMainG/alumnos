package Universidad;

public class Profesor extends Persona {
    
    private String idProfesor;

    public Profesor() {

    }

    public Profesor(String nombre, String apellidos, String correo, String numTelefono, String idProfesor) {
        super(nombre, apellidos, correo, numTelefono);
        this.idProfesor = idProfesor;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setInProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

}
