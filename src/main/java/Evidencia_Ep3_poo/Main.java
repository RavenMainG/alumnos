package Evidencia_Ep3_poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ingresosAnuales;
        String estadoCivil;

        System.out.println("Ingresa tu estado civil (soltero / casado):");
        estadoCivil = sc.nextLine();

        System.out.println("Ingresa tus ingresos anuales: ");
        ingresosAnuales = sc.nextDouble();

        Persona usuario = new Persona(ingresosAnuales, estadoCivil);

        System.out.println("\nEl total de impuesto a pagar es de: " + usuario.valorImpuesto());

        sc.close();
    }
}
