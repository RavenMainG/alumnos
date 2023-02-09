package paquetePrueba;
import corte2poo.Persona;

public class testPersona {
    public static void main(String[] args) {
        Persona personaPrueba = new Persona("Pablo", 23);

        personaPrueba.mostrarDatos();

        System.out.println("nombre: " + personaPrueba.getNombre());
        System.out.println("edad: " + personaPrueba.getEdad());

        personaPrueba.setEdad(21);
        personaPrueba.setNombre("julian");

        System.out.println("nombre: " + personaPrueba.getNombre());
        System.out.println("edad: " + personaPrueba.getEdad());
    }
}
