package FilaNumeros;

public class FilaNumeros {
    
    Nodo cabeza = null;

    private class Nodo {

        int numero;
        Nodo siguiente = null;

        public Nodo(int numero) {
            this.numero = numero;
        }

    }


    public void unshift(int numero) {
        Nodo nuevoNodo = new Nodo(numero);
        if(cabeza == null) {
            cabeza = nuevoNodo;
            return;
        }

        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;

    }

    public int eliminar() {
        Nodo puntero;

        if(cabeza == null) {
            System.out.println("Pila vacia!!");
            return -1;
        }else if(cabeza.siguiente == null) {
            puntero = cabeza;
            cabeza = null;
            return cabeza.numero;
        }

        puntero = cabeza;
        cabeza = cabeza.siguiente;
        return puntero.numero;
    }

    public void imprimirLista() {
        Nodo puntero = cabeza;   
        if(cabeza == null) {
            System.out.println("La lista esta vacia!!");
            return;
        }

        while(puntero.siguiente != null) {
            System.out.println("Numero: " + puntero.numero);
            puntero = puntero.siguiente;
        }

        System.out.println("Numero: " + puntero.numero);
    

    }

    public void inicioFinal() {
        System.out.println("Final: " + cabeza.numero);

        Nodo puntero = cabeza;

        while(puntero.siguiente != null) {
            puntero = puntero.siguiente;
        }

        System.out.println("Inicio: " + puntero.numero);
    }

}
