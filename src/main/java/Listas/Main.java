package Listas;

import java.util.Scanner;

public class Main {

    
    
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int datoIngresado;
        System.out.println(
            "\n1.- Agregar nuevo libro al principio\n" +
            "2.- Agregar nuevo libro al final\n" +
            "3.- Recorrer libros\n" +
            "4.- Salir\n" +
            "Ingresa una opcion: "
        );
        datoIngresado = sc.nextInt();
        // sc.close();
        return datoIngresado;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String titulo, autor, isbn;

        int datoIngresado;

        Lista lista = new Lista();

        Libro nuevoLibro;
        System.out.println("\n");

        do {

            datoIngresado = menu();
            switch(datoIngresado) {
                case 1:
                    System.out.println("\nIngresa el titulo: ");
                    titulo = sc.next();

                    sc.nextLine();

                    System.out.println("Ingresa el autor");
                    autor = sc.next();

                    sc.nextLine();

                    System.out.println("Ingresa el isbn: ");
                    isbn = sc.next();

                    nuevoLibro = new Libro(titulo, autor, isbn);

                    lista.push(nuevoLibro);

                    break;
                case 2: 
                    System.out.println("\nIngresa el titulo: ");
                    titulo = sc.next();

                    sc.nextLine();

                    System.out.println("Ingresa el autor");
                    autor = sc.next();

                    sc.nextLine();

                    System.out.println("Ingresa el isbn: ");
                    isbn = sc.next();

                    nuevoLibro = new Libro(titulo, autor, isbn);

                    lista.shift(nuevoLibro);

                    break;
                case 3:

                    lista.runLista();
                    break;
                case 4:

                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion ingresada no valida!!");
                    break;
            }

        }while(datoIngresado != 4);

        sc.close();
    }

}
