package Listas;

public class Lista {
    

    private Nodo cabeza = null;
    private int length = 0;

    private class Nodo {
        public Libro libro;
        public Nodo siguiente;

        public Nodo(Libro libro) {
            this.libro = libro;
        }

    }

    public void shift(Libro libro) {
        Nodo nuevoNodo = new Nodo(libro);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
        length ++;
        System.out.println("longitud: " + length);
    }

    public void push(Libro libro) {
        Nodo nuevoNodo = new Nodo(libro);

        if(cabeza == null) {
            cabeza = nuevoNodo;
            return;
        }

        Nodo puntero = cabeza;
        while(puntero.siguiente != null) {

            puntero = puntero.siguiente;
        }
        nuevoNodo.siguiente = null;
        puntero.siguiente = nuevoNodo;
        length++;
        System.out.println("longitud: " + length);
    }

    public void runLista() {
        
        Nodo puntero = cabeza;

        if( cabeza == null){
            return;
    
        }

        if(puntero.siguiente == null){
            System.out.println("ISBN: " + puntero.libro.getIsbn());
            return;
        }

        while(puntero.siguiente != null) {
            System.out.println("ISBN: " + puntero.libro.getIsbn());
            puntero = puntero.siguiente;
        }
        System.out.println("ISBN: " + puntero.libro.getIsbn());
        
    }



}
