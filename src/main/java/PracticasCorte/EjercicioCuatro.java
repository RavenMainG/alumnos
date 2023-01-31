package PracticasCorte;

import java.util.Scanner;

public class EjercicioCuatro {
    int a, b, c, auxiliar;

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa valor de A: ");
        a = sc.nextInt();

        System.out.println("Ingresa el valor de B: ");
        b = sc.nextInt();

        System.out.println("Ingresa el valor de C: ");
        c = sc.nextInt();

        sc.close();
    }

    public void intercambioValores(){
        System.out.println(
            "\nValor A: " + a +
            "\nValor B: " + b +
            "\nValor C: " + c
        );

        auxiliar = c;

        c = b;
        b = a;
        a = auxiliar;

        System.out.println("\nValores intercambiados: ");

        System.out.println(
            "Valor A: " + a +
            "\nValor B: " + b +
            "\nValor C: " + c
        );
    }
}
