package main;

import java.util.Scanner;

public class Gestor {
    Scanner sc = new Scanner(System.in);
    public void menu() {
        int opcion = 4; 
        do{
            System.out.println(
                "1.- Agregar alumno \n2.- Buscar Alumno\n3.- Actualizar alumno\n4.- Salir" 
            );
            opcion = sc.nextInt();
            
            switch(opcion) {
                case 1:
                    agregarAlumno();
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida!!");
                    opcion = 10;
                    break;
            }


        }while (opcion != 4);

    }

    public void agregarAlumno() {

    }

    public void buscarAlumno() {

    }

    public void actualizarAlumno() {

    }

}
