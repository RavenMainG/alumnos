package main;

import java.util.Scanner;

public class Alumno {

    // variables del sistema
    Scanner sc = new Scanner(System.in);

    // declaracion de atributos de la clase alumnos

    String nombre;
    String matricula;
    String genero;
    String numero;
    String correo;
    int edad;

    public void registrarAlumno(String nombre, String matricula, String genero, String numero, String correo, int edad) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.genero = genero;
        this.numero = numero;
        this.correo = correo;
        this.edad = edad;
    }

    public void registrarAlumnoScanner() {

        System.out.println("Ingresa tu nombre: ");
        nombre = sc.next();

        System.out.println("Ingresa tu matricula: ");
        matricula = sc.next();

        System.out.println("Ingresa tu genero: ");
        genero = sc.next();

        System.out.println("Ingresa tu numero: ");
        numero = sc.next();

        System.out.println("Ingresa tu correo: ");
        correo = sc.next();

        System.out.println("Ingresa tu edad: ");
        edad = sc.nextInt();

    }


    public void mostrarAlumno () {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nombre: " + matricula);
        System.out.println("Nombre: " + genero);
        System.out.println("Nombre: " + numero);
        System.out.println("Nombre: " + correo);
        System.out.println("Nombre: " + edad);
    }

    public void mensajeActualizar(String dato) {
        System.out.println("Ingresa el nuevo valor para " + dato + ": ");
    }

    public void actualizarAlumno() {
        int opcion;
        System.out.println(
            "Que dato deseas actualizar?\n1.- Nombre\n2.- Matricula\n3.- Genero\n4.- Numero\n5.- Correo\n6.- Edad\nIngresa una opcion: "
        );
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                mensajeActualizar("nombre");
                nombre = sc.next();
                break;
            
            case 2:
                mensajeActualizar("matricula");
                matricula = sc.next();
                break;
        
            case 3:
                mensajeActualizar("genero");
                genero = sc.next();
                break;
            
            case 4:
                mensajeActualizar("numero");
                numero = sc.next();
                break;
            
            case 5:
                mensajeActualizar("correo");
                correo = sc.next();
                break;

            case 6:
                mensajeActualizar("edad");
                edad = sc.nextInt();
                break;
            default:
                System.out.println(
                    "La opcion ingresada no es correcta!!"
                );
                break;
        }



    }


}
