package pooescuela;

import java.util.Scanner;

import Niurka.evidenciapoo.persona;

public class Persona {
    Scanner sc = new Scanner(System.in);
    String nombre;
    int edad;
    int codigo;


    public Persona() {
    }


    // public Persona(String nombre, int edad, int codigo) {
    //     this.nombre = nombre;
    //     this.edad = edad;
    //     this.codigo = codigo;
    // }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void leer() {
        System.out.println("Ingresa tu nombre: ");
        nombre = sc.nextLine();

        System.out.println("Ingresa tu edad: ");
        edad = sc.nextInt();

        System.out.println("Ingresa tu codigo");
        codigo = sc.nextInt();
    }


    
}
