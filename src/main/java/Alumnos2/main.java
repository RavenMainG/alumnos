package Alumnos2;

public class main {
    public static void main(String[] args) {

        Alumno prueba = new Alumno();

        Alumno[] alumnos;
        alumnos = new Alumno[2];

        for(int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno();
            alumnos[i].registrarAlumnos();
        }


        prueba.buscarAlmuno(alumnos);


    }
}
