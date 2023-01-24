package Alumnos2;

import java.util.Scanner;

public class Alumno {
    Scanner sc = new Scanner(System.in);
    String nombre, matricula;
    int edad;

    public void registrarAlumnos() {
        System.out.println("Ingresa el nombre: ");
        nombre = sc.next();

        System.out.println("Ingresa la matricula");
        matricula = sc.next();

        System.out.println("Ingresa la edad: ");
        edad = sc.nextInt();
    }

    public void imprimirAlumno() {
        System.out.println("nombre: " + nombre);
        System.out.println("matricula: " + matricula);
        System.out.println("edad: " + edad);
    }

    public void buscarAlmuno(Alumno[] alumnos) {
        
        String dato;
        System.out.println("Ingresa la matricula: ");
        dato = sc.next();


        for(int i = 0; i < alumnos.length; i++) {
            System.out.println(i);
            if( alumnos[i].matricula.equals(dato) ) {
                System.out.println("Si se encuentra el Alumno!!");
            }
        }

    }

    public void actualizarAlumno(Alumno[] alumnos) {
        int posicion = -1;
        String dato;
        System.out.println("Ingresa la matricula: ");
        dato = sc.next();


        for(int i = 0; i < alumnos.length; i++) {
            System.out.println(i);
            if( alumnos[i].matricula.equals(dato) ) {
                posicion = i;
            }
        }

        if( posicion != -1){
            alumnos[posicion].imprimirAlumno();
            alumnos[posicion].registrarAlumnos();
        }


    }

}
