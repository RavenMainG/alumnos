package pooescuela;

public class Estudiante extends Persona{
    String grado, grupo;

    



    public Estudiante() {

    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void leerEstudiante() {
        super.leer();;
        System.out.println("Ingresa tu grado: ");
        grado = sc.nextLine();

        System.out.println("Ingresa tu grupo: ");
        grupo = sc.nextLine();
    }
    


    
}
