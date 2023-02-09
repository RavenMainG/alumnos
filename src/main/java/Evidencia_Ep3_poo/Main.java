package Evidencia_Ep3_poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ingresosAnuales;
        String estadoCivil;

        boolean isNumber = false;

        boolean isNumberSalario = false;

        int numeroPrueba;

        System.out.println("Ingresa tu estado civil (soltero / casado):");
        estadoCivil = sc.nextLine();

        try {
            Integer.parseInt(estadoCivil);
            System.out.println("Ingresa solo soltero o casado, no se permiten numeros!!: ");
            estadoCivil = sc.next();
            isNumber = true;
        } catch (Exception e) {
            isNumber = false;
        }

        System.out.println("Ingresa el salario: ");
        ingresosAnuales = sc.nextLine();

        try {
            System.out.println("Ingresa solo datos numericos: ");
            Boolean.parseBoolean(ingresosAnuales);
        } catch (Exception e) {
            System.out.println("Ingresa solo datos numericos: ");
            isNumberSalario = true;
        }

        if(!isNumberSalario) {
            System.out.println("Ingresa el salario: ");
            ingresosAnuales = sc.nextLine();
        }

        Persona usuario = new Persona(Double.parseDouble(ingresosAnuales), estadoCivil);

        System.out.println("El iva es de: " + usuario.valorImpuesto());
        sc.close();
    }
}
