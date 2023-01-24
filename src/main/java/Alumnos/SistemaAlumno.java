package Alumnos;

import java.lang.ProcessBuilder.Redirect.Type;
import java.lang.invoke.TypeDescriptor;
import java.util.Scanner;

public class SistemaAlumno {

    Alumno alumnoMain = new Alumno();
    Scanner sc = new Scanner(System.in);

    Alumno[] alumnos;

    public void imprimirMenu(){
        System.out.println(
            "1.- Buscar alumno \n" +
            "2.- Salir \n" +
            "Selecciona una opcion: "
        );
    }

    public void menu() {
        String datoIngresado;

        do{

            imprimirMenu();
            datoIngresado = sc.next();

            switch(datoIngresado) {

                case "1":
                    alumnoMain.buscarAlumno(alumnos);
                    break;
                case "2":
                    datoIngresado = "3";
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida!!");
                    break;
            }

        }while(datoIngresado != "3");
    }

    public void inicalizarArrAlumnos() {
        String datoIngresado;
        System.out.println("Ingresa la cantidad de alumnos que deseas tener en el sistema: ");
        datoIngresado = sc.next();

        System.out.println(datoIngresado);

        alumnos = new Alumno[Integer.parseInt(datoIngresado)];
        llenarArrAlumnos();
    }

    public void llenarArrAlumnos() {
        for( int iterador = 0; iterador < alumnos.length; iterador++){
            System.out.println("Alumnos # " + (iterador + 1));
            alumnos[iterador] = new Alumno();

            System.out.println("Ingresa el nombre: ");
            alumnos[iterador].setNombre(sc.next());

            System.out.println("Ingresa los apellidos: ");
            alumnos[iterador].setApellidos(sc.next());

            System.out.println("Ingresa la matricula: ");
            alumnos[iterador].setMatricula(sc.next());

            System.out.println("Ingresa el numero de telefono: ");
            alumnos[iterador].setNumeroTelefono(sc.next());

            System.out.println("Ingresa la edad: ");
            alumnos[iterador].setEdad(sc.nextInt());

        }
    }


}
