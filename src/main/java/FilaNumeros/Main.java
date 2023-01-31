package FilaNumeros;

import java.util.Scanner;

public class Main {
    
    public static void menu() {
        System.out.println(
            "\n1.- Insertar dato\n" +
            "2.- Borrar dato\n" +
            "3.- Imprimir pila\n" +
            "4.- Salir\n" +
            "Ingresa opcion: "
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaNumeros pilaNumeros = new FilaNumeros();
        int datoIngresado, numero, eliminado;

        do{
            menu();
            datoIngresado = sc.nextInt();
            switch(datoIngresado) {
                case 1:
                    System.out.println("\nIngresa un numero: ");
                    numero = sc.nextInt();
                    pilaNumeros.unshift(numero);
                    break;
                case 2:
                    eliminado = pilaNumeros.eliminar();
                    if(eliminado != -1) {
                    System.out.println("Dato eliminado: " + eliminado);
                    }
                    break;
                case 3:
                    System.out.println("\n");
                    pilaNumeros.imprimirLista();
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

        pilaNumeros.inicioFinal();
    }


}
