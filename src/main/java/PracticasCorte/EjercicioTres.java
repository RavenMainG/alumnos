package PracticasCorte;

import java.util.Scanner;

public class EjercicioTres {
    int COSTE_ESCITORIO = 800;
    double IVA = 0.15;
    int cantidadEscritorios;

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de escritorios a comprar: ");
        cantidadEscritorios = sc.nextInt();
        sc.close();
    }

    public void precioTotal() {

        double total = (COSTE_ESCITORIO * cantidadEscritorios);

        double totalIva = total * IVA;

        double costeTotal = total - totalIva;

        System.out.println("El precio total es de: " + costeTotal);
    }
}
