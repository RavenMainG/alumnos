package Alumnos;

import java.util.Scanner;

public class Alumno {
    Scanner sc = new Scanner(System.in);
    String nombre;
    String apellidos;
    String matricula;
    String numeroTelefono;
    int edad;

    // public Alumno(String nombre, String apellidos, String matricula, String numeroTelefono, int edad) {
    //     this.nombre = nombre;
    //     this.apellidos = apellidos;
    //     this.matricula = matricula;
    //     this.numeroTelefono = numeroTelefono;
    //     this.edad = edad;
    // }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimirAlumno() {
        System.out.println("1.- Nombre: " + nombre);
        System.out.println("2.- Apellidos: " + apellidos);
        System.out.println("3.- Matricula: " + matricula);
        System.out.println("4.- Numero de telefono: " + numeroTelefono);
        System.out.println("5.- Edad: " + edad);
    }

    public void mensajeActualizacion() {
        System.out.println("Campo actualizado con exito!!");
    }

    public void actualizarAlumno() {
        byte opcion;
        String dato;

        imprimirAlumno();
        System.out.println("Ingresa un numero para actualizar el dato: ");
        opcion = sc.nextByte();

        switch(opcion) {
            case 1:
                System.out.println("Ingresa el nuevo nombre: ");
                dato = sc.next();
                nombre = dato;
                mensajeActualizacion();
                break;
            case 2:
                System.out.println("Ingresa el nuevo apellido: ");
                dato = sc.next();
                apellidos = dato;
                mensajeActualizacion();
                break;
            case 3:
                System.out.println("Ingresa la nueva matricula: ");
                dato = sc.next();
                matricula = dato;
                mensajeActualizacion();
                break;
            case 4:
                System.out.println("Ingresa el nuevo numero de telefono");
                dato = sc.next();
                numeroTelefono = dato;
                mensajeActualizacion();
                break;
            case 5:
                System.out.println("Ingresa la nueva edad: ");
                dato = sc.next();
                edad = Integer.parseInt(dato);
                mensajeActualizacion();
                break;

            default:
                System.out.println("La opcion seleccionada no es correcta");
                break;
        }
        
        imprimirAlumno();

    }

    public void buscarAlumno(Alumno[] alumnos) {
        String datoIngresado;
        byte posicion = -1;

        System.out.println("Ingresa la matricula para buscar el alumno: ");
        datoIngresado = sc.next();

        for(byte iterador = 0; iterador < alumnos.length - 1; iterador++) {
            if(alumnos[iterador].matricula.equals(datoIngresado)) {
                posicion = iterador;
            }
        }

        if(posicion == -1) {
            System.out.println("La matricula ingresada no corresponde a ningun alumno!!");
            return;
        }
        
        System.out.println("La matricula corresponde a un alumno: ");
        alumnos[posicion].imprimirAlumno();
        System.out.println("Deseas actualizar los datos de este alumno? (si / no): ");
        datoIngresado = sc.next();

        if(datoIngresado.equalsIgnoreCase("no")) {
            return;
        }

        alumnos[posicion].actualizarAlumno();

    }

}
