package pooescuela;

public class EstudianteActivo extends Estudiante{
    String estatus;

    public EstudianteActivo() {

    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    

    public void imprimirAlumnoActivo() {
        System.out.println(
            "Nombre: " + getNombre() + 
            "Edad: " + getEdad() + 
            "Codigo: " + getCodigo() +
            "Estatus estudiante: " + getEstatus()
        );
    }

    public void leerEstudianteActivo() {
        super.leerEstudiante();;
        System.out.println("Ingresa tu estatus: ");
        estatus = sc.nextLine();
    }
}
