package Universidad;

public class ListaAlumnos {

    private Nodo cabeza = null;
    private int length = 0;

    private class Nodo{
        Alumno alumno;
        Nodo siguiente = null;

        public Nodo(Alumno alumno) {
            this.alumno = alumno;
        }

    }

    public void push(Alumno alumno) {
        Nodo nuevoNodo = new Nodo(alumno);
        if(cabeza == null) {
            cabeza = nuevoNodo; 
            length++;
            return;
        }else if(length == 1) {
            cabeza.siguiente = nuevoNodo;
            length++;
            return;
        }
        Nodo puntero = cabeza;

        while(puntero.siguiente != null) {

            puntero = puntero.siguiente;
        }

        puntero.siguiente = nuevoNodo;
    }



}
