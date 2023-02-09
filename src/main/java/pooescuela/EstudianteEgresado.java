package pooescuela;

public class EstudianteEgresado extends Estudiante{
    String ocupacion;

    public EstudianteEgresado() {

    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void imprimirAlumnoEgresado() {
        System.out.println(
            "Nombre: " + getNombre() + 
            "Edad: " + getEdad() + 
            "Codigo: " + getCodigo() +
            "Estatus estudiante: " + getOcupacion()
        );
    }

    public void leerEstudianteEgresado() {
        super.leerEstudiante();;
        System.out.println("Ingresa tu ocupacion: ");
        ocupacion = sc.nextLine();
    }
}
