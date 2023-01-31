package Escuela;

import java.util.Scanner;

public class AlumnoProfesor {
    Scanner sc = new Scanner(System.in);
    
    String idProfesor, matricula;

    public AlumnoProfesor(){

    }

    public AlumnoProfesor(String idProfesor, String matricula) {
        this.idProfesor = idProfesor;
        this.matricula = matricula;
    }

    public String getIdProfesor() {
        return idProfesor;
    }
    
    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void registrarRelacion(AlumnoProfesor[] registro, Profesor[] profesores, Alumno[] alumnos, int contadorRegistros){
        int posicionAlumno, posicionProfesor;
        String datoIngresado;

        Profesor gestorProfesor = new Profesor();
        Alumno gestorAlumno = new Alumno();

        if(profesores[0] == null){
            System.out.println("Necesitas registrar profesores para esta operacion");
            return;
        }else if(alumnos[0] == null) {
            System.out.println("Necesitas alumnos para esta operacion");
            return;
        }else if(contadorRegistros == registro.length){
            System.out.println("Ya has realizado todos los registros que permite el sistema!!");
            return;
        }

        System.out.println("Profesor para asignar");
        posicionProfesor = gestorProfesor.buscarProfesor(profesores);
        if(posicionProfesor == -1) return;

        System.out.println("Alumnos a asignar");
        posicionAlumno = gestorAlumno.buscarAlumno(alumnos);
        if(posicionAlumno == -1) return;

        System.out.println("Deseas asignar el alumno " + alumnos[posicionAlumno].getNombre() + " a el profesor " + profesores[posicionProfesor].getNombre() + " ?(si / no): ");
        datoIngresado = sc.next();

        switch(datoIngresado) {
            case "si":
                registro[contadorRegistros + 1] = new AlumnoProfesor(profesores[posicionProfesor].getIdProfesor(),alumnos[posicionAlumno].getMatricula());
                registro[contadorRegistros + 1].getMatricula();
                break;
            case "no":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("La opcion que ingresaste no es valida!!");
                break;
        }


    }

    public void reportes(Profesor[] profesores, Alumno[] alumnos, int contadorRegistros, AlumnoProfesor[] registros){
        Profesor gestorProfesor = new Profesor();
        int posicionProfesor;
        String idProfesor;

        boolean registroEncontrado = false;

        if(contadorRegistros < 0){
            System.out.println("No se han realizado vinculaciones!!");
            return;
        }
        
        System.out.println("Buscar profesor para ver sus alumnos");
        posicionProfesor = gestorProfesor.buscarProfesor(profesores);
        if(posicionProfesor == -1) return;
        idProfesor = profesores[posicionProfesor].getIdProfesor();

        System.out.println("\nEl profesor " + profesores[posicionProfesor].getNombre() + " tiene asignaods los siguientes alumnos: ");
        for(int i = 0; i < registros.length; i++){
            // registros[i].getIdProfesor().equals(idProfesor)
            if(registros[i] != null){

                if(registros[i].getIdProfesor().equals(idProfesor)) {
                    for(int i2 = 0; i2 < alumnos.length; i2 ++){
                        if(alumnos[i].getMatricula().equals(registros[i].getMatricula())) {
                            System.out.println("\nNombre: " + alumnos[i].getNombre());
                            System.out.println("Matricula: " + alumnos[i].getMatricula());
                        }
                    }
                    registroEncontrado = true;
                }
            }
        }
        if(registroEncontrado == false){
            System.out.println("No se han encotrado alumnos vinculados al profesor!!");
        }
        
    }

}
