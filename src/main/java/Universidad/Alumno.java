package Universidad;

public class Alumno extends Persona {
    private String matricula;

    public Alumno() {

    }

    public Alumno(String nombres, String apellidos, String correo, String numTelefono, String matricula) {
        super(nombres, apellidos, correo, numTelefono);
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
