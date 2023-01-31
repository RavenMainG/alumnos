package Evidencia_Ep2_poo;

import java.util.Scanner;

public class Rectangulo {
    Scanner sc = new Scanner(System.in);
    float longitud = 1.0f;
    float altura = 1.0f;

    public void establecer() {

        boolean bandera = false;
        do{
            System.out.println("Ingresa la longitud: ");
            longitud = sc.nextFloat();
    
            System.out.println("Ingresa la altura: ");
            altura = sc.nextFloat();

            if((longitud < 1.0 || longitud > 20.0) || (altura < 1.0 || altura > 20.0)) {
                System.out.println("Los datos ingresados deben de ser mayores a 0 y menores a 20");
            }else{

                System.out.println("Se han establecido los datos correctamente!!");
                bandera = true;
            }


        }while(bandera != true);

    }

    public void obtener() {
        System.out.println("Longitud: " + longitud);
        System.out.println("Altura: " + altura);
    }

    public float calcularPerimetro() {
        return (longitud + longitud) + (altura + altura);
    }

    public float calcularArea() {
        return (longitud * altura);
    }
}
