package Universidad;

public class Main {
    public static void main(String[] args) {

        ListaAlumnos listaAlumnos = new ListaAlumnos();

        Alumno prueba1 = new Alumno("Pablo", "de leon", "Correo@correo", "9624659211", "223017");
        Alumno prueba2 = new Alumno("Julian", "de leon", "Correo@correo", "9624659211", "223018");

        listaAlumnos.push(prueba1);
        listaAlumnos.push(prueba2);

    }
}
