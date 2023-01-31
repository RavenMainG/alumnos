package Universidad;

public class Persona {
    private String nombres, apellidos, correo, numTelefono;

    public Persona() {

    }
    public Persona(String nombres, String apellidos, String correo, String numTelefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.numTelefono = numTelefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    

}
