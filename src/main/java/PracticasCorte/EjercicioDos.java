package PracticasCorte;

import java.util.Scanner;

public class EjercicioDos {
    int COSTE_KILOMETRO = 200;
    int kilometros;

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);        System.out.println("Ingresa la cantidad de kilometros que tiene tu viaje: ");
        kilometros = sc.nextInt();

        sc.close();
    }

    public void precioViaje() {
        System.out.println("El coste total del viaje es: " + (kilometros * COSTE_KILOMETRO));
    }
}
