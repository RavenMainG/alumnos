package Pila;

import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println(
            "\n1.- Insertar dato al principio\n" +
            "2.- Insertar dato al final\n" +
            "3.- Imprimir lista\n" +
            "4.- Borrar dato al final\n" +
            "5.- Salir\n" +
            "Ingresa opcion: "
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int datoIngresado, numero;

        do{
            menu();
            datoIngresado = sc.nextInt();
            switch(datoIngresado) {
                case 1:
                    System.out.println("\nIngresa un numero: ");
                    numero = sc.nextInt();
                    break;
                case 2:
                    System.out.println("\nIngresa un numero: ");
                    numero = sc.nextInt();
                    break;
                case 3:
                    System.out.println("\n");
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion ingresada no valida!!");
                    break;
            }

        }while(datoIngresado != 5);


    }
}
