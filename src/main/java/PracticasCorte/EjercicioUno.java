package PracticasCorte;

import java.util.Scanner;

public class EjercicioUno {


    double calificacion01, calificacion02, calificacion03;

    public void ingresarCalificaciones() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la calificacion 1: ");
        calificacion01 = sc.nextDouble();

        System.out.println("Ingresa la calificacion 2: ");
        calificacion02 = sc.nextDouble();

        System.out.println("Ingresa la calificacion 3: ");
        calificacion03 = sc.nextDouble();
        
        sc.close();
    }


    public void media() {
        System.out.println("La media de las 3 calificaciones es: " + (calificacion01 + calificacion02 + calificacion03));
    }

}

