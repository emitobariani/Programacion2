public class ListaCircular<T> extends ListaDoble<T> {
    public ListaCircular() {
    }

    @Override
    public void addFirst(T value) {
        Nodo<T> nuevoNodo = new Nodo(value);
        Nodo<T> aux = getPrimero();
        aux.setAnterior(nuevoNodo);
        nuevoNodo.setAnterior(getUltimo());
        setPrimero(nuevoNodo);
        getPrimero().setSiguiente(aux);
        size++;
    }

    @Override
    public Nodo<T> get(int position) throws IndexOutOfBoundsException {
        int contador = 0;
        Nodo<T> aux = getPrimero();
        while (aux != null) {
            if (position >= getSize()) {
                throw new IndexOutOfBoundsException("Posición fuera de rango");
            } else {
                if (contador == position) {
                    break;
                } else {
                    aux = aux.getSiguiente();
                    contador++;
                }
            }

        }
        return aux;
    }

    @Override
    public void add(T value) {
        if (getPrimero() == null) {
            Nodo<T> nuevonodo = new Nodo(value);
            setPrimero(nuevonodo);
            setUltimo(nuevonodo);
            size++;

        } else {
            Nodo<T> aux = getUltimo();
            Nodo<T> nuevonodo = new Nodo(value);
            nuevonodo.setAnterior(aux);
            nuevonodo.setSiguiente(getPrimero());
            aux.setSiguiente(nuevonodo);
            setUltimo(nuevonodo);
            size++;

        }

    }
}
