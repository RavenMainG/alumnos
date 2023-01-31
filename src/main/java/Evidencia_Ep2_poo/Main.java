package Evidencia_Ep2_poo;

import java.util.Scanner;

public class Main {

    public static void saltoLinea() {
        System.out.println(" ");
    }

    public static void menu() {
        saltoLinea();
        System.out.println(
            "1.- Obtener datos del rectangulos\n" +
            "2.- Obtener Area\n" +
            "3.- Obtener perimetro\n" +
            "4.- Establecer datos\n" +
            "5.- Salir\n" +
            "Ingresa opcion (1-5): "
        );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionUsuario;
        Rectangulo rectagulo1 = new Rectangulo();
        rectagulo1.establecer();

        do{
            menu();
            opcionUsuario = sc.nextInt();
            switch(opcionUsuario) {
                case 1:
                    saltoLinea();
                    rectagulo1.obtener();
                    break;
                case 2:
                    saltoLinea();
                    System.out.println("Area: " + rectagulo1.calcularArea());
                    break;
                case 3:
                    saltoLinea();
                    System.out.println("Perimetro: " + rectagulo1.calcularPerimetro());
                    break;
                case 4:
                    saltoLinea();
                    rectagulo1.establecer();
                    break;
                case 5:
                    saltoLinea();
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion ingresada no es valida!!");
                    break;
                
            }
        }while(opcionUsuario != 5);

        sc.close();
    }
}
