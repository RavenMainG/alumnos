package main;

public class Circulo {
    
    double radio;
    double pi = 3.1416;
    double area;

    public void ingresarCirculo(Double radio) {
        this.radio = radio;
        area = pi * (radio * radio);
    }

    public void areaCirculo() {
        System.out.println("El area es: " + area);
    }

}
