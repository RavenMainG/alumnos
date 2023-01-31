package daniel;

/**
 * Alumno
 */
public class Alumno {

    String nombre, apellidos, numeroTelfono, matricula;

    public Alumno(String nombre, String apellidos, String numeroTelfono, String matricula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroTelfono = numeroTelfono;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroTelfono() {
        return numeroTelfono;
    }

    public void setNumeroTelfono(String numeroTelfono) {
        this.numeroTelfono = numeroTelfono;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void registrarAlumnos(String nombre, String apellidos, String numeroTelfono, String matricula) {


    }



    
}